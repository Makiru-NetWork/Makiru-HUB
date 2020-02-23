package net.makiru.tools;

import net.makiru.commons.tools.Languages;
import net.makiru.spigot.builders.ItemStack_B;
import net.makiru.spigot.lang.L;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Items {

    //TODO: TOOLBAR
    public static ItemStack_B NAVIGATOR_TOOLBAR(@NotNull final Languages language) {
        return new ItemStack_B(Material.COMPASS).setDisplayName((String) L.NAVIGATOR_TOOLBAR.get(language)).setLore((String[]) L.NAVIGATOR_LORES_TOOLBAR.get(language));
    }

    public static ItemStack_B ODDS_AND_ENDS_TOOLBAR(@NotNull final Languages language) {
        return new ItemStack_B(Material.ENDER_CHEST).setDisplayName((String) L.ODDS_AND_ENDS_TOOLBAR.get(language)).setLore((String[]) L.ODDS_AND_ENDS_LORES_TOOLBAR.get(language));
    }

    public static ItemStack_B PROFIL_TOOLBAR(@NotNull final Languages language, @NotNull final Player player) {
        return new ItemStack_B(Material.PLAYER_HEAD).setDisplayName((String) L.PROFIL_TOOLBAR.get(language)).setLore((String[]) L.PROFIL_LORES_TOOLBAR.get(language)).setSkullOwningPlayer(player);
    }

    public static ItemStack_B SHOP_TOOLBAR(@NotNull final Languages language) {
        return new ItemStack_B(Material.EMERALD).setDisplayName((String) L.SHOP_TOOLBAR.get(language)).setLore((String[]) L.SHOP_LORES_TOOLBAR.get(language));
    }

    public static ItemStack_B SETTINGS_TOOLBAR(@NotNull final Languages language) {
        return new ItemStack_B(Material.COMPARATOR).setDisplayName((String) L.SETTINGS_TOOLBAR.get(language)).setLore((String[]) L.SETTINGS_LORES_TOOLBAR.get(language));
    }

    //TODO: DECORATION_GUI
    public static ItemStack_B DECORATION_GUI() {
        return new ItemStack_B(Material.RED_STAINED_GLASS_PANE).setDisplayName("");
    }

    //TODO: NAVIGATOR_GUI
    public static ItemStack_B HUB_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.END_PORTAL_FRAME).setDisplayName("§7» §d§lHub");
    }

    public static ItemStack_B HOST_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.PISTON).setDisplayName("§7» §b§lHost").addGlow();
    }

    public static ItemStack_B INFO_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.FLOWER_BANNER_PATTERN).setDisplayName("§7» §f§lInfo");
    }

    public static ItemStack_B JUMP_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.FEATHER).setDisplayName("§7» §e§lJump");
    }

    public static ItemStack_B ODDS_AND_ENDS_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.ENDER_CHEST).setDisplayName("§7» §f§lBric-À-Brac");
    }

    public static ItemStack_B PROFIL_NAVIGATOR_GUI(@NotNull final Languages language, @NotNull Player player) {
        return new ItemStack_B(Material.PLAYER_HEAD).setDisplayName("§7» §a§lProfil").setSkullOwningPlayer(player);
    }

    public static ItemStack_B SHOP_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.EMERALD).setDisplayName("§7» §b§lBoutique");
    }

    public static ItemStack_B SETTINGS_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.EMERALD).setDisplayName("§7» §c§lPréférences");
    }


    // public static ItemStack_B
}
