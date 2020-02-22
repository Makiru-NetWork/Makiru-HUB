package net.makiru.spigot.core;

import net.makiru.api.core.MakiruAPI;
import net.makiru.api.logger.MKFactory;
import org.bukkit.plugin.java.JavaPlugin;

public class MakiruHub extends JavaPlugin {

    public static String PREFIX = "§7[§c!§7] §8» ";
    private static MakiruHub instance;
    private static MKFactory factory;

    public static MKFactory getFactory() {
        return factory;
    }

    private void setFactory(MKFactory factory) {
        MakiruHub.factory = factory;
    }

    public static MakiruHub getInstance() {
        return MakiruHub.instance;
    }

    private void setInstance(MakiruHub instance) {
        MakiruHub.instance = instance;
    }

    @Override
    public void onLoad() {
        new Load();
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
