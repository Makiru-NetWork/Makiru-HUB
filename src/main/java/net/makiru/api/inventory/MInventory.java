package net.makiru.api.inventory;

import net.makiru.api.MItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class MInventory {

    private Inventory inventory;
    private Player player;

    public MInventory(int size){
        this(size, "");
    }

    public MInventory(int size, String title){
        this.inventory = Bukkit.createInventory(null, size, title);
    }

    public MInventory(InventoryType inventoryType, String title){
        this.inventory = Bukkit.createInventory(null, inventoryType, title);
    }

    public MInventory(Player player){
        this.player = player;
        this.inventory = player.getInventory();
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

    public MInventory fillWithItem(ItemStack itemStack, int start, int stop){
        if(this.inventory != null) {
            for(int i = start; i < stop; i++){
                inventory.setItem(i, itemStack);
            }
            return this;
        }
        return this;
    }

    public MInventory removeAll(ItemStack itemStack){
        if(this.inventory != null){
            while(this.inventory.contains(itemStack)){
                this.inventory.remove(itemStack);
            }
            return this;
        }
        return this;
    }

    public Inventory asInventory() {
        return this.inventory;
    }

    public Player getPlayer() {
        if(player != null || player.isOnline()) {
            return player;
        }
        return Bukkit.getOnlinePlayers().iterator().next();
    }
}
