### Create a Spigot Plugin that meets the following requirements

* When a chunk is loaded for the first time, have a random chance (30% chance) of doing the following:
    * Spawn an item drop of a diamond at a random location within the chunk (but on the surface).
    * The spawned item should have colorful custom display name, multi-line lore, and glowing without an enchantment showing.
    * Using `Log Level Info`, log the world name, coordinates and item type spawned.
* All items spawned should despawn after 60 seconds.
* There should be a config.yml setting to allow adjustment of the 30% chance from the first requirement.
* Consider what can be async, and what cannot be async. You can get extra points for using CompletableFutures correctly. 

## TODO

 *[x] ~~Get new chunk~~
 *[ ] Spawn a Diamond on new Chunk loaded at ground level
 *[ ] Add Item DisplayName and Lore (Colorful)
 *[ ] `Log Level Info` Store World Name, Coordinates, and Item Type Spawned
 *[ ] Despawn items after 60 seconds
 *[ ] Create a config for Percentage Chance (0 - 1)
 *[ ] Use Async where appropriate
 
 *[ ] EXTRA CREDIT: USE COMPLETABLE FUTURES CORRECTLY