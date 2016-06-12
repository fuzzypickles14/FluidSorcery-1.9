package com.fuzzypickles14.fluidsorcery.common.fluid.blockfluids;

import com.fuzzypickles14.fluidsorcery.common.fluid.ModBlockLiquid;
import com.fuzzypickles14.fluidsorcery.common.fluid.ModFluid;
import com.fuzzypickles14.fluidsorcery.common.fluid.fluids.FluidScorch;
import com.fuzzypickles14.fluidsorcery.common.item.ModItem;
import com.fuzzypickles14.fluidsorcery.common.item.ModItems;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
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

    private int charges;

    public BlockScorch() {
        super(scorch, Material.water);
        setUnlocalizedName(LibModDetails.MOD_ID + ".fluid.scorch");
        this.charges = 8;
        scorch.setBlock(this);
    }

    private int getCharges()
    {
        return this.charges;
    }

    private void decCharges()
    {
        this.charges--;
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        if (entityIn instanceof EntityItem && this.isSourceBlock(worldIn, pos)) {
            ItemStack item = ((EntityItem)entityIn).getEntityItem();
            if (item.getItem() == Items.leather && entityIn.getPosition().getY() == pos.getY()) {
                if (this.getCharges()  > 0) {
                    item.setItem(ModItems.scorchLeather);
                    this.decCharges();
                } else
                    worldIn.setBlockToAir(pos);
            }
        }
    }
}
