package net.makiru.api.builders;

import com.google.common.collect.Multimap;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.material.MaterialData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * Copyright © LEVASSEUR Wesley
 *
 * @author LEVASSEUR Wesley
 */
public class ItemStack_B {
    private ItemStack itemStack;

    public ItemStack_B(@NotNull ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack_B(@NotNull Material type) {
        this(type, 1);
    }

    public ItemStack_B(@NotNull Material type, int amount) {
        this(type, amount, (short) 0);
    }

    public ItemStack_B(@NotNull Material type, int amount, short damage) {
        this(type, amount, damage, null);
    }

    @SuppressWarnings("deprecation")
    public ItemStack_B(@NotNull Material type, int amount, short damage, Byte data) {
        this.itemStack = new ItemStack(type, amount, damage, data);
    }

    //TODO: ItemStack
    public ItemStack_B setType(Material type) {
        this.itemStack.setType(type);
        return this;
    }

    public ItemStack_B setAmount(int amount) {
        this.itemStack.setAmount(amount);
        return this;
    }

    @SuppressWarnings("deprecation")
    public ItemStack_B setData(MaterialData materialData) {
        this.itemStack.setData(materialData);
        return this;
    }

    @SuppressWarnings("deprecation")
    public ItemStack_B setDurability(short dur) {
        this.itemStack.setDurability(dur);
        return this;
    }

    @SuppressWarnings("deprecation")
    public ItemStack_B unbreakable() {
        this.itemStack.setDurability(Short.MIN_VALUE);
        return this;
    }

    public ItemStack_B addEnchantments(Map<Enchantment, Integer> enchantments) {
        this.itemStack.addEnchantments(enchantments);
        return this;
    }

    public ItemStack_B addEnchantment(@NotNull Enchantment ench, int level) {
        this.itemStack.addEnchantment(ench, level);
        return this;
    }

    public ItemStack_B addUnsafeEnchantment(Enchantment ench, int level) {
        this.itemStack.addUnsafeEnchantment(ench, level);
        return this;
    }

    public ItemStack_B addUnsafeEnchantments(Map<Enchantment, Integer> enchantments) {
        this.itemStack.addUnsafeEnchantments(enchantments);
        return this;
    }

    public ItemStack_B removeEnchantment(Enchantment ench) {
        this.itemStack.removeEnchantment(ench);
        return this;
    }

    public boolean hasItemMeta() {
        return this.itemStack.hasItemMeta();
    }

    public ItemStack_B setItemMeta(ItemMeta itemMeta) {
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    //TODO: ItemMeta
    public ItemStack_B setDisplayName(String name) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setDisplayName(name);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B setLocalizedName(String name) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setLocalizedName(name);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B setLore(String... lore) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setLore(Arrays.asList(lore));
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B setLore(List<String> lore) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setLore(lore);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B removeLoreLine(String line) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            List<String> lore = new ArrayList<>(Objects.requireNonNull(itemMeta.getLore()));
            if (!lore.contains(line)) {
                return this;
            }
            lore.remove(line);
            itemMeta.setLore(lore);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B removeLoreLine(int index) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            List<String> lore = new ArrayList<>(Objects.requireNonNull(itemMeta.getLore()));
            if ((index < 0) || (index > lore.size())) {
                return this;
            }
            lore.remove(index);
            itemMeta.setLore(lore);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B addLoreLine(String line) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            List<String> lore = new ArrayList<>();
            if (itemMeta.hasLore()) {
                lore = new ArrayList<>(Objects.requireNonNull(itemMeta.getLore()));
            }
            lore.add(line);
            itemMeta.setLore(lore);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B addLoreLine(String line, int pos) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            List<String> lore = new ArrayList<>(Objects.requireNonNull(itemMeta.getLore()));
            lore.set(pos, line);
            itemMeta.setLore(lore);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }


    public ItemStack_B setCustomModelData(Integer integer) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setCustomModelData(integer);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B addEnchant(Enchantment ench, int level) {
        this.addEnchant(ench, level, true);
        return this;
    }

    public ItemStack_B addEnchant(@NotNull Enchantment var1, int var2, boolean var3) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.addEnchant(var1, var2, var3);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B removeEnchant(@NotNull Enchantment var1) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.removeEnchant(var1);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B addItemFlags(@NotNull ItemFlag... var1) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.addItemFlags(var1);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B removeItemFlags(@NotNull ItemFlag... var1) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.removeItemFlags(var1);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B setUnbreakable(boolean var1) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setUnbreakable(var1);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B addAttributeModifier(@NotNull Attribute var1, @NotNull AttributeModifier var2) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.addAttributeModifier(var1, var2);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B setAttributeModifiers(@Nullable Multimap<Attribute, AttributeModifier> var1) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setAttributeModifiers(var1);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B removeAttributeModifier(@NotNull Attribute var1) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.removeAttributeModifier(var1);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B removeAttributeModifier(@NotNull EquipmentSlot var1) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.removeAttributeModifier(var1);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    public ItemStack_B removeAttributeModifier(@NotNull Attribute var1, @NotNull AttributeModifier var2) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.removeAttributeModifier(var1, var2);
            this.itemStack.setItemMeta(itemMeta);
        }
        return this;
    }

    //TODO: SkullMeta
    @SuppressWarnings("deprecation")
    public ItemStack_B setSkullOwner(String owner) {
        SkullMeta skullMeta = (SkullMeta) this.itemStack.getItemMeta();
        if (skullMeta != null) {
            skullMeta.setOwner(owner);
            this.itemStack.setItemMeta(skullMeta);
        }
        return this;
    }

    public ItemStack_B setSkullOwningPlayer(OfflinePlayer owner) {
        SkullMeta skullMeta = (SkullMeta) this.itemStack.getItemMeta();
        if (skullMeta != null) {
            skullMeta.setOwningPlayer(owner);
            this.itemStack.setItemMeta(skullMeta);
        }
        return this;
    }

    //TODO: LeatherAmorMeta
    public ItemStack_B setLeatherArmorColor(Color color) {
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) this.itemStack.getItemMeta();
        if (leatherArmorMeta != null) {
            leatherArmorMeta.setColor(color);
            this.itemStack.setItemMeta(leatherArmorMeta);
        }
        return this;
    }


    //TODO: Other
    @Deprecated
    public ItemStack_B setWoolColor(DyeColor dyeColor) {
        if (!itemStack.getType().name().contains("WOOL")) {
            return this;
        }
        this.itemStack.setDurability(dyeColor.getWoolData());
        return this;
    }

    public ItemStack_B addGlow() {
        this.itemStack.addUnsafeEnchantment(Enchantment.DURABILITY, -1);
        net.minecraft.server.v1_14_R1.ItemStack nstack = org.bukkit.craftbukkit.v1_14_R1.inventory.CraftItemStack.asNMSCopy(itemStack);
        net.minecraft.server.v1_14_R1.NBTTagCompound compound = nstack.getTag();
        if (compound == null) {
            compound = new net.minecraft.server.v1_14_R1.NBTTagCompound();
            nstack.setTag(compound);
            compound = nstack.getTag();
        }
        if (!compound.hasKey("HideFlags")) compound.setInt("HideFlags", 1);
        nstack.setTag(compound);
        this.itemStack = org.bukkit.craftbukkit.v1_14_R1.inventory.CraftItemStack.asCraftMirror(nstack);
        return this;
    }

    public ItemStack_B clone() throws CloneNotSupportedException {
        ItemStack_B clone = (ItemStack_B) super.clone();
        return new ItemStack_B(itemStack);
    }

    public ItemStack toItemStack() {
        return itemStack;
    }
}
