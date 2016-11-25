package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemRPK74MMag extends ItemAmmo
{
	public ItemRPK74MMag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "RPK74MMag"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "RPK74MMag");
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