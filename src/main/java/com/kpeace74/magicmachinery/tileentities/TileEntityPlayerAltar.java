package com.kpeace74.magicmachinery.tileentities;

import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockGlass;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.kpeace74.magicmachinery.block.BlockAliquamMagicis;
import com.kpeace74.magicmachinery.block.BlockCorruptDiamondBlock;
import com.kpeace74.magicmachinery.block.BlockHardenedWood;
import com.kpeace74.magicmachinery.block.BlockImbuedDiamondBlock;
import com.kpeace74.magicmachinery.block.BlockMagicalReceptor;

public class TileEntityPlayerAltar extends TileEntity {

	public int timer;
	public int magicalEnergy;
	public boolean boundToPlayer;
	public boolean onTopOf;
	public String owner;
	
	public TileEntityPlayerAltar() {
		timer = 20;
	}

	@Override
	public void updateEntity() {
		if (!worldObj.isRemote && boundToPlayer && worldObj.canBlockSeeTheSky(xCoord, yCoord + 5, zCoord)) {
			
			if (worldObj.getBlock(xCoord, yCoord + 3, zCoord) instanceof BlockImbuedDiamondBlock) {
			
				if (worldObj.isDaytime()) {
				
					if (magicalEnergy <= getMaxStorage() - (getProductionRate() / 20)) {
						magicalEnergy = magicalEnergy + (getProductionRate() / 20);
					} else if (magicalEnergy > getMaxStorage() - (getProductionRate() / 20)) {
						magicalEnergy = magicalEnergy + (getMaxStorage() - magicalEnergy);
					}
		
				}
				
			} else if (worldObj.getBlock(xCoord, yCoord + 3, zCoord) instanceof BlockCorruptDiamondBlock) {
				if (!worldObj.isDaytime()) {
					if (magicalEnergy <= getMaxStorage() - (getProductionRate() / 20)) {
						magicalEnergy = magicalEnergy + (getProductionRate() / 20);
					} else if (magicalEnergy > getMaxStorage() - (getProductionRate() / 20)) {
						magicalEnergy = magicalEnergy + (getMaxStorage() - magicalEnergy);
					}
				}
			}
				
		}
	}
	
	
	public EntityPlayer getPlayerBoundTo() {
		if (boundToPlayer) {
			return worldObj.getPlayerEntityByName(owner);
		} else {
			return null;
		}
	}
	
	public int getMaxStorage() {
		int totalAM = 0;
		int maxStorage = 0;
		for (int i = -1; i < 2; i++) {
			if (worldObj.getBlock(xCoord + 1, yCoord - 1, zCoord + i) instanceof BlockAliquamMagicis) {
				totalAM = totalAM + 1;
			}
		}
		for (int i = -1; i < 2; i++) {
			if (worldObj.getBlock(xCoord - 1, yCoord - 1, zCoord + i) instanceof BlockAliquamMagicis) {
				totalAM = totalAM + 1;
			}
		}
		if (worldObj.getBlock(xCoord, yCoord - 1, zCoord + 1) instanceof BlockAliquamMagicis) {
			totalAM = totalAM + 1;
		}
		if (worldObj.getBlock(xCoord, yCoord - 1, zCoord - 1) instanceof BlockAliquamMagicis) {
			totalAM = totalAM + 1;
		}
		maxStorage = totalAM * 20000 + 20000;
		return maxStorage;
	}
	
	public int getProductionRate() {
		int totalMR = 0;
		int productionRate = 0;
		for (int i = -2; i < 3; i++) {
			if (worldObj.getBlock(xCoord + 2, yCoord - 2, zCoord + i) instanceof BlockMagicalReceptor) {
				totalMR = totalMR + 1;
			}
		}
		for (int i = -2; i < 3; i++) {
			if (worldObj.getBlock(xCoord - 2, yCoord - 2, zCoord + i) instanceof BlockMagicalReceptor) {
				totalMR = totalMR + 1;
			}
		}
		for (int i = -1; i < 2; i++) {
			if (worldObj.getBlock(xCoord + i, yCoord - 2, zCoord + 2) instanceof BlockMagicalReceptor) {
				totalMR = totalMR + 1;
			}
		}
		for (int i = -1; i < 2; i++) {
			if (worldObj.getBlock(xCoord + i, yCoord - 2, zCoord - 2) instanceof BlockMagicalReceptor) {
				totalMR = totalMR + 1;
			}
		}
		productionRate = totalMR * 20 + 20;
		return productionRate;
	}
	
