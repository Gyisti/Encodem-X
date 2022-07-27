
package com.gyisti.encodem.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.gyisti.encodem.init.EncxModTabs;
import com.gyisti.encodem.init.EncxModFluids;

public class SpotetWaterItem extends BucketItem {
	public SpotetWaterItem() {
		super(EncxModFluids.SPOTET_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(EncxModTabs.TAB_ENCODEM_X));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("is this pp!?!?"));
	}
}
