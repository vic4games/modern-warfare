package com.vicmatskiv.mw.items.grenade;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;

public interface GrenadeFactory {

	public ItemGrenade createGrenade(CommonProxy commonProxy);
}
