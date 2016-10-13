package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemPiston extends Item
{
	public ItemPiston()
	{
		setMaxStackSize(16);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Piston"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Piston");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}