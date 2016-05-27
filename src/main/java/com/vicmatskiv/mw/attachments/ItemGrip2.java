package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Grip2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemGrip2 extends ItemAttachment<Weapon>
{
	private static final float RECOIL_REDUCTION_FACTOR = .5f;
	
	public ItemGrip2() {
		super(ModernWarfareMod.MODID, AttachmentCategory.GRIP, new Grip2(), "Grip2.png", null,
				(attachment, weapon, player) -> {
					weapon.changeRecoil(player, RECOIL_REDUCTION_FACTOR);
				},
				(attachment, weapon, player) -> {
					weapon.changeRecoil(player, 1);
				});
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Grip2"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Grip2");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}