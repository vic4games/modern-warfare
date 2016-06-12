package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemGaussMag extends ItemAmmo
{
	public ItemGaussMag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GaussMag"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "GaussMag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
//	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
//	{ 
//		par3List.add("Compatible Guns:"); 
//		par3List.add("G36C"); 
//	}
}