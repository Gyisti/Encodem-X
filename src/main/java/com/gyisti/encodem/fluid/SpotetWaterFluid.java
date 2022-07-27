
package com.gyisti.encodem.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import com.gyisti.encodem.init.EncxModItems;
import com.gyisti.encodem.init.EncxModFluids;
import com.gyisti.encodem.init.EncxModBlocks;
import com.gyisti.encodem.fluid.attributes.SpotetWaterFluidAttributes;

public abstract class SpotetWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(EncxModFluids.SPOTET_WATER,
			EncxModFluids.FLOWING_SPOTET_WATER,
			SpotetWaterFluidAttributes
					.builder(new ResourceLocation("encx:blocks/spotetwater_still"), new ResourceLocation("encx:blocks/spotetwater_flow"))
					.luminosity(5).density(969).viscosity(948).temperature(255)

					.rarity(Rarity.UNCOMMON).color(-13083194))
			.explosionResistance(100f)

			.tickRate(4)

			.slopeFindDistance(8).bucket(EncxModItems.SPOTET_WATER_BUCKET).block(() -> (LiquidBlock) EncxModBlocks.SPOTET_WATER.get());

	private SpotetWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(1.7000000000000002);
	}

	public static class Source extends SpotetWaterFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SpotetWaterFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
