package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import com.vicmatskiv.weaponlib.tile.LootBoxConfiguration;

import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;

public class TileEntities {
    
    public static void init(CommonProxy commonProxy) {
        
        new LootBoxConfiguration()
            .withMaterial(CompatibleMaterial.ROCK)
            .withName("weapons_case")
            .withModelClassName("com.vicmatskiv.mw.models.GunCase")
            .withTextureName("textures/models/gun_case.png")
    //        .withEquipementDispenseSound(sound)
            .withCreativeTab(ModernWarfareMod.PropsTab)
            .withPositioning(tileEntity -> {
                GL11.glScalef(0.6f, 0.6f, 0.6f);
                GL11.glTranslatef(0.7f, 1.1f, 0.5f);
            })
            .withEquipmentOption(Guns.M4A1, EnumDifficulty.EASY, 1f)
    //        .withEquipmentOption(Guns.M38, EnumDifficulty.EASY, 1f)
            .withEquipmentOption(Guns.M16A4, EnumDifficulty.EASY, 0.9f)
            .withEquipmentOption(Guns.M110, EnumDifficulty.EASY, 0.7f)
            .withEquipmentOption(Guns.M500A2, EnumDifficulty.EASY, 0.7f)
            .withEquipmentOption(Guns.M40A6, EnumDifficulty.EASY, 0.05f)
            .withEquipmentOption(Bullets.Bullet308Winchester, EnumDifficulty.EASY, 2f, 2)
            .withEquipmentOption(Bullets.Bullet762x51, EnumDifficulty.EASY, 3f, 2)
            .withEquipmentOption(Bullets.Bullet556x45, EnumDifficulty.EASY, 5f, 5)
            .withEquipmentOption(Bullets.Shotgun12Guage, EnumDifficulty.EASY, 2f, 1)
            .withEquipmentOption(Bullets.Bullet9x19mm, EnumDifficulty.EASY, 7f, 1)
            .withEquipmentOption(Bullets.Bullet45ACP, EnumDifficulty.EASY, 6f, 1)
            .withEquipmentOption(null, EnumDifficulty.EASY, 25f, 1)
            .withEquipmentDispenseTimeout(10)
            .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("weapons_case_small")
        .withModelClassName("com.vicmatskiv.mw.models.GunCaseSmall")
        .withTextureName("textures/models/gun_case.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.8f, 1.1f, 0.8f);
        })
        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
        .withEquipmentOption(Bullets.Bullet9x19mm, EnumDifficulty.EASY, 70f, 1)
        .withEquipmentOption(Bullets.Bullet45ACP, EnumDifficulty.EASY, 30f, 1)
        .withEquipmentOption(null, EnumDifficulty.EASY, 40f, 1)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("russian_weapons_case")
        .withModelClassName("com.vicmatskiv.mw.models.MilitaryCrate")
        .withTextureName("textures/models/militarycrate.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.8f, 1.15f, 0.8f);
        })
        .withEquipmentOption(Guns.MP443, EnumDifficulty.EASY, 4f)
        .withEquipmentOption(Guns.AK15, EnumDifficulty.EASY, 1f)
