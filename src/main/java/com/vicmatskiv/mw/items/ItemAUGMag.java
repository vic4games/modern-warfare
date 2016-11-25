package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemAUGMag extends ItemAmmo
{
	public ItemAUGMag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AUGMag"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "AR15Mag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}