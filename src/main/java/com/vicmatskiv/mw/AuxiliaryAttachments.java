package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AR15CarryHandle;
import com.vicmatskiv.mw.models.BulletBig;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Ghost350bolt;
import com.vicmatskiv.mw.models.Ghost350string1;
import com.vicmatskiv.mw.models.Ghost350string2;
import com.vicmatskiv.mw.models.LeeEnfieldSMLEsight;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M3A1frontsight;
import com.vicmatskiv.mw.models.M3A1rearsight;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

public class AuxiliaryAttachments {

    public static ItemAttachment<Weapon> M1CarbineAction;
    public static ItemAttachment<Weapon> FNP90Sight;
    public static ItemAttachment<Weapon> AR15Iron;
    public static ItemAttachment<Weapon> Extra;
    public static ItemAttachment<Weapon> ExtraAR;
    public static ItemAttachment<Weapon> GlockTop;
    public static ItemAttachment<Weapon> Glock21Slide;
    public static ItemAttachment<Weapon> Glock32Slide;
    public static ItemAttachment<Weapon> G18Top;
    public static ItemAttachment<Weapon> M9Top;
    public static ItemAttachment<Weapon> P2000Top;
    public static ItemAttachment<Weapon> DeagleTop;
    public static ItemAttachment<Weapon> Deagle44Top;
    public static ItemAttachment<Weapon> KSGPump;
    public static ItemAttachment<Weapon> L115Bolt1;
    public static ItemAttachment<Weapon> L115Bolt2;
    public static ItemAttachment<Weapon> SV98Action;
    public static ItemAttachment<Weapon> RevolverCase;
    public static ItemAttachment<Weapon> PythonCase;
    public static ItemAttachment<Weapon> R870Pump;
    public static ItemAttachment<Weapon> R870PumpTac;
    public static ItemAttachment<Weapon> M1911Top;
    public static ItemAttachment<Weapon> Taurus1911Slide;
    public static ItemAttachment<Weapon> M9SDsuppressor;
    public static ItemAttachment<Weapon> MosinBolt;
    public static ItemAttachment<Weapon> MosinBolt2;
    public static ItemAttachment<Weapon> USP45Top;
    public static ItemAttachment<Weapon> Maxim9Slide;
    public static ItemAttachment<Weapon> Maxim9FrontSight;
    public static ItemAttachment<Weapon> MakarovTop;
    public static ItemAttachment<Weapon> AK12IronSight;
    public static ItemAttachment<Weapon> M14Rail;
    public static ItemAttachment<Weapon> P225Top;
    public static ItemAttachment<Weapon> P226Top;
    public static ItemAttachment<Weapon> P30Top;
    public static ItemAttachment<Weapon> MP5KGrip;
    public static ItemAttachment<Weapon> HecateIIBoltAction;
    public static ItemAttachment<Weapon> AR15Action;
    public static ItemAttachment<Weapon> BushmasterACRAction;
    public static ItemAttachment<Weapon> RemingtonACRAction;
    public static ItemAttachment<Weapon> AKIron;
    public static ItemAttachment<Weapon> AKpart;
    public static ItemAttachment<Weapon> AKpart2;
    public static ItemAttachment<Weapon> AKaction;
    public static ItemAttachment<Weapon> AN94action;
    public static ItemAttachment<Weapon> VSSVintorezAction;
    public static ItemAttachment<Weapon> AK12action;
    public static ItemAttachment<Weapon> AKS74UIron;
    public static ItemAttachment<Weapon> AKRail;
    public static ItemAttachment<Weapon> AUGRail;
    public static ItemAttachment<Weapon> BushmasterACRRail;
    public static ItemAttachment<Weapon> RemingtonACRRail;
    public static ItemAttachment<Weapon> M4Rail;
    public static ItemAttachment<Weapon> ScarAction;
    public static ItemAttachment<Weapon> G36Rail;
    public static ItemAttachment<Weapon> G36Action;
    public static ItemAttachment<Weapon> FamasCarryHandle;
    public static ItemAttachment<Weapon> FamasAction;
    public static ItemAttachment<Weapon> AUGAction;
    public static ItemAttachment<Weapon> FamasBipod1;
    public static ItemAttachment<Weapon> FamasBipod2;
    public static ItemAttachment<Weapon> FelinAction;
    public static ItemAttachment<Weapon> FelinCarryHandle;
    public static ItemAttachment<Weapon> M14Action;
    public static ItemAttachment<Weapon> M14Action2;
    public static ItemAttachment<Weapon> DupletBarrels;
    public static ItemAttachment<Weapon> M107action;
    public static ItemAttachment<Weapon> MP40action;
    public static ItemAttachment<Weapon> Bullet;
    public static ItemAttachment<Weapon> PPSHRearSight;
    public static ItemAttachment<Weapon> M1A1rearsight;
    public static ItemAttachment<Weapon> PPSH41action;
    public static ItemAttachment<Weapon> Type100action;
    public static ItemAttachment<Weapon> M1A1action;
    public static ItemAttachment<Weapon> MP18action;
    public static ItemAttachment<Weapon> R700action;
    public static ItemAttachment<Weapon> M110action;
    public static ItemAttachment<Weapon> M16A1CarryHandle;
    public static ItemAttachment<Weapon> P99Slide;
    public static ItemAttachment<Weapon> Saiga12action;
    public static ItemAttachment<Weapon>Saiga12sights;
    public static ItemAttachment<Weapon> SVT40action;
    public static ItemAttachment<Weapon> M1Garandaction;
    public static ItemAttachment<Weapon> M1GarandMag1;
    public static ItemAttachment<Weapon> M1GarandMag2;
    public static ItemAttachment<Weapon> SKSaction;
    public static ItemAttachment<Weapon> SKSmag1;
    public static ItemAttachment<Weapon> SKSmag2;
    public static ItemAttachment<Weapon> M1CarbineRearSight;
    public static ItemAttachment<Weapon> SpringfieldAction;
    public static ItemAttachment<Weapon> Kar98Kaction;
    public static ItemAttachment<Weapon> SpringfieldRearSight;
    public static ItemAttachment<Weapon> WebleyBullets;
    public static ItemAttachment<Weapon> WebleyCylinder;
    public static ItemAttachment<Weapon> M1928action;
    public static ItemAttachment<Weapon> M1928rearsight;
    public static ItemAttachment<Weapon> LugerAction1;
    public static ItemAttachment<Weapon> LugerAction2;
    public static ItemAttachment<Weapon> M3A1action;
    public static ItemAttachment<Weapon> M3A1sight;
    public static ItemAttachment<Weapon> STG44Action;
    public static ItemAttachment<Weapon> Gewehr98Action;
    public static ItemAttachment<Weapon> G98RearSight;
    public static ItemAttachment<Weapon> M1GarandRearSight;
    public static ItemAttachment<Weapon> LeeEnfieldSMLEaction;
    public static ItemAttachment<Weapon> LeeEnfieldSMLESight;
    public static ItemAttachment<Weapon> LeeEnfieldClip;
    public static ItemAttachment<Weapon> LeeEnfieldClipBullets;
    public static ItemAttachment<Weapon> Tec9Action;
    public static ItemAttachment<Weapon> M249Action;
    public static ItemAttachment<Weapon> M249Cover;
    public static ItemAttachment<Weapon> MA37action;
    public static ItemAttachment<Weapon> SRS99S5action;
    public static ItemAttachment<Weapon> M395Baction;
    public static ItemAttachment<Weapon> M6Gslide;
    public static ItemAttachment<Weapon> MagnumReticle;
    public static ItemAttachment<Weapon> BR55action;
    public static ItemAttachment<Weapon> MA5Daction;
    public static ItemAttachment<Weapon> PLR16action;
    public static ItemAttachment<Weapon> MP43Edoublebarrel;
    public static ItemAttachment<Weapon> S686doublebarrel;
    public static ItemAttachment<Weapon> CrossbowString1;
    public static ItemAttachment<Weapon> CrossbowString2;
    public static ItemAttachment<Weapon> CrossbowBolt;
    public static ItemAttachment<Weapon> Emp1911Slide;
    public static ItemAttachment<Weapon> USG57Slide;
 
    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {

        AR15Iron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4Iron1(), "AK12.png")
                .withModel(new M4Iron2(), "AK12.png").withModel(new FALIron(), "AK12.png")
                .withModel(new AR15CarryHandle(), "AK12.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR15CarryHandle) {
                        GL11.glTranslatef(-0.6F, 0F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.7F, 0.75f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR15CarryHandle) {
                        GL11.glTranslatef(0.1F, 0F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR15CarryHandle) {
                        GL11.glTranslatef(-1.6F, -0.5F, 1.2F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe(
                        " AA",
                        "F F",
                        'A', Ores.INGOT_STEEL,
                        'F', CommonProxy.SteelPlate

                        )
                .withName("AR15Iron").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M16A1CarryHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA7)
                .withModel(new M4Iron1(), "AK12.png")
                .withModel(new M4Iron2(), "AK12.png").withModel(new FALIron(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.M16A1CarryHandle(), "AK12.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16A1CarryHandle) {
                        GL11.glTranslatef(-0.6F, 0F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.7F, 0.75f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16A1CarryHandle) {
                        GL11.glTranslatef(0.1F, 0F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16A1CarryHandle) {
                        GL11.glTranslatef(-1.6F, -0.5F, 1.2F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe(
                        " AA",
                        "FAF",
                        'A', Ores.INGOT_STEEL,
                        'F', CommonProxy.SteelPlate

                        )
                .withName("M16A1CarryHandle").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Extra = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new AKMiron1(), "GunmetalTexture.png").withModel(new AKMiron2(), "GunmetalTexture.png")
                .withModel(new AK47iron(), "GunmetalTexture.png").withModel(new M4Iron1(), "GunmetalTexture.png")
                .withModel(new M4Iron2(), "GunmetalTexture.png").withModel(new P90iron(), "GunmetalTexture.png")
                .withModel(new G36CIron1(), "GunmetalTexture.png").withModel(new G36CIron2(), "GunmetalTexture.png")
                .withModel(new ScarIron1(), "GunmetalTexture.png").withModel(new ScarIron2(), "GunmetalTexture.png")
                .withModel(new FALIron(), "GunmetalTexture.png").withModel(new M14Iron(), "GunmetalTexture.png")
                .withModel(new MP5Iron(), "AK12.png")
                .withName("Extra").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M3A1sight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                .withModel(new M3A1rearsight(), "M3A1greasegun.png")
                .withModel(new M3A1frontsight(), "M3A1greasegun.png")
                .withName("M3A1sight").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        CrossbowString1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                .withModel(new Ghost350string1(), "Ghost350.png")
                .withRenderablePart()
                .withName("CrossbowString1").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        CrossbowString2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                .withModel(new Ghost350string2(), "Ghost350.png")
                .withRenderablePart()
                .withName("CrossbowString2").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        CrossbowBolt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA5)
                .withModel(new Ghost350bolt(), "Ghost350.png")
                .withRenderablePart()
                .withName("CrossbowBolt").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        LeeEnfieldSMLESight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA5)
                .withModel(new LeeEnfieldSMLEsight(), "AK12.png")
                .withName("LeeEnfieldSMLESight").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        PPSHRearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.PPSHRearSight(), "PPSH41.png")
                .withName("PPSHRearSight")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SpringfieldRearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SpringfieldRearSight(), "AK12.png")
                .withName("SpringfieldRearSight")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        G98RearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA5)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.G98RearSight(), "AK12.png")
                .withName("G98RearSight")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1A1rearsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1A1rearsight(), "GunmetalTexture.png")
                .withName("M1A1rearsight")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1GarandRearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.m1garandrearsight(), "GunmetalTexture.png")
                .withName("M1GarandRearSight")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1928rearsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1928rearsight(), "GunmetalTexture.png")
                .withName("M1928rearsight")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1Garandaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1GarandAction(), "NATOMag1.png")
                .withName("M1Garandaction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MA37action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MA37Action(), "MA37.png")
                .withName("MA37Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MA5Daction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MA5Daction(), "MA5D.png")
                .withName("MA5Daction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        BR55action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.BR55action(), "BR55.png")
                .withName("BR55action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M395Baction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M395Baction(), "M395B.png")
                .withName("M395Baction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SRS99S5action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SRS99S5action(), "SRS99S5.png")
                .withName("SRS99S5action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Tec9Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Tec9Action(), "AK12.png")
                .withName("Tec9Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M249Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M249Action(), "M249.png")
                .withName("M249Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M249Cover = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M249Cover(), "M249.png")
                .withModel(new com.vicmatskiv.mw.models.M249RearSight(), "AK12.png")
                .withName("M249Cover")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        LeeEnfieldSMLEaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.LeeEnfieldSMLEAction(), "LeeEnfieldSMLE.png")
                .withName("LeeEnfieldSMLEaction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        LeeEnfieldClip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.LeeEnfieldClip(), "sksstripper.png")
                .withName("LeeEnfieldClip")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        LeeEnfieldClipBullets = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.LeeEnfieldClipBullets(), "sksstripper.png")
                .withName("LeeEnfieldClipBullets")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M3A1action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M3A1GreaseGunAction(), "M3A1GreaseGun.png")
                .withName("M3A1GreaseGun")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SpringfieldAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SpringfieldAction(), "m1903a3.png")
                .withName("SpringfieldAction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Kar98Kaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Kar98Kaction(), "Kar98K.png")
                .withName("Kar98Kaction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Gewehr98Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Gewehr98Action(), "Gewehr98.png")
                .withName("Gewehr98Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        STG44Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.STG44Action(), "STG44.png")
                .withName("STG44Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1GarandMag1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1GarandMag1(), "M1GarandMag.png")
                .withName("M1GarandMag1")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1GarandMag2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1GarandMag2(), "M1GarandMag.png")
                .withName("M1GarandMag2")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        LugerAction1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.LugerAction1(), "LugerP08.png")
                .withName("LugerAction1")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        LugerAction2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.LugerAction2(), "LugerP08.png")
                .withName("LugerAction2")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        WebleyCylinder = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.WebleyCylinder(), "Webley.png")
                .withName("WebleyCylinder")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        WebleyBullets = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.WebleyBullets(), "Webley.png")
                .withName("WebleyBullets")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SKSmag1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SKSstripper(), "sksstripper.png")
                .withName("SKSmag1")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SKSmag2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SKSstripper2(), "sksstripper.png")
                .withName("SKSmag2")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SKSaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SKSaction(), "NATOmag1.png")
                .withName("SKSaction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Bullet = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                .withModel(new BulletBig(), "Bullet.png")
                .withName("Bullet")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        ExtraAR = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AR15Iron(), "AK12.png").withModel(new FALIron(), "AK12.png")
                .withModel(new M4Iron1(), "AK12.png").withModel(new M4Iron2(), "AK12.png").withName("ExtraAR")
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        DupletBarrels = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.DupletBarrels(), "Duplet.png")
                .withRenderablePart()
                .withName("DupletBarrels")
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SVT40action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SVT40action(), "SVT40.png").withName("SVT40action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        GlockTop = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.GlockTop(), "GlockTop.png").withName("GlockTop")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P99Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.P99Slide(), "P99.png").withName("P99Slide")
                .withModel(new com.vicmatskiv.mw.models.P2000rearsight(), "usp45rearsight.png")
                .withModel(new com.vicmatskiv.mw.models.P226frontsight(), "usp45frontsight.png")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        USG57Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.USG57slide(), "USG57.png").withName("USG57slide")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.vicmatskiv.mw.models.M1911rearsight(), "m1911rearsight")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M6Gslide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M6Gslide(), "M6G.png").withName("M6Gslide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MagnumReticle = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MagnumReticle(), "MagnumReticle.png").withName("MagnumReticle")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        R700action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.R700action(), "R700action.png").withName("R700action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1A1action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1A1action(), "M1A1Thompson.png").withName("M1A1action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1928action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1928action(), "gunmetaltexture.png").withName("M1928action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Saiga12action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Saiga12action(), "ak12.png").withName("Saiga12action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP18action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP18action(), "MP18.png").withName("MP18action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        PPSH41action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.PPSH41action(), "PPSH41.png").withName("PPSH41action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Type100action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Type100action(), "PPSH41.png").withName("Type100action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1CarbineAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1CarbineAction(), "M1Carbine.png").withName("M1CarbineAction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1CarbineRearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1CarbineRearSight(), "AK12.png").withName("M1CarbineRearSight")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Glock21Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Glock21Slide(), "Glock21Slide.png").withName("Glock21Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Glock32Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Glock32Slide(), "Glock32Slide.png").withName("Glock32Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP40action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP40Action(), "MP40.png").withName("MP40action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        G18Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.GlockTop(), "G18Top.png").withName("G18Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M9Top = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M9Top(), "M9Top.png")
                .withModel(new com.vicmatskiv.mw.models.M9rearsight(), "m9rearsight.png")
                .withModel(new com.vicmatskiv.mw.models.m9frontsight(), "m9frontsight.png")
                .withName("M9Top").withRenderablePart()
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AK12IronSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AK12IronSight(), "GunmetalTexture.png")
                .withName("AK12IronSight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        M9SDsuppressor = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "GunmetalTexture.png").withName("M9SDsuppressor")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        P2000Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.P2000Top(), "P2000Top.png")
                .withModel(new com.vicmatskiv.mw.models.P2000rearsight(), "p2000rearsight.png")
                .withModel(new com.vicmatskiv.mw.models.P226frontsight(), "p226frontsight.png")
                .withName("P2000Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        DeagleTop = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.DeagleTop(), "Deagle.png").withName("DeagleTop")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Deagle44Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.DeagleTop(), "Deagle44.png").withName("Deagle44Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        KSGPump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.KSG12Pump(), "NATOMag1.png").withName("KSGPump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        L115Bolt1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.L96Action(), "L96Action.png").withName("L96Action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SV98Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SV98Action(), "SV98Action.png").withName("SV98Action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        L115Bolt2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.L115Bolt2(), "AK12.png").withName("LP115Bolt2")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MosinBolt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MosinBolt(), "mosinbolt.png").withName("MosinBolt")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MosinBolt2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MosinBolt2(), "mosinbolt.png").withName("MosinBolt2")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RevolverCase = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MagnumCase(), "MagnumCase.png").withName("RevolverCase")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        PythonCase = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MagnumCase(), "PythonCase.png").withName("PythonCase")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        R870Pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.RemingtonPump(), "Remington870.png").withName("R870Pump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP43Edoublebarrel = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP43Edoublebarrel(), "MP43E.png").withName("MP43Edoublebarrel")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        S686doublebarrel = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.S686doublebarrel(), "S686.png").withName("S686doublebarrel")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        R870PumpTac = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870TacPump(), "Remington870Tactical.png").withName("R870PumpTac")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M1911Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1911Top(), "M1911.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.vicmatskiv.mw.models.M1911rearsight(), "m1911rearsight")
                .withName("M1911Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Taurus1911Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Taurus1911Slide(), "Taurus1911.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.vicmatskiv.mw.models.M1911rearsight(), "m1911rearsight")
                .withName("Taurus1911Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Emp1911Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Emp1911Slide(), "Emp1911.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.vicmatskiv.mw.models.M1911rearsight(), "m1911rearsight")
                .withName("Emp1911Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        USP45Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.USP45Top(), "USP45Top.png")
                .withModel(new com.vicmatskiv.mw.models.P2000rearsight(), "usp45rearsight.png")
                .withModel(new com.vicmatskiv.mw.models.P226frontsight(), "usp45frontsight.png")
                .withName("USP45Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Maxim9Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Maxim9slide(), "Maxim9.png")
                .withModel(new com.vicmatskiv.mw.models.P2000rearsight(), "usp45rearsight.png")
                .withName("Maxim9Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Maxim9FrontSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.P226frontsight(), "usp45frontsight.png")
                .withName("Maxim9FrontSight")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MakarovTop = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MakarovTop(), "MakarovPM.png")
                .withModel(new com.vicmatskiv.mw.models.makarovrearsight(), "makarovrearsight.png")
                .withModel(new com.vicmatskiv.mw.models.makarovfrontsight(), "makarovfrontsight.png")
                .withName("MakarovTop")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Saiga12sights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.makarovrearsight(), "makarovrearsight.png")
                .withModel(new com.vicmatskiv.mw.models.makarovfrontsight(), "makarovfrontsight.png")
                .withName("Saiga12sights")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        FNP90Sight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.FNP90Sight(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.FNP90Sight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.FNP90Sight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.FNP90Sight) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.FNP90Sight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("FNP90Sight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M14Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.M14Rail(), "GunmetalTexture.png").withName("M14Rail")
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        M14Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.M14Action(), "AK12.png")
                .withName("M14Action")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .withRenderablePart()
                .build(ModernWarfareMod.MOD_CONTEXT);

        M14Action2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.M14Action2(), "AK12.png")
                .withName("M14Action2")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .withRenderablePart()
                .build(ModernWarfareMod.MOD_CONTEXT);

        FamasCarryHandle = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.FamasCarryHandle(), "AK12.png")
                .withName("FamasCarryHandle")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FelinCarryHandle = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.FelinCarryHandle(), "AK12.png")
                .withName("FelinCarryHandle")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        P30Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.P2000Top(), "P30Top.png").withName("P30Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        P225Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.P225Top(), "P225Top.png").withName("P225Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        P226Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.P225Top(), "P226Top.png")
                .withModel(new com.vicmatskiv.mw.models.P226rearsight(), "p226rearsight.png")
                .withModel(new com.vicmatskiv.mw.models.P226frontsight(), "p226frontsight.png")
                .withName("P226Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        MP5KGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Grip2(), "GunmetalTexture.png").withName("MP5KGrip")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        HecateIIBoltAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.HecateIIBoltAction(), "AK12.png")
                .withName("HecateIIBoltAction").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AR15Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.AR15Action(), "AK12.png")
                .withName("AR15Action").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        PLR16action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.PLR16action(), "PLR16.png")
                .withName("PLR16action").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M110action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.AR15Action(), "M110.png")
                .withName("M110action").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        BushmasterACRAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.ACRAction(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.ACRAction2(), "AK12.png")
                .withName("BushmasterACRAction").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        RemingtonACRAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.ACRAction(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.ACRAction2(), "AK12.png")
                .withName("RemingtonACRAction").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AKIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.AKiron3(), "AK12.png")
                .withName("AKIron3").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AKpart = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.AKpart(), "AK12.png")
                .withName("AKpart").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AKpart2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.AKpart(), "AK12.png")
                .withName("AKpart2").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AKS74UIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.AKS74UIron(), "AK12.png")
                .withName("AKS74UIron").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AKRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "AK12.png")
                .withName("AKRail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AUGRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "AK12.png")
                .withName("AUGRail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        BushmasterACRRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "AK12.png")
                .withName("BushmasterACRRail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        RemingtonACRRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "ACR.png")
                .withName("RemingtonACRRail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        M4Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "AK12.png")
                .withName("M4Rail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        G36Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.G36Rail(), "AK12.png")
                .withName("G36Rail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AKaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.AKaction(), "AK12.png")
                .withName("AKaction").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AN94action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.AN94action(), "AK12.png")
                .withName("AN94action").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        VSSVintorezAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.VSSVintorezAction(), "AK12.png")
                .withName("VSSVintorezAction").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AK12action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.AK12action(), "AK12.png")
                .withName("AK12action").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M107action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.M107action(), "M107.png")
                .withName("M107action").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        ScarAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.ScarAction(), "AK12.png")
                .withName("ScarAction").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        G36Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.G36Action(), "AK12.png")
                .withName("G36Action").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        FamasAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.FamasAction(), "AK12.png")
                .withName("FamasAction").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AUGAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.AUGAction(), "AK12.png")
                .withName("AUGAction").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        FelinAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.FelinAction(), "AK12.png")
                .withName("FelinAction").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        FamasBipod1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.FamasBipod(), "AK12.png")
                .withName("FamasBipod1").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        FamasBipod2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.FamasBipod(), "AK12.png")
                .withName("FamasBipod2").withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

    }


}
