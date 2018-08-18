package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.weaponlib.ItemSkin;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

public class GunSkins {

    public static ItemSkin ElectricSkin;
    public static ItemSkin Voltaic;
    public static ItemSkin Cosmos;
    public static ItemSkin Volcanic;
    public static ItemSkin Asiimov;
    public static ItemSkin Vulcan;
    public static ItemSkin CrystalCrimson;
    public static ItemSkin PinkIsTheNewBlack;
    public static ItemSkin DynamicBundle;
    public static ItemSkin Woodland_Digital;
    public static ItemSkin Desert_Digital;
    public static ItemSkin Foliage;
    
    public static ItemSkin LightningStrike; //Remove this skin
    
    public static ItemSkin Emerald;
    public static ItemSkin Diamond;
    public static ItemSkin Gold;
    public static ItemSkin Sapphire;
    public static ItemSkin Desert;
    public static ItemSkin Forest;
    
    public static ItemSkin Amber; //Remove this skin
    
    public static ItemSkin Arctic;
    public static ItemSkin Amethyst;
    public static ItemSkin Ruby;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        GunSkins.ElectricSkin = new ItemSkin.Builder().withTextureVariant("Electric").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Electric")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 0, 0),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 12, 12))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Voltaic = new ItemSkin.Builder().withTextureVariant("voltaic").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Voltaic")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.Cosmos = new ItemSkin.Builder().withTextureVariant("Cosmos").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Cosmos")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.Volcanic = new ItemSkin.Builder().withTextureVariant("Volcanic").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Volcanic")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.Asiimov = new ItemSkin.Builder().withTextureVariant("Asiimov").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Asiimov")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.Vulcan = new ItemSkin.Builder().withTextureVariant("Vulcan").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Vulcan")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.PinkIsTheNewBlack = new ItemSkin.Builder().withTextureVariant("PinkIsTheNewBlack").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("PinkIsTheNewBlack")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.CrystalCrimson = new ItemSkin.Builder().withTextureVariant("CrystalCrimson").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("CrystalCrimson")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.DynamicBundle = new ItemSkin.Builder().withTextureVariant("DynamicBundle").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("DynamicBundle")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.Woodland_Digital = new ItemSkin.Builder().withTextureVariant("Woodland_Digital").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Woodland_Digital")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.Desert_Digital = new ItemSkin.Builder().withTextureVariant("Desert_Digital").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Desert_Digital")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.Foliage = new ItemSkin.Builder().withTextureVariant("Foliage").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Foliage")
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 8, 8))
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.Emerald = new ItemSkin.Builder().withTextureVariant("Emerald").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Emerald")
                .withCraftingRecipe("A",
                        'A', CompatibleItems.EMERALD
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Diamond = new ItemSkin.Builder().withTextureVariant("Diamond").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Diamond")
                .withCraftingRecipe("A",
                        'A', CompatibleItems.DIAMOND
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Gold = new ItemSkin.Builder().withTextureVariant("Gold").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Gold")
                .withCraftingRecipe("AA",
                        "AA",
                        'A', CompatibleItems.GOLD_NUGGET
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Sapphire = new ItemSkin.Builder().withTextureVariant("Sapphire").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Sapphire")
                .withCraftingRecipe("A",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 4, 4)
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Desert = new ItemSkin.Builder().withTextureVariant("Desert").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Desert")
                .withCraftingRecipe("A",
                        'A', CompatibleBlocks.SAND
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Forest = new ItemSkin.Builder().withTextureVariant("Forest")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Forest")
                .withCraftingRecipe("A",
                        'A', CompatibleBlocks.LEAVES
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Amber = new ItemSkin.Builder().withTextureVariant("Amber")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Amber")
                .withCraftingRecipe("A",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 14, 14)
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Arctic = new ItemSkin.Builder().withTextureVariant("Arctic")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Arctic")
                .withCraftingRecipe("AR",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 0, 0),
                        'R', compatibility.createItemStack(CompatibleItems.DYE, 15, 15)
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Amethyst = new ItemSkin.Builder().withTextureVariant("Amethyst").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Amethyst")
                .withCraftingRecipe("A",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5)
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
        
        GunSkins.Ruby = new ItemSkin.Builder().withTextureVariant("Ruby").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("RubySkin")
                .withCraftingRecipe("A",
                        'A', Ores.Ruby
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
    }
}
