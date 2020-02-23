package net.makiru.tools;

import net.makiru.spigot.core.MakiruHub;
import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;

public enum Locations {

    HUB(new Location(MakiruHub.getInstance().getServer().getWorlds().get(0), -539.5, 7, -215.5, 90, 0)),
    JUMP(new Location(MakiruHub.getInstance().getServer().getWorlds().get(0), 15, 150, 15)),
    EVENT(new Location(MakiruHub.getInstance().getServer().getWorlds().get(0), -15, 150, -15));

    private final Location location;

    Locations(@NotNull final Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

}
