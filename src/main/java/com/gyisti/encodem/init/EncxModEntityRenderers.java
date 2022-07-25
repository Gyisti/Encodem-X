
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.gyisti.encodem.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.gyisti.encodem.client.renderer.RobloxNoobRenderer;
import com.gyisti.encodem.client.renderer.PartypooperRenderer;
import com.gyisti.encodem.client.renderer.PartygoersRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EncxModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EncxModEntities.ROBLOX_NOOB.get(), RobloxNoobRenderer::new);
		event.registerEntityRenderer(EncxModEntities.PARTYGOERS.get(), PartygoersRenderer::new);
		event.registerEntityRenderer(EncxModEntities.PARTYPOOPER.get(), PartypooperRenderer::new);
	}
}
