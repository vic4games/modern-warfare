package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Holo;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemHolo extends ItemAttachment<Weapon>
{
	public ItemHolo() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SCOPE, "Sight");
		
		addModel(new Holo(), "Holo.png");
		addModel(new Holo2(), "Holo2.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Holo"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Holo");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}