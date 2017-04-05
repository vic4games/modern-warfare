 package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemTanCloth extends Item
{
	public ItemTanCloth()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "TanCloth"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "tancloth");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}