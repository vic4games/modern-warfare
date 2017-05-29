package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.blocks.BlockBauxiteOre;
import com.vicmatskiv.mw.blocks.BlockCopperOre;
import com.vicmatskiv.mw.blocks.BlockLeadOre;
import com.vicmatskiv.mw.blocks.BlockRubyOre;
import com.vicmatskiv.mw.blocks.BlockSiliconOre;
import com.vicmatskiv.mw.blocks.BlockSulfurOre;
import com.vicmatskiv.mw.blocks.BlockTantalumOre;
import com.vicmatskiv.mw.blocks.BlockTinOre;
import com.vicmatskiv.mw.blocks.BlockTitaniumOre;
import com.vicmatskiv.mw.items.ItemLaserPointer;
import com.vicmatskiv.mw.items.grenade.FuseGrenadeFactory;
import com.vicmatskiv.mw.items.grenade.ImpactGrenadeFactory;
import com.vicmatskiv.mw.items.grenade.SmokeGrenadeFactory;
import com.vicmatskiv.mw.items.guns.*;
import com.vicmatskiv.mw.items.melee.KarambitFactory;
import com.vicmatskiv.mw.items.melee.TestMeleeFactory;
import com.vicmatskiv.mw.parts.ItemCapacitor;
import com.vicmatskiv.mw.parts.ItemCopperWiring;
import com.vicmatskiv.mw.parts.ItemDiode;
import com.vicmatskiv.mw.parts.ItemInductor;
import com.vicmatskiv.mw.parts.ItemResistor;
import com.vicmatskiv.mw.parts.ItemTransistor;
import com.vicmatskiv.mw.resources.ItemAluminumIngot;
import com.vicmatskiv.mw.resources.ItemAluminumPlate;
import com.vicmatskiv.mw.resources.ItemBigSteelPlate;
import com.vicmatskiv.mw.resources.ItemCloth;
import com.vicmatskiv.mw.resources.ItemCopperIngot;
import com.vicmatskiv.mw.resources.ItemElectronics;
import com.vicmatskiv.mw.resources.ItemGreenCloth;
import com.vicmatskiv.mw.resources.ItemLeadIngot;
import com.vicmatskiv.mw.resources.ItemMetalComponents;
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
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleChannel;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.electronics.ItemTablet;
import com.vicmatskiv.weaponlib.electronics.ItemWirelessCamera;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.melee.MeleeSkin;
import com.vicmatskiv.weaponlib.model.CameraModel;
import com.vicmatskiv.weaponlib.model.TabletModel;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.oredict.OreDictionary;

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

    public static ItemAttachment<ItemGrenade> GrenadeSafetyPin;

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
    public static Item FamasF1;
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
    public static Item AK74;
    public static Item MX;
    public static Item M4A42;
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
    public static Item MakarovPM;
    public static Item MakarovPMM;
    public static Item G36KV;
    public static Item HK33K;
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
    public static Item HecateII;
    public static Item Deagle44;
    public static Item VSSVintorez;
    public static Item ASVal;
    public static Item UMP45;
    public static Item UMP9;
    public static Item TAR21;
