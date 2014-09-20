package com.kpeace74.magicmachinery.block;

import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;
import com.kpeace74.magicmachinery.referance.Referance;
import com.kpeace74.magicmachinery.tileentities.TileEntityFloorPlacer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockFloorPlacer extends BlockContainer {
	
	public BlockFloorPlacer() {
		super(Material.rock);
		this.setHardness(1F).setStepSound(soundTypeStone).setBlockName("floorPlacer").setCreativeTab(CreativeTabMagicMachinery.MAGICMACHINERY_TAB);
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
	public TileEntity createNewTileEntity(World world, int par1) {
		
		return new TileEntityFloorPlacer();
	}
	

	
	
}
