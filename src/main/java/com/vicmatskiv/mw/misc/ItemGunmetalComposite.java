package com.vicmatskiv.mw.misc;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemGunmetalComposite extends Item
{
    public ItemGunmetalComposite()
    {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "GunmetalComposite"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "gunmetalcomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
}