package com.vicmatskiv.mw.misc;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemSyntheticPlastic extends Item
{
    public ItemSyntheticPlastic()
    {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SyntheticPlastic"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "syntheticplastic");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
}