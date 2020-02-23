package net.makiru.tools;

import net.makiru.commons.tools.Languages;
import net.makiru.spigot.builders.ItemStack_B;
import net.makiru.spigot.lang.L;
import org.bukkit.Material;

public class Items {

    public static ItemStack_B NAVIGATOR_TOOLBAR (Languages language) {
        String[] text = (String[]) L.NAVIGATOR_TOOLBAR.get(language);
       return new ItemStack_B(Material.COMPASS).setDisplayName(text[0]).setLore(" ", text[1], " ", text[2]);
    }

    public static ItemStack_B ODDS_AND_ENDS_TOOLBAR (Languages language) {
        String[] text = (String[]) L.ODDS_AND_ENDS_TOOLBAR.get(language);
        return new ItemStack_B(Material.ENDER_CHEST).setDisplayName(text[0]).setLore(" ", text[1], " ", text[2]);
    }

    public static ItemStack_B PROFIL_TOOLBAR (Languages language) {
        String[] text = (String[]) L.PROFIL_TOOLBAR.get(language);
        return new ItemStack_B(Material.PLAYER_HEAD).setDisplayName(text[0]).setLore(" ", text[1], " ", text[2]);
    }

    public static ItemStack_B SHOP_TOOLBAR (Languages language) {
        String[] text = (String[]) L.SHOP_TOOLBAR.get(language);
        return new ItemStack_B(Material.EMERALD).setDisplayName(text[0]).setLore(" ", text[1], " ", text[2]);
    }

    public static ItemStack_B SETTINGS_TOOLBAR (Languages language) {
        String[] text = (String[]) L.SETTINGS_TOOLBAR.get(language);
        return new ItemStack_B(Material.COMPARATOR).setDisplayName(text[0]).setLore(" ", text[1], " ", text[2]);
    }

   // public static ItemStack_B
}
