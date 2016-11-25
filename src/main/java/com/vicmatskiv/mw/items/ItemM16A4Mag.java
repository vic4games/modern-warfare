package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemM16A4Mag extends ItemAmmo
{
	public ItemM16A4Mag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "M16A4Mag"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "M16A4Mag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}