package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemBigSteelPlate extends Item
{
    public ItemBigSteelPlate()
    {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "BigSteelPlate"); 
        setTextureName(ModernWarfareMod.MODID + ":" + "bigsteelplate");
        setCreativeTab(ModernWarfareMod.gunsTab);
    }
    
}