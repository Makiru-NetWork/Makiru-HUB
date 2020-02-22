package net.makiru.api.builders;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Copyright © LEVASSEUR Wesley
 *
 * @author LEVASSEUR Wesley
 */
public class Inventory_B {

    private Inventory inventory;
    private Player player;

    public Inventory_B(Player owner, @NotNull InventoryType type) {
        this((InventoryHolder) owner, type);
        this.player = owner;
    }

    public Inventory_B(Player owner, int size) {
        this((InventoryHolder) owner, size);
        this.player = owner;
    }

    public Inventory_B(Player owner, @NotNull InventoryType type, @NotNull String title) {
        this((InventoryHolder) owner, type, title);
        this.player = owner;
    }

    public Inventory_B(Player owner, int size, @NotNull String title) {
        this((InventoryHolder) owner, size, title);
        this.player = owner;
    }

    public Inventory_B(@Nullable InventoryHolder owner, @NotNull InventoryType type) {
        this.inventory = Bukkit.createInventory(owner, type);
    }

    public Inventory_B(@Nullable InventoryHolder owner, @NotNull InventoryType type, @NotNull String title) {
        this.inventory = Bukkit.createInventory(owner, type, title);
    }

    public Inventory_B(@Nullable InventoryHolder owner, int size) {
        this.inventory = Bukkit.createInventory(owner, size);
    }

    public Inventory_B(@Nullable InventoryHolder owner, int size, @NotNull String title) {
        this.inventory = Bukkit.createInventory(owner, size);
    }

    public Inventory_B a() {
        this.inventory

        return this;
    }

    public Inventory_B a() {


        return this;
    }

    public Inventory_B a() {


        return this;
    }

    public Inventory_B a() {


        return this;
    }

    public Inventory_B a() {


        return this;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public Player getPlayer() {
        return this.player;
    }
}
