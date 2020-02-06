package net.makiru.api.inventory;

import net.makiru.api.MItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
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

    public MInventory(int size, String title, ItemStack... contents){
        this(size, title);
        this.setContents(contents);
    }

    public MInventory(InventoryType inventoryType, String title, ItemStack... contents){
        this(inventoryType, title);
        this.setContents(contents);
    }

    public MInventory setContents(ItemStack... content){
        if(this.inventory != null)
            this.inventory.setContents(content);
        return this;
    }

    public MInventory addItem(int slot, ItemStack itemStack){
        if(this.inventory != null)
            this.inventory.setItem(slot, itemStack);
        return this;
    }
    public MInventory addItem(int slot, Material material){
        if(this.inventory != null)
            this.inventory.setItem(slot, new ItemStack(material));
        return this;
    }
    public MInventory addItem(int slot, MItemBuilder builder){
        if(this.inventory != null)
            this.inventory.setItem(slot, builder.asItemStack());
        return this;
    }
    public MInventory clear(){
        if(this.inventory != null)
            this.inventory.clear();
        return this;
    }
    public MInventory removeItem(ItemStack itemStack){
        if(this.inventory != null)
            this.inventory.remove(itemStack);
        return this;
    }
    public MInventory removeItem(Material material){
        if(this.inventory != null)
            this.inventory.remove(material);
        return this;
    }

    public Inventory asInventory() {
        return this.inventory;
    }
}
