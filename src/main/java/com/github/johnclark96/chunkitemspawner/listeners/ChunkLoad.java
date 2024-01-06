package com.github.johnclark96.chunkitemspawner.listeners;

import com.github.johnclark96.chunkitemspawner.ChunkItemSpawner;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

import java.util.Random;

import static com.github.johnclark96.chunkitemspawner.items.Item.createDiamond;

public class ChunkLoad implements Listener {

    private Random random = new Random();

    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event) {
        if(event.isNewChunk()) {

            if(random.nextDouble() < 0.3) {
                spawnDiamond(event.getChunk().getX(), event.getChunk().getZ(), event.getWorld());
            }
        }
    }

    private void spawnDiamond(int chunkX, int chunkZ, World world) {
        int x = chunkX * 16 + random.nextInt(16);
        int z = chunkZ * 16 + random.nextInt(16);

        int y = world.getHighestBlockYAt(x, z);

        Location spawnLocation = world.getHighestBlockAt(x, z).getLocation().add(0, 1, 0);
        Item droppedItem = world.dropItemNaturally(spawnLocation, createDiamond());

        Bukkit.getScheduler().scheduleSyncDelayedTask(ChunkItemSpawner.getPlugin(), () -> {
            Bukkit.getLogger().info("Diamond Despawned");
            droppedItem.remove();
        }, 1200);

        Bukkit.getLogger().info("Spawned item at :" +
                "X: " + spawnLocation.getX() +
                " Y: " + spawnLocation.getY() +
                " Z: " + spawnLocation.getZ());
    }
}
