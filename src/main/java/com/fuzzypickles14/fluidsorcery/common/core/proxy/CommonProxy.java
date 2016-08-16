package com.fuzzypickles14.fluidsorcery.common.core.proxy;

import com.fuzzypickles14.fluidsorcery.common.FluidSorcery;
import com.fuzzypickles14.fluidsorcery.common.blocks.ModBlocks;
import com.fuzzypickles14.fluidsorcery.common.crafting.CraftingRecipes;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluids;
import com.fuzzypickles14.fluidsorcery.common.handler.GuiHandler;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.worldgen.ModWorldGenerator;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
        NetworkRegistry.INSTANCE.registerGuiHandler(FluidSorcery.instance, new GuiHandler());
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(), 10);
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
