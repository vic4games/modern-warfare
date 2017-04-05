package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemWeaponStock extends Item
{
	public ItemWeaponStock()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "WeaponStock"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "weaponstock");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}