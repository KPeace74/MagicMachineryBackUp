package com.kpeace74.magicmachinery.block;

import java.text.DecimalFormat;

import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;
import com.kpeace74.magicmachinery.item.ItemEmpoweredStaffOfTheExplorer;
import com.kpeace74.magicmachinery.referance.Referance;
import com.kpeace74.magicmachinery.tileentities.TileEntityAliquamMagicis;
import com.kpeace74.magicmachinery.tileentities.TileEntityMagicalReceptor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class BlockAliquamMagicis extends BlockContainer {
		
	public BlockAliquamMagicis() {
		super(Material.glass);
		setBlockName("aliquamMagicis");
		setHardness(2F);
		setCreativeTab(CreativeTabMagicMachinery.MAGICMACHINERY_TAB);
		setStepSound(soundTypeGlass);
		setLightLevel(1);
		
		
	}
	
	

	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public int getRenderBlockPass() {
		return 1;
	};

	
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

		return new TileEntityAliquamMagicis();
		
	}
	
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float par2, float par3, float par4) {
		if (player.inventory.getCurrentItem() == null) {
			
			return true;
		} else if (player.inventory.getCurrentItem().getItem() instanceof ItemEmpoweredStaffOfTheExplorer) {
			if (!world.isRemote) {
				TileEntityAliquamMagicis mr = (TileEntityAliquamMagicis)world.getTileEntity(x, y, z);
				DecimalFormat df = new DecimalFormat("#,###");

				player.addChatComponentMessage(new ChatComponentTranslation("Current Energy Stored: " + df.format((getEnergy(x, y, z, world))) + "/100,000"));

			}
			return true;
		} else {
			return false;
		}

	}
	
	public int getEnergy(int xpos, int ypos, int zpos, World world) {
		TileEntityAliquamMagicis mr = (TileEntityAliquamMagicis)world.getTileEntity(xpos, ypos, zpos);
		return mr.magicalEnergy;
	}
	
	
}
