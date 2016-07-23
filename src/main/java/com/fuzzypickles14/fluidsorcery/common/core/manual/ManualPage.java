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

    public ManualPage(GuiScreen previousPage)
    {
        this.previousPage = previousPage;
    }
    @Override
    public void initGui()
    {
        this.buttonList.add(this.pageBack = new GuiButton(0, this.ImageWidth / 2 + 60, 150, 20, 20,""));
        this.buttonList.add(this.pageForward = new GuiButton(0, this.ImageWidth / 2 + 150, 150, 20, 20,""));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.drawPopup();
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
            this.mc.displayGuiScreen(previousPage);
        }
    }
}
