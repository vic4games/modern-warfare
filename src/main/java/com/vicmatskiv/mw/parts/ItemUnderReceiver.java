package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemUnderReceiver extends Item
{
	public ItemUnderReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "UnderReceiver"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "UnderReceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}