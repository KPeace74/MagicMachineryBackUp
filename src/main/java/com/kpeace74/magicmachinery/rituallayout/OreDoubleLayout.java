package com.kpeace74.magicmachinery.rituallayout;

import net.minecraft.world.World;

public class OreDoubleLayout extends Layouts {

	public String OreDouble(World w, int x, int y, int z) {
		if (
			rsp(w, x, y-2, z) &&
			rsp(w, x, y-1, z) &&
			rsp(w, x, y+1, z) && 
			rsp(w, x, y+2, z) &&
			rsp(w, x+6, y-2, z) &&
			rsp(w, x+6, y-1, z) &&
			rsp(w, x+6, y, z) &&
			rsp(w, x+6, y+1, z) && 
			rsp(w, x+6, y+2, z) &&
			rsp(w, x+1, y-2, z-2) &&
			rsp(w, x+1, y-1, z-2) &&
			rsp(w, x+1, y, z-2) &&
			rsp(w, x+1, y+1, z-2) && 
			rsp(w, x+1, y+2, z-2) &&
			rsp(w, x+1, y-2, z+2) &&
			rsp(w, x+1, y-1, z+2) &&
			rsp(w, x+1, y, z+2) &&
			rsp(w, x+1, y+1, z+2) && 
			rsp(w, x+1, y+2, z+2) &&
			rsp(w, x+5, y-2, z-2) &&
			rsp(w, x+5, y-1, z-2) &&
			rsp(w, x+5, y, z-2) &&
			rsp(w, x+5, y+1, z-2) && 
			rsp(w, x+5, y+2, z-2) &&
			rsp(w, x+5, y-2, z+2) &&
			rsp(w, x+5, y-1, z+2) &&
			rsp(w, x+5, y, z+2) &&
			rsp(w, x+5, y+1, z+2) && 
			rsp(w, x+5, y+2, z+2) &&
			rsp(w, x+3, y-2, z-3) &&
			rsp(w, x+3, y-1, z-3) &&
			rsp(w, x+3, y, z-3) &&
			rsp(w, x+3, y+1, z-3) && 
			rsp(w, x+3, y+2, z-3) &&
			rsp(w, x+3, y-2, z+3) &&
			rsp(w, x+3, y-1, z+3) &&
			rsp(w, x+3, y, z+3) &&
			rsp(w, x+3, y+1, z+3) && 
			rsp(w, x+3, y+2, z+3) &&
			rsp(w, x+1, y-3, z) &&
			rsp(w, x+2, y-3, z-1) &&
			rsp(w, x+2, y-3, z) && 
			rsp(w, x+2, y-3, z+1) &&
			rsp(w, x+3, y-3, z-2) &&
			rsp(w, x+3, y-3, z-1) &&
			rsp(w, x+3, y-3, z) && 
			rsp(w, x+3, y-3, z+1) &&
			rsp(w, x+3, y-3, z+2) &&
			rsp(w, x+4, y-3, z-1) &&
			rsp(w, x+4, y-3, z) &&
			rsp(w, x+4, y-3, z+1) &&
			rsp(w, x+5, y-3, z) &&
			rsp(w, x+1, y+3, z) &&
			rsp(w, x+2, y+3, z-1) &&
			rsp(w, x+2, y+3, z) && 
			rsp(w, x+2, y+3, z+1) &&
			rsp(w, x+3, y+3, z-2) &&
			rsp(w, x+3, y+3, z-1) &&
			rsp(w, x+3, y+3, z) && 
			rsp(w, x+3, y+3, z+1) &&
			rsp(w, x+3, y+3, z+2) &&
			rsp(w, x+4, y+3, z-1) &&
			rsp(w, x+4, y+3, z) &&
			rsp(w, x+4, y+3, z+1) &&
			rsp(w, x+5, y+3, z) 
			) {
			return "East";
		} else if (
				
				rsp(w, x, y-1, z) &&
				rsp(w, x, y-2, z) &&
				rsp(w, x, y+1, z) && 
				rsp(w, x, y+2, z) &&
				rsp(w, x-6, y-2, z) &&
				rsp(w, x-6, y-1, z) &&
				rsp(w, x-6, y, z) &&
				rsp(w, x-6, y+1, z) && 
				rsp(w, x-6, y+2, z) &&
				rsp(w, x-1, y-2, z-2) &&
				rsp(w, x-1, y-1, z-2) &&
				rsp(w, x-1, y, z-2) &&
				rsp(w, x-1, y+1, z-2) && 
				rsp(w, x-1, y+2, z-2) &&
				rsp(w, x-1, y-2, z+2) &&
				rsp(w, x-1, y-1, z+2) &&
				rsp(w, x-1, y, z+2) &&
				rsp(w, x-1, y+1, z+2) && 
				rsp(w, x-1, y+2, z+2) &&
				rsp(w, x-5, y-2, z-2) &&
				rsp(w, x-5, y-1, z-2) &&
				rsp(w, x-5, y, z-2) &&
				rsp(w, x-5, y+1, z-2) && 
				rsp(w, x-5, y+2, z-2) &&
				rsp(w, x-5, y-2, z+2) &&
				rsp(w, x-5, y-1, z+2) &&
				rsp(w, x-5, y, z+2) &&
				rsp(w, x-5, y+1, z+2) && 
				rsp(w, x-5, y+2, z+2) &&
				rsp(w, x-3, y-2, z-3) &&
				rsp(w, x-3, y-1, z-3) &&
				rsp(w, x-3, y, z-3) &&
				rsp(w, x-3, y+1, z-3) && 
				rsp(w, x-3, y+2, z-3) &&
				rsp(w, x-3, y-2, z+3) &&
				rsp(w, x-3, y-1, z+3) &&
				rsp(w, x-3, y, z+3) &&
				rsp(w, x-3, y+1, z+3) && 
				rsp(w, x-3, y+2, z+3) &&
				rsp(w, x-1, y-3, z) &&
				rsp(w, x-2, y-3, z-1) &&
				rsp(w, x-2, y-3, z) && 
				rsp(w, x-2, y-3, z+1) &&
				rsp(w, x-3, y-3, z-2) &&
				rsp(w, x-3, y-3, z-1) &&
				rsp(w, x-3, y-3, z) && 
				rsp(w, x-3, y-3, z+1) &&
				rsp(w, x-3, y-3, z+2) &&
				rsp(w, x-4, y-3, z-1) &&
				rsp(w, x-4, y-3, z) &&
				rsp(w, x-4, y-3, z+1) &&
				rsp(w, x-5, y-3, z) &&
				rsp(w, x-1, y+3, z) &&
				rsp(w, x-2, y+3, z-1) &&
				rsp(w, x-2, y+3, z) && 
				rsp(w, x-2, y+3, z+1) &&
				rsp(w, x-3, y+3, z-2) &&
				rsp(w, x-3, y+3, z-1) &&
				rsp(w, x-3, y+3, z) && 
				rsp(w, x-3, y+3, z+1) &&
				rsp(w, x-3, y+3, z+2) &&
				rsp(w, x-4, y+3, z-1) &&
				rsp(w, x-4, y+3, z) &&
				rsp(w, x-4, y+3, z+1) &&
				rsp(w, x-5, y+3, z) 
				
		) {
			
			return "West";
		
		} else if (
				rsp(w, x, y-2, z) &&
				rsp(w, x, y-1, z) &&
				rsp(w, x, y+1, z) &&
				rsp(w, x, y+2, z) &&
				rsp(w, x, y-2, z-6) &&
				rsp(w, x, y-1, z-6) &&
				rsp(w, x, y, z-6) &&
				rsp(w, x, y+1, z-6) &&
				rsp(w, x, y+2, z-6) &&
				rsp(w, x-2, y-2, z-1) &&
				rsp(w, x-2, y-1, z-1) &&
				rsp(w, x-2, y, z-1) &&
				rsp(w, x-2, y+1, z-1) &&
				rsp(w, x-2, y+2, z-1) &&
				rsp(w, x+2, y-2, z-1) &&
				rsp(w, x+2, y-1, z-1) &&
				rsp(w, x+2, y, z-1) &&
				rsp(w, x+2, y+1, z-1) &&
				rsp(w, x+2, y+2, z-1) &&
				rsp(w, x-2, y-2, z-5) &&
				rsp(w, x-2, y-1, z-5) &&
				rsp(w, x-2, y, z-5) &&
				rsp(w, x-2, y+1, z-5) &&
				rsp(w, x-2, y+2, z-5) &&
				rsp(w, x+2, y-2, z-5) &&
				rsp(w, x+2, y-1, z-5) &&
				rsp(w, x+2, y, z-5) &&
				rsp(w, x+2, y+1, z-5) &&
				rsp(w, x+2, y+2, z-5) &&
				rsp(w, x-3, y-2, z-3) &&
				rsp(w, x-3, y-1, z-3) &&
				rsp(w, x-3, y, z-3) &&
				rsp(w, x-3, y+1, z-3) &&
				rsp(w, x-3, y+2, z-3) &&
				rsp(w, x+3, y-2, z-3) &&
				rsp(w, x+3, y-1, z-3) &&
				rsp(w, x+3, y, z-3) &&
				rsp(w, x+3, y+1, z-3) &&
				rsp(w, x+3, y+2, z-3) &&
				rsp(w, x, y-3, z-1) &&
				rsp(w, x-1, y-3, z-2) &&
				rsp(w, x, y-3, z-2) &&
				rsp(w, x+1, y-3, z-2) &&
				rsp(w, x-2, y-3, z-3) &&
				rsp(w, x-1, y-3, z-3) &&
				rsp(w, x, y-3, z-3) &&
				rsp(w, x+1, y-3, z-3) &&
				rsp(w, x+2, y-3, z-3) &&
				rsp(w, x-1, y-3, z-4) &&
				rsp(w, x, y-3, z-4) &&
				rsp(w, x+1, y-3, z-4) &&
				rsp(w, x, y-3, z-5) &&
				rsp(w, x, y+3, z-1) &&
				rsp(w, x-1, y+3, z-2) &&
				rsp(w, x, y+3, z-2) &&
				rsp(w, x+1, y+3, z-2) &&
				rsp(w, x-2, y+3, z-3) &&
				rsp(w, x-1, y+3, z-3) &&
				rsp(w, x, y+3, z-3) &&
				rsp(w, x+1, y+3, z-3) &&
				rsp(w, x+2, y+3, z-3) &&
				rsp(w, x-1, y+3, z-4) &&
				rsp(w, x, y+3, z-4) &&
				rsp(w, x+1, y+3, z-4) &&
				rsp(w, x, y+3, z-5)
				) { 
			
					return "North";
		
		} else if (
				
				rsp(w, x, y-2, z) &&
				rsp(w, x, y-1, z) &&
				rsp(w, x, y+1, z) &&
				rsp(w, x, y+2, z) &&
				rsp(w, x, y-2, z+6) &&
				rsp(w, x, y-1, z+6) &&
				rsp(w, x, y, z+6) &&
				rsp(w, x, y+1, z+6) &&
				rsp(w, x, y+2, z+6) &&
				rsp(w, x-2, y-2, z+1) &&
				rsp(w, x-2, y-1, z+1) &&
				rsp(w, x-2, y, z+1) &&
				rsp(w, x-2, y+1, z+1) &&
				rsp(w, x-2, y+2, z+1) &&
				rsp(w, x+2, y-2, z+1) &&
				rsp(w, x+2, y-1, z+1) &&
				rsp(w, x+2, y, z+1) &&
				rsp(w, x+2, y+1, z+1) &&
				rsp(w, x+2, y+2, z+1) &&
				rsp(w, x-2, y-2, z+5) &&
				rsp(w, x-2, y-1, z+5) &&
				rsp(w, x-2, y, z+5) &&
				rsp(w, x-2, y+1, z+5) &&
				rsp(w, x-2, y+2, z+5) &&
				rsp(w, x+2, y-2, z+5) &&
				rsp(w, x+2, y-1, z+5) &&
				rsp(w, x+2, y, z+5) &&
				rsp(w, x+2, y+1, z+5) &&
				rsp(w, x+2, y+2, z+5) &&
				rsp(w, x-3, y-2, z+3) &&
				rsp(w, x-3, y-1, z+3) &&
				rsp(w, x-3, y, z+3) &&
				rsp(w, x-3, y+1, z+3) &&
				rsp(w, x-3, y+2, z+3) &&
				rsp(w, x+3, y-2, z+3) &&
				rsp(w, x+3, y-1, z+3) &&
				rsp(w, x+3, y, z+3) &&
				rsp(w, x+3, y+1, z+3) &&
				rsp(w, x+3, y+2, z+3) &&
				rsp(w, x, y-3, z+1) &&
				rsp(w, x-1, y-3, z+2) &&
				rsp(w, x, y-3, z+2) &&
				rsp(w, x+1, y-3, z+2) &&
				rsp(w, x-2, y-3, z+3) &&
				rsp(w, x-1, y-3, z+3) &&
				rsp(w, x, y-3, z+3) &&
				rsp(w, x+1, y-3, z+3) &&
				rsp(w, x+2, y-3, z+3) &&
				rsp(w, x-1, y-3, z+4) &&
				rsp(w, x, y-3, z+4) &&
				rsp(w, x+1, y-3, z+4) &&
				rsp(w, x, y-3, z+5) &&
				rsp(w, x, y+3, z+1) &&
				rsp(w, x-1, y+3, z+2) &&
				rsp(w, x, y+3, z+2) &&
				rsp(w, x+1, y+3, z+2) &&
				rsp(w, x-2, y+3, z+3) &&
				rsp(w, x-1, y+3, z+3) &&
				rsp(w, x, y+3, z+3) &&
				rsp(w, x+1, y+3, z+3) &&
				rsp(w, x+2, y+3, z+3) &&
				rsp(w, x-1, y+3, z+4) &&
				rsp(w, x, y+3, z+4) &&
				rsp(w, x+1, y+3, z+4) &&
				rsp(w, x, y+3, z+5)
				
				) {
			
			return "South";
		
		} else { return "NotNorth"; }
	}
	
}
