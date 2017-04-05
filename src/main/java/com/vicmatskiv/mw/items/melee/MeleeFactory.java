package com.vicmatskiv.mw.items.melee;

import com.vicmatskiv.mw.CommonProxy;

import net.minecraft.item.Item;

public interface MeleeFactory {
	
	public Item createMelee(CommonProxy commonProxy);
}
