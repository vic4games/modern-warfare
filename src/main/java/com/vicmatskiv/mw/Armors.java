package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.CustomArmor.Builder;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class Armors {
	
	// realistic armors
	
	public static Item JPNVG18helmet;
	
	public static Item USMCchest;
    public static Item USMCboots;
    public static Item USMChelmet;
    
    // scp armors
    
    public static Item Dclasschest;
    public static Item Dclassboots;
    
    public static Item SCPGuardchest;
    public static Item SCPGuardboots;
    public static Item SCPGuardhelmet;
	
	// arcade armors

    public static Item Marinechest;
    public static Item Marineboots;
    public static Item Marinehelmet;
    
    public static CustomArmor GasMaskM40;
    
    public static Item Spetznazchest;
    public static Item Spetznazboots;
    public static Item Spetznazhelmet;
    
    public static Item Swatchest;
    public static Item Swatboots;
    public static Item Swathelmet;
    
    public static Item WFIchest;
    public static Item WFIboots;
    public static Item WFIhelmet;
    
    public static Item Tacticalhelmet;
    
    public static Item SpecOpschest;
    public static Item SpecOpsboots;
    public static Item SpecOpshelmet;
    
    public static Item Mercchest;
    public static Item Mercboots;
    public static Item Merchelmet;
    
    public static Item HXSoldierchest;
    public static Item HXSoldierboots;
    public static Item HXSoldierhelmet;
    
    public static Item STARSchest;
    public static Item STARSboots;
    
    public static Item HECUhelmet;
    public static Item HECUchest;
    public static Item HECUboots;
    
    public static Item Scarchest;
    public static Item Scarboots;
    public static Item Scarhelmet;
    
    public static Item Juggernautchest;
    public static Item Juggernautboots;
    public static Item Juggernauthelmet;
    
    public static Item Umbrellachest;
    public static Item Umbrellaboots;
    public static Item Umbrellahelmet;
    
    public static Item Astronautchest;
    public static Item Astronautboots;
    public static Item Astronauthelmet;
    
    public static Item KCPDchest;
    public static Item KCPDboots;
    
    public static Item NCRchest;
    public static Item NCRboots;
    public static Item NCRhelmet;
    
    public static Item T60chest;
    public static Item T60boots;
    public static Item T60helmet;
    
    public static Item NaziSantachest;
    public static Item NaziSantaboots;
    public static Item NaziSantahelmet;
    
    public static Item Santachest;
    public static Item Santaboots;
    public static Item Santahelmet;
    
    public static Item Doomchest;
    public static Item Doomboots;
    public static Item Doomhelmet;
    
    // HALO 
    
    // Mjolnir MkVI
    
    public static Item MKVIMainchest;
    public static Item MKVIMainboots;
    public static Item MKVIMainhelmet;
    
    public static Item MKVIDefaultchest;
    public static Item MKVIDefaultboots;
    public static Item MKVIDefaulthelmet;
    
    public static Item MKVIBluechest;
    public static Item MKVIBlueboots;
    public static Item MKVIBluehelmet;
    
    public static Item MKVIRedchest;
    public static Item MKVIRedboots;
    public static Item MKVIRedhelmet;
    
    // Mjolnir MkV
    
    public static Item MKVDefaultchest;
    public static Item MKVDefaultboots;
    public static Item MKVDefaulthelmet;
    
    public static Item MKVGreenchest;
    public static Item MKVGreenboots;
    public static Item MKVGreenhelmet;
    
    public static Item MKVBluechest;
    public static Item MKVBlueboots;
    public static Item MKVBluehelmet;
    
    public static Item MKVRedchest;
    public static Item MKVRedboots;
    public static Item MKVRedhelmet;
    
    // Mjolnir MkV ODST
    
    public static Item MKVDefaultODSTchest;
    public static Item MKVDefaultODSTboots;
    public static Item MKVDefaultODSThelmet;
    
    public static Item MKVGreenODSTchest;
    public static Item MKVGreenODSTboots;
    public static Item MKVGreenODSThelmet;
    
    public static Item MKVBlueODSTchest;
    public static Item MKVBlueODSTboots;
    public static Item MKVBlueODSThelmet;
    
    public static Item MKVRedODSTchest;
    public static Item MKVRedODSTboots;
    public static Item MKVRedODSThelmet;

    static ArmorMaterial NCR = compatibility.addArmorMaterial(
    		"NCR", "NCR", 200, new int[] { 2, 3, 2, 1 }, 15, null, 0); // TODO: last
    
    static ArmorMaterial ScarSuit = compatibility.addArmorMaterial(
    		"ScarSuit", "ScarSuit", 200, new int[] { 2, 3, 2, 2 }, 15, null, 0); // TODO: last
    
    static ArmorMaterial Juggernaut = compatibility.addArmorMaterial(
    		"Juggernaut", "Juggernaut", 20, new int[] { 5, 6, 2, 5 }, 20, null, 0); // TODO: last
    
    static ArmorMaterial PowerArmor = compatibility.addArmorMaterial(
    		"PowerArmor", "PowerArmor", 20, new int[] { 7, 8, 7, 6 }, 20, null, 0); // TODO: last
    
    static ArmorMaterial Marine = compatibility.addArmorMaterial(
    		"Marine", "Marine", 200, new int[] { 2, 3, 1, 2 }, 15, null, 0); // TODO: last
    
    static ArmorMaterial Spartan = compatibility.addArmorMaterial(
    		"Spartan", "Spartan", 200, new int[] { 3, 4, 3, 2 }, 15, null, 0); // TODO: last
    
    static ArmorMaterial Clothing = compatibility.addArmorMaterial(
    		"Clothing", "Clothing", 200, new int[] { 0, 0, 0, 0 }, 15, null, 0); // TODO: last
    
    static ArmorMaterial Astronaut = compatibility.addArmorMaterial(
    		"Astronaut", "Astronaut", 200, new int[] { 1, 2, 2, 1 }, 15, null, 0); // TODO:

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, 
            ModContext modContext) {
        
        Builder santaArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("Santa").withTextureName("santasuit_normal")
                .withModelClass("com.vicmatskiv.mw.models.SantasuitNormal").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Santahelmet = santaArmorBuilder.buildHelmet(modContext);
        Armors.Santachest = santaArmorBuilder.buildChest(modContext.isClient());
        Armors.Santaboots = santaArmorBuilder.buildBoots(modContext.isClient());
        
        Builder nazisantaArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("Nazisanta").withTextureName("santasuit_nazi")
                .withModelClass("com.vicmatskiv.mw.models.SantaSuit").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.NaziSantahelmet = nazisantaArmorBuilder.buildHelmet(modContext);
        Armors.NaziSantachest = nazisantaArmorBuilder.buildChest(modContext.isClient());
        Armors.NaziSantaboots = nazisantaArmorBuilder.buildBoots(modContext.isClient());
        
        Builder specopsArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("Spec_Ops").withTextureName("specops")
                .withModelClass("com.vicmatskiv.mw.models.SpecOps").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.SpecOpshelmet = specopsArmorBuilder.buildHelmet(modContext);
        Armors.SpecOpschest = specopsArmorBuilder.buildChest(modContext.isClient());
        Armors.SpecOpsboots = specopsArmorBuilder.buildBoots(modContext.isClient());
        
        Builder hecuArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("HECU").withTextureName("HECU")
                .withModelClass("com.vicmatskiv.mw.models.HECU").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.HECUhelmet = hecuArmorBuilder.buildHelmet(modContext);
        Armors.HECUchest = hecuArmorBuilder.buildChest(modContext.isClient());
        Armors.HECUboots = hecuArmorBuilder.buildBoots(modContext.isClient());
        
        Builder juggernautsuitArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Juggernaut)
                .withUnlocalizedName("Juggernaut").withTextureName("JuggernautSuit")
                .withModelClass("com.vicmatskiv.mw.models.JuggernautSuit").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Juggernauthelmet = juggernautsuitArmorBuilder.buildHelmet(modContext);
        Armors.Juggernautchest = juggernautsuitArmorBuilder.buildChest(modContext.isClient());
        Armors.Juggernautboots = juggernautsuitArmorBuilder.buildBoots(modContext.isClient());
        
