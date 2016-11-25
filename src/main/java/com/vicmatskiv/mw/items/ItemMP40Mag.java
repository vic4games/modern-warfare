package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemMP40Mag extends ItemAmmo
{
	public ItemMP40Mag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "MP40Mag"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "MP40Mag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
//	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
//	{ 
//		par3List.add("Compatible Guns:"); 
//		par3List.add("Magnum"); 
//	}
}