package com.fuzzypickles14.fluidsorcery.common.core.gui;

import com.fuzzypickles14.fluidsorcery.common.core.manual.ManualChapter;
import com.fuzzypickles14.fluidsorcery.common.lib.LibChapters;
import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.util.List;

/**
 * Created by Andrew Toomey on 7/20/2016.
 */
public class GuiManual extends GuiScreen
{
    protected int ImageWidth = 192;
    protected int ImageHeigth = 192;

    public static final ResourceLocation texture = new ResourceLocation(LibModDetails.MOD_ID + ":textures/gui/ManualGui.png");

    //protected GuiButton chapterButton;
    protected ManualChapter currentChapter;
    protected GuiButton pageBack, pageForward;

    protected static List<ManualChapter> chapters = LibChapters.ChapterList;


    @Override
    public void initGui()
    {
        this.buttonList.add(new GuiButton(1, (this.width - this.ImageWidth) / 2 + 55, 50, 30, 5,"Chapter 1"));
        this.buttonList.add(new GuiButton(2, (this.width - this.ImageWidth) / 2 + 55, 70, 30, 5,"Chapter 2"));
        this.buttonList.add(new GuiButton(3, (this.width - this.ImageWidth) / 2 + 55, 90, 30, 5,"Chapter 3"));
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
        if (button.id >= 1)
        {
            this.currentChapter = this.getChapterByButton(button.id);
            this.mc.displayGuiScreen(currentChapter.FirstPage());
        }
        else if (button == this.pageForward)
        {
            this.mc.displayGuiScreen(currentChapter.GetNextPage());
        }
    }

    protected ManualChapter getChapterByButton(int id)
    {
        return chapters.get(id - 1);
    }
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
