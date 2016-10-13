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
		
		addModel(new AKMiron1(), "AKMIron1.png");
		addModel(new AKMiron2(), "AKMiron2.png");
		addModel(new AK47iron(), "AK47iron.png");
		addModel(new M4Iron1(), "M4Iron1.png");
		addModel(new M4Iron2(), "M4Iron2.png");
		addModel(new P90iron(), "P90iron.png");
		addModel(new G36CIron1(), "G36CIron1.png");
		addModel(new G36CIron2(), "G36CIron2.png");
		addModel(new ScarIron1(), "ScarIron1.png");
		addModel(new ScarIron2(), "ScarIron2.png");
		addModel(new FALIron(), "FALIron.png");
		addModel(new M14Iron(), "M14Iron.png");
		addModel(new MP5Iron(), "AK12.png");
		
		setMaxStackSize(1);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "AKMIron"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "AKMIron");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}
