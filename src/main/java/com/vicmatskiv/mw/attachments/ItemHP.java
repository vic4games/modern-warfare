package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.HP;
import com.vicmatskiv.mw.models.HP2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemHP extends ItemAttachment<Weapon>
{
private static final float ZOOM_CHANGE_FACTOR = 0.2f;
	
	public ItemHP() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SCOPE, "HP",(attachment, weapon, player) -> {
			weapon.changeZoom(player, ZOOM_CHANGE_FACTOR);
		},
		(attachment, weapon, player) -> {
			weapon.changeZoom(player, 1);
		});
		addModel(new HP(), "AK12.png");
		addModel(new HP2(), "HP2.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "HP"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "HP");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}