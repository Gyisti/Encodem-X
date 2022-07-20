
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import com.gyisti.encodem.item.RobuxItem;
import com.gyisti.encodem.EncxMod;

public class EncxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EncxMod.MODID);
	public static final RegistryObject<Item> ROBLOX_NOOB = REGISTRY.register("roblox_noob_spawn_egg",
			() -> new ForgeSpawnEggItem(EncxModEntities.ROBLOX_NOOB, -3355648, -13421569, new Item.Properties().tab(EncxModTabs.TAB_ROBLOX_ELEMENT)));
	public static final RegistryObject<Item> ROBUX = REGISTRY.register("robux", () -> new RobuxItem());
}
