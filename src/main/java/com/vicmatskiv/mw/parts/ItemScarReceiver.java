package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemScarReceiver extends Item
{
	public ItemScarReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "ScarReceiver"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "ScarReceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}