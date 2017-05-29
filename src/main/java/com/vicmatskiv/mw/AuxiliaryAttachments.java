package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AR15CarryHandle;
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
import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

public class AuxiliaryAttachments {

    public static ItemAttachment<Weapon> FNP90Sight;
    public static ItemAttachment<Weapon> AR15Iron;
    public static ItemAttachment<Weapon> Extra;
    public static ItemAttachment<Weapon> ExtraAR;
    public static ItemAttachment<Weapon> GlockTop;
    public static ItemAttachment<Weapon> G18Top;
    public static ItemAttachment<Weapon> M9Top;
    public static ItemAttachment<Weapon> P2000Top;
    public static ItemAttachment<Weapon> DeagleTop;
    public static ItemAttachment<Weapon> Deagle44Top;
    public static ItemAttachment<Weapon> KSGPump;
    public static ItemAttachment<Weapon> L115Bolt1;
    public static ItemAttachment<Weapon> L115Bolt2;
    public static ItemAttachment<Weapon> RevolverCase;
    public static ItemAttachment<Weapon> PythonCase;
    public static ItemAttachment<Weapon> R870Pump;
    public static ItemAttachment<Weapon> M1911Top;
    public static ItemAttachment<Weapon> M9SDsuppressor;
    public static ItemAttachment<Weapon> MosinBolt;
    public static ItemAttachment<Weapon> USP45Top;
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
    public static ItemAttachment<Weapon> AKaction;
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


    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {

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
                        'A', CommonProxy.SteelIngot,
                        'F', CommonProxy.SteelPlate

                        )
                .withName("AR15Iron").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
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
                .withModel(new MP5Iron(), "AK12.png").withName("Extra").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        ExtraAR = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AR15Iron(), "AK12.png").withModel(new FALIron(), "AK12.png")
                .withModel(new M4Iron1(), "AK12.png").withModel(new M4Iron2(), "AK12.png").withName("ExtraAR")
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        GlockTop = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.GlockTop(), "GlockTop.png").withName("GlockTop")
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
                .withModel(new com.vicmatskiv.mw.models.M9Top(), "M9Top.png").withName("M9Top").withRenderablePart()
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
                .withModel(new com.vicmatskiv.mw.models.P2000Top(), "P2000Top.png").withName("P2000Top")
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
                .withModel(new com.vicmatskiv.mw.models.KSG12Pump(), "GunmetalTexture.png").withName("KSGPump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        L115Bolt1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.L115Bolt1(), "AK12.png").withName("LP115Bolt")
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
                .withModel(new com.vicmatskiv.mw.models.MosinBolt(), "NATOMag1.png").withName("MosinBolt")
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
                .withModel(new com.vicmatskiv.mw.models.R870Pump(), "Remington.png").withName("R870Pump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M1911Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1911Top(), "M1911.png").withName("M1911Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        USP45Top = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.USP45Top(), "USP45Top.png").withName("USP45Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MakarovTop = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MakarovTop(), "MakarovPM.png").withName("MakarovTop")
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
                .withModel(new com.vicmatskiv.mw.models.P225Top(), "P226Top.png").withName("P226Top")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        MP5KGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
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

        AK12action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.AK12action(), "AK12.png")
                .withName("AK12action").withRenderablePart()
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
