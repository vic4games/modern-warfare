package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AR15CarryHandle;
import com.vicmatskiv.mw.models.AS50action;
import com.vicmatskiv.mw.models.AS50mag;
import com.vicmatskiv.mw.models.ChiappoRhinoChamber;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.GL06Grenade;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M27rearsight;
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
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

public class AuxiliaryAttachments {

    public static ItemAttachment<Weapon> AR15Iron;
    public static ItemAttachment<Weapon> Extra;
    public static ItemAttachment<Weapon> AR15Action;
    public static ItemAttachment<Weapon> NV4Action;
    public static ItemAttachment<Weapon> M110Action;
    public static ItemAttachment<Weapon> M4Rail;
    public static ItemAttachment<Weapon> RailAlt;
    public static ItemAttachment<Weapon> AACRail;
    public static ItemAttachment<Weapon> M110Rail;
    public static ItemAttachment<Weapon> MagnumRail;
    public static ItemAttachment<Weapon> M45A1slide;
    public static ItemAttachment<Weapon> M1911Slide;
    public static ItemAttachment<Weapon> BrowningHiPowerSlide;
    public static ItemAttachment<Weapon> M9A1slide;
    public static ItemAttachment<Weapon> SCCYCPX2Slide;
    public static ItemAttachment<Weapon> M6Cslide;
    public static ItemAttachment<Weapon> Albert01Rslide;
    public static ItemAttachment<Weapon> M40A6BoltAction;
    public static ItemAttachment<Weapon> M500A2pump;
    public static ItemAttachment<Weapon> R870pump;
    public static ItemAttachment<Weapon> KS23pump;
    public static ItemAttachment<Weapon> AKaction;
    public static ItemAttachment<Weapon> AK12action;
    public static ItemAttachment<Weapon> Volkaction;
    public static ItemAttachment<Weapon> SV98BoltAction;
    public static ItemAttachment<Weapon> L96A1BoltAction;
    public static ItemAttachment<Weapon> SV98barrelpiece;
    public static ItemAttachment<Weapon> VSSVintorezAction;
    public static ItemAttachment<Weapon> MP443Slide;
    public static ItemAttachment<Weapon> AS50Action;
    public static ItemAttachment<Weapon> P10Slide;
    public static ItemAttachment<Weapon> AKpart;
    public static ItemAttachment<Weapon> AKIron;
    public static ItemAttachment<Weapon> AKMuzzle;
    public static ItemAttachment<Weapon> P10frontsight;
    public static ItemAttachment<Weapon> SpringfieldRearSight;
    public static ItemAttachment<Weapon> SpringfieldAction;
    public static ItemAttachment<Weapon> Kar98Kaction;;
    public static ItemAttachment<Weapon> MG42latch;
    public static ItemAttachment<Weapon> MG34latch;
    public static ItemAttachment<Weapon> MG42Belt;
    public static ItemAttachment<Weapon> MG42action;
    public static ItemAttachment<Weapon> M60Hatch;
    public static ItemAttachment<Weapon> M60Belt;
    public static ItemAttachment<Weapon> STG44action;
    public static ItemAttachment<Weapon> Mk14EBRaction;
    public static ItemAttachment<Weapon> Mk14EBRsight;
    public static ItemAttachment<Weapon> Glock18Cslide;
    public static ItemAttachment<Weapon> Glock19slide;
    public static ItemAttachment<Weapon> APSslide;
    public static ItemAttachment<Weapon> KragAction1;
    public static ItemAttachment<Weapon> KragAction2;
    public static ItemAttachment<Weapon> KragChamber;
    public static ItemAttachment<Weapon> M712action;
    public static ItemAttachment<Weapon> FrommerStopaction;
    public static ItemAttachment<Weapon> FrommerSight;
    public static ItemAttachment<Weapon> UziAction;
    public static ItemAttachment<Weapon> UziRelease;
    public static ItemAttachment<Weapon> UziIronSight;
    public static ItemAttachment<Weapon> L115Bolt1;
    public static ItemAttachment<Weapon> L115Bolt2;
    public static ItemAttachment<Weapon> L115Mag;
    public static ItemAttachment<Weapon> Saiga12action;
    public static ItemAttachment<Weapon> Saiga12sights;
    public static ItemAttachment<Weapon> ScarAction;
    public static ItemAttachment<Weapon> M82Action;
    public static ItemAttachment<Weapon> MP5A5action;
    public static ItemAttachment<Weapon> MP40action;
    public static ItemAttachment<Weapon> M1A1ThompsonAction;
    public static ItemAttachment<Weapon> M1A1Sight;
    public static ItemAttachment<Weapon> M1928ThompsonAction;
    public static ItemAttachment<Weapon> M1928Sight;
    public static ItemAttachment<Weapon> CSA16pump;
    public static ItemAttachment<Weapon> R870part;
    public static ItemAttachment<Weapon> KedrAction;
    public static ItemAttachment<Weapon> VP70slide;
    public static ItemAttachment<Weapon> HESCSpump;
    public static ItemAttachment<Weapon> BrenAction;
    public static ItemAttachment<Weapon> Type2Part;
    public static ItemAttachment<Weapon> Type2Sight;
    public static ItemAttachment<Weapon> MP43Edoublebarrel;
    public static ItemAttachment<Weapon> M1873action;
    public static ItemAttachment<Weapon> F2000Action;
    public static ItemAttachment<Weapon> G36CAction;
    public static ItemAttachment<Weapon> SL8Action;
    public static ItemAttachment<Weapon> G36CRail;
    public static ItemAttachment<Weapon> MA37Action;
    public static ItemAttachment<Weapon> MA5DAction;
    public static ItemAttachment<Weapon> BR55Action;
    public static ItemAttachment<Weapon> M6CSOCOMSlide;
    public static ItemAttachment<Weapon> M6CSOCOMsight;
    public static ItemAttachment<Weapon> M45pump;
    public static ItemAttachment<Weapon> M392Action;
    public static ItemAttachment<Weapon> Type51Action;
    public static ItemAttachment<Weapon> M20Action;
    public static ItemAttachment<Weapon> SRS99Action;
    public static ItemAttachment<Weapon> GLgrenade;
    public static ItemAttachment<Weapon> M79grenade;
    public static ItemAttachment<Weapon> GL06Cartridge;
    public static ItemAttachment<Weapon> M79Cartridge;
    public static ItemAttachment<Weapon> M32Cartridge;
    public static ItemAttachment<Weapon> ESA23Slide;
    public static ItemAttachment<Weapon> SSG42Barrels;
    public static ItemAttachment<Weapon> ChiappaTripleCrownBarrels;
    public static ItemAttachment<Weapon> QuadBarrelShotgunBarrels;
    public static ItemAttachment<Weapon> HAR27Belt;
    public static ItemAttachment<Weapon> HAR27Action;
    public static ItemAttachment<Weapon> ACRAction;
    public static ItemAttachment<Weapon> ACRRails;
    public static ItemAttachment<Weapon> M1014Action;
    public static ItemAttachment<Weapon> SupernovaAction;
    public static ItemAttachment<Weapon> SupernovaPump;
    public static ItemAttachment<Weapon> PythonChamber;
    public static ItemAttachment<Weapon> MagnumChamber;
    public static ItemAttachment<Weapon> RhinoChamber;
    public static ItemAttachment<Weapon> P226Slide;
    public static ItemAttachment<Weapon> M1897Pump;
    public static ItemAttachment<Weapon> Super90Pump;
    public static ItemAttachment<Weapon> DesertEagleSlide;
    public static ItemAttachment<Weapon> M32Main1B;
    public static ItemAttachment<Weapon> M134Barrels;
    public static ItemAttachment<Weapon> M249Hatch;
    public static ItemAttachment<Weapon> M249Belt;
    public static ItemAttachment<Weapon> M249Action;
    public static ItemAttachment<Weapon> FatmanGrip;
    public static ItemAttachment<Weapon> FatmanRack;
    public static ItemAttachment<Weapon> MiniNuke;
    public static ItemAttachment<Weapon> BrowningAuto5Action;
    public static ItemAttachment<Weapon> M1GarandAction;
    public static ItemAttachment<Weapon> M1GarandMag;
    public static ItemAttachment<Weapon> G11Action;
    public static ItemAttachment<Weapon> AUGAction;
    
