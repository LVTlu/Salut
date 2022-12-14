
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.salutatouscestdemoncraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.salutatouscestdemoncraft.item.GrassItem;
import net.mcreator.salutatouscestdemoncraft.SalutATousCestDemoncraftMod;

public class SalutATousCestDemoncraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SalutATousCestDemoncraftMod.MODID);
	public static final RegistryObject<Item> GRASS_HELMET = REGISTRY.register("grass_helmet", () -> new GrassItem.Helmet());
	public static final RegistryObject<Item> GRASS_CHESTPLATE = REGISTRY.register("grass_chestplate", () -> new GrassItem.Chestplate());
	public static final RegistryObject<Item> GRASS_LEGGINGS = REGISTRY.register("grass_leggings", () -> new GrassItem.Leggings());
	public static final RegistryObject<Item> GRASS_BOOTS = REGISTRY.register("grass_boots", () -> new GrassItem.Boots());
}
