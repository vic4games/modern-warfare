package com.vicmatskiv.mw.misc;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemSteelDust extends Item
{
	public ItemSteelDust()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SteelDust"); 
//		setTextureName(ModernWarfareMod.MODID + ":" + "steeldust");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
	
}