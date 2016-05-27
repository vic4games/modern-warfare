package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Laser2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemLaser2 extends ItemAttachment<Weapon>
{
	private static final float RECOIL_REDUCTION_FACTOR = 0.5f;
	
	public ItemLaser2() {
		super(ModernWarfareMod.MODID, AttachmentCategory.GRIP, new Laser2(), "Laser2.png", null,
				(attachment, weapon, player) -> {
					weapon.changeRecoil(player, RECOIL_REDUCTION_FACTOR);
				},
				(attachment, weapon, player) -> {
					weapon.changeRecoil(player, 1);
				});
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Laser2"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Laser2");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}
