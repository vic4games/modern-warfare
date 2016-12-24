package com.vicmatskiv.mw.attachments;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

public class ItemAKMIron extends ItemAttachment<Weapon>
{
	public ItemAKMIron() {
		super(ModernWarfareMod.MODID, AttachmentCategory.SCOPE, "Sight");
		
		addModel(new AKMiron1(), "GunmetalTexture.png");
		addModel(new AKMiron2(), "GunmetalTexture.png");
		addModel(new AK47iron(), "GunmetalTexture.png");
		addModel(new M4Iron1(), "GunmetalTexture.png");
		addModel(new M4Iron2(), "GunmetalTexture.png");
		addModel(new P90iron(), "GunmetalTexture.png");
		addModel(new G36CIron1(), "GunmetalTexture.png");
		addModel(new G36CIron2(), "GunmetalTexture.png");
		addModel(new ScarIron1(), "GunmetalTexture.png");
		addModel(new ScarIron2(), "GunmetalTexture.png");
		addModel(new FALIron(), "GunmetalTexture.png");
		addModel(new M14Iron(), "GunmetalTexture.png");
		addModel(new MP5Iron(), "GunmetalTexture.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AKMIron"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "AKMIron");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}
