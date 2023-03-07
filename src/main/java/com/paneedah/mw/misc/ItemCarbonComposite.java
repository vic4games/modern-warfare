package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemCarbonComposite extends Item {

    public ItemCarbonComposite() {
        setMaxStackSize(64);
        setUnlocalizedName(ModReference.MWC_ID + "_" + "CarbonComposite");
        //setTextureName(ModReference.MWC_ID + ":" + "carboncomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
