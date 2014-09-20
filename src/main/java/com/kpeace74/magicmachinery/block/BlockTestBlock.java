package com.kpeace74.magicmachinery.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.kpeace74.magicmachinery.api.RandomAPI;
import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;
import com.kpeace74.magicmachinery.referance.Referance;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTestBlock extends Block {

	public int frontSide;
	public EntityPlayer player;
	
	public BlockTestBlock() {
		super(Material.rock);
		setCreativeTab(CreativeTabMagicMachinery.MAGICMACHINERY_TAB);
		
	}
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Referance.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	
	@SideOnly(Side.CLIENT)
	public static IIcon northIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon southIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon eastIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon westIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon topIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon bottomIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		topIcon = icon.registerIcon("magicmachinery:top");
		bottomIcon = icon.registerIcon("magicmachinery:bottom");
		northIcon = icon.registerIcon("magicmachinery:north");
		southIcon = icon.registerIcon("magicmachinery:south");
		eastIcon = icon.registerIcon("magicmachinery:east");
		westIcon = icon.registerIcon("magicmachinery:west");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		if (side == 0) {
			return bottomIcon;
		} else if (side == 1) {
			return topIcon;
		} else if (side == 2) {
			return northIcon;
		} else if (side == 3) {
			return southIcon;
		} else if (side == 4) {
			return eastIcon;
		} else if (side == 5) {
			return westIcon; 
		} else {
			return null;
		}
	}
		

}