    //Magazines
    public static ItemAttachment<Weapon> NV4Mag;
    public static ItemAttachment<Weapon> M6CMag;
    public static ItemAttachment<Weapon> P10Mag;
    public static ItemAttachment<Weapon> VolkMag;
    public static ItemAttachment<Weapon> Type2Mag;
    public static ItemAttachment<Weapon> M8A7Mag;
    public static ItemAttachment<Weapon> G36CMag;
    public static ItemAttachment<Weapon> MA37Mag;
    public static ItemAttachment<Weapon> MA5DMag;
    public static ItemAttachment<Weapon> BR55Mag;
    public static ItemAttachment<Weapon> M6CSOCOMMag;
    public static ItemAttachment<Weapon> M392Mag;
    public static ItemAttachment<Weapon> Type51Mag;
    public static ItemAttachment<Weapon> M20Mag;
    public static ItemAttachment<Weapon> SRS99Mag;
    public static ItemAttachment<Weapon> M41AMag;
    public static ItemAttachment<Weapon> M56Mag;
    public static ItemAttachment<Weapon> HAR27Mag;
    
    //Projectiles
    public static ItemAttachment<Weapon> ShotgunShell;
    public static ItemAttachment<Weapon> Shotgun4Gauge;
    public static ItemAttachment<Weapon> Bullet;
    public static ItemAttachment<Weapon> LaserProjectile;
    public static ItemAttachment<Weapon> RPG7rocket;
    public static ItemAttachment<Weapon> M202rockets;
    
