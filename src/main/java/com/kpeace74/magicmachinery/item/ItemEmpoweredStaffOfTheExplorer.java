package com.kpeace74.magicmachinery.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEmpoweredStaffOfTheExplorer extends ItemMagicMachinery {

	public ItemEmpoweredStaffOfTheExplorer() {
		super();
		this.setUnlocalizedName("empoweredStaffOfTheExplorer");
		this.setMaxStackSize(1);
		//this.on
		
	}
	
	@Override
	public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
		return true;
	}
	
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if (target.onGround) {
			target.motionY = 1;
			target.motionX = (target.posX - player.posX);
			target.motionZ = (target.posZ - player.posZ);
		}
		//Items.apple.onItem
		return false;
	}
	
	
	
}
