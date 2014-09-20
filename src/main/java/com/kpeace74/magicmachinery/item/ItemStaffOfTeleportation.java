package com.kpeace74.magicmachinery.item;

import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffOfTeleportation extends ItemMagicMachinery{

	public ItemStaffOfTeleportation() {
		super();
		this.setUnlocalizedName("staffOfTeleportation").setMaxStackSize(1);
	}
	
	@Override
	public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
		return true;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		//player.setPosition(player.posX + 5, player.posY + 5, player.posZ + 5);
		//System.out.println(player.getRotationYawHead());
		
		if (!world.isRemote) {
			world.spawnEntityInWorld(new EntityEnderPearl(world, player));
		}
		
		return itemstack;
	}
	
}
