package com.fuzzypickles14.fluidsorcery.common.core.gui;

import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Andrew Toomey on 7/20/2016.
 */
public class GuiManual extends GuiScreen
{
    private int ImageWidth = 192;
    private int ImageHeigth = 192;

    public static final ResourceLocation texture = new ResourceLocation(LibModDetails.MOD_ID + ":textures/gui/ManualGui.png");



    public void InitGui()
    {

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int i = (this.width - this.ImageWidth) / 2;
        int j = 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.ImageWidth, this.ImageHeigth);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
