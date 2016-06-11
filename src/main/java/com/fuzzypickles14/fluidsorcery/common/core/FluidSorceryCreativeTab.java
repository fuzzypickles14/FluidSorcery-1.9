package com.fuzzypickles14.fluidsorcery.common.core;

import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Andrew Toomey on 2/11/2016.
 */
public class FluidSorceryCreativeTab extends CreativeTabs {

    public static FluidSorceryCreativeTab instance = new FluidSorceryCreativeTab(LibModDetails.MOD_ID);

    public FluidSorceryCreativeTab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.itemManual;
    }
}
