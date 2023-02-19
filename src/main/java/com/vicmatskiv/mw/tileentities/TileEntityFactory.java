package com.vicmatskiv.mw.tileentities;

import com.vicmatskiv.weaponlib.ModContext;

import net.minecraft.entity.Entity;

public interface TileEntityFactory {

    public void createTileEntity(ModContext modContext);
    
}
