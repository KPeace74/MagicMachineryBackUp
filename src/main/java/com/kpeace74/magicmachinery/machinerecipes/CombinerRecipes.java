package com.kpeace74.magicmachinery.machinerecipes;

import com.kpeace74.magicmachinery.init.ModBlocks;
import com.kpeace74.magicmachinery.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CombinerRecipes {

	ItemStack combiner = new ItemStack(ModBlocks.combiner);
	ItemStack flag = new ItemStack(ModBlocks.flag);
	ItemStack stick = new ItemStack(Items.stick);
	
	ItemStack[] input1 = new ItemStack[] {stick};
	ItemStack[] input2 = new ItemStack[] {stick};
	ItemStack[] output = new ItemStack[] {flag};
	
	public CombinerRecipes() {
		Block[] result = new Block[] {Blocks.stone, Blocks.bookshelf, ModBlocks.flag};
	}
	/*
	public ItemStack getCombinerOutput(ItemStack item1, ItemStack item2) {
		for (int i = 0 ; i < input1.length; i++) {
			if (item1 == input1[i] && item2 == input2[i]) {
				return output[i];
			} else {
				return null;
			}
		}
		return null;
	}	
	
	public boolean isValidCombinerRecipe(ItemStack item1, ItemStack item2) {
		for (int i = 0; i < input1.length; i++) {
			if(item1 == input1[i] && item2 == input2[i]) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	*/
}
