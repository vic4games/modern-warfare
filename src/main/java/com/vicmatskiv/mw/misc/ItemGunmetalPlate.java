package com.vicmatskiv.mw.misc;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemGunmetalPlate extends Item
{
    public ItemGunmetalPlate()
    {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GunmetalPlate"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "gunmetalplate");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
}