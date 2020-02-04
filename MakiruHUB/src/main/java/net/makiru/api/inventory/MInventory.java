package net.makiru.api.inventory;

import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class MInventory {

    private Inventory inventory;

    public MInventory(int size){
        this(size, "");
    }

    public MInventory(int size, String title){
        this.inventory = Bukkit.createInventory(null, size, title);
    }

    public MInventory(InventoryType inventoryType, String title){
        this.inventory = Bukkit.createInventory(null, inventoryType, title);
    }

    public MInventory setContents(ItemStack... content){
        inventory.setContents(content);
        return this;
    }
}
