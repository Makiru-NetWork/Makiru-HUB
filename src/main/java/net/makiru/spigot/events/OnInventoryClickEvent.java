package net.makiru.spigot.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.jetbrains.annotations.NotNull;

public class OnInventoryClickEvent implements Listener {

    @EventHandler
    public void onEvent(@NotNull final InventoryClickEvent e) {

        //event.setCancelled(true);
    }
}
