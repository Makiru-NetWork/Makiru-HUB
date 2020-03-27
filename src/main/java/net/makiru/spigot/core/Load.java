package net.makiru.spigot.core;

import net.makiru.spigot.api.tools.Tools;

import java.time.ZoneId;
import java.util.TimeZone;

class Load {

    Load(MakiruSpigotHub makiruSpigotHub) {
        Tools.clearCommands(makiruSpigotHub);
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Europe/Paris")));
    }
}
