package com.fuzzypickles14.fluidsorcery.common.core.gui;

import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

/**
 * Created by Andrew Toomey on 7/20/2016.
 */
public class GuiManual extends GuiScreen
{
    private int ImageWidth = 192;
    private int ImageHeigth = 192;

    public static final ResourceLocation texture = new ResourceLocation(LibModDetails.MOD_ID + ":textures/gui/ManualGui.png");

    private GuiButton pageBack, pageForward;


    @Override
    public void initGui()
    {
        this.buttonList.add(this.pageBack = new GuiButton(0, this.ImageWidth / 2 + 60, 150, 20, 20,""));
        this.buttonList.add(this.pageForward = new GuiButton(0, this.ImageWidth / 2 + 150, 150, 20, 20,""));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int i = (this.width - this.ImageWidth) / 2;
        int j = 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.ImageWidth, this.ImageHeigth);
        this.fontRendererObj.drawString("Fluimancer's Manual", this.ImageWidth/2 + 70, j + 16 + 16, 0);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    private void drawPopup()
    {
        this.fontRendererObj.drawString("This is a test popup", this.ImageWidth/2 + 70, 2 + 16 + 32, 0);
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException
    {
        if (button == this.pageBack)
        {
            this.drawPopup();
            this.mc.updateDisplay();
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
