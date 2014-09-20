package com.kpeace74.magicmachinery.tileentities;

import com.kpeace74.magicmachinery.block.BlockCorruptDiamondBlock;
import com.kpeace74.magicmachinery.block.BlockImbuedDiamondBlock;
import com.kpeace74.magicmachinery.block.BlockMagicalReceptor;
import com.kpeace74.magicmachinery.init.ModBlocks;
import com.kpeace74.magicmachinery.item.ItemEmpoweredStaffOfTheExplorer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class TileEntityMagicalReceptor extends TileEntityMagicalMachinery {
	//BlockMagicalReceptor m = new BlockMagicalReceptor();
	private int timer;
	public int magicalEnergy;
	
	public TileEntityMagicalReceptor() {
		timer = 20;
		//magicalEnergy = 0;
	}
	
	@Override
	public void updateEntity() {
		if (timer == 0 && !worldObj.isRemote) {
				
				
					
					if (worldObj.getBlock(xCoord, yCoord + 1, zCoord) instanceof BlockImbuedDiamondBlock) {
						
						if (worldObj.isDaytime()) {
						
							if (worldObj.canBlockSeeTheSky(xCoord, yCoord + 2, zCoord)) {
						
								if (magicalEnergy <= 20000 - 20) {
									magicalEnergy = magicalEnergy + 20;
									System.out.println(magicalEnergy);
									timer = 20;
								} else if (magicalEnergy > 20000 - 20 && magicalEnergy < 20000) {
									magicalEnergy = 20000-magicalEnergy + magicalEnergy;
									System.out.println(magicalEnergy);
									timer = 20;
								}
						
							} else {
								timer = 20;
							}
						} else {
							timer = 20;
						}
					}else if (worldObj.getBlock(xCoord, yCoord + 1, zCoord) instanceof BlockCorruptDiamondBlock) {
						
						if (!worldObj.isDaytime()) {
						
							if (worldObj.canBlockSeeTheSky(xCoord, yCoord + 2, zCoord)) {
								
								if (magicalEnergy <= 20000 - 20) {
									magicalEnergy = magicalEnergy + 20;
									System.out.println(magicalEnergy);
									timer = 20;
								} else if (magicalEnergy > 20000 - 20 && magicalEnergy < 20000) {
									magicalEnergy = 20000-magicalEnergy + magicalEnergy;
									System.out.println(magicalEnergy);
									timer = 20;
								}
						
							} else {
								timer = 20;
							}
						} else {
							timer = 20;
						}
					} else {
						if (worldObj.isDaytime()) {
							changed();
							if (worldObj.canBlockSeeTheSky(xCoord, yCoord + 1, zCoord)) {
								if (magicalEnergy <= 998) {
									magicalEnergy = magicalEnergy + 2;
									//System.out.println(magicalEnergy);
									
									timer = 20;
									//m.printEnergyToConsole();
								} else if (magicalEnergy == 999) {
									magicalEnergy = magicalEnergy + 1;
									System.out.println(magicalEnergy);
									timer = 20;
								} else if (magicalEnergy > 1000) {
									timer = 20;
								}
							
							} else {
								timer = 20;
							}
						}	
					}
						
		}
		
		timer--;
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		
		compound.setShort("Timer", (short)timer);
		compound.setShort("magicalEnergy", (short)magicalEnergy);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		
		timer = compound.getShort("Timer");
		magicalEnergy = compound.getShort("magicalEnergy");
	}
	
	public void changed() {
		if (worldObj.getBlock(xCoord, yCoord + 1, zCoord) instanceof BlockImbuedDiamondBlock) {
			timer = 20;
			updateEntity();
		} 
	}
	


	
	
	/*
	public void printEnergy() {
		System.out.println(getEnergy());
	}
*/

}