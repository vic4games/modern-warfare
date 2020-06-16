package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;
import net.minecraft.init.Items;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.BR55scopereticle;
import com.vicmatskiv.mw.models.DMRscopeReticle;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M27rearsight;
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
import com.vicmatskiv.weaponlib.ItemScope;
import com.vicmatskiv.weaponlib.LaserBeamRenderer;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Attachments {

    public static ItemAttachment<Weapon> OKP7;
    public static ItemAttachment<Weapon> PSO1;
    public static ItemAttachment<Weapon> Reflex;
    public static ItemAttachment<Weapon> BijiaReflex;
    public static ItemAttachment<Weapon> Holographic;
    public static ItemAttachment<Weapon> HolographicAlt;
    public static ItemAttachment<Weapon> EotechHybrid2;
    public static ItemAttachment<Weapon> Vortex;
    public static ItemAttachment<Weapon> Kobra;
    public static ItemAttachment<Weapon> ACOG;
    public static ItemAttachment<Weapon> Specter; 
    public static ItemAttachment<Weapon> HP;
    public static ItemAttachment<Weapon> NightRaider;
    public static ItemAttachment<Weapon> M2A1sight;
    public static ItemAttachment<Weapon> F2000Scope;
    public static ItemAttachment<Weapon> MA5Dcover;
    public static ItemAttachment<Weapon> BR55Scope;
    public static ItemAttachment<Weapon> DMRScope;
    public static ItemAttachment<Weapon> SRS99Scope;
    public static ItemAttachment<Weapon> Silencer556x45;
    public static ItemAttachment<Weapon> Silencer762x39;
    public static ItemAttachment<Weapon> Silencer556x39;
    public static ItemAttachment<Weapon> Silencer545x39;
    public static ItemAttachment<Weapon> Silencer50BMG;
    public static ItemAttachment<Weapon> Silencer9mm;
    public static ItemAttachment<Weapon> SilencerMP5;
    public static ItemAttachment<Weapon> Silencer762x54;
    public static ItemAttachment<Weapon> Silencer762x51;
    public static ItemAttachment<Weapon> Silencer45ACP;
    public static ItemAttachment<Weapon> SilencerEABH;
    public static ItemAttachment<Weapon> Silencer12Gauge;
    public static ItemAttachment<Weapon> Silencer65x39;
    public static ItemAttachment<Weapon> Silencer57x38;
    public static ItemAttachment<Weapon> Silencer300AACBlackout;
    public static ItemAttachment<Weapon> Silencer357;
    public static ItemAttachment<Weapon> SilencerMP7;
    public static ItemAttachment<Weapon> Silencer9x39mm;
    public static ItemAttachment<Weapon> Laser;
    public static ItemAttachment<Weapon> Laser2;
    public static ItemAttachment<Weapon> DanWessonLaser;
    public static ItemAttachment<Weapon> Grip2;
    public static ItemAttachment<Weapon> AngledGrip;
    public static ItemAttachment<Weapon> JunoGrip;
    public static ItemAttachment<Weapon> StubbyGrip;
    public static ItemAttachment<Weapon> VGrip;
    public static ItemAttachment<Weapon> Bipod;
    public static ItemAttachment<Weapon> AUGgrip;
    public static ItemAttachment<Weapon> AKMIron;
    public static ItemAttachment<Weapon> MicroT1;
    public static ItemAttachment<Weapon> AimpointCompM5;
    public static ItemAttachment<Weapon> RMR; 
    public static ItemAttachment<Weapon> AK15ironsight;
    public static ItemAttachment<Weapon> M202scope;
    public static ItemAttachment<Weapon> AUGscope;
    public static ItemAttachment<Weapon> M1928Grip;
    public static ItemAttachment<Weapon> M1A1Grip;
    
    //Weapon Parts
    public static ItemAttachment<Weapon> AKMDustCover;
    public static ItemAttachment<Weapon> VeprDustCover;
    public static ItemAttachment<Weapon> AK101DustCover;
    public static ItemAttachment<Weapon> AK15DustCover;
    public static ItemAttachment<Weapon> RPKDustCover;
    
    public static ItemAttachment<Weapon> AK47HandleGuard;
    public static ItemAttachment<Weapon> AK101HandGuard;
    public static ItemAttachment<Weapon> AKMagpulHandleGuard;
    public static ItemAttachment<Weapon> AKMagpulHandleGuardTan;
    public static ItemAttachment<Weapon> MLOKHandguard;
    public static ItemAttachment<Weapon> MLOKExtendedHandguard;
    public static ItemAttachment<Weapon> AK15HandleGuard;
    public static ItemAttachment<Weapon> RPK16Handguard;
    public static ItemAttachment<Weapon> M4HandGuard;
    public static ItemAttachment<Weapon> M16HandGuard;
    public static ItemAttachment<Weapon> M4MagpulHandGuard;
    public static ItemAttachment<Weapon> M4MagpulHandGuardTan;
    public static ItemAttachment<Weapon> M4CarbineHandGuard;
    public static ItemAttachment<Weapon> C8SFWHandguard;
    public static ItemAttachment<Weapon> LVOAVHandGuard;
    public static ItemAttachment<Weapon> M38HandGuard;
    public static ItemAttachment<Weapon> Mk18HandGuard;
    public static ItemAttachment<Weapon> Block2SOCOMHandguard;
    public static ItemAttachment<Weapon> MP5A5HandGuard;
    public static ItemAttachment<Weapon> MP5SDHandGuard;
    public static ItemAttachment<Weapon> MIMP5MHandGuard;
    public static ItemAttachment<Weapon> UTGTriRailHandGuard;
    public static ItemAttachment<Weapon> ScarHandGuard;
    public static ItemAttachment<Weapon> ACRHandGuard;
    public static ItemAttachment<Weapon> M60HandGuard;
    public static ItemAttachment<Weapon> M60E4HandGuard;
    public static ItemAttachment<Weapon> M249HandGuard;
    public static ItemAttachment<Weapon> AUGA1handguard;
    public static ItemAttachment<Weapon> AUGA2handguard;
    public static ItemAttachment<Weapon> AUGA3handguard;
    public static ItemAttachment<Weapon> AUGA3extGuard;
    public static ItemAttachment<Weapon> StonerHANDGUARD;
    public static ItemAttachment<Weapon> AR57Handguard;
    public static ItemAttachment<Weapon> NTW20HandguardRAIL;
    public static ItemAttachment<Weapon> EF88Handguard;
    public static ItemAttachment<Weapon> AUGDefaultKit;
    public static ItemAttachment<Weapon> AUGParaConversion;
    public static ItemAttachment<Weapon> VectorHandguard;
    public static ItemAttachment<Weapon> Vector556Handguard;
    public static ItemAttachment<Weapon> VectorSwordfish;
    public static ItemAttachment<Weapon> Remington870Barrel;
    public static ItemAttachment<Weapon> Remington870SawedOffBarrel;
    public static ItemAttachment<Weapon> Remington870PoliceMagnumBarrel;
    public static ItemAttachment<Weapon> M1CarbineHandguard;
    public static ItemAttachment<Weapon> M1CarbineVentilatedHandguard;
    public static ItemAttachment<Weapon> M1CarbineScoutHandguard;
    public static ItemAttachment<Weapon> Origin12Handguard;
    public static ItemAttachment<Weapon> HKS20Handguard;
    
    public static ItemAttachment<Weapon> AK47Stock;
    public static ItemAttachment<Weapon> RPKStock;
    public static ItemAttachment<Weapon> AK101Stock;
    public static ItemAttachment<Weapon> CollapsableMOEStock;
    public static ItemAttachment<Weapon> MagpulCTRStock;
    public static ItemAttachment<Weapon> MilSpecStock;
    public static ItemAttachment<Weapon> C8Stock;
    public static ItemAttachment<Weapon> HeraArmsStock;
    public static ItemAttachment<Weapon> HK416Stock;
    public static ItemAttachment<Weapon> SOCOM_Stock;
    public static ItemAttachment<Weapon> M16Stock;
    public static ItemAttachment<Weapon> MagpulCTRStockTan;
    public static ItemAttachment<Weapon> MilSpecStockTan;
    public static ItemAttachment<Weapon> HK416StockTan;
    public static ItemAttachment<Weapon> M16StockTan;
    public static ItemAttachment<Weapon> MP5A3Stock;
    public static ItemAttachment<Weapon> MP5A4Stock;
    public static ItemAttachment<Weapon> ScarStock;
    public static ItemAttachment<Weapon> ScarHStock;
    public static ItemAttachment<Weapon> ACRStock;
    public static ItemAttachment<Weapon> M1014Stock;
    public static ItemAttachment<Weapon> M4BenelliStock;
    public static ItemAttachment<Weapon> Spas12Stock;
    public static ItemAttachment<Weapon> M249Stock;
    public static ItemAttachment<Weapon> VectorStock;
    public static ItemAttachment<Weapon> GlockStock;
    public static ItemAttachment<Weapon> VP70Stock;
    public static ItemAttachment<Weapon> Remington870Stock;
    public static ItemAttachment<Weapon> Remington870SawedGrip;
    public static ItemAttachment<Weapon> Remington870PoliceMagnumStock;
    public static ItemAttachment<Weapon> Remington870MilspecStock;
    public static ItemAttachment<Weapon> Remington870HK416Stock;
    public static ItemAttachment<Weapon> M1CarbineBody;
    public static ItemAttachment<Weapon> M1A1CarbineBody;
    public static ItemAttachment<Weapon> Origin12Stock;
    public static ItemAttachment<Weapon> HKS20Stock;
    
    public static ItemAttachment<Weapon> AK47Grip;
    public static ItemAttachment<Weapon> AK101Grip;
    public static ItemAttachment<Weapon> AKErgoGrip;
    public static ItemAttachment<Weapon> M4Grip;
    public static ItemAttachment<Weapon> M4GripTan;
    public static ItemAttachment<Weapon> SOCOM_Grip;
    public static ItemAttachment<Weapon> M4GripGray;
    public static ItemAttachment<Weapon> HeraArmsGrip;
    public static ItemAttachment<Weapon> MP5HOGUEGrip;
    public static ItemAttachment<Weapon> GlockHOGUEGrip;
    public static ItemAttachment<Weapon> GlockHOGUEGripTan;
    public static ItemAttachment<Weapon> Origin12Grip;
    public static ItemAttachment<Weapon> HKS20Grip;
    
    public static ItemAttachment<Weapon> M4Receiver;
    public static ItemAttachment<Weapon> VLTORReceiver;
    public static ItemAttachment<Weapon> AR57Receiver;
    public static ItemAttachment<Weapon> C8SFWReceiver;
    
    public static ItemAttachment<Weapon> MIMP5TRRail;
    public static ItemAttachment<Weapon> MIMP5MRail;
    public static ItemAttachment<Weapon> ShotgunRail;
    public static ItemAttachment<Weapon> Kar98Krail;
    public static ItemAttachment<Weapon> M60Rail;
    public static ItemAttachment<Weapon> RailRiser;
    public static ItemAttachment<Weapon> M1911Slide;
    public static ItemAttachment<Weapon> M1911Body;
    public static ItemAttachment<Weapon> M191144MagSlide;
    public static ItemAttachment<Weapon> M191144MagBody;
    public static ItemAttachment<Weapon> M9A1Slide;
    public static ItemAttachment<Weapon> M9A1Body;
    public static ItemAttachment<Weapon> SamuraiEdgeSlide;
    public static ItemAttachment<Weapon> SamuraiEdgeBody;
    public static ItemAttachment<Weapon> SamuraiEdgeAWBody;
    public static ItemAttachment<Weapon> SamuraiEdgeAlbertExt;
    public static ItemAttachment<Weapon> DesertEagleBody;
    public static ItemAttachment<Weapon> DesertEagleSlide;
    public static ItemAttachment<Weapon> DesertEagleLongBody;
    
    public static ItemAttachment<Weapon> P90Swordfish;
    public static ItemAttachment<Weapon> P90DefaultKit;
    public static ItemAttachment<Weapon> P90Terminator;
    
    public static ItemAttachment<Weapon> FABDefenseMount;
    
    public static ItemAttachment<Weapon> M4FrontSight;
    public static ItemAttachment<Weapon> M38FrontSight;
    public static ItemAttachment<Weapon> Kar98Ksight;
    public static ItemAttachment<Weapon> M32Barrel;
    public static ItemAttachment<Weapon> M60FrontSight;
//    public static ItemAttachment<Weapon> CTCBarrel;
    public static ItemAttachment<Weapon> RPKBarrel;
    public static ItemAttachment<Weapon> AKIron;
    public static ItemAttachment<Weapon> Remington870Pump;
    public static ItemAttachment<Weapon> Remington870PoliceMagnumPump;
    public static ItemAttachment<Weapon> Remington870MagpulPump;
    public static ItemAttachment<Weapon> Remington870FABDefensePump;
    
    public static ItemAttachment<Weapon> Placeholder;
    public static ItemAttachment<Weapon> P90Placeholder;
    public static ItemAttachment<Weapon> PistolPlaceholder;
    public static ItemAttachment<Weapon> GripPlaceholder;
    public static ItemAttachment<Weapon> LaserPlaceholder;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        
        FABDefenseMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.FABDefenseMount(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.FABDefenseMount) {
                        GL11.glTranslatef(-0.6F, -0.3F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.FABDefenseMount) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.FABDefenseMount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FABDefenseMount").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P90Swordfish = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.P90swordfish(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.P90swordfish) {
                        GL11.glTranslatef(-0.6F, 0.1F, -0.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.P90swordfish) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.P90swordfish) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("P90swordfish").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P90DefaultKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.P90DefaultKit(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.P90DefaultKit) {
                        GL11.glTranslatef(-0.6F, 0.5F, 0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.P90DefaultKit) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.P90DefaultKit) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("P90DefaultKit").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P90Terminator = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.P90Terminator(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.P90Terminator) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.P90Terminator) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.P90Terminator) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("P90Terminator").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ScarHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glTranslatef(-0.6F, -0.8F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarHandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VectorHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.KrissVectorHandguard(), "krissvector.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorHandguard) {
                        GL11.glTranslatef(-0.6F, -0.5F, -1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KrissVectorHandguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VectorSwordfish = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.KrissVectorSwordfish(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorSwordfish) {
                        GL11.glTranslatef(-0.6F, -0.2F, -1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorSwordfish) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorSwordfish) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KrissVectorSwordfish").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Vector556Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.KrissVectorModified(), "krissvectormodified.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorModified) {
                        GL11.glTranslatef(-0.6F, -0.5F, -1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorModified) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorModified) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KrissVector556Handguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Origin12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Origin12Handguard(), "origin12.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Origin12Handguard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Origin12Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Origin12Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Origin12Handguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HKS20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.HKS20Handguard(), "hks20.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HKS20Handguard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HKS20Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HKS20Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HKS20Handguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Origin12Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Origin12Grip(), "origin12.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Origin12Grip) {
                        GL11.glTranslatef(-0.6F, -0F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Origin12Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Origin12Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Origin12Grip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HKS20Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.HKS20Grip(), "HKS20.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HKS20Grip) {
                        GL11.glTranslatef(-0.6F, -0F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HKS20Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HKS20Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HKS20Grip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Origin12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Origin12Stock(), "origin12.png")
                .withRequiredAttachments(Origin12Grip)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Origin12Stock) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Origin12Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Origin12Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Origin12Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HKS20Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.HKS20Stock(), "HKS20.png")
                .withRequiredAttachments(HKS20Grip)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HKS20Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HKS20Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HKS20Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HKS20Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ACRHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.ACRHandGuard(), "acr.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "acr.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "acr.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACRHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACRHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACRHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRHandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M60HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M60HandGuard(), "m60.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M60HandGuard) {
                        GL11.glTranslatef(-0.6F, -1.6F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M60HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M60HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M60HandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M60E4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M60E4Guard(), "m60.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M60E4Guard) {
                        GL11.glTranslatef(-0.6F, -1.3F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M60E4Guard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M60E4Guard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M60E4Guard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M249HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M249HandGuard(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M249HandGuard) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M249HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M249HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M249HandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        StonerHANDGUARD = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.StonerHANDGUARD(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StonerHANDGUARD) {
                        GL11.glTranslatef(-0.6F, -0.4F, 1.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StonerHANDGUARD) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StonerHANDGUARD) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("StonerHANDGUARD").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGA1handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AUGA1(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA1) {
                        GL11.glTranslatef(-0.6F, 0.6F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGA1").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGA2handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AUGA2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA2) {
                        GL11.glTranslatef(-0.6F, 0.6F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGA2handguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGA3handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AUGA3M1(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA3M1) {
                        GL11.glTranslatef(-0.6F, 0.6F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA3M1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA3M1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGA3handguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        EF88Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.EF88(), "aug.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.EF88) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.EF88) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.EF88) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("EF88Handguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGDefaultKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AUG9mmCONVERSIONkit(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGDefaultKit").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGParaConversion = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AUG9mmCONVERSIONkit(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGParaConversion").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGA3extGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AUGA3M1_Ext(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "gun.png")
                .withRequiredAttachments(AUGA3handguard)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA3M1_Ext) {
                        GL11.glTranslatef(-0.6F, 0.4F, -1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA3M1_Ext) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGA3M1_Ext) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGA3extGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1CarbineBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M1CarbineBody(), "m1carbine.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1CarbineBody) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1CarbineBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1CarbineBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1CarbineBody").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1A1CarbineBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M1A1CarbineStock(), "m1carbine.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1A1CarbineStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1A1CarbineStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1A1CarbineStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1A1CarbineBody").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1CarbineHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M1CarbineHandguard(), "m1carbine.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1CarbineHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1CarbineHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1CarbineHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1CarbineHandguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1CarbineVentilatedHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M1CarbineVentilatedHandguard(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1CarbineVentilatedHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1CarbineVentilatedHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1CarbineVentilatedHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1CarbineVentilatedHandguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1CarbineScoutHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M1ScoutCarbineHandguard(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1ScoutCarbineHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1ScoutCarbineHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1ScoutCarbineHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1ScoutCarbineHandguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ScarStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.ScarStock(), "scar.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ScarStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ScarStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ScarStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarStock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ScarHStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.ScarStock(), "scarh.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ScarStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ScarStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ScarStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarHStock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VectorStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.KrissVectorStock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorStock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VectorStock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ACRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.ACRStock(), "acr.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACRStock) {
                        GL11.glTranslatef(-0.6F, 0.3F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRStock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1014Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M1014stock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1014stock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1014stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1014stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1014Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4BenelliStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4BenelliStock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4BenelliStock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4BenelliStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4BenelliStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4BenelliStock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Spas12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Spas12Stock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Spas12Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Spas12Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Spas12Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Spas12Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M249Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M249Stock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M249Stock) {
                        GL11.glTranslatef(-0.6F, -0.7F, 5.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M249Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M249Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M249Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        UTGTriRailHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.UTGTriRailHandGuard(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.UTGTriRailHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.UTGTriRailHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.UTGTriRailHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("UTGTriRailHandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MIMP5MHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MIMP5MHandGuard(), "magpulhandleguard.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MIMP5MHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MIMP5MHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MIMP5MHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MIMP5MHandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MIMP5TRRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MIMP5TRRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MIMP5TRRail) {
                        GL11.glTranslatef(-0.6F, 0.7F, -0.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MIMP5TRRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MIMP5TRRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MIMP5TRRail").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MIMP5MRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MIMP5MRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MIMP5MRail) {
                        GL11.glTranslatef(-0.6F, 1.2F, -0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.4F, 1.4F, 1.4f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MIMP5MRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MIMP5MRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MIMP5MRail").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ShotgunRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.SupernovaRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SupernovaRail) {
                        GL11.glTranslatef(-0.6F, 0F, 0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SupernovaRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SupernovaRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ShotgunRail").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Kar98Krail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Kar98Krail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kar98Krail) {
                        GL11.glTranslatef(-0.6F, 1.3F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kar98Krail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kar98Krail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Kar98Krail").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M60Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glTranslatef(-0.6F, -0.7F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M60Rail").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RailRiser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.KrissVectorRailRiser(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorRailRiser) {
                        GL11.glTranslatef(-0.6F, 0.3F, -0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorRailRiser) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.KrissVectorRailRiser) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RailRiser").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1911Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M1911Slide(), "m1911.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "gun")
                .withModel(new com.vicmatskiv.mw.models.makarovrearsight(), "gun")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1911Slide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1911Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1911Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1911Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1911Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M1911Body(), "m1911.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1911Body) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1911Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1911Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1911Body")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M191144MagSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M191144MagSlide(), "M191144MagSlide.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "gun")
                .withModel(new com.vicmatskiv.mw.models.makarovrearsight(), "gun")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M191144MagSlide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M191144MagSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M191144MagSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M191144MagSlide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M191144MagBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M191144MagBody(), "M191144Mag.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M191144MagBody) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M191144MagBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M191144MagBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M191144MagBody")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M9A1Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M9slide(), "m9slide.png")
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.vicmatskiv.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M9slide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M9slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M9slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M9A1Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M9A1Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M9(), "m9a1.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M9) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M9) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M9) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M9A1Body")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SamuraiEdgeSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.SamuraiEdgeSlide(), "samuraiedgeslide.png")
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.vicmatskiv.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdgeSlide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdgeSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdgeSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SamuraiEdgeSlide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SamuraiEdgeBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.SamuraiEdge(), "samuraiedge.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdge) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdge) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdge) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SamuraiEdgeBody")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SamuraiEdgeAWBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.SamuraiEdgeWesker(), "samuraiedgewesker.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdgeWesker) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdgeWesker) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdgeWesker) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SamuraiEdgeAWBody")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SamuraiEdgeAlbertExt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.SamuraiEdgeAlbertExt(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdgeAlbertExt) {
                        GL11.glTranslatef(-0.6F, 0.1F, -1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdgeAlbertExt) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SamuraiEdgeAlbertExt) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SamuraiEdgeAlbertExt")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DesertEagleSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new com.vicmatskiv.mw.models.DesertEagleSlide(), "DesertEagle.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DesertEagleSlide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DesertEagleSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DesertEagleSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DesertEagleSlide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DesertEagleBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.DesertEagle(), "DesertEagle.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DesertEagle) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DesertEagle) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DesertEagle) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DesertEagleBody")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DesertEagleLongBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.DesertEagleLong(), "DesertEagle.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DesertEagleLong) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DesertEagleLong) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DesertEagleLong) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DesertEagleLongBody")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP5A5HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MP5A5HandGuard(), "gun2.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5A5HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5A5HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5A5HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5A5HandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP5SDHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MP5SDHandGuard(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5SDHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5SDHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5SDHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5SDHandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP5HOGUEGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MP5HOGUEGrip(), "gun2.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5HOGUEGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5HOGUEGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5HOGUEGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5HOGUEGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        GlockHOGUEGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.GlockHogueGrip(), "gun2.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.GlockHogueGrip) {
                        GL11.glTranslatef(-0.6F, -0.4F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.GlockHogueGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.GlockHogueGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GlockHogueGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        GlockHOGUEGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.GlockHogueGrip(), "tan.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.GlockHogueGrip) {
                        GL11.glTranslatef(-0.6F, -0.4F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.GlockHogueGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.GlockHogueGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GlockHogueGripTan").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP5A3Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MP5A3RetractableStock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5A3RetractableStock) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5A3RetractableStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5A3RetractableStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5A3Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP5A4Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MP5A4Stock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5A4Stock) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5A4Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MP5A4Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5A4Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        LVOAVHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.LVOAVHandGuard(), "lvoavhandguard.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LVOAVHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LVOAVHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LVOAVHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LVOAVHandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M38HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M38HandGuard(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M38HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M38HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M38HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M38HandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Mk18HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Mk18HandGuard(), "mk18handguard.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "tan_alt.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "tan_alt.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "tan_alt.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "tan_alt.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Mk18HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Mk18HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Mk18HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk18HandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Block2SOCOMHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
//                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Block2SOCOMHandguard(), "block2socomhandguard.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Block2SOCOMHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Block2SOCOMHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Block2SOCOMHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Block2SOCOMHandguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4MagpulHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4MagpulHandGuard(), "magpulhandleguard.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4MagpulHandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4MagpulHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4MagpulHandGuard(), "magpulhandleguardtan.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4MagpulHandGuardTan").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4Receiver(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4Receiver").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        C8SFWReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4Receiver(), "C8SFW_gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "C8SFW_gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("C8SFWReceiver").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VLTORReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.VLTORReceiver(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VLTORReceiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VLTORReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VLTORReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VLTORReceiver").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AR57Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AR57Receiver(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR57Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR57Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR57Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AR57Receiver").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new com.vicmatskiv.mw.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Placeholder").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P90Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new com.vicmatskiv.mw.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("P90Placeholder").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        PistolPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new com.vicmatskiv.mw.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("PistolPlaceholder").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        GripPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new com.vicmatskiv.mw.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GripPlaceholder").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        LaserPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new com.vicmatskiv.mw.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LaserPlaceholder").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4HandGuard(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4HandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AR57Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AR57Handguard(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withRequiredAttachments(AR57Receiver)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR57Handguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR57Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR57Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AR57Handguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        NTW20HandguardRAIL = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.NTW20Guard(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.NTW20Guard) {
                        GL11.glTranslatef(-0.6F, -0.4F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.NTW20Guard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.NTW20Guard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("NTW20Guard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M16HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M16HandGuard(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16HandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4CarbineHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4CarbineHandGuard(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4CarbineHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4CarbineHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4CarbineHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4CarbineHandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        C8SFWHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.C8SFWHandguard(), "C8SFWHandguard.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "c8sfw_gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "c8sfw_gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "c8sfw_gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "c8sfw_gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.C8SFWHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.C8SFWHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.C8SFWHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("C8SFWHandguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HeraArmsGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.HeraArmsGrip(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HeraArmsGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HeraArmsGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HeraArmsGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HeraArmsGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4Grip(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4Grip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4Grip(), "tan.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4GripTan").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SOCOM_Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
//                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4Grip(), "socom_grip.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SOCOM_Grip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4GripGray = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4Grip(), "gun2.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4GripGray").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK47Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AKGrip(), "bareak.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK47Grip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK101Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AKGrip(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK101Grip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AKErgoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AKErgoGrip(), "gun2.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKErgoGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKErgoGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKErgoGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKErgoGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        
        AK47Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK47stock(), "bareak.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK47stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RPKStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.RPKstock(), "bareak.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPKstock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPKstock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPKstock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPKstock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK101Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK101Stock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK101Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        CollapsableMOEStock = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.CollapsableMOEStock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.CollapsableMOEStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.CollapsableMOEStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.CollapsableMOEStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("CollapsableMOEStock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MagpulCTRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.MagpulCTRStock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulCTRStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulCTRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulCTRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MagpulCTRStock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MagpulCTRStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.MagpulCTRStock(), "tan.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulCTRStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulCTRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulCTRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MagpulCTRStockTan").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MilSpecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.MilSpecStock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MilSpecStock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        C8Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
//                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.MilSpecStock(), "C8Stock.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("C8Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MilSpecStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.MilSpecStock(), "tan.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MilSpecStockTan").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HeraArmsStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.HeraArmsStock(), "gun.png")
                .withRequiredAttachments(HeraArmsGrip)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HeraArmsStock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HeraArmsStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HeraArmsStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HeraArmsStock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.HK416Stock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SOCOM_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
//                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.SOCOM_Stock(), "Socom_stock.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SOCOM_Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SOCOM_Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SOCOM_Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SOCOM_Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M16Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M16Stock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16Stock) {
                        GL11.glTranslatef(-0.6F, -0.2F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HK416StockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.HK416Stock(), "tan.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416StockTan").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M16StockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M16Stock(), "tan.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16Stock) {
                        GL11.glTranslatef(-0.6F, -0.2F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M16Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16StockTan").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK47HandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK47HandleGuard(), "bareak.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47HandleGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47HandleGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47HandleGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK47HandleGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK101HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK101HandGuard(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK101HandGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AKMagpulHandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MagpulHandleGuard(), "MagpulHandleGuard.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulHandleGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulHandleGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulHandleGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKMagpulHandleGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AKMagpulHandleGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MagpulHandleGuard(), "MagpulHandleGuardTan.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulHandleGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulHandleGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MagpulHandleGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKMagpulHandleGuardTan").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MLOKHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MLOKHandguard(), "gun2.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MLOKHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MLOKHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MLOKHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MLOKHandguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MLOKExtendedHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.MLOKExtendedHandguard(), "gun2.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MLOKExtendedHandguard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -2.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MLOKExtendedHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MLOKExtendedHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MLOKExtendedHandguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK15HandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK15HandleGuard(), "gun2.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun2.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun2.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK15HandleGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK15HandleGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK15HandleGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK15HandleGuard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RPK16Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.RPK16handguard(), "gun2.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun2.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun2.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPK16handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPK16handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPK16handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK16handguard").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AKMDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK47DustCover(), "bareak.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47DustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47DustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47DustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK47Dustcover").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK101DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK101DustCover(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101DustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101DustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101DustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK101DustCover").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RPKDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK101DustCover(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101DustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101DustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK101DustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPKDustCover").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VeprDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.VeprDustCover(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VeprDustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VeprDustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VeprDustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VeprDustCover").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK15DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK15DustCover(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK15DustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK15DustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK15DustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK15DustCover").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M4FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M4Iron2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.FALIron(), "gun.png")
                .withRequiredAttachments(M4HandGuard, M4CarbineHandGuard, M4MagpulHandGuard, 
                        M4MagpulHandGuardTan, M16HandGuard)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Iron2) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.6F, 1.6F, 1.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Iron2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Iron2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4FrontSight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M60FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.M60FrontSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M60FrontSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M60FrontSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M60FrontSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M60FrontSight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M38FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.FALIron(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKMiron2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AK47iron(), "gun.png")
                .withRequiredAttachments(M38HandGuard, LVOAVHandGuard, Mk18HandGuard, 
                        StonerHANDGUARD, AR57Handguard)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47iron) {
                        GL11.glTranslatef(-0.6F, -1.5F, 1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.4F, 1.4F, 1.4f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47iron) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47iron) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M38FrontSight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        PSO1 = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.06f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.05f, 1.05f, 1.05f);
                    GL11.glTranslatef(-0.32f, 0.168f, 1.2f);
                }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("LP")
                .withModel(new com.vicmatskiv.mw.models.PSO1(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.PSO12(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.PSO1reticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.PSO1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.PSO1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.PSO1) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.PSO1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("PSO1")
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        OKP7 = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.OKP7(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.OKP7reticle(), "green.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.OKP7) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.OKP7) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.vicmatskiv.mw.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.OKP7) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.OKP7) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("okp7").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Reflex = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.Reflex(), "Reflex.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail,
                        M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Reflex) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Reflex) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Reflex) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Reflex) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Reflex").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        BijiaReflex = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.BijiaReflex(), "Reflex.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "green.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, FABDefenseMount, 
                        Placeholder, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard,
                        Vector556Handguard, DesertEagleSlide, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.BijiaReflex) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.BijiaReflex) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.BijiaReflex) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.BijiaReflex) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BijiaReflex").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ACOG = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.17f, 1.17f, 1.17f);
                    GL11.glTranslatef(0.087f, 0.42f, 0.56f);
                })
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.ACOG(), "Acog.png")
                .withModel(new com.vicmatskiv.mw.models.AcogScope2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AcogReticle(), "acogreticle.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, 
                        AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard, 
                        Vector556Handguard, M1CarbineScoutHandguard)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(0.1F, -0.8F, 1.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AcogScope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AcogScope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);

                    } else if (model instanceof com.vicmatskiv.mw.models.AcogScope2) {
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(1F, 0F, -1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AcogScope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Acog").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Specter = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(2.7f, 2.8f, 2.7f);
                    GL11.glTranslatef(-0.06f, 0.28f, 0.56f);
                })
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.SpecterSight(), "SpecterSight.png")
                .withModel(new com.vicmatskiv.mw.models.Acog2(), "Acog2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, 
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, 
                        AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SpecterSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SpecterSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.25F, 0.25F, 0.25F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SpecterSight) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.SpecterSight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Specter").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Holographic = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.Holographic2(), "Holographic2.png")
                .withModel(new com.vicmatskiv.mw.models.Holo2(), "Holo3.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic2) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.7F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Holographic2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HolographicAlt = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.Holographic(), "Holographic.png")
                .withModel(new com.vicmatskiv.mw.models.Holo2(), "Holo3.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail,
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, 
                        AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.4F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HolographicAlt").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        EotechHybrid2 = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.2f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.35f, 1.35f, 1.35f);
                    GL11.glTranslatef(-0.207f, 0.26f, 1.4f);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.EotechHybrid2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.EotechScopeRing(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.Holo2(), "Holo3.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.EotechHybrid2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.EotechHybrid2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.EotechHybrid2) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.EotechHybrid2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("EotechHybrid2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Vortex = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.Vortex_sight(), "gun2.png")
                .withModel(new com.vicmatskiv.mw.models.Holo2(), "Holo3.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Vortex_sight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Vortex_sight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Vortex_sight) {
                        GL11.glTranslatef(-0.6F, -0.8F, 1.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Vortex_sight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Vortex_sight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MicroT1 = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.MicroT1(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MicroT1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MicroT1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MicroT1) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MicroT1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MicroT1").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AimpointCompM5 = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.AimpointCompM5(), "aimpointcompm5.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AimpointCompM5) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AimpointCompM5) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AimpointCompM5) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AimpointCompM5) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AimpointCompM5").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RMR = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.RMRsight(), "RMRsight.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
                .withRequiredAttachments(FABDefenseMount, VeprDustCover, AK15DustCover,
                        Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Placeholder, Kar98Krail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard, 
                        Vector556Handguard, DesertEagleSlide, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RMRsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RMRsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RMRsight) {
                        GL11.glTranslatef(-0.6F, -0.9F, 0.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RMRsight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RMRsight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Kobra = new ItemScope.Builder().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.Kobra(), "gunmetaltexture.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip)
                .withRenderablePart()
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kobra) {
                        GL11.glTranslatef(0.4F, -0.8F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kobra) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kobra) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kobra) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Kobra").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        HP = new ItemScope.Builder()
