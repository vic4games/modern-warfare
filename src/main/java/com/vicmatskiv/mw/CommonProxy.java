package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.oredict.OreDictionary;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.attachments.ItemAKMIron;
import com.vicmatskiv.mw.attachments.ItemAR15Iron;
import com.vicmatskiv.mw.blocks.BlockBauxiteOre;
import com.vicmatskiv.mw.blocks.BlockCopperOre;
import com.vicmatskiv.mw.blocks.BlockLeadOre;
import com.vicmatskiv.mw.blocks.BlockRubyOre;
import com.vicmatskiv.mw.blocks.BlockSiliconOre;
import com.vicmatskiv.mw.blocks.BlockSulfurOre;
import com.vicmatskiv.mw.blocks.BlockTantalumOre;
import com.vicmatskiv.mw.blocks.BlockTinOre;
import com.vicmatskiv.mw.blocks.BlockTitaniumOre;
import com.vicmatskiv.mw.items.ItemGrenades;
import com.vicmatskiv.mw.items.ItemLaserPointer;
import com.vicmatskiv.mw.items.guns.*;
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
import com.vicmatskiv.mw.parts.ItemBarrel;
import com.vicmatskiv.mw.parts.ItemCapacitor;
import com.vicmatskiv.mw.parts.ItemCopperWiring;
import com.vicmatskiv.mw.parts.ItemDeagleReceiver;
import com.vicmatskiv.mw.parts.ItemDiode;
import com.vicmatskiv.mw.parts.ItemInductor;
import com.vicmatskiv.mw.parts.ItemLMGReceiver;
import com.vicmatskiv.mw.parts.ItemP90Receiver;
import com.vicmatskiv.mw.parts.ItemPistolUnderReceiver;
import com.vicmatskiv.mw.parts.ItemResistor;
import com.vicmatskiv.mw.parts.ItemRetractableStock;
import com.vicmatskiv.mw.parts.ItemRevolverAction;
import com.vicmatskiv.mw.parts.ItemRevolverGrip;
import com.vicmatskiv.mw.parts.ItemRevolverReceiver;
import com.vicmatskiv.mw.parts.ItemRifleReceiver;
import com.vicmatskiv.mw.parts.ItemSMGReceiver;
import com.vicmatskiv.mw.parts.ItemScarReceiver;
import com.vicmatskiv.mw.parts.ItemSecondaryStock;
import com.vicmatskiv.mw.parts.ItemShotgunGrip;
import com.vicmatskiv.mw.parts.ItemShotgunReceiver;
import com.vicmatskiv.mw.parts.ItemTransistor;
import com.vicmatskiv.mw.parts.ItemUnderReceiver;
import com.vicmatskiv.mw.parts.ItemWeaponReceiver;
import com.vicmatskiv.mw.parts.ItemWeaponStock;
import com.vicmatskiv.mw.parts.ItemWoodRifleStock;
import com.vicmatskiv.mw.parts.ItemWoodWeaponStock;
import com.vicmatskiv.mw.resources.ItemAluminumIngot;
import com.vicmatskiv.mw.resources.ItemAluminumPlate;
import com.vicmatskiv.mw.resources.ItemBullets;
import com.vicmatskiv.mw.resources.ItemCGrip;
import com.vicmatskiv.mw.resources.ItemCloth;
import com.vicmatskiv.mw.resources.ItemCopperIngot;
import com.vicmatskiv.mw.resources.ItemElectronics;
import com.vicmatskiv.mw.resources.ItemGreenCloth;
import com.vicmatskiv.mw.resources.ItemLeadIngot;
import com.vicmatskiv.mw.resources.ItemMiniSteelPlate;
import com.vicmatskiv.mw.resources.ItemOpticGlass;
import com.vicmatskiv.mw.resources.ItemPiston;
import com.vicmatskiv.mw.resources.ItemPlastic;
import com.vicmatskiv.mw.resources.ItemRuby;
import com.vicmatskiv.mw.resources.ItemSilicon;
import com.vicmatskiv.mw.resources.ItemSteelDust;
import com.vicmatskiv.mw.resources.ItemSteelIngot;
import com.vicmatskiv.mw.resources.ItemSteelPlate;
import com.vicmatskiv.mw.resources.ItemSulfurDust;
import com.vicmatskiv.mw.resources.ItemTanCloth;
import com.vicmatskiv.mw.resources.ItemTantalumIngot;
import com.vicmatskiv.mw.resources.ItemTinIngot;
import com.vicmatskiv.mw.resources.ItemTitaniumIngot;
import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.CustomArmor.Builder;
import com.vicmatskiv.weaponlib.ItemAmmo;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.ItemScope;
import com.vicmatskiv.weaponlib.ItemSkin;
import com.vicmatskiv.weaponlib.LaserBeamRenderer;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibleChannel;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;

public class CommonProxy {

    public static Item Marinechest;
    public static Item Marineboots;
    public static Item Marinehelmet;

    public static Item Spetznazchest;
    public static Item Spetznazboots;
    public static Item Spetznazhelmet;

    public static Item Swatchest;
    public static Item Swatboots;
    public static Item Swathelmet;

    public static Item GasSwatchest;
    public static Item GasSwatboots;
    public static Item GasSwathelmet;

    public static Item Tacticalchest;
    public static Item Tacticalboots;
    public static Item Tacticalhelmet;

    public static ItemAttachment<Weapon> Reflex;
    public static ItemAttachment<Weapon> Holo2;
    public static ItemAttachment<Weapon> Holographic2;
    public static ItemAttachment<Weapon> Kobra;
    public static ItemAttachment<Weapon> ACOG;
    public static ItemAttachment<Weapon> Scope;
    public static ItemAttachment<Weapon> HP;
    public static ItemAttachment<Weapon> Silencer556x45;
    public static ItemAttachment<Weapon> Silencer762x39;
    public static ItemAttachment<Weapon> Silencer556x39;
    public static ItemAttachment<Weapon> Silencer50BMG;
    public static ItemAttachment<Weapon> Silencer9mm;
    public static ItemAttachment<Weapon> Silencer762x54;
    public static ItemAttachment<Weapon> Silencer762x51;
    public static ItemAttachment<Weapon> Silencer45ACP;
    public static ItemAttachment<Weapon> Silencer12Gauge;
    public static ItemAttachment<Weapon> Silencer65x39;
    public static ItemAttachment<Weapon> Silencer57x38;
    public static ItemAttachment<Weapon> Silencer300AACBlackout;
    public static ItemAttachment<Weapon> Silencer357;
    public static ItemAttachment<Weapon> SilencerMP7;
    public static ItemAttachment<Weapon> Laser;
    public static ItemAttachment<Weapon> Laser2;
    public static ItemAttachment<Weapon> Grip2;
    public static ItemAttachment<Weapon> Grip;
    public static ItemAttachment<Weapon> StubbyGrip;
    public static ItemAttachment<Weapon> VGrip;
    public static ItemAttachment<Weapon> Bipod;

