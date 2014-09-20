package com.kpeace74.magicmachinery.block;

import java.text.DecimalFormat;

import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;
import com.kpeace74.magicmachinery.init.ModItems;
import com.kpeace74.magicmachinery.item.ItemBucketOfIceWater;
import com.kpeace74.magicmachinery.item.ItemEmpoweredStaffOfTheExplorer;
import com.kpeace74.magicmachinery.item.ItemHeatedMundanePotion;
import com.kpeace74.magicmachinery.referance.Referance;
import com.kpeace74.magicmachinery.tileentities.TileEntityAliquamMagicis;
import com.kpeace74.magicmachinery.tileentities.TileEntityFermenter;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockFermenter extends BlockContainer {

	
	public BlockFermenter() {
		super(Material.wood);
		setBlockName("fermenter");
		setHardness(5F);
		setCreativeTab(CreativeTabMagicMachinery.MAGICMACHINERY_TAB);
		setStepSound(soundTypeWood);

	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityFermenter();
	}

	@SideOnly(Side.CLIENT)
	public static IIcon frontIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon sideIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon topIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
	frontIcon = icon.registerIcon("magicmachinery:fermenter_top");
	sideIcon = icon.registerIcon("magicmachinery:fermenter_top");
	topIcon = icon.registerIcon("magicmachinery:fermenter_front");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
	if (side == 2 || side == 3 || side == 4 || side == 5) {
		return frontIcon;
	} else if (side == 0 || side == 1) {
		return topIcon;
	} else {
		return null;
	}
	}
	
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float par2, float par3, float par4) {
		TileEntityFermenter tef = (TileEntityFermenter)world.getTileEntity(x, y, z);

		if (player.inventory.getCurrentItem() == null) {
			
			if (tef.containsItem) {
					
					ItemStack item = tef.getStoredItem();
				
					//System.out.println(tef.itemStored);
					
					//System.out.println(tef.getStoredItem());
					
					//System.out.println(tef.containsItem);
					
					player.inventory.addItemStackToInventory(tef.getStoredItem());
					
				//if (!world.isRemote) {
					
					tef.itemStored = "null";
				
				
				tef.containsItem = false;
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		} else if (player.inventory.getCurrentItem().getItem() instanceof ItemHeatedMundanePotion) {
			
			if (!tef.containsItem) {
				
				--player.inventory.getCurrentItem().stackSize;
				
				tef.containsItem = true;
				
				tef.itemStored = "mundane";
				
				//if (!world.isRemote) {
				
					tef.currentItem = new ItemStack(ModItems.heatedMundanePotion);
				
				//}
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		} else if (player.inventory.getCurrentItem().getItem() instanceof ItemBucketOfIceWater) {
			
			ItemStack heldItem = new ItemStack(ModItems.bucketOfIceWater);
			
			if (!tef.containsFluid) {
				
				tef.containsFluid = true;
			
				--player.inventory.getCurrentItem().stackSize;
			
				//if (!world.isRemote) {
				
					player.inventory.addItemStackToInventory(new ItemStack(Items.bucket));
			
				//}
    			
				return true;
			
			} else {
				return false;
			}
		} else if (player.inventory.getCurrentItem().getItem() instanceof ItemBucket) {
			
			if (tef.containsFluid) {

				ItemStack heldItem = new ItemStack(Items.bucket);
			
				tef.containsFluid = false;
			
				--player.inventory.getCurrentItem().stackSize;
			
			//	if (!world.isRemote) {
				
					player.inventory.addItemStackToInventory(new ItemStack(ModItems.bucketOfIceWater));
				
			//	}
            
				return true;
			
			} else {
				
				return false;
			
			}
            
		} else {
			
			return false;
			
		}

	}
	
	public void dropItems(World world, int x, int y, int z) {
		TileEntityFermenter tef = (TileEntityFermenter)world.getTileEntity(x, y, z);
		world.spawnEntityInWorld(new EntityItem(world, x, y, z, tef.getStoredItem()));
	}
	
}
