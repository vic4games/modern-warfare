package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemRevolverAction extends Item
{
	public ItemRevolverAction()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "RevolverAction"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "revolveraction");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}