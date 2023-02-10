package fr.plhume.proxymanager.listeners;

import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class ConnectListener implements Listener {

    @EventHandler
    public void onConnect(ServerConnectEvent event) {
        ProxiedPlayer player = event.getPlayer();

        if (player.getPing() > 500) {
            event.setCancelled(true);
            player.sendMessage(new TextComponent("§cVous avez un ping trop élevé pour vous connecter au serveur !"));
        }
    }
}
