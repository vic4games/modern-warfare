package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.weaponlib.ItemSkin;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

public class GunSkins {

    public static ItemSkin ElectricSkin;
    public static ItemSkin Voltaic;
    public static ItemSkin LightningStrike;
    //    public static ItemSkin Asiimov;
    public static ItemSkin Fade;
    //    public static ItemSkin Vulcan;
    public static ItemSkin Emerald;
    public static ItemSkin Diamond;
    public static ItemSkin Gold;
    public static ItemSkin Sapphire;
    public static ItemSkin Desert;
    public static ItemSkin Forest;
    public static ItemSkin Amber;
    public static ItemSkin Arctic;
    public static ItemSkin Amethyst;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
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

        GunSkins.LightningStrike = new ItemSkin.Builder().withTextureVariant("AWPLightningStrike")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withCraftingRecipe("AF",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 5, 5),
                        'F', compatibility.createItemStack(CompatibleItems.DYE, 9, 9))
                .withName("LightningStrike").build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        //        Asiimov = new ItemSkin.Builder().withTextureVariant("M4A4Asiimov").withModId(ModernWarfareMod.MODID)
        //                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Asiimov")
        //                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Fade = new ItemSkin.Builder().withTextureVariant("G18Fade").withTextureVariant("SMAWRuby")
                .withTextureVariant("Ruby")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withCraftingRecipe("A",
                        'A', CommonProxy.Ruby
                        )
                .withName("Fade").build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Emerald = new ItemSkin.Builder().withTextureVariant("Emerald").withTextureVariant("KrissVectorEmerald")
                .withTextureVariant("MosinNagantEmerald").withModId(ModernWarfareMod.MODID)
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

        GunSkins.Gold = new ItemSkin.Builder().withTextureVariant("Gold").withTextureVariant("KrissVectorGold")
                .withTextureVariant("MosinNagantGold").withTextureVariant("SMAWGold")
                .withTextureVariant("HecateIIGold").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Gold")
                .withCraftingRecipe("AA",
                        "AA",
                        'A', CompatibleItems.GOLD_NUGGET
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Sapphire = new ItemSkin.Builder().withTextureVariant("Sapphire").withTextureVariant("KrissVectorSapphire")
                .withTextureVariant("SMAWSapphire").withModId(ModernWarfareMod.MODID)
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

        GunSkins.Forest = new ItemSkin.Builder().withTextureVariant("Forest").withTextureVariant("MosinNagantForest")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Forest")
                .withCraftingRecipe("A",
                        'A', CompatibleBlocks.LEAVES
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Amber = new ItemSkin.Builder().withTextureVariant("Amber").withTextureVariant("M14Amber")
                .withTextureVariant("HecateIIAmber").withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Amber")
                .withCraftingRecipe("A",
                        'A', compatibility.createItemStack(CompatibleItems.DYE, 14, 14)
                        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);

        GunSkins.Arctic = new ItemSkin.Builder().withTextureVariant("Arctic").withTextureVariant("HecateIIArctic")
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

        //        Vulcan = new ItemSkin.Builder().withTextureVariant("AK47Vulcan").withModId(ModernWarfareMod.MODID)
        //                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withName("Vulcan")
        //      .build(ModernWarfareMod.MOD_CONTEXT, ItemSkin.class);
    }
}
