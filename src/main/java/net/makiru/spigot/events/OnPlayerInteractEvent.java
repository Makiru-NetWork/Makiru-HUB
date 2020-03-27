package net.makiru.spigot.events;

import net.makiru.api.exceptions.AccountNotFoundException;
import net.makiru.api.exceptions.RedisDownException;
import net.makiru.api.exceptions.RedisException;
import net.makiru.api.logger.MKLogger;
import net.makiru.api.managers.account.AccountManager;
import net.makiru.api.mojang.MojangFetcher;
import net.makiru.commons.tools.Languages;
import net.makiru.spigot.api.tools.L;
import net.makiru.spigot.core.MakiruSpigotHub;
import net.makiru.spigot.guis.NavigatorGUI;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

public class OnPlayerInteractEvent implements Listener {

    private final MKLogger logger = MakiruSpigotHub.getFactory().getLogger(this.getClass().getPackage() + "." + this.getClass().getName());

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onEvent(@NotNull final PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            try {
                if (e.getPlayer().getItemInHand().getType().equals(Material.COMPASS)) {
                    new NavigatorGUI(e.getPlayer(), new AccountManager.Provider().get(MojangFetcher.getUUID(e.getPlayer().getName())));
                }
            } catch (AccountNotFoundException ex) {
                this.logger.error("onEvent(onPlayerInteractEvent)", ex);
                e.getPlayer().sendMessage("\n" + MakiruSpigotHub.PREFIX + ((String) L.ACCOUNT_NOT_FOUND_EXCEPTION.get(Languages.FRENCH)).replace("{name}", e.getPlayer().getName()));
            } catch (RedisException | RedisDownException ex) {
                this.logger.error("onEvent(onPlayerInteractEvent)", ex);
                e.getPlayer().sendMessage("\n" + MakiruSpigotHub.PREFIX + L.REDIS_EXCEPTION.get(Languages.FRENCH));
            }
        }
       /* Player clicker = event.getPlayer();
        Action action = event.getAction();
        if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
            if (clicker.getItemInHand().getType() == Material.COMPASS) {
                new NavigationInventory(clicker).openIt();
                return;
            } else if (clicker.getItemInHand().getType() == Material.ENDER_CHEST) {
                new CosmeticsInventory(clicker).openIt();
                return;
            } else if (clicker.getItemInHand().getType() == Material.GREEN_DYE) {
                for (Player online : Bukkit.getOnlinePlayers()) {
                    online.hidePlayer(clicker);
                }
                clicker.getInventory().setItem(4, new MItemBuilder(Material.LIGHT_GRAY_DYE)
                        .withName("§aAfficher les joueurs").asItemStack());
                clicker.updateInventory();
                return;
            } else if (clicker.getItemInHand().getType() == Material.LIGHT_GRAY_DYE) {
                for (Player online : Bukkit.getOnlinePlayers()) {
                    online.showPlayer(clicker);
                }

                clicker.getInventory().setItem(4, new MItemBuilder(Material.LIGHT_GRAY_DYE)
                        .withName("§cCacher les joueurs").asItemStack());
                clicker.updateInventory();
                return;
            }
            return;
        }
        return;*/
    }
}
