
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.gyisti.encodem.entity.RobloxNoobEntity;
import com.gyisti.encodem.entity.PartypooperEntity;
import com.gyisti.encodem.entity.PartygoersEntity;
import com.gyisti.encodem.EncxMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EncxModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, EncxMod.MODID);
	public static final RegistryObject<EntityType<RobloxNoobEntity>> ROBLOX_NOOB = register("roblox_noob",
			EntityType.Builder.<RobloxNoobEntity>of(RobloxNoobEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RobloxNoobEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PartygoersEntity>> PARTYGOERS = register("partygoers",
			EntityType.Builder.<PartygoersEntity>of(PartygoersEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PartygoersEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PartypooperEntity>> PARTYPOOPER = register("partypooper",
			EntityType.Builder.<PartypooperEntity>of(PartypooperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PartypooperEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RobloxNoobEntity.init();
			PartygoersEntity.init();
			PartypooperEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ROBLOX_NOOB.get(), RobloxNoobEntity.createAttributes().build());
		event.put(PARTYGOERS.get(), PartygoersEntity.createAttributes().build());
		event.put(PARTYPOOPER.get(), PartypooperEntity.createAttributes().build());
	}
}
