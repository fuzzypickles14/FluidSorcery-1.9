package com.fuzzypickles14.fluidsorcery.common.blocks;

import com.fuzzypickles14.fluidsorcery.common.blocks.fountain.BlockFountainBrick;
import com.fuzzypickles14.fluidsorcery.common.blocks.tanks.BlockTank;
import com.fuzzypickles14.fluidsorcery.common.blocks.tanks.BlockTankNovice;
import com.fuzzypickles14.fluidsorcery.common.blocks.tileEntities.TileTankNovice;
import com.fuzzypickles14.fluidsorcery.common.core.render.FluidRenderer;
import com.fuzzypickles14.fluidsorcery.common.core.render.FluidSorceryBlockRender;
import com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids.BlockMist;
import com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids.BlockScorch;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidMist;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidScorch;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Andrew Toomey on 1/8/2016.
 */
public class ModBlocks {

    public static Block fountainBrick;
    public static BlockTank tankNovice;

    public static Block scorch;
    public static Block mist;



    public static void initBlocks() {
        FluidRegistry.registerFluid(new FluidScorch());
        scorch = GameRegistry.register(new BlockScorch());

        FluidRegistry.registerFluid(new FluidMist());

        mist = GameRegistry.register(new BlockMist());

        fountainBrick = registerBlock(new BlockFountainBrick(Material.rock, "BlockFountainBrick", 4.0f, 4.0f), "BlockFountainBrick");


        //FluidRenderer.renderFluid(scorch);
        //FluidRenderer.renderFluid(mist);


        GameRegistry.registerTileEntity(TileTankNovice.class, "TileTankNovice");
    }

    public static void renderBlocks()
    {
        FluidSorceryBlockRender.registerBlockRender(fountainBrick, 0, fountainBrick.getUnlocalizedName(), "inventory");
    }

    private static Block registerBlock(Block block, String name)
    {
        if (block.getRegistryName() == null)
            block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(name));
        return block;
    }
}
