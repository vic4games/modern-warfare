package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemElectronics extends Item
{
	public ItemElectronics()
	{
		setMaxStackSize(32);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Electronics"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "electronics");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}