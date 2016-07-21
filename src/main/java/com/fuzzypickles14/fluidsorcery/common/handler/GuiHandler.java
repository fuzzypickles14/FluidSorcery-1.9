package com.fuzzypickles14.fluidsorcery.common.handler;

import com.fuzzypickles14.fluidsorcery.common.core.gui.GuiManual;
import com.fuzzypickles14.fluidsorcery.common.lib.LibGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by Andrew Toomey on 7/20/2016.
 */
public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == LibGui.MANUAL_GUI)
            return new GuiManual();
        return null;
    }
}
