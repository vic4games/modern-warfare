package com.vicmatskiv.mw;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemStorage;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

public class Backpacks {

    public static ItemAttachment<Object> Tablet;

    public static Item TacticalPushPack;
    public static Item DesertTacticalPushPack;
    
    public static Item CombatSustainmentBackpack;
    public static Item ForestCombatSustainmentBackpack;
    
    public static Item BlackhawkStealthBackpack;
    public static Item UrbanBlackhawkStealthBackpack;
    public static Item ForestBlackhawkStealthBackpack;
    
    public static Item AssaultBackpack;
    public static Item UrbanAssaultBackpack;
    public static Item ForestAssaultBackpack;
    
    public static Item TruSpecCorduraBackpack;
    public static Item BlackTruSpecCorduraBackpack;
    public static Item DesertTruSpecCorduraBackpack;
    
    public static Item MilSpecAliceBackpack;
    public static Item DesertMilSpecAliceBackpack;
    public static Item UrbanMilSpecAliceBackpack;
    
    public static Item Dufflebag;
    
    public static Item TriZipBackpack;
    
    public static Item PilgrimBackpack;
    
    public static Item F4MTerminatorBackpack;
    public static Item UrbanF4MTerminatorBackpack;
    public static Item ForestF4MTerminatorBackpack;
    
    public static Item BergenBackpack;
    public static Item ForestBergenBackpack;
    public static Item UrbanBergenBackpack;
    
    public static Item SSOAttack2;
    public static Item ForestSSOAttack2;
    
    public static Item G2Gunslinger2Backpack;

