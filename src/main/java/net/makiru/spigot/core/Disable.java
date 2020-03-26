package net.makiru.spigot.core;

import net.makiru.api.core.MakiruAPI;
import net.makiru.api.redis.RedisManager;

import java.io.IOException;

class Disable {

    Disable() {
        try {
            RedisManager.closeAllConnections();
        } catch (Exception ignored) {
        }

        try {
            System.out.println("Save MakiruHub logger.");
            MakiruHub.getFactory().save();
            System.out.println("Waiting 1500ms");
            Thread.sleep(1500);
            System.out.println("Save MakiruAPI logger.");
            MakiruAPI.getFactory().save();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
