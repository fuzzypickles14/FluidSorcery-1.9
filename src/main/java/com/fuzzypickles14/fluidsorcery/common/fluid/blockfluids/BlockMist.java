package com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModBlockLiquid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluids;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidMist;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Andrew Toomey on 3/29/2016.
 */
public class BlockMist extends ModBlockLiquid {
    public BlockMist() {
        super(ModFluids.mist, new MaterialLiquid(MapColor.blueColor), Item.getItemFromBlock(Blocks.web), ModItems.mistFibers);
        setUnlocalizedName(LibModDetails.MOD_ID + ".fluid.mist");
        ModFluids.mist.setBlock(this);
    }
}
