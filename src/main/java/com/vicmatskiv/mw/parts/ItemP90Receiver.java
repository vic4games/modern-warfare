package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemP90Receiver extends Item
{
	public ItemP90Receiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "P90Receiver"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "P90Receiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}