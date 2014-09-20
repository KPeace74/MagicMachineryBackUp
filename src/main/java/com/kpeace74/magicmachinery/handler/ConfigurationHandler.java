package com.kpeace74.magicmachinery.handler;

import java.io.File;

import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import com.kpeace74.magicmachinery.referance.ConfigCategories;
import com.kpeace74.magicmachinery.referance.Referance;

public class ConfigurationHandler {

	public static Configuration configuration;
	public static boolean testValue = false;
	public static int transferRate = 20;
	public static boolean banHammerActive;
	
	public static void init(File configFile) {
		//Create the config object from the given configuration file
		if(configuration == null) {
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		
		if (event.modID.equalsIgnoreCase(Referance.MOD_ID)) {
			loadConfiguration();
		}
		
	}
	
	private static void loadConfiguration() {
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, true, "Test Value");
		transferRate = configuration.getInt("Transfer Rate", ConfigCategories.ENERGY, 20, 0, 1000, "Rate at Which Energy Can be Transferred Between Machines");
		banHammerActive = configuration.getBoolean("banHammerActive", Configuration.CATEGORY_GENERAL, true, "Change this to false if you don't want The Ban Hammer to be able to ban people.");
		
		if (configuration.hasChanged()) {
			configuration.save();
		}
	
	}
	
}
