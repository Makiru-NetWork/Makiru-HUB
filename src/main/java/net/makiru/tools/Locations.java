package net.makiru.tools;

import net.makiru.spigot.core.MakiruSpigotHub;
import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;

public enum Locations {

    HUB(new Location(MakiruSpigotHub.getInstance().getServer().getWorlds().get(0), -539.5, 7, -215.5, 90, 0)),
    JUMP(new Location(MakiruSpigotHub.getInstance().getServer().getWorlds().get(0), -518.5, 23, -253.5, -21, 0)),
    EVENT(new Location(MakiruSpigotHub.getInstance().getServer().getWorlds().get(0), -15, 150, -15));

    private final Location location;

    Locations(@NotNull final Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

}
