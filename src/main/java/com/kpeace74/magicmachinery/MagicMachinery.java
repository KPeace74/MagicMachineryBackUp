package com.kpeace74.magicmachinery;

import net.minecraft.util.DamageSource;
import net.minecraftforge.oredict.OreDictionary;

import com.kpeace74.magicmachinery.client.handler.KeyInputEventHandler;
import com.kpeace74.magicmachinery.handler.ConfigurationHandler;
import com.kpeace74.magicmachinery.handler.GenerationHandler;
import com.kpeace74.magicmachinery.init.ModBlocks;
import com.kpeace74.magicmachinery.init.ModItems;
import com.kpeace74.magicmachinery.init.ModTileEntities;
import com.kpeace74.magicmachinery.init.Recipes;
import com.kpeace74.magicmachinery.proxy.GuiProxy;
import com.kpeace74.magicmachinery.proxy.IProxy;
import com.kpeace74.magicmachinery.referance.Referance;
import com.kpeace74.magicmachinery.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Referance.MOD_ID, name = Referance.MOD_NAME, version = Referance.VERSION, guiFactory = Referance.GUI_FACTORY_CLASS)
public class MagicMachinery {
	
	public static DamageSource behead = (new DamageSource("behead")).setDamageBypassesArmor().setDamageIsAbsolute();
	public static DamageSource banned = (new DamageSource("banned")).setDamageBypassesArmor().setDamageIsAbsolute();
	public static DamageSource bannedSelf = (new DamageSource("banned")).setDamageBypassesArmor().setDamageIsAbsolute();
	
	@Mod.Instance(Referance.MOD_ID)
	public static MagicMachinery instance;
	
	@SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	// Load Network Handling, Mod Config., Items and Blocks
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LogHelper.info("Why couldn't the explorer find his map?");

		
		proxy.registerKeyBindings();
		
		LanguageRegistry.instance().addStringLocalization("death.attack.behead","%1$s cut off their own head!");
		LanguageRegistry.instance().addStringLocalization("death.attack.banned","%1$s has been banned!");
		LanguageRegistry.instance().addStringLocalization("death.attack.bannedSelf","%1$s has been banned themselves!");
		
		ModItems.init();
		
		ModBlocks.init();
		
		ModTileEntities.init();
		
		new GenerationHandler();
		
		LogHelper.info("Pre Initialization Complete!");
		
		
	}
	
	//Register GUI's, Tile Entities, Crafting Recipes, General Event Handlers
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		GuiProxy.registerNetworkStuff();
		
		Recipes.init();
		
		LogHelper.info("Initialization Complete!");
		
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		
	}
	
	//Rap things up, do things after other mods have done important stuff
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("Post Initialization Complete!");
		LogHelper.info("Because he lost his map!");
		
		for (String oreName : OreDictionary.getOreNames()) {
			LogHelper.info(oreName);
		}
	}
	
}

