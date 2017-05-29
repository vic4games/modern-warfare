package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

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
import com.vicmatskiv.weaponlib.compatibility.CompatibleChannel;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

public class CommonProxy {
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

        Armors.init(mod, configurationManager, event, isClient());
        Attachments.init(mod, configurationManager, event);
        AuxiliaryAttachments.init(mod, configurationManager, event);
        GunSkins.init(mod, configurationManager, event);
        MeleeSkins.init(mod, configurationManager, event);
        Bullets.init(mod, configurationManager, event);
        Magazines.init(mod, configurationManager, event);
        Guns.init(mod, configurationManager, event, this);
        com.vicmatskiv.mw.Electronics.init(mod, configurationManager, event);
        Grenades.init(mod, configurationManager, event, this);

        new TestMeleeFactory().createMelee(this);

        new KarambitFactory().createMelee(this);
        
        compatibility.registerWorldGenerator(new WorldGeneratorEventHandler(configurationManager), 0);

    }

}
