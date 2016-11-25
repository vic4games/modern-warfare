 package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemBullets extends Item
{
	public ItemBullets()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Bullets"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "Bullets");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}