package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemScarHMag extends ItemAmmo
{
	public ItemScarHMag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "ScarHMag"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "ScarHMag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
//	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
//	{ 
//		par3List.add("Compatible Guns:"); 
//		par3List.add("Scar"); 
//	}
}