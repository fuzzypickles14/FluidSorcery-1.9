package com.fuzzypickles14.fluidsorcery.common.blocks;

import com.fuzzypickles14.fluidsorcery.common.core.FluidSorceryCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Andrew Toomey on 2/11/2016.
 */
public class ModBlock extends Block {
    public ModBlock(Material materialIn, String unlocalizedName, float hardness, float resistance) {
        super(materialIn);
        setCreativeTab(FluidSorceryCreativeTab.instance);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setRegistryName(unlocalizedName);
    }
}
