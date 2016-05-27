package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemFamasMag extends ItemAmmo
{
	public ItemFamasMag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "FamasMag"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "FamasMag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}