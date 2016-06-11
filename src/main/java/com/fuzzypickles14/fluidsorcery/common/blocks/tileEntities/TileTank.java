package com.fuzzypickles14.fluidsorcery.common.blocks.tileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fluids.*;


/**
 * Created by Andrew Toomey on 2/13/2016.
 */
public class TileTank extends TileEntity implements IFluidHandler {

    private double fillMultiplier;
    private double capacityMultiplier;
    private ModTank tank;

    public TileTank(double fillMultiplier, double capacityMultiplier) {
        super();
        this.fillMultiplier = fillMultiplier;
        this.capacityMultiplier = capacityMultiplier;
        this.tank = new ModTank("tank", this.getTotalCapacity(), this);
    }


    public ModTank getTank() {
        return tank;
    }

    public int getTotalCapacity(){
        return (int)(FluidContainerRegistry.BUCKET_VOLUME * 16 * capacityMultiplier);
    }

    public double getFillMultiplier() {
        return fillMultiplier;
    }

    public int getRemainingCapacity() {
        return tank.getCapacity() - tank.getFluidAmount();
    }

    @Override
    public int fill(EnumFacing from, FluidStack resource, boolean doFill) {
        int used = tank.fill(resource, doFill);
        if (used > 0){
            return used;
        }
        return 0;
    }

    @Override
    public FluidStack drain(EnumFacing from, FluidStack resource, boolean doDrain) {
        if(resource == null) {
            return null;
        }
        //if(!resource.isFluidEqual(tank.getFluid())) {
        //    continue;
       // }

        FluidStack drained = tank.drain(resource.amount, doDrain);
        if (drained != null && drained.amount > 0) {
            return drained;
        }
        return null;
    }

    @Override
    public FluidStack drain(EnumFacing from, int maxDrain, boolean doDrain) {
        FluidStack drained = tank.drain(maxDrain, doDrain);
        if (drained != null && drained.amount > 0) {
            return drained;
        }
        return null;
    }

    @Override
    public boolean canFill(EnumFacing from, Fluid fluid) {
        return true;
    }

    @Override
    public boolean canDrain(EnumFacing from, Fluid fluid) {
        return true;
    }

    @Override
    public FluidTankInfo[] getTankInfo(EnumFacing from) {
        FluidTank infoTank = new FluidTank(tank.getCapacity());


        //for Stacking Tanks
        TileTank tile = this;

        if (tile.tank.getFluid() != null) {
            infoTank.setFluid(tile.tank.getFluid().copy());
        } else {
            return new FluidTankInfo[] {
                    infoTank.getInfo()
            };
        }

        int capacity = tile.tank.getCapacity();

        FluidStack fluid = tile.tank.getFluid();
        while(true) {
            if (fluid == null || fluid.amount == 0) {

            } else if (!infoTank.getFluid().isFluidEqual(fluid)) {
                break;
            } else {
                infoTank.getFluid().amount += fluid.amount;
            }

            capacity += tile.tank.getCapacity();
            break;
        }

        infoTank.setCapacity(capacity);
        return new FluidTankInfo[] {
                infoTank.getInfo()
        };
    }

    public void writeToNBT(NBTTagCompound data) {
        super.writeToNBT(data);

    }

    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
    }
}
