package com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModBlockLiquid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluids;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * Created by andrewtoomey on 8/22/16.
 */
public class BlockTerre extends ModBlockLiquid {
    public BlockTerre() {
        super(ModFluids.terre, Material.water, Item.getItemFromBlock(Blocks.web), ModItems.mistFibers);
        setUnlocalizedName(LibModDetails.MOD_ID + ".fluid.terre");
        ModFluids.terre.setBlock(this);
    }
}
