package com.fuzzypickles14.fluidsorcery.common.core.manual.button;

import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Andrew Toomey on 7/27/2016.
 */
public class PageBackButton extends GuiButton {
    private static final ResourceLocation buttonTextures = new ResourceLocation(LibModDetails.MOD_ID + ":textures/gui/ManualGui.png");
    protected int ImageWidth, ImageHeight, ImageWidthChanged;

    public PageBackButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText) {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
        this.ImageWidth = 3;
        this.ImageWidthChanged = 26;
        this.ImageHeight = 207;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY)
    {
        if(this.visible) {
            mc.getTextureManager().bindTexture(buttonTextures);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            int i = this.getHoverState(this.hovered);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.drawTexturedModalRect(this.xPosition, this.yPosition, this.ImageWidth, this.ImageHeight, this.width, this.height);
            if (this.hovered)
                this.drawTexturedModalRect(this.xPosition, this.yPosition, this.ImageWidthChanged, this.ImageHeight, this.width, this.height);
            this.mouseDragged(mc, mouseX, mouseY);
        }
    }
}
