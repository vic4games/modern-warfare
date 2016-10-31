package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemSecondaryStock extends Item
{
	public ItemSecondaryStock()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SecondaryStock"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "SecondaryStock");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}