package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.ACOG;
import com.vicmatskiv.mw.models.Suppressor;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemSilencer extends ItemAttachment<Weapon>
{
	public ItemSilencer() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SILENCER, new Suppressor(), "Silencer.png", null);
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Silencer"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Silencer");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}