//        Builder hammerdownArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.HammerDown)
//                .withUnlocalizedName("HammerDown").withTextureName("HammerDown")
//                .withModelClass("com.vicmatskiv.mw.models.HammerDownSuit").withHudTextureName("Marine")
//                .withCreativeTab(ModernWarfareMod.ArmorTab);
//
//        Armors.HammerDownhelmet = hammerdownArmorBuilder.buildHelmet(modContext);
//        Armors.HammerDownchest = hammerdownArmorBuilder.buildChest(modContext.isClient());
//        Armors.HammerDownboots = hammerdownArmorBuilder.buildBoots(modContext.isClient());
        
        Builder mercArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("merc").withTextureName("Merc")
                .withModelClass("com.vicmatskiv.mw.models.Merc").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Merchelmet = mercArmorBuilder.buildHelmet(modContext);
        Armors.Mercchest = mercArmorBuilder.buildChest(modContext.isClient());
        Armors.Mercboots = mercArmorBuilder.buildBoots(modContext.isClient());
        
        Builder starsArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("stars").withTextureName("starsuniform")
                .withModelClass("com.vicmatskiv.mw.models.STARSuniform").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.STARSchest = starsArmorBuilder.buildChest(modContext.isClient());
        Armors.STARSboots = starsArmorBuilder.buildBoots(modContext.isClient());
        
        Builder marineArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("Marine").withTextureName("Marine")
                .withModelClass("com.vicmatskiv.mw.models.Marine").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Marinehelmet = marineArmorBuilder.buildHelmet(modContext);
        Armors.Marinechest = marineArmorBuilder.buildChest(modContext.isClient());
        Armors.Marineboots = marineArmorBuilder.buildBoots(modContext.isClient());
        
        Builder usmcArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("USMC").withTextureName("USMC")
                .withModelClass("com.vicmatskiv.mw.models.USMC").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.USMChelmet = usmcArmorBuilder.buildHelmet(modContext);
        Armors.USMCchest = usmcArmorBuilder.buildChest(modContext.isClient());
        Armors.USMCboots = usmcArmorBuilder.buildBoots(modContext.isClient());
        
        Builder ncrArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.NCR)
                .withUnlocalizedName("NCR").withTextureName("NCR")
                .withNightVision(true)
                .withExposureReductionFactor(0.99f)
                .withModelClass("com.vicmatskiv.mw.models.NCR").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.NCRhelmet = ncrArmorBuilder.buildHelmet(modContext);
        Armors.NCRchest = ncrArmorBuilder.buildChest(modContext.isClient());
        Armors.NCRboots = ncrArmorBuilder.buildBoots(modContext.isClient());
        
        Builder t60ArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.PowerArmor)
                .withUnlocalizedName("t60").withTextureName("powerarmort60")
