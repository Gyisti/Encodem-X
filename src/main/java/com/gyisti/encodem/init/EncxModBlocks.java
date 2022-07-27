
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.gyisti.encodem.block.SpotetWaterBlock;
import com.gyisti.encodem.block.SpotetStoneBlock;
import com.gyisti.encodem.block.SpotetPortalBlock;
import com.gyisti.encodem.block.SpotetGrassBlockBlock;
import com.gyisti.encodem.block.ServerBlock;
import com.gyisti.encodem.block.RobuxOreBlock;
import com.gyisti.encodem.block.LevelFunWall1Block;
import com.gyisti.encodem.block.FunTableBlock;
import com.gyisti.encodem.block.FunChairBlock;
import com.gyisti.encodem.block.ChairReplaceBlock;
import com.gyisti.encodem.block.ChairBlock;
import com.gyisti.encodem.block.BackroomsLevel0WallBlock;
import com.gyisti.encodem.block.BackroomsLevel0Wall1Block;
import com.gyisti.encodem.block.BackroomsLevel0LightBlock;
import com.gyisti.encodem.block.BackroomsLevel0FloorBlock;
import com.gyisti.encodem.EncxMod;

public class EncxModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EncxMod.MODID);
	public static final RegistryObject<Block> ROBUX_ORE = REGISTRY.register("robux_ore", () -> new RobuxOreBlock());
	public static final RegistryObject<Block> BACKROOMS_LEVEL_0_WALL_1 = REGISTRY.register("backrooms_level_0_wall_1",
			() -> new BackroomsLevel0Wall1Block());
	public static final RegistryObject<Block> BACKROOMS_LEVEL_0_WALL = REGISTRY.register("backrooms_level_0_wall",
			() -> new BackroomsLevel0WallBlock());
	public static final RegistryObject<Block> CHAIR = REGISTRY.register("chair", () -> new ChairBlock());
	public static final RegistryObject<Block> FUN_CHAIR = REGISTRY.register("fun_chair", () -> new FunChairBlock());
	public static final RegistryObject<Block> FUN_TABLE = REGISTRY.register("fun_table", () -> new FunTableBlock());
	public static final RegistryObject<Block> LEVEL_FUN_WALL_1 = REGISTRY.register("level_fun_wall_1", () -> new LevelFunWall1Block());
	public static final RegistryObject<Block> CHAIR_REPLACE = REGISTRY.register("chair_replace", () -> new ChairReplaceBlock());
	public static final RegistryObject<Block> SERVER = REGISTRY.register("server", () -> new ServerBlock());
	public static final RegistryObject<Block> SPOTET_GRASS_BLOCK = REGISTRY.register("spotet_grass_block", () -> new SpotetGrassBlockBlock());
	public static final RegistryObject<Block> SPOTET_WATER = REGISTRY.register("spotet_water", () -> new SpotetWaterBlock());
	public static final RegistryObject<Block> SPOTET_PORTAL = REGISTRY.register("spotet_portal", () -> new SpotetPortalBlock());
	public static final RegistryObject<Block> SPOTET_STONE = REGISTRY.register("spotet_stone", () -> new SpotetStoneBlock());
	public static final RegistryObject<Block> BACKROOMS_LEVEL_0_FLOOR = REGISTRY.register("backrooms_level_0_floor",
			() -> new BackroomsLevel0FloorBlock());
	public static final RegistryObject<Block> BACKROOMS_LEVEL_0_LIGHT = REGISTRY.register("backrooms_level_0_light",
			() -> new BackroomsLevel0LightBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BackroomsLevel0Wall1Block.registerRenderLayer();
			BackroomsLevel0WallBlock.registerRenderLayer();
			ChairBlock.registerRenderLayer();
			FunChairBlock.registerRenderLayer();
			FunTableBlock.registerRenderLayer();
			ChairReplaceBlock.registerRenderLayer();
			ServerBlock.registerRenderLayer();
			SpotetGrassBlockBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			BackroomsLevel0Wall1Block.blockColorLoad(event);
			BackroomsLevel0WallBlock.blockColorLoad(event);
			SpotetGrassBlockBlock.blockColorLoad(event);
			BackroomsLevel0FloorBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			BackroomsLevel0WallBlock.itemColorLoad(event);
		}
	}
}
