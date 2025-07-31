package org.underestimurt;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

import java.awt.*;

@Slf4j
public class GrindTimesPanel extends PluginPanel {

    public GrindTimesPanel()
    {
        super(false);

        setLayout(new BorderLayout());
        setBackground(ColorScheme.DARK_GRAY_COLOR);
    }
}
