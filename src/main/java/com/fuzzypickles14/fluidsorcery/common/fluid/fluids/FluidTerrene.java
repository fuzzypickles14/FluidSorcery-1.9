package com.fuzzypickles14.fluidsorcery.common.fluid.fluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModBlockLiquid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluid;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Andrew Toomey on 3/3/2016.
 */
public class FluidTerrene extends ModFluid {

    public FluidTerrene(String fluidName, ResourceLocation still, ResourceLocation flowing) {
        super(fluidName, still, flowing);
    }
}
