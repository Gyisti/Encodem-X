
package com.gyisti.encodem.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.gyisti.encodem.init.EncxModTabs;
import com.gyisti.encodem.init.EncxModSounds;

public class E4o4musicItem extends RecordItem {
	public E4o4musicItem() {
		super(0, EncxModSounds.REGISTRY.get(new ResourceLocation("encx:e4o4")),
				new Item.Properties().tab(EncxModTabs.TAB_ENCODEM_X).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("WOW GREAT =D"));
	}
}
