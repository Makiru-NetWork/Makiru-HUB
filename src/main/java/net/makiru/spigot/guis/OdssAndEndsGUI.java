package net.makiru.spigot.guis;

import net.makiru.commons.Account;
import net.makiru.spigot.builders.Inventory_B;
import net.makiru.tools.Items;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class OdssAndEndsGUI {

    public OdssAndEndsGUI(@NotNull final Player player, @NotNull final Account account) {
        player.openInventory(new Inventory_B(player, 9 * 6, "§7» §e§lBric-À-Brac §7«")
                .setItem(49, Items.CLOSE_GUI().toItemStack())
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