    public static ItemAttachment<Weapon> Chain;
    public static ItemAttachment<Weapon> ChainA;
    public static ItemAttachment<Weapon> ChainB;
    
    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        
        FatmanGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.FatmanGrip(), "gun.png")
                .withName("FatmanGrip")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        FatmanRack = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.FatmanRack(), "gun.png")
                .withName("FatmanRack")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MiniNuke = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MiniNuke(), "mininuke.png")
                .withName("MiniNukeAttachment")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ChainB = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.ChainsawChainB(), "chainsaw.png")
                .withName("ChainB")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ChainA = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.ChainsawChainA(), "chainsaw.png")
                .withName("ChainA")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Chain = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.ChainsawChain(), "chainsaw.png")
                .withName("Chain")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        G11Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.G11Action(), "gun.png")
                .withName("G11Action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AUGaction(), "gun.png")
                .withName("AUGAction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M32Main1B = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M32Main1B(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "gun.png")
                .withName("M32Main1B")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M134Barrels = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M134Barrels(), "gun.png")
                .withName("M134Barrels")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        BrowningAuto5Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.BrowningAuto5Action(), "gun.png").withName("BrowningAuto5Action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1GarandAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1GarandAction(), "gun.png").withName("M1GarandAction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1GarandMag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1GarandMag1(), "M1GarandMag.png")
                .withModel(new com.vicmatskiv.mw.models.M1GarandMag2(), "M1GarandMag.png")
                .withName("M1GarandMag")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1897Pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1897Pump(), "m1897.png").withName("M1897pump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Super90Pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Super90Pump(), "gun.png").withName("Super90Pump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P226Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.P225Top(), "P226Top.png")
                .withModel(new com.vicmatskiv.mw.models.P226rearsight(), "p226rearsight.png")
                .withModel(new com.vicmatskiv.mw.models.P226frontsight(), "p226frontsight.png")
                .withName("P226Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        PythonChamber = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.PythonChamber(), "Python.png").withName("PythonChamber")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MagnumChamber = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.TaurusRagingHunterChamber(), "TaurusRagingHunter.png").withName("MagnumChamber")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RhinoChamber = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new ChiappoRhinoChamber(), "chiapparhino.png").withName("RhinoChamber")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ACRAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.ACRAction(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.ACRAction2(), "gun.png")
                .withName("ACRAction").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1014Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.M1014action(), "gun.png")
                .withName("M1014Action").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SupernovaAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.SupernovaAction(), "gun.png")
                .withName("SupernovaAction").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SupernovaPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.SupernovaPump(), "gun.png")
                .withName("SupernovaPump").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        ACRRails = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "ACR.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "ACR.png")
                .withName("ACRRails").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        RPG7rocket = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.RPG7rocket(), "rpg7.png")
                .withRenderablePart()
                .withName("RPG7rocket").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M202rockets = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.M202Rockets(), "gun.png")
                .withRenderablePart()
                .withName("m202rockets").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SSG42Barrels = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.SSG42Barrels(), "ssg42.png")
                .withRenderablePart()
                .withName("SSG42Barrels").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        ChiappaTripleCrownBarrels = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.ChiappaTripleCrownBarrels(), "chiappatriplecrown.png")
                .withRenderablePart()
                .withName("ChiappaTripleCrownBarrels").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        QuadBarrelShotgunBarrels = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.QuadBarrelShotgunBarrels(), "chiappatriplecrown.png")
                .withRenderablePart()
                .withName("QuadBarrelShotgunBarrels").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        GLgrenade = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                .withModel(new GL06Grenade(), "GL06.png")
                .withRenderablePart()
                .withName("GLgrenade").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        M79grenade = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                .withModel(new com.vicmatskiv.mw.models.M79grenade(), "gun.png")
                .withRenderablePart()
                .withName("M79grenade").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        GL06Cartridge = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.GL06Cartridge(), "GL06.png")
                .withRenderablePart()
                .withName("GL06Cartridge").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M79Cartridge = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.M79Cartridge(), "m79.png")
                .withRenderablePart()
                .withName("M79Cartridge").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M32Cartridge = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.M32Cartridge(), "gun.png")
                .withRenderablePart()
                .withName("M32Cartridge").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M56Mag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M56Mag(), "gun.png")
                .withName("M56Mag")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        HAR27Mag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.HAR27Mag(), "har27.png")
                .withName("HAR27Mag")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        HAR27Belt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.HAR27Belt(), "har27.png")
                .withName("HAR27Belt")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        HAR27Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.HAR27Action(), "har27.png")
                .withName("HAR27Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M41AMag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M41AMag(), "M41AMag.png")
                .withName("M41AMag")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Type51Mag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Type51mag(), "Type51.png")
                .withName("Type51Mag")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MP43Edoublebarrel = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP43Edoublebarrel(), "MP43E.png")
                .withName("MP43Edoublebarrel")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1873action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1873action(), "M1873.png")
                .withName("M1873action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Type51Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Type51action(), "Type51.png")
                .withName("Type51Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        F2000Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.F2000Action(), "gun.png")
                .withName("F2000Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MA37Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MA37Action(), "MA37.png")
                .withName("MA37Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M20Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M20Action(), "M20.png")
                .withName("M20Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M392Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M392Action(), "m392.png")
                .withName("M392Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SRS99Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SRS99Action(), "srs99.png")
                .withName("SRS99Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MA5DAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MA5Daction(), "MA5D.png")
                .withName("MA5DAction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        BR55Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.BR55action(), "BR55.png")
                .withName("BR55Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        G36CAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.G36Action(), "gun.png")
                .withName("G36CAction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SL8Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SL8Action(), "gun.png")
                .withName("SL8Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1A1ThompsonAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1A1action(), "M1A1Thompson.png")
                .withName("M1A1ThompsonAction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        KedrAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.KedrAction(), "gun.png")
                .withName("KedrAction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1928ThompsonAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1928ThompsonAction(), "M1A1Thompson.png")
                .withName("M1928ThompsonAction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1A1Sight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1A1rearsight(), "gun.png")
                .withName("M1A1ThompsonSight")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1928Sight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1928rearsight(), "gun.png")
                .withName("M1928Sight")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        CSA16pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.CSA16pump(), "csa16.png")
                .withName("CSA16pump")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M45pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M45pump(), "m45.png")
                .withName("M45pump")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        R870part = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.R870part(), "gun.png")
                .withName("R870part")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M82Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M107action(), "gun.png")
                .withName("m82action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MP40action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP40Action(), "MP40.png")
                .withName("MP40action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MP5A5action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP5A5action(), "MP5A5.png")
                .withName("MP5A5action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MG42Belt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MG42belt(), "mg42.png")
                .withName("mg42belt")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MG42latch = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MG42latch(), "mg42.png")
                .withName("mg42latch")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MG34latch = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MG34Latch(), "mg42.png")
                .withName("mg34latch")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M60Belt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M60Belt(), "m60.png")
                .withName("M60Belt")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M60Hatch = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M60Hatch(), "m60.png")
                .withName("M60Hatch")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M249Belt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M249Belt(), "m249.png")
                .withName("M249Belt")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M249Hatch = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M249Hatch(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.M249RearSight(), "gun.png")
                .withName("M249Hatch")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M249Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M249Action(), "gun.png")
                .withName("M249Action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MG42action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MG42action(), "mg42.png")
                .withName("mg42action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        ScarAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.ScarAction(), "gun.png")
                .withName("ScarAction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Mk14EBRaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Mk14EBRaction(), "gun.png")
                .withName("Mk14EBRaction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Mk14EBRsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.m1garandrearsight(), "gun.png")
                .withName("Mk14EBRsight")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        STG44action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.STG44Action(), "STG44.png")
                .withName("STG44action")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SpringfieldRearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SpringfieldRearSight(), "gun.png")
                .withName("SpringfieldRearSight")
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
                .withModel(new com.vicmatskiv.mw.models.Kar98Kboltaction(), "gun.png")
                .withName("Kar98Kaction")
                .withRenderablePart()
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Glock18Cslide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Glock18Cslide(), "glock18c.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.vicmatskiv.mw.models.GlockRearSight(), "glockrearsight")
                .withName("Glock18Cslide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ESA23Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.ESA23Slide(), "esa23.png")
                .withModel(new com.vicmatskiv.mw.models.P2000rearsight(), "usp45rearsight.png")
                .withName("ESA23Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VP70slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.VP70slide(), "vp70.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.vicmatskiv.mw.models.GlockRearSight(), "glockrearsight")
                .withName("VP70slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        FrommerStopaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.FrommerStopAction(), "frommer_stop.png")
                .withName("FrommerStopAction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        FrommerSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "gun")
                .withModel(new com.vicmatskiv.mw.models.M9A1rearsight(), "gun")
                .withName("FrommerSight")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        APSslide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.APSslide(), "APS.png")
                .withModel(new com.vicmatskiv.mw.models.makarovfrontsight(), "gun")
                .withModel(new com.vicmatskiv.mw.models.APSrearsight(), "gun")
                .withName("APSslide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Glock19slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Glock19slide(), "glock19.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.vicmatskiv.mw.models.GlockRearSight(), "glockrearsight")
                .withName("Glock19slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M712action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M712action(), "m712.png")
                .withName("M712action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M45A1slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Emp1911Slide(), "Emp1911.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.vicmatskiv.mw.models.M1911rearsight(), "m1911rearsight")
                .withName("M45A1slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1911Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M1911Top(), "m1911.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "gun")
                .withModel(new com.vicmatskiv.mw.models.makarovrearsight(), "gun")
                .withName("M1911Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        BrowningHiPowerSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.BrowningHiPowerSlide(), "BrowningHiPower.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "gun")
                .withModel(new com.vicmatskiv.mw.models.makarovrearsight(), "gun")
                .withName("BrowningHiPowerSlide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP443Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP443Slide(), "MP443.png")
                .withModel(new com.vicmatskiv.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.vicmatskiv.mw.models.M1911rearsight(), "m1911rearsight")
                .withName("MP443Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VSSVintorezAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.VSSVintorezAction(), "gun.png")
                .withName("VSSVintorezAction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AKaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AK47Action(), "gun.png")
                .withName("AKaction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK12action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AK12action(), "gun.png")
                .withName("AK12action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Volkaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.VolkAction(), "Volk.png")
                .withModel(new com.vicmatskiv.mw.models.AKaction(), "gun.png")
                .withName("Volkaction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Type2Mag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Type2Mag(), "Type2.png")
                .withName("Type2Mag")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Saiga12action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Saiga12action(), "gun.png").withName("Saiga12action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Saiga12sights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.makarovrearsight(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.makarovfrontsight(), "gun.png")
                .withName("Saiga12sights")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AS50Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new AS50action(), "as50.png")
                .withName("AS50Action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M9A1slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M9A1slide(), "M9A1.png")
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.vicmatskiv.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withName("M9A1slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SCCYCPX2Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SCCYCPX2Slide(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.vicmatskiv.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withName("SCCYCPX2Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DesertEagleSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.DesertEagleSlide(), "deserteagle.png")
                .withName("DesertEagleSlide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M6Cslide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M6CSlide(), "m6c.png")
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.vicmatskiv.mw.models.M6Crearsight(), "M6Crearsight")
                .withName("M6Cslide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M6CSOCOMsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "M9A1frontsight")
                .withName("M6CSOCOMsight")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M6CSOCOMSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M6CSOCOMSlide(), "M6CSOCOM.png")
                .withModel(new com.vicmatskiv.mw.models.M6Crearsight(), "M6Crearsight")
                .withName("M6CSOCOMSlide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Albert01Rslide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Albert01RSlide(), "Albert01R.png")
                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.vicmatskiv.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withName("albert01R_slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        UziAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.UziAction(), "gun.png")
                .withName("UziAction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        UziRelease = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.UziRelease(), "gun.png")
                .withName("UziRelease")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        UziIronSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.UziFrontSight(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.UziRearSight(), "gun.png")
                .withName("UziIronSight")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P10Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.P10mmSlide(), "p10.png")
                .withModel(new com.vicmatskiv.mw.models.makarovrearsight(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.makarovfrontsight(), "gun.png")
//                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "M9A1frontsight")
//                .withModel(new com.vicmatskiv.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withName("P10Slide")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P10frontsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.makarovfrontsight(), "gun.png")
//                .withModel(new com.vicmatskiv.mw.models.M9A1frontsight(), "M9A1frontsight")
//                .withModel(new com.vicmatskiv.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withName("P10frontsight")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M40A6BoltAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.GunwerksHAMRboltaction(), "M40A6")
                .withName("M40A6BoltAction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SV98BoltAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SV98Action(), "SV98action")
                .withName("SV98BoltAction")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        L115Bolt1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.L96Action(), "L96Action.png").withName("L96Action")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        L115Bolt2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.L115Bolt2(), "gun.png").withName("LP115Bolt2")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        L115Mag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.L115Mag(), "gun.png").withName("L115Mag")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SV98barrelpiece = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.SV98_barrel_piece(), "gun")
                .withName("SV98barrelpiece")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M500A2pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M500A2pump(), "gun")
                .withName("M500A2pump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        R870pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Remington870Pump(), "gun")
                .withName("r870pump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HESCSpump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.HEShotgunPump(), "spas12")
                .withName("HESCSpump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KS23pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.KS23pump(), "ks23")
                .withName("KS23pump")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KragAction1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.KragJorgensenAction1(), "KragJorgensen")
                .withName("KragAction1")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KragAction2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.KragJorgensenAction2(), "KragJorgensen")
                .withName("KragAction2")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KragChamber = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.KragJorgensenChamber(), "KragJorgensen")
                .withName("KragChamber")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ShotgunShell = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Shotgun12Gauge(), "shotgun12gauge")
                .withName("ShotgunShell")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Shotgun4Gauge = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Shotgun12Gauge(), "Shotgun4Gauge")
                .withName("Shotgun4Gauge")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Bullet = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet")
                .withName("Bullet")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        LaserProjectile = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.LaserProjectile(), "Laser")
                .withName("LaserProjectile")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MA37Mag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.MA37Mag(), "MA37.png")
                .withName("MA37Mag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M20Mag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.M20Mag(), "M20.png")
                .withName("M20Mag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M392Mag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.M392Mag(), "m392.png")
                .withName("M392Mag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SRS99Mag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.SRS99Mag(), "srs99.png")
                .withName("SRS99Mag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MA5DMag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.MA5Dmag(), "MA5D.png")
                .withName("MA5DMag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        BR55Mag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.BR55mag(), "BR55.png")
                .withName("BR55Mag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M8A7Mag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.M8A7Mag(), "gun.png")
                .withName("M8A7Mag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        G36CMag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.NATOG36Mag(), "gun.png")
                .withName("G36CMag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        NV4Mag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.NV4Mag(), "NV4Mag.png")
                .withName("NV4Mag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M6CMag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.M6CMag(), "m6c.png")
                .withName("M6CMag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M6CSOCOMMag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.M6CSOCOMMag(), "M6CSOCOM.png")
                .withName("M6CSOCOMMag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        P10Mag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.P10mmMag(), "gun.png")
                .withName("P10Mag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        VolkMag = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.VolkMag(), "VolkMag.png")
                .withName("VolkMag").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AR15Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.AR15Action(), "gun.png")
                .withName("AR15Action").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        NV4Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.NV4Action(), "NV4Action.png")
                .withName("NV4Action").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        BrenAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.CZ805BrenAction(), "gun.png")
                .withName("BrenAction").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Type2Part = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.Type2Part(), "Type2.png")
                .withModel(new com.vicmatskiv.mw.models.Type2RearSight(), "gun.png")
                .withName("Type2Part").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
//        Type2GUN = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
//                .withModel(new com.vicmatskiv.mw.models.Type2GUN(), "Type2.png")
//                .withName("Type2GUN").withRenderablePart().withModId(ModernWarfareMod.MODID)
//                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Type2Sight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.Type2FrontSight(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "green.png")
                .withName("Type2Sight").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M110Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.AR15Action(), "M110.png")
                .withName("M110Action").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AR15Iron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new M4Iron1(), "gun.png")
                .withModel(new M4Iron2(), "AK12.png").withModel(new FALIron(), "gun.png")
                .withModel(new AR15CarryHandle(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR15CarryHandle) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.6F, 0.65f);
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
                .withName("AR15Iron").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Extra = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new AKMiron1(), "gun.png").withModel(new AKMiron2(), "gun.png")
                .withModel(new AK47iron(), "gun.png").withModel(new M4Iron1(), "gun.png")
                .withModel(new M4Iron2(), "gun.png").withModel(new P90iron(), "gun.png")
                .withModel(new G36CIron1(), "gun.png").withModel(new G36CIron2(), "gun.png")
                .withModel(new ScarIron1(), "gun.png").withModel(new ScarIron2(), "gun.png")
                .withModel(new FALIron(), "gun.png").withModel(new M14Iron(), "gun.png")
                .withModel(new MP5Iron(), "gun.png")
                .withName("Extra").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M4Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "gun.png")
                .withName("M4Rail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MagnumRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "MagnumRail.png")
                .withName("MagnumRail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        G36CRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.G36Rail(), "gun.png")
                .withName("G36CRail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        RailAlt = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.RailAlt(), "gun.png")
                .withName("RailAlt").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AACRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "gun.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "aacrail_lighttan.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "aacrail_darktan.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "aacrail_lighttan.png")
                .withName("AACRail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M110Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKRail(), "M110.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail2(), "M110.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail3(), "M110.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail4(), "M110.png")
                .withModel(new com.vicmatskiv.mw.models.AKRail5(), "M110.png")
                .withName("M110Rail").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AKpart = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.vicmatskiv.mw.models.AKpart(), "gun")
                .withName("AKpart").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AKIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA4)
                .withModel(new com.vicmatskiv.mw.models.AKiron3(), "gun")
                .withName("AKiron").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AKMuzzle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "gun")
                .withName("AKmuzzle").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
    }
    
}