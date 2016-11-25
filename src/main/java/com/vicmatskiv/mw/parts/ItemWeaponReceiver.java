package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemWeaponReceiver extends Item
{
	public ItemWeaponReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "WeaponReceiver"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "WeaponReceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}