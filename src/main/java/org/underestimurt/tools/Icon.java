package org.underestimurt.tools;

import net.runelite.client.util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public enum Icon
{
    GITHUB("github.png"),
    BUY_ME_A_COFFEE("buymeacoffee.png")
    ;

    private final String file;
    Icon(String file) {
        this.file = file;
    }

    public ImageIcon getIcon(int width, int height)
    {
        BufferedImage bufferedImage = ImageUtil.loadImageResource(getClass(), file);
        Image scaledIconImage = bufferedImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        return new ImageIcon(scaledIconImage);
    }
}
