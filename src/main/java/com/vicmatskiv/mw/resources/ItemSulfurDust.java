package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemSulfurDust extends Item
{
	public ItemSulfurDust()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SulfurDust"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "SulfurDust");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
	
}