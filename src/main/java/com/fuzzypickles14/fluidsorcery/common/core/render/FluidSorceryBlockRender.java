package com.fuzzypickles14.fluidsorcery.common.core.render;

import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Andrew Toomey on 2/13/2016.
 */
public final class FluidSorceryBlockRender {



    public static void registerBlockRender(Block block, int meta, String name, String variant) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(LibModDetails.MOD_ID + ":" + name.substring(5), variant));
    }

}
