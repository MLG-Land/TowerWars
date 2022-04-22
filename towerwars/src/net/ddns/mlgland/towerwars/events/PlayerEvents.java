package net.ddns.mlgland.towerwars.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerEvents implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.BLUE + "Welcome to TowerWars!");
        player.sendMessage(ChatColor.GRAY + "To join a game, open the compass.");
        player.sendMessage(ChatColor.GRAY + "To see how to play, open the book.");
    }

    @EventHandler
    public static void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        int bx = player.getLocation().getBlockX();
        int by = player.getLocation().getBlockY() - 1;
        int bz = player.getLocation().getBlockZ();

        Material mat = player.getWorld().getBlockAt(bx, by, bz).getType();
        if (mat == Material.STONE) {
            player.sendMessage(ChatColor.LIGHT_PURPLE + "You are standing on stone!");
        }
    }

}
