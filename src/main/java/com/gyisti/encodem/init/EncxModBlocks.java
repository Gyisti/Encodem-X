
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
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.gyisti.encodem.block.ServerBlock;
import com.gyisti.encodem.block.RobuxOreBlock;
import com.gyisti.encodem.block.LevelFunWall1Block;
import com.gyisti.encodem.block.FunTableBlock;
import com.gyisti.encodem.block.FunChairBlock;
import com.gyisti.encodem.block.ChairReplaceBlock;
import com.gyisti.encodem.block.ChairBlock;
import com.gyisti.encodem.EncxMod;

public class EncxModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EncxMod.MODID);
	public static final RegistryObject<Block> ROBUX_ORE = REGISTRY.register("robux_ore", () -> new RobuxOreBlock());
	public static final RegistryObject<Block> CHAIR = REGISTRY.register("chair", () -> new ChairBlock());
	public static final RegistryObject<Block> FUN_CHAIR = REGISTRY.register("fun_chair", () -> new FunChairBlock());
	public static final RegistryObject<Block> FUN_TABLE = REGISTRY.register("fun_table", () -> new FunTableBlock());
	public static final RegistryObject<Block> LEVEL_FUN_WALL_1 = REGISTRY.register("level_fun_wall_1", () -> new LevelFunWall1Block());
	public static final RegistryObject<Block> CHAIR_REPLACE = REGISTRY.register("chair_replace", () -> new ChairReplaceBlock());
	public static final RegistryObject<Block> SERVER = REGISTRY.register("server", () -> new ServerBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ChairBlock.registerRenderLayer();
			FunChairBlock.registerRenderLayer();
			FunTableBlock.registerRenderLayer();
			ChairReplaceBlock.registerRenderLayer();
			ServerBlock.registerRenderLayer();
		}
	}
}
