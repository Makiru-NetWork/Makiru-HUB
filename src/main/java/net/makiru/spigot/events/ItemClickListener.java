package net.makiru.spigot.events;

import net.makiru.api.MItemBuilder;
import net.makiru.tools.inventories.CosmeticsInventory;
import net.makiru.tools.inventories.NavigationInventory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemClickListener implements Listener {

    @EventHandler
    public void onItemClick(PlayerInteractEvent event){
        Player clicker = event.getPlayer();
        Action action = event.getAction();
        if(action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
            if (clicker.getItemInHand().getType() == Material.COMPASS) {
                new NavigationInventory(clicker).openIt();
                return;
            } else if(clicker.getItemInHand().getType() == Material.ENDER_CHEST){
                new CosmeticsInventory(clicker).openIt();
                return;
            } else if(clicker.getItemInHand().getType() == Material.GREEN_DYE){
                for(Player online : Bukkit.getOnlinePlayers()){
                    online.hidePlayer(clicker);
                }
                clicker.getInventory().setItem(4, new MItemBuilder(Material.LIGHT_GRAY_DYE)
                        .withName("§aAfficher les joueurs").asItemStack());
                clicker.updateInventory();
                return;
            } else if(clicker.getItemInHand().getType() == Material.LIGHT_GRAY_DYE){
                for(Player online : Bukkit.getOnlinePlayers()){
                    online.showPlayer(clicker);
                }

                clicker.getInventory().setItem(4, new MItemBuilder(Material.LIGHT_GRAY_DYE)
                        .withName("§cCacher les joueurs").asItemStack());
                clicker.updateInventory();
                return;
            }
            return;
        }
        return;
    }
}
