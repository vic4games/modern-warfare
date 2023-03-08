package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemPlasticPlate extends Item {

    public ItemPlasticPlate() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.MWC_ID + "_" + "PlasticPlate");
//        setTextureName(ModReference.MWC_ID + ":" + "plasticplate");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
