package com.fuzzypickles14.fluidsorcery.common.core.proxy;

import com.fuzzypickles14.fluidsorcery.common.blocks.ModBlocks;
import com.fuzzypickles14.fluidsorcery.common.core.render.ItemRender;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Andrew Toomey on 2/11/2016.
 */
public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

    }

    public void init(FMLInitializationEvent event) {
        super.init(event);
        ModBlocks.renderBlocks();
        ItemRender.registerItemRender();

    }

    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

}
