package com.kpeace74.magicmachinery.proxy;

import com.kpeace74.magicmachinery.MagicMachinery;
import com.kpeace74.magicmachinery.handler.TMGuiHandler;
import com.kpeace74.magicmachinery.referance.Referance;

import cpw.mods.fml.common.network.NetworkRegistry;

public class ServerProxy extends CommonProxy {

	@Override
	public void registerKeyBindings() {
		// NOOP
		
	}
	
	public void registerNetworkStuff() {
		NetworkRegistry.INSTANCE.registerGuiHandler(MagicMachinery.instance, new TMGuiHandler());
	}

	
}
