package com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModBlockLiquid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluid;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidScorch;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;


/**
 * Created by Andrew Toomey on 2/16/2016.
 */
public class BlockScorch extends ModBlockLiquid {

    public static ModFluid scorch = new FluidScorch();

    public BlockScorch() {
        super(scorch, Material.water, Items.leather, ModItems.scorchLeather);
        setUnlocalizedName(LibModDetails.MOD_ID + ".fluid.scorch");
        scorch.setBlock(this);
    }
}