    public static ItemAttachment<Weapon> FNP90Sight;

    public static ItemAttachment<Weapon> AKMIron;
    public static ItemAttachment<Weapon> AR15Iron;
    public static ItemAttachment<Weapon> Extra;
    public static ItemAttachment<Weapon> ExtraAR;
    public static ItemAttachment<Weapon> GlockTop;
    public static ItemAttachment<Weapon> G18Top;
    public static ItemAttachment<Weapon> M9Top;
    public static ItemAttachment<Weapon> P2000Top;
    public static ItemAttachment<Weapon> DeagleTop;
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

    public static ItemBullet ShotgunShell;
    public static ItemBullet Magnum44Ammo;
    public static ItemBullet Bullet762x39;
    public static ItemBullet Bullet556x39;
    public static ItemBullet Bullet556x45;
    public static ItemBullet Bullet762x54;
    public static ItemBullet Bullet762x51;
    public static ItemBullet Bullet45ACP;
    public static ItemBullet Bullet9mm;
    public static ItemBullet Bullet357;
    public static ItemBullet BMG50;
    public static ItemBullet Bullet57x28;
    public static ItemBullet Bullet46x30;
    public static ItemBullet Carbine30;
    public static ItemBullet Bullet65x39;
    public static ItemBullet Bullet10x24;
    public static ItemBullet Bullet10mm;
    public static ItemBullet Bullet300Blackout;

    public static Item AK47;
    public static Item AKM;
    public static Item AK12;
    public static Item AK74U;
    public static Item AK74M;
    public static Item M4A1;
    public static Item M4A4;
    public static Item M27;
    public static Item AR15;
    public static Item M16A3;
    public static Item M16A4;
    public static Item FNFAL;
    public static Item Scar;
    public static Item ScarH;
    public static Item G18;
    public static Item G21;
    public static Item M9;
    public static Item B92A1;
    public static Item USP45;
    public static Item XEagle;
    public static Item P2000;
    public static Item Magnum;
    public static Item PX90;
    public static Item G36;
    public static Item G36C;
    public static Item AUG;
    public static Item Famas;
    public static Item FamasG2;
    public static Item MP5;
    public static Item MP5K;
    public static Item MP7;
    public static Item AS50;
    public static Item M14;
    public static Item M110;
    public static Item XWP;
    public static Item Dragonuv;
    public static Item M107;
    // public static Item GrenadeLauncher;
    public static Item Remington870;
    public static Item KSG12;
    public static Item M1014;
    public static Item SPAS12;
    // public static Item SPAS15;
    public static Item M240;
    public static Item M249;
    public static Item RPK74M;
    public static Item MG36;
    public static Item ACR;
    public static Item HK416C;
    public static Item M1Carbine;
    public static Item MP40;
    public static Item AN94;
    public static Item M1911;
    public static Item AUGA3;
    public static Item AKMN;
    public static Item AK74;
    public static Item AKS;
    public static Item MX;
    public static Item AK74N;
    public static Item M4A42;
    public static Item AKMS;
    public static Item M9SD;
    public static Item L96;
    public static Item AWP;
    public static Item SV98;
    public static Item L115A3;
    public static Item AWM;
    public static Item MosinNagant;
    public static Item M82;
    public static Item M21;
    public static Item HK33;
    public static Item M93R;
    public static Item Python;
    public static Item AK101;
    public static Item AK107;
    public static Item MakarovPM;
    public static Item MakarovPMM;
    public static Item G36A3;
    public static Item G36K;
    public static Item G36V;
    public static Item G36KV;
    public static Item MG36E;
    public static Item HK33K;
    public static Item AK103;
    public static Item AK104;
    public static Item AK106;
    public static Item M4A2;
    public static Item KrissVector;
    public static Item KrissVectorTactical;
    public static Item P225;
    public static Item P220;
    public static Item P226;
    public static Item Glock19;
    public static Item P30;
    public static Item MP5A5;
    public static Item MP5SD;
    public static Item FNP90;
    public static Item MAC10;
    public static Item MAC11;
    public static Item MP5N;
    public static Item G3;
    public static Item AK12U;
    public static Item QBS09;
    public static Item M4Benelli;
    public static Item PP19;
    public static Item Glock32;
    public static Item SR25;
    public static Item Minimi;
    public static Item ACR2;
    public static Item Glock18;
    // public static Item SMAW;
    // public static Item GaussRifle;
    // public static Item RPG;
    
	private static Item GrenadeLauncher;

    // Fun guns :)
    public static Item M41A;
    public static Item Pistol10mm;

