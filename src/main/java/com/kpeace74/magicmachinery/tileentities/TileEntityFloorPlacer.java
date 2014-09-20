package com.kpeace74.magicmachinery.tileentities;

import com.kpeace74.magicmachinery.block.BlockHelp;
import com.kpeace74.magicmachinery.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFloorPlacer extends TileEntityMagicalMachinery {
	
	private int timer;
	private Block blockAbove;
	private int next;
	private boolean isReady;
	public TileEntityFloorPlacer() {
		timer = 100;
		next = 1;
		isReady = false;
	}
	
	@Override
	public void updateEntity() {
		if (!worldObj.isAirBlock(xCoord, yCoord + 1, zCoord) && isReady == false) {
			blockAbove = worldObj.getBlock(xCoord, yCoord + 1, zCoord);
			isReady = true;
		
		} else if (timer == 0 && !worldObj.isRemote) {
			spread(xCoord + next, yCoord, zCoord);
			spread(xCoord - next, yCoord, zCoord);
			spread(xCoord, yCoord, zCoord + next);
			spread(xCoord, yCoord, zCoord - next);
			for (int i = 1; i <= next; i++) {
				spread(xCoord + next, yCoord, zCoord + i);
				spread(xCoord + next, yCoord, zCoord - i);
				spread(xCoord - next, yCoord, zCoord + i);
				spread(xCoord - next, yCoord, zCoord - i);
				spread(xCoord + i, yCoord, zCoord + next);
				spread(xCoord + i, yCoord, zCoord - next);
				spread(xCoord - i, yCoord, zCoord + next);
				spread(xCoord - i, yCoord, zCoord - next);
			}
			next = next + 1;
			timer = 100;
		}
		
		timer--;
	}
	
	
	private void spread(int xpos, int ypos, int zpos) {
		if (worldObj.isAirBlock(xpos, ypos, zpos) && isReady == true) {
			worldObj.setBlock(xpos, ypos, zpos, blockAbove);
		}
	}

}
