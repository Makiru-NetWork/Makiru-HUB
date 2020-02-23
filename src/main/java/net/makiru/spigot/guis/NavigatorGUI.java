package net.makiru.spigot.guis;

import net.makiru.commons.Account;
import net.makiru.spigot.builders.Inventory_B;
import net.makiru.tools.Items;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class NavigatorGUI {

    public NavigatorGUI(@NotNull final Player player, @NotNull final Account account) {
        player.openInventory(new Inventory_B(player, 9 * 6, "§7» §e§lNavigateur §7«")
                .setItem(0, Items.HUB_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(4, Items.HOST_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(8, Items.INFO_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(45, Items.JUMP_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(46, Items.ODDS_AND_ENDS_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(49, Items.PROFIL_NAVIGATOR_GUI(account.getLanguage(), player).toItemStack())
                .setItem(52, Items.SHOP_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .setItem(53, Items.SETTINGS_NAVIGATOR_GUI(account.getLanguage()).toItemStack())
                .fillNull(Items.DECORATION_GUI().toItemStack(), 1, 7, true)
                .fillNull(Items.DECORATION_GUI().toItemStack(), 46, 52, true)
                .setItem(9, Items.DECORATION_GUI().toItemStack())
                .setItem(18, Items.DECORATION_GUI().toItemStack())
                .setItem(27, Items.DECORATION_GUI().toItemStack())
                .setItem(36, Items.DECORATION_GUI().toItemStack())
                .setItem(17, Items.DECORATION_GUI().toItemStack())
                .setItem(26, Items.DECORATION_GUI().toItemStack())
                .setItem(35, Items.DECORATION_GUI().toItemStack())
                .setItem(44, Items.DECORATION_GUI().toItemStack())
                .toInventory());
    }
}
