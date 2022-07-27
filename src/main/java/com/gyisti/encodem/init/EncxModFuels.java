
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class EncxModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == EncxModItems.FUN_FACE.get())
			event.setBurnTime(8877);
	}
}
