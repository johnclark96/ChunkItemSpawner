package com.github.johnclark96.chunkitemspawner;

import com.github.johnclark96.chunkitemspawner.items.Item;
import com.github.johnclark96.chunkitemspawner.listeners.ChunkLoad;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChunkItemSpawner extends JavaPlugin {

    private static ChunkItemSpawner plugin;

    @Override
    public void onEnable() {
        plugin = this;
        this.saveDefaultConfig();
        Item.initializeKeys(this);
        getServer().getPluginManager().registerEvents(new ChunkLoad(this), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "PLUGIN LOADED");

        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "PLUGIN UNLOADED");
    }

    public static ChunkItemSpawner getPlugin() {
        return plugin;
    }
}
