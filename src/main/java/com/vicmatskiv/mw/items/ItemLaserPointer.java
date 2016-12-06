package com.vicmatskiv.mw.items;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemLaserPointer extends Item
{
	public ItemLaserPointer()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "LaserPointer"); 
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}