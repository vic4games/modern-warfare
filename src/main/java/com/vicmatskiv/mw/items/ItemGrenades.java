package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemGrenades extends ItemAmmo
{
	public ItemGrenades()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Grenades"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Grenades");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}

}