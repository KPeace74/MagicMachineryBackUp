package com.kpeace74.magicmachinery.block;

import java.text.DecimalFormat;

import com.kpeace74.magicmachinery.MagicMachinery;
import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;
import com.kpeace74.magicmachinery.item.ItemEmpoweredStaffOfTheExplorer;
import com.kpeace74.magicmachinery.referance.Referance;
import com.kpeace74.magicmachinery.tileentities.TileEntityAliquamMagicis;
import com.kpeace74.magicmachinery.tileentities.TileEntityCombiner;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockCombiner extends BlockContainer {
	
	public boolean active;
	
public BlockCombiner() {
	super(Material.rock);
	setBlockName("combiner");
	setCreativeTab(CreativeTabMagicMachinery.MAGICMACHINERY_TAB);
	setStepSound(soundTypeMetal);
	setHardness(2F);
	
	if (active) {
		setLightLevel(1);
	} else {
		setLightLevel(0);
	}
}



public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float par2, float par3, float par4) {
	if (player.inventory.getCurrentItem() == null) {
		
		return true;
	} else if (player.inventory.getCurrentItem().getItem() instanceof ItemEmpoweredStaffOfTheExplorer) {
		if (!world.isRemote) {
			TileEntityCombiner mr = (TileEntityCombiner)world.getTileEntity(x, y, z);
			DecimalFormat df = new DecimalFormat("#,###");

			player.addChatComponentMessage(new ChatComponentTranslation("Current Energy Stored: " + df.format((getEnergy(x, y, z, world))) + "/50,000"));

		}
		return true;
	} else {
		return false;
	}

}


public int getEnergy(int xpos, int ypos, int zpos, World world) {
	TileEntityCombiner mr = (TileEntityCombiner)world.getTileEntity(xpos, ypos, zpos);
	return mr.magicalEnergy;
}














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
public static IIcon sideIconInactive;
@SideOnly(Side.CLIENT)
public static IIcon sideIconActive;
@SideOnly(Side.CLIENT)
public static IIcon input;
@SideOnly(Side.CLIENT)
public static IIcon output;
@SideOnly(Side.CLIENT)
public static IIcon sideIcon;

@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister icon) {
	topIcon = icon.registerIcon("magicmachinery:hardenedWood");
	sideIconInactive = icon.registerIcon("magicmachinery:combiner_inactive");
	sideIconActive = icon.registerIcon("magicmachinery:combiner_active");
	input = icon.registerIcon("magicmachinery:hardenedWood_input");
	output = icon.registerIcon("magicmachinery:hardenedWood_output");
	sideIcon = icon.registerIcon("magicmachinery:hardenedWood");
	bottomIcon = icon.registerIcon("magicmachinery:hardenedWood");
}

@Override
@SideOnly(Side.CLIENT)
public IIcon getIcon(int side, int metadata) {
if(side == 0) {
return bottomIcon;
} else if(side == 1) {
return topIcon;
} else if (side == 2){
	return sideIcon;
} else if (side == 3) {
	if (!active) {
		return sideIconInactive;
	} else {
		return sideIconActive;
	}
} else if (side == 4){
	return sideIcon;
} else {
	return sideIcon;
}
}

@Override
public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
	return new TileEntityCombiner();
}
	
	

}
