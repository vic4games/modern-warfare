package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemInductor extends Item
{
	public ItemInductor()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Inductor"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Inductor");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}