package com.kpeace74.magicmachinery.proxy;

import com.kpeace74.magicmachinery.client.settings.KeyBindings;

import net.minecraft.client.settings.KeyBinding;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerKeyBindings() {
		
		ClientRegistry.registerKeyBinding(KeyBindings.charge);
		ClientRegistry.registerKeyBinding(KeyBindings.release);
		
		
	}

}
