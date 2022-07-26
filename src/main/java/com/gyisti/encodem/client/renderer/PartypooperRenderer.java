
package com.gyisti.encodem.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.gyisti.encodem.entity.PartypooperEntity;
import com.gyisti.encodem.client.model.Modelbfix;

public class PartypooperRenderer extends MobRenderer<PartypooperEntity, Modelbfix<PartypooperEntity>> {
	public PartypooperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbfix(context.bakeLayer(Modelbfix.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PartypooperEntity entity) {
		return new ResourceLocation("encx:textures/partypoopersvthree.png");
	}
}