//                .withNightVision()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.65f, 1.65f, 1.65f);
                    GL11.glTranslatef(0.0285f, 0.492f, 0.7f);
                })
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP")
                .withModel(new com.vicmatskiv.mw.models.HP(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.JPUreticle(), "black.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, Kar98Krail, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, RPKDustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HPScope").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        NightRaider = new ItemScope.Builder()
                .withNightVision()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.6f, 1.6f, 1.6f);
                    GL11.glTranslatef(-0.045f, 0.495f, 1.551f);
                })
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP")
                .withModel(new com.vicmatskiv.mw.models.NightRaiderScope(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.JPUreticle(), "black.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail,
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        RPKDustCover, Attachments.EF88Handguard, VectorHandguard, 
                        Vector556Handguard, M1CarbineScoutHandguard)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.NightRaiderScope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.NightRaiderScope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.NightRaiderScope) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.NightRaiderScope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("NightRaiderScope")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M2A1sight = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.2f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.54f, 1.54f, 1.54f);
                    GL11.glTranslatef(-0.09f, -0.265f, -0.7f);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.M2A1(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.M2A1reticle(), "red.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M2A1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M2A1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M2A1) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.vicmatskiv.mw.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M2A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("m2a1_sight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        F2000Scope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(0.54f, 0.56f, 0.55f);
                    GL11.glTranslatef(-0.125f, -0.923f, 1.621f);
//                    GL11.glRotatef(30F, 1f, 0f, 0f);
                })
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP")
                .withModel(new com.vicmatskiv.mw.models.F2000Scope(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.F2000Scope2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.F2000Reticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.F2000Scope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.F2000Scope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.F2000Scope) {
                        GL11.glTranslatef(-0.6F, -0F, 0.45F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(-190F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.85F, 0.85F, 0.85f);
                    } else if (model instanceof com.vicmatskiv.mw.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.F2000Scope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("F2000Scope")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M202scope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.7f, 1.7f, 1.7f);
                    GL11.glTranslatef(0.375f, 0.185f, 0.34f);
//                    GL11.glRotatef(30F, 1f, 0f, 0f);
                })
                .withCrosshair("HP")
                .withModel(new com.vicmatskiv.mw.models.JPUreticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(-190F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } 
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } 
                })
                .withName("M202scope")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGscope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.05f, 1.05f, 1.05f);
                    GL11.glTranslatef(-0.23f, -0.77f, 0.65f);
                })
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withCrosshair("HP")
                .withModel(new com.vicmatskiv.mw.models.AUGScope_scope(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.JPUreticle(), "black.png")
                .withModel(new com.vicmatskiv.mw.models.AUGScope(), "gun.png")
                .withRequiredAttachments(AUGA1handguard)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGScope_scope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGScope_scope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGScope_scope) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.3F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(-190F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGScope_scope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGscope")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MA5Dcover = new ItemScope.Builder()
                .withNightVision()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(0.59f, 0.59f, 0.55f);
                    GL11.glTranslatef(-0.123f, -0.83f, 1.62f);
                })
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP")
                .withModel(new com.vicmatskiv.mw.models.MA5Dcover(), "MA5D.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MA5Dcover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MA5Dcover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MA5Dcover) {
                        GL11.glTranslatef(-0.6F, 1.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.15F, 1.15F, 1.15f);
                    }   
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.MA5Dcover) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("MA5Dcover")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        BR55Scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
//                    float scale = 2.7f;
//                    GL11.glScalef(scale, scale / compatibility.getAspectRatio(ModernWarfareMod.MOD_CONTEXT), scale);
                    GL11.glScalef(2.7f, 2.7f, 2.7f);
                    GL11.glTranslatef(-0.046f, 0.547f, 0.07f);
                })
