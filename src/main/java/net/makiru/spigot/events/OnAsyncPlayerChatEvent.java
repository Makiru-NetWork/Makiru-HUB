package net.makiru.spigot.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.jetbrains.annotations.NotNull;

public class OnAsyncPlayerChatEvent implements Listener {

    @EventHandler
    public void onEvent(@NotNull final AsyncPlayerChatEvent e) {
        e.setFormat(e.getPlayer().getDisplayName() + " §8» §f" + e.getMessage());
    }
}
