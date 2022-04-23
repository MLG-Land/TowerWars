package net.ddns.mlgland.towerwars.commands;

import net.ddns.mlgland.towerwars.commands.client.CommandTest;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        // checks if the sender is a player
        if (!(sender instanceof Player)) {

        } else {
            Player player = (Player) sender;
            if (args.length >= 1) {
                switch (args[0]) {
                    case "test":
                        CommandTest.bind(player, command, s, args);
                }
            } else {
                player.sendMessage(ChatColor.RED + "Usage: /tw <command> [args]");
            }
        }
        return true;
    }
}
