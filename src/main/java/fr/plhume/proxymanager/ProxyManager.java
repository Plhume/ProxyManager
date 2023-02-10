package fr.plhume.proxymanager;

import net.md_5.bungee.api.plugin.Plugin;

public final class ProxyManager extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getLogger().info("ProxyManager is now enabled !");
    }

    @Override
    public void onDisable() {
        getProxy().getLogger().info("ProxyManager is now disabled !");
    }
}
