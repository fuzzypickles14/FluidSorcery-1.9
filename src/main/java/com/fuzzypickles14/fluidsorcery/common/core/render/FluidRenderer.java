package com.fuzzypickles14.fluidsorcery.common.core.render;

import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Andrew Toomey on 2/16/2016.
 */
public final class FluidRenderer {

    public static void renderFluid(Block block) {
        final Block toRender = block;


        ModelBakery.registerItemVariants(Item.getItemFromBlock(block));
        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition()
        {
            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack)
            {
                return new ModelResourceLocation(LibModDetails.MOD_ID + ":" + toRender.getClass().getSimpleName(), "fluid");
            }
        });
        ModelLoader.setCustomStateMapper(block, new StateMapperBase()
        {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state)
            {
                return new ModelResourceLocation(LibModDetails.MOD_ID + ":" + toRender.getClass().getSimpleName(), "fluid");
            }
        });
    }
}
