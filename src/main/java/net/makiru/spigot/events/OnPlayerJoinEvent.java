package net.makiru.spigot.events;

import net.makiru.api.account.AccountManager;
import net.makiru.api.exceptions.AccountNotFoundException;
import net.makiru.api.exceptions.RedisDownException;
import net.makiru.api.exceptions.RedisException;
import net.makiru.api.logger.MKLogger;
import net.makiru.api.mojang.UUIDFetcher;
import net.makiru.commons.Account;
import net.makiru.commons.tools.Languages;
import net.makiru.commons.tools.Ranks;
import net.makiru.spigot.core.MakiruHub;
import net.makiru.spigot.lang.L;
import net.makiru.tools.SetupPlayer;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoinEvent implements Listener {

    private final MKLogger logger = MakiruHub.getFactory().getLogger(this.getClass().getPackage() + "." + this.getClass().getName());

    @EventHandler
    public void onEvent(PlayerJoinEvent e) {
        try {
            Account account = new AccountManager.Provider().get(UUIDFetcher.getUUID(e.getPlayer().getName()));
            new SetupPlayer.JoinEvent(e.getPlayer(), account);
            e.setJoinMessage(e.getPlayer().getDisplayName());
            if (account.getRanks().getPower() >= Ranks.HEROS.getPower())
                MakiruHub.getInstance().getServer().getOnlinePlayers().forEach(player -> {
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 3.0F, 0.533F);
                    player.playSound(player.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 3.0F, 0.533F);
                    player.playSound(player.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_TWINKLE_FAR, 3.0F, 0.533F);
                });
        } catch (AccountNotFoundException ex) {
            this.logger.error("onEvent(onPlayerJoinEvent)", ex);
            e.getPlayer().sendMessage("\n" + MakiruHub.PREFIX + ((String) L.ACCOUNT_NOT_FOUND_EXCEPTION.get(Languages.FRENCH)).replace("{name}", e.getPlayer().getName()));
        } catch (RedisException | RedisDownException ex) {
            this.logger.error("onEvent(onPlayerJoinEvent)", ex);
            e.getPlayer().sendMessage("\n" + MakiruHub.PREFIX + L.REDIS_EXCEPTION.get(Languages.FRENCH));
        }
    }
}
