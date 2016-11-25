package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemDeagleReceiver extends Item
{
	public ItemDeagleReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "DeagleReceiver"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "DeagleReceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}