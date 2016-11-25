package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemLMGReceiver extends Item
{
	public ItemLMGReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "LMGReceiver"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "LMGReceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}