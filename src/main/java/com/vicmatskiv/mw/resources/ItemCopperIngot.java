 package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemCopperIngot extends Item
{
	public ItemCopperIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "CopperIngot"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "CopperIngot");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}