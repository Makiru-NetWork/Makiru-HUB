package net.makiru.tools.inventories;

import net.makiru.api.inventory.MInventory;
import org.bukkit.entity.Player;

public class CosmeticsInventory {

    private Player player;

    public CosmeticsInventory(Player player){
        this.player = player;
    }

    public MInventory openIt(){

        MInventory inv = new MInventory(9*3, "");



        player.openInventory(inv.asInventory());
        player.updateInventory();
        return inv;

    }
}
