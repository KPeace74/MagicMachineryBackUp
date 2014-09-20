package com.kpeace74.magicmachinery.init;

import net.minecraft.block.Block;

import com.kpeace74.magicmachinery.block.BlockAliquamMagicis;
import com.kpeace74.magicmachinery.block.BlockBomb;
import com.kpeace74.magicmachinery.block.BlockCombiner;
import com.kpeace74.magicmachinery.block.BlockFermenter;
import com.kpeace74.magicmachinery.block.BlockFloorPlacer;
import com.kpeace74.magicmachinery.block.BlockHardenedChest;
import com.kpeace74.magicmachinery.block.BlockMagicalReceptor;
import com.kpeace74.magicmachinery.block.BlockPlayerAltar;
import com.kpeace74.magicmachinery.block.BlockTheStoneOfEnergization;
import com.kpeace74.magicmachinery.referance.Referance;
import com.kpeace74.magicmachinery.tileentities.TileEntityAliquamMagicis;
import com.kpeace74.magicmachinery.tileentities.TileEntityBomb;
import com.kpeace74.magicmachinery.tileentities.TileEntityCombiner;
import com.kpeace74.magicmachinery.tileentities.TileEntityFermenter;
import com.kpeace74.magicmachinery.tileentities.TileEntityFloorPlacer;
import com.kpeace74.magicmachinery.tileentities.TileEntityHardenedChest;
import com.kpeace74.magicmachinery.tileentities.TileEntityMagicalReceptor;
import com.kpeace74.magicmachinery.tileentities.TileEntityPlayerAltar;
import com.kpeace74.magicmachinery.tileentities.TileEntityTheStoneOfEnergization;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@GameRegistry.ObjectHolder(Referance.MOD_ID)
public class ModTileEntities {
	public static Block bomb = new BlockBomb();
	public static Block magicalReceptor = new BlockMagicalReceptor();
	public static Block aliquamMagicis = new BlockAliquamMagicis();
	public static Block floorPlacer = new BlockFloorPlacer();
	public static Block theStoneOfEnergization = new BlockTheStoneOfEnergization();
	public static Block hardenedChest = new BlockHardenedChest(0);
	public static Block combiner = new BlockCombiner();
	public static Block fermenter = new BlockFermenter();
	public static Block playerAltar = new BlockPlayerAltar();
	
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityBomb.class, "bomb");
		GameRegistry.registerTileEntity(TileEntityMagicalReceptor.class, "magicalReceptor");
		GameRegistry.registerTileEntity(TileEntityAliquamMagicis.class, "aliquamMagicis");
		GameRegistry.registerTileEntity(TileEntityFloorPlacer.class, "floorPlacer");
		GameRegistry.registerTileEntity(TileEntityTheStoneOfEnergization.class, "theStoneOfEnergization");
		GameRegistry.registerTileEntity(TileEntityHardenedChest.class, "hardenedChest");
		GameRegistry.registerTileEntity(TileEntityCombiner.class, "combiner");
		GameRegistry.registerTileEntity(TileEntityFermenter.class, "fermenter");
		GameRegistry.registerTileEntity(TileEntityPlayerAltar.class, "playerAltar");
		
		
		LanguageRegistry.addName(bomb,  "Bomb");
		LanguageRegistry.addName(magicalReceptor, "Magical Receptor");
		LanguageRegistry.addName(aliquamMagicis, "Aliquam Magicis");
		LanguageRegistry.addName(floorPlacer, "Floor Placer");
		LanguageRegistry.addName(theStoneOfEnergization, "The Stone Of Energization");
		LanguageRegistry.addName(hardenedChest, "Hardened Chest");
		LanguageRegistry.addName(combiner, "Combiner");
		LanguageRegistry.addName(fermenter, "Fermenter");
		LanguageRegistry.addName(playerAltar, "Player Altar");
	}

}