    public static ItemMagazine Magazine762x39;
    public static ItemMagazine PMAG762x39;
    public static ItemMagazine AK12Mag;
    public static ItemMagazine RPK74MMag;
    public static ItemMagazine AK74MMag;
    public static ItemMagazine AK74Mag;
    public static ItemMagazine AKS74UMag;
    public static ItemMagazine NATOMag1;
    public static ItemMagazine NATO20rnd;
    public static ItemMagazine NATO40rnd;
    public static ItemMagazine NATOMag2;
    public static ItemMagazine NATOFamasMag;
    public static ItemMagazine NATOG36Mag;
    public static ItemMagazine DragunovMag;
    public static ItemMagazine FALMag;
    public static ItemMagazine M110Mag;
    public static ItemMagazine M14DMRMag;
    public static ItemMagazine Glock21Mag;
    public static ItemMagazine Glock18Mag;
    public static ItemMagazine G18Mag;
    public static ItemMagazine NATODrum100;
    public static ItemMagazine M9BerettaMag;
    public static ItemMagazine MP40Mag;
    public static ItemMagazine MP5KMag;
    public static ItemMagazine DeagleMag;
    public static ItemMagazine AS50Mag;
    public static ItemMagazine FNP90Mag;
    public static ItemMagazine M107BMag;
    public static ItemMagazine HKMP7Mag;
    public static ItemMagazine M1CarbineMag;
    public static ItemMagazine M240Mag;
    public static ItemMagazine L115Mag;
    public static ItemMagazine ColtM1911Mag;
    public static ItemMagazine M249Mag;
    public static ItemMagazine MXMag;
    public static ItemMagazine M41AMag;
    public static ItemMagazine HK33Mag;
    public static ItemMagazine Mag10mm;
    public static ItemMagazine Magazine9mm;
    public static ItemMagazine ScarHMag;
    public static ItemMagazine AK101Mag;
    public static ItemMagazine VectorMag;
    public static ItemMagazine G3Mag;
    public static ItemMagazine PP19Mag;
    public static ItemMagazine Glock32Mag;

    public static ItemSkin ElectricSkin;
    public static ItemSkin Voltaic;
    public static ItemSkin LightningStrike;
    public static ItemSkin Asiimov;
    public static ItemSkin Fade;
    public static ItemSkin Vulcan;

    public static Item Bullets;
    public static Item Electronics;
    public static Item CGrip;
    public static Item OpticGlass;
    public static Item Cloth;
    public static Item TanCloth;
    public static Item GreenCloth;
    public static Item Inductor;
    public static Item Transistor;
    public static Item Resistor;
    public static Item Diode;
    public static Item Capacitor;
    public static Item CopperWiring;
    public static Item Piston;
    public static Item LaserPointer;

    public static Block TitaniumOre;
    public static Item TitaniumIngot;

    public static Block LeadOre;
    public static Item LeadIngot;

    public static Block CopperOre;
    public static Item CopperIngot;

    public static Block TinOre;
    public static Item TinIngot;

    public static Block SulfurOre;
    public static Item SulfurDust;

    public static Block BauxiteOre;
    public static Item AluminumIngot;
    public static Item AluminumPlate;

    public static Block SiliconOre;
    public static Item Silicon;

    public static Block TantalumOre;
    public static Item TantalumIngot;

    public static Block RubyOre;
    public static Item Ruby;

    public static Item SteelDust;
    public static Item SteelIngot;
    public static Item SteelPlate;
    public static Item MiniSteelPlate;

    public static Item WeaponStock;
    public static Item RetractableStock;
    public static Item SecondaryStock;
    public static Item WoodWeaponStock;
    public static Item WoodRifleStock;

    public static Item WeaponReceiver;
    public static Item SMGReceiver;
    public static Item UnderReceiver;
    public static Item RifleReceiver;
    public static Item PistolUnderReceiver;
    public static Item P90Receiver;

    public static Item RevolverAction;
    public static Item RevolverGrip;
    public static Item RevolverReceiver;

    public static Item ShotgunReceiver;
    public static Item ShotgunGrip;

    public static Item ScarReceiver;

    public static Item DeagleReceiver;

    public static Item LMGReceiver;

    public static Item Barrel;
    public static Item Plastic;
    
    public static ItemAmmo Grenades;

    static ArmorMaterial Marine = compatibility.addArmorMaterial("Marine", "Marine", 40, new int[] { 3, 5, 4, 3 }, 15,
            null, 0); // TODO: last
                      // argument,
                      // how does
                      // it work?
    static ArmorMaterial Tactical = compatibility.addArmorMaterial("Tactical", "Tactical", 40,
            new int[] { 2, 4, 3, 2 }, 15, null, 0); // TODO:

                                                    // last
                                                    // argument,
                                                    // how does
                                                    // it work?
	

    // private ClientEventHandler clientEventHandler = new ClientEventHandler();

    public ModelBiped getArmorModel(int id) {
        return null;
    }

    protected boolean isClient() {
        return false;
    }

