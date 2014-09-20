package com.kpeace74.magicmachinery.rituals;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.ibm.icu.util.InitialTimeZoneRule;
import com.kpeace74.magicmachinery.block.BlockTheStoneOfEnergization;
import com.kpeace74.magicmachinery.init.ModItems;

public class OreDouble {

	public static Block Ores[] = {Blocks.gold_ore, Blocks.iron_ore};
	public static Item Ingots[] = {Items.gold_ingot, Items.iron_ingot};
	//ItemStack item;
	public boolean gb(int x, int y, int z, World world, Block ore) {
		if (world.getBlock(x, y, z).equals(ore)) {
			return true;
		} else {return false;}
	}
	
	public void rit(World world, int x, int y, int z, String dir) {
		int multiple;
		if (!world.isRemote) {
				if (dir == "North") {
		
					for (int i = -2; i <=2; i++){	//--[[ First two for loops used to run through the blocks behind it in a 5x5 square ]]--
						for (int o = 1; o < 6; o++) {
								if (!world.isAirBlock(x, y+i, z-o)) { //--[[ Detects if the block at that position is an air block ]]--
									Block block = world.getBlock(x, y+i, z-o); //--[[ Gets the block at that position ]]--
									ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
									if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
										ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
										
										ItemStack drops = new ItemStack(drop.getItem());
										drops.stackSize = 2;
										world.setBlockToAir(x, y+i, z-o);	//--[[ Sets the block at that position to air ]]--
										world.spawnEntityInWorld(new EntityItem(world, x, y+i, z-o, drops));	//--[[ Spawns the end smelting result at that position
									}
								}
						}
					}
					
					for (int po = -2; po <= 2; po++) {
						for (int pon = 2; pon <= 4; pon++) {
							if (!world.isAirBlock(x-1, y+po, z-pon));
							Block block = world.getBlock(x-1, y+po, z-pon); //--[[ Gets the block at that position ]]--
							ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
								if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
									ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
									//drop.stackSize = 1;
									
									ItemStack drops = new ItemStack(drop.getItem());
									drops.stackSize = 2;
									world.setBlockToAir(x-1, y+po, z-pon);	//--[[ Sets the block at that position to air ]]--
									world.spawnEntityInWorld(new EntityItem(world, x-1, y+po, z-pon, drops));	//--[[ Spawns the end smelting result at that position
								}
							}
						}
					
				
				for (int po = -2; po <= 2; po++) {
					for (int pon = 2; pon <= 4; pon++) {
						if (!world.isAirBlock(x+1, y+po, z-pon));
						Block block = world.getBlock(x+1, y+po, z-pon); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
							if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
								ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
								//drop.stackSize = 1;
							
								ItemStack drops = new ItemStack(drop.getItem());
								drops.stackSize = 2;
								world.setBlockToAir(x+1, y+po, z-pon);	//--[[ Sets the block at that position to air ]]--
								world.spawnEntityInWorld(new EntityItem(world, x+1, y+po, z-pon, drops));	//--[[ Spawns the end smelting result at that position
							}
						}
					}
				
