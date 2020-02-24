package net.makiru.tools;

import net.makiru.commons.tools.Languages;
import net.makiru.spigot.builders.ItemStack_B;
import net.makiru.spigot.lang.L;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Items {

    //TODO: TOOLBAR
    public static ItemStack_B NAVIGATOR(@NotNull final Languages language) {
        return new ItemStack_B(Material.COMPASS).setDisplayName((String) L.NAVIGATOR.get(language)).setLore((String[]) L.NAVIGATOR_LORES.get(language));
    }

    public static ItemStack_B ODDS_AND_ENDS(@NotNull final Languages language) {
        return new ItemStack_B(Material.ENDER_CHEST).setDisplayName((String) L.ODDS_AND_ENDS.get(language)).setLore((String[]) L.ODDS_AND_ENDS_LORES.get(language));
    }

    public static ItemStack_B PROFIL(@NotNull final Languages language, @NotNull final Player player) {
        return new ItemStack_B(Material.PLAYER_HEAD).setDisplayName((String) L.PROFIL.get(language)).setLore((String[]) L.PROFIL_LORES.get(language)).setSkullOwningPlayer(player);
    }

    public static ItemStack_B SHOP(@NotNull final Languages language) {
        return new ItemStack_B(Material.EMERALD).setDisplayName((String) L.SHOP.get(language)).setLore((String[]) L.SHOP_LORES.get(language));
    }

    public static ItemStack_B SETTINGS(@NotNull final Languages language) {
        return new ItemStack_B(Material.COMPARATOR).setDisplayName((String) L.SETTINGS.get(language)).setLore((String[]) L.SETTINGS_LORES.get(language));
    }

    //TODO: GUI
    public static ItemStack_B CLOSE_GUI() {
        return new ItemStack_B(Material.DARK_OAK_DOOR).setDisplayName("§7» §c§lFermer");
    }

    public static ItemStack_B BACK_GUI() {
        return new ItemStack_B(Material.ARROW).setDisplayName("§7» §c§lRetour");
    }

    //TODO: DECORATION_GUI
    public static ItemStack_B GRAY_DECORATION_GUI() {
        return new ItemStack_B(Material.GRAY_STAINED_GLASS_PANE).setDisplayName(" ");
    }
    public static ItemStack_B RED_DECORATION_GUI() {
        return new ItemStack_B(Material.RED_STAINED_GLASS_PANE).setDisplayName(" ");
    }

    //TODO: NAVIGATOR_GUI
    public static ItemStack_B HUB_NAVIGATOR_GUI() {
        return new ItemStack_B(Material.END_PORTAL_FRAME).setDisplayName("§7» §d§lHub");
    }

    public static ItemStack_B HOST_NAVIGATOR_GUI() {
        return new ItemStack_B(Material.PISTON).setDisplayName("§7» §b§lH§d§lo§a§ls§e§lt").addGlow();
    }

    public static ItemStack_B INFO_NAVIGATOR_GUI() {
        return new ItemStack_B(Material.PAPER).setDisplayName("§7» §f§lInfo");
    }

    public static ItemStack_B JUMP_NAVIGATOR_GUI() {
        return new ItemStack_B(Material.FEATHER).setDisplayName("§7» §e§lJump");
    }

    public static ItemStack_B ODDS_AND_ENDS_NAVIGATOR_GUI(@NotNull final Languages language) {
        return Items.ODDS_AND_ENDS(language).setLore(new ArrayList<>());
    }

    public static ItemStack_B PROFIL_NAVIGATOR_GUI(@NotNull final Languages language, @NotNull Player player) {
        return Items.PROFIL(language, player).setLore(new ArrayList<>());
    }

    public static ItemStack_B SHOP_NAVIGATOR_GUI(@NotNull final Languages language) {
        return Items.SHOP(language).setLore(new ArrayList<>());
    }

    public static ItemStack_B SETTINGS_NAVIGATOR_GUI(@NotNull final Languages language) {
        return Items.SETTINGS(language).setLore(new ArrayList<>());
    }

    public static ItemStack_B CLUEDO_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.DRIED_KELP).setDisplayName("§7§lCluedo").setLore(" ", "§aI§bn§cé§dd§ei§ft", " ");
    }

    public static ItemStack_B WEREWOLF_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.COOKED_RABBIT).setDisplayName("§7§lLoup-Garou").setLore(" ", "§aI§bn§cé§dd§ei§ft", " ");
    }

    public static ItemStack_B DEATHNOTE_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.DEAD_TUBE_CORAL).setDisplayName("§7§lDeathNote").setLore(" ", "§7Version §cLoup-Garou", "§7Version §eUHC", " ", "§aI§bn§cé§dd§ei§ft", " ");
    }

    public static ItemStack_B MONOPOLY_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.TOTEM_OF_UNDYING).setDisplayName("§7§lMonopoly").setLore(" ", "§aI§bn§cé§dd§ei§ft", " ", "§cSoon...");
    }

    public static ItemStack_B MURDER_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.IRON_SWORD).setDisplayName("§7§lMurder").setLore(" ", "§aI§bn§cé§dd§ei§ft", " ");
    }

    public static ItemStack_B TNTRUN_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.TNT).setDisplayName("§7§lTNTRun").setLore(" ", "§dRéedition", " ");
    }

    public static ItemStack_B SPLEEF_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.GOLDEN_SHOVEL).setDisplayName("§7§lSpleef").setLore(" ", "§dRéedition", " ");
    }

    public static ItemStack_B THIMBLE_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.QUARTZ_BLOCK).setDisplayName("§7§lDé À Coudre").setLore(" ", "§dRéedition", " ");
    }


    // public static ItemStack_B
}
