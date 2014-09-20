package com.kpeace74.magicmachinery.handler;


import com.kpeace74.magicmachinery.tileentities.TileEntityCombiner;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class TMGuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 0) {
			TileEntityCombiner tileEntityCombiner = (TileEntityCombiner)world.getTileEntity(x, y, z);
			//return new ContainerMasher(player.inventory, tileEntityMasher);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 0) {
			TileEntityCombiner tileEntityCombiner = (TileEntityCombiner)world.getTileEntity(x, y, z);
			//return new GUIMasher(player.inventory, tileEntityMasher);
		}
		return null;
	}

}
