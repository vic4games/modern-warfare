package com.vicmatskiv.mw.entities;

import com.vicmatskiv.weaponlib.ModContext;

import net.minecraft.entity.Entity;

public interface EntityFactory {

    public void createEntity(ModContext modContext);
    
}
