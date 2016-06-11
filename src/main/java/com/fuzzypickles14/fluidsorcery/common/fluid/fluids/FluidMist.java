package com.fuzzypickles14.fluidsorcery.common.fluid.fluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluid;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Andrew Toomey on 3/3/2016.
 */
public class FluidMist extends ModFluid {

    public FluidMist() {
        super("mist", new ResourceLocation(LibModDetails.MOD_ID + ":blocks/mistStill"), new ResourceLocation(LibModDetails.MOD_ID + ":blocks/mistFlow"));

        setDensity(2000);
        setViscosity(2000);
    }
}
