package com.kpeace74.magicmachinery.item;

import net.minecraft.block.BlockCommandBlock;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.util.ChatComponentTranslation;

import com.kpeace74.magicmachinery.MagicMachinery;
import com.kpeace74.magicmachinery.handler.ConfigurationHandler;

public class ItemBanHammer extends ItemMagicMachinery {

	public ItemBanHammer() {
		super();
		setUnlocalizedName("banHammer");
		setMaxStackSize(1);
		setMaxDamage(999);
	}

    public boolean hitEntity(ItemStack itemStack, EntityLivingBase entity1, EntityLivingBase entity2)
    {
    	if (entity2 instanceof EntityPlayer) {
    		EntityPlayer playerWithHammer = (EntityPlayer)entity2;
    		MinecraftServer minecraftserver = MinecraftServer.getServer();
    		EntityPlayerMP playerMPWith = (EntityPlayerMP)playerWithHammer;

    		entity1.attackEntityFrom(MagicMachinery.banned, 1);
    		entity2.attackEntityFrom(MagicMachinery.bannedSelf, 2);
    		if (playerWithHammer.getHealth() == 0 && ConfigurationHandler.banHammerActive && !minecraftserver.isSinglePlayer()) {
    			MinecraftServer.getServer().getCommandManager().executeCommand(playerMPWith, "kill " + playerWithHammer.getGameProfile().getName());
    		}
    		if (entity1 instanceof EntityPlayer) {
    			EntityPlayer playerHit = (EntityPlayer)entity1;
    			EntityPlayerMP playerMPHit = (EntityPlayerMP)playerHit;
    			if (playerHit.getHealth() == 0 && ConfigurationHandler.banHammerActive) {
    				MinecraftServer.getServer().getCommandManager().executeCommand(playerMPWith, "kill " + playerHit.getGameProfile().getName());
    				
    			}
    		}
    		itemStack.damageItem(1, entity2);
        	return true;
    	} else {
    		return true;
    	}
    }
	
}
