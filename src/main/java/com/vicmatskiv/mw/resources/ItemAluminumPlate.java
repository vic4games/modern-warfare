package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemAluminumPlate extends Item
{
	public ItemAluminumPlate()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AluminumPlate"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "AluminumPlate");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}