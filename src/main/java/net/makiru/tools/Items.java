package net.makiru.tools;

import net.makiru.commons.tools.Languages;
import net.makiru.spigot.builders.ItemStack_B;
import net.makiru.spigot.lang.L;
import org.bukkit.Material;

public class Items {

    public static ItemStack_B NAVIGATOR_TOOLBAR (Languages language) {
       return new ItemStack_B(Material.COMPASS).setDisplayName((String) L.NAVIGATOR_TOOLBAR.get(language)).setLore((String[]) L.NAVIGATOR_LORES_TOOLBAR.get(language));
    }

    public static ItemStack_B ODDS_AND_ENDS_TOOLBAR (Languages language) {
        return new ItemStack_B(Material.ENDER_CHEST).setDisplayName((String) L.ODDS_AND_ENDS_TOOLBAR.get(language)).setLore((String[]) L.ODDS_AND_ENDS_LORES_TOOLBAR.get(language));
    }

    public static ItemStack_B PROFIL_TOOLBAR (Languages language) {
        return new ItemStack_B(Material.PLAYER_HEAD).setDisplayName((String) L.PROFIL_TOOLBAR.get(language)).setLore((String[]) L.PROFIL_LORES_TOOLBAR.get(language));
    }

    public static ItemStack_B SHOP_TOOLBAR (Languages language) {
        return new ItemStack_B(Material.EMERALD).setDisplayName((String) L.SHOP_TOOLBAR.get(language)).setLore((String[]) L.SHOP_LORES_TOOLBAR.get(language));
    }

    public static ItemStack_B SETTINGS_TOOLBAR (Languages language) {
        return new ItemStack_B(Material.COMPARATOR).setDisplayName((String) L.SETTINGS_TOOLBAR.get(language)).setLore((String[]) L.SETTINGS_LORES_TOOLBAR.get(language));
    }

   // public static ItemStack_B
}
