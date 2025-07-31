package org.underestimurt;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import org.underestimurt.ui.GrindTimesPanel;

import java.awt.image.BufferedImage;

@Slf4j
@PluginDescriptor(
	name = "Grind Times"
)
public class GrindTimesPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private GrindTimesConfig config;

	@Inject
	private ClientToolbar clientToolbar;

	private GrindTimesPanel panel;
	private NavigationButton navButton;

	@Override
	protected void startUp() throws Exception
	{
		panel = injector.getInstance(GrindTimesPanel.class);

		final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "clock.png");

		navButton = NavigationButton.builder()
				.tooltip("Grind Times")
				.icon(icon)
				.panel(panel)
				.build();

		clientToolbar.addNavigation(navButton);
	}

	@Override
	protected void shutDown() throws Exception
	{
		clientToolbar.removeNavigation(navButton);
	}

	@Provides
	GrindTimesConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GrindTimesConfig.class);
	}
}
