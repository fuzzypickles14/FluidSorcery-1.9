package com.fuzzypickles14.fluidsorcery.common.core.render;

import com.fuzzypickles14.fluidsorcery.common.blocks.ModBlocks;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Andrew Toomey on 2/13/2016.
 */
public final class FluidSorceryBlockRender {

    public static void registerBlockRender() {

        //Fountain
        registerBlock(ModBlocks.fountainBrick);
        registerBlock(ModBlocks.tankNovice);
    }

    public static void registerBlock(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(LibModDetails.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
