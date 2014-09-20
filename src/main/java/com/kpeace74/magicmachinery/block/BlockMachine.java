package com.kpeace74.magicmachinery.block;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class BlockMachine extends BlockMagicMachinery {
	
	public BlockMachine() {
		super();
		this.setBlockName("machine");
		setHardness(2F);
		setStepSound(Block.soundTypeMetal);
	}
	
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		
		return false;
	}

}
