package com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModBlockLiquid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluid;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidMist;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Andrew Toomey on 3/29/2016.
 */
public class BlockMist extends ModBlockLiquid {
    public static ModFluid mist = new FluidMist();
    public BlockMist() {
        super(mist, Material.water);
        setUnlocalizedName(LibModDetails.MOD_ID + ".fluid.mist");
        setRegistryName("BlockMist");
        mist.setBlock(this);
    }


    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof EntityPlayer && this.isSourceBlock(worldIn, pos)) {
            EntityPlayer player = (EntityPlayer) entityIn;
            if (player.inventory.getCurrentItem() != null && getBlockFromItem(player.inventory.getCurrentItem().getItem()) == Blocks.web) {
                if (player.inventory.getCurrentItem().stackSize <= 8) {
                    player.inventory.addItemStackToInventory(new ItemStack(ModItems.mistFibers, player.inventory.getCurrentItem().stackSize = player.inventory.getCurrentItem().stackSize));
                    player.inventory.removeStackFromSlot(player.inventory.currentItem);
                } else {
                    player.inventory.getCurrentItem().stackSize = player.inventory.getCurrentItem().stackSize - 8;
                    player.inventory.addItemStackToInventory(new ItemStack(ModItems.mistFibers, 8));
                }
            }
            worldIn.setBlockToAir(pos);
        }
    }
}
