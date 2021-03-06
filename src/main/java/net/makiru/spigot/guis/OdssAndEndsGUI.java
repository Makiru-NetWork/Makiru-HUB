package net.makiru.spigot.guis;

import net.makiru.commons.Account;
import net.makiru.spigot.builders.Inventory_B;
import net.makiru.spigot.lang.L;
import net.makiru.tools.Items;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class OdssAndEndsGUI {

    public OdssAndEndsGUI(@NotNull final Player player, @NotNull final Account account) {
        player.openInventory(new Inventory_B(player, 9 * 5, (String) L.Hub.ODDS_AND_ENDS.get(account.getLanguage()))
                .setItem(40, Items.CLOSE_GUI(account.getLanguage()).toItemStack())
                .setItem(13, Items.PETS_GUI(account.getLanguage()).toItemStack())
                .setItem(20, Items.BOOSTERS_GUI(account.getLanguage()).toItemStack())
                .setItem(24, Items.PARTICLES_GUI(account.getLanguage()).toItemStack())
                //.setItem(31, Items.GADGETS_GUI(account.getLanguage()).toItemStack())
                .fillNull(Items.GRAY_DECORATION_GUI().toItemStack(), 0, 8, true)
                .fillNull(Items.GRAY_DECORATION_GUI().toItemStack(), 36, 44, true)
                .setItem(9, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(18, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(27, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(17, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(26, Items.GRAY_DECORATION_GUI().toItemStack())
                .setItem(35, Items.GRAY_DECORATION_GUI().toItemStack())
                .toInventory());
    }
}