//                .withNightVision(true)
                .withExposureReductionFactor(0.99f)
                .withModelClass("com.vicmatskiv.mw.models.PowerArmorT60").withHudTextureName("marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.T60helmet = t60ArmorBuilder.buildHelmet(modContext);
        Armors.T60chest = t60ArmorBuilder.buildChest(modContext.isClient());
        Armors.T60boots = t60ArmorBuilder.buildBoots(modContext.isClient());
        
        Builder doomarmorArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.PowerArmor)
                .withUnlocalizedName("doom").withTextureName("doometernalarmor")
//                .withNightVision(true)
                .withExposureReductionFactor(1.0f)
                .withModelClass("com.vicmatskiv.mw.models.DoomEternalArmor").withHudTextureName("marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Doomhelmet = doomarmorArmorBuilder.buildHelmet(modContext);
        Armors.Doomchest = doomarmorArmorBuilder.buildChest(modContext.isClient());
        Armors.Doomboots = doomarmorArmorBuilder.buildBoots(modContext.isClient());

        Builder spetznazArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("Spetznaz").withTextureName("Spetsnaz")
                .withModelClass("com.vicmatskiv.mw.models.Spetsnaz").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Spetznazhelmet = spetznazArmorBuilder.buildHelmet(modContext);
        Armors.Spetznazchest = spetznazArmorBuilder.buildChest(modContext.isClient());
        Armors.Spetznazboots = spetznazArmorBuilder.buildBoots(modContext.isClient());
        

        Builder swatArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("Swat").withTextureName("Swat").withModelClass("com.vicmatskiv.mw.models.Swat")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Swathelmet = swatArmorBuilder.buildHelmet(modContext);
        Armors.Swatchest = swatArmorBuilder.buildChest(modContext.isClient());
        Armors.Swatboots = swatArmorBuilder.buildBoots(modContext.isClient());
        
        Builder wfiArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("WFI").withTextureName("WFItaskforce").withModelClass("com.vicmatskiv.mw.models.WFITaskForce")
                .withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.WFIhelmet = wfiArmorBuilder.buildHelmet(modContext);
        Armors.WFIchest = wfiArmorBuilder.buildChest(modContext.isClient());
        Armors.WFIboots = wfiArmorBuilder.buildBoots(modContext.isClient());
        

        Builder tacticalArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("Tactical").withTextureName("Tactical")
                .withModelClass("com.vicmatskiv.mw.models.Tactical").withHudTextureName("Marine")
                .withNightVision(true)
                .withCreativeTab(ModernWarfareMod.ArmorTab);
        

        Armors.Tacticalhelmet = tacticalArmorBuilder.buildHelmet(modContext);
        
        Builder jpnvg18ArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("JPNVG18").withTextureName("jpnvg18")
                .withModelClass("com.vicmatskiv.mw.models.JPNVG18").withHudTextureName("Marine")
                .withNightVision(true)
                .withCreativeTab(ModernWarfareMod.ArmorTab);
        

        Armors.JPNVG18helmet = jpnvg18ArmorBuilder.buildHelmet(modContext);
        
        
        Builder gasSuitArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("m40gasmask").withTextureName("m40gasmask")
                .withExposureReductionFactor(0.99f)
                .withModelClass("com.vicmatskiv.mw.models.M40GasMask").withHudTextureName("goggles_overlay")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.GasMaskM40 = gasSuitArmorBuilder.buildHelmet(modContext);
        
        Builder hxsoldierArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.ScarSuit)
                .withUnlocalizedName("hxsoldier").withTextureName("hxsoldier")
                .withExposureReductionFactor(99999f)
                .withNightVision(true)
                .withModelClass("com.vicmatskiv.mw.models.HXSoldier").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.HXSoldierhelmet = hxsoldierArmorBuilder.buildHelmet(modContext);
        Armors.HXSoldierchest = hxsoldierArmorBuilder.buildChest(modContext.isClient());
        Armors.HXSoldierboots = hxsoldierArmorBuilder.buildBoots(modContext.isClient());
            
        Builder umbrellaArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                    .withUnlocalizedName("Umbrella").withTextureName("UmbrellaCorp")
                    .withExposureReductionFactor(0.8f)
                    .withNightVision(true)
                    .withModelClass("com.vicmatskiv.mw.models.UmbrellaCorp").withHudTextureName("umbrella_overlay")
                    .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Umbrellahelmet = umbrellaArmorBuilder.buildHelmet(modContext);
        Armors.Umbrellachest = umbrellaArmorBuilder.buildChest(modContext.isClient());
        Armors.Umbrellaboots = umbrellaArmorBuilder.buildBoots(modContext.isClient());
        
        Builder astronautArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Astronaut)
                .withUnlocalizedName("Astronaut").withTextureName("Astronaut2")
                .withExposureReductionFactor(1f)
                .withModelClass("com.vicmatskiv.mw.models.Astronaut").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Astronauthelmet = astronautArmorBuilder.buildHelmet(modContext);
        Armors.Astronautchest = astronautArmorBuilder.buildChest(modContext.isClient());
        Armors.Astronautboots = astronautArmorBuilder.buildBoots(modContext.isClient());
        
        Builder scarArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.ScarSuit)
                .withUnlocalizedName("scar").withTextureName("scarsuit")
                .withExposureReductionFactor(1f)
                .withNightVision(true)
                .withModelClass("com.vicmatskiv.mw.models.SCARSuit").withHudTextureName("scar_hud")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Scarhelmet = scarArmorBuilder.buildHelmet(modContext);
        Armors.Scarchest = scarArmorBuilder.buildChest(modContext.isClient());
        Armors.Scarboots = scarArmorBuilder.buildBoots(modContext.isClient());
            
        Builder kcpdArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Clothing)
                .withUnlocalizedName("KCPD").withTextureName("KCPD")
                .withModelClass("com.vicmatskiv.mw.models.KCPD").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.KCPDchest = kcpdArmorBuilder.buildChest(modContext.isClient());
        Armors.KCPDboots = kcpdArmorBuilder.buildBoots(modContext.isClient());   
        
        Builder dclassArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Clothing)
                .withUnlocalizedName("Dclass").withTextureName("dclass")
                .withModelClass("com.vicmatskiv.mw.models.Dclass").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Dclasschest = dclassArmorBuilder.buildChest(modContext.isClient());
        Armors.Dclassboots = dclassArmorBuilder.buildBoots(modContext.isClient()); 
        
        Builder SCPGuardArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("SCPGuard").withTextureName("scpguard")
                .withModelClass("com.vicmatskiv.mw.models.SCPGuard").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.SCPGuardhelmet = SCPGuardArmorBuilder.buildHelmet(modContext); 
        Armors.SCPGuardchest = SCPGuardArmorBuilder.buildChest(modContext.isClient());
        Armors.SCPGuardboots = SCPGuardArmorBuilder.buildBoots(modContext.isClient()); 
        
