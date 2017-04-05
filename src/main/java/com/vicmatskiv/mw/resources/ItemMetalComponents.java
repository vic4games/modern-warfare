package com.vicmatskiv.mw.resources;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemMetalComponents extends Item
{
    public ItemMetalComponents()
    {
        setMaxStackSize(64);
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "MetalComponents"); 
        setTextureName(ModernWarfareMod.MODID + ":" + "metalcomponents");
        setCreativeTab(ModernWarfareMod.gunsTab);
    }
    
}