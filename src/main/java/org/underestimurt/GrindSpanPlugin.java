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

import java.awt.image.BufferedImage;

@Slf4j
@PluginDescriptor(
	name = "Grind Span"
)
public class GrindSpanPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private GrindSpanConfig config;

	@Inject
	private ClientToolbar clientToolbar;

	private GrindSpanPanel panel;
	private NavigationButton navButton;

	@Override
	protected void startUp() throws Exception
	{
		panel = injector.getInstance(GrindSpanPanel.class);

		final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "clock.png");

		navButton = NavigationButton.builder()
				.tooltip("Grind Span")
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
	GrindSpanConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GrindSpanConfig.class);
	}
}
