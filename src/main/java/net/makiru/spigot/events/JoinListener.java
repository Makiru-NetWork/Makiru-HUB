package net.makiru.spigot.events;

import net.makiru.utils.HubPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event){
        event.setJoinMessage(null);
        Player player = event.getPlayer();
        /**
         *
         * if(power > xGrade){
         *      event.setJoinMessage("Grade pseudo a rejoint le hub");
         * }
         *
         */
        new HubPlayer(player).setupLobbyPlayer();
    }
}
