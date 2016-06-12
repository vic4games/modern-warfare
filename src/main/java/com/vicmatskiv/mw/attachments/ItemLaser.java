package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Laser;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.LaserBeamRenderer;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemLaser extends ItemAttachment<Weapon>
{
	
	public ItemLaser() {
		super(ModernWarfareMod.MODID, AttachmentCategory.GRIP, new Laser(), "Laser.png", null, null, null);
		
		setPostRenderer(new LaserBeamRenderer());
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "Laser"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "Laser");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}
