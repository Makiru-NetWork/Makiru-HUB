package net.makiru.spigot.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OnAsyncPlayerChatEvent implements Listener {

    @EventHandler
    public void onEvent(AsyncPlayerChatEvent e) {
        e.setFormat(e.getPlayer().getDisplayName() + " §8» §f" + e.getMessage());
    }
}
