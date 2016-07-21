package com.fuzzypickles14.fluidsorcery.common.item.items;

import com.fuzzypickles14.fluidsorcery.common.FluidSorcery;
import com.fuzzypickles14.fluidsorcery.common.item.ModItem;
import com.fuzzypickles14.fluidsorcery.common.lib.LibGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by Andrew Toomey on 2/13/2016.
 */
public class ItemManual extends ModItem {
    public ItemManual(String unlocalizedName) {
        super(unlocalizedName);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        OpenManual(playerIn, itemStackIn, worldIn);
        return new ActionResult<ItemStack>(EnumActionResult.PASS, itemStackIn);
    }

    public static void OpenManual(EntityPlayer player, ItemStack itemStack, World world)
    {
        player.openGui(FluidSorcery.instance, LibGui.MANUAL_GUI, world, 0 ,0, 0);
    }
}
