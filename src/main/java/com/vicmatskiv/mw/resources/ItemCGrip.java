 package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemCGrip extends Item
{
	public ItemCGrip()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "CGrip"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "CGrip");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}