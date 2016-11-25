package com.vicmatskiv.mw.items;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemGunmetalMiniPlate extends Item
{
	public ItemGunmetalMiniPlate()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GunmetalMiniPlate"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "GunmetalMiniPlate");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}