    public static void preInit(Object mod, ConfigurationManager configurationManager,
            CompatibleFmlPreInitializationEvent event) {
        
        TacticalPushPack = new ItemStorage.Builder()
        .withName("tactical_push_backpack")
        .withSize(8)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.TacticalPushPack())
        .withModelTextureName("black_tru_spec_cordura_backpack.png")
        .withGuiTextureName("tactical_push_pack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0.2f, -0.55f, 0f);
            GL11.glRotatef(23F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 0f, 0f, 1f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        DesertTacticalPushPack = new ItemStorage.Builder()
        .withName("desert_tactical_push_backpack")
        .withSize(8)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.TacticalPushPack())
        .withModelTextureName("f4m_terminator_backpack.png")
        .withGuiTextureName("tactical_push_pack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0.2f, -0.55f, 0f);
            GL11.glRotatef(23F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 0f, 0f, 1f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        CombatSustainmentBackpack = new ItemStorage.Builder()
        .withName("combat_sustainment_backpack")
        .withSize(10)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.CombatSustainmentBackpack())
        .withModelTextureName("combat_sustainment_backpack.png")
        .withGuiTextureName("combat_sustainment_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(-0f, -0.6f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        ForestCombatSustainmentBackpack = new ItemStorage.Builder()
        .withName("forest_combat_sustainment_backpack")
        .withSize(10)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.CombatSustainmentBackpack())
        .withModelTextureName("forest_combat_sustainment_backpack.png")
        .withGuiTextureName("combat_sustainment_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(-0f, -0.6f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        BlackhawkStealthBackpack = new ItemStorage.Builder()
        .withName("blackhawk_stealth_backpack")
        .withSize(10)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.BlackhawkStealthBackpack())
        .withModelTextureName("black_tru_spec_cordura_backpack.png")
        .withGuiTextureName("blackhawk_stealth_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.4f, 1.4f, 1.4f);
            GL11.glTranslatef(-0f, -0.55f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        UrbanBlackhawkStealthBackpack = new ItemStorage.Builder()
        .withName("urban_blackhawk_stealth_backpack")
        .withSize(12)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.BlackhawkStealthBackpack())
        .withModelTextureName("urban_mil_spec_alice_backpack.png")
        .withGuiTextureName("blackhawk_stealth_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.4f, 1.4f, 1.4f);
            GL11.glTranslatef(-0f, -0.55f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        ForestBlackhawkStealthBackpack = new ItemStorage.Builder()
        .withName("forest_blackhawk_stealth_backpack")
        .withSize(12)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.BlackhawkStealthBackpack())
        .withModelTextureName("forest_bergen_backpack.png")
        .withGuiTextureName("blackhawk_stealth_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.4f, 1.4f, 1.4f);
            GL11.glTranslatef(-0f, -0.55f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        AssaultBackpack = new ItemStorage.Builder()
        .withName("assault_backpack")
        .withSize(16)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.AssaultBackpack())
        .withModelTextureName("assault_backpack.png")
        .withGuiTextureName("assault_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.4f, 1.4f, 1.4f);
            GL11.glTranslatef(-0.1f, -0.6f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        UrbanAssaultBackpack = new ItemStorage.Builder()
        .withName("urban_assault_backpack")
        .withSize(16)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.AssaultBackpack())
        .withModelTextureName("urban_assault_backpack.png")
        .withGuiTextureName("assault_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.4f, 1.4f, 1.4f);
            GL11.glTranslatef(-0.1f, -0.6f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        ForestAssaultBackpack = new ItemStorage.Builder()
        .withName("forest_assault_backpack")
        .withSize(16)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.AssaultBackpack())
        .withModelTextureName("forest_assault_backpack.png")
        .withGuiTextureName("assault_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.
            glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.4f, 1.4f, 1.4f);
            GL11.glTranslatef(-0.1f, -0.6f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        TruSpecCorduraBackpack = new ItemStorage.Builder()
        .withName("tru_spec_cordura_backpack")
        .withSize(20)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.TruSpecCorduraBackpack())
        .withModelTextureName("tru_spec_cordura_backpack.png")
        .withGuiTextureName("tru_spec_cordura_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.4f, 1.4f, 1.4f);
            GL11.glTranslatef(-0.1f, -0.6f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        DesertTruSpecCorduraBackpack = new ItemStorage.Builder()
        .withName("desert_tru_spec_cordura_backpack")
        .withSize(20)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.TruSpecCorduraBackpack())
        .withModelTextureName("desert_tru_spec_cordura_backpack.png")
        .withGuiTextureName("tru_spec_cordura_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.4f, 1.4f, 1.4f);
            GL11.glTranslatef(-0.1f, -0.6f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        BlackTruSpecCorduraBackpack = new ItemStorage.Builder()
        .withName("black_tru_spec_cordura_backpack")
        .withSize(20)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.TruSpecCorduraBackpack())
        .withModelTextureName("black_tru_spec_cordura_backpack.png")
        .withGuiTextureName("tru_spec_cordura_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.4f, 1.4f, 1.4f);
            GL11.glTranslatef(-0.1f, -0.6f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        MilSpecAliceBackpack = new ItemStorage.Builder()
        .withName("mil_spec_alice_backpack")
        .withSize(28)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.MilSpecAliceBackpack())
        .withModelTextureName("mil_spec_alice_backpack.png")
        .withGuiTextureName("mil_spec_alice_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.7f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        DesertMilSpecAliceBackpack = new ItemStorage.Builder()
        .withName("desert_mil_spec_alice_backpack")
        .withSize(28)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.MilSpecAliceBackpack())
        .withModelTextureName("desert_mil_spec_alice_backpack.png")
        .withGuiTextureName("mil_spec_alice_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.7f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        UrbanMilSpecAliceBackpack = new ItemStorage.Builder()
        .withName("urban_mil_spec_alice_backpack")
        .withSize(28)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.MilSpecAliceBackpack())
        .withModelTextureName("urban_mil_spec_alice_backpack.png")
        .withGuiTextureName("mil_spec_alice_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.7f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        Dufflebag = new ItemStorage.Builder()
        .withName("duffle_bag")
        .withSize(24)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.Dufflebag())
        .withModelTextureName("duffle_bag.png")
        .withGuiTextureName("duffle_bag.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.4f, -0.7f, 0f);
            GL11.glRotatef(20F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 1f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        TriZipBackpack = new ItemStorage.Builder()
        .withName("tri_zip_backpack")
        .withSize(32)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.TriZipBackpack())
        .withModelTextureName("tri_zip_backpack.png")
        .withGuiTextureName("tri_zip_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(-0.1f, -0.65f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        PilgrimBackpack = new ItemStorage.Builder()
        .withName("pilgrim_backpack")
        .withSize(34)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.PilgrimBackpack())
        .withModelTextureName("pilgrim_backpack.png")
        .withGuiTextureName("pilgrim_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.15f, -0.7f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        F4MTerminatorBackpack = new ItemStorage.Builder()
        .withName("f4m_terminator_backpack")
        .withSize(35)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.F4MTerminatorBackpack())
        .withModelTextureName("f4m_terminator_backpack.png")
        .withGuiTextureName("f4m_terminator_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.15f, -0.7f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        UrbanF4MTerminatorBackpack = new ItemStorage.Builder()
        .withName("urban_f4m_terminator_backpack")
        .withSize(35)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.F4MTerminatorBackpack())
        .withModelTextureName("urban_f4m_terminator_backpack.png")
        .withGuiTextureName("f4m_terminator_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.15f, -0.7f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        ForestF4MTerminatorBackpack = new ItemStorage.Builder()
        .withName("forest_f4m_terminator_backpack")
        .withSize(35)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.F4MTerminatorBackpack())
        .withModelTextureName("forest_f4m_terminator_backpack.png")
        .withGuiTextureName("f4m_terminator_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.15f, -0.7f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        BergenBackpack = new ItemStorage.Builder()
        .withName("bergen_backpack")
        .withSize(36)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.BergenBackpack())
        .withModelTextureName("bergen_backpack.png")
        .withGuiTextureName("big_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.5f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        ForestBergenBackpack = new ItemStorage.Builder()
        .withName("forest_bergen_backpack")
        .withSize(36)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.BergenBackpack())
        .withModelTextureName("forest_bergen_backpack.png")
        .withGuiTextureName("big_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.5f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        UrbanBergenBackpack = new ItemStorage.Builder()
        .withName("urban_bergen_backpack")
        .withSize(36)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.BergenBackpack())
        .withModelTextureName("urban_bergen_backpack.png")
        .withGuiTextureName("big_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.5f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        
        SSOAttack2 = new ItemStorage.Builder()
        .withName("sso_attack_2")
        .withSize(36)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.SSOAttack2())
        .withModelTextureName("sso_attack_2.png")
        .withGuiTextureName("big_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.5f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        ForestSSOAttack2 = new ItemStorage.Builder()
        .withName("forest_sso_attack_2")
        .withSize(36)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> !(item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.SSOAttack2())
        .withModelTextureName("forest_bergen_backpack.png")
        .withGuiTextureName("big_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.5f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        G2Gunslinger2Backpack = new ItemStorage.Builder()
        .withName("g2_gunslinger2_backpack")
        .withSize(10)
        .withGuiTextureWidth(256)
        .withValidItemPredicate(item -> (item instanceof Weapon))
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.G2Gunslinger2Backpack())
        .withModelTextureName("f4m_terminator_backpack.png")
        .withGuiTextureName("combat_sustainment_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glTranslatef(-0.2f, -0.5f, 0f);
            GL11.glRotatef(-33F, 0f, 1f, 0f);
            GL11.glRotatef(20F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        /*
         * item ->
         * 
         *    (item instanceof ItemAmmo) only Ammo allowed
         *    !(item instanceof ItemAmmo) only Ammo NOT allowed
         *    
         *    (item instanceof Weapon) only Guns allowed
         *    
         *    !(item instanceof Weapon) only Guns NOT allowed
         * 
         *    (item instanceof Weapon && item instanceof ItemAmmo) only guns and ammo allowed
         *    
         *    !(item instanceof Weapon && item instanceof ItemAmmo) only guns and ammo NOT allowed
         *    
         *    (item instanceof Weapon && !item instanceof ItemAmmo) guns allowed but ammo NOT allowed
         */

    }
}
