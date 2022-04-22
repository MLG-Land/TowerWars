package net.ddns.mlgland.towerwars.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.BLUE + "Welcome to TowerWars!");
        player.sendMessage(ChatColor.GRAY + "To join a game, open the compass.");
        player.sendMessage(ChatColor.GRAY + "To see how to play, open the book.");
    }

}
