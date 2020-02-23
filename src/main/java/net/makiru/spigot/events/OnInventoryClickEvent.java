package net.makiru.spigot.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class OnInventoryClickEvent implements Listener {

    @EventHandler
    public void onEvent(InventoryClickEvent event) {
        //event.setCancelled(true);
    }
}
