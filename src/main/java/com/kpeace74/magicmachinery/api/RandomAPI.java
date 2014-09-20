package com.kpeace74.magicmachinery.api;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
public class RandomAPI {

	public boolean isSmeltable(ItemStack item) {
		if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public ItemStack getSmeltingResult(ItemStack item) {
		if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {
			ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item);
			ItemStack drops = new ItemStack(drop.getItem());
			return drops;
		} else {
			return null;
		}
	}
	
	public String getPlayerUsername(EntityPlayer player) {
		return player.getDisplayName();
	}
	
 
	
	
}
