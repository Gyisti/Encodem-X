
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EncxModTabs {
	public static CreativeModeTab TAB_ROBLOX_ELEMENT;
	public static CreativeModeTab TAB_BACKROOMS_ELEMENT;

	public static void load() {
		TAB_ROBLOX_ELEMENT = new CreativeModeTab("tabroblox_element") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.RED_CONCRETE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BACKROOMS_ELEMENT = new CreativeModeTab("tabbackrooms_element") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.GRAVEL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
