package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemM1911Mag extends ItemAmmo
{
	public ItemM1911Mag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "M1911Mag"); 

		setCreativeTab(ModernWarfareMod.gunsTab);
	}
}
