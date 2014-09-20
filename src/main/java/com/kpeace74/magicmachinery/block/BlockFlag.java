package com.kpeace74.magicmachinery.block;

import java.util.Random;

import net.minecraft.tileentity.TileEntityEndPortal;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFlag extends BlockMagicMachinery {

	public BlockFlag() {
		super();
		this.setBlockName("flag");
		this.setHardness(1.5F);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon particleIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		for (int i = 0; i < 4; i++) {
			
			float particleX = x + rand.nextFloat();
			float particleY = y + rand.nextFloat();
			float particleZ = z + rand.nextFloat();
			
			float particleMotionX = -0.5F + rand.nextFloat();
			float particleMotionY = -0.5F + rand.nextFloat();
			float particleMotionZ = -0.5F + rand.nextFloat();
			
			
			world.spawnParticle("portal", particleX, particleY, particleZ, particleMotionX, particleMotionY, particleMotionZ);
			
		}
	}
	
}
