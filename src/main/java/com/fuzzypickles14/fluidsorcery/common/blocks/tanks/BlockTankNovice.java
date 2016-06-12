package com.fuzzypickles14.fluidsorcery.common.blocks.tanks;

import com.fuzzypickles14.fluidsorcery.common.blocks.tileEntities.TileTank;
import com.fuzzypickles14.fluidsorcery.common.blocks.tileEntities.TileTankNovice;
import com.fuzzypickles14.fluidsorcery.common.lib.LibFluid;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;

/**
 * Created by Andrew Toomey on 2/13/2016.
 */
public class BlockTankNovice extends BlockTank implements ITileEntityProvider {
    public BlockTankNovice(Material materialIn, String unlocalizedName, float hardness, float resistance) {
        super(materialIn, unlocalizedName, hardness, resistance);
    }
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileTankNovice(LibFluid.NOVICE_TANK_FILL_MULTIPLIER, LibFluid.NOVICE_TANK_CAPACITY_MULTIPLIER);
    }

    /**
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ)) {
            return true;
        }
        ItemStack currentItem = playerIn.getCurrentEquippedItem();

        if (currentItem != null) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);

            if (tileEntity instanceof TileTank) {
                TileTank tank = (TileTank) tileEntity;

                if (FluidContainerRegistry.isContainer(currentItem)) {
                    FluidStack fluid = FluidContainerRegistry.getFluidForFilledItem(currentItem);


                    if (fluid != null) {
                        int amount = tank.fill(null, fluid, true);

                        if (amount != 0 && !playerIn.capabilities.isCreativeMode) {
                            if (currentItem.stackSize > 1) {
                                if (!playerIn.inventory.addItemStackToInventory(FluidContainerRegistry.drainFluidContainer(currentItem))) {
                                    playerIn.dropPlayerItemWithRandomChoice(FluidContainerRegistry.drainFluidContainer(currentItem), false);
                                }

                                playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, currentItem.getItem().getContainerItem(currentItem));
                            } else {
                                playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, FluidContainerRegistry.drainFluidContainer(currentItem));
                            }
                        }
                        return true;
                    } else {
                        FluidStack available = tank.getTankInfo(null)[0].fluid;

                        if (available != null) {
                            ItemStack container = FluidContainerRegistry.fillFluidContainer(available, currentItem);

                            fluid = FluidContainerRegistry.getFluidForFilledItem(container);

                            if (fluid != null) {
                                if (!playerIn.capabilities.isCreativeMode) {
                                    if (currentItem.stackSize > 1) {
                                        if (!playerIn.inventory.addItemStackToInventory(container)) {
                                            return false;
                                        } else {
                                            playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, currentItem.getItem().getContainerItem(currentItem));
                                        }
                                    } else {
                                        playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, currentItem.getItem().getContainerItem(currentItem));
                                        playerIn.inventory.setInventorySlotContents(playerIn.inventory.currentItem, container);
                                    }
                                }
                                tank.drain(null, fluid.amount, true);

                                return true;
                            }
                        }
                    }
                }
                /////////////////////////////////////////////// else if()
            }
        }
        return false;
    }
    **/











}
