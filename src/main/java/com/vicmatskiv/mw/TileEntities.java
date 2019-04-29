package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import com.vicmatskiv.weaponlib.tile.LootBoxConfiguration;

import net.minecraft.world.EnumDifficulty;

public class TileEntities {

    public static void init(CommonProxy commonProxy) {
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("weapons_case")
        .withModelClassName("com.vicmatskiv.mw.models.GunCase")
        .withTextureName("textures/models/gun_case.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.7f, 1.1f, 0.5f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
        .withEquipmentOption(Guns.M4A1, EnumDifficulty.EASY, 1f)
//        .withEquipmentOption(Guns.M38, EnumDifficulty.EASY, 1f)
        .withEquipmentOption(Guns.M16A4, EnumDifficulty.EASY, 0.9f)
        .withEquipmentOption(Guns.M110, EnumDifficulty.EASY, 0.7f)
//        .withEquipmentOption(Guns.M500A2, EnumDifficulty.EASY, 0.7f)
//        .withEquipmentOption(Guns.M40A6, EnumDifficulty.EASY, 0.05f)
//        .withEquipmentOption(Bullets.Bullet308Winchester, EnumDifficulty.EASY, 2f, 2)
        .withEquipmentOption(Bullets.Bullet762x51, EnumDifficulty.EASY, 3f, 2)
        .withEquipmentOption(Bullets.Bullet556x45, EnumDifficulty.EASY, 5f, 5)
//        .withEquipmentOption(Bullets.Shotgun12Guage, EnumDifficulty.EASY, 2f, 1)
//        .withEquipmentOption(Bullets.Bullet9x19mm, EnumDifficulty.EASY, 100f, 1)
        .withEquipmentOption(Bullets.Bullet45ACP, EnumDifficulty.EASY, 50f, 1)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
//        new LootBoxConfiguration()
//        .withMaterial(CompatibleMaterial.ROCK)
//        .withName("weapons_case_small")
//        .withModelClassName("com.vicmatskiv.mw.models.GunCaseSmall")
//        .withTextureName("textures/models/gun_case.png")
////        .withEquipementDispenseSound(sound)
//        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
//        .withPositioning(tileEntity -> {
//            GL11.glScalef(0.6f, 0.6f, 0.6f);
//            GL11.glTranslatef(0.8f, 1.1f, 0.8f);
//        })
////        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
////        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
////        .withEquipmentOption(Bullets.Bullet9x19mm, EnumDifficulty.EASY, 70f, 1)
//        .withEquipmentOption(Bullets.Bullet45ACP, EnumDifficulty.EASY, 30f, 1)
////        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
//        .withEquipmentDispenseTimeout(10)
//        .build(ModernWarfareMod.MOD_CONTEXT);
//        
//        new LootBoxConfiguration()
//        .withMaterial(CompatibleMaterial.ROCK)
//        .withName("russian_weapons_case")
//        .withModelClassName("com.vicmatskiv.mw.models.MilitaryCrate")
//        .withTextureName("textures/models/militarycrate.png")
////        .withEquipementDispenseSound(sound)
//        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
//        .withPositioning(tileEntity -> {
//            GL11.glScalef(0.6f, 0.6f, 0.6f);
//            GL11.glTranslatef(0.8f, 1.15f, 0.8f);
//        })
////        .withEquipmentOption(Guns.MP443, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.AK15, EnumDifficulty.EASY, 1f)
////        .withEquipmentOption(Guns.AK101, EnumDifficulty.EASY, 1f)
////        .withEquipmentOption(Guns.KBP9A91, EnumDifficulty.EASY, 1.3f)
////        .withEquipmentOption(Guns.SR3, EnumDifficulty.EASY, 0.8f)
//        .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.8f)
////        .withEquipmentOption(Guns.KS23, EnumDifficulty.EASY, 0.6f)
//         .withEquipmentOption(Guns.SV98, EnumDifficulty.EASY, 0.4f)
//        .withEquipmentOption(Bullets.Bullet762x54, EnumDifficulty.EASY, 2f, 1)
//        .withEquipmentOption(Bullets.Bullet762x51, EnumDifficulty.EASY, 3f, 2)
//        .withEquipmentOption(Bullets.Bullet762x39, EnumDifficulty.EASY, 5f, 5)
////        .withEquipmentOption(Bullets.Shotgun4G, EnumDifficulty.EASY, 2f, 1)
////        .withEquipmentOption(Bullets.Bullet9x19mm, EnumDifficulty.EASY, 100f, 1)
////        .withEquipmentOption(Bullets.Bullet9x39mm, EnumDifficulty.EASY, 30f, 4)
////        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
//        .withEquipmentDispenseTimeout(10)
//        .build(ModernWarfareMod.MOD_CONTEXT);
//        
//        new LootBoxConfiguration()
//        .withMaterial(CompatibleMaterial.ROCK)
//        .withName("ammo_box")
//        .withModelClassName("com.vicmatskiv.mw.models.Ammobox1")
//        .withTextureName("textures/models/ammobox.png")
////        .withEquipementDispenseSound(sound)
//        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
//        .withPositioning(tileEntity -> {
//            GL11.glScalef(0.4f, 0.4f, 0.4f);
//            GL11.glTranslatef(1.2f, 2.5f, 1.1f);
//        })
//        .withEquipmentOption(Bullets.Bullet762x54, EnumDifficulty.EASY, 20f, 1)
//        .withEquipmentOption(Bullets.Bullet762x51, EnumDifficulty.EASY, 25f, 2)
//        .withEquipmentOption(Bullets.Bullet762x39, EnumDifficulty.EASY, 30f, 3)
////        .withEquipmentOption(Bullets.Shotgun4G, EnumDifficulty.EASY, 15f, 1)
////        .withEquipmentOption(Bullets.Bullet9x19mm, EnumDifficulty.EASY, 130f, 1)
//        .withEquipmentOption(Bullets.Bullet45ACP, EnumDifficulty.EASY, 110f, 1)
//        .withEquipmentOption(Bullets.Bullet9x39mm, EnumDifficulty.EASY, 80f, 3)
////        .withEquipmentOption(Bullets.Bullet308Winchester, EnumDifficulty.EASY, 20f, 2)
//        .withEquipmentOption(Bullets.Bullet556x45, EnumDifficulty.EASY, 30f, 3)
////        .withEquipmentOption(Bullets.Shotgun12Guage, EnumDifficulty.EASY, 15f, 1)
////        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
//        .withEquipmentDispenseTimeout(10)
//        .build(ModernWarfareMod.MOD_CONTEXT);
//        
//        new LootBoxConfiguration()
//        .withMaterial(CompatibleMaterial.ROCK)
//        .withName("weapons_locker")
//        .withModelClassName("com.vicmatskiv.mw.models.GunRack")
//        .withTextureName("textures/models/gunrack.png")
////        .withEquipementDispenseSound(sound)
//        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
//        .withPositioning(tileEntity -> {
//            GL11.glScalef(0.6f, 0.6f, 0.6f);
//            GL11.glTranslatef(0.4f, 1.15f, 0.6f);
//        })
//        //temporary
////        .withEquipmentOption(Guns.MP443, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.AK15, EnumDifficulty.EASY, 1f)
////        .withEquipmentOption(Guns.AK101, EnumDifficulty.EASY, 1f)
////        .withEquipmentOption(Guns.KBP9A91, EnumDifficulty.EASY, 1.3f)
////        .withEquipmentOption(Guns.SR3, EnumDifficulty.EASY, 0.8f)
//        .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.8f)
////        .withEquipmentOption(Guns.KS23, EnumDifficulty.EASY, 0.6f)
//         .withEquipmentOption(Guns.SV98, EnumDifficulty.EASY, 0.4f)
//        .withEquipmentOption(Bullets.Bullet762x54, EnumDifficulty.EASY, 2f, 1)
//        .withEquipmentOption(Bullets.Bullet762x51, EnumDifficulty.EASY, 3f, 2)
//        .withEquipmentOption(Bullets.Bullet762x39, EnumDifficulty.EASY, 5f, 5)
////        .withEquipmentOption(Bullets.Shotgun4G, EnumDifficulty.EASY, 2f, 1)
////        .withEquipmentOption(Bullets.Bullet9x19mm, EnumDifficulty.EASY, 100f, 1)
//        .withEquipmentOption(Bullets.Bullet9x39mm, EnumDifficulty.EASY, 30f, 4)
////        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
//        .withEquipmentDispenseTimeout(10)
//        .build(ModernWarfareMod.MOD_CONTEXT);
//        
        }
    
    

}

