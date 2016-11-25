package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemBarrel extends Item
{
	public ItemBarrel()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Barrel"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "Barrel");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}