    public void init(Object mod, CompatibleFmlInitializationEvent event) {

        ModernWarfareMod.MOD_CONTEXT.init(mod, ModernWarfareMod.MODID, new CompatibleChannel(ModernWarfareMod.CHANNEL));

        ModernWarfareMod.MOD_CONTEXT.setChangeZoomSound("OpticZoom");

        ModernWarfareMod.MOD_CONTEXT.setChangeFireModeSound("GunFireModeSwitch");
        
        ModernWarfareMod.MOD_CONTEXT.setNoAmmoSound("dryfire");

        Grenades = new ItemGrenades();
        
        Bullets = new ItemBullets();
        Electronics = new ItemElectronics();
        CGrip = new ItemCGrip();
        OpticGlass = new ItemOpticGlass();
        Cloth = new ItemCloth();
        TanCloth = new ItemTanCloth();
        GreenCloth = new ItemGreenCloth();

        TitaniumOre = new BlockTitaniumOre();
        TitaniumIngot = new ItemTitaniumIngot();

        LeadOre = new BlockLeadOre();
        LeadIngot = new ItemLeadIngot();

        CopperOre = new BlockCopperOre();
        CopperIngot = new ItemCopperIngot();

        TinOre = new BlockTinOre();
        TinIngot = new ItemTinIngot();

        SulfurOre = new BlockSulfurOre();
        SulfurDust = new ItemSulfurDust();

        BauxiteOre = new BlockBauxiteOre();
        AluminumIngot = new ItemAluminumIngot();
        AluminumPlate = new ItemAluminumPlate();

        RubyOre = new BlockRubyOre();
        Ruby = new ItemRuby();

        SiliconOre = new BlockSiliconOre();
        Silicon = new ItemSilicon();

        TantalumOre = new BlockTantalumOre();
        TantalumIngot = new ItemTantalumIngot();

        SteelDust = new ItemSteelDust();
        SteelIngot = new ItemSteelIngot();
        SteelPlate = new ItemSteelPlate();

        MiniSteelPlate = new ItemMiniSteelPlate();

        ElectricSkin = new ItemSkin.Builder().withTextureVariant("Electric").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Electric")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        Voltaic = new ItemSkin.Builder().withTextureVariant("Famas2Voltaic").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Voltaic")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        LightningStrike = new ItemSkin.Builder().withTextureVariant("AWPLightningStrike")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withName("LightningStrike").build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        Asiimov = new ItemSkin.Builder().withTextureVariant("M4A4Asiimov").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Asiimov")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        Fade = new ItemSkin.Builder().withTextureVariant("G18Fade").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Fade")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        Vulcan = new ItemSkin.Builder().withTextureVariant("AK47Vulcan").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Vulcan")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        ShotgunShell = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("ShotgunShell")
                .withModel(new com.vicmatskiv.mw.models.ShotgunShell(), "ShotgunShell.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet10x24 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.FunGunsTab).withName("Bullet10x24")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Magnum44Ammo = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Magnum44Ammo")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Carbine30 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Carbine30")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.6F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.5F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.8F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet357 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet357")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.6F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.5F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.8F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet9mm = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet9mm")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet10mm = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.FunGunsTab).withName("Bullet10mm")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet45ACP = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet45ACP")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet762x39 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet762x39")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.6F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet46x30 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet46x30")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.6F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet57x28 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet57x28")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.6F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet556x39 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet556x39")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.3F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.3F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet556x45 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet556x45")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet762x54 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet762x54")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.5F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.6F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.5F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet762x51 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet762x51")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.45F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.55F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.45F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet300Blackout = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet300Blackout")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.45F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.55F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.45F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        BMG50 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withName("BMG50").withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.7F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.7F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.8F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet65x39 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.gunsTab).withName("Bullet65x39")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.45F, 1.45F, 1.45f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Magazine762x39 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet762x39)
                .withName("Magazine762x39").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Magazine762x39(), "GunmetalTexture.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.7F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.2F, 0.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        G3Mag = new ItemMagazine.Builder().withAmmo(21).withCompatibleBullet(Bullet762x51).withName("G3Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.G3Mag(), "AK12.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.6F, 1.2F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -1.5F, 1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 1F, -1.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        AK101Mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullet556x45).withName("AK101Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AK12Mag(), "GunmetalTexture.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.7F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.2F, 0.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        PMAG762x39 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet762x39).withName("PMAG762x39")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.PMAG762x39(), "GunmetalTexture.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.7F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.2F, 0.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        AK12Mag = new ItemMagazine.Builder().withAmmo(31).withCompatibleBullet(Bullet556x39).withName("AK12Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AK12Magazine(), "GunmetalTexture.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.6F, 1F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -1.3F, 1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.6F, 0.55F, -1.2F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        RPK74MMag = new ItemMagazine.Builder().withAmmo(40).withCompatibleBullet(Bullet762x39).withName("RPK74MMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.RPK74MMag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.7F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.85F, -0.35F, 0.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        AK74MMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet556x39).withName("AK74MMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AK12Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.7F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.6F, -0.2F, 0.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        AK74Mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullet556x39).withName("AK74Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AK12Mag(), "AKS74UMag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.7F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.6F, -0.2F, 0.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        AKS74UMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet556x39).withName("AKS74UMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Magazine762x39(), "AKS74UMag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.7F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.2F, 0.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        NATOMag1 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet556x45).withName("NATOMag1")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.NATOMag1(), "NATOMag1.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 0F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        NATO20rnd = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullet556x45).withName("NATO20rnd")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.NATO20rnd(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 0F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        NATO40rnd = new ItemMagazine.Builder().withAmmo(40).withCompatibleBullet(Bullet556x45).withName("NATO40rnd")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.NATO40rnd(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, -0.1F, 0.2F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        NATOMag2 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet556x45).withName("NATOMag2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.NATOMag2(), "NATOMag2.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 0F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        NATOFamasMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet556x45)
                .withName("NATOFamasMag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.NATOFamasMag(), "NATOMag1.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.1F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        NATOG36Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet556x45).withName("NATOG36Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.NATOG36Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.2F, 0.2F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        DragunovMag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullet762x54)
                .withName("DragunovMag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.DragunovMag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.4F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        FALMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullet762x51).withName("FALMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.FNFALMag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.2F, 0.2F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        M110Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullet762x51).withName("M110Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M110Mag(), "NATOMag1.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.25F, 0.1F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        M14DMRMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullet762x51).withName("M14DMRMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M14Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 0.3F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Glock21Mag = new ItemMagazine.Builder().withAmmo(13).withCompatibleBullet(Bullet45ACP).withName("Glock21Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.6F, -0.3F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Glock18Mag = new ItemMagazine.Builder().withAmmo(17).withCompatibleBullet(Bullet9mm).withName("Glock18Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.6F, -0.3F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        G18Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullet9mm).withName("G18Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.G18Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.6F, -0.65F, 0.45F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Glock32Mag = new ItemMagazine.Builder().withAmmo(14).withCompatibleBullet(Bullet357).withName("Glock32Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.6F, -0.3F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        M9BerettaMag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullet9mm).withName("M9BerettaMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M9Mag(), "M9Mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.5F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Mag10mm = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullet10mm).withName("Mag10mm")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.FunGunsTab)
                .withModel(new com.vicmatskiv.mw.models.M9Mag(), "AK12.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.5F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazine9mm = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullet10mm).withName("Magazine9mm")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MakarovMag(), "MakarovMag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.5F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        NATODrum100 = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullet556x45)
                .withName("NATODrum100").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.NATODrum100(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.5F, 0.4F, 0.4F);
                    GL11.glRotatef(-30F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        MP40Mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullet9mm).withName("MP40Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP40Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -1.3F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.2F, 0F, -1.3F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        VectorMag = new ItemMagazine.Builder().withAmmo(26).withCompatibleBullet(Bullet45ACP).withName("VectorMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP40Mag(), "AK12.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -1.3F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.2F, 0F, -1.3F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        MP5KMag = new ItemMagazine.Builder().withAmmo(25).withCompatibleBullet(Bullet9mm).withName("MP5KMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.HKMP5Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 1F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -1.6F, 1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 0.95F, -1.6F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        DeagleMag = new ItemMagazine.Builder().withAmmo(9).withCompatibleBullet(Bullet357).withName("DeagleMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.DeagleMag(), "Deagle.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.5F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        AS50Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(BMG50).withName("AS50Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AS50Mag(), "NATOMag1.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.9F, 0.2F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        FNP90Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullet57x28).withName("FNP90Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.P90Mag(), "P90Mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, 0.4F);
                    GL11.glRotatef(-170F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        M107BMag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(BMG50).withName("M107BMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M107Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.1F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        HKMP7Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullet46x30).withName("HKMP7Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MP7Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(1F, -0F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        M1CarbineMag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Carbine30).withName("M1CarbineMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M14Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 0.3F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        M240Mag = new ItemMagazine.Builder().withAmmo(200).withCompatibleBullet(Bullet762x51).withName("M240Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M240Mag(), "M240Mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.2F, 0.3F, 0.4F);
                    GL11.glRotatef(-180F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        L115Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(BMG50).withName("LP115Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.L115Mag(), "AK12.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.5F, 0.6F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.9F, 0.9F, 0.9F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1.2F, -0.5F, 0.9F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-1F, 0.3F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        ColtM1911Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullet45ACP)
                .withName("ColtM1911Mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "AK12.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.6F, -0.3F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        M249Mag = new ItemMagazine.Builder().withAmmo(200).withCompatibleBullet(Bullet556x45).withName("M249Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.M240Mag(), "M240Mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.2F, 0.3F, 0.4F);
                    GL11.glRotatef(-180F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        MXMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet65x39).withName("MXMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.MXMag(), "MXMag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 0F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        M41AMag = new ItemMagazine.Builder().withAmmo(99).withCompatibleBullet(Bullet65x39).withName("M41AMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.FunGunsTab)
                .withModel(new com.vicmatskiv.mw.models.M41AMag(), "M41AMag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.1F, -1F, 0.2F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.2F, 0.6F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, -0.6F, 0.8F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1.3F, 1.3F, 1.3f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        HK33Mag = new ItemMagazine.Builder().withAmmo(31).withCompatibleBullet(Bullet556x45).withName("HK33Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.HK33Mag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.6F, 1.2F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -1.5F, 1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 1F, -1.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        ScarHMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullet300Blackout).withName("ScarHMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.ScarHMag(), "GunmetalTexture.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 0.2F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        PP19Mag = new ItemMagazine.Builder().withAmmo(65).withCompatibleBullet(Bullet9mm).withName("PP19Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.PPBizonMag(), "AK12.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -1.2F);
                    GL11.glRotatef(-170F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        AKMIron = new ItemAKMIron();
        AR15Iron = new ItemAR15Iron();
        // Extra = new ItemExtra();

        Extra = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new AKMiron1(), "GunmetalTexture.png").withModel(new AKMiron2(), "GunmetalTexture.png")
                .withModel(new AK47iron(), "GunmetalTexture.png").withModel(new M4Iron1(), "GunmetalTexture.png")
                .withModel(new M4Iron2(), "GunmetalTexture.png").withModel(new P90iron(), "GunmetalTexture.png")
                .withModel(new G36CIron1(), "GunmetalTexture.png").withModel(new G36CIron2(), "GunmetalTexture.png")
                .withModel(new ScarIron1(), "GunmetalTexture.png").withModel(new ScarIron2(), "GunmetalTexture.png")
                .withModel(new FALIron(), "GunmetalTexture.png").withModel(new M14Iron(), "GunmetalTexture.png")
                .withModel(new MP5Iron(), "AK12.png").withName("Extra").withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        M14Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.vicmatskiv.mw.models.M14Rail(), "GunmetalTexture.png").withName("M14Rail")
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        AK12IronSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AK12IronSight(), "GunmetalTexture.png")
                .withName("AK12IronSight").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

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

        DeagleTop = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.DeagleTop(), "Deagle.png").withName("DeagleTop")
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

        MP5KGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Grip2(), "GunmetalTexture.png").withName("MP5KGrip")
                .withRenderablePart().withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Reflex = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Reflex(), "Reflex.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
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
                }).withName("Reflex").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        ACOG = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.12f, 0.37f, 0.45f);
                })

                .withCreativeTab(ModernWarfareMod.gunsTab).withModel(new com.vicmatskiv.mw.models.ACOG(), "Acog.png")
                .withModel(new com.vicmatskiv.mw.models.Acog2(), "Acog2.png")

                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Acog").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Holo2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Holographic(), "Holographic.png")
                .withModel(new com.vicmatskiv.mw.models.Holo2(), "Holo3.png")
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
                        GL11.glTranslatef(-0.6F, -0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
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
                }).withName("Holographic").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
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

        Holographic2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Holographic2(), "Holographic2.png")
                .withModel(new com.vicmatskiv.mw.models.Holo2(), "Holo3.png")
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
                        GL11.glTranslatef(-0.6F, -0.1F, 0.5F);
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
                }).withName("Holographic2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Kobra = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.gunsTab).withModel(new com.vicmatskiv.mw.models.Kobra(), "Kobra.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
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
                }).withName("Kobra").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.06f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.1f, 1.1f, 1.1f);
                    GL11.glTranslatef(0.1f, 0.4f, 0.6f);
                }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.gunsTab).withCrosshair("LP")
                .withModel(new com.vicmatskiv.mw.models.LP(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.LPscope(), "HP2.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LP) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LP) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LP) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("LPScope")

                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        HP = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.04f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.65f, 1.65f, 1.65f);
                    GL11.glTranslatef(0.0285f, 0.492f, 0.7f);
                }).withCreativeTab(ModernWarfareMod.gunsTab).withCrosshair("HP")
                .withModel(new com.vicmatskiv.mw.models.HP(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.LPscope(), "HP2.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("HPScope").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer556x45 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x45(), "AK12.png")
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
                }).withName("Silencer556x45").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer9mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
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
                }).withName("Silencer9mm").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SilencerMP7 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "AK12.png")
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
                .withCreativeTab(ModernWarfareMod.gunsTab)
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
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "AK12.png")
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

        Silencer45ACP = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor45ACP(), "AK12.png")
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

        Silencer12Gauge = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
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

        Silencer762x54 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "AK12.png")
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
                }).withName("Silencer762x54").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x51 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor762x51(), "AK12.png")
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
                }).withName("Silencer762x51").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer50BMG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
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
                }).withName("Silencer50BMG").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor762x39(), "AK12.png")
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
                }).withName("Silencer762x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer556x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x39(), "AK12.png")
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
                }).withName("Silencer556x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer300AACBlackout = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor300AACBlackout(), "AK12.png")
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
                }).withName("Silencer300AACBlackout").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer65x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x39(), "AK12.png")
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
                }).withName("Silencer65x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Laser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.gunsTab).withModel(new com.vicmatskiv.mw.models.Laser(), "AK12.png")
                .withPostRender(new LaserBeamRenderer()).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
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
                }).withName("Laser").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Laser2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.gunsTab).withModel(new com.vicmatskiv.mw.models.Laser2(), "AK12.png")
                .withPostRender(new LaserBeamRenderer()).withFirstPersonModelPositioning((model, itemStack) -> {
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
                }).withName("Laser2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Grip2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.gunsTab).withModel(new com.vicmatskiv.mw.models.Grip2(), "AK12.png")
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
                }).withName("Grip2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.AngledGrip(), "AK12.png").withApply((a, weapon, player) -> {
                    weapon.changeRecoil(player, 1.5F);
                }).withRemove((attachment, weapon, player) -> {
                    weapon.changeRecoil(player, 1);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
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
                }).withName("AngledGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        StubbyGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.vicmatskiv.mw.models.StubbyGrip(), "AK12.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withRemove((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil());
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
                }).withName("StubbyGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        VGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.gunsTab).withModel(new com.vicmatskiv.mw.models.VGrip(), "AK12.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
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
                }).withName("VGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Bipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.gunsTab).withModel(new com.vicmatskiv.mw.models.Bipod(), "AK12.png")
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
                }).withName("Bipod").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        WeaponStock = new ItemWeaponStock();
        RetractableStock = new ItemRetractableStock();
        SecondaryStock = new ItemSecondaryStock();
        WoodWeaponStock = new ItemWoodWeaponStock();
        WoodRifleStock = new ItemWoodRifleStock();

        WeaponReceiver = new ItemWeaponReceiver();
        SMGReceiver = new ItemSMGReceiver();
        UnderReceiver = new ItemUnderReceiver();
        RifleReceiver = new ItemRifleReceiver();
        PistolUnderReceiver = new ItemPistolUnderReceiver();
        P90Receiver = new ItemP90Receiver();

        RevolverAction = new ItemRevolverAction();
        RevolverGrip = new ItemRevolverGrip();
        RevolverReceiver = new ItemRevolverReceiver();

        ShotgunReceiver = new ItemShotgunReceiver();
        ShotgunGrip = new ItemShotgunGrip();

        ScarReceiver = new ItemScarReceiver();

        DeagleReceiver = new ItemDeagleReceiver();

        LMGReceiver = new ItemLMGReceiver();

        Inductor = new ItemInductor();
        Resistor = new ItemResistor();
        Transistor = new ItemTransistor();
        Diode = new ItemDiode();
        Capacitor = new ItemCapacitor();
        CopperWiring = new ItemCopperWiring();
        Piston = new ItemPiston();
        LaserPointer = new ItemLaserPointer();

        Barrel = new ItemBarrel();
        Plastic = new ItemPlastic();

        compatibility.registerItem(ModernWarfareMod.MODID, Grenades, "Grenades");
        
        compatibility.registerItem(ModernWarfareMod.MODID, Bipod, "Bipod");

        compatibility.registerItem(ModernWarfareMod.MODID, AKMIron, "AKMIron");
        compatibility.registerItem(ModernWarfareMod.MODID, AR15Iron, "AR15Iron");
        // compatibility.registerItem(ModernWarfareMod.MODID, Extra, "Extra");

        compatibility.registerItem(ModernWarfareMod.MODID, Bullets, "Bullets");
        compatibility.registerItem(ModernWarfareMod.MODID, Electronics, "Electronics");
        compatibility.registerItem(ModernWarfareMod.MODID, CGrip, "CGrip");
        compatibility.registerItem(ModernWarfareMod.MODID, OpticGlass, "OpticGlass");
        compatibility.registerItem(ModernWarfareMod.MODID, Cloth, "Cloth");
        compatibility.registerItem(ModernWarfareMod.MODID, TanCloth, "TanCloth");
        compatibility.registerItem(ModernWarfareMod.MODID, GreenCloth, "GreenCloth");

        compatibility.registerBlock(ModernWarfareMod.MODID, TitaniumOre, "TitaniumOre");
        compatibility.registerItem(ModernWarfareMod.MODID, TitaniumIngot, "TitaniumIngot");

        compatibility.registerBlock(ModernWarfareMod.MODID, LeadOre, "LeadOre");
        compatibility.registerItem(ModernWarfareMod.MODID, LeadIngot, "LeadIngot");

        compatibility.registerBlock(ModernWarfareMod.MODID, CopperOre, "CopperOre");
        compatibility.registerItem(ModernWarfareMod.MODID, CopperIngot, "CopperIngot");

        compatibility.registerBlock(ModernWarfareMod.MODID, TinOre, "TinOre");
        compatibility.registerItem(ModernWarfareMod.MODID, TinIngot, "TinIngot");

        compatibility.registerBlock(ModernWarfareMod.MODID, SulfurOre, "SulfurOre");
        compatibility.registerItem(ModernWarfareMod.MODID, SulfurDust, "SulfurDust");

        compatibility.registerBlock(ModernWarfareMod.MODID, BauxiteOre, "BauxiteOre");
        compatibility.registerItem(ModernWarfareMod.MODID, AluminumIngot, "AluminumIngot");
        compatibility.registerItem(ModernWarfareMod.MODID, AluminumPlate, "AluminumPlate");

        compatibility.registerBlock(ModernWarfareMod.MODID, SiliconOre, "SiliconOre");
        compatibility.registerItem(ModernWarfareMod.MODID, Silicon, "Silicon");

        compatibility.registerBlock(ModernWarfareMod.MODID, TantalumOre, "TantalumOre");
        compatibility.registerItem(ModernWarfareMod.MODID, TantalumIngot, "TantalumIngot");

        compatibility.registerBlock(ModernWarfareMod.MODID, RubyOre, "RubyOre");
        compatibility.registerItem(ModernWarfareMod.MODID, Ruby, "Ruby");

        compatibility.registerItem(ModernWarfareMod.MODID, SteelDust, "SteelDust");
        compatibility.registerItem(ModernWarfareMod.MODID, SteelIngot, "SteelIngot");
        compatibility.registerItem(ModernWarfareMod.MODID, SteelPlate, "SteelPlate");
        compatibility.registerItem(ModernWarfareMod.MODID, MiniSteelPlate, "MiniSteelPlate");

        compatibility.registerItem(ModernWarfareMod.MODID, WeaponStock, "WeaponStock");
        compatibility.registerItem(ModernWarfareMod.MODID, RetractableStock, "RetractableStock");
        compatibility.registerItem(ModernWarfareMod.MODID, SecondaryStock, "SecondaryStock");
        compatibility.registerItem(ModernWarfareMod.MODID, WoodWeaponStock, "WoodWeaponStock");
        compatibility.registerItem(ModernWarfareMod.MODID, WoodRifleStock, "WoodRifleStock");

        compatibility.registerItem(ModernWarfareMod.MODID, WeaponReceiver, "WeaponReceiver");
        compatibility.registerItem(ModernWarfareMod.MODID, SMGReceiver, "SMGReceiver");
        compatibility.registerItem(ModernWarfareMod.MODID, UnderReceiver, "UnderReceiver");
        compatibility.registerItem(ModernWarfareMod.MODID, RifleReceiver, "RifleReceiver");
        compatibility.registerItem(ModernWarfareMod.MODID, PistolUnderReceiver, "PistolUnderReceiver");
        compatibility.registerItem(ModernWarfareMod.MODID, P90Receiver, "P90Receiver");

        compatibility.registerItem(ModernWarfareMod.MODID, RevolverAction, "RevolverAction");
        compatibility.registerItem(ModernWarfareMod.MODID, RevolverGrip, "RevolverGrip");
        compatibility.registerItem(ModernWarfareMod.MODID, RevolverReceiver, "RevolverReceiver");

        compatibility.registerItem(ModernWarfareMod.MODID, ShotgunReceiver, "ShotgunReceiver");
        compatibility.registerItem(ModernWarfareMod.MODID, ShotgunGrip, "ShotgunGrip");

        compatibility.registerItem(ModernWarfareMod.MODID, ScarReceiver, "ScarReceiver");

        compatibility.registerItem(ModernWarfareMod.MODID, DeagleReceiver, "DeagleReceiver");

        compatibility.registerItem(ModernWarfareMod.MODID, LMGReceiver, "LMGReceiver");

        compatibility.registerItem(ModernWarfareMod.MODID, Transistor, "Transistor");
        compatibility.registerItem(ModernWarfareMod.MODID, Resistor, "Resistor");
        compatibility.registerItem(ModernWarfareMod.MODID, Inductor, "Inductor");
        compatibility.registerItem(ModernWarfareMod.MODID, Diode, "Diode");
        compatibility.registerItem(ModernWarfareMod.MODID, Capacitor, "Capacitor");
        compatibility.registerItem(ModernWarfareMod.MODID, CopperWiring, "CopperWiring");
        compatibility.registerItem(ModernWarfareMod.MODID, Piston, "Piston");
        compatibility.registerItem(ModernWarfareMod.MODID, LaserPointer, "LaserPointer");

        compatibility.registerItem(ModernWarfareMod.MODID, Barrel, "Barrel");
        compatibility.registerItem(ModernWarfareMod.MODID, Plastic, "plastic");

        OreDictionary.registerOre("ingotTitanium", TitaniumIngot);
        OreDictionary.registerOre("ingotLead", LeadIngot);
        OreDictionary.registerOre("ingotCopper", CopperIngot);
        OreDictionary.registerOre("ingotTin", TinIngot);
        OreDictionary.registerOre("ingotSulfurDust", SulfurDust);
        OreDictionary.registerOre("ingotAluminum", AluminumIngot);
        OreDictionary.registerOre("Ruby", Ruby);
        OreDictionary.registerOre("ingotSteel", SteelIngot);

        compatibility.registerWorldGenerator(new WorldGeneratorEventHandler(ModernWarfareMod.oreGenerationEnabled), 0);

        Builder marineArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Marine)
                .withUnlocalizedName("Marine").withTextureName("Marine")
                .withModelClass("com.vicmatskiv.mw.models.Marine").withHudTextureName("Marine");

        Marinehelmet = marineArmorBuilder.buildHelmet(isClient());
        Marinechest = marineArmorBuilder.buildChest(isClient());
        Marineboots = marineArmorBuilder.buildBoots(isClient());

        Builder spetznazArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Marine)
                .withUnlocalizedName("Spetznaz").withTextureName("Spetznaz")
                .withModelClass("com.vicmatskiv.mw.models.Marine").withHudTextureName("Marine");

        Spetznazhelmet = spetznazArmorBuilder.buildHelmet(isClient());
        Spetznazchest = spetznazArmorBuilder.buildChest(isClient());
        Spetznazboots = spetznazArmorBuilder.buildBoots(isClient());

        Builder swatArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Marine)
                .withUnlocalizedName("Swat").withTextureName("Swat").withModelClass("com.vicmatskiv.mw.models.Swat")
                .withHudTextureName("Marine");

        Swathelmet = swatArmorBuilder.buildHelmet(isClient());
        Swatchest = swatArmorBuilder.buildChest(isClient());
        Swatboots = swatArmorBuilder.buildBoots(isClient());

        // Builder gasswatArmorBuilder = new CustomArmor.Builder()
        // .withModId(ModernWarfareMod.MODID).withMaterial(Marine)
        // .withUnlocalizedName("GasSwat").withTextureName("GasSwat")
        // .withModelClass("com.vicmatskiv.mw.models.GasSwat")
        // .withHudTextureName("Marine");

        // GasSwathelmet = gasswatArmorBuilder.buildHelmet(isClient());
        // GasSwatchest = gasswatArmorBuilder.buildChest(isClient());
        // GasSwatboots = gasswatArmorBuilder.buildBoots(isClient());

        new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Tactical)
                .withUnlocalizedName("Tactical").withTextureName("Tactical")
                .withModelClass("com.vicmatskiv.mw.models.Tactical").withHudTextureName("Tactical").build(isClient());

        // Try not to change the order of the guns to ensure stable recipes

        AK47 = new AK47Factory().createGun(this);
        AKS = new AKSFactory().createGun(this);
        AKM = new AKMFactory().createGun(this);
        AKMN = new AKMNFactory().createGun(this);
        AKMS = new AKMSFactory().createGun(this);
        AK12 = new AK12Factory().createGun(this);
        AK12U = new AK12UFactory().createGun(this);
        AN94 = new AN94Factory().createGun(this);
        AK74U = new AK74UFactory().createGun(this);
        AK74 = new AK74Factory().createGun(this);
        AK74M = new AK74MFactory().createGun(this);
        AK74N = new AK74NFactory().createGun(this);
        AK101 = new AK101Factory().createGun(this);
        AK103 = new AK103Factory().createGun(this);
        AK104 = new AK104Factory().createGun(this);
        AK106 = new AK106Factory().createGun(this);
        AK107 = new AK107Factory().createGun(this);
        AR15 = new AR15Factory().createGun(this);
        M4A1 = new M4A1Factory().createGun(this);
        M4A2 = new M4A2Factory().createGun(this);
        M4A42 = new M4A42Factory().createGun(this);
        M27 = new M27Factory().createGun(this);
        M4A4 = new M4A4Factory().createGun(this);
        M16A3 = new M16A3Factory().createGun(this);
        M16A4 = new M16A4Factory().createGun(this);
        HK416C = new HK416CFactory().createGun(this);
        ACR2 = new ACR2Factory().createGun(this);
        ACR = new ACRFactory().createGun(this);
        Scar = new ScarFactory().createGun(this);
        ScarH = new ScarHFactory().createGun(this);
        MX = new MXFactory().createGun(this);
        FNFAL = new FNFALFactory().createGun(this);
        M1Carbine = new M1CarbineFactory().createGun(this);
        G18 = new G18Factory().createGun(this);
        Glock18 = new Glock18Factory().createGun(this);
        Glock19 = new Glock19Factory().createGun(this);
        G21 = new G21Factory().createGun(this);
        Glock32 = new Glock32Factory().createGun(this);
        M9 = new M9Factory().createGun(this);
        B92A1 = new B92A1Factory().createGun(this);
        M93R = new M93RFactory().createGun(this);
        M9SD = new M9SDFactory().createGun(this);
        USP45 = new USP45Factory().createGun(this);
        XEagle = new XEagleFactory().createGun(this);
        P2000 = new P2000Factory().createGun(this);
        P30 = new P30Factory().createGun(this);
        P220 = new P220Factory().createGun(this);
        P225 = new P225Factory().createGun(this);
        P226 = new P226Factory().createGun(this);
        Magnum = new MagnumFactory().createGun(this);
        Python = new PythonFactory().createGun(this);
        M1911 = new M1911Factory().createGun(this);
        MakarovPM = new MakarovPMFactory().createGun(this);
        MakarovPMM = new MakarovPMMFactory().createGun(this);
        Remington870 = new Remington900Factory().createGun(this);
        KSG12 = new KSG12Factory().createGun(this);
        M1014 = new M1014Factory().createGun(this);
        M4Benelli = new M4BenelliFactory().createGun(this);
        SPAS12 = new SPAS12Factory().createGun(this);
        QBS09 = new QBS09Factory().createGun(this);
        // SPAS15 = new SPAS15Factory().createGun(this);
        G36 = new G36Factory().createGun(this);
        G36A3 = new G36A3Factory().createGun(this);
        G36C = new G36CFactory().createGun(this);
        G36K = new G36KFactory().createGun(this);
        G36V = new G36VFactory().createGun(this);
        G36KV = new G36KVFactory().createGun(this);
        AUG = new AUGFactory().createGun(this);
        AUGA3 = new AUGA3Factory().createGun(this);
        Famas = new FamasFactory().createGun(this);
        FamasG2 = new FamasG2Factory().createGun(this);
        HK33 = new HK33Factory().createGun(this);
        HK33K = new HK33KFactory().createGun(this);
        MP5 = new MP5Factory().createGun(this);
        MP5A5 = new MP5A5Factory().createGun(this);
        MP5N = new MP5NFactory().createGun(this);
        MP5SD = new MP5SDFactory().createGun(this);
        MP5K = new MP5KFactory().createGun(this);
        PP19 = new PP19Factory().createGun(this);
        MP7 = new MP7Factory().createGun(this);
        FNP90 = new FNP90Factory().createGun(this);
        PX90 = new PX90Factory().createGun(this);
        KrissVector = new KrissVectorFactory().createGun(this);
        KrissVectorTactical = new KrissVectorTacticalFactory().createGun(this);
        MAC10 = new MAC10Factory().createGun(this);
        MAC11 = new MAC11Factory().createGun(this);
        MP40 = new MP40Factory().createGun(this);
        AS50 = new AS50Factory().createGun(this);
        XWP = new XWPFactory().createGun(this);
        L115A3 = new L115A3Factory().createGun(this);
        L96 = new L96Factory().createGun(this);
        AWP = new AWPFactory().createGun(this);
        AWM = new AWMFactory().createGun(this);
        SV98 = new SV98Factory().createGun(this);
        MosinNagant = new MosinNagantFactory().createGun(this);
        Dragonuv = new DragonuvFactory().createGun(this);
        M14 = new M14Factory().createGun(this);
        M21 = new M21Factory().createGun(this);
        M110 = new M110Factory().createGun(this);
        SR25 = new SR25Factory().createGun(this);
        G3 = new G3Factory().createGun(this);
        M82 = new M82Factory().createGun(this);
        M107 = new M107Factory().createGun(this);
        M240 = new M240Factory().createGun(this);
        M249 = new M249Factory().createGun(this);
        Minimi = new MinimiFactory().createGun(this);
        MG36 = new MG36Factory().createGun(this);
        MG36E = new MG36EFactory().createGun(this);
        RPK74M = new RPK74MFactory().createGun(this);
        // SMAW = new SMAWFactory().createGun(this);

        // Fun Guns :)
        M41A = new M41AFactory().createGun(this);
        Pistol10mm = new Pistol10mmFactory().createGun(this);

        GrenadeLauncher = new GrenadeLauncherFactory().createGun(this);
        // GaussRifle = new GaussRifleFactory().createGun(this);
        // RPG = new RPGFactory().createGun(this);

    }

}