//    public static Item KN44;
    public static Item MP9;
    public static Item M8A7;
    public static Item M1Garand;
    public static Item AKMN;
    // public static Item GaussRifle;
    // public static Item RPG;

    public static Item SMAW;

    // Fun guns :)
    public static Item M41A;
    public static Item Pistol10mm;

    public static ItemGrenade FuseGrenade;
    public static ItemGrenade ImpactGrenade;
    public static ItemGrenade SmokeGrenade;

    public static ItemAttachment<Object> Tablet;

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
    public static Item BigSteelPlate;
    public static Item MiniSteelPlate;
    public static Item MetalComponents;

    public static Item Plastic;

    public static MeleeSkin CrimsonBlood;
    public static MeleeSkin Chrome;
    public static MeleeSkin GodWillsIt;
    public static MeleeSkin Murasaki;
    public static MeleeSkin Evangelion;

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

    public void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {

        ModernWarfareMod.MOD_CONTEXT.init(mod, ModernWarfareMod.MODID, configurationManager, new CompatibleChannel(ModernWarfareMod.CHANNEL));

        ModernWarfareMod.MOD_CONTEXT.setChangeZoomSound("OpticZoom");

        ModernWarfareMod.MOD_CONTEXT.setChangeFireModeSound("GunFireModeSwitch");

        ModernWarfareMod.MOD_CONTEXT.setNoAmmoSound("dryfire");

        ModernWarfareMod.MOD_CONTEXT.setExplosionSound("grenadeexplosion");

        Electronics = new ItemElectronics();
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

        Inductor = new ItemInductor();
        Resistor = new ItemResistor();
        Transistor = new ItemTransistor();
        Diode = new ItemDiode();
        Capacitor = new ItemCapacitor();
        CopperWiring = new ItemCopperWiring();
        Piston = new ItemPiston();
        LaserPointer = new ItemLaserPointer();

        Plastic = new ItemPlastic();

        SteelDust = new ItemSteelDust();
        SteelIngot = new ItemSteelIngot();
        SteelPlate = new ItemSteelPlate();
        BigSteelPlate = new ItemBigSteelPlate();
        MiniSteelPlate = new ItemMiniSteelPlate();
        MetalComponents = new ItemMetalComponents();

        compatibility.registerItem(ModernWarfareMod.MODID, Electronics, "Electronics");
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
        compatibility.registerItem(ModernWarfareMod.MODID, BigSteelPlate, "BigSteelPlate");
        compatibility.registerItem(ModernWarfareMod.MODID, MiniSteelPlate, "MiniSteelPlate");
        compatibility.registerItem(ModernWarfareMod.MODID, MetalComponents, "MetalComponents");

        compatibility.registerItem(ModernWarfareMod.MODID, Transistor, "Transistor");
        compatibility.registerItem(ModernWarfareMod.MODID, Resistor, "Resistor");
        compatibility.registerItem(ModernWarfareMod.MODID, Inductor, "Inductor");
        compatibility.registerItem(ModernWarfareMod.MODID, Diode, "Diode");
        compatibility.registerItem(ModernWarfareMod.MODID, Capacitor, "Capacitor");
        compatibility.registerItem(ModernWarfareMod.MODID, CopperWiring, "CopperWiring");
        compatibility.registerItem(ModernWarfareMod.MODID, Piston, "Piston");
        compatibility.registerItem(ModernWarfareMod.MODID, LaserPointer, "LaserPointer");

        compatibility.registerItem(ModernWarfareMod.MODID, Plastic, "plastic");

        OreDictionary.registerOre("ingotTitanium", TitaniumIngot);
        OreDictionary.registerOre("ingotLead", LeadIngot);
        OreDictionary.registerOre("ingotCopper", CopperIngot);
        OreDictionary.registerOre("ingotTin", TinIngot);
        OreDictionary.registerOre("ingotSulfurDust", SulfurDust);
        OreDictionary.registerOre("ingotAluminum", AluminumIngot);
        OreDictionary.registerOre("Ruby", Ruby);
        OreDictionary.registerOre("ingotSteel", SteelIngot);

        Attachments.init(mod, configurationManager, event);
        AuxiliaryAttachments.init(mod, configurationManager, event);
        GunSkins.init(mod, configurationManager, event);
        Bullets.init(mod, configurationManager, event);
        Magazines.init(mod, configurationManager, event);

        compatibility.registerWorldGenerator(new WorldGeneratorEventHandler(configurationManager), 0);

        Builder marineArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Marine)
                .withUnlocalizedName("Marine").withTextureName("Marine")
                .withModelClass("com.vicmatskiv.mw.models.Marine").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Marinehelmet = marineArmorBuilder.buildHelmet(isClient());
        Marinechest = marineArmorBuilder.buildChest(isClient());
        Marineboots = marineArmorBuilder.buildBoots(isClient());

        Builder spetznazArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("Spetznaz").withTextureName("Spetznaz")
                .withModelClass("com.vicmatskiv.mw.models.Marine").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Spetznazhelmet = spetznazArmorBuilder.buildHelmet(isClient());
        Spetznazchest = spetznazArmorBuilder.buildChest(isClient());
        Spetznazboots = spetznazArmorBuilder.buildBoots(isClient());

        Builder swatArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Marine)
                .withUnlocalizedName("Swat").withTextureName("Swat").withModelClass("com.vicmatskiv.mw.models.Swat")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

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

        Builder tacticalArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Tactical)
                .withUnlocalizedName("Tactical").withTextureName("Tactical")
                .withModelClass("com.vicmatskiv.mw.models.Tactical").withHudTextureName("Tactical")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Tacticalhelmet = tacticalArmorBuilder.buildHelmet(isClient());
        Tacticalchest = tacticalArmorBuilder.buildChest(isClient());
        Tacticalboots = tacticalArmorBuilder.buildBoots(isClient());

        // Try not to change the order of the guns to ensure stable recipes

        AK47 = new AK47Factory().createGun(this);
        AKM = new AKMFactory().createGun(this);
        AKMN = new AKMNFactory().createGun(this);
        AK12 = new AK12Factory().createGun(this);
        AK12U = new AK12UFactory().createGun(this);
        AN94 = new AN94Factory().createGun(this);
        AK74U = new AK74UFactory().createGun(this);
        AK74 = new AK74Factory().createGun(this);
        AK74M = new AK74MFactory().createGun(this);
        AK101 = new AK101Factory().createGun(this);
        AR15 = new AR15Factory().createGun(this);
        M4A1 = new M4A1Factory().createGun(this);
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
        Deagle44 = new Deagle44Factory().createGun(this);
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
        G36C = new G36CFactory().createGun(this);
        G36KV = new G36KVFactory().createGun(this);
        AUG = new AUGFactory().createGun(this);
        AUGA3 = new AUGA3Factory().createGun(this);
        Famas = new FamasFactory().createGun(this);
        FamasG2 = new FamasG2Factory().createGun(this);
        FamasF1 = new FamasF1Factory().createGun(this);
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
        HecateII = new HecateIIFactory().createGun(this);
        MosinNagant = new MosinNagantFactory().createGun(this);
        Dragonuv = new DragonuvFactory().createGun(this);
        VSSVintorez = new VSSVintorezFactory().createGun(this);
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
        RPK74M = new RPK74MFactory().createGun(this);
        ASVal = new ASValFactory().createGun(this);
        UMP45 = new UMP45Factory().createGun(this);
        UMP9 = new UMP9Factory().createGun(this);
        TAR21 = new TAR21Factory().createGun(this);
