package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.LP;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemScope extends ItemAttachment<Weapon>
{
private static final float ZOOM_CHANGE_FACTOR = 0.4f;
	
	public ItemScope() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SCOPE, "LP",(attachment, weapon, player) -> {
			weapon.changeZoom(player, ZOOM_CHANGE_FACTOR);
		},
		(attachment, weapon, player) -> {
			weapon.changeZoom(player, 1);
		});
		addModel(new LP(), "LP.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "LP"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "LP");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}