//        .withEquipmentOption(Guns.AK101, EnumDifficulty.EASY, 1f)
        .withEquipmentOption(Guns.KBP9A91, EnumDifficulty.EASY, 1.3f)
        .withEquipmentOption(Guns.SR3, EnumDifficulty.EASY, 0.8f)
        .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.8f)
        .withEquipmentOption(Guns.KS23, EnumDifficulty.EASY, 0.6f)
         .withEquipmentOption(Guns.SV98, EnumDifficulty.EASY, 0.4f)
        .withEquipmentOption(Bullets.Bullet762x54, EnumDifficulty.EASY, 2f, 1)
        .withEquipmentOption(Bullets.Bullet762x51, EnumDifficulty.EASY, 2f, 2)
        .withEquipmentOption(Bullets.Bullet762x39, EnumDifficulty.EASY, 3f, 5)
        .withEquipmentOption(Bullets.Shotgun4G, EnumDifficulty.EASY, 2f, 1)
        .withEquipmentOption(Bullets.Bullet9x19mm, EnumDifficulty.EASY, 5, 1)
        .withEquipmentOption(Bullets.Bullet9x39mm, EnumDifficulty.EASY, 4f, 4)
        .withEquipmentOption(null, EnumDifficulty.EASY, 20f, 1)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("ammo_box")
        .withModelClassName("com.vicmatskiv.mw.models.Ammobox1")
        .withTextureName("textures/models/ammobox.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.4f, 0.4f, 0.4f);
            GL11.glTranslatef(1.2f, 2.5f, 1.1f);
        })
        .withEquipmentOption(Bullets.Bullet762x54, EnumDifficulty.EASY, 20f, 1)
        .withEquipmentOption(Bullets.Bullet762x51, EnumDifficulty.EASY, 25f, 2)
        .withEquipmentOption(Bullets.Bullet762x39, EnumDifficulty.EASY, 30f, 3)
        .withEquipmentOption(Bullets.Shotgun4G, EnumDifficulty.EASY, 15f, 1)
        .withEquipmentOption(Bullets.Bullet9x19mm, EnumDifficulty.EASY, 130f, 1)
        .withEquipmentOption(Bullets.Bullet45ACP, EnumDifficulty.EASY, 110f, 1)
        .withEquipmentOption(Bullets.Bullet9x39mm, EnumDifficulty.EASY, 80f, 3)
        .withEquipmentOption(Bullets.Bullet308Winchester, EnumDifficulty.EASY, 20f, 2)
        .withEquipmentOption(Bullets.Bullet556x45, EnumDifficulty.EASY, 30f, 3)
        .withEquipmentOption(Bullets.Shotgun12Guage, EnumDifficulty.EASY, 15f, 1)
        .withEquipmentOption(null, EnumDifficulty.EASY, 200f, 1)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("weapons_locker")
        .withModelClassName("com.vicmatskiv.mw.models.GunRack")
        .withTextureName("textures/models/gunrack.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.4f, 1.15f, 0.6f);
        })
        //temporary
        .withEquipmentOption(Guns.M4A1, EnumDifficulty.EASY, 1f)