//        KN44 = new KN44Factory().createGun(this);
        MP9 = new MP9Factory().createGun(this);
        M8A7 = new M8A7Factory().createGun(this);
        M1Garand = new M1GarandFactory().createGun(this);

        // Fun Guns :)
        M41A = new M41AFactory().createGun(this);
        Pistol10mm = new Pistol10mmFactory().createGun(this);

        SMAW = new SMAWFactory().createGun(this);
        // GaussRifle = new GaussRifleFactory().createGun(this);
        // RPG = new RPGFactory().createGun(this);

        CrimsonBlood = new MeleeSkin.Builder()
                .withTextureVariant("TacKnifeCrimsonBlood")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("CrimsonBlood")
                .withCraftingRecipe("AR",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 0, 0),
                'R', compatibility.createItemStack(CompatibleItems.DYE, 1, 1)
        )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);

        Chrome = new MeleeSkin.Builder()
                .withTextureVariant("TacKnifeChrome")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("Chrome")
                .withCraftingRecipe("AR",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                'R', compatibility.createItemStack(CompatibleItems.DYE, 11, 11)
        )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);

        GodWillsIt = new MeleeSkin.Builder()
                .withTextureVariant("TacKnifeGodWillsIt")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("GodWillsIt")
                .withCraftingRecipe("AR",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 11, 11),
                'R', compatibility.createItemStack(CompatibleItems.DYE, 15, 15)
        )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);

        Murasaki = new MeleeSkin.Builder()
                .withTextureVariant("TacKnifeMurasaki")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("Murasaki")
                .withCraftingRecipe("AA",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5)
        )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);

        Evangelion = new MeleeSkin.Builder()
                .withTextureVariant("TacKnifeEvangelion")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withName("Evangelion")
                .withCraftingRecipe("AR",
                'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                'R', compatibility.createItemStack(CompatibleItems.DYE, 10, 10)
        )
                .build(ModernWarfareMod.MOD_CONTEXT, MeleeSkin.class);

        new TestMeleeFactory().createMelee(this);

        new KarambitFactory().createMelee(this);

        Tablet = new ItemTablet.Builder<>().withOpticalZoom().withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    float scale = 5.9f;
                    GL11.glScalef(scale, scale / compatibility.getAspectRatio(ModernWarfareMod.MOD_CONTEXT), scale);
                    GL11.glTranslatef(-0.12f, 0.56f, 0.01f);
                })
                .withCreativeTab(ModernWarfareMod.GadgetsTab)
                .withCrosshair("HP")
                .withModel(new TabletModel(), "IPad.png")
                //.withModel(new com.vicmatskiv.mw.models.LPscope(), "HP2.png")
                .withFirstPersonPositioning((player, itemStack) -> {
//                    GL11.glTranslatef(0.5F, -1.5F, -0.7F);

                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
//                    GL11.glRotatef(125F, 0f, 1f, 0f);
//                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                    GL11.glTranslatef(0.68F, -1.35F, 0.7F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof TabletModel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
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
                })
                .withFirstPersonHandPositioning(
                        c -> {
                            GL11.glRotatef(190F, 1f, 0f, 0f);
                            GL11.glRotatef(10F, 0f, 1f, 0f);
                            GL11.glRotatef(30F, 0f, 0f, 1f);
                            GL11.glTranslatef(0.05F, -1.7F, 0.05F);
                            GL11.glScaled(1.1F, 1.1F, 1.1F);
                        },
                        c -> {
                            GL11.glRotatef(190F, 1f, 0f, 0f);
                            GL11.glRotatef(0F, 0f, 1f, 0f);
                            GL11.glRotatef(-10F, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.1F, -0.45F, 0.4F);
                            GL11.glScaled(1.1F, 1.1F, 1.1F);
                        })
                .withName("tablet")
                .withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png")
                .withCraftingRecipe(" R ",
                "XXX",
                "XGX",
                "XEX",
                'X', CommonProxy.SteelIngot,
                'E', CommonProxy.Electronics,
                'G', CompatibleBlocks.GLASS_PANE
        )
                .build(ModernWarfareMod.MOD_CONTEXT);

        new ItemWirelessCamera.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withName("wcam")
            .withCreativeTab(ModernWarfareMod.GadgetsTab)
            .withModel(new CameraModel(), "AK12")
            .withFirstPersonPositioning((player, itemStack) -> {
                // GL11.glTranslatef(0.5F, -1.5F, -0.7F);
                GL11.glRotatef(55F, 0f, 1f, 0f);
                // GL11.glRotatef(2F, 1f, 0f, 0f);
                GL11.glTranslatef(-0.1F, -1.6F, 1F);
                GL11.glScaled(1F, 1F, 1F);
        })
        .withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof CameraModel) {
                GL11.glTranslatef(-0.9F, -0.8F, 0.5F);
                GL11.glRotatef(-50F, 0f, 1f, 0f);
                GL11.glRotatef(80F, 1f, 0f, 0f);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
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
        })

        .withFirstPersonHandPositioning(
                c -> {
                    GL11.glScalef(0F, 0F, 0F);
                    // GL11.glRotatef(190F, 1f, 0f, 0f);
                    // GL11.glRotatef(10F, 0f, 1f, 0f);
                    // GL11.glRotatef(30F, 0f, 0f, 1f);
                    // GL11.glTranslatef(0.1F, -1.75F, 0F);
                },
                c -> {
                    GL11.glScalef(0F, 0F, 0F);
                    // GL11.glRotatef(190F, 1f, 0f, 0f);
                    // GL11.glRotatef(0F, 0f, 1f, 0f);
                    // GL11.glRotatef(-10F, 0f, 0f, 1f);
                    // GL11.glTranslatef(-0.15F, -0.4F, 0.4F);
                })
                .build(ModernWarfareMod.MOD_CONTEXT);

        GrenadeSafetyPin = new AttachmentBuilder<ItemGrenade>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.vicmatskiv.mw.models.Pin(), "AK12.png")
                .withName("GrenadeSafetyPin").withRenderablePart().withModId(ModernWarfareMod.MODID)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        FuseGrenade = new FuseGrenadeFactory().createGrenade(this);

        ImpactGrenade = new ImpactGrenadeFactory().createGrenade(this);

        SmokeGrenade = new SmokeGrenadeFactory().createGrenade(this);
    }

}