// ===========================================================
        
// HALO
        
// ===========================================================
        
        
// MKVI main (master chief)
        
        Builder spartanArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkvi_main").withTextureName("mkvimjolnir")
                .withModelClass("com.vicmatskiv.mw.models.MkVIMjolnir").withHudTextureName("spartan")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVIMainhelmet = spartanArmorBuilder.buildHelmet(modContext);
        Armors.MKVIMainchest = spartanArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVIMainboots = spartanArmorBuilder.buildBoots(modContext.isClient());
        
// MKVI default
        
        Builder mkvidefaultArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkvidefault").withTextureName("mkvidefault")
                .withModelClass("com.vicmatskiv.mw.models.MkVIMjolnir").withHudTextureName("spartan")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVIDefaulthelmet = mkvidefaultArmorBuilder.buildHelmet(modContext);
        Armors.MKVIDefaultchest = mkvidefaultArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVIDefaultboots = mkvidefaultArmorBuilder.buildBoots(modContext.isClient());
        
        
// MKVI blue
        
        Builder mkviblueArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkviblue").withTextureName("mkviblue")
                .withModelClass("com.vicmatskiv.mw.models.MkVIMjolnir").withHudTextureName("spartan")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVIBluehelmet = mkviblueArmorBuilder.buildHelmet(modContext);
        Armors.MKVIBluechest = mkviblueArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVIBlueboots = mkviblueArmorBuilder.buildBoots(modContext.isClient());
        
        
