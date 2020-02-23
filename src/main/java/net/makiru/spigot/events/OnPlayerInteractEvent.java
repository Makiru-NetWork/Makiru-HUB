package net.makiru.spigot.events;

import net.makiru.api.account.AccountManager;
import net.makiru.api.exceptions.AccountNotFoundException;
import net.makiru.api.exceptions.RedisDownException;
import net.makiru.api.exceptions.RedisException;
import net.makiru.api.logger.MKLogger;
import net.makiru.api.mojang.UUIDFetcher;
import net.makiru.commons.tools.Languages;
import net.makiru.spigot.core.MakiruHub;
import net.makiru.spigot.guis.NavigatorGUI;
import net.makiru.spigot.lang.L;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

public class OnPlayerInteractEvent implements Listener {

    private final MKLogger logger = MakiruHub.getFactory().getLogger(this.getClass().getPackage() + "." + this.getClass().getName());

    @EventHandler
    public void onEvent(@NotNull final PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (e.getPlayer().getItemInHand().getType().equals(Material.COMPASS)) {
                try {
                    new NavigatorGUI(e.getPlayer(), new AccountManager.Provider().get(UUIDFetcher.getUUID(e.getPlayer().getName())));
                } catch (AccountNotFoundException ex) {
                    this.logger.error("onEvent(onPlayerInteractEvent)", ex);
                    e.getPlayer().sendMessage("\n" + MakiruHub.PREFIX + ((String) L.ACCOUNT_NOT_FOUND_EXCEPTION.get(Languages.FRENCH)).replace("{name}", e.getPlayer().getName()));
                } catch (RedisException | RedisDownException ex) {
                    this.logger.error("onEvent(onPlayerInteractEvent)", ex);
                    e.getPlayer().sendMessage("\n" + MakiruHub.PREFIX + L.REDIS_EXCEPTION.get(Languages.FRENCH));
                }
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
