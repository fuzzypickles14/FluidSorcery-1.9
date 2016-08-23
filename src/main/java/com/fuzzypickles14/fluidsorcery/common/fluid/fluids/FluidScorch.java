package com.fuzzypickles14.fluidsorcery.common.fluid.fluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluid;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.util.ResourceLocation;

import java.awt.*;

/**
 * Created by Andrew Toomey on 2/16/2016.
 */
public class FluidScorch extends ModFluid {

    public FluidScorch() {
        super("scorch", new ResourceLocation(LibModDetails.MOD_ID + ":blocks/scorchStill"), new ResourceLocation(LibModDetails.MOD_ID + ":blocks/scorchFlow"));
    }

    @Override
    public int getColor() {
        return Color.RED.getRGB();
    }


}
