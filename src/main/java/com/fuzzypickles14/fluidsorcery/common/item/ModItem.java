package com.fuzzypickles14.fluidsorcery.common.item;

import com.fuzzypickles14.fluidsorcery.common.core.FluidSorceryCreativeTab;
import net.minecraft.item.Item;

/**
 * Created by Andrew Toomey on 1/8/2016.
 */
public class ModItem extends Item {

    public ModItem(String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(FluidSorceryCreativeTab.instance);
    }
}
