
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import com.gyisti.encodem.fluid.SpotetWaterFluid;
import com.gyisti.encodem.EncxMod;

public class EncxModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, EncxMod.MODID);
	public static final RegistryObject<Fluid> SPOTET_WATER = REGISTRY.register("spotet_water", () -> new SpotetWaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SPOTET_WATER = REGISTRY.register("flowing_spotet_water", () -> new SpotetWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SPOTET_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SPOTET_WATER.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
