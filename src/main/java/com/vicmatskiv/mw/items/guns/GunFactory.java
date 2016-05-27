package com.vicmatskiv.mw.items.guns;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.CommonProxy;

public interface GunFactory {
	
	public Item createGun(CommonProxy commonProxy);
}
