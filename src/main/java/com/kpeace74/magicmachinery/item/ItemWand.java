package com.kpeace74.magicmachinery.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;

public class ItemWand extends ItemMagicMachinery{

	public ItemWand() {
		super();
		this.setUnlocalizedName("wand");
		this.setMaxStackSize(1);
	}
	
	@Override
	public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
		return true;
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if (target.onGround) {
			target.motionY = 0.5;
		}
		
		
		//Items.apple.onItem
		return false;
	}
	

	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int xpos, int ypos, int zpos, int par7, float par8, float par9, float par10) {
		//player.addChatMessage(new ChatComponentTranslation(itemstack.getDisplayName()));
		world.playSound(xpos, ypos, zpos, "random.bow", 1, 0, true);
		System.out.println(world.getBlock(xpos, ypos, zpos));
		return false;
	}
	
}
