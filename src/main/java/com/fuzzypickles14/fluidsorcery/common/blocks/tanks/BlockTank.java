package com.fuzzypickles14.fluidsorcery.common.blocks.tanks;

import com.fuzzypickles14.fluidsorcery.common.blocks.ModBlock;
import net.minecraft.block.material.Material;

/**
 * Created by Andrew Toomey on 2/13/2016.
 */
public abstract class BlockTank extends ModBlock {
    public BlockTank(Material materialIn, String unlocalizedName, float hardness, float resistance) {
        super(materialIn, unlocalizedName, hardness, resistance);
    }


}
