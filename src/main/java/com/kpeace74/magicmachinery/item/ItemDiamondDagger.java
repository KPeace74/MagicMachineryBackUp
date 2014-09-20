package com.kpeace74.magicmachinery.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemDiamondDagger extends ItemMagicMachinery {
	

public ItemDiamondDagger() {
	super();
	setMaxStackSize(1);
	setMaxDamage(780);
	setUnlocalizedName("diamondDagger");
}

@Override
public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
{
    p_77644_1_.damageItem(1, p_77644_3_);
    return true;
}

}
