package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemTantalumIngot extends Item
{
	public ItemTantalumIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "TantalumIngot"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "TantalumIngot");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}