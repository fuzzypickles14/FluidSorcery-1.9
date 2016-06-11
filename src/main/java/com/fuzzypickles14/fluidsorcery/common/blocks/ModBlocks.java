package com.fuzzypickles14.fluidsorcery.common.blocks;

import com.fuzzypickles14.fluidsorcery.common.blocks.fountain.BlockFountainBrick;
import com.fuzzypickles14.fluidsorcery.common.blocks.tanks.BlockTank;
import com.fuzzypickles14.fluidsorcery.common.blocks.tanks.BlockTankNovice;
import com.fuzzypickles14.fluidsorcery.common.blocks.tileEntities.TileTankNovice;
import com.fuzzypickles14.fluidsorcery.common.core.render.FluidRenderer;
import com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids.BlockMist;
import com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids.BlockScorch;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidMist;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidScorch;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Andrew Toomey on 1/8/2016.
 */
public class ModBlocks {

    public static BlockFountainBrick fountainBrick;
    public static BlockTank tankNovice;

    public static Block scorch;
    public static Block mist;



    public static void initBlocks() {
        FluidRegistry.registerFluid(new FluidScorch());
        scorch = GameRegistry.registerBlock(new BlockScorch(), "scorch");

        FluidRegistry.registerFluid(new FluidMist());
        mist = GameRegistry.registerBlock(new BlockMist(), "mist");

        FluidRenderer.renderFluid(scorch);
        FluidRenderer.renderFluid(mist);

        GameRegistry.registerBlock(tankNovice =new BlockTankNovice(Material.glass, "BlockNoviceTank", 0.5F, 15), "BlockNoviceTank");
        GameRegistry.registerBlock(fountainBrick = new BlockFountainBrick(Material.rock, "BlockFountainBrick", 3, 15), "BlockFountainBrick");

        GameRegistry.registerTileEntity(TileTankNovice.class, "TileTankNovice");
    }
}
