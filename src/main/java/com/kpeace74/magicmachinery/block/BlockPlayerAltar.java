package com.kpeace74.magicmachinery.block;

import java.text.DecimalFormat;
import java.util.Random;

import scala.Int;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockNote;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.command.server.CommandBanPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.world.Teleporter.PortalPosition;
import net.minecraft.world.World;

import com.kpeace74.magicmachinery.creativetab.CreativeTabMagicMachinery;
import com.kpeace74.magicmachinery.item.ItemEmpoweredStaffOfTheExplorer;
import com.kpeace74.magicmachinery.tileentities.TileEntityMagicalReceptor;
import com.kpeace74.magicmachinery.tileentities.TileEntityPlayerAltar;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPlayerAltar extends BlockContainer {

	public boolean onTopOf;
	
	public BlockPlayerAltar() {
		super(Material.rock);
		setBlockName("playerAltar");
		setCreativeTab(CreativeTabMagicMachinery.MAGICMACHINERY_TAB);
		setHardness(1.7F);
		
	}

	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		TileEntityPlayerAltar pa = (TileEntityPlayerAltar)world.getTileEntity(x, y, z);
		if (entity instanceof EntityPlayer && !pa.boundToPlayer) {
			pa.boundToPlayer = true;
			EntityPlayer player = (EntityPlayer)entity;
			pa.owner = player.getGameProfile().getName();
			if (!world.isRemote) {
				player.addChatComponentMessage(new ChatComponentTranslation("�b�oYou feel as if something is sucked out of you..."));
				player.addPotionEffect(new PotionEffect(Potion.blindness.id, 80));
			}
		}
	}
	
	
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float par2, float par3, float par4) {
		if (player.inventory.getCurrentItem() == null) {
			return false;
		} else if (player.inventory.getCurrentItem().getItem() instanceof ItemEmpoweredStaffOfTheExplorer) {
			if (!world.isRemote) {
				TileEntityPlayerAltar mr = (TileEntityPlayerAltar)world.getTileEntity(x, y, z);
				DecimalFormat df = new DecimalFormat("#,###");
				if (mr.boundToPlayer) {
				player.addChatComponentMessage(new ChatComponentTranslation("Bound To: " + mr.owner));
				} else {
					player.addChatComponentMessage(new ChatComponentTranslation("Not Currently Bound"));
				}
				player.addChatComponentMessage(new ChatComponentTranslation(mr.getProductionRate() * mr.getMultiplier() / 20 + " Magical Energy/t"));
				player.addChatComponentMessage(new ChatComponentTranslation("Current Energy Stored: " + df.format(mr.magicalEnergy) + "/" + df.format(mr.getMaxStorage())));
			}
			return true;
		} else {
			System.out.println("NOTWORKING");
			return false;
		}
	}
	
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		TileEntityPlayerAltar pa = (TileEntityPlayerAltar)world.getTileEntity(x, y, z);
		if (pa.boundToPlayer) {
		for (int i = 0; i < 4; i++) {
			
			float particleX = x + rand.nextFloat();
			float particleY = y + rand.nextFloat();
			float particleZ = z + rand.nextFloat();
			
			float particleMotionX = -0.5F + rand.nextFloat();
			float particleMotionY = -0.5F + rand.nextFloat();
			float particleMotionZ = -0.5F + rand.nextFloat();
			
			
			world.spawnParticle("portal", particleX, particleY, particleZ, particleMotionX, particleMotionY, particleMotionZ);
			
		}
		}
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityPlayerAltar();
	}

	@SideOnly(Side.CLIENT)
	public static IIcon topIcon;
	@SideOnly(Side.CLIENT)
	public static IIcon sideIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
	topIcon = icon.registerIcon("magicmachinery:playerAltar_top");
	sideIcon = icon.registerIcon("magicmachinery:playerAltar_side");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
	if(side == 1) {
	return topIcon;
	} else {
	return sideIcon;
	}
	}
	
}
