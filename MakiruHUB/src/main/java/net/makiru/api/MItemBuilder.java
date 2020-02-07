package net.makiru.api;

import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;
import java.util.List;

public class MItemBuilder {


    /**
     * ItemStack iS = new MItemBuilder(Material.DOOR).withName("").withLore({"",""})
     * .withAmount(5).withEnchant(Enchantement.SHARPNESS, 5).asItemStack();
     */

    private ItemStack is;

    public MItemBuilder(Material m)
    {
        this(m, 1);
    }

    public MItemBuilder(ItemStack is)
    {
        this.is = is;
    }

    public MItemBuilder(Material m, int amount)
    {
        this.is = new ItemStack(m, amount);
    }

    public MItemBuilder(Material m, int amount, byte durability)
    {
        this.is = new ItemStack(m, amount, durability);
    }

    public MItemBuilder(Material m, int amount, short durability)
    {
        this.is = new ItemStack(m, amount, durability);
    }

    public MItemBuilder clone()
    {
        return new MItemBuilder(this.is);
    }

    public MItemBuilder setDurability(short dur)
    {
        this.is.setDurability(dur);
        return this;
    }

    public MItemBuilder withName(String name)
    {
        ItemMeta im = this.is.getItemMeta();
        im.setDisplayName(name);
        this.is.setItemMeta(im);
        return this;
    }

    public MItemBuilder withUnsafeEnchantement(Enchantment ench, int level)
    {
        this.is.addUnsafeEnchantment(ench, level);
        return this;
    }

    public MItemBuilder removeEnchantment(Enchantment ench)
    {
        this.is.removeEnchantment(ench);
        return this;
    }

    public MItemBuilder withSkullOwner(String owner)
    {
        try
        {
            this.is.setDurability((short)3);
            SkullMeta im = (SkullMeta)this.is.getItemMeta();
            im.setOwner(owner);
            this.is.setItemMeta(im);
        }
        catch (ClassCastException localClassCastException) {}
        return this;
    }

    public MItemBuilder withEnchant(Enchantment ench, int level)
    {
        ItemMeta im = this.is.getItemMeta();
        im.addEnchant(ench, level, true);
        this.is.setItemMeta(im);
        return this;
    }

    public MItemBuilder unbreakable()
    {
        ItemMeta im = this.is.getItemMeta();
        im.spigot().setUnbreakable(true);
        this.is.setItemMeta(im);
        return this;
    }

    public MItemBuilder withLore(String... lore)
    {
        ItemMeta im = this.is.getItemMeta();
        im.setLore(Arrays.asList(lore));
        this.is.setItemMeta(im);
        return this;
    }

    public MItemBuilder withLore(List<String> strings){
        ItemMeta im = this.is.getItemMeta();
        im.setLore(strings);
        this.is.setItemMeta(im);
        return this;
    }

    public MItemBuilder withDye(DyeColor color)
    {
        this.is.setDurability(color.getDyeData());
        return this;
    }

    @Deprecated
    public MItemBuilder withWoolColor(DyeColor color)
    {
        if (!this.is.getType().equals(Material.WHITE_WOOL)) {
            return this;
        }
        this.is.setDurability(color.getDyeData());
        return this;
    }

    public MItemBuilder withArmorColor(Color color)
    {
        try
        {
            LeatherArmorMeta im = (LeatherArmorMeta)this.is.getItemMeta();
            im.setColor(color);
            this.is.setItemMeta(im);
        }
        catch (ClassCastException localClassCastException) {}
        return this;
    }

    public ItemStack asItemStack()
    {
        return this.is;
    }


}
