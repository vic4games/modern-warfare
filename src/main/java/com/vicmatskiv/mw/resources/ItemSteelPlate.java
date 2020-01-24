package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemSteelPlate extends Item
{
	public ItemSteelPlate()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SteelPlate"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "SteelPlate");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
	
}