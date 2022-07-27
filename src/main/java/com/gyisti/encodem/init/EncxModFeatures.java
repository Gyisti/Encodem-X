
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import com.gyisti.encodem.world.features.ores.SpotetStoneFeature;
import com.gyisti.encodem.world.features.ores.SpotetGrassBlockFeature;
import com.gyisti.encodem.world.features.ores.RobuxOreFeature;
import com.gyisti.encodem.world.features.ores.BackroomsLevel0WallFeature;
import com.gyisti.encodem.world.features.ores.BackroomsLevel0LightFeature;
import com.gyisti.encodem.world.features.ores.BackroomsLevel0FloorFeature;
import com.gyisti.encodem.world.features.lakes.SpotetWaterFeature;
import com.gyisti.encodem.world.features.RuinsOfPattiamFeature;
import com.gyisti.encodem.world.features.PartypoopershopFeature;
import com.gyisti.encodem.EncxMod;

@Mod.EventBusSubscriber
public class EncxModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EncxMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ROBUX_ORE = register("robux_ore", RobuxOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RobuxOreFeature.GENERATE_BIOMES, RobuxOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BACKROOMS_LEVEL_0_WALL = register("backrooms_level_0_wall", BackroomsLevel0WallFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BackroomsLevel0WallFeature.GENERATE_BIOMES,
					BackroomsLevel0WallFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SPOTET_GRASS_BLOCK = register("spotet_grass_block", SpotetGrassBlockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SpotetGrassBlockFeature.GENERATE_BIOMES,
					SpotetGrassBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SPOTET_WATER = register("spotet_water", SpotetWaterFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, SpotetWaterFeature.GENERATE_BIOMES, SpotetWaterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SPOTET_STONE = register("spotet_stone", SpotetStoneFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, SpotetStoneFeature.GENERATE_BIOMES, SpotetStoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PARTYPOOPERSHOP = register("partypoopershop", PartypoopershopFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PartypoopershopFeature.GENERATE_BIOMES,
					PartypoopershopFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUINS_OF_PATTIAM = register("ruins_of_pattiam", RuinsOfPattiamFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, RuinsOfPattiamFeature.GENERATE_BIOMES,
					RuinsOfPattiamFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BACKROOMS_LEVEL_0_FLOOR = register("backrooms_level_0_floor", BackroomsLevel0FloorFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BackroomsLevel0FloorFeature.GENERATE_BIOMES,
					BackroomsLevel0FloorFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BACKROOMS_LEVEL_0_LIGHT = register("backrooms_level_0_light", BackroomsLevel0LightFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BackroomsLevel0LightFeature.GENERATE_BIOMES,
					BackroomsLevel0LightFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
