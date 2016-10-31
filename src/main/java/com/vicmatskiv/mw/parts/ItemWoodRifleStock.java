package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemWoodRifleStock extends Item
{
	public ItemWoodRifleStock()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "WoodRifleStock"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "WoodRifleStock");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}