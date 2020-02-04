package net.makiru;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class MakiruHub extends JavaPlugin {

    @Override
    public void onEnable(){
        /**
         * Log MKLogger info starting
         */
        registerListeners();
    }

    @Override
    public void onDisable(){
        /**
         * Log MKLogger info stopping
         */
    }

    /**
     * Je sais pas comment tu register tes events ducoup je fais ma manière mais je te laisse adapt :)
     * @param listeners
     */
    void registerListeners(Listener... listeners){
        Arrays.stream(listeners).forEach(listener -> getServer().getPluginManager().registerEvents(listener, this));
    }
}
