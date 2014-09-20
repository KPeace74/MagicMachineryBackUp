package com.kpeace74.magicmachinery.item;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.Event;
import akka.actor.FSM.Timer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class ItemEmpoweredPearl extends ItemMagicMachinery {

	public ItemEmpoweredPearl() {
		super();
		this.setUnlocalizedName("empoweredPearl").setMaxStackSize(16);
	}
	
	@Override
	public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
		return true;
	}
	
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		float preHealth = player.getHealth();
		if (!world.isRemote) {
		world.spawnEntityInWorld(new EntityEnderPearl(world, player));
			if (!player.capabilities.isCreativeMode) {
				--itemstack.stackSize;
				
				//player.heal(5);
				System.out.println(preHealth - player.getHealth());
			} 
		}
		return itemstack;
	}	
}
