package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemCapacitor extends Item
{
	public ItemCapacitor()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Capacitor"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Capacitor");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}