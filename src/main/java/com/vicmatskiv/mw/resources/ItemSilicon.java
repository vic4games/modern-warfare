package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemSilicon extends Item
{
	public ItemSilicon()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Silicon"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Silicon");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}