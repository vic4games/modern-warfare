package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Bipod;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemBipod extends ItemAttachment<Weapon>
{
	private static final float RECOIL_REDUCTION_FACTOR = 0.7f;
	
	public ItemBipod() {
		super(ModernWarfareMod.MODID, AttachmentCategory.GRIP, new Bipod(), "Bipod.png", null,
				(attachment, weapon, player) -> {
					weapon.changeRecoil(player, RECOIL_REDUCTION_FACTOR);
				},
				(attachment, weapon, player) -> {
					weapon.changeRecoil(player, 1);
				});
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Bipod"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Bipod");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}