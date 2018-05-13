package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.models.PPSHDrumMag;
import com.vicmatskiv.mw.models.SVT40;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Magazines {

    public static ItemMagazine Magazine762x39;
    public static ItemMagazine PMAG762x39;
    public static ItemMagazine Mag75rnd762x39;
    public static ItemMagazine AK12Mag;
    public static ItemMagazine RPK74MMag;
    public static ItemMagazine AK74MMag;
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
    public static ItemMagazine M2CarbineMag;
    public static ItemMagazine M240Mag;
    public static ItemMagazine L115Mag;
    public static ItemMagazine SV98Mag;
    public static ItemMagazine ColtM1911Mag;
    public static ItemMagazine M249Mag;
    public static ItemMagazine Mk48Mag;
    public static ItemMagazine MXMag;
    public static ItemMagazine M41AMag;
//    public static ItemMagazine HK33Mag;
    public static ItemMagazine Mag10mm;
    public static ItemMagazine Magazine9mm;
    public static ItemMagazine ScarHMag;
    public static ItemMagazine VectorMag;
//    public static ItemMagazine G3Mag;
    public static ItemMagazine PP19Mag;
    public static ItemMagazine Glock32Mag;
    public static ItemMagazine HecateIIMag;
    public static ItemMagazine Deagle50Mag;
    public static ItemMagazine VSSVintorezMag;
    public static ItemMagazine ASValMag;
    public static ItemMagazine PythonClip;
    //    public static ItemMagazine KN44Mag;
    //    public static ItemMagazine KN44Mag45;
    public static ItemMagazine M8A7Mag;
    public static ItemMagazine PPSH41DrumMag;
    public static ItemMagazine Type100Mag;
    public static ItemMagazine M1A1mag;
    public static ItemMagazine MP18mag;
    public static ItemMagazine HK417Mag;
    public static ItemMagazine M16A1Mag;
    public static ItemMagazine Mag308;
    public static ItemMagazine Saiga12mag;
    public static ItemMagazine VEPR12Mag;
    public static ItemMagazine SVT40mag;
    public static ItemMagazine LugerP08Mag;
    public static ItemMagazine M3A1Mag;
    public static ItemMagazine STG44Mag;
    public static ItemMagazine LeeEnfieldMag;
    public static ItemMagazine Saiga410Mag;
    public static ItemMagazine AK15Mag;
    public static ItemMagazine Tec9Mag;
    public static ItemMagazine MPXmag;
    public static ItemMagazine MA37mag;
    public static ItemMagazine SRS99S5mag;
    public static ItemMagazine M395Bmag;
    public static ItemMagazine M6Gmag;
    public static ItemMagazine BR55mag;
    public static ItemMagazine MA5Dmag;
    public static ItemMagazine USG57Mag;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        
        Magazines.PythonClip = new ItemMagazine.Builder().withAmmo(6).withCompatibleBullet(Bullets.Bullet357)
                .withName("PythonClip").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.revolverclip(), "RevolverClip.png")
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
                    GL11.glTranslatef(-0.8F, 0.5F, -1.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
//                .withCraftingRecipe(
//                "X",
//                'X', Ores.INGOT_STEEL
//        )
//                .withMaxStackSize(6)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.Magazine762x39 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39)
                .withName("Magazine762x39").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                    GL11.glTranslatef(-0.8F, 0.5F, -1.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                          
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.STG44Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39)
                .withName("STG44Mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.STG44Mag(), "STG44.png")
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
                    GL11.glTranslatef(-0.8F, 0.5F, -1.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(4)
                  .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                          
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SVT40mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x54)
                .withName("SVT40Mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SVT40mag(), "SVT40.png")
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
                    GL11.glTranslatef(-0.8F, -0.5F, -0.2F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
        
        
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.LeeEnfieldMag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet303British)
                .withName("LeeEnfieldMag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.LeeEnfieldNo4Magazine(), "LeeEnfieldNo4.png")
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
                    GL11.glTranslatef(-0.8F, 1.8F, -2.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          CommonProxy.MiniSteelPlate)
        
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Saiga12mag = new ItemMagazine.Builder().withAmmo(5).withCompatibleBullet(Bullets.ShotgunShell)
                .withName("Saiga12mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Saiga12mag(), "AK12.png")
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
                    GL11.glTranslatef(-0.8F, 0.5F, -1.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.VEPR12Mag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.ShotgunShell)
                .withName("VEPR12Mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.VEPRMag(), "AK12.png")
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
                    GL11.glTranslatef(-0.8F, 0.5F, -1.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Saiga410Mag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.ShotgunShell410)
                .withName("Saiga410Mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Saiga12mag(), "AK12.png")
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
                    GL11.glTranslatef(-0.8F, 0.5F, -1.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Type100Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet8mm)
                .withName("Type100Mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Type100Mag(), "Type100Mag.png")
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
                    GL11.glTranslatef(-0.8F, 0.7F, 2.2F);
                    GL11.glRotatef(0F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP18mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullets.Bullet762x25)
                .withName("MP18mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MP18mag(), "MP18.png")
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
                    GL11.glTranslatef(-0.8F, 1F, 1.8F);
                    GL11.glRotatef(0F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M1A1mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet45ACP)
                .withName("M1A1mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M1A1mag(), "M1A1Thompson.png")
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
                    GL11.glTranslatef(-0.8F, -0.5F, -0.1F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.PPSH41DrumMag = new ItemMagazine.Builder().withAmmo(71).withCompatibleBullet(Bullets.Bullet762x25)
                .withName("PPSH41Mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new PPSHDrumMag(), "PPSH41.png")
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
                    GL11.glTranslatef(-0.8F, -1F, 0.2F);
                    GL11.glRotatef(-200F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.Mag75rnd762x39 = new ItemMagazine.Builder().withAmmo(75).withCompatibleBullet(Bullets.Bullet762x39)
                .withName("Mag75rnd762x39").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Mag75rnd(), "GunmetalTexture.png")
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
                    GL11.glTranslatef(-0.8F, 0.2F, -0.6F);
                    GL11.glRotatef(-180F, 0f, 1f, 0f);
                    GL11.glRotatef(-30F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          CommonProxy.MiniSteelPlate,
                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

//        KN44Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(CommonProxy.Bullet556x39)
//                .withName("KN44Mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
//                .withModel(new com.vicmatskiv.mw.models.Magazine762x39(), "KN44Mag.png")
//                .withFirstPersonPositioning((player, itemStack) -> {
//                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
//                    GL11.glRotatef(30F, 0f, 1f, 0f);
//                    GL11.glScaled(0.7F, 0.7F, 0.7F);
//                }).withThirdPersonPositioning((player, itemStack) -> {
//                    GL11.glTranslatef(-1F, -0.7F, 0.8F);
//                    GL11.glRotatef(-50F, 0f, 1f, 0f);
//                    GL11.glRotatef(80F, 1f, 0f, 0f);
//                    GL11.glScaled(0.7F, 0.7F, 0.7F);
//                }).withInventoryPositioning((itemStack) -> {
//                    GL11.glTranslatef(-0.8F, -0.2F, 0.4F);
//                    GL11.glRotatef(-120F, 0f, 1f, 0f);
//                    GL11.glRotatef(-10F, 1f, 0f, 0f);
//                    GL11.glRotatef(-30F, 0f, 0f, 1f);
//                    GL11.glScaled(0.9F, 0.9F, 0.9f);
//                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

//        Magazines.G3Mag = new ItemMagazine.Builder().withAmmo(21).withCompatibleBullet(Bullets.Bullet762x51).withName("G3Mag")
//                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
//                .withModel(new com.vicmatskiv.mw.models.G3Mag(), "AK12.png")
//                .withFirstPersonPositioning((player, itemStack) -> {
//                    GL11.glTranslatef(0.3F, -0.6F, 1.2F);
//                    GL11.glRotatef(30F, 0f, 1f, 0f);
//                    GL11.glScaled(0.7F, 0.7F, 0.7F);
//                }).withThirdPersonPositioning((player, itemStack) -> {
//                    GL11.glTranslatef(-0.9F, -1.5F, 1F);
//                    GL11.glRotatef(-50F, 0f, 1f, 0f);
//                    GL11.glRotatef(80F, 1f, 0f, 0f);
//                    GL11.glScaled(0.7F, 0.7F, 0.7F);
//                }).withInventoryPositioning((itemStack) -> {
//                    GL11.glTranslatef(-0.4F, 1F, -1.4F);
//                    GL11.glRotatef(-130F, 0f, 1f, 0f);
//                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                    GL11.glRotatef(-30F, 0f, 0f, 1f);
//                    GL11.glScaled(0.8F, 0.8F, 0.8f);
//                }).withTextureName("Dummy.png")
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          CommonProxy.SteelPlate,
//                          Ores.INGOT_STEEL)
//                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MA37mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullets.Bullet762x51).withName("MA37Mag")
              .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
              .withModel(new com.vicmatskiv.mw.models.MA37Mag(), "MA37.png")
              .withFirstPersonPositioning((player, itemStack) -> {
                  GL11.glTranslatef(-1F, -0.6F, -1.6F);
                  GL11.glRotatef(30F, 0f, 1f, 0f);
                  GL11.glScaled(1F, 1F, 1F);
              }).withThirdPersonPositioning((player, itemStack) -> {
                  GL11.glTranslatef(-0.9F, -1.5F, 1F);
                  GL11.glRotatef(-50F, 0f, 1f, 0f);
                  GL11.glRotatef(80F, 1f, 0f, 0f);
                  GL11.glScaled(0.7F, 0.7F, 0.7F);
              }).withInventoryPositioning((itemStack) -> {
                  GL11.glTranslatef(-0.4F, -1.5F, 2F);
                  GL11.glRotatef(-130F, 0f, 1f, 0f);
                  GL11.glRotatef(-20F, 1f, 0f, 0f);
                  GL11.glRotatef(-30F, 0f, 0f, 1f);
                  GL11.glScaled(0.8F, 0.8F, 0.8f);
              }).withTextureName("Dummy.png")
              .withMaxStackSize(4)
//              .withCrafting(CraftingComplexity.MEDIUM,
//                        CommonProxy.SteelPlate,
//                        Ores.INGOT_STEEL)
              .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MA5Dmag = new ItemMagazine.Builder().withAmmo(36).withCompatibleBullet(Bullets.Bullet762x51).withName("MA5Dmag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MA5Dmag(), "MA5D.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.6F, -1.6F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(1F, 1F, 1F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -1.5F, 1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, -1.5F, 2F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(4)
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          CommonProxy.SteelPlate,
//                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.BR55mag = new ItemMagazine.Builder().withAmmo(36).withCompatibleBullet(Bullets.Bullet762x51).withName("BR55mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.BR55mag(), "BR55.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.6F, -1.6F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(1F, 1F, 1F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -1.5F, 1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, -1.5F, 2F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(4)
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          CommonProxy.SteelPlate,
//                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M395Bmag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Bullet762x51).withName("M395Bmag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M395Bmag(), "M395B.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.6F, -1.6F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(1F, 1F, 1F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -1.5F, 1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, -1.5F, 2F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(3)
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          CommonProxy.SteelPlate,
//                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SRS99S5mag = new ItemMagazine.Builder().withAmmo(4).withCompatibleBullet(Bullets.Bullet145x114).withName("SRS99S5mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SRS99S5mag(), "SRS99S5.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.6F, -1.6F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(1F, 1F, 1F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -1.5F, 1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.4F, 1.1F, -2.1F);
                  GL11.glRotatef(-130F, 0f, 1f, 0f);
                  GL11.glRotatef(-20F, 1f, 0f, 0f);
                  GL11.glRotatef(-30F, 0f, 0f, 1f);
                  GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(2)
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          CommonProxy.SteelPlate,
//                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        
        Magazines.M8A7Mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullets.Bullet300Blackout).withName("M8A7Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.FunGunsTab)
                .withModel(new com.vicmatskiv.mw.models.M8A7Mag(), "AK12.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.8F, -1F, 0.9F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, 0.4F, -0.8F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.PMAG762x39 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39).withName("PMAG762x39")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.PMAG762x39(), "AK12.png")
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
                    GL11.glTranslatef(-0.8F, 0.5F, -1.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
        .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK15Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39).withName("AK15Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.PMAG762x39(), "AK15.png")
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
                    GL11.glTranslatef(-0.8F, 0.5F, -1.4F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                }).withTextureName("Dummy.png")
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
        .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AK12Mag = new ItemMagazine.Builder().withAmmo(31).withCompatibleBullet(Bullets.Bullet556x39).withName("AK12Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.RPK74MMag = new ItemMagazine.Builder().withAmmo(40).withCompatibleBullet(Bullets.Bullet762x39).withName("RPK74MMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

//        KN44Mag45 = new ItemMagazine.Builder().withAmmo(45).withCompatibleBullet(CommonProxy.Bullet556x39).withName("KN44Mag45")
//                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.gunsTab)
//                .withModel(new com.vicmatskiv.mw.models.RPK74MMag(), "AK12.png")
//
//                .withFirstPersonPositioning((player, itemStack) -> {
//                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
//                    GL11.glRotatef(30F, 0f, 1f, 0f);
//                    GL11.glScaled(0.7F, 0.7F, 0.7F);
//                }).withThirdPersonPositioning((player, itemStack) -> {
//                    GL11.glTranslatef(-1F, -0.7F, 0.8F);
//                    GL11.glRotatef(-50F, 0f, 1f, 0f);
//                    GL11.glRotatef(80F, 1f, 0f, 0f);
//                    GL11.glScaled(0.7F, 0.7F, 0.7F);
//                }).withInventoryPositioning((itemStack) -> {
//                    GL11.glTranslatef(-0.85F, -0.35F, 0.4F);
//                    GL11.glRotatef(-120F, 0f, 1f, 0f);
//                    GL11.glRotatef(-10F, 1f, 0f, 0f);
//                    GL11.glRotatef(-30F, 0f, 0f, 1f);
//                    GL11.glScaled(0.8F, 0.8F, 0.8f);
//                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AK74MMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet545x39).withName("AK74MMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Magazine545x39(), "AK12.png")
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
                    GL11.glTranslatef(-0.8F, 0.3F, -1F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AKS74UMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet545x39).withName("AKS74UMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Magazine545x39(), "AKS74UMag.png")

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
                    GL11.glTranslatef(-0.8F, 0.3F, -1F);
                    GL11.glRotatef(-120F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.NATOMag1 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("NATOMag1")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MPXmag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9mm).withName("MPXmag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MPXmag(), "AK12.png")

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
                    GL11.glTranslatef(-0.4F, 0.7F, -1.5F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Mag308 = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet308).withName("Mag308")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Mag308(), "AK12.png")

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
                    GL11.glTranslatef(-1F, 0.6F, -1.2F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.NATO20rnd = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet556x45).withName("NATO20rnd")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M16A1Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet556x45).withName("M16A1Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                    GL11.glTranslatef(-0.4F, 0F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.NATO40rnd = new ItemMagazine.Builder().withAmmo(40).withCompatibleBullet(Bullets.Bullet556x45).withName("NATO40rnd")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.NATOMag2 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("NATOMag2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.NATOFamasMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45)
                .withName("NATOFamasMag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.NATOG36Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("NATOG36Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.DragunovMag = new ItemMagazine.Builder().withAmmo(11).withCompatibleBullet(Bullets.Bullet762x54)
                .withName("DragunovMag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                    GL11.glTranslatef(-0.3F, 2.1F, -2.8F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.FALMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet762x51).withName("FALMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.M110Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x51).withName("M110Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.HK417Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x51).withName("HK417Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.HK417Mag(), "HK417Mag.png")
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
                    GL11.glTranslatef(-1F, 0.6F, -1.2F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.M14DMRMag = new ItemMagazine.Builder().withAmmo(21).withCompatibleBullet(Bullets.Bullet762x51).withName("M14DMRMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.Glock21Mag = new ItemMagazine.Builder().withAmmo(13).withCompatibleBullet(Bullets.Bullet45ACP).withName("Glock21Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.LugerP08Mag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet762x21).withName("LugerP08Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.LugerMag(), "AK12.png")
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
                    GL11.glTranslatef(-0.6F, -0.5F, 0.6F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Tec9Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9mm).withName("Tec9Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Tec9Mag(), "AK12.png")
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
                    GL11.glTranslatef(-0.6F, -0.5F, 0.6F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.G18Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9mm).withName("G18Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.Glock32Mag = new ItemMagazine.Builder().withAmmo(14).withCompatibleBullet(Bullets.Bullet357).withName("Glock32Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.M9BerettaMag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Bullet9mm).withName("M9BerettaMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.USG57Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet57).withName("USG57Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.Mag10mm = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet10mm).withName("Mag10mm")
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
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.Magazine9mm = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet9mm).withName("Magazine9mm")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M6Gmag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet127x40).withName("M6Gmag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M6Gmag(), "M6G.png")
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
                })
                .withMaxStackSize(6)
//                .withCrafting(CraftingComplexity.LOW,
//                          CommonProxy.SteelPlate,
//                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.NATODrum100 = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet556x45)
                .withName("NATODrum100").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.MP40Mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullets.Bullet9mm).withName("MP40Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M3A1Mag = new ItemMagazine.Builder().withAmmo(31).withCompatibleBullet(Bullets.Bullet45ACP).withName("M3A1Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M3A1GreaseGunMag(), "AK12.png")

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
                    GL11.glTranslatef(-0.2F, -0.2F, -1.8F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.VectorMag = new ItemMagazine.Builder().withAmmo(26).withCompatibleBullet(Bullets.Bullet45ACP).withName("VectorMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.MP5KMag = new ItemMagazine.Builder().withAmmo(25).withCompatibleBullet(Bullets.Bullet9mm).withName("MP5KMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);


        Magazines.Deagle50Mag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet50).withName("Deagle50Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.DeagleMag(), "Deagle44.png")

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
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.VSSVintorezMag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet9x39mm)
                .withName("VSSVintorezMag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.VSSVintorezMag(), "AK12.png")

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
                    GL11.glTranslatef(-0.3F, 0.2F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.ASValMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x39mm)
                .withName("ASValMag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.ASValMag(), "ASValMag.png")

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
                    GL11.glTranslatef(-0.3F, 0.2F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AS50Mag = new ItemMagazine.Builder().withAmmo(5).withCompatibleBullet(Bullets.BMG50).withName("AS50Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.HecateIIMag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.BMG50).withName("HecateIIMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AS50Mag(), "NATOMag1.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.6F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -0.5F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.6F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.9F, 0.2F, 0.4F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 0.9F, 1f);
                })
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
            .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.FNP90Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet57x28).withName("FNP90Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.M107BMag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.BMG50).withName("M107BMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          CommonProxy.MiniSteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.HKMP7Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet46x30).withName("HKMP7Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.M1CarbineMag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Carbine30).withName("M1CarbineMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M2CarbineMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Carbine30).withName("M2CarbineMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M2CarbineMag(), "GunmetalTexture.png")

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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);


        Magazines.L115Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet308).withName("L115Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SV98Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x54).withName("SV98Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SV98Mag(), "AK12.png")

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
                })
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.ColtM1911Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet45ACP)
                .withName("ColtM1911Mag").withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.LOW,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.M249Mag = new ItemMagazine.Builder().withAmmo(200).withCompatibleBullet(Bullets.Bullet556x45).withName("M249Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M249Mag(), "M249.png")
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
                })
                .withMaxStackSize(1)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          CommonProxy.BigSteelPlate,
                          Ores.INGOT_STEEL)
        .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Mk48Mag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet762x51).withName("Mk48Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Mk48MOD1Mag(), "Mk48MOD1.png")
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
                })
                .withMaxStackSize(1)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          CommonProxy.BigSteelPlate,
                          Ores.INGOT_STEEL)
        .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.MXMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet65x39).withName("MXMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.M41AMag = new ItemMagazine.Builder().withAmmo(99).withCompatibleBullet(Bullets.Bullet65x39).withName("M41AMag")
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
                })
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.HIGH,
                          CommonProxy.SteelPlate,
                          CommonProxy.MiniSteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

//        Magazines.HK33Mag = new ItemMagazine.Builder().withAmmo(31).withCompatibleBullet(Bullets.Bullet556x45).withName("HK33Mag")
//                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
//                .withModel(new com.vicmatskiv.mw.models.HK33Mag(), "GunmetalTexture.png")
//
//                .withFirstPersonPositioning((player, itemStack) -> {
//                    GL11.glTranslatef(0.3F, -0.6F, 1.2F);
//                    GL11.glRotatef(30F, 0f, 1f, 0f);
//                    GL11.glScaled(0.7F, 0.7F, 0.7F);
//                }).withThirdPersonPositioning((player, itemStack) -> {
//                    GL11.glTranslatef(-0.9F, -1.5F, 1F);
//                    GL11.glRotatef(-50F, 0f, 1f, 0f);
//                    GL11.glRotatef(80F, 1f, 0f, 0f);
//                    GL11.glScaled(0.7F, 0.7F, 0.7F);
//                }).withInventoryPositioning((itemStack) -> {
//                    GL11.glTranslatef(-0.4F, 1F, -1.4F);
//                    GL11.glRotatef(-130F, 0f, 1f, 0f);
//                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                    GL11.glRotatef(-30F, 0f, 0f, 1f);
//                    GL11.glScaled(0.8F, 0.8F, 0.8f);
//                })
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          CommonProxy.SteelPlate,
//                          Ores.INGOT_STEEL)
//                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.ScarHMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet300Blackout).withName("ScarHMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.PP19Mag = new ItemMagazine.Builder().withAmmo(65).withCompatibleBullet(Bullets.Bullet9mm).withName("PP19Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
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
                })
                .withMaxStackSize(5)
                .withCrafting(CraftingComplexity.MEDIUM,
                          CommonProxy.SteelPlate,
                          Ores.INGOT_STEEL)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

    }


}
