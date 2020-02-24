package net.makiru.tools;

import net.makiru.commons.Account;
import net.makiru.commons.tools.Ranks;
import net.makiru.spigot.core.MakiruHub;
import net.makiru.spigot.lang.L;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;

public class SetupPlayer {

    public static class JoinEvent {

        private final Scoreboard scoreboard;

        {
            this.scoreboard = Objects.requireNonNull(MakiruHub.getInstance().getServer().getScoreboardManager()).getNewScoreboard();
            Arrays.stream(Ranks.values()).forEach(rank -> this.scoreboard.registerNewTeam(rank.getTabOrder()).setPrefix(rank.getPrefix()));
        }

        public JoinEvent(@NotNull final Player player, @NotNull final Account account) {
            player.setGameMode(GameMode.ADVENTURE);
            player.setHealth(20);
            player.setLevel(0);
            player.setFoodLevel(20);
            player.getInventory().clear();
            player.teleport(Locations.HUB.getLocation());
            player.setDisplayName(account.getRanks().getPrefix() + player.getName());
            player.setCustomName(account.getRanks().getPrefix() + player.getName());
            player.setCustomNameVisible(true);
            player.setPlayerListName(account.getRanks().getPrefix() + player.getName());
            Objects.requireNonNull(this.scoreboard.getTeam(account.getRanks().getTabOrder())).addEntry(player.getName());
            player.setScoreboard(this.scoreboard);
            MakiruHub.getInstance().getServer().getOnlinePlayers().forEach(oPlayer -> oPlayer.setScoreboard(this.scoreboard));
            Arrays.stream(((String[]) L.WELCOME.get(account.getLanguage()))).forEach(s -> player.sendMessage(s.replace("{name}", player.getDisplayName())));
            player.getInventory().setItem(0, Items.NAVIGATOR(account.getLanguage()).toItemStack());
            player.getInventory().setItem(1, Items.ODDS_AND_ENDS(account.getLanguage()).toItemStack());
            player.getInventory().setItem(4, Items.PROFIL(account.getLanguage(), player).toItemStack());
            player.getInventory().setItem(7, Items.SHOP(account.getLanguage()).toItemStack());
            player.getInventory().setItem(8, Items.SETTINGS(account.getLanguage()).toItemStack());
            player.updateInventory();
        }
    }

}
