package com.fuzzypickles14.fluidsorcery.common.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by Andrew Toomey on 2/15/2016.
 */
public class ModFluids {



    public static void preInit() {
    }



    public static void registerFluid(Fluid fluid) {
        if (!FluidRegistry.isFluidRegistered(fluid)) {
            FluidRegistry.registerFluid(fluid);
        }
    }
}
