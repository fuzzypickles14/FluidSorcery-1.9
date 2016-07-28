package com.fuzzypickles14.fluidsorcery.common.core.manual.button;

import com.fuzzypickles14.fluidsorcery.common.lib.LibModDetails;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Andrew Toomey on 7/27/2016.
 */
public class PageForwardButton extends PageBackButton {
    private static final ResourceLocation buttonTextures = new ResourceLocation(LibModDetails.MOD_ID + ":textures/gui/ManualGui.png");

    public PageForwardButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText) {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
        this.ImageHeight = 194;
    }
}
