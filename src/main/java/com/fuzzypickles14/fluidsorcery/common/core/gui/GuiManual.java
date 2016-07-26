package com.fuzzypickles14.fluidsorcery.common.core.gui;

import com.fuzzypickles14.fluidsorcery.common.core.manual.ManualChapter;
import com.fuzzypickles14.fluidsorcery.common.core.manual.ManualPage;
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
    protected int ImageWidth = 192;
    protected int ImageHeigth = 192;

    public static final ResourceLocation texture = new ResourceLocation(LibModDetails.MOD_ID + ":textures/gui/ManualGui.png");

    protected GuiButton chapterButton;
    private ManualChapter testChapter;


    @Override
    public void initGui()
    {
        this.testChapter = new ManualChapter("Chapter 1", new ManualPage(this, "Welcome to page 1"));
        this.buttonList.add(this.chapterButton = new GuiButton(0, (this.width - this.ImageWidth) / 2 + 55, 50, 30, 5,"Chapter 1"));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int i = (this.width - this.ImageWidth) / 2;
        int j = 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.ImageWidth, this.ImageHeigth);
        this.fontRendererObj.drawString("Fluimancer's Manual", i + 40, j + 16 + 16, 0);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException
    {
        if (button == this.chapterButton)
        {
            this.mc.displayGuiScreen(this.testChapter.getChapterPages().get(0));
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
