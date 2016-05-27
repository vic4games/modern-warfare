package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemLeadIngot extends Item
{
	public ItemLeadIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "LeadIngot"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "LeadIngot");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}