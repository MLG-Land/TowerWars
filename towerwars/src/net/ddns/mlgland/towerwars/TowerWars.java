package net.ddns.mlgland.towerwars;

import net.ddns.mlgland.towerwars.commands.CommandHandler;
import net.ddns.mlgland.towerwars.events.PlayerEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class TowerWars extends JavaPlugin {

    @Override
    public void onEnable() {
        CommandHandler cmdh = new CommandHandler();

        getServer().getConsoleSender().sendMessage("Registering events...");
        getServer().getPluginManager().registerEvents(new PlayerEvents(), this);
        getServer().getConsoleSender().sendMessage("Registered event 1/1");

        getServer().getConsoleSender().sendMessage("Registering commands...");
        getCommand("heal").setExecutor(cmdh);
        getServer().getConsoleSender().sendMessage("Registered command 1/1");

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[TowerWars] Plugin is now enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[TowerWars] Plugin is now disabled");
    }

}
