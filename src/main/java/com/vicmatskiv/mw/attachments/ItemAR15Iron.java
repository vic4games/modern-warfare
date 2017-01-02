package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AR15Iron;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemAR15Iron extends ItemAttachment<Weapon>
{
	public ItemAR15Iron() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SCOPE, "Sight");
		
		addModel(new M4Iron1(), "M4Iron1.png");
		addModel(new M4Iron2(), "M4Iron2.png");
		addModel(new FALIron(), "FALIron.png");
		addModel(new AR15Iron(), "AR15Iron.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AR15Iron"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "AR15Iron");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}
