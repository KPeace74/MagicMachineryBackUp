package com.kpeace74.magicmachinery.item;

import com.kpeace74.magicmachinery.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class ItemStaffOfTheExplorer extends ItemMagicMachinery {

	public ItemStaffOfTheExplorer() {
		super();
		this.setUnlocalizedName("staffOfTheExplorer");
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

		return false;
	}
	
}
	
	
		
	
	

