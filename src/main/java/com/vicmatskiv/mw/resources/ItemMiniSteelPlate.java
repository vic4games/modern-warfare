package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemMiniSteelPlate extends Item
{
	public ItemMiniSteelPlate()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "MiniSteelPlate"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "ministeelplate");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}