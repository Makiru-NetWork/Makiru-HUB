package net.makiru.tools.inventories;

import net.makiru.api.MItemBuilder;
import net.makiru.api.inventory.MInventory;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class NavigationInventory {

    private Player playerS;
    public NavigationInventory(Player playerS){
        this.playerS = playerS;
    }

    public MInventory openIt(){
        ItemStack pane = new MItemBuilder(Material.BLACK_STAINED_GLASS_PANE).withName("§7").asItemStack();
        ItemStack cluedo = new MItemBuilder(Material.DIAMOND_SWORD).withName("§6 >> Cluedo <<")
                .withLore(Arrays.asList("Cluedo", "§7Mode de jeu inédit")).asItemStack();
        ItemStack soon = new MItemBuilder(Material.BARRIER).withName("§c>> Soon <<")
                .withLore(Arrays.asList("§7Prochainement...")).asItemStack();

        ItemStack player = new MItemBuilder(Material.LEGACY_SKULL)
                .withSkullOwner(playerS.getName()).withName(playerS.getName()).asItemStack();

        MInventory inv = new MInventory(54, "Navigation")
                .fillWithItem(pane, 0, 53)
                .addItem(0, player)
                .addItem(8, player)
                .addItem(20, cluedo)
                .addItem(22, soon)
                .addItem(24, soon)
                .addItem(40, soon);
        /**
         * @Tests: Not final visual | Test
         */
        playerS.openInventory(inv.asInventory());
        playerS.updateInventory();
        return inv;
    }

}
