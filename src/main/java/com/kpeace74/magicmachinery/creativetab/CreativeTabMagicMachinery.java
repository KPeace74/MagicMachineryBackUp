package com.kpeace74.magicmachinery.creativetab;

import com.kpeace74.magicmachinery.init.ModItems;
import com.kpeace74.magicmachinery.referance.Referance;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMagicMachinery {

	public static final CreativeTabs MAGICMACHINERY_TAB = new CreativeTabs(Referance.MOD_ID.toLowerCase())  {
		
		@Override
		public Item getTabIconItem() {
			return ModItems.staffOfTheExplorer;
		}
		

	}; 
}
