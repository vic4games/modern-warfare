package com.vicmatskiv.mw.misc;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemVestRender extends Item
{
    public ItemVestRender()
    {
        setMaxStackSize(1);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "vestrender"); 
//        setTextureName(ModernWarfareMod.MODID + ":" + "syntheticplastic");
//        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
}