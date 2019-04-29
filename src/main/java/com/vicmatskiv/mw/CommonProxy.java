package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.mw.items.ItemLaserPointer;
import com.vicmatskiv.mw.items.melee.KarambitFactory;
import com.vicmatskiv.mw.items.melee.TestMeleeFactory;
import com.vicmatskiv.mw.parts.ItemCapacitor;
import com.vicmatskiv.mw.parts.ItemCopperWiring;
import com.vicmatskiv.mw.parts.ItemDiode;
import com.vicmatskiv.mw.parts.ItemInductor;
import com.vicmatskiv.mw.parts.ItemResistor;
import com.vicmatskiv.mw.parts.ItemTransistor;
import com.vicmatskiv.mw.resources.ItemAluminumPlate;
import com.vicmatskiv.mw.resources.ItemBigSteelPlate;
import com.vicmatskiv.mw.resources.ItemCloth;
import com.vicmatskiv.mw.resources.ItemElectronics;
import com.vicmatskiv.mw.resources.ItemGreenCloth;
import com.vicmatskiv.mw.resources.ItemMetalComponents;
import com.vicmatskiv.mw.resources.ItemMiniSteelPlate;
import com.vicmatskiv.mw.resources.ItemOpticGlass;
import com.vicmatskiv.mw.resources.ItemPiston;
import com.vicmatskiv.mw.resources.ItemPlastic;
import com.vicmatskiv.mw.resources.ItemSteelPlate;
import com.vicmatskiv.mw.resources.ItemTanCloth;
import com.vicmatskiv.weaponlib.compatibility.CompatibleChannel;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;

public class CommonProxy {

    public static Item ElectronicCircuitBoard;
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

    public static Item AluminumPlate;

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

    public void preInit(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {

        ModernWarfareMod.MOD_CONTEXT.preInit(mod, ModernWarfareMod.MODID, configurationManager, new CompatibleChannel(ModernWarfareMod.CHANNEL));

        ModernWarfareMod.MOD_CONTEXT.setChangeZoomSound("OpticZoom");
        
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOnSound("nvon");
        
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOffSound("nvoff");

        ModernWarfareMod.MOD_CONTEXT.setChangeFireModeSound("GunFireModeSwitch");

        ModernWarfareMod.MOD_CONTEXT.setNoAmmoSound("dryfire");

        ModernWarfareMod.MOD_CONTEXT.setExplosionSound("grenadeexplosion");
        
        
//        ModernWarfareMod.MOD_CONTEXT.setNightVisionOnSound("OpticZoom");
//        
//        ModernWarfareMod.MOD_CONTEXT.setNightVisionOffSound("OpticZoom");

        ElectronicCircuitBoard = new ItemElectronics();
        OpticGlass = new ItemOpticGlass();
        Cloth = new ItemCloth();
        TanCloth = new ItemTanCloth();
        GreenCloth = new ItemGreenCloth();
        Inductor = new ItemInductor();
        Resistor = new ItemResistor();
        Transistor = new ItemTransistor();
        Diode = new ItemDiode();
        Capacitor = new ItemCapacitor();
        CopperWiring = new ItemCopperWiring();
        Piston = new ItemPiston();
        LaserPointer = new ItemLaserPointer();
        Plastic = new ItemPlastic();
        AluminumPlate = new ItemAluminumPlate();
        SteelPlate = new ItemSteelPlate();
        BigSteelPlate = new ItemBigSteelPlate();
        MiniSteelPlate = new ItemMiniSteelPlate();
        MetalComponents = new ItemMetalComponents();

        compatibility.registerItem(ModernWarfareMod.MODID, ElectronicCircuitBoard, "Electronics");
        compatibility.registerItem(ModernWarfareMod.MODID, OpticGlass, "OpticGlass");
        compatibility.registerItem(ModernWarfareMod.MODID, Cloth, "Cloth");
        compatibility.registerItem(ModernWarfareMod.MODID, TanCloth, "TanCloth");
        compatibility.registerItem(ModernWarfareMod.MODID, GreenCloth, "GreenCloth");
        compatibility.registerItem(ModernWarfareMod.MODID, AluminumPlate, "AluminumPlate");
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

        Ores.init(mod, configurationManager, event);
        Backpacks.preInit(mod, configurationManager, event);
        Vests.preInit(mod, configurationManager, event);
        Armors.init(mod, configurationManager, event, ModernWarfareMod.MOD_CONTEXT);
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
    }

    public void init(ModernWarfareMod mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
        ModernWarfareMod.MOD_CONTEXT.init(mod, ModernWarfareMod.MODID);
        
        Entities.init(this);
        TileEntities.init(this);
        compatibility.registerWorldGenerator(new WorldGeneratorEventHandler(configurationManager), 0);
    }

}
