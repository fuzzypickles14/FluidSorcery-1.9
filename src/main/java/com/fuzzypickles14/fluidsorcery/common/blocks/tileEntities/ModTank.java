package com.fuzzypickles14.fluidsorcery.common.blocks.tileEntities;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidTank;

/**
 * Created by Andrew Toomey on 2/13/2016.
 */
public class ModTank extends FluidTank implements ITileEntityProvider {

    private final String name;
    public int colorRenderCache = 0xFFFFFF;

    public ModTank(String name, int capacity, TileEntity tileEntity) {
        super(capacity);
        this.name = name;
        this.tile = tileEntity;
    }

    public boolean isEmpty() {
        return getFluid() == null || getFluid().amount <= 0;
    }

    public boolean isFull() {
        return getFluid() != null && getFluid().amount == this.getCapacity();
    }

    public Fluid getFluidType() {
        return getFluid() !=  null ? getFluid().getFluid() : null;
    }

    @Override
    public final NBTTagCompound writeToNBT(NBTTagCompound nbtTagCompound) {
        NBTTagCompound tankData = new NBTTagCompound();
        super.writeToNBT(tankData);
        nbtTagCompound.setTag(name, tankData);
        return nbtTagCompound;
    }

    @Override
    public final FluidTank readFromNBT(NBTTagCompound nbtTagCompound) {
        if (nbtTagCompound.hasKey(name)) {
            setFluid(null);

            NBTTagCompound tankData = nbtTagCompound.getCompoundTag(name);
            super.readFromNBT(nbtTagCompound);
        }
        return this;
    }


    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
         return null;
    }
}
