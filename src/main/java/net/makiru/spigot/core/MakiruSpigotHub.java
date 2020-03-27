package net.makiru.spigot.core;

import net.makiru.api.core.MakiruAPI;
import net.makiru.api.logger.MKFactory;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class MakiruSpigotHub extends JavaPlugin {

    public static final String PREFIX = "§7[§c!§7] §8» ";
    private static MakiruSpigotHub instance;
    private static MKFactory factory;

    public static MKFactory getFactory() {
        return factory;
    }

    private void setFactory(@NotNull final MKFactory factory) {
        MakiruSpigotHub.factory = factory;
    }

    public static MakiruSpigotHub getInstance() {
        return MakiruSpigotHub.instance;
    }

    private void setInstance(@NotNull final MakiruSpigotHub instance) {
        MakiruSpigotHub.instance = instance;
    }

    @Override
    public void onLoad() {
        new Load(this);
        super.onLoad();
    }

    @Override
    public void onEnable() {
        this.setInstance(this);
        this.setFactory(new MKFactory(this.getDataFolder()));
        new MakiruAPI(this.getDataFolder());
        new Enable(this);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        new Disable();
        super.onDisable();
    }
}
