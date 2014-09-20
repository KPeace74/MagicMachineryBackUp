package com.kpeace74.magicmachinery.tileentities;

import net.minecraft.tileentity.TileEntity;

public abstract class TileEntityMagicalMachinery extends TileEntity {

	public boolean canTransferEnergy;
	public boolean canAcceptEnergy;
	
	public int magicalEnergy;
	
	public abstract void updateEntity();

	
}
