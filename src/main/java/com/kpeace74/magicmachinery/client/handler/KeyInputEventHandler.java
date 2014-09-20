package com.kpeace74.magicmachinery.client.handler;

import com.kpeace74.magicmachinery.client.settings.KeyBindings;
import com.kpeace74.magicmachinery.referance.Key;
import com.kpeace74.magicmachinery.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {

	private static Key getPressedKeybinding() {
		if (KeyBindings.charge.isPressed()) {
			return Key.CHARGE;
		} else if (KeyBindings.release.isPressed()) {
			return Key.RELEASE;
		} 
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
		
		//LogHelper.info(getPressedKeybinding());
		
	}
	
}
