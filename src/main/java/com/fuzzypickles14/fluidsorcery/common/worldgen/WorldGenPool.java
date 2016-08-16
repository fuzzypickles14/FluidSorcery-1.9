package com.fuzzypickles14.fluidsorcery.common.worldgen;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Andrew Toomey on 8/13/2016.
 */
public class WorldGenPool {

    private Block block;

    public WorldGenPool(Block blockIn) {
        this.block = blockIn;
    }

    public boolean generate(World world, Random rand, BlockPos position) {
        if (rand.nextInt(100) > 5)
            return false;
        if (world.getBlockState(position) == Blocks.air.getDefaultState())
            return false;
        if (checkAreaForLake(world, position))
        {
            for (int xPos = 0; xPos < 3; xPos++) {
                for (int zPos = 0; zPos < 3; zPos++) {
                    world.setBlockState(position.add(xPos, 1, zPos), this.block.getDefaultState(), 2);
                }
            }
            return true;
        }
        else return false;
    }

    private boolean checkAreaForLake(World world, BlockPos position)
    {
        for (int xPos = -1; xPos < 4; xPos++)
        {
            for (int zPos = -1; zPos < 4; zPos++)
            {
                if (!world.getBlockState(position.add(xPos, 1, zPos)).getMaterial().isSolid()) {
                    return false;
                }
            }
        }
        return true;
    }
}
