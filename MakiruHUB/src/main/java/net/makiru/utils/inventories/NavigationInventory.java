package net.makiru.utils.inventories;

import net.makiru.api.MItemBuilder;
import net.makiru.api.inventory.MInventory;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class NavigationInventory {

    public NavigationInventory(){
    }

    public MInventory openIt(){
        ItemStack pane = new MItemBuilder(Material.BLACK_STAINED_GLASS_PANE).withName("§7").asItemStack();
        ItemStack cluedo = new MItemBuilder(Material.DIAMOND_SWORD).withName("§6 >> Cluedo <<")
                .withLore(Arrays.asList("Cluedo", "§7Mode de jeu inédit")).asItemStack();
        MInventory inv = new MInventory(54, "Navigation")
                .fillWithItem(pane, 0, 11)
                .fillWithItem(pane, 15, 26)
                .fillWithItem(pane, 29, 53)
                .addItem(12, cluedo);
        /**
         * @Tests: Not functional
         */

        return inv;
    }

}
