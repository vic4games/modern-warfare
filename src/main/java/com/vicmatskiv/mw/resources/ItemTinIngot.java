package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemTinIngot extends Item
{
	public ItemTinIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "TinIngot"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "TinIngot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
	
}