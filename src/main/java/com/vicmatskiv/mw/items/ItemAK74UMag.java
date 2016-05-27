package com.vicmatskiv.mw.items;


import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemAK74UMag extends ItemAmmo
{
	
	public ItemAK74UMag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AK74UMag"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "AK74UMag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
//	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
//	{ 
//		par3List.add("Compatible Guns:"); 
//		par3List.add("AK-74U"); 
//	}
}