package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Magazines {

    public static ItemMagazine M4A1Mag;
    public static ItemMagazine M38Mag;
    public static ItemMagazine Stanag50;
    public static ItemMagazine Stanag60;
    public static ItemMagazine Stanag100;
    public static ItemMagazine AK101Mag;
    public static ItemMagazine AK60Mag;
    public static ItemMagazine AK15Mag;
    public static ItemMagazine AK12Mag;
    public static ItemMagazine AK47PMAGTan;
    public static ItemMagazine AK47Mag;
    public static ItemMagazine AK50Mag;
    public static ItemMagazine AK75Mag;
    public static ItemMagazine AK100Mag;
    public static ItemMagazine M9A1Mag;
    public static ItemMagazine SCCYCPX2Mag;
    public static ItemMagazine M9Mag30;
    public static ItemMagazine M9DrumMag;
    public static ItemMagazine MP443Mag;
    public static ItemMagazine M45A1Mag;
    public static ItemMagazine M45A1Mag14;
    public static ItemMagazine HiPowerMag;
    public static ItemMagazine APSMag;
    public static ItemMagazine AS50Mag;
    public static ItemMagazine M82Mag;
    public static ItemMagazine FrommerStopMag;
    public static ItemMagazine G36CMag;
    public static ItemMagazine GlockMag13;
    public static ItemMagazine Glock18CMag;
    public static ItemMagazine GlockMag50;
    public static ItemMagazine KBP9A91Mag;
    public static ItemMagazine KedrMag;
    public static ItemMagazine L96A1Mag;
    public static ItemMagazine M110Mag;
    public static ItemMagazine M1928Mag;
    public static ItemMagazine M40A6Mag;
    public static ItemMagazine M712Mag;
    public static ItemMagazine MG42Mag;
    public static ItemMagazine Mk14EBRMag;
    public static ItemMagazine M14Drum50;
    public static ItemMagazine MP40Mag;
    public static ItemMagazine MP5A5Mag;
    public static ItemMagazine HK50Drum;
    public static ItemMagazine MP7Mag;
    public static ItemMagazine P90Mag;
    public static ItemMagazine P90TerminatorMag;
    public static ItemMagazine G11Mag;
    public static ItemMagazine SaigaMag;
    public static ItemMagazine ScarHMag;
    public static ItemMagazine Scar40Mag;
    public static ItemMagazine Scar60Mag;
    public static ItemMagazine VSSVintorezMag;
    public static ItemMagazine STG44Mag;
    public static ItemMagazine BrenMag;
    public static ItemMagazine JohnsonMAG;
    public static ItemMagazine SV98Mag;
    public static ItemMagazine UziMag;
    public static ItemMagazine VP70Mag;
    public static ItemMagazine HoneyBadgerMag;
    public static ItemMagazine DesertEagleMag;
    public static ItemMagazine M60Mag;
    public static ItemMagazine M249Mag;
    public static ItemMagazine StonerMag;
    public static ItemMagazine M134Mag;
    public static ItemMagazine FuelCell;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        
        Magazines.FuelCell = new ItemMagazine.Builder().withAmmo(1000)
                .withName("FuelCell")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.ChainsawFuel(), "ChainsawFuel.png")

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
                    GL11.glTranslatef(0.3F, 0.5F, -0F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          Ores.INGOT_STEEL,
//                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.BrenMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x51).withName("BrenMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.BrenMkIIMag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 1F, 0.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.JohnsonMAG = new ItemMagazine.Builder()
                .withAmmo(20)
                .withCompatibleBullet(Bullets.Bullet3006Springfield)
                .withName("JohnsonMAG")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.JohnsonLMGMAG(), "gun.png")

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
                    GL11.glTranslatef(0.3F, -1.4F, 1.1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(10F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M4A1Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("M4A1Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M4A1Mag(), "M4A1Mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGA1handguard, Attachments.AUGA2handguard, Attachments.AUGA3handguard)
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
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.M134Mag = new ItemMagazine.Builder().withAmmo(1000).withCompatibleBullet(Bullets.Bullet762x51).withName("M134Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M134Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, -0.5F, -0F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M60Mag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet762x51).withName("M60Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M60Mag(), "m60.png")

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
                    GL11.glTranslatef(0.3F, -2.9F, 4F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M249Mag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet556x45).withName("M249Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M249Mag(), "m249.png")

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
                    GL11.glTranslatef(0.3F, -2.2F, 3.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.StonerMag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet556x45).withName("StonerMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.StonerA1MAG(), "m249.png")

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
                    GL11.glTranslatef(0.3F, -2.2F, 3.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.HoneyBadgerMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x35).withName("HoneyBadgerMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M4A1Mag(), "M4A1Mag.png")

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
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M38Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("M38Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M38Mag(), "M38Mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGA1handguard, Attachments.AUGA2handguard, Attachments.AUGA3handguard)
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
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Stanag50 = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet556x45).withName("Stanag50")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Stanag50(), "gun.png")
                .withRequiredAttachments(Attachments.Placeholder, 
                        Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGA1handguard, Attachments.AUGA2handguard, Attachments.AUGA3handguard)
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
                    GL11.glTranslatef(0.3F, 1.2F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Stanag60 = new ItemMagazine.Builder().withAmmo(60).withCompatibleBullet(Bullets.Bullet556x45).withName("Stanag60")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Stanag60(), "gun.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGA1handguard, Attachments.AUGA2handguard, Attachments.AUGA3handguard)
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
                    GL11.glTranslatef(0.3F, 1.2F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Stanag100 = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet556x45).withName("Stanag100")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.NATODrum100(), "gun.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGA1handguard, Attachments.AUGA2handguard, Attachments.AUGA3handguard)
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
                    GL11.glTranslatef(0.3F, 1.2F, -0.6F);
                    GL11.glRotatef(-160F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.G36CMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("G36CMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.NATOG36Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.8F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK101Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("AK101Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK101Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.7F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK60Mag = new ItemMagazine.Builder().withAmmo(60).withCompatibleBullet(Bullets.Bullet556x45).withName("AK60Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK60Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.5F, -2.4F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK15Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39).withName("AK15Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK15Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK12Mag = new ItemMagazine.Builder().withAmmo(31).withCompatibleBullet(Bullets.Bullet545x39).withName("AK12Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK12Magazine(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.8f, -2.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK47PMAGTan = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39).withName("AK47PMAGTan")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK15Mag(), "tan.png")

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
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK47Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet762x39).withName("AK47Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Magazine762x39(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK50Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet762x39).withName("AK50Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Drum50AK(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.8f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK75Mag = new ItemMagazine.Builder().withAmmo(75).withCompatibleBullet(Bullets.Bullet762x39).withName("AK75Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Mag75rnd(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 1.2f, -3.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK100Mag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet762x39).withName("AK100Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AKDrum100(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.6f, -2.4F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SaigaMag = new ItemMagazine.Builder().withAmmo(5).withCompatibleBullet(Bullets.Shotgun12Guage).withName("SaigaMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Saiga12mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M9A1Mag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9A1mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.5f, -1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SCCYCPX2Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet9x19mm).withName("sccy_cpx_2_mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SCCYCPX2Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.5f, -1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.DesertEagleMag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet9x19mm).withName("DesertEagleMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.DesertEagleMag(), "deserteagle.png")

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
                    GL11.glTranslatef(0.3F, 0.5f, -1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M9Mag30 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9Mag30")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9Mag30(), "gun.png")

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
                    GL11.glTranslatef(0.3F, -0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M9DrumMag = new ItemMagazine.Builder().withAmmo(65).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9DrumMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9DrumMag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, -0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP443Mag = new ItemMagazine.Builder().withAmmo(18).withCompatibleBullet(Bullets.Bullet9x19mm).withName("MP443Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MP443Magazine(), "MP443.png")

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
                    GL11.glTranslatef(0.3F, 0.4f, -0F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M45A1Mag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet45ACP).withName("M45A1Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.7f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M45A1Mag14 = new ItemMagazine.Builder().withAmmo(14).withCompatibleBullet(Bullets.Bullet45ACP).withName("M45A1Mag14")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9Mag30(), "gun.png")

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
                    GL11.glTranslatef(0.3F, -0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.HiPowerMag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet765x21).withName("HiPowerMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.7f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.FrommerStopMag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet380ACP).withName("FrommerStopMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9A1mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.5f, -0.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.APSMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("APSMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.APSmag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.5f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.GlockMag13 = new ItemMagazine.Builder().withAmmo(13).withCompatibleBullet(Bullets.Bullet9x19mm).withName("GlockMag13")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMag13(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.3f, -0.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Glock18CMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("Glock18Cmag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Glock18Cmag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.GlockMag50 = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet9x19mm).withName("GlockMag50")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9DrumMag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, -0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AS50Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet50BMG).withName("AS50Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AS50mag(), "M4A1Mag.png")

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
                    GL11.glTranslatef(0.3F, 1.8f, -3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M82Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet50BMG).withName("M82Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M107Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.7f, -0.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.KBP9A91Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x39mm).withName("KBP9A91Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.KBP9A91Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.8f, -2.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.KedrMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("KedrMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.KedrMag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.8f, -2.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.L96A1Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x54).withName("L96A1Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.L115Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 1.3f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M40A6Mag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet308Winchester).withName("M40A6Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M40A6Mag(), "M40A6.png")

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
                    GL11.glTranslatef(0.3F, 1.4f, -1.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M110Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x51).withName("M110Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M110Mag(), "M4A1Mag.png")

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
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M1928Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet45ACP).withName("M1928Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M1928ThompsonMag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.5F, -1.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M712Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet763x25).withName("M712mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M712mag(), "m712.png")

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
                    GL11.glTranslatef(0.3F, 1F, -2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MG42Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet792x57).withName("MG42Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MG42mag(), "mg42mag.png")

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
                    GL11.glTranslatef(0.3F, 1F, -0.5F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Mk14EBRMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet762x51).withName("Mk14EBRmag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Mk14EBRmag(), "Mk14ebr.png")

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
                    GL11.glTranslatef(0.3F, 1.7F, -4.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M14Drum50 = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet762x51).withName("M14Drum50")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M14Drum50(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 1.2F, -3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP40Mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullets.Bullet9x19mm).withName("MP40Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MP40Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.8F, -2.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP5A5Mag = new ItemMagazine.Builder().withAmmo(25).withCompatibleBullet(Bullets.Bullet9x19mm).withName("MP5A5Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.HKMP5Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.9F, -2.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.HK50Drum = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet9x19mm).withName("HK50Drum")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.HK50Drum(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.9F, -2.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP7Mag = new ItemMagazine.Builder().withAmmo(40).withCompatibleBullet(Bullets.Bullet46x30mm).withName("MP7Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MP7MagazineMEDIUM(), "gun.png")
//                .withRequiredAttachments(Attachments.VeprDustCover)
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
                    GL11.glTranslatef(0.3F, -0.9F, 0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.5F, 0.5F, 0.5f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.P90Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet46x30mm).withName("P90Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.P90Mag(), "p90_mag.png")
                .withRequiredAttachments(Attachments.P90DefaultKit, Attachments.AR57Receiver)
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
                    GL11.glTranslatef(0.3F, 0.8F, -0.3F);
                    GL11.glRotatef(-160F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glScaled(0.5F, 0.5F, 0.5f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.P90TerminatorMag = new ItemMagazine.Builder().withAmmo(65).withCompatibleBullet(Bullets.Bullet46x30mm)
                .withName("P90TerminatorMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M4A1Mag(), "M4A1Mag.png")
                .withRequiredAttachments(Attachments.P90Terminator)
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
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.G11Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet473x33mm)
                .withName("G11Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.G11Mag(), "gun.png")
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
                    GL11.glTranslatef(0.3F, 1.8F, -2.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.5F, 0.5F, 0.5f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.ScarHMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet762x51).withName("ScarHMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.ScarHMag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.9F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Scar40Mag = new ItemMagazine.Builder().withAmmo(40).withCompatibleBullet(Bullets.Bullet762x51).withName("Scar40Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Scar40Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Scar60Mag = new ItemMagazine.Builder().withAmmo(60).withCompatibleBullet(Bullets.Bullet762x51).withName("Scar60Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Stanag50(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 1.2F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.VSSVintorezMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x39mm).withName("VSSVintorezMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.ASValMag(), "ASValMag.png")

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
                    GL11.glTranslatef(0.3F, 0.3F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.STG44Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet792x33Kurz).withName("STG44Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.STG44Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.7F, -2.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SV98Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x54).withName("SV98Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SV98Mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 1.4F, -0.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.UziMag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullets.Bullet9x19mm).withName("UziMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.UziMag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, 0.3F, -0.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.VP70Mag = new ItemMagazine.Builder().withAmmo(18).withCompatibleBullet(Bullets.Bullet9x19mm).withName("VP70mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.VP70mag(), "gun.png")

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
                    GL11.glTranslatef(0.3F, -0.4F, -0.1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

    }


}
