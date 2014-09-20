package com.kpeace74.magicmachinery.api;

import com.kpeace74.magicmachinery.tileentities.TileEntityAliquamMagicis;
import com.kpeace74.magicmachinery.tileentities.TileEntityBomb;
import com.kpeace74.magicmachinery.tileentities.TileEntityFloorPlacer;
import com.kpeace74.magicmachinery.tileentities.TileEntityMagicalMachinery;
import com.kpeace74.magicmachinery.tileentities.TileEntityMagicalReceptor;
import com.kpeace74.magicmachinery.tileentities.TileEntityCombiner;

import net.minecraft.world.World;

public class GettingTileEntity {

	public static String getMagicTileEntity(World world, int x, int y, int z) {
		if (world.getTileEntity(x, y, z) instanceof TileEntityMagicalReceptor) {
			return "magicalReceptor";
		} else if (world.getTileEntity(x, y, z) instanceof TileEntityAliquamMagicis) {
			return "aliquamMagicis";
		} else if (world.getTileEntity(x, y, z) instanceof TileEntityBomb) {
			return "bomb"; 
		} else if (world.getTileEntity(x, y, z) instanceof TileEntityFloorPlacer) {
			return "floorPlacer";
		} else if (world.getTileEntity(x, y, z) instanceof TileEntityCombiner) {
			return "combiner";
		} else {
			return null;
		}
	}
	
	public boolean canTransfer(String s) {
		if (s == "magicalReceptor" || s == "aliquamMagicis") {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean canAccept(String s) {
		if (s == "aliquamMagicis" || s == "bomb" || s == "floorPlacer") {
			return true;
		} else {
			return false;
		}
	}
	

	
}

