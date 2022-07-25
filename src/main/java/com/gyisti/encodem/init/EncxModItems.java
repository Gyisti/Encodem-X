
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.gyisti.encodem.item.RobuxItem;
import com.gyisti.encodem.EncxMod;

public class EncxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EncxMod.MODID);
	public static final RegistryObject<Item> ROBLOX_NOOB = REGISTRY.register("roblox_noob_spawn_egg",
			() -> new ForgeSpawnEggItem(EncxModEntities.ROBLOX_NOOB, -3355648, -13421569, new Item.Properties().tab(EncxModTabs.TAB_ROBLOX_ELEMENT)));
	public static final RegistryObject<Item> ROBUX = REGISTRY.register("robux", () -> new RobuxItem());
	public static final RegistryObject<Item> ROBUX_ORE = block(EncxModBlocks.ROBUX_ORE, EncxModTabs.TAB_ROBLOX_ELEMENT);
	public static final RegistryObject<Item> PARTYGOERS = REGISTRY.register("partygoers_spawn_egg",
			() -> new ForgeSpawnEggItem(EncxModEntities.PARTYGOERS, -3355648, -6711040,
					new Item.Properties().tab(EncxModTabs.TAB_BACKROOMS_ELEMENT)));
	public static final RegistryObject<Item> PARTYPOOPER = REGISTRY.register("partypooper_spawn_egg",
			() -> new ForgeSpawnEggItem(EncxModEntities.PARTYPOOPER, -13395457, -16751002,
					new Item.Properties().tab(EncxModTabs.TAB_BACKROOMS_ELEMENT)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
