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

    public static Item Marinechest;
    public static Item Marineboots;
    public static Item Marinehelmet;
    
    public static Item spartanchest;
    public static Item spartanboots;
    public static Item spartanhelmet;
    
    public static CustomArmor GasMaskM40;
    
    public static Item Spetznazchest;
    public static Item Spetznazboots;
    public static Item Spetznazhelmet;
    
    public static Item Swatchest;
    public static Item Swatboots;
    public static Item Swathelmet;
    
//    public static Item GasSwatchest;
//    public static Item GasSwatboots;
//    public static Item GasSwathelmet;
    
    public static Item Tacticalchest;
    public static Item Tacticalboots;
    public static Item Tacticalhelmet;

    static ArmorMaterial Marine = compatibility.addArmorMaterial("Marine", "Marine", 40, new int[] { 4, 6, 5, 4 }, 15, null, 0); // TODO: last
    static ArmorMaterial Spetsnaz = compatibility.addArmorMaterial("Spetsnaz", "Spetsnaz", 40, new int[] { 7, 9, 8, 7 }, 15, null, 0); // TODO: last
    static ArmorMaterial Spartan = compatibility.addArmorMaterial("Spartan", "Spartan", 40, new int[] { 8, 10, 9, 8 }, 15, null, 0); // TODO: last
    static ArmorMaterial Tactical = compatibility.addArmorMaterial("Tactical", "Tactical", 40, new int[] { 2, 4, 3, 2 }, 15, null, 0); // TODO:

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, 
            ModContext modContext) {
        
        Builder marineArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("Marine").withTextureName("Marine")
                .withModelClass("com.vicmatskiv.mw.models.Marine").withHudTextureName("Marine")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Marinehelmet = marineArmorBuilder.buildHelmet(modContext);
        Armors.Marinechest = marineArmorBuilder.buildChest(modContext.isClient());
        Armors.Marineboots = marineArmorBuilder.buildBoots(modContext.isClient());
        
        Builder spartanArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spartan)
                .withUnlocalizedName("mkvi").withTextureName("mkvimjolnir")
                .withModelClass("com.vicmatskiv.mw.models.MkVIMjolnir").withHudTextureName("spartan")
                .withShieldCapacity(70.0)
                .withShieldRegenerationRate(80.0)
                .withShieldRegenerationTimeout(5000)
                .withShieldIndicatorPosition(248, 20, 148, 14)
                .withShieldIndicatorTexture("mkvi_mask", "mkvi_bar")
                .withNightVision(true, false)
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.spartanhelmet = spartanArmorBuilder.buildHelmet(modContext);
        Armors.spartanchest = spartanArmorBuilder.buildChest(modContext.isClient());
        Armors.spartanboots = spartanArmorBuilder.buildBoots(modContext.isClient());
        

        Builder spetznazArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Spetsnaz)
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
        

        Builder tacticalArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Tactical)
                .withUnlocalizedName("Tactical").withTextureName("Tactical")
                .withModelClass("com.vicmatskiv.mw.models.Tactical").withHudTextureName("Marine")
                .withNightVision(true)
                .withCreativeTab(ModernWarfareMod.ArmorTab);
        

        Armors.Tacticalhelmet = tacticalArmorBuilder.buildHelmet(modContext);
        Armors.Tacticalchest = tacticalArmorBuilder.buildChest(modContext.isClient());
        Armors.Tacticalboots = tacticalArmorBuilder.buildBoots(modContext.isClient());
        
        
        Builder gasSuitArmorBuilder = new CustomArmor.Builder().withModId(ModernWarfareMod.MODID).withMaterial(Armors.Marine)
                .withUnlocalizedName("m40gasmask").withTextureName("m40gasmask")
                .withExposureReductionFactor(0.99f)
                .withModelClass("com.vicmatskiv.mw.models.M40GasMask").withHudTextureName("goggles_overlay")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.GasMaskM40 = gasSuitArmorBuilder.buildHelmet(modContext);
    }
    

}
