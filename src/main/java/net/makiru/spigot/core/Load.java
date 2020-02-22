package net.makiru.spigot.core;

import java.time.ZoneId;
import java.util.TimeZone;

class Load {

    Load() {
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Europe/Paris")));
    }
}
