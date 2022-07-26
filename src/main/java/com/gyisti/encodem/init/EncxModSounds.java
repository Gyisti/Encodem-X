
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EncxModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("encx", "uuhhh"), new SoundEvent(new ResourceLocation("encx", "uuhhh")));
		REGISTRY.put(new ResourceLocation("encx", "hurt_niib"), new SoundEvent(new ResourceLocation("encx", "hurt_niib")));
		REGISTRY.put(new ResourceLocation("encx", "talk_noob"), new SoundEvent(new ResourceLocation("encx", "talk_noob")));
		REGISTRY.put(new ResourceLocation("encx", "chair_place"), new SoundEvent(new ResourceLocation("encx", "chair_place")));
		REGISTRY.put(new ResourceLocation("encx", "chair_break"), new SoundEvent(new ResourceLocation("encx", "chair_break")));
		REGISTRY.put(new ResourceLocation("encx", "chair_hit"), new SoundEvent(new ResourceLocation("encx", "chair_hit")));
		REGISTRY.put(new ResourceLocation("encx", "chair_step"), new SoundEvent(new ResourceLocation("encx", "chair_step")));
		REGISTRY.put(new ResourceLocation("encx", "e4o4"), new SoundEvent(new ResourceLocation("encx", "e4o4")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
