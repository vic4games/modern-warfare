package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemHolo2 extends ItemAttachment<Weapon>
{
	public ItemHolo2() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SCOPE, "Sight");
		
		addModel(new Holographic(), "Holographic.png");
		addModel(new Holo2(), "Holo3.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Holo2"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Holo2");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}