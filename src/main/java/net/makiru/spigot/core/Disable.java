package net.makiru.spigot.core;

import net.makiru.api.logger.MKFactory;
import net.makiru.api.redis.RedisManager;

import java.io.IOException;

class Disable {

    Disable() {
        try {
            RedisManager.closeAllConnections();
        } catch (Exception ignored) {
        }

        try {
            MakiruSpigotHub.getFactory().save(MKFactory.getLogs());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
