
package com.gyisti.encodem.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.gyisti.encodem.entity.PartygoersEntity;
import com.gyisti.encodem.client.model.Modelbfix;

public class PartygoersRenderer extends MobRenderer<PartygoersEntity, Modelbfix<PartygoersEntity>> {
	public PartygoersRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbfix(context.bakeLayer(Modelbfix.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PartygoersEntity entity) {
		return new ResourceLocation("encx:textures/partygoers.png");
	}
}
