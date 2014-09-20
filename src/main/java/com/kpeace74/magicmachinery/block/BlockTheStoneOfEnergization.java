package com.kpeace74.magicmachinery.block;


import java.util.Random;

import com.kpeace74.magicmachinery.init.ModBlocks;
import com.kpeace74.magicmachinery.init.ModItems;
import com.kpeace74.magicmachinery.item.ItemEmpoweredStaffOfTheExplorer;
import com.kpeace74.magicmachinery.referance.Referance;
import com.kpeace74.magicmachinery.rituallayout.OreDoubleLayout;
import com.kpeace74.magicmachinery.rituals.OreDouble;
import com.kpeace74.magicmachinery.rituals.TestRitual;
import com.kpeace74.magicmachinery.tileentities.TileEntityTheStoneOfEnergization;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class BlockTheStoneOfEnergization extends BlockContainer {
	
	public BlockTheStoneOfEnergization() {
		super(Material.rock);
		this.setBlockName("theStoneOfEnergization").setHardness(10).setResistance(8);
		
	}
	
	// --[[Calling Rituals]]--
	OreDouble od = new OreDouble();
	OreDoubleLayout odl = new OreDoubleLayout();
	
	// --[[Directions]]--
	
	public static String n = "North";
	public static String e = "East";
	public static String s = "South";
	public static String w = "West";
	
// --[[Block Detecting Method]]--

public boolean RSP(World w, int x, int y, int z) {
	if (w.getBlock(x, y, z) instanceof BlockEnergizedStone) {
	return true;
	} else {return false; }
}




	// --[[Main Code]]--
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float par2, float par3, float par4) {

	//	int timer = 100;
		
		if(player.inventory.getCurrentItem() == null) {
			//player.addChatMessage(new ChatComponentTranslation("Not Working. null item"));
			return false;
			
		} else if(player.inventory.getCurrentItem().getItem() instanceof ItemEmpoweredStaffOfTheExplorer) {
			if (world.getBlock(x, y + 1, z) instanceof BlockStoneBrick && world.getBlock(x,  y - 1,  z) instanceof BlockStoneBrick) {
				
				if (!world.isRemote) {
				
				//player.addChatMessage(new ChatComponentTranslation("Working"));
				
				}
				
			} else if (world.getBlock(x + 1, y, z) instanceof BlockEnergizedStone && world.getBlock(x + 1, y, z + 1) instanceof BlockEnergizedStone && world.getBlock(x + 1, y, z - 1) instanceof BlockEnergizedStone && world.getBlock(x - 1, y, z) instanceof BlockEnergizedStone && world.getBlock(x - 1, y, z + 1) instanceof BlockEnergizedStone && world.getBlock(x - 1, y, z - 1) instanceof BlockEnergizedStone && world.getBlock(x, y, z + 1) instanceof BlockEnergizedStone && world.getBlock(x, y, z - 1) instanceof BlockEnergizedStone && world.getBlock(x + 1, y + 4, z) instanceof BlockEnergizedStone && world.getBlock(x + 1, y + 4, z + 1) instanceof BlockEnergizedStone && world.getBlock(x + 1, y + 4, z - 1) instanceof BlockEnergizedStone && world.getBlock(x - 1, y + 4, z) instanceof BlockEnergizedStone && world.getBlock(x - 1, y + 4, z + 1) instanceof BlockEnergizedStone && world.getBlock(x - 1, y + 4, z - 1) instanceof BlockEnergizedStone && world.getBlock(x, y + 4, z + 1) instanceof BlockEnergizedStone && world.getBlock(x, y + 4, z - 1) instanceof BlockEnergizedStone && world.getBlock(x, y + 4, z) instanceof BlockEnergizedStone) {
				if (!world.isRemote) {
					player.addChatMessage(new ChatComponentTranslation("working roe"));
				}
			} else if (odl.OreDouble(world, x, y, z).equals(n)) {
				od.rit(world, x, y, z, n);
			} else if (odl.OreDouble(world, x, y, z).equals(e)) {
				od.rit(world, x, y, z, e);
			} else if (odl.OreDouble(world, x, y, z).equals(s)) {
				od.rit(world, x, y, z, s);
			} else if (odl.OreDouble(world, x, y, z).equals(w)) {
				od.rit(world, x, y, z, w);
			}
			
			//player.addChatMessage(new ChatComponentTranslation("Working"));
			return true;
			
		} else {
			
			//player.addChatMessage(new ChatComponentTranslation("Not Working"));
			return false;
			
		}
	}


	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Referance.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}


	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTheStoneOfEnergization();
	}

}

