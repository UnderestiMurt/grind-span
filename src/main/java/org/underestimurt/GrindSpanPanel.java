package org.underestimurt;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

@Slf4j
public class GrindSpanPanel extends PluginPanel {

    public GrindSpanPanel()
    {
        super(false);

        setLayout(new BorderLayout());
        setBackground(ColorScheme.DARK_GRAY_COLOR);
    }
}
