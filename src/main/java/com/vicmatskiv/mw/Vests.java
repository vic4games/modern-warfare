package com.vicmatskiv.mw;

import net.minecraft.creativetab.CreativeTabs;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.weaponlib.ItemVest;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

public class Vests {

    public static void preInit(Object mod, ConfigurationManager configurationManager,
            CompatibleFmlPreInitializationEvent event) {

        new ItemVest.Builder()
        .withName("flyye_field_compact_plate_carrier")
        .withDamageReduceAmount(50) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.FlyyeFieldCompactCarrier())
        .withModelTextureName("f4m_terminator_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("forest_flyye_field_compact_plate_carrier")
        .withDamageReduceAmount(50) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.FlyyeFieldCompactCarrier())
        .withModelTextureName("forest_bergen_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("black_flyye_field_compact_plate_carrier")
        .withDamageReduceAmount(50) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.FlyyeFieldCompactCarrier())
        .withModelTextureName("black_tru_spec_cordura_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("flyye_molle_rrv")
        .withDamageReduceAmount(30) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.FlyyeMOLLERRV())
        .withModelTextureName("f4m_terminator_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("black_flyye_molle_rrv")
        .withDamageReduceAmount(30) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.FlyyeMOLLERRV())
        .withModelTextureName("black_tru_spec_cordura_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("urban_flyye_molle_rrv")
        .withDamageReduceAmount(30) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.FlyyeMOLLERRV())
        .withModelTextureName("urban_f4m_terminator_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("force_recon_vest")
        .withDamageReduceAmount(15) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.ForceReconVest())
        .withModelTextureName("f4m_terminator_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("forest_force_recon_vest")
        .withDamageReduceAmount(15) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.ForceReconVest())
        .withModelTextureName("forest_bergen_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("urban_force_recon_vest")
        .withDamageReduceAmount(15) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.ForceReconVest())
        .withModelTextureName("urban_f4m_terminator_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("black_force_recon_vest")
        .withDamageReduceAmount(15) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.ForceReconVest())
        .withModelTextureName("black_tru_spec_cordura_backpack.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("umbrella_corp_vest")
        .withDamageReduceAmount(1000) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.UmbrellaCorpVest())
        .withModelTextureName("umbrellacorp.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("marine_vest")
        .withDamageReduceAmount(500) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.MarineVest())
        .withModelTextureName("marine.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
        
        new ItemVest.Builder()
        .withName("swat_vest")
        .withDamageReduceAmount(100) // use numbers from 1 to 8
        .withDurability(100) // works the same way as shield's max capacity
        .withTab(CreativeTabs.MISC)
        .withModel(new com.vicmatskiv.mw.models.SwatVest())
        .withModelTextureName("swat.png")
        .withCustomEquippedPositioning((player, stack) -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0f, 0f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
        })
        .withInventoryPositioning(stack -> {
            GL11.glScalef(1.3f, 1.3f, 1.3f);
            GL11.glTranslatef(0f, -0.55f, 0f);
            GL11.glRotatef(-200F, 0f, 1f, 0f);
            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
    
    

}
