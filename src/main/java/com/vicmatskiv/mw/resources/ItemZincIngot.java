package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemZincIngot extends Item
{
	public ItemZincIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "ZincIngot"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "ZincIngot");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}