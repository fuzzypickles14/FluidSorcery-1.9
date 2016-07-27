package com.fuzzypickles14.fluidsorcery.common.core.manual;

import com.fuzzypickles14.fluidsorcery.common.core.gui.GuiManual;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * Created by Andrew Toomey on 7/21/2016.
 */
public class ManualPage extends GuiManual
{

    private GuiScreen previousPage;
    private String name;
    int chapterId;

    public ManualPage(GuiScreen previousPage, String name, int chapterId)
    {
        this.previousPage = previousPage;
        this.name = name;
        this.chapterId = chapterId;
    }

    @Override
    public void initGui()
    {
        this.currentChapter = this.getChapterByButton(this.chapterId);
        this.buttonList.add(this.pageBack = new GuiButton(0, (this.width - this.ImageWidth) / 2 + 40, 70, 20, 20,""));
        this.buttonList.add(this.pageForward = new GuiButton(0, (this.width - this.ImageWidth)/2 + 130, 70, 20, 20,""));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.drawPopup();
    }

    private void drawPopup()
    {
        this.fontRendererObj.drawString(this.name, this.ImageWidth/2 + 70, 2 + 16 + 32, 0);
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException
    {
        if (button == this.pageBack)
        {
            currentChapter.SetPreviousPage();
            this.mc.displayGuiScreen(this.previousPage);
        }
        super.actionPerformed(button);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
