package com.kpeace74.magicmachinery.init;

import net.minecraft.block.Block;

import com.kpeace74.magicmachinery.block.BlockAliquamMagicis;
import com.kpeace74.magicmachinery.block.BlockBomb;
import com.kpeace74.magicmachinery.block.BlockCombiner;
import com.kpeace74.magicmachinery.block.BlockCorruptDiamondBlock;
import com.kpeace74.magicmachinery.block.BlockEnergizedStone;
import com.kpeace74.magicmachinery.block.BlockFermenter;
import com.kpeace74.magicmachinery.block.BlockFlag;
import com.kpeace74.magicmachinery.block.BlockFloorPlacer;
import com.kpeace74.magicmachinery.block.BlockHardenedChest;
import com.kpeace74.magicmachinery.block.BlockHardenedWood;
import com.kpeace74.magicmachinery.block.BlockImbuedDiamondBlock;
import com.kpeace74.magicmachinery.block.BlockMachine;
import com.kpeace74.magicmachinery.block.BlockMagicMachinery;
import com.kpeace74.magicmachinery.block.BlockMagicalReceptor;
import com.kpeace74.magicmachinery.block.BlockPlayerAltar;
import com.kpeace74.magicmachinery.block.BlockPoleTest;
import com.kpeace74.magicmachinery.block.BlockTestBlock;
import com.kpeace74.magicmachinery.block.BlockTheStoneOfEnergization;
import com.kpeace74.magicmachinery.referance.Referance;

import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Referance.MOD_ID)
public class ModBlocks {

	public static final BlockMagicMachinery flag = new BlockFlag();
	public static final BlockMagicMachinery machine = new BlockMachine();
	public static final BlockMagicMachinery imbuedDiamondBlock = new BlockImbuedDiamondBlock();
	public static final Block theStoneOfEnergization = new BlockTheStoneOfEnergization();
	public static final BlockMagicMachinery energizedStone = new BlockEnergizedStone();
	public static final BlockMagicMachinery poleTest = new BlockPoleTest();
	public static final Block bomb = new BlockBomb();
	public static final Block magicalReceptor = new BlockMagicalReceptor();
	public static final Block aliquamMagicis = new BlockAliquamMagicis();
	public static final Block floorPlacer = new BlockFloorPlacer();
	public static final BlockMagicMachinery hardenedWood = new BlockHardenedWood();
	public static final Block combiner = new BlockCombiner();
	public static final Block hardenedChest = new BlockHardenedChest(0);
	public static final Block testBlock = new BlockTestBlock();
	public static final Block fermenter = new BlockFermenter();
	public static final Block playerAltar = new BlockPlayerAltar();
	public static final Block corruptDiamondBlock = new BlockCorruptDiamondBlock();
	
	public static void init() {
		GameRegistry.registerBlock(flag, "flag");
		GameRegistry.registerBlock(machine, "machine");
		GameRegistry.registerBlock(imbuedDiamondBlock, "imbuedDiamondBlock");
		GameRegistry.registerBlock(theStoneOfEnergization, "theStoneOfEnergization");
		GameRegistry.registerBlock(floorPlacer, "floorPlacer");
		GameRegistry.registerBlock(energizedStone, "energizedStone");
		GameRegistry.registerBlock(poleTest, "poleTest");
		GameRegistry.registerBlock(bomb, "bomb");
		GameRegistry.registerBlock(magicalReceptor, "magicalReceptor");
		GameRegistry.registerBlock(aliquamMagicis, "aliquamMagicis");
		GameRegistry.registerBlock(hardenedWood, "hardenedWood");
		GameRegistry.registerBlock(combiner, "combiner");
		GameRegistry.registerBlock(hardenedChest, "hardenedChest");
		GameRegistry.registerBlock(testBlock, "testBlock");
		GameRegistry.registerBlock(fermenter, "fermenter");
		GameRegistry.registerBlock(playerAltar, "playerAltar");
		GameRegistry.registerBlock(corruptDiamondBlock, "corruptDiamondBlock");
		
	}
	
	
}
