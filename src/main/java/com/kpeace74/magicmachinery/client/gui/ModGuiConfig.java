package com.kpeace74.magicmachinery.client.gui;

import java.util.List;
import com.kpeace74.magicmachinery.*;
import com.kpeace74.magicmachinery.handler.ConfigurationHandler;
import com.kpeace74.magicmachinery.referance.Referance;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig {

	public ModGuiConfig(GuiScreen guiScreen) {
		
		super(guiScreen, 
				new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), 
				Referance.MOD_ID, 
				false, 
				false, 
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}

}
