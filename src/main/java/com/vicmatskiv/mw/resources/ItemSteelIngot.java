package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemSteelIngot extends Item
{
	public ItemSteelIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SteelIngot"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "SteelIngot");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}