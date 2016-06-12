package com.fuzzypickles14.fluidsorcery.common.core.render;

import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Andrew Toomey on 2/13/2016.
 */
public final class ItemRender {

    public static void registerItemRender() {
        registerItem(ModItems.itemManual);
        registerItem(ModItems.scorchLeather);
        registerItem(ModItems.galeThread);
        registerItem(ModItems.mistFibers);
    }

    private static void registerItem(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(LibModDetails.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
