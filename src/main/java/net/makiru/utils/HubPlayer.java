package net.makiru.utils;

import net.makiru.api.MItemBuilder;
import net.makiru.utils.locations.Locations;
import org.bukkit.DyeColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HubPlayer {

    private Player player;

    public HubPlayer(Player player){
        this.player = player;
    }

    public void setupLobbyPlayer(){
        player.setGameMode(GameMode.ADVENTURE); player.setHealth(20); player.setLevel(0); player.setFoodLevel(20); player.getInventory().clear();
        teleport(Locations.SPAWN);

        player.sendMessage("Bienvenue... Blabla message utile pour lui ");
        ItemStack toAdd = new MItemBuilder(Material.COMPASS).withName("Navigation").unbreakable().asItemStack();
        player.getInventory().setItem(0, toAdd);
        toAdd = new MItemBuilder(Material.WHITE_DYE).withDye(DyeColor.GREEN).withName("Cacher les joueurs").asItemStack();
        player.getInventory().setItem(4, toAdd);
        toAdd = new MItemBuilder(Material.ENDER_CHEST).withName("Cosmetics").asItemStack();
        player.getInventory().setItem(8, toAdd);

        player.updateInventory();
    }

    public void setupJumpPlayer(){

    }

    public void setupEventPlayer(){

    }

    private void teleport(Locations locations){
        player.teleport(locations.toLocation());
    }
}
