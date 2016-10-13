package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemWoodWeaponStock extends Item
{
	public ItemWoodWeaponStock()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "WoodWeaponStock"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "WoodWeaponStock");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}