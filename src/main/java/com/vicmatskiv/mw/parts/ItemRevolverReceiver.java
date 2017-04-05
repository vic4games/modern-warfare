package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemRevolverReceiver extends Item
{
	public ItemRevolverReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "RevolverReceiver"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "revolverreceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}