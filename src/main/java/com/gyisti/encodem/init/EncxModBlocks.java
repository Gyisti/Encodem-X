
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.gyisti.encodem.block.RobuxOreBlock;
import com.gyisti.encodem.EncxMod;

public class EncxModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EncxMod.MODID);
	public static final RegistryObject<Block> ROBUX_ORE = REGISTRY.register("robux_ore", () -> new RobuxOreBlock());
}
