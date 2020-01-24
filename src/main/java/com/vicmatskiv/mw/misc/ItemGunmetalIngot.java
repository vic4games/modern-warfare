package com.vicmatskiv.mw.misc;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemGunmetalIngot extends Item
{
	public ItemGunmetalIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GunmetalIngot"); 
//		setTextureName(ModernWarfareMod.MODID + ":" + "gunmetalingot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
	
}