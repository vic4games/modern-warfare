package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemM14Mag extends ItemAmmo
{
	public ItemM14Mag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "M14Mag"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "FNFALMag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
//	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
//	{ 
//		par3List.add("Compatible Guns:"); 
//		par3List.add("M14 DMR"); 
//	}
}