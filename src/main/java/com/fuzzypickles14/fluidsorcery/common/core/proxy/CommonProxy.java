package com.fuzzypickles14.fluidsorcery.common.core.proxy;

import com.fuzzypickles14.fluidsorcery.common.blocks.ModBlocks;
import com.fuzzypickles14.fluidsorcery.common.crafting.CraftingRecipes;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluids;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Andrew Toomey on 2/11/2016.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ModFluids.preInit();
        ModItems.initItems();
        ModBlocks.initBlocks();
        CraftingRecipes.initRecipes();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
