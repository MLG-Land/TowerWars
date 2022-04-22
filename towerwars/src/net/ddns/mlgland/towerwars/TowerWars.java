package net.ddns.mlgland.towerwars;

import net.ddns.mlgland.towerwars.events.Events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class TowerWars extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);



        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[TowerWars] Plugin is now enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[TowerWars] Plugin is now disabled");
    }

}
