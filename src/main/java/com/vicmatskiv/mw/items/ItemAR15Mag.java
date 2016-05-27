package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemAR15Mag extends ItemAmmo
{
	public ItemAR15Mag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AR15Mag"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "AR15Mag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
//	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
//	{ 
//		par3List.add("Compatible Guns:"); 
//		par3List.add("AR15"); 
//		par3List.add("M4A4");
//		par3List.add("M16A4");
//		par3List.add("AUG");
//		par3List.add("Famas-G2");
//		par3List.add("Scar-H");
//	}
}