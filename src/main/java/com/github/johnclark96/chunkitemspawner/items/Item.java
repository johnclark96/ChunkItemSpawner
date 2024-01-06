package com.github.johnclark96.chunkitemspawner.items;

import com.github.johnclark96.chunkitemspawner.ChunkItemSpawner;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public class Item {

    public static NamespacedKey wandOneKey;
    public static NamespacedKey diamondOneKey;

    public static ItemStack createWand() {
        ItemStack wandOne = new ItemStack(Material.STICK, 1);

        ItemMeta meta = wandOne.getItemMeta();
        if(meta != null) {
            meta.setDisplayName("Wand of Potato Powers");

            List<String> lore = new ArrayList<>();
            lore.add("A legendary wand made of potatoes");
            lore.add("This potato has magical powers that may be dangerous to yourself and others.");
            meta.setLore(lore);

            meta.addEnchant(Enchantment.KNOCKBACK, 1, true);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

            PersistentDataContainer data = meta.getPersistentDataContainer();

            data.set(wandOneKey, PersistentDataType.STRING, "wand_one");

            wandOne.setItemMeta(meta);
        }
        return wandOne;
    }

    public static ItemStack createDiamond() {
        ItemStack diamondOne = new ItemStack(Material.DIAMOND, 1);

        ItemMeta meta = diamondOne.getItemMeta();
        if(meta != null) {
            meta.setDisplayName("§6§lDiamond §rof §ePotato");

            List<String> lore = new ArrayList<>();
            lore.add("§5Some other Lore here");
            lore.add("§3Another line of Lore");
            lore.add("§2And another one!!");

            meta.setLore(lore);

            meta.addEnchant(Enchantment.LUCK, 1, true);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

            PersistentDataContainer data = meta.getPersistentDataContainer();
            data.set(diamondOneKey, PersistentDataType.STRING, "diamond_one");

            diamondOne.setItemMeta(meta);
        }

        return diamondOne;
    }

    public static void initializeKeys(ChunkItemSpawner plugin) {
        wandOneKey = new NamespacedKey(plugin, "wand_one_key");
        diamondOneKey = new NamespacedKey(plugin, "diamond_one_key");
    }
}
