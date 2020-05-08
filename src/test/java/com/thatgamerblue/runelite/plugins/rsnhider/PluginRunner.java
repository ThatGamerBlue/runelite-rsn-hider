package com.thatgamerblue.runelite.plugins.rsnhider;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PluginRunner
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(RsnHiderPlugin.class);
		RuneLite.main(args);
	}
}