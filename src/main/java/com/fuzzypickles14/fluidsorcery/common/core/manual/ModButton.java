package com.fuzzypickles14.fluidsorcery.common.core.manual;

import net.minecraft.client.gui.GuiButton;

/**
 * Created by Andrew Toomey on 7/21/2016.
 */
public class ModButton extends GuiButton {
    public ModButton(int buttonId, int x, int y, String buttonText) {
        super(buttonId, x, y, buttonText);
    }

    public ModButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText)
    {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
    }
}
