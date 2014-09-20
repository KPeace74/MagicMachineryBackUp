package com.kpeace74.magicmachinery.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.kpeace74.magicmachinery.init.ModItems;

public class ItemMagicMachineryArmor extends ItemArmor {


	public ItemMagicMachineryArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}
	
	private String[] armourTypes = new String[] {"wingsOfImak"};
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
		if(stack.getItem().equals(ModItems.wingsOfImak)) {
			return "magicmachinery:armor/armor_1.png";
		} else {
			return null;
		}
		
			
	}
	
	
}