// MKVI red
        
        Builder mkviredArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkvired").withTextureName("mkvired")
                .withModelClass("com.vicmatskiv.mw.models.MkVIMjolnir").withHudTextureName("spartan")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVIRedhelmet = mkviredArmorBuilder.buildHelmet(modContext);
        Armors.MKVIRedchest = mkviredArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVIRedboots = mkviredArmorBuilder.buildBoots(modContext.isClient());
        
// ===========================================================
        
// MkV default (Halo 1)
        
        Builder mkvdefaultArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkv_default").withTextureName("mjolnirmkv_default")
                .withModelClass("com.vicmatskiv.mw.models.MjolnirMkV").withHudTextureName("spartan")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVDefaulthelmet = mkvdefaultArmorBuilder.buildHelmet(modContext);
        Armors.MKVDefaultchest = mkvdefaultArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVDefaultboots = mkvdefaultArmorBuilder.buildBoots(modContext.isClient());
        
// MkV green (Halo 1)
        
        Builder mkvgreenArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkv_green").withTextureName("mjolnirmkv_green")
                .withModelClass("com.vicmatskiv.mw.models.MjolnirMkV").withHudTextureName("spartan")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVGreenhelmet = mkvgreenArmorBuilder.buildHelmet(modContext);
        Armors.MKVGreenchest = mkvgreenArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVGreenboots = mkvgreenArmorBuilder.buildBoots(modContext.isClient());
        
