package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemRuby extends Item
{
	public ItemRuby()
	{
		setMaxStackSize(16);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Ruby"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "ruby");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}