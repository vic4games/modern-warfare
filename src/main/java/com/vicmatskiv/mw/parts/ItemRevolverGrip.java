package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemRevolverGrip extends Item
{
	public ItemRevolverGrip()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "RevolverGrip"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "RevolverGrip");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}