package com.kpeace74.magicmachinery.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

import com.kpeace74.magicmachinery.init.ModBlocks;
import com.kpeace74.magicmachinery.tileentities.TileEntityAliquamMagicis;
import com.kpeace74.magicmachinery.tileentities.TileEntityCombiner;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEnergeticStaff extends ItemMagicMachinery {
	
	public int asdf = 123;
	//BlockMagicalReceptor mr = new BlockMagicalReceptor();
	
	public ItemEnergeticStaff() {
		super();
		setUnlocalizedName("energeticStaff");
	}
	
	public int xpos;
	public int ypos;
	public int zpos;
	public int xpos2;
	public int ypos2;
	public int zpos2;
	public int xpos3;
	public int ypos3;
	public int zpos3;
	public int finalPos;
	public boolean clicked;
	public boolean working;
	public String tile1;
	public String tile2;
	public String successTile;
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer player, List dataList, boolean bool) {
		if (clicked == true) {
			dataList.add("Linked To: " + xpos + ", " + ypos + ", " + zpos);
		} else {
			dataList.add("Not currently linked.");
		}
			
		//dataList.add("Linked To: " + xpos + ", " + ypos + ", " + zpos)
	}
	
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int param1, float param2, float param3, float param4) {
		Block block = world.getBlock(x, y, z);
		if (xpos == x && ypos == y && zpos == z && clicked == true) {
			xpos = 0;
			ypos = 0;
			zpos = 0;
			clicked = false;
		} else if (block.equals(ModBlocks.magicalReceptor) && clicked == false) {
			tile1 = "magicalReceptor";
			if (!world.isRemote) {
				clicked = true;
				xpos = x;
				ypos = y;
				zpos = z;
			}
		} else if (block.equals(ModBlocks.aliquamMagicis) && clicked == false) {
			tile1 = "aliquamMagicis";
			if (!world.isRemote) {
				clicked = true;
				xpos = x;
				ypos = y;
				zpos = z;
			}
		} else if (block.equals(ModBlocks.aliquamMagicis) && clicked == true) {
			TileEntityAliquamMagicis eT = (TileEntityAliquamMagicis)world.getTileEntity(x, y, z);
			//System.out.println("asf");
			tile2 = "aliquamMagicis";
			if (!world.isRemote) {
				xpos2 = x;
				ypos2 = y;
				zpos2 = z;
				xpos3 = xpos - xpos2;
				ypos3 = ypos - ypos2;
				zpos3 = zpos - zpos2;
				if (xpos3 < 0) {
					xpos3 = xpos3 * -1;
				}
				if (ypos3 < 0) {
					ypos3 = ypos3 * -1;
				}
				if (zpos3 < 0) {
					zpos3 = zpos3 * -1;
				}
				finalPos = xpos3 + ypos3 + zpos3;
				clicked = false;
				eT.getX = xpos;
				eT.getY = ypos;
				eT.getZ = zpos;
				eT.toX = xpos2;
				eT.toY = ypos2;
				eT.toZ = zpos2;
				if (tile1 == "aliquamMagicis") {
					successTile = "Aliquam Magicis";
				} else if (tile1 == "magicalReceptor") {
					successTile = "Magical Receptor";
				}
				if (finalPos <= 10) {
					printSuccess(successTile, "Aliquam Magicis", player);
					eT.connected = true;
				} else {
					printFailure(successTile, "Aliquam Magicis", "Too Far", player);
					eT.connected = false;
				}
			}
			} else if (block.equals(ModBlocks.combiner) && clicked == true) {
				TileEntityCombiner eT = (TileEntityCombiner)world.getTileEntity(x, y, z);
				//System.out.println("asf");
				tile2 = "combiner";
					if (!world.isRemote) {
						xpos2 = x;
						ypos2 = y;
						zpos2 = z;
						xpos3 = xpos - xpos2;
						ypos3 = ypos - ypos2;
						zpos3 = zpos - zpos2;
						if (xpos3 < 0) {
							xpos3 = xpos3 * -1;
						}
						if (ypos3 < 0) {
							ypos3 = ypos3 * -1;
						}
						if (zpos3 < 0) {
							zpos3 = zpos3 * -1;
						}
						finalPos = xpos3 + ypos3 + zpos3;
						clicked = false;
						eT.getX = xpos;
						eT.getY = ypos;
						eT.getZ = zpos;
						eT.toX = xpos2;
						eT.toY = ypos2;
						eT.toZ = zpos2;
						if (tile1 == "aliquamMagicis") {
							successTile = "Aliquam Magicis";
						} else if (tile1 == "magicalReceptor") {
							successTile = "Magical Receptor";
						}
						if (finalPos <= 10) {
							printSuccess(successTile, "Combiner", player);
							eT.connected = true;
						} else {
							printFailure(successTile, "Combiner", "Too Far", player);
							eT.connected = false;
						}
					}
			}
		return true;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		if (player.isSneaking()) {
			clicked = false;
			xpos = 0;
			ypos = 0;
			zpos = 0;
		}
		return super.onItemRightClick(itemStack, world, player);
	}
	
	
	public void printSuccess(String from, String to, EntityPlayer player) {
		player.addChatComponentMessage(new ChatComponentTranslation("Successful Link Between the " + from + " Located At " + xpos + ", " + ypos + ", " + zpos + " and the " + to + " at " + xpos2 + ", " + ypos2 + ", " + zpos + "."));
	}
	
	public void printFailure(String from, String to, String reason, EntityPlayer player) {
		player.addChatComponentMessage(new ChatComponentTranslation("Unsuccessful Link Between the " + from + " Located At " + xpos + ", " + ypos + ", " + zpos + " and the " + to + " at " + xpos2 + ", " + ypos2 + ", " + zpos + "."));
		player.addChatComponentMessage(new ChatComponentTranslation("Reason: " + reason));
	}
	
}
