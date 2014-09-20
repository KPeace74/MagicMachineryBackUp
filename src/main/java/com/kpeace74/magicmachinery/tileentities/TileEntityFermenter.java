package com.kpeace74.magicmachinery.tileentities;

import com.kpeace74.magicmachinery.init.ModBlocks;
import com.kpeace74.magicmachinery.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityFermenter extends TileEntity {

	public boolean containsItem;
	public boolean containsFluid;
	public boolean itemFinished;
	public ItemStack currentItem;
	public String itemStored;
	public int fermentTime;
	
	
	public TileEntityFermenter() {
		fermentTime = 100;
	}
	
	public ItemStack getStoredItem() {
		getStoredItemString();
		System.out.println(containsItem);
		if (containsItem) {
			System.out.println(currentItem);
			return currentItem;
		} else {
			return null;
		}
	}
	
	
	public void getStoredItemString() {
		String popcorn = itemStored;
		System.out.println(popcorn);
		if (popcorn.equals("null")) {
			
			currentItem = null;
			
		} else if (popcorn.equals("mundane")) {
			
			currentItem = new ItemStack(ModItems.heatedMundanePotion);
			
		} else if (popcorn == "final") {
			
			currentItem = new ItemStack(ModBlocks.flag);
			
		} else {
			
			currentItem = null;
			
		}
	}
	
	public void updateEntity() {
		
		if (containsItem && containsFluid && !worldObj.isRemote && fermentTime == 0) {
			System.out.println("Going");
			containsItem = false;
			containsFluid = false;
			itemStored = "final";
			currentItem = new ItemStack(ModBlocks.flag);
			containsItem = true;
			itemFinished = true;
			fermentTime = 100;
		}
		
		if (containsItem && containsFluid) {
			fermentTime--;
		} else {
			fermentTime = 100;
		}
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		
		containsItem = compound.getBoolean("containsItem");
		containsFluid = compound.getBoolean("containsFluid");
		fermentTime = compound.getShort("fermentTime");
		itemStored = compound.getString("itemStored");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		
		compound.setShort("fermentTime", (short)fermentTime);
		compound.setBoolean("containsItem", (boolean)containsItem);
		compound.setBoolean("containsFluid", (boolean)containsFluid);
		compound.setString("itemStored", (String)itemStored);
		
	}
	
}
