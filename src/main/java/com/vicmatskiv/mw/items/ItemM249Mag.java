package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemM249Mag extends ItemAmmo
{
	public ItemM249Mag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "M249Mag"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "M249Mag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}