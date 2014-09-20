package com.kpeace74.magicmachinery.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.kpeace74.magicmachinery.api.EnergyTransfer;

public class TileEntityCombiner extends TileEntityMagicalMachinery {

	public int magicalEnergy;
	public int timer;
	public boolean connected;
	public int getX;
	public int getY;
	public int getZ;
	public int toX;
	public int toY;
	public int toZ;
	
	EnergyTransfer eT = new EnergyTransfer();
	public TileEntityCombiner() {
		timer = 20;
	}
	
	public void updateEntity() {
		if (!worldObj.isRemote && timer == 0 && connected) {
			if (worldObj.getTileEntity(getX, getY, getZ) != null && worldObj.getTileEntity(toX, toY, toZ) != null) {
				eT.energyTransfer(worldObj, getX, getY, getZ, toX, toY, toZ);
				timer = 20;
				//System.out.println(magicalEnergy);
			} else {
				timer = 20;
				connected = false;
			}
		} else if (!worldObj.isRemote && connected == false){
				timer = 20;
		}
		timer--;
	}
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);

		timer = compound.getInteger("timer");
		magicalEnergy = compound.getInteger("magicalEnergy");
		connected = compound.getBoolean("connected");
		getX = compound.getShort("getX");
		getY = compound.getShort("getY");
		getZ = compound.getShort("getZ");
		toX = compound.getShort("toX");
		toY = compound.getShort("toY");
		toZ = compound.getShort("toZ");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);

		compound.setShort("timer", (short)timer);
		compound.setShort("magicalEnergy", (short)magicalEnergy);
		compound.setBoolean("connected", (boolean)connected);
		compound.setShort("getX", (short)getX);
		compound.setShort("getY", (short)getY);
		compound.setShort("getZ", (short)getZ);
		compound.setShort("toX", (short)toX);
		compound.setShort("toY", (short)toY);
		compound.setShort("toZ", (short)toZ);
	}
	
	
}
