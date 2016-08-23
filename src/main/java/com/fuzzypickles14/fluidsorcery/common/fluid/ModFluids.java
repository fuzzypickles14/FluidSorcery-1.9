package com.fuzzypickles14.fluidsorcery.common.fluid;

import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidAer;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidMist;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidScorch;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidTerre;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by Andrew Toomey on 2/15/2016.
 */
public class ModFluids {

    public static ModFluid scorch = new FluidScorch();
    public static ModFluid mist = new FluidMist();
    public static ModFluid aer = new FluidAer();
    public static ModFluid terre = new FluidTerre();

    public static void Init() {
        registerFluid(scorch);
        registerFluid(mist);
        registerFluid(aer);
        registerFluid(terre);
    }



    private static void registerFluid(Fluid fluid) {
        if (!FluidRegistry.isFluidRegistered(fluid)) {
            FluidRegistry.registerFluid(fluid);
        }
    }
}
