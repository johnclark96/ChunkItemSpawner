package com.github.johnclark96.chunkitemspawner.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.world.ChunkLoadEvent;

public class ChunkLoad implements Listener {

    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event) {
        if(event.isNewChunk()) {
            for(Player player : Bukkit.getServer().getOnlinePlayers()) {
                player.sendMessage(ChatColor.LIGHT_PURPLE + "[Chunk Loaded] at " + event.getChunk().getX() + ", " + event.getChunk().getZ());
            }
        }
    }
}
