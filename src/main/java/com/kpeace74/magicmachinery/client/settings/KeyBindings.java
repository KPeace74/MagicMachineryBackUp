package com.kpeace74.magicmachinery.client.settings;

import org.lwjgl.input.Keyboard;

import com.ibm.icu.impl.ICUService.Key;
import com.kpeace74.magicmachinery.referance.Names;




import net.minecraft.client.settings.KeyBinding;

public class KeyBindings {

	public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY);
	public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY);
	
}
