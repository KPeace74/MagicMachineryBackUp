package com.kpeace74.magicmachinery.init;

import com.kpeace74.magicmachinery.block.BlockFloorPlacer;
import com.kpeace74.magicmachinery.block.BlockHelp;
import com.kpeace74.magicmachinery.item.ItemBucketOfIceWater;
import com.kpeace74.magicmachinery.tileentities.TileEntityFloorPlacer;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init() {
		// --[[ Items ]]--
		GameRegistry.addRecipe(new ItemStack(ModItems.goldRod, 2), " g", "g ", 'g', new ItemStack(Items.gold_ingot));
		GameRegistry.addRecipe(new ItemStack(ModItems.staffOfTheExplorer), "  d", " g ", "g  ", 'g', new ItemStack(ModItems.goldRod), 'd', new ItemStack(Items.diamond));
		GameRegistry.addRecipe(new ItemStack(ModItems.empoweredStaffOfTheExplorer), "  d", " g ", "g  ", 'g', new ItemStack(ModItems.goldRod), 'd', new ItemStack(ModItems.imbuedDiamond));
		GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.imbuedDiamond), new ItemStack(ModItems.staffOfTheExplorer.setContainerItem(ModItems.staffOfTheExplorer)), new ItemStack(Items.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.imbuedDiamond, 9), new ItemStack(ModBlocks.imbuedDiamondBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.empoweredPearl), new ItemStack(ModItems.staffOfTheExplorer.setContainerItem(ModItems.staffOfTheExplorer)), new ItemStack(Items.ender_pearl));
		GameRegistry.addRecipe(new ItemStack(ModItems.staffOfTeleportation), "  e", " g ", "g  ", 'e', new ItemStack(ModItems.empoweredPearl), 'g', new ItemStack(ModItems.goldRod));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.empoweredRedstone), new ItemStack(ModItems.staffOfTheExplorer.setContainerItem(ModItems.staffOfTheExplorer)), new ItemStack(Items.redstone));
		GameRegistry.addRecipe(new ItemStack(ModItems.energeticStaff), "  r", " g ", "r  ", 'r', new ItemStack(ModItems.empoweredRedstone), 'g', new ItemStack(ModItems.goldRod));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.guideBook), new ItemStack(ModItems.staffOfTheExplorer.setContainerItem(ModItems.staffOfTheExplorer)), new ItemStack(Items.book));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.diamondDagger), "   ", "id ", "si ", 'd', new ItemStack(Items.diamond), 'i', new ItemStack(Items.iron_ingot), 's', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ironDagger),  "id", "si", 'd', new ItemStack(Items.iron_ingot), 'i', new ItemStack(Blocks.stone), 's', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stoneDagger), "id", "si", 'd', new ItemStack(Blocks.cobblestone), 'i', "logWood", 's', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.woodenDagger), "id", "si", 'd', "plankWood", 'i', "logWood", 's', "stickWood"));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bucketOfIceWater), new ItemStack(Items.water_bucket), new ItemStack(Blocks.ice));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cleaverOfBeheading), "ii", "is", "s ", 'i', "ingotIron", 's', "stickWood"));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.corruptDiamond), new ItemStack(ModItems.imbuedDiamond), new ItemStack(ModItems.heatedMundanePotion));
		GameRegistry.addRecipe(new ItemStack(ModItems.corruptDiamond, 8), "ddd", "dhd", "ddd", 'd', new ItemStack(ModItems.imbuedDiamond), 'h', new ItemStack(ModItems.heatedMundanePotion));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.diamondFinder), "dwd", "cic", "dwd", 'd', "dye", 'w', new ItemStack(Items.wheat), 'c', new ItemStack(Items.coal), 'i', new ItemStack(Blocks.iron_block)));
		
		//--[[ Blocks ]]--
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.imbuedDiamondBlock), "ddd", "ddd", "ddd", 'd', new ItemStack(ModItems.imbuedDiamond));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.theStoneOfEnergization), "sss", "sds", "sss", 's', new ItemStack(Blocks.stone), 'd', new ItemStack(ModBlocks.imbuedDiamondBlock));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.floorPlacer), "sps", "pcp", "sps", 's', new ItemStack(Blocks.stonebrick), 'p', Blocks.piston, 'c', new ItemStack(Blocks.chest));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.energizedStone, 4), "sss", "sds", "sss", 's', new ItemStack(Blocks.stone), 'd', new ItemStack(ModItems.imbuedDiamond));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.magicalReceptor), "sds", "s s", "sss", 's', new ItemStack(Blocks.stone), 'd', new ItemStack(ModItems.imbuedDiamond));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.aliquamMagicis), "glg", "ldl", "glg", 'g', new ItemStack(Items.glowstone_dust), 'l', new ItemStack(Blocks.glass), 'd', new ItemStack(ModItems.imbuedDiamond));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.hardenedWood), "plankWood", "cobblestone"));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.hardenedChest), "hhh", "h h", "hhh", 'h', new ItemStack(ModBlocks.hardenedWood));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.playerAltar), "hsh", "hdh", "hhh", 'h', new ItemStack(ModBlocks.hardenedWood), 's', new ItemStack(Items.skull, 1, 3), 'd', new ItemStack(ModBlocks.imbuedDiamondBlock));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.fermenter), "hhh", "hbh", "hhh", 'h', new ItemStack(ModBlocks.hardenedWood), 'b', new ItemStack(Items.bucket));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.combiner), "hhh", "pdp", "hhh", 'h', new ItemStack(ModBlocks.hardenedWood), 'p', new ItemStack(Blocks.piston), 'd', new ItemStack(ModItems.imbuedDiamond));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.corruptDiamondBlock), new ItemStack(ModBlocks.imbuedDiamondBlock), new ItemStack(ModItems.heatedMundanePotion));
		
		//--[[ Smelting ]]--
		GameRegistry.addSmelting(new ItemStack(Items.potionitem, 0, 64), new ItemStack(ModItems.heatedMundanePotion), 0.1F);
		GameRegistry.addSmelting(new ItemStack(Items.potionitem, 0, 8192), new ItemStack(ModItems.heatedMundanePotion), 0.1F);
	}
	
}
