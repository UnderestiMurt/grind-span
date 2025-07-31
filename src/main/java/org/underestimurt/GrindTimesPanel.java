package org.underestimurt;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.LinkBrowser;
import org.underestimurt.tools.Icon;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;

@Slf4j
public class GrindTimesPanel extends PluginPanel {
    public GrindTimesPanel()
    {
        super(false);

        setLayout(new BorderLayout());
        setBackground(ColorScheme.DARK_GRAY_COLOR);

        addTitleBar();
    }

    /**
     * Add the title bar to the layout.
     */
    private void addTitleBar() {
        // Create panel for title bar
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel buttonGrid = new JPanel();
        buttonGrid.setLayout(new GridLayout(1, 2, 5, 0));

        // Create title label and add it to the panel
        JLabel title = new JLabel("Grind Times");
        titlePanel.add(title, BorderLayout.WEST);

        //Create Github button and add it to the panel
        JButton githubButton = new JButton(Icon.GITHUB.getIcon(20, 20));
        githubButton.setToolTipText("Visit the Grind Times Github repository");
        githubButton.addActionListener(
                (e) -> LinkBrowser.browse("https://github.com/UnderestiMurt/grind-times")
        );
        buttonGrid.add(githubButton);

        //Create Buy Me A Coffee button and add it to the panel
        JButton coffeeButton = new JButton(Icon.BUY_ME_A_COFFEE.getIcon(20, 20));
        coffeeButton.setToolTipText("Buy me a coffee");
        coffeeButton.addActionListener(
                (e) -> LinkBrowser.browse("https://coff.ee/underestimurt")
        );
        buttonGrid.add(coffeeButton);

        titlePanel.add(buttonGrid, BorderLayout.EAST);
        add(titlePanel, BorderLayout.NORTH);
    }
}
