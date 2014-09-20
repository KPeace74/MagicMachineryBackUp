package com.kpeace74.magicmachinery.proxy;

import com.kpeace74.magicmachinery.handler.TMGuiHandler;
import com.kpeace74.magicmachinery.referance.Referance;

import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiProxy {

	public static void registerNetworkStuff() {
		NetworkRegistry.INSTANCE.registerGuiHandler(Referance.MOD_ID, new TMGuiHandler());
	}
	
}
