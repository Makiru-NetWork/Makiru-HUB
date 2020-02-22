package net.makiru.spigot.events;

import net.makiru.api.account.AccountManager;
import net.makiru.api.exceptions.AccountNotFoundException;
import net.makiru.api.exceptions.RedisDownException;
import net.makiru.api.exceptions.RedisException;
import net.makiru.api.logger.MKLogger;
import net.makiru.commons.Account;
import net.makiru.commons.tools.Languages;
import net.makiru.spigot.core.MakiruHub;
import net.makiru.spigot.lang.L;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoinEvent implements Listener {

    private final MKLogger logger = MakiruHub.getFactory().getLogger(this.getClass().getPackage() + "." + this.getClass().getName());

    @EventHandler
    public void onEvent(PlayerJoinEvent e) {
        try {
            Account account = new AccountManager.Provider().get(e.getPlayer().getUniqueId());
            e.getPlayer().setDisplayName(account.getRanks().getPrefix() + e.getPlayer().getName());
            e.setJoinMessage(e.getPlayer().getDisplayName());
        } catch (AccountNotFoundException ex) {
            this.logger.error("onEvent(onPlayerJoinEvent)", ex);
            e.getPlayer().sendMessage("\n" + MakiruHub.PREFIX + L.ACCOUNT_NOT_FOUND_EXCEPTION.get(Languages.FRENCH).replace("{name}", e.getPlayer().getName()));
        } catch (RedisException | RedisDownException ex) {
            this.logger.error("onEvent(onPlayerJoinEvent)", ex);
            e.getPlayer().sendMessage("\n" + MakiruHub.PREFIX + L.REDIS_EXCEPTION.get(Languages.FRENCH));
        }
    }
}
