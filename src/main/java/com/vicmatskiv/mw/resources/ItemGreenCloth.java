 package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemGreenCloth extends Item
{
	public ItemGreenCloth()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GreenCloth"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "GreenCloth");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}