package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemOpticGlass extends Item
{
	public ItemOpticGlass()
	{
		setMaxStackSize(16);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "OpticGlass"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "OpticGlass");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}