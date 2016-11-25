package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemTitaniumIngot extends Item
{
	public ItemTitaniumIngot()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "TitaniumIngot"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "TitaniumIngot");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}