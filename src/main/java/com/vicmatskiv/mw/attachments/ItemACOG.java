package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.ACOG;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemACOG extends ItemAttachment<Weapon> {
	
	private static final float ZOOM_CHANGE_FACTOR = 0.7f;
	
	public ItemACOG() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SCOPE, "Sight",(attachment, weapon, player) -> {
			weapon.changeZoom(player, ZOOM_CHANGE_FACTOR);
		},
		(attachment, weapon, player) -> {
			weapon.changeZoom(player, 1);
		});
		
		addModel(new ACOG(), "Acog.png");
		addModel(new Acog2(), "Acog2.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "ACOG"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Acog");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}

}