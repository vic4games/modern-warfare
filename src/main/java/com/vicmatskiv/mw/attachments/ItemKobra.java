package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemKobra extends ItemAttachment<Weapon>
{
	public ItemKobra() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SCOPE, "Sight");
		
		addModel(new Kobra(), "Kobra.png");
		addModel(new Reflex2(), "Reflex2.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Kobra"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Kobra");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}