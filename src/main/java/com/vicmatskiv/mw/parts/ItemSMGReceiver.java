package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemSMGReceiver extends Item
{
	public ItemSMGReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SMGReceiver"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "smgreceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}