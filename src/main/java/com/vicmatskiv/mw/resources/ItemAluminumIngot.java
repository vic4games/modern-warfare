package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemAluminumIngot extends Item
{
	public ItemAluminumIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AluminumIngot"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "AluminumIngot");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}