//        .withEquipmentOption(Guns.M38, EnumDifficulty.EASY, 1f)
        .withEquipmentOption(Guns.M16A4, EnumDifficulty.EASY, 0.9f)
        .withEquipmentOption(Guns.M110, EnumDifficulty.EASY, 0.7f)
        .withEquipmentOption(Guns.M500A2, EnumDifficulty.EASY, 0.7f)
        .withEquipmentOption(Guns.M40A6, EnumDifficulty.EASY, 0.05f)
        .withEquipmentOption(Bullets.Bullet308Winchester, EnumDifficulty.EASY, 2f, 2)
        .withEquipmentOption(Bullets.Bullet762x51, EnumDifficulty.EASY, 3f, 2)
        .withEquipmentOption(Bullets.Bullet556x45, EnumDifficulty.EASY, 5f, 5)
        .withEquipmentOption(Bullets.Shotgun12Guage, EnumDifficulty.EASY, 2f, 1)
        .withEquipmentOption(Bullets.Bullet45ACP, EnumDifficulty.EASY, 6f, 1)
        .withEquipmentOption(null, EnumDifficulty.EASY, 23f, 1)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("fridge_open")
        .withModelClassName("com.vicmatskiv.mw.models.FridgeOpen")
        .withTextureName("textures/models/fridge.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glTranslatef(0.55f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("fridge_closed")
        .withModelClassName("com.vicmatskiv.mw.models.FridgeClosed")
        .withTextureName("textures/models/fridge.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glTranslatef(0.55f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("artillery_PROP")
        .withModelClassName("com.vicmatskiv.mw.models.ArtilleryProp20")
        .withTextureName("textures/models/artilleryprop.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.55f, 0.6f, 0.55f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("supply_drop")
        .withModelClassName("com.vicmatskiv.mw.models.SupplyDrop")
        .withTextureName("textures/models/supplydrop.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            GL11.glTranslatef(0.2f, 1.63f, 1.7f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
        .withEquipmentOption(Guns.AK101, EnumDifficulty.EASY, 2f)
        .withEquipmentOption(Guns.M38, EnumDifficulty.EASY, 2f)
        .withEquipmentOption(Guns.APS, EnumDifficulty.EASY, 4f)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("medical_crate")
        .withModelClassName("com.vicmatskiv.mw.models.MedicalCrate")
        .withTextureName("textures/models/medicalcrate.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.7f, 1.13f, 0.5f);
//            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("locker")
        .withModelClassName("com.vicmatskiv.mw.models.Locker")
        .withTextureName("textures/models/locker.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            GL11.glTranslatef(0.7f, 1.85f, 1f);
//            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("scp_locker")
        .withModelClassName("com.vicmatskiv.mw.models.SCPLocker")
        .withTextureName("textures/models/scplocker.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.5f, 0.45f, 0.6f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("barrel")
        .withModelClassName("com.vicmatskiv.mw.models.Barrel")
        .withTextureName("textures/models/barrel.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1.4f, 1.15f, 1.4f);
            GL11.glTranslatef(0.35f, -0.18f, 0.35f);
//            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("explosive_barrel")
        .withModelClassName("com.vicmatskiv.mw.models.Barrel")
        .withTextureName("textures/models/barrel_explosive.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1.4f, 1.15f, 1.4f);
            GL11.glTranslatef(0.35f, -0.18f, 0.35f);
//            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("pc")
        .withModelClassName("com.vicmatskiv.mw.models.PC")
        .withTextureName("textures/models/pc.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
//            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("laptop")
        .withModelClassName("com.vicmatskiv.mw.models.Laptop")
        .withTextureName("textures/models/pc.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.7f, 0.7f, 0.7f);
            GL11.glTranslatef(0.5f, 0.71f, 0.6f);
//            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("monitor")
        .withModelClassName("com.vicmatskiv.mw.models.Monitor")
        .withTextureName("textures/models/pc.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
//            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("filingcabinet")
        .withModelClassName("com.vicmatskiv.mw.models.FilingCabinet")
        .withTextureName("textures/models/filingcabinetopened.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("filingcabinet_opened")
        .withModelClassName("com.vicmatskiv.mw.models.FilingCabinetOpened")
        .withTextureName("textures/models/filingcabinetopened.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("shelf_right")
        .withModelClassName("com.vicmatskiv.mw.models.ShelfRight")
        .withTextureName("textures/models/shelf.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("shelf_left")
        .withModelClassName("com.vicmatskiv.mw.models.ShelfLeft")
        .withTextureName("textures/models/shelf.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("shelf_top")
        .withModelClassName("com.vicmatskiv.mw.models.ShelfTop")
        .withTextureName("textures/models/shelf.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("tv")
        .withModelClassName("com.vicmatskiv.mw.models.TV")
        .withTextureName("textures/models/tv.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("ceiling_tv")
        .withModelClassName("com.vicmatskiv.mw.models.CeilingTV")
        .withTextureName("textures/models/ceilingtv.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0.4f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("ceiling_tv_rotated")
        .withModelClassName("com.vicmatskiv.mw.models.CeilingTV")
        .withTextureName("textures/models/ceilingtv.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.6f, 0.4f, 0.7f);
            GL11.glRotatef(-135F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("office_chair")
        .withModelClassName("com.vicmatskiv.mw.models.OfficeChair")
        .withTextureName("textures/models/officechair.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("office_chair_2")
        .withModelClassName("com.vicmatskiv.mw.models.OfficeChair2")
        .withTextureName("textures/models/officechair.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_corner")
        .withModelClassName("com.vicmatskiv.mw.models.DeskCorner")
        .withTextureName("textures/models/desk.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1.07f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_corner_alt1")
        .withModelClassName("com.vicmatskiv.mw.models.DeskCornerAlt1")
        .withTextureName("textures/models/desk.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1.07f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_left")
        .withModelClassName("com.vicmatskiv.mw.models.DeskLeft")
        .withTextureName("textures/models/desk.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_left_alt1")
        .withModelClassName("com.vicmatskiv.mw.models.DeskLeftAlt1")
        .withTextureName("textures/models/desk.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_middle")
        .withModelClassName("com.vicmatskiv.mw.models.DeskMiddle")
        .withTextureName("textures/models/desk.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_middle_alt1")
        .withModelClassName("com.vicmatskiv.mw.models.DeskMiddleAlt1")
        .withTextureName("textures/models/deskmiddlealt1.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_right")
        .withModelClassName("com.vicmatskiv.mw.models.DeskRight")
        .withTextureName("textures/models/desk.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_right_alt1")
        .withModelClassName("com.vicmatskiv.mw.models.DeskRightAlt1")
        .withTextureName("textures/models/desk.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_shelf")
        .withModelClassName("com.vicmatskiv.mw.models.DeskShelf")
        .withTextureName("textures/models/deskshelf.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_shelf_alt1")
        .withModelClassName("com.vicmatskiv.mw.models.DeskShelfAlt1")
        .withTextureName("textures/models/deskshelfalt1.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_shelf_alt2")
        .withModelClassName("com.vicmatskiv.mw.models.DeskShelfAlt2")
        .withTextureName("textures/models/deskshelf.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("desk_shelf_alt3")
        .withModelClassName("com.vicmatskiv.mw.models.DeskShelfAlt4")
        .withTextureName("textures/models/deskshelfalt4.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("barrier")
        .withModelClassName("com.vicmatskiv.mw.models.Barrier")
        .withTextureName("textures/models/barrier.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.5f, 0.2f, 0.55f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("barrier_rotated")
        .withModelClassName("com.vicmatskiv.mw.models.Barrier")
        .withTextureName("textures/models/barrier.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.5f, 0.2f, 0.55f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("body_bag")
        .withModelClassName("com.vicmatskiv.mw.models.BodyBag")
        .withTextureName("textures/models/bodybag.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.5f, -0.9f, 0.55f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("hanging_body")
        .withModelClassName("com.vicmatskiv.mw.models.HangingBody")
        .withTextureName("textures/models/hangingbody.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.5f, 1.8f, 0.55f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("impaled_body")
        .withModelClassName("com.vicmatskiv.mw.models.ImpaledBody")
        .withTextureName("textures/models/impaledbody.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.5f, 0.2f, 0.55f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("blank")
        .withModelClassName("com.vicmatskiv.mw.models.Black")
        .withTextureName("textures/models/bodybag.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.5f, -0.9f, 0.55f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("dumpster")
        .withModelClassName("com.vicmatskiv.mw.models.Dumpster")
        .withTextureName("textures/models/dumpster.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.6f, 0.2f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("wooden_crate")
        .withModelClassName("com.vicmatskiv.mw.models.WoodenCrate")
        .withTextureName("textures/models/woodencrate.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("wooden_crate_opened")
        .withModelClassName("com.vicmatskiv.mw.models.WoodenCrateOpened")
        .withTextureName("textures/models/woodencrate.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("operating_table")
        .withModelClassName("com.vicmatskiv.mw.models.OperatingTable")
        .withTextureName("textures/models/operatingtable.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("operating_table_alt")
        .withModelClassName("com.vicmatskiv.mw.models.OperatingTableAlt")
        .withTextureName("textures/models/operatingtable.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("forklift")
        .withModelClassName("com.vicmatskiv.mw.models.Forklift")
        .withTextureName("textures/models/forklift.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("forklift_alt")
        .withModelClassName("com.vicmatskiv.mw.models.ForkLiftAlt")
        .withTextureName("textures/models/forkliftalt.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("trusses")
        .withModelClassName("com.vicmatskiv.mw.models.Trusses")
        .withTextureName("textures/models/trusses.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ceiling_lamp")
        .withModelClassName("com.vicmatskiv.mw.models.CeilingLamp")
        .withTextureName("textures/models/ceilinglamp.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1.8f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ceiling_lamp_alt")
        .withModelClassName("com.vicmatskiv.mw.models.CeilingLampAlt")
        .withTextureName("textures/models/ceilinglampalt.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, -0.2f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("vent")
        .withModelClassName("com.vicmatskiv.mw.models.Vent")
        .withTextureName("textures/models/vent.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("vent_rotated")
        .withModelClassName("com.vicmatskiv.mw.models.Vent")
        .withTextureName("textures/models/vent.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1f, 1.5f);
            GL11.glRotatef(-90F, 1f, 0f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("vent_corner")
        .withModelClassName("com.vicmatskiv.mw.models.VentCorner")
        .withTextureName("textures/models/vent.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("vent_corner_rotated")
        .withModelClassName("com.vicmatskiv.mw.models.VentCorner")
        .withTextureName("textures/models/vent.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1f, 1.5f);
            GL11.glRotatef(-90F, 1f, 0f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);

        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("vent_corner_rotated_alt")
        .withModelClassName("com.vicmatskiv.mw.models.VentCorner")
        .withTextureName("textures/models/vent.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1f, -0.5f);
            GL11.glRotatef(90F, 1f, 0f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("vent_intersection")
        .withModelClassName("com.vicmatskiv.mw.models.VentIntersection")
        .withTextureName("textures/models/vent.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("vent_end")
        .withModelClassName("com.vicmatskiv.mw.models.VentEnd")
        .withTextureName("textures/models/vent.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("white_desk_left")
        .withModelClassName("com.vicmatskiv.mw.models.WhiteDeskLeft")
        .withTextureName("textures/models/shelf.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("white_desk_middle")
        .withModelClassName("com.vicmatskiv.mw.models.WhiteDeskMiddle")
        .withTextureName("textures/models/shelf.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("white_desk_right")
        .withModelClassName("com.vicmatskiv.mw.models.WhiteDeskRight")
        .withTextureName("textures/models/shelf.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("trash_bin")
        .withModelClassName("com.vicmatskiv.mw.models.TrashBin")
        .withTextureName("textures/models/trashbin.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("caution_sign")
        .withModelClassName("com.vicmatskiv.mw.models.CautionSign")
        .withTextureName("textures/models/cautionsign.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.6f, 0.45f, 0.6f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("electric_box")
        .withModelClassName("com.vicmatskiv.mw.models.ElectricBox")
        .withTextureName("textures/models/electricbox.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.49f, 1.6f, 0.6f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("electric_box_opened")
        .withModelClassName("com.vicmatskiv.mw.models.ElectricBoxOpened")
        .withTextureName("textures/models/electricbox.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.49f, 1.6f, 0.6f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("home_chair")
        .withModelClassName("com.vicmatskiv.mw.models.HomeChair")
        .withTextureName("textures/models/homechair.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("outdoor_chair")
        .withModelClassName("com.vicmatskiv.mw.models.OutdoorChair")
        .withTextureName("textures/models/outdoorchair.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("home_chair_rotated")
        .withModelClassName("com.vicmatskiv.mw.models.HomeChair")
        .withTextureName("textures/models/homechair.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.WOOD)
        .withName("outdoor_chair_rotated")
        .withModelClassName("com.vicmatskiv.mw.models.OutdoorChair")
        .withTextureName("textures/models/outdoorchair.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("vending_machine")
        .withModelClassName("com.vicmatskiv.mw.models.VendingMachine")
        .withTextureName("textures/models/vendingmachine.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.55f, 0.4f, 0.62f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackLeft")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackLeft")
        .withTextureName("textures/models/serverrackleft.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackEmptyLeft")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackEmptyLeft")
        .withTextureName("textures/models/serverrackemptyright.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackLeftAlt")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackLeftAlt")
        .withTextureName("textures/models/serverrackleftalt.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackLeftAlt2")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackLeftAlt2")
        .withTextureName("textures/models/serverrackleftalt2.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackLeftAlt3")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackLeftAlt3")
        .withTextureName("textures/models/serverrackleftalt3.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackEmptyRight")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackEmptyRight")
        .withTextureName("textures/models/serverrackemptyright.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackRight")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackRight")
        .withTextureName("textures/models/serverrackright.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackRightAlt")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackRightAlt")
        .withTextureName("textures/models/serverrackrightalt.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackTopLeft")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackTop")
        .withTextureName("textures/models/serverrackleft.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("ServerRackTopRight")
        .withModelClassName("com.vicmatskiv.mw.models.ServerRackTopRight")
        .withTextureName("textures/models/serverrackleft.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("DuelFloodLight")
        .withModelClassName("com.vicmatskiv.mw.models.DuelFloodLight")
        .withTextureName("textures/models/duelfloodlight.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.8f, 1f, 0.8f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("FloodLight")
        .withModelClassName("com.vicmatskiv.mw.models.FloodLight")
        .withTextureName("textures/models/duelfloodlight.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.6f, 0.37f, 0.6f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("Radio_rotated")
        .withModelClassName("com.vicmatskiv.mw.models.Radio")
        .withTextureName("textures/models/radio.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.7f, 0.7f, 0.7f);
            GL11.glTranslatef(0.65f, 0.58f, 0.7f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("Radio")
        .withModelClassName("com.vicmatskiv.mw.models.Radio")
        .withTextureName("textures/models/radio.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.7f, 0.7f, 0.7f);
            GL11.glTranslatef(0.65f, 0.58f, 0.6f);
//            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.IRON)
        .withName("camera_rotated")
        .withModelClassName("com.vicmatskiv.mw.models.Camera")
        .withTextureName("textures/models/camera.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0.05f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        }
    
    

}

