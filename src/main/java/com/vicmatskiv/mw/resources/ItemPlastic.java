package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemPlastic extends Item
{
	public ItemPlastic()
	{
		setMaxStackSize(16);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Plastic"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "plastic");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}