package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemShotgunReceiver extends Item
{
	public ItemShotgunReceiver()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "ShotgunReceiver"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "shotgunreceiver");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}