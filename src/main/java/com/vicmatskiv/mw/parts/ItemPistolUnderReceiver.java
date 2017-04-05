package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemPistolUnderReceiver extends Item
{
	public ItemPistolUnderReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "PistolUnderReceiver"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "pistolunderreceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}