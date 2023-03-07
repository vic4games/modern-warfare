package com.paneedah.mw.misc;

import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemVestRender extends Item {

    public ItemVestRender() {
        setMaxStackSize(1);
        setUnlocalizedName(ModReference.MWC_ID + "_" + "vestrender");
//        setTextureName(ModReference.MWC_ID + ":" + "syntheticplastic");
//        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
