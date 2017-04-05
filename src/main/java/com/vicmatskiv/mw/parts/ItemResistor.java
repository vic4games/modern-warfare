package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemResistor extends Item
{
	public ItemResistor()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Resistor"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "resistor");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}