package com.github.johnclark96.chunkitemspawner.commands;

import com.github.johnclark96.chunkitemspawner.items.Item;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Only a player may use this command.");
            return true;
        }

        Player player = (Player) sender;

        player.getInventory().addItem(Item.createWand());
        player.sendMessage("You were given a wand. Be careful with this.");
        return true;
    }
}
