package net.makiru.tools;

import net.makiru.spigot.builders.ItemStack_B;
import net.makiru.tools.locations.Locations;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SetupPlayer {

    public static class JoinEvent {

        private final Player player;

        JoinEvent(Player player) {
            this.player = player;
            this.player.setGameMode(GameMode.ADVENTURE);
            this.player.setHealth(20);
            this.player.setLevel(0);
            this.player.setFoodLevel(20);
            this.player.getInventory().clear();
            this.player.teleport(Locations.SPAWN.toLocation());
            //Peut-être plus tard, une implémentation d'un message utile.
            //  this.player.sendMessage("Bienvenue... Blabla message utile pour lui ");
            //
            //TODO: METTRE LES TEXT DANS LE FICHIER DE LANGUE
            this.player.getInventory().setItem(0, new ItemStack_B(Material.COMPASS).setDisplayName(ChatColor.YELLOW + "Navigation")
                    .addLoreLine("Navigue, prends plaisir et amuse-toi sur le serveur en t'aidant de cette bousole.").toItemStack());


            toAdd = new MItemBuilder(Material.WHITE_DYE).withDye(DyeColor.GREEN).withName("Cacher les joueurs").asItemStack();
            this.player.getInventory().setItem(4, );
            toAdd = new MItemBuilder(Material.ENDER_CHEST).withName("Cosmetics").asItemStack();
            player.getInventory().setItem(8, toAdd);
            player.updateInventory();
        }

        public Player getPlayer() {
            return player;
        }
    }

}
