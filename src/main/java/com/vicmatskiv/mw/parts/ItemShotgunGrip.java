package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemShotgunGrip extends Item
{
	public ItemShotgunGrip()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "ShotgunGrip"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "ShotgunGrip");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}