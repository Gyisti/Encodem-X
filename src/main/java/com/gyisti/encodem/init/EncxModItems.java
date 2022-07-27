
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

import com.gyisti.encodem.item.SpotetWaterItem;
import com.gyisti.encodem.item.SpotetItem;
import com.gyisti.encodem.item.RobuxItem;
import com.gyisti.encodem.item.FunFaceItem;
import com.gyisti.encodem.item.E4o4musicItem;
import com.gyisti.encodem.EncxMod;

public class EncxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EncxMod.MODID);
	public static final RegistryObject<Item> ROBUX = REGISTRY.register("robux", () -> new RobuxItem());
	public static final RegistryObject<Item> ROBUX_ORE = block(EncxModBlocks.ROBUX_ORE, EncxModTabs.TAB_ROBLOX_ELEMENT);
	public static final RegistryObject<Item> ROBLOX_NOOB = REGISTRY.register("roblox_noob_spawn_egg",
			() -> new ForgeSpawnEggItem(EncxModEntities.ROBLOX_NOOB, -3355648, -13421569, new Item.Properties().tab(EncxModTabs.TAB_ROBLOX_ELEMENT)));
	public static final RegistryObject<Item> BACKROOMS_LEVEL_0_WALL_1 = block(EncxModBlocks.BACKROOMS_LEVEL_0_WALL_1,
			EncxModTabs.TAB_BACKROOMS_ELEMENT);
	public static final RegistryObject<Item> BACKROOMS_LEVEL_0_WALL = block(EncxModBlocks.BACKROOMS_LEVEL_0_WALL, EncxModTabs.TAB_BACKROOMS_ELEMENT);
	public static final RegistryObject<Item> CHAIR = block(EncxModBlocks.CHAIR, EncxModTabs.TAB_BACKROOMS_ELEMENT);
	public static final RegistryObject<Item> PARTYGOERS = REGISTRY.register("partygoers_spawn_egg",
			() -> new ForgeSpawnEggItem(EncxModEntities.PARTYGOERS, -3355648, -6711040,
					new Item.Properties().tab(EncxModTabs.TAB_BACKROOMS_ELEMENT)));
	public static final RegistryObject<Item> PARTYPOOPER = REGISTRY.register("partypooper_spawn_egg",
			() -> new ForgeSpawnEggItem(EncxModEntities.PARTYPOOPER, -13395457, -16751002,
					new Item.Properties().tab(EncxModTabs.TAB_BACKROOMS_ELEMENT)));
	public static final RegistryObject<Item> FUN_CHAIR = block(EncxModBlocks.FUN_CHAIR, EncxModTabs.TAB_LEVEL_FUN_ELEMENTS);
	public static final RegistryObject<Item> FUN_TABLE = block(EncxModBlocks.FUN_TABLE, EncxModTabs.TAB_LEVEL_FUN_ELEMENTS);
	public static final RegistryObject<Item> LEVEL_FUN_WALL_1 = block(EncxModBlocks.LEVEL_FUN_WALL_1, EncxModTabs.TAB_LEVEL_FUN_ELEMENTS);
	public static final RegistryObject<Item> CHAIR_REPLACE = block(EncxModBlocks.CHAIR_REPLACE, EncxModTabs.TAB_DEVELOPMENT_ELEMENTS);
	public static final RegistryObject<Item> SERVER = block(EncxModBlocks.SERVER, EncxModTabs.TAB_ENCODEM_X);
	public static final RegistryObject<Item> SPOTET_GRASS_BLOCK = block(EncxModBlocks.SPOTET_GRASS_BLOCK, EncxModTabs.TAB_ENCODEM_X);
	public static final RegistryObject<Item> SPOTET_WATER_BUCKET = REGISTRY.register("spotet_water_bucket", () -> new SpotetWaterItem());
	public static final RegistryObject<Item> SPOTET = REGISTRY.register("spotet", () -> new SpotetItem());
	public static final RegistryObject<Item> SPOTET_STONE = block(EncxModBlocks.SPOTET_STONE, EncxModTabs.TAB_ENCODEM_X);
	public static final RegistryObject<Item> E_4O_4MUSIC = REGISTRY.register("e_4o_4music", () -> new E4o4musicItem());
	public static final RegistryObject<Item> FUN_FACE = REGISTRY.register("fun_face", () -> new FunFaceItem());
	public static final RegistryObject<Item> BACKROOMS_LEVEL_0_FLOOR = block(EncxModBlocks.BACKROOMS_LEVEL_0_FLOOR,
			EncxModTabs.TAB_BACKROOMS_ELEMENT);
	public static final RegistryObject<Item> BACKROOMS_LEVEL_0_LIGHT = block(EncxModBlocks.BACKROOMS_LEVEL_0_LIGHT,
			EncxModTabs.TAB_BACKROOMS_ELEMENT);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
