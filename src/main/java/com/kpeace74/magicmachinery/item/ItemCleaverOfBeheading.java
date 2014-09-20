package com.kpeace74.magicmachinery.item;

import com.kpeace74.magicmachinery.MagicMachinery;
import com.sun.org.apache.bcel.internal.generic.DMUL;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemCleaverOfBeheading extends ItemMagicMachinery {

	public ItemCleaverOfBeheading() {
		super();
		setUnlocalizedName("cleaverOfBeheading");
		setMaxStackSize(1);
		//onItemR
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			if (!world.isRemote) {
				player.attackEntityFrom(MagicMachinery.behead, 1000);
				double xpos = player.posX;
				double ypos = player.posY;
				double zpos = player.posZ;
				
				world.spawnEntityInWorld(new EntityItem(world, xpos, ypos, zpos, new ItemStack(Items.skull, 1, 3)));
			}
			return itemStack;
		} else {
			return itemStack;
		}
	}

}
