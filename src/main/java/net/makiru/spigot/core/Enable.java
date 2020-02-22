package net.makiru.spigot.core;

import net.makiru.api.redis.RedisManager;
import net.makiru.spigot.events.InventoryClickListener;
import net.makiru.spigot.events.ItemClickListener;
import net.makiru.spigot.events.JoinListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class Enable {

    Enable(MakiruHub makiruHub) {
        try {
            RedisManager.initAllConnections();
        } catch (Exception ignored) {
        }
        this.registerListeners(makiruHub.getServer().getPluginManager(), makiruHub, new JoinListener(), new ItemClickListener(), new InventoryClickListener());
    }

    private void registerListeners(@NotNull final PluginManager pluginManager, @NotNull final MakiruHub makiruHub, Listener... listeners) {
        Arrays.stream(listeners).forEach(listener -> pluginManager.registerEvents(listener, makiruHub));
    }
}
