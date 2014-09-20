package com.kpeace74.magicmachinery.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;

import com.kpeace74.magicmachinery.item.ItemBanHammer;
import com.kpeace74.magicmachinery.item.ItemBucketOfIceWater;
import com.kpeace74.magicmachinery.item.ItemCleaverOfBeheading;
import com.kpeace74.magicmachinery.item.ItemCorruptDiamond;
import com.kpeace74.magicmachinery.item.ItemDiamondDagger;
import com.kpeace74.magicmachinery.item.ItemDiamondFinder;
import com.kpeace74.magicmachinery.item.ItemEmpoweredPearl;
import com.kpeace74.magicmachinery.item.ItemEmpoweredRedstone;
import com.kpeace74.magicmachinery.item.ItemEmpoweredStaffOfTheExplorer;
import com.kpeace74.magicmachinery.item.ItemEnergeticStaff;
import com.kpeace74.magicmachinery.item.ItemGoldRod;
import com.kpeace74.magicmachinery.item.ItemGuideBook;
import com.kpeace74.magicmachinery.item.ItemHeatedMundanePotion;
import com.kpeace74.magicmachinery.item.ItemImbuedDiamond;
import com.kpeace74.magicmachinery.item.ItemImbuedDiamondPickaxe;
import com.kpeace74.magicmachinery.item.ItemIronDagger;
import com.kpeace74.magicmachinery.item.ItemMagicMachinery;
import com.kpeace74.magicmachinery.item.ItemMagicMachineryArmor;
import com.kpeace74.magicmachinery.item.ItemMapleLeaf;
import com.kpeace74.magicmachinery.item.ItemStaffOfTeleportation;
import com.kpeace74.magicmachinery.item.ItemStaffOfTheExplorer;
import com.kpeace74.magicmachinery.item.ItemStoneDagger;
import com.kpeace74.magicmachinery.item.ItemWand;
import com.kpeace74.magicmachinery.item.ItemWoodenDagger;
import com.kpeace74.magicmachinery.referance.Referance;

import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Referance.MOD_ID)
public class ModItems {
	
	
	public static final ItemMagicMachinery mapleLeaf = new ItemMapleLeaf();
	public static final ItemMagicMachinery staffOfTheExplorer = new ItemStaffOfTheExplorer();
	public static final ItemMagicMachinery goldRod = new ItemGoldRod();
	public static final ItemMagicMachinery imbuedDiamond = new ItemImbuedDiamond();
	public static final ItemMagicMachinery empoweredStaffOfTheExplorer = new ItemEmpoweredStaffOfTheExplorer();
	public static final ItemMagicMachinery imbuedDiamondPickaxe = new ItemImbuedDiamondPickaxe();
	public static final ItemMagicMachinery staffOfTeleportation = new ItemStaffOfTeleportation();
	public static final ItemMagicMachinery empoweredPearl = new ItemEmpoweredPearl();
	public static final Item wingsOfImak = new ItemMagicMachineryArmor(ArmorMaterial.IRON, 5, 1);
	public static final ItemMagicMachinery empoweredRedstone = new ItemEmpoweredRedstone();
	public static final ItemMagicMachinery energeticStaff = new ItemEnergeticStaff();
	public static final ItemMagicMachinery wand = new ItemWand();
	public static final ItemMagicMachinery guideBook = new ItemGuideBook();
	public static final ItemMagicMachinery diamondDagger = new ItemDiamondDagger();
	public static final ItemMagicMachinery ironDagger = new ItemIronDagger();
	public static final ItemMagicMachinery stoneDagger = new ItemStoneDagger();
	public static final ItemMagicMachinery woodenDagger = new ItemWoodenDagger();
	public static final ItemFood heatedMundanePotion = new ItemHeatedMundanePotion();
	public static final ItemMagicMachinery bucketOfIceWater = new ItemBucketOfIceWater();
	public static final ItemMagicMachinery cleaverOfBeheading = new ItemCleaverOfBeheading();
	public static final ItemMagicMachinery banHammer = new ItemBanHammer();
	public static final ItemMagicMachinery corruptDiamond = new ItemCorruptDiamond();
	public static final ItemMagicMachinery diamondFinder = new ItemDiamondFinder();
	
	public static void init() {
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
		GameRegistry.registerItem(staffOfTheExplorer, "staffOfTheExplorer");
		GameRegistry.registerItem(goldRod, "goldRod");
		GameRegistry.registerItem(imbuedDiamond, "imbuedDiamond");
		GameRegistry.registerItem(empoweredStaffOfTheExplorer, "empoweredStaffOfTheExplorer");
		GameRegistry.registerItem(imbuedDiamondPickaxe, "imbuedDiamondPickaxe");
		GameRegistry.registerItem(staffOfTeleportation, "staffOfTeleportation");
		GameRegistry.registerItem(empoweredPearl, "empoweredPearl");
		GameRegistry.registerItem(wingsOfImak, "wingsOfImak");
		GameRegistry.registerItem(empoweredRedstone, "empoweredRedstone");
		GameRegistry.registerItem(energeticStaff, "energeticStaff");
		GameRegistry.registerItem(wand, "wand");
		GameRegistry.registerItem(guideBook, "guideBook");
		GameRegistry.registerItem(diamondDagger, "diamondDagger");
		GameRegistry.registerItem(ironDagger, "ironDagger");
		GameRegistry.registerItem(stoneDagger, "stoneDagger");
		GameRegistry.registerItem(woodenDagger, "woodenDagger");
		GameRegistry.registerItem(heatedMundanePotion, "heatedMundanePotion");
		GameRegistry.registerItem(bucketOfIceWater, "bucketOfIceWater");
		GameRegistry.registerItem(cleaverOfBeheading, "cleaverOfBeheading");
		GameRegistry.registerItem(banHammer, "banHammer");
		GameRegistry.registerItem(corruptDiamond, "corruptDiamond");
		GameRegistry.registerItem(diamondFinder, "diamondFinder");
	
	}
}
