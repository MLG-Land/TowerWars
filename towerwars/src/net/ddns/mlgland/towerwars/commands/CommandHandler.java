package net.ddns.mlgland.towerwars.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can use this command!");
            return true;
        }

        Player player = (Player) sender;

        if (!(player.hasPermission("towerwars.heal"))) {
            sender.sendMessage(ChatColor.RED + "You do not have permission to run this command!");
        }

        // heal
        if (command.getName().equalsIgnoreCase("heal")) {
            double maxHealth = player.getHealthScale();
            player.setHealth(maxHealth);

            player.setFoodLevel(20);

            player.sendMessage("§eYou have been healed!");
        }

        return true;
    }
}
