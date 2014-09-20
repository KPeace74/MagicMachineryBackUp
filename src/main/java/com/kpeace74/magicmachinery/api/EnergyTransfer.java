package com.kpeace74.magicmachinery.api;

import com.kpeace74.magicmachinery.handler.ConfigurationHandler;
import com.kpeace74.magicmachinery.tileentities.TileEntityAliquamMagicis;
import com.kpeace74.magicmachinery.tileentities.TileEntityMagicalMachinery;
import com.kpeace74.magicmachinery.tileentities.TileEntityMagicalReceptor;
import com.kpeace74.magicmachinery.tileentities.TileEntityCombiner;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class EnergyTransfer {
	
	public int timer;
	public String getTile;
	public String toTile;
	public int maxStorage;
	public int maxStorageCombiner = 50000;
	public static int transferRate = ConfigurationHandler.transferRate;
	
	public EnergyTransfer() {
		timer = 20;
	}
	
	public void energyTransfer(World world, int x, int y, int z, int x2, int y2, int z2) {
		getTile = GettingTileEntity.getMagicTileEntity(world, x, y, z);
		toTile = GettingTileEntity.getMagicTileEntity(world, x2, y2, z2);
		System.out.println("Energy");
		//System.out.println(getTile);
		//System.out.println(toTile);
		if (getTile == "magicalReceptor") {
			TileEntityMagicalReceptor tile1 = (TileEntityMagicalReceptor)world.getTileEntity(x, y, z);
			if (toTile == "aliquamMagicis") {
				TileEntityAliquamMagicis tile2 = (TileEntityAliquamMagicis)world.getTileEntity(x2, y2, z2);
				if (tile2.magicalEnergy <= 100000 - transferRate && tile1.magicalEnergy >= transferRate) {
					tile2.magicalEnergy = tile2.magicalEnergy + transferRate;
					tile1.magicalEnergy = tile1.magicalEnergy - transferRate;
					timer = 20;
				} else if (tile2.magicalEnergy > 100000 - transferRate && tile2.magicalEnergy < 100000 && tile1.magicalEnergy <= 100000 - tile2.magicalEnergy) {
					int newMag = 100000 - tile2.magicalEnergy;
					tile2.magicalEnergy = 100000;
					tile1.magicalEnergy = tile1.magicalEnergy - newMag;
					timer = 20;
				} else if (tile1.magicalEnergy + tile2.magicalEnergy <= 100000 && tile1.magicalEnergy < transferRate) {
					tile2.magicalEnergy = tile2.magicalEnergy + tile1.magicalEnergy;
					tile1.magicalEnergy = 0;
					timer = 20;
				} else {timer = 20; }
			} else if (toTile == "combiner") {
				TileEntityCombiner tile2 = (TileEntityCombiner)world.getTileEntity(x2, y2, z2);
				if (tile2.magicalEnergy <= maxStorageCombiner - transferRate && tile1.magicalEnergy >= transferRate) {
					tile2.magicalEnergy = tile2.magicalEnergy + transferRate;
					tile1.magicalEnergy = tile1.magicalEnergy - transferRate;
					timer = 20;
				} else if (tile2.magicalEnergy > maxStorageCombiner - transferRate && tile2.magicalEnergy < maxStorageCombiner && tile1.magicalEnergy <= maxStorageCombiner - tile2.magicalEnergy) {
					int newMag = maxStorageCombiner - tile2.magicalEnergy;
					tile2.magicalEnergy = maxStorageCombiner;
					tile1.magicalEnergy = tile1.magicalEnergy - newMag;
					timer = 20;
				} else if (tile1.magicalEnergy + tile2.magicalEnergy <= maxStorageCombiner && tile1.magicalEnergy < transferRate) {
					tile2.magicalEnergy = tile2.magicalEnergy + tile1.magicalEnergy;
					tile1.magicalEnergy = 0;
					timer = 20;
				} else {timer = 20; }
				 
			}else { timer = 20; }
		} else if (getTile == "aliquamMagicis") {
			TileEntityAliquamMagicis tile1 = (TileEntityAliquamMagicis)world.getTileEntity(x, y, z);
			if (toTile == "aliquamMagicis") {
				TileEntityAliquamMagicis tile2 = (TileEntityAliquamMagicis)world.getTileEntity(x2, y2, z2);
				if (tile2.magicalEnergy <= 100000 - transferRate && tile1.magicalEnergy >= transferRate) {
					tile2.magicalEnergy = tile2.magicalEnergy + transferRate;
					tile1.magicalEnergy = tile1.magicalEnergy - transferRate;
					timer = 20;
				} else if (tile2.magicalEnergy > 100000 - transferRate && tile2.magicalEnergy < 100000 && tile1.magicalEnergy <= 100000 - tile2.magicalEnergy) {
					int newMag = 100000 - tile2.magicalEnergy;
					tile2.magicalEnergy = 100000;
					tile1.magicalEnergy = tile1.magicalEnergy - newMag;
					timer = 20;
				} else if (tile1.magicalEnergy + tile2.magicalEnergy <= 100000 && tile1.magicalEnergy < transferRate) {
					tile2.magicalEnergy = tile2.magicalEnergy + tile1.magicalEnergy;
					tile1.magicalEnergy = 0;
					timer = 20;
				} else {timer = 20; }
			} else if (toTile == "combiner") {
				TileEntityCombiner tile2 = (TileEntityCombiner)world.getTileEntity(x2, y2, z2);
				if (tile2.magicalEnergy <= maxStorageCombiner - transferRate && tile1.magicalEnergy >= transferRate) {
					tile2.magicalEnergy = tile2.magicalEnergy + transferRate;
					tile1.magicalEnergy = tile1.magicalEnergy - transferRate;
					timer = 20;
				} else if (tile2.magicalEnergy > maxStorageCombiner - transferRate && tile2.magicalEnergy < maxStorageCombiner && tile1.magicalEnergy <= maxStorageCombiner - tile2.magicalEnergy) {
					int newMag = maxStorageCombiner - tile2.magicalEnergy;
					tile2.magicalEnergy = maxStorageCombiner;
					tile1.magicalEnergy = tile1.magicalEnergy - newMag;
					timer = 20;
				} else if (tile1.magicalEnergy + tile2.magicalEnergy <= maxStorageCombiner && tile1.magicalEnergy < transferRate) {
					tile2.magicalEnergy = tile2.magicalEnergy + tile1.magicalEnergy;
					tile1.magicalEnergy = 0;
					timer = 20;
				} else {timer = 20; }
				
			} else { timer = 20; }
		}
	}
	
	
}