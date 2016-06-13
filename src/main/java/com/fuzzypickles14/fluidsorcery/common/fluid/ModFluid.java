package com.fuzzypickles14.fluidsorcery.common.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Andrew Toomey on 1/8/2016.
 */
public class ModFluid extends Fluid {
    public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing) {
        super(fluidName, still, flowing);
    }


}
