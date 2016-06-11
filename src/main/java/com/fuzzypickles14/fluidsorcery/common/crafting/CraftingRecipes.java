package com.fuzzypickles14.fluidsorcery.common.crafting;


import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Andrew Toomey on 3/31/2016.
 */
public class CraftingRecipes {
    public static void initRecipes() {
        GameRegistry.addRecipe(new ItemStack(Blocks.web, 4),
                "sss", "sls", "sss", 's', Items.string, 'l', Items.slime_ball);
    }


}
