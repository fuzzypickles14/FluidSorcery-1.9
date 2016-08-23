package com.fuzzypickles14.fluidsorcery.common.fluid.fluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModBlockLiquid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluid;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Andrew Toomey on 3/3/2016.
 */
public class FluidAer extends ModFluid {

    public FluidAer() {
        super("aer", new ResourceLocation(LibModDetails.MOD_ID + ":blocks/aerStill"), new ResourceLocation(LibModDetails.MOD_ID + ":blocks/aerFlow"));
    }
}
