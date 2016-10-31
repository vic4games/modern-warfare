package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemM1Mag extends ItemAmmo
{
	public ItemM1Mag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "M1Mag"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "M1Mag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}