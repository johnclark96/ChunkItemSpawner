package com.github.johnclark96.chunkitemspawner;

import com.github.johnclark96.chunkitemspawner.listeners.ChunkLoad;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChunkItemSpawner extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChunkLoad(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "PLUGIN LOADED");

        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "PLUGIN UNLOADED");
    }
}