	public double getMultiplier() {
		if (productionRateMultiplier() && !productionRateMultiplierTwo()) {
			return 1.5;
		} else if (productionRateMultiplier() && productionRateMultiplierTwo()) {
			return 2;
		} else {
			return 1;
		}
	}
	
	
	public boolean productionRateMultiplier() {
		int blocks = 0;
		if (worldObj.getBlock(xCoord, yCoord + 3, zCoord) instanceof BlockImbuedDiamondBlock || worldObj.getBlock(xCoord, yCoord + 3, zCoord) instanceof BlockCorruptDiamondBlock) {
			blocks = blocks + 1;
		}
		for (int i = -2; i < 3; i++) {
			if (worldObj.getBlock(xCoord + 5, yCoord + i, zCoord) instanceof BlockHardenedWood) {
				blocks = blocks + 1;
			}
			if (worldObj.getBlock(xCoord - 5, yCoord + i, zCoord) instanceof BlockHardenedWood) {
				blocks = blocks + 1;
			}
			if (worldObj.getBlock(xCoord, yCoord + i, zCoord + 5) instanceof BlockHardenedWood) {
				blocks = blocks + 1;
			}
			if (worldObj.getBlock(xCoord, yCoord + i, zCoord - 5) instanceof BlockHardenedWood) {
				blocks = blocks + 1;
			}
		}
		for (int i = 1; i < 5; i++) {
			if (worldObj.getBlock(xCoord + i, yCoord + 3, zCoord) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord - i, yCoord + 3, zCoord) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord, yCoord + 3, zCoord + i) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord, yCoord + 3, zCoord - i) instanceof BlockHardenedWood) {
				blocks++;
			}
		}
		for (int i = -1; i < 2; i++) {
			if (worldObj.getBlock(xCoord + i, yCoord + 3, zCoord - 5) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord + i, yCoord + 3, zCoord + 5) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord + 5, yCoord + 3, zCoord + i) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord - 5, yCoord + 3, zCoord + i) instanceof BlockHardenedWood) {
				blocks++;
			}
		}
		for (int i = 2; i < 4; i++) {
			if (worldObj.getBlock(xCoord + i, yCoord + 3, zCoord + 4) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord - i, yCoord + 3, zCoord + 4) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord + i, yCoord + 3, zCoord - 4) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord - i, yCoord + 3, zCoord - 4) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord + 4, yCoord + 3, zCoord + i) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord + 4, yCoord + 3, zCoord - i) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord - 4, yCoord + 3, zCoord + i) instanceof BlockHardenedWood) {
				blocks++;
			}
			if (worldObj.getBlock(xCoord - 4, yCoord + 3, zCoord - i) instanceof BlockHardenedWood) {
				blocks++;
			}
		}
		if (blocks == 65) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean productionRateMultiplierTwo() {
		int y = yCoord + 3;
		int x = xCoord;
		int z = zCoord;
		int block = 0;
		World world = worldObj;
		for (int i = 1; i < 3; i++) {
			if (world.getBlock(x + 5, y + i, z) instanceof BlockHardenedWood) {
				block++;
			}
			if (world.getBlock(x - 5, y + i, z) instanceof BlockHardenedWood) {
				block++;
			}
			if (world.getBlock(x, y + i, z + 5) instanceof BlockHardenedWood) {
				block++;
			}
			if (world.getBlock(x, y + i, z - 5) instanceof BlockHardenedWood) {
				block++;
			}
		}
		if (world.getBlock(x, y + 3, z - 4) instanceof BlockHardenedWood) {
			block++;
		}
		if (world.getBlock(x, y + 3, z + 4) instanceof BlockHardenedWood) {
			block++;
		}
		if (world.getBlock(x - 4, y + 3, z) instanceof BlockHardenedWood) {
			block++;
		}
		if (world.getBlock(x + 4, y + 3, z) instanceof BlockHardenedWood) {
			block++;
		}
		if (world.getBlock(x, y + 4, z - 3) instanceof BlockHardenedWood) {
			block++;
		}
		if (world.getBlock(x, y + 4, z + 3) instanceof BlockHardenedWood) {
			block++;
		}
		if (world.getBlock(x - 3, y + 4, z) instanceof BlockHardenedWood) {
			block++;
		}
		if (world.getBlock(x + 3, y + 4, z) instanceof BlockHardenedWood) {
			block++;
		}
		for (int i = 1; i < 3; i++) {
			if (world.getBlock(x + i, y + 5, z) instanceof BlockHardenedWood) {
				block++;
			}
			if (world.getBlock(x - i, y + 5, z) instanceof BlockHardenedWood) {
				block++;
			}
			if (world.getBlock(x, y + 5, z + i) instanceof BlockHardenedWood) {
				block++;
			}
			if (world.getBlock(x, y + 5, z - i) instanceof BlockHardenedWood) {
				block++;
			}
		}
		if (world.getBlock(x, y + 5, z) instanceof BlockBeacon) {
			block++;
		}
		if (block == 25) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		
		compound.setShort("Timer", (short)timer);
		compound.setShort("magicalEnergy", (short)magicalEnergy);
		compound.setBoolean("bound", (boolean)boundToPlayer);
		compound.setString("owner", (String)owner);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		
		timer = compound.getShort("Timer");
		magicalEnergy = compound.getShort("magicalEnergy");
		boundToPlayer = compound.getBoolean("bound");
		owner = compound.getString("owner");
	}
	
}
