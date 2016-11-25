package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemCopperWiring extends Item
{
	public ItemCopperWiring()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "CopperWiring"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "CopperWiring");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}