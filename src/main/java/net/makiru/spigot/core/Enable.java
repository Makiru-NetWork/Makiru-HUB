package net.makiru.spigot.core;

import net.makiru.api.redis.RedisManager;
import net.makiru.spigot.events.OnAsyncPlayerChatEvent;
import net.makiru.spigot.events.OnInventoryClickEvent;
import net.makiru.spigot.events.OnPlayerInteractEvent;
import net.makiru.spigot.events.OnPlayerJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class Enable {

    Enable(@NotNull final MakiruSpigotHub makiruSpigotHub) {
        try {
            RedisManager.initAllConnections();
        } catch (Exception ignored) {
        }
        this.registerListeners(makiruSpigotHub.getServer().getPluginManager(), makiruSpigotHub, new OnPlayerJoinEvent(), new OnPlayerInteractEvent(), new OnInventoryClickEvent(), new OnAsyncPlayerChatEvent());
    }

    private void registerListeners(@NotNull final PluginManager pluginManager, @NotNull final MakiruSpigotHub makiruSpigotHub, Listener... listeners) {
        Arrays.stream(listeners).forEach(listener -> pluginManager.registerEvents(listener, makiruSpigotHub));
    }
}