				for (int p = -2; p <= 2; p++) {
					if (!world.isAirBlock(x-2, y+p, z-3)) {
						Block block = world.getBlock(x-2, y+p, z-3); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
						if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
							ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
							//drop.stackSize = 1;
							
							ItemStack drops = new ItemStack(drop.getItem());
							drops.stackSize = 2;
							world.setBlockToAir(x-2, y+p, z-3);	//--[[ Sets the block at that position to air ]]--
							world.spawnEntityInWorld(new EntityItem(world, x-2, y+p, z-3, drops));	//--[[ Spawns the end smelting result at that position
						}
					}
				}
				
				for (int p = -2; p <= 2; p++) {
					if (!world.isAirBlock(x+2, y+p, z-3)) {
						Block block = world.getBlock(x+2, y+p, z-3); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
						if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
							ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
							//drop.stackSize = 1;
							
							ItemStack drops = new ItemStack(drop.getItem());
							drops.stackSize = 2;
							world.setBlockToAir(x+2, y+p, z-3);	//--[[ Sets the block at that position to air ]]--
							world.spawnEntityInWorld(new EntityItem(world, x+2, y+p, z-3, drops));	//--[[ Spawns the end smelting result at that position
						}
					}
				}
					
				
				} else if (dir == "East") {
					
					for (int i = -2; i <=2; i++){	//--[[ First two for loops used to run through the blocks behind it in a 5x5 square ]]--
						for (int o = 1; o < 6; o++) {
								if (!world.isAirBlock(x+o, y+i, z)) { //--[[ Detects if the block at that position is an air block ]]--
									Block block = world.getBlock(x+o, y+i, z); //--[[ Gets the block at that position ]]--
									ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
									if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
										ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
										//drop.stackSize = 1;
										
										ItemStack drops = new ItemStack(drop.getItem());
										drops.stackSize = 2;
										world.setBlockToAir(x+o, y+i, z);	//--[[ Sets the block at that position to air ]]--
										world.spawnEntityInWorld(new EntityItem(world, x+o, y+i, z, drops));	//--[[ Spawns the end smelting result at that position
									}
								}
						}
					}
					
					for (int po = -2; po <= 2; po++) {
						for (int pon = 2; pon <= 4; pon++) {
							if (!world.isAirBlock(x+pon, y+po, z-1));
							Block block = world.getBlock(x+pon, y+po, z-1); //--[[ Gets the block at that position ]]--
							ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
								if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
									ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
									//drop.stackSize = 1;
									
									ItemStack drops = new ItemStack(drop.getItem());
									drops.stackSize = 2;
									world.setBlockToAir(x+pon, y+po, z-1);	//--[[ Sets the block at that position to air ]]--
									world.spawnEntityInWorld(new EntityItem(world, x+pon, y+po, z-1, drops));	//--[[ Spawns the end smelting result at that position
								}
							}
						}
					
				
				for (int po = -2; po <= 2; po++) {
					for (int pon = 2; pon <= 4; pon++) {
						if (!world.isAirBlock(x+pon, y+po, z+1));
						Block block = world.getBlock(x+pon, y+po, z+1); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
							if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
								ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
								//drop.stackSize = 1;
							
								ItemStack drops = new ItemStack(drop.getItem());
								drops.stackSize = 2;
								world.setBlockToAir(x+pon, y+po, z+1);	//--[[ Sets the block at that position to air ]]--
								world.spawnEntityInWorld(new EntityItem(world, x+pon, y+po, z+1, drops));	//--[[ Spawns the end smelting result at that position
							}
						}
					}
				
				for (int p = -2; p <= 2; p++) {
					if (!world.isAirBlock(x+3, y+p, z-2)) {
						Block block = world.getBlock(x+3, y+p, z-2); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
						if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
							ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
							//drop.stackSize = 1;
							
							ItemStack drops = new ItemStack(drop.getItem());
							drops.stackSize = 2;
							world.setBlockToAir(x+3, y+p, z-2);	//--[[ Sets the block at that position to air ]]--
							world.spawnEntityInWorld(new EntityItem(world, x+3, y+p, z-2, drops));	//--[[ Spawns the end smelting result at that position
						}
					}
				}
				
				for (int p = -2; p <= 2; p++) {
					if (!world.isAirBlock(x+3, y+p, z+2)) {
						Block block = world.getBlock(x+3, y+p, z+2); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
						if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
							ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
							//drop.stackSize = 1;
							
							ItemStack drops = new ItemStack(drop.getItem());
							drops.stackSize = 2;
							world.setBlockToAir(x+3, y+p, z+2);	//--[[ Sets the block at that position to air ]]--
							world.spawnEntityInWorld(new EntityItem(world, x+3, y+p, z+2, drops));	//--[[ Spawns the end smelting result at that position
						}
					}
				}
					
	
					
				} else if (dir == "South") { 
				
					
					for (int i = -2; i <=2; i++){	//--[[ First two for loops used to run through the blocks behind it in a 5x5 square ]]--
						for (int o = 1; o < 6; o++) {
								if (!world.isAirBlock(x, y+i, z+o)) { //--[[ Detects if the block at that position is an air block ]]--
									Block block = world.getBlock(x, y+i, z+o); //--[[ Gets the block at that position ]]--
									ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
									if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
										ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
										
										ItemStack drops = new ItemStack(drop.getItem());
										drops.stackSize = 2;
										world.setBlockToAir(x, y+i, z+o);	//--[[ Sets the block at that position to air ]]--
										world.spawnEntityInWorld(new EntityItem(world, x, y+i, z+o, drops));	//--[[ Spawns the end smelting result at that position
									}
								}
						}
					}
					
					for (int po = -2; po <= 2; po++) {
						for (int pon = 2; pon <= 4; pon++) {
							if (!world.isAirBlock(x-1, y+po, z+pon));
							Block block = world.getBlock(x-1, y+po, z+pon); //--[[ Gets the block at that position ]]--
							ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
								if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
									ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
									//drop.stackSize = 1;
									
									ItemStack drops = new ItemStack(drop.getItem());
									drops.stackSize = 2;
									world.setBlockToAir(x-1, y+po, z+pon);	//--[[ Sets the block at that position to air ]]--
									world.spawnEntityInWorld(new EntityItem(world, x-1, y+po, z+pon, drops));	//--[[ Spawns the end smelting result at that position
								}
							}
						}
					
				
				for (int po = -2; po <= 2; po++) {
					for (int pon = 2; pon <= 4; pon++) {
						if (!world.isAirBlock(x+1, y+po, z+pon));
						Block block = world.getBlock(x+1, y+po, z+pon); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
							if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
								ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
								//drop.stackSize = 1;
							
								ItemStack drops = new ItemStack(drop.getItem());
								drops.stackSize = 2;
								world.setBlockToAir(x+1, y+po, z+pon);	//--[[ Sets the block at that position to air ]]--
								world.spawnEntityInWorld(new EntityItem(world, x+1, y+po, z+pon, drops));	//--[[ Spawns the end smelting result at that position
							}
						}
					}
				
				for (int p = -2; p <= 2; p++) {
					if (!world.isAirBlock(x-2, y+p, z+3)) {
						Block block = world.getBlock(x-2, y+p, z+3); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
						if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
							ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
							//drop.stackSize = 1;
							
							ItemStack drops = new ItemStack(drop.getItem());
							drops.stackSize = 2;
							world.setBlockToAir(x-2, y+p, z+3);	//--[[ Sets the block at that position to air ]]--
							world.spawnEntityInWorld(new EntityItem(world, x-2, y+p, z+3, drops));	//--[[ Spawns the end smelting result at that position
						}
					}
				}
				
				for (int p = -2; p <= 2; p++) {
					if (!world.isAirBlock(x-3, y+p, z+3)) {
						Block block = world.getBlock(x+2, y+p, z+3); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
						if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
							ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
							//drop.stackSize = 1;
							
							ItemStack drops = new ItemStack(drop.getItem());
							drops.stackSize = 2;
							world.setBlockToAir(x+2, y+p, z+3);	//--[[ Sets the block at that position to air ]]--
							world.spawnEntityInWorld(new EntityItem(world, x+2, y+p, z+3, drops));	//--[[ Spawns the end smelting result at that position
						}
					}
				}
				
					
				}else if (dir == "West") {
					
					for (int i = -2; i <=2; i++){	//--[[ First two for loops used to run through the blocks behind it in a 5x5 square ]]--
						for (int o = 1; o < 6; o++) {
								if (!world.isAirBlock(x-o, y+i, z)) { //--[[ Detects if the block at that position is an air block ]]--
									Block block = world.getBlock(x-o, y+i, z); //--[[ Gets the block at that position ]]--
									ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
									if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
										ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
										
										ItemStack drops = new ItemStack(drop.getItem());
										drops.stackSize = 2;
										world.setBlockToAir(x-o, y+i, z);	//--[[ Sets the block at that position to air ]]--
										world.spawnEntityInWorld(new EntityItem(world, x-o, y+i, z, drops));	//--[[ Spawns the end smelting result at that position
									}
								}
						}
					}
					
					for (int po = -2; po <= 2; po++) {
						for (int pon = 2; pon <= 4; pon++) {
							if (!world.isAirBlock(x-pon, y+po, z-1));
							Block block = world.getBlock(x-pon, y+po, z-1); //--[[ Gets the block at that position ]]--
							ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
								if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
									ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
									//drop.stackSize = 1;
									
									ItemStack drops = new ItemStack(drop.getItem());
									drops.stackSize = 2;
									world.setBlockToAir(x-pon, y+po, z-1);	//--[[ Sets the block at that position to air ]]--
									world.spawnEntityInWorld(new EntityItem(world, x-pon, y+po, z-1, drops));	//--[[ Spawns the end smelting result at that position
								}
							}
						}
					
				
				for (int po = -2; po <= 2; po++) {
					for (int pon = 2; pon <= 4; pon++) {
						if (!world.isAirBlock(x-pon, y+po, z+1));
						Block block = world.getBlock(x-pon, y+po, z+1); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
							if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
								ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
								//drop.stackSize = 1;
							
								ItemStack drops = new ItemStack(drop.getItem());
								drops.stackSize = 2;
								world.setBlockToAir(x-pon, y+po, z+1);	//--[[ Sets the block at that position to air ]]--
								world.spawnEntityInWorld(new EntityItem(world, x-pon, y+po, z+1, drops));	//--[[ Spawns the end smelting result at that position
							}
						}
					}
				
				for (int p = -2; p <= 2; p++) {
					if (!world.isAirBlock(x-3, y+p, z-2)) {
						Block block = world.getBlock(x-3, y+p, z-2); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
						if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
							ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
							//drop.stackSize = 1;
							
							ItemStack drops = new ItemStack(drop.getItem());
							drops.stackSize = 2;
							world.setBlockToAir(x-3, y+p, z-2);	//--[[ Sets the block at that position to air ]]--
							world.spawnEntityInWorld(new EntityItem(world, x-3, y+p, z-2, drops));	//--[[ Spawns the end smelting result at that position
						}
					}
				}
				
				for (int p = -2; p <= 2; p++) {
					if (!world.isAirBlock(x-3, y+p, z+2)) {
						Block block = world.getBlock(x-3, y+p, z+2); //--[[ Gets the block at that position ]]--
						ItemStack item = new ItemStack(block);	//--[[ Turns the block into an ItemStack ]]--
						if (FurnaceRecipes.smelting().getSmeltingResult(item) != null) {	//--[[ Checks if the item can be smelted into anything ]]--
							ItemStack drop = FurnaceRecipes.smelting().getSmeltingResult(item); //--[[ If it can be smelted into something, then make the smelting result ItemStack into a variable
							//drop.stackSize = 1;
							
							ItemStack drops = new ItemStack(drop.getItem());
							drops.stackSize = 2;
							world.setBlockToAir(x-3, y+p, z+2);	//--[[ Sets the block at that position to air ]]--
							world.spawnEntityInWorld(new EntityItem(world, x-3, y+p, z+2, drops));	//--[[ Spawns the end smelting result at that position
						}
					}
				}
					
				
				}
 		}

	}


	
	}

