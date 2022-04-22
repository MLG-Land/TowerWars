package net.ddns.mlgland.towerwars;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class TowerWars extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[TowerWars] Plugin is now enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[TowerWars] Plugin is now disabled");
    }

}