// MkV blue (Halo 1)
        
        Builder mkvblueArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkv_blue").withTextureName("mjolnirmkv_blue")
                .withModelClass("com.vicmatskiv.mw.models.MjolnirMkV").withHudTextureName("spartan")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVBluehelmet = mkvblueArmorBuilder.buildHelmet(modContext);
        Armors.MKVBluechest = mkvblueArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVBlueboots = mkvblueArmorBuilder.buildBoots(modContext.isClient());
        
// MkV red (Halo 1)
        
        Builder mkvredArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkv_red").withTextureName("mjolnirmkv_red")
                .withModelClass("com.vicmatskiv.mw.models.MjolnirMkV").withHudTextureName("spartan")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVRedhelmet = mkvredArmorBuilder.buildHelmet(modContext);
        Armors.MKVRedchest = mkvredArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVRedboots = mkvredArmorBuilder.buildBoots(modContext.isClient());
        
// MkV default (ODST)
        
        Builder odstdefaultArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkv_default_odst").withTextureName("odst")
                .withModelClass("com.vicmatskiv.mw.models.ODST").withHudTextureName("odst")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar_odst")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVDefaultODSThelmet = odstdefaultArmorBuilder.buildHelmet(modContext);
        Armors.MKVDefaultODSTchest = odstdefaultArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVDefaultODSTboots = odstdefaultArmorBuilder.buildBoots(modContext.isClient());
        
// MkV green (ODST)
        
        Builder odstgreenArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkv_green_odst").withTextureName("odstgreen")
                .withModelClass("com.vicmatskiv.mw.models.ODST").withHudTextureName("odst")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar_odst")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVGreenODSThelmet = odstgreenArmorBuilder.buildHelmet(modContext);
        Armors.MKVGreenODSTchest = odstgreenArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVGreenODSTboots = odstgreenArmorBuilder.buildBoots(modContext.isClient());
        
// MkV blue (ODST)
        
        Builder odstblueArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkv_blue_odst").withTextureName("odstblue")
                .withModelClass("com.vicmatskiv.mw.models.ODST").withHudTextureName("odst")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar_odst")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVBlueODSThelmet = odstblueArmorBuilder.buildHelmet(modContext);
        Armors.MKVBlueODSTchest = odstblueArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVBlueODSTboots = odstblueArmorBuilder.buildBoots(modContext.isClient());
        
// MkV red (ODST)
        
        Builder odstredArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkv_red_odst").withTextureName("odstred")
                .withModelClass("com.vicmatskiv.mw.models.ODST").withHudTextureName("odst")
                .withShieldCapacity(40.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 19.5, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar_odst")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.SpartanTab);

        Armors.MKVRedODSThelmet = odstredArmorBuilder.buildHelmet(modContext);
        Armors.MKVRedODSTchest = odstredArmorBuilder.buildChest(modContext.isClient());
        Armors.MKVRedODSTboots = odstredArmorBuilder.buildBoots(modContext.isClient());
        
    }
    

}
