package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemAK12Mag extends ItemAmmo
{
	public ItemAK12Mag()
	
	
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AK12Mag"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "AKMMag");
		setCreativeTab(ModernWarfareMod.gunsTab);
		
		
	}
	
}