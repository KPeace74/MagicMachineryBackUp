package com.kpeace74.magicmachinery.item;

import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import org.apache.commons.io.filefilter.MagicNumberFileFilter;

import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;
import com.kpeace74.magicmachinery.init.ModItems;
import com.kpeace74.magicmachinery.referance.Referance;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHeatedMundanePotion extends ItemFood {
	
	public ItemHeatedMundanePotion() {
		super(0, true);
		setUnlocalizedName("heatedMundanePotion");
		setCreativeTab(CreativeTabMagicMachinery.MAGICMACHINERY_TAB);
		setMaxStackSize(1);
	    setMaxDamage(0);
	}
	
	private boolean alwaysEdible;
	
	 public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
		 if (player.capabilities.isCreativeMode) {
			 player.setFire(5);
			 return itemStack;
		 } else {
			 --itemStack.stackSize;
			 player.setFire(5);
	            if (itemStack.stackSize <= 0)
	            {
	                return new ItemStack(Items.glass_bottle);
	            }

	            player.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
			 return itemStack;
		 }
		 
	 }
	 
	    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player)
	    {
			 if (player.capabilities.isCreativeMode) {
				 player.setFire(5);
			 } else {
				 --itemStack.stackSize;
				 player.setFire(5);
		         player.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
			 }
	    }
	 
	    public EnumAction getItemUseAction(ItemStack p_77661_1_)
	    {
	        return EnumAction.drink;
	    }
	    
	    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
	    	player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
            return itemStack;
	    }
	    
	    public int getMaxItemUseDuration(ItemStack p_77626_1_)
	    {
	        return 32;
	    }
	    

		@Override
		public String getUnlocalizedName() {
			return String.format("item.%s%s", Referance.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		}
		
		@Override
		public String getUnlocalizedName(ItemStack itemStack) {
			return String.format("item.%s%s", Referance.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		}
		
		@Override
		@SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister iconRegister) {
			itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
		}
		
		protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
			return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
		}
	
}
