package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Laser2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.LaserBeamRenderer;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemLaser2 extends ItemAttachment<Weapon>
{
	
	public ItemLaser2() {
		super(ModernWarfareMod.MODID, AttachmentCategory.GRIP, new Laser2(), "Laser2.png", null, null, null);
		setPostRenderer(new LaserBeamRenderer());
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Laser2"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Laser2");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}
