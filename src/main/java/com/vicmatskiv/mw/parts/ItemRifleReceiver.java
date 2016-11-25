package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemRifleReceiver extends Item
{
	public ItemRifleReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "RifleReceiver"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "RifleReceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}