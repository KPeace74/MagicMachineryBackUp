package com.kpeace74.magicmachinery.rituallayout;

import net.minecraft.world.World;

import com.kpeace74.magicmachinery.block.BlockEnergizedStone;

public class Layouts {

	public boolean rsp(World w, int x, int y, int z) {
		if (w.getBlock(x, y, z) instanceof BlockEnergizedStone) {
		return true;
		} else {return false; }
	}
	
	
}