//                .withViewfinderSize(427, 240)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.BR55scope(), "BR55scope.png")
                .withModel(new BR55scopereticle(), "BR55scopereticle.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.BR55scope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.BR55scopereticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                    

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.BR55scope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.BR55scopereticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.BR55scope) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else if (model instanceof com.vicmatskiv.mw.models.BR55scopereticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.BR55scope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.BR55scopereticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BR55scope").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DMRScope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.7f, 1.7f, 1.7f);
                    GL11.glTranslatef(-0.05f, 0.56f, 0.1f);
                })
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.DMRscope(), "DMRscope.png")
                .withModel(new DMRscopeReticle(), "black.png")

                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DMRscope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.DMRscopeReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                    

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DMRscope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.DMRscopeReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DMRscope) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.95F, 0.95F, 0.95f);
                    } else if (model instanceof com.vicmatskiv.mw.models.DMRscopeReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DMRscope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.DMRscopeReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DMRscope").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SRS99Scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    float scale = 3f;
                    GL11.glScalef(scale, scale / compatibility.getAspectRatio(ModernWarfareMod.MOD_CONTEXT), scale);
                    GL11.glTranslatef(-0.02f, 0.65f, 0.26f);
                    GL11.glScalef(1.8f, 1.2f, 1f);
                })
                .withViewfinderSize(650, 250)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.SRS99Scope(), "srs99scope.png")
                .withModel(new com.vicmatskiv.mw.models.SRS99Reticle(), "SRS99Reticle.png")

                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DMRscope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.SRS99Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                    

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DMRscope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.SRS99Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DMRscope) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.05F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.vicmatskiv.mw.models.SRS99Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DMRscope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.SRS99Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SRS99Scope").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Silencer556x45 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x45(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x45) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x45) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x45) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x45) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer556x45").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer545x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x39(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer545x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor762x39(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer762x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M32Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M32Barrel")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870Pump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.Remington870Pump(), "remington870.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Pump) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Pump) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Pump) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Pump) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870Pump")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870MagpulPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.Remington870MagpulPump(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870MagpulPump) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870MagpulPump) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870MagpulPump) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870MagpulPump) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870MagpulPump")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870PoliceMagnumPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.Remington870PoliceMagnumPump(), "remington870.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumPump) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumPump) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumPump) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumPump) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870PoliceMagnumPump")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870FABDefensePump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.vicmatskiv.mw.models.Remington870FABDefensePump(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870FABDefensePump) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870FABDefensePump) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870FABDefensePump) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    } else if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870FABDefensePump) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AKRail) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870FABDefensePump")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870Stock(), "remington870.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, 1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870Stock")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870PoliceMagnumStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870PoliceMagnumStock(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.6F, 0.2F, 0.2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870PoliceMagnumStock")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870PoliceMagnumStock(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.MilSpecStock(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.7F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1F);
                        GL11.glRotatef(20F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.MilSpecStock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870MilSpecStock")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870PoliceMagnumStock(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.HK416Stock(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.7F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1F);
                        GL11.glRotatef(20F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.HK416Stock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870HK416StockStock")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870SawedGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870SawedGrip(), "remington870.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870SawedGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870SawedGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870SawedGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870SawedGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870SawedGrip")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870Barrel(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.R870part(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.R870part) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.R870part) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Barrel) {
                        GL11.glTranslatef(0.6F, 0.8F, -2.8F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else if (model instanceof com.vicmatskiv.mw.models.R870part) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.R870part) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870Barrel")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870PoliceMagnumBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870PoliceMagnumBarrel(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumBarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumBarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumBarrel) {
                        GL11.glTranslatef(0.6F, 0.8F, -2.8F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else if (model instanceof com.vicmatskiv.mw.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870PoliceMagnumBarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870PoliceMagnumBarrel")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington870SawedOffBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870SawedBarrel(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870SawedBarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870SawedBarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870SawedBarrel) {
                        GL11.glTranslatef(0.6F, 0.8F, -2.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.66F, 0.66F, 0.66f);
                    } else if (model instanceof com.vicmatskiv.mw.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Remington870SawedBarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870SawedBarrel")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RPKBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.RPKbarrel(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKiron3(), "gun")
                .withModel(new com.vicmatskiv.mw.models.AKMiron2(), "gun")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPKbarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPKbarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPKbarrel) {
                        GL11.glTranslatef(0.6F, 1F, -4.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else if (model instanceof com.vicmatskiv.mw.models.AKiron3) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.AKMiron2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.RPKbarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("RPKbarrel")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AKIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AKiron3(), "gun")
                .withModel(new com.vicmatskiv.mw.models.AKMiron2(), "gun")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKiron3) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKiron3) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKiron3) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else if (model instanceof com.vicmatskiv.mw.models.AKMiron2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AKiron3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("AKIron")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer9mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRequiredAttachments(M9A1Body)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer9mm")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SilencerMP5 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "gun.png")
                .withRequiredAttachments(MP5SDHandGuard)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerMP5")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Silencer9x39mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer9x39mm")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Silencer45ACP = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor45ACP(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer45ACP").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SilencerEABH = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor45ACP(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("silencer_eabh").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x54 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer762x54").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x51 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor762x51(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x51) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x51) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x51) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x51) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer762x51").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer50BMG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer50BMG").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer556x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x39(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer556x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        AKMIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AKMiron1(), "gun.png")
                .withModel(new AKMiron2(), "gun.png").withModel(new AK47iron(), "gun.png")
                .withModel(new M4Iron1(), "gun.png").withModel(new M4Iron2(), "gun.png")
                .withModel(new P90iron(), "gun.png").withModel(new G36CIron1(), "gun.png")
                .withModel(new G36CIron2(), "gun.png").withModel(new ScarIron1(), "gun.png")
                .withModel(new ScarIron2(), "gun.png").withModel(new FALIron(), "gun.png")
                .withModel(new M14Iron(), "gun.png").withModel(new MP5Iron(), "gun.png")
                .withModel(new MP5Iron(), "gun.png")
                .withModel(new M27rearsight(), "gun.png")
                .withModel(new MBUSiron(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, 
                        VLTORReceiver, AR57Receiver, Attachments.EF88Handguard, 
                        VectorHandguard, Vector556Handguard, Origin12Grip, HKS20Grip)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Iron1) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Iron1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Iron1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKMIron").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Kar98Ksight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new AK47iron(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47iron) {
                        GL11.glTranslatef(-0.6F, -1.6F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47iron) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK47iron) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Kar98Ksight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK15ironsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AK15ironsight(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKMiron2(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, RPKDustCover)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK15ironsight) {
                        GL11.glTranslatef(-0.6F, -1F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK15ironsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AK15ironsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK15ironsight")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SilencerMP7 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerMP7").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer357 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer357").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer57x38 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer57x38").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer12Gauge = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor45ACP(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer12Gauge").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer300AACBlackout = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor300AACBlackout(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer300AACBlackout").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer65x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x39(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer65x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Laser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRequiredAttachments(M4CarbineHandGuard, M38HandGuard, UTGTriRailHandGuard, PistolPlaceholder,
                        FABDefenseMount, LaserPlaceholder, Mk18HandGuard, M60E4HandGuard, 
                        P90Swordfish, AUGA3extGuard, StonerHANDGUARD, AR57Handguard, M9A1Body, SamuraiEdgeAWBody)
                .withModel(new com.vicmatskiv.mw.models.Laser(), "gun.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {

                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {
                        GL11.glTranslatef(0.6F, -0.3F, 0.65F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("Laser").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Laser2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Laser2(), "laser2.png")
                .withRequiredAttachments(M4CarbineHandGuard, M38HandGuard, UTGTriRailHandGuard, PistolPlaceholder,
                        LaserPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, 
                        AUGA3extGuard, StonerHANDGUARD, AR57Handguard)
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.3F, 1.8F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                })).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser2) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser2) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser2) {
                        GL11.glTranslatef(0.6F, -0.3F, 0.65F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("Laser2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DanWessonLaser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.DanWessonLaser(), "DanWessonLaser.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                })).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DanWessonLaser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DanWessonLaser) {

                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DanWessonLaser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DanWessonLaser) {
                        GL11.glTranslatef(0.6F, -0F, 0.45F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.DanWessonLaser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("DanWessonLaser").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1928Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.M1928Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1928Grip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1928Grip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1928Grip) {
                        GL11.glTranslatef(0.6F, 0.5F, -3.2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1928Grip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("M1928Grip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1A1Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.M1A1Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 1.0f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1A1Grip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1A1Grip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1A1Grip) {
                        GL11.glTranslatef(0.6F, 1.1F, -3.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M1A1Grip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("M1A1Grip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Grip2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.Grip2(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard,
                        AK15HandleGuard, M4CarbineHandGuard, LVOAVHandGuard, 
                        M38HandGuard, UTGTriRailHandGuard, GripPlaceholder,
                        Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard,
                        AR57Handguard, RPK16Handguard, StonerHANDGUARD, VectorHandguard, 
                        Vector556Handguard, Remington870FABDefensePump, 
                        Origin12Handguard, HKS20Handguard)
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Grip2) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Grip2) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Grip2) {
                        GL11.glTranslatef(0.6F, 0.3F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Grip2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("Grip2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        JunoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.JunoGrip(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, M4CarbineHandGuard, LVOAVHandGuard,
                        M38HandGuard, Mk18HandGuard, AR57Handguard, RPK16Handguard)
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.JunoGrip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.JunoGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.JunoGrip) {
                        GL11.glTranslatef(0.6F, 0F, -0.1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.JunoGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("JunoGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        GlockStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.Glock18Cstock(), "glock18c.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Glock18Cstock) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Glock18Cstock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Glock18Cstock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Glock18Cstock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("Glock18Cstock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VP70Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.VP70stock(), "gun.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VP70stock) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VP70stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VP70stock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VP70stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("VP70Stock").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AngledGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AngledGrip(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, M4CarbineHandGuard, 
                        LVOAVHandGuard, M38HandGuard, GripPlaceholder, UTGTriRailHandGuard, Mk18HandGuard, 
                        M60E4HandGuard, AUGA3extGuard, AR57Handguard, RPK16Handguard, 
                        StonerHANDGUARD, VectorHandguard, Vector556Handguard, 
                        Origin12Handguard, HKS20Handguard)
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AngledGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AngledGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AngledGrip) {
                        GL11.glTranslatef(0.6F, 0.8F, -0.45F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AngledGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("AngledGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        StubbyGrip = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.StubbyGrip(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, 
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard,
                        AR57Handguard, RPK16Handguard, StonerHANDGUARD, VectorHandguard, 
                        Vector556Handguard, Remington870FABDefensePump, 
                        Origin12Handguard, HKS20Handguard)
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                // .withApply((a, weapon, player) ->
                // weapon.changeRecoil(player, 1.3F);
                // })
                // .withRemove((attachment, weapon, player) -> {
                // weapon.changeRecoil(player, 1);
                // })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StubbyGrip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StubbyGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StubbyGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.6F, 1.6F, 1.6f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StubbyGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("StubbyGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        VGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.VGrip(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, 
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard, 
                        GripPlaceholder, Mk18HandGuard,
                        M60E4HandGuard, P90Swordfish, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD,
                        VectorHandguard, Vector556Handguard, Remington870FABDefensePump,
                        Origin12Handguard, HKS20Handguard)
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VGrip) {
                        GL11.glTranslatef(0.6F, 0.3F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("VGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Bipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.Bipod(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, 
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard, GripPlaceholder, 
                        Mk18HandGuard, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD, 
                        StonerHANDGUARD, VectorHandguard, Vector556Handguard)
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Bipod) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Bipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Bipod) {
                        GL11.glTranslatef(0.6F, -0.05F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Bipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("Bipod").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGgrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AUGGrip(), "gun.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGGrip) {
                        GL11.glTranslatef(0.6F, 0.6F, -3.7F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("AUGgrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

    }
}
