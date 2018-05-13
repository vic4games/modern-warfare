package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.models.Ghost350;
import com.vicmatskiv.mw.models.Ghost350bolt;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Bullets {

    public static ItemBullet ShotgunShell;
    public static ItemBullet ShotgunShell410;
    public static ItemBullet Magnum44Ammo;
    public static ItemBullet Bullet762x39;
    public static ItemBullet Bullet556x39;
    public static ItemBullet Bullet556x45;
    public static ItemBullet Bullet762x54;
    public static ItemBullet Bullet762x51;
    public static ItemBullet Bullet45ACP;
    public static ItemBullet Bullet9mm;
    public static ItemBullet Bullet127x40;
    public static ItemBullet Bullet57;
    public static ItemBullet Bullet357;
    public static ItemBullet BMG50;
    public static ItemBullet Bullet145x114;
    public static ItemBullet Bullet57x28;
    public static ItemBullet Bullet46x30;
    public static ItemBullet Carbine30;
    public static ItemBullet Bullet65x39;
    public static ItemBullet Bullet10x24;
    public static ItemBullet Bullet10mm;
    public static ItemBullet Bullet300Blackout;
    public static ItemBullet SMAWRocket;
    public static ItemBullet Bullet50;
    public static ItemBullet Bullet9x39mm;
    public static ItemBullet BulletSpringfield3006;
    public static ItemBullet Bullet545x39;
    public static ItemBullet Bullet762x25;
    public static ItemBullet Bullet8mm;
    public static ItemBullet Bullet308;
    public static ItemBullet Bullet455;
    public static ItemBullet Bullet380200;
    public static ItemBullet Bullet762x21;
    public static ItemBullet Bullet792x33;
    public static ItemBullet Bullet792x57;
    public static ItemBullet Bullet303British;
    public static ItemBullet Ghost350Bolt;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        
        ShotgunShell = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("ShotgunShell")
                .withModel(new com.vicmatskiv.mw.models.ShotgunShell(), "ShotgunShell.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        ShotgunShell410 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("ShotgunShell410")
                .withModel(new com.vicmatskiv.mw.models.ShotgunShell(), "ShotgunShell.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Ghost350Bolt = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Ghost350Bolt")
                .withModel(new Ghost350bolt(), "Ghost350.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(1F, 1F, 1F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(1F, 1F, 1F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 2.6F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.4F, 0.4F, 0.4f);
                })
                .withCraftingRecipe(
                        "A  ",
                        " A ",
                        "  A",
                        'A', Ores.INGOT_STEEL
                        ).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet9x39mm = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet9x39mm")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Gold.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        
        Bullet8mm = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet8mm")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Gold.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        SMAWRocket = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("SMAWRocket").withMaxStackSize(1)
                .withModel(new com.vicmatskiv.mw.models.SMAWRocket(), "SMAW.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, 0.8F, -2.1F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                }).withTextureName("Dummy.png")
                .withCraftingRecipe("AXX",
                'X', CommonProxy.SteelPlate,
                'A', CompatibleBlocks.TNT
        )
                .build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet10x24 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.FunGunsTab).withName("Bullet10x24")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet762x21 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet762x21")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet303British = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet303British")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet792x33 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet792x33")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet792x57 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet792x57")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        
        Magnum44Ammo = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Magnum44Ammo")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet455 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet455")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet380200 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet380200")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Carbine30 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Carbine30")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.6F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.5F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.8F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        BulletSpringfield3006 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("BulletSpringfield3006")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.6F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.5F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.8F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet357 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet357")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.6F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.5F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.8F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet50 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet50AE").withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.6F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.5F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.8F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet9mm = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet9mm")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet127x40 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet127x40")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet57 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet57")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet10mm = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet10mm")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet45ACP = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet45ACP")
                .withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet762x39 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet762x39")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.6F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet46x30 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet46x30")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.6F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet57x28 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet57x28")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.6F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet556x39 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet556x39")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.3F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.3F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet545x39 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet545x39")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.3F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.3F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet762x25 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet762x25")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.3F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.3F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet556x45 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet556x45")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet762x54 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet762x54")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.5F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.6F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.5F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet762x51 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet762x51")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.45F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.55F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.45F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet308 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet308")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.45F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.55F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.45F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet300Blackout = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet300Blackout")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.45F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.55F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.45F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        BMG50 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("BMG50").withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.7F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.7F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.8F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
        
        Bullet145x114 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withName("Bullet145x114").withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.7F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.7F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.8F, 1.4f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

        Bullet65x39 = new ItemBullet.Builder().withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab).withName("Bullet65x39")
                .withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.45F, 1.45F, 1.45f);
                }).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

    }

}
