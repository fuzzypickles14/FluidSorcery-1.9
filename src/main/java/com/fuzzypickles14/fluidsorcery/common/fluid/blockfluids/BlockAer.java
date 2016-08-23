package com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModBlockLiquid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluids;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;

/**
 * Created by andrewtoomey on 8/22/16.
 */
public class BlockAer extends ModBlockLiquid {
    public BlockAer() {
        super(ModFluids.aer, Material.water, Items.string, ModItems.galeThread);
        setUnlocalizedName(LibModDetails.MOD_ID + ".fluid.aer");
        ModFluids.aer.setBlock(this);
    }
}
