package net.makiru.spigot.guis;

import net.makiru.commons.Account;
import net.makiru.spigot.builders.Inventory_B;
import net.makiru.spigot.lang.L;
import net.makiru.tools.Items;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class NavigatorGUI {

    public NavigatorGUI(@NotNull final Player player, @NotNull final Account account) {
        player.openInventory(new Inventory_B(player, 9 * 6, (String) L.Hub.NAVIGATOR.get(account.getLanguage()))
                .setItem(0, Items.HUB_NAVIGATOR_GUI().toItemStack())
                .setItem(4, Items.HOST_NAVIGATOR_GUI().toItemStack())
                .setItem(8, Items.INFO_NAVIGATOR_GUI().toItemStack())
                .setItem(45, Items.JUMP_NAVIGATOR_GUI().toItemStack())
                .setItem(46, Items.ODDS_AND_ENDS_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(49, Items.PROFIL_NAVIGATOR_GUI(account.getLanguage(), player).toItemStack())
                .setItem(52, Items.SHOP_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(53, Items.SETTINGS_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(20, Items.CLUEDO_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(21, Items.WEREWOLF_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(22, Items.DEATHNOTE_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(23, Items.MONOPOLY_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(24, Items.MURDER_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(30, Items.TNTRUN_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(31, Items.SPLEEF_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(32, Items.THIMBLE_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .fillNull(Items.GRAY_DECORATION_GUI().toItemStack(), 0, 8, true)
                .fillNull(Items.GRAY_DECORATION_GUI().toItemStack(), 45, 53, true)
                .setItem(9, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(18, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(27, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(36, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(17, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(26, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(35, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(44, Items.GRAY_DECORATION_GUI().toItemStack())
                .toInventory());
    }
}
