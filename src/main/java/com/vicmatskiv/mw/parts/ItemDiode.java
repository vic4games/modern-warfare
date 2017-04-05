package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemDiode extends Item
{
	public ItemDiode()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Diode"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "diode");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}