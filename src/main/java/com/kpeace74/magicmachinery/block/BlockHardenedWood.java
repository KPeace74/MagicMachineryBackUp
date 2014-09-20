package com.kpeace74.magicmachinery.block;

import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;

import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockWood;
import net.minecraft.creativetab.CreativeTabs;

public class BlockHardenedWood extends BlockMagicMachinery {
	
	public BlockHardenedWood() {
		super();
		setBlockName("hardenedWood");
		setCreativeTab(CreativeTabMagicMachinery.MAGICMACHINERY_TAB);
		setHardness(2.5F);
		setResistance(18.0F);
	}

}
