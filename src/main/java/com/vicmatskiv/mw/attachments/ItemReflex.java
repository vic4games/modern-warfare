package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemReflex extends ItemAttachment<Weapon>
{
	public ItemReflex() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SCOPE, "Sight");
		
		addModel(new Reflex(), "Reflex.png");
		addModel(new Reflex2(), "Reflex2.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Reflex"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Reflex");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}