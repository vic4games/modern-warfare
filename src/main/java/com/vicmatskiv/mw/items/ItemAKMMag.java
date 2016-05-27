package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemAKMMag extends ItemAmmo
{
	public ItemAKMMag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AKMMag"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "AKMMag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}