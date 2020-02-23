package net.makiru.spigot.guis;

import net.makiru.spigot.builders.Inventory_B;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class NavigatorGUI {

    public NavigatorGUI(@NotNull Player player) {
        player.openInventory(new Inventory_B(player, 9*6, "§7» §e§lNavigateur §7«").addItem().toInventory());
    }
}
