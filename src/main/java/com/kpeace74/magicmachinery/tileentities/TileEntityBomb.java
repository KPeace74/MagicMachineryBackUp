package com.kpeace74.magicmachinery.tileentities;

import com.kpeace74.magicmachinery.block.BlockBomb;
import com.kpeace74.magicmachinery.block.BlockMachine;
import com.kpeace74.magicmachinery.init.ModBlocks;
import com.kpeace74.magicmachinery.init.ModTileEntities;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBomb extends TileEntityMagicalMachinery {

	private int timer;
	
	public TileEntityBomb() {
		timer = 100;
	}

	@Override
	public void updateEntity() {
		if(timer==0 && !worldObj.isRemote) {
			spread(xCoord+1, yCoord, zCoord);
			spread(xCoord-1, yCoord, zCoord);
			spread(xCoord, yCoord, zCoord+1);
			spread(xCoord, yCoord, zCoord-1);
		}
		
		timer--;
	}
	
	private void spread(int x, int y, int z) {
		if (worldObj.isAirBlock(x, y, z)) {
			worldObj.setBlock(x, y, z, ModBlocks.bomb);
			
		}
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		
		compound.setShort("Timer", (short)timer);

	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		
		timer = compound.getShort("Timer");

	}
	
	
	
}
