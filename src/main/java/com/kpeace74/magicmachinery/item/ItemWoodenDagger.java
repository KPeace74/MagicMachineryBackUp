package com.kpeace74.magicmachinery.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemWoodenDagger extends ItemMagicMachinery {

	public ItemWoodenDagger() {
		super();
		setUnlocalizedName("woodenDagger");
		setMaxStackSize(1);
		setMaxDamage(30);
	}

	@Override
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
    {
        p_77644_1_.damageItem(1, p_77644_3_);
        return true;
    }
	
}
