package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemTransistor extends Item
{
	public ItemTransistor()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Transistor"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "transistor");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}