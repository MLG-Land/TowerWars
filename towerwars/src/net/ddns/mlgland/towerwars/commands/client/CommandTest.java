package net.ddns.mlgland.towerwars.commands.client;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class CommandTest {
    public static void bind(Player player, Command command, String label, String[] args) {
        if (player.hasPermission("towerwars.commands.basic.test")) {
            player.sendMessage(ChatColor.GREEN + "Plugin is working all fine!");
        } else {
            player.sendMessage(ChatColor.DARK_RED + "You do not have permission to execute this command!");
        }
    }
}
