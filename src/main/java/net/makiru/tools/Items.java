package net.makiru.tools;

import net.makiru.commons.tools.Languages;
import net.makiru.spigot.builders.ItemStack_B;
import net.makiru.spigot.lang.L;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Items {

    //TODO: TOOLBAR
    public static ItemStack_B NAVIGATOR(@NotNull final Languages language) {
        return new ItemStack_B(Material.COMPASS).setDisplayName((String) L.Hub.NAVIGATOR.get(language)).setLore((String[]) L.Hub.NAVIGATOR_LORES.get(language));
    }

    public static ItemStack_B ODDS_AND_ENDS(@NotNull final Languages language) {
        return new ItemStack_B(Material.ENDER_CHEST).setDisplayName((String) L.Hub.ODDS_AND_ENDS.get(language)).setLore((String[]) L.Hub.ODDS_AND_ENDS_LORES.get(language));
    }

    public static ItemStack_B PROFIL(@NotNull final Languages language, @NotNull final Player player) {
        return new ItemStack_B(Material.PLAYER_HEAD).setDisplayName((String) L.Hub.PROFIL.get(language)).setLore((String[]) L.Hub.PROFIL_LORES.get(language)).setSkullOwningPlayer(player);
    }

    public static ItemStack_B SHOP(@NotNull final Languages language) {
        return new ItemStack_B(Material.EMERALD).setDisplayName((String) L.Hub.SHOP.get(language)).setLore((String[]) L.Hub.SHOP_LORES.get(language));
    }

    public static ItemStack_B SETTINGS(@NotNull final Languages language) {
        return new ItemStack_B(Material.COMPARATOR).setDisplayName((String) L.Hub.SETTINGS.get(language)).setLore((String[]) L.Hub.SETTINGS_LORES.get(language));
    }

    //TODO: GUI
    public static ItemStack_B CLOSE_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.DARK_OAK_DOOR).setDisplayName((String) L.Hub.CLOSE.get(language));
    }

    public static ItemStack_B BACK_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.ARROW).setDisplayName((String) L.Hub.BLACK.get(language));
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
        return new ItemStack_B(Material.END_PORTAL_FRAME).setDisplayName("§7» §d§lHub"); //TODO: Make LORES
    }

    public static ItemStack_B INFO_NAVIGATOR_GUI() {
        return new ItemStack_B(Material.PAPER).setDisplayName("§7» §f§lInfo"); //TODO: Make LORES
    }

    public static ItemStack_B JUMP_NAVIGATOR_GUI() {
        return new ItemStack_B(Material.FEATHER).setDisplayName("§7» §e§lJump"); //TODO: Make LORES
    }

/*    public static ItemStack_B ODDS_AND_ENDS_NAVIGATOR_GUI(@NotNull final Languages language) {
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
    }*/

    public static ItemStack_B CLUEDO_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.DRIED_KELP).setDisplayName("§b§lCluedo").setLore((String) L.Hub.CLUEDO_LORES.get(language));
    }

    public static ItemStack_B WEREWOLF_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.COOKED_RABBIT).setDisplayName("§c§lWerewolf").setLore((String) L.Hub.WEREWOLF_LORES.get(language));
    }

    public static ItemStack_B DEATHNOTE_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.DEAD_TUBE_CORAL).setDisplayName("§7§lDeathNote").setLore(" ", "§7Version §cLoup-Garou", "§7Version §eUHC", " ", "§aI§bn§cé§dd§ei§ft", " ");
    }

    public static ItemStack_B MONOPOLY_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.TOTEM_OF_UNDYING).setDisplayName("§e§lMonopoly").setLore((String) L.Hub.MONOPOLY_LORES.get(language));
    }

    public static ItemStack_B MURDER_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.IRON_SWORD).setDisplayName("§7§lMurder").setLore((String) L.Hub.MURDER_LORES.get(language));
    }

    public static ItemStack_B TNTRUN_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.TNT).setDisplayName("§7§lTNTRun").setLore((String) L.Hub.FASTGAME_REISSUE_LORES.get(language));
    }

    public static ItemStack_B SPLEEF_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.GOLDEN_SHOVEL).setDisplayName("§7§lSpleef").setLore((String) L.Hub.FASTGAME_REISSUE_LORES.get(language));
    }

    public static ItemStack_B THIMBLE_NAVIGATOR_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.QUARTZ_BLOCK).setDisplayName("§7§lThimble (DAC)").setLore((String) L.Hub.FASTGAME_REISSUE_LORES.get(language));
    }


    //TODO: GLOBAL GUI
    public static ItemStack_B HOST() {
        return new ItemStack_B(Material.PISTON).setDisplayName("§7» §b§lH§d§lo§a§ls§e§lt").addGlow(); //TODO: Make LORES
    }

    public static ItemStack_B RANKS_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.WOLF_SPAWN_EGG).setDisplayName("§7§lRanks").setLore((String) L.Hub.RANKS_LORES.get(language)); //TODO: Make LORES
    }

    public static ItemStack_B PETS_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.WOLF_SPAWN_EGG).setDisplayName("§7§lPets").setLore((String) L.Hub.PETS_LORES.get(language)); //TODO: Make LORES
    }

    public static ItemStack_B BOOSTERS_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.EXPERIENCE_BOTTLE).setDisplayName("§7§lBoosters").setLore((String) L.Hub.BOOSTERS_LORES.get(language)); //TODO: Make LORES
    }

    public static ItemStack_B PARTICLES_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.BLAZE_POWDER).setDisplayName("§7§lParticles").setLore((String) L.Hub.PARTICLES_LORES.get(language)); //TODO: Make LORES
    }

   /* public static ItemStack_B GADGETS_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.BLAZE_POWDER).setDisplayName("§7§lGadgets").setLore((String)L.Hub.GADGETS_LORES.get(language));
    }*/

   @SuppressWarnings("deprecation")
    public static ItemStack_B SETTINGS_OFF_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.LEGACY_REDSTONE_TORCH_OFF).setDisplayName("§7§lOFF").setLore((String) L.Hub.OFF_LORES.get(language)); //TODO: Make LORES
    }

    @SuppressWarnings("deprecation")
    public static ItemStack_B SETTINGS_ON_GUI(@NotNull final Languages language) {
        return new ItemStack_B(Material.LEGACY_REDSTONE_TORCH_ON).setDisplayName("§7§lON").setLore((String) L.Hub.ON_LORES.get(language)); //TODO: Make LORES
    }


    // public static ItemStack_B
}
