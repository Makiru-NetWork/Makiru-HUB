package net.makiru.utils.locations;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public enum Locations {

    SPAWN(new Location(Bukkit.getWorlds().get(0), 0, 150, 0)),
    JUMP(new Location(Bukkit.getWorlds().get(0), 15, 150, 15)),
    EVENT(new Location(Bukkit.getWorlds().get(0), -15, 150, -15));

    private Location location;

    private Locations(Location location){
        this.location = location;
    }

    public Location toLocation(){
        return this.location;
    }

}
