
package com.gyisti.encodem.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.gyisti.encodem.entity.RobloxNoobEntity;
import com.gyisti.encodem.client.model.Modelsteve;

public class RobloxNoobRenderer extends MobRenderer<RobloxNoobEntity, Modelsteve<RobloxNoobEntity>> {
	public RobloxNoobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RobloxNoobEntity entity) {
		return new ResourceLocation("encx:textures/noob.png");
	}
}
