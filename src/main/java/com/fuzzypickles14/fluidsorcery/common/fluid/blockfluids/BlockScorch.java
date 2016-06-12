package com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModBlockLiquid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluid;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidScorch;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


/**
 * Created by Andrew Toomey on 2/16/2016.
 */
public class BlockScorch extends ModBlockLiquid {

    public static ModFluid scorch = new FluidScorch();

    public BlockScorch() {
        super(scorch, Material.water);
        setUnlocalizedName(LibModDetails.MOD_ID + ".fluid.scorch");
        scorch.setBlock(this);
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof EntityPlayer && this.isSourceBlock(worldIn, pos)) {
            EntityPlayer player = (EntityPlayer) entityIn;
            if (player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() == Items.leather) {
                if (player.inventory.getCurrentItem().stackSize <= 8) {
                    player.inventory.addItemStackToInventory(new ItemStack(ModItems.scorchLeather, player.inventory.getCurrentItem().stackSize = player.inventory.getCurrentItem().stackSize));
                    player.inventory.removeStackFromSlot(player.inventory.currentItem);
                } else {
                    player.inventory.getCurrentItem().stackSize = player.inventory.getCurrentItem().stackSize - 8;
                    player.inventory.addItemStackToInventory(new ItemStack(ModItems.scorchLeather, 8));
                    }
            }
            worldIn.setBlockToAir(pos);
        }
    }


}
