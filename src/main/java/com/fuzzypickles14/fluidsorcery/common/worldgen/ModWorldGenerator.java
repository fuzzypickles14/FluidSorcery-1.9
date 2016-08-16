package com.fuzzypickles14.fluidsorcery.common.worldgen;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Andrew Toomey on 8/14/2016.
 */
public class ModWorldGenerator implements IWorldGenerator {
    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        int blockX = chunkX * 16;
        int blockZ = chunkZ * 16;
        switch (world.provider.getDimension())
        {
            case -1:
                break;
            case 0:
                generateOverworld(world, rand, blockX, blockZ);
                break;
            case 1:
                break;
        }
    }

    private void generateNether()
    {}

    private void generateOverworld(World world, Random rand, int blockX, int blockZ)
    {
        WorldGenerator scorchGen = new ModWorldGen();
        int randX = blockX + rand.nextInt(16);
        int randZ = blockZ + rand.nextInt(16);
        scorchGen.generate(world, rand, new BlockPos(randX, findGround(world, randX, randZ), randZ));

    }

    private int findGround(World world, int x, int z)
    {
        int y = 255;
        boolean isAtGround = false;
        while(!isAtGround && y-- >=0)
        {
            isAtGround = world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.grass;
        }
        y--;
        return y;

    }
}
