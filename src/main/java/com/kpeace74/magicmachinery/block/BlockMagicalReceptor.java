package com.kpeace74.magicmachinery.block;

import java.text.DecimalFormat;

import javax.swing.Icon;

import com.kpeace74.magicmachinery.MagicMachinery;
import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;
import com.kpeace74.magicmachinery.item.ItemEmpoweredStaffOfTheExplorer;
import com.kpeace74.magicmachinery.item.ItemEnergeticStaff;
import com.kpeace74.magicmachinery.referance.Referance;
import com.kpeace74.magicmachinery.tileentities.TileEntityMagicalReceptor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockMagicalReceptor extends BlockContainer {

	ItemEnergeticStaff es = new ItemEnergeticStaff();
	
	public boolean clicked = false;
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float par2, float par3, float par4) {
		if (player.inventory.getCurrentItem() == null) {
			System.out.println("NOFNA:");
			return true;
		} else if (player.inventory.getCurrentItem().getItem() instanceof ItemEmpoweredStaffOfTheExplorer) {
			if (!world.isRemote) {
				TileEntityMagicalReceptor mr = (TileEntityMagicalReceptor)world.getTileEntity(x, y, z);
				DecimalFormat df = new DecimalFormat("#,###");
				if (world.getBlock(x, y+1, z) instanceof BlockImbuedDiamondBlock || world.getBlock(x, y + 1, z) instanceof BlockCorruptDiamondBlock) {
					player.addChatComponentMessage(new ChatComponentTranslation("Current Energy Stored: " + df.format((getEnergy(x, y, z, world))) + "/20,000"));
				} else { 
				player.addChatComponentMessage(new ChatComponentTranslation("Current Energy Stored: " + df.format((getEnergy(x, y, z, world))) + "/1,000"));
				}
			}
			return true;
		} else {
			System.out.println("NOTWORKING");
			return false;
		}
	}
	
	public BlockMagicalReceptor() {
		super(Material.rock);
		setHardness(2F);
		setBlockName("magicalReceptor");
		setCreativeTab(CreativeTabMagicMachinery.MAGICMACHINERY_TAB);
		setStepSound(soundTypeMetal);
	}

	public int getEnergy(int xpos, int ypos, int zpos, World world) {
		TileEntityMagicalReceptor mr = (TileEntityMagicalReceptor)world.getTileEntity(xpos, ypos, zpos);
		return mr.magicalEnergy;
	}

	
//	public void printEnergyToConsole() {
//		System.out.println(mr.getEnergy());
//	}

	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Referance.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	
	
	@SideOnly(Side.CLIENT)
	public static IIcon topIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon sideIcon;
	public int[] coords;
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
	topIcon = icon.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_top");
	bottomIcon = icon.registerIcon(Referance.MOD_ID.toLowerCase() + ":" + "magicalReceptor" + "_bottom");
	sideIcon = icon.registerIcon(Referance.MOD_ID.toLowerCase() + ":" + "magicalReceptor" + "_side");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
	if(side == 0) {
	return bottomIcon;
	} else if(side == 1) {
	return topIcon;
	} else {
	return sideIcon;
	}
	}
	
	/*

	*/
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {

		return new TileEntityMagicalReceptor();
		
	}
	
	
	
		
}
