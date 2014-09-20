package com.kpeace74.magicmachinery.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemStoneDagger extends ItemMagicMachinery {
	
	public ItemStoneDagger() {
		super();
		setUnlocalizedName("stoneDagger");
		setMaxStackSize(1);
		setMaxDamage(65);
	}
	
	//@Override
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
    {
        p_77644_1_.damageItem(1, p_77644_3_);
        return true;
    }

}
