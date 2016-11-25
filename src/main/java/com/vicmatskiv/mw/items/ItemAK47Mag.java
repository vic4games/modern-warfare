package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemAK47Mag extends ItemAmmo
{
	public ItemAK47Mag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AK47Mag"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "AK47Mag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
//	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
//	{ 
//
//	par3List.add("Compatible Guns:"); 
//	par3List.add("AK-47"); 
//	par3List.add("AK-12"); 
//	par3List.add("AKM"); 
//
//	}
}