package com.kpeace74.magicmachinery.machinerecipes;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.kpeace74.magicmachinery.init.ModBlocks;
import com.kpeace74.magicmachinery.init.ModItems;

public class FermenterRecipes {

	public ItemStack getResult(Item item) {
		if (item == ModItems.heatedMundanePotion) {
			return new ItemStack(Items.apple);
		} else {
			return null;
		}
	}
	
}
