 package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemCloth extends Item
{
	public ItemCloth()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Cloth"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "Cloth");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}