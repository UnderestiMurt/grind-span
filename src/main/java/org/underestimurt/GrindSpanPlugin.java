package org.underestimurt;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

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

	@Override
	protected void startUp() throws Exception
	{

	}

	@Override
	protected void shutDown() throws Exception
	{

	}

	@Provides
	GrindSpanConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GrindSpanConfig.class);
	}
}
