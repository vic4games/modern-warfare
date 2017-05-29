package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M1Garand;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M1GarandFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("M1Garand")
//      .withAmmo(CommonProxy.MP5Mag)
        .withAmmoCapacity(8)
        .withFireRate(0.2f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("m1Garand")
        .withReloadSound("MosinReload")
        .withUnloadSound("Unload")
        .withReloadingTime(43)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(1f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.08f)
        .withInaccuracy(1)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
       .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.SteelIngot,
                CompatibleBlocks.PLANK)
        .withInformationProvider(stack -> Arrays.asList("Type: Semi-automatic Rifle", "Damage: 15", "Cartridge:", ".30-06 Springfield Bullet",
        "Fire Rate: Semi"))
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(GunSkins.Amber, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amber.getTextureVariantIndex("Amber"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
     .withCompatibleBullet(Bullets.BulletSpringfield3006, (model) -> {})
      .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.16F, -1.247F, -0.9F);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.16F, -1.16F, -3F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);  
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.153F, -1.25F, -6.15F);
                GL11.glScaled(0.3F, 0.3F, 1.2F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(-0.2F, -1.43F, -0.85F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(-0.1F, -1.235F, -0.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withTextureNames("M1Garand")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new M1Garand())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.25F, 0.25F, 0.25F);
                GL11.glTranslatef(1, 2.6f, -2.1f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.2F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glTranslatef(0.5F, -0.2F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
                GL11.glTranslatef(-0.5F, -0.7F, 1.3F);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glTranslatef(0.5F, -0.2F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
                GL11.glTranslatef(-0.5F, -0.7F, 1.6F);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glTranslatef(0F, -0.345F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);

                // Zoom
                GL11.glTranslatef(0.315F, -1.21f, 1.8f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.285f, 0.53f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.236f, 0.7f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.236f, 0.7f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.235f, 0.7f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(1.373F, -1.15f, 3.2f);
                }
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
            
            .withFirstPersonCustomPositioning(Magazines.MP5KMag, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.525000f, 0.200000f, 0.775000f);
                }, 250, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.525000f, 0.200000f, 0.775000f);
                }, 250, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.525000f, 0.200000f, 0.775000f);
                }, 250, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.825000f, 0.500000f, 0.650000f);
                }, 350, 250),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.825000f, 0.500000f, 0.650000f);
                }, 350, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.525000f, 0.200000f, 0.775000f);
                }, 250, 0)
            )
            
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(0F, -0.345F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);

                // Zoom
                GL11.glTranslatef(0.315F, -1.21f, 1.7f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.285f, 0.53f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.236f, 0.7f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.236f, 0.7f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.235f, 0.7f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(1.373F, -1.15f, 3.2f);
                }
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.050000f, 0.050000f, 0.325000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.175000f, -0.125000f, 0.400000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(2.7f, 2.7f, 4f);
                         GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-70f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.25f, 0.15f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-7f, 0, 1f, 0f);
                         GL11.glRotatef(-110f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(2.7f, 2.7f, 4f);
                         GL11.glTranslatef(0.6f, 0.2f, -0.1f);
                         GL11.glRotatef(125f, 0, 0f, 1f);
                         GL11.glRotatef(-60f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.4f, 0.1f, 0.3f);
                         GL11.glRotatef(95f, 0, 0f, 1f);
                         GL11.glRotatef(-7f, 0, 1f, 0f);
                         GL11.glRotatef(-130f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.475000f, -1.050000f, -0.100000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glRotatef(40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-105.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(155.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.250000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-105.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(155.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.125000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glRotatef(105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(160.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(150.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.400000f, -0.250000f, 0.225000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, 0.050000f, -0.425000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, 0.025000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-105.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(155.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, 0.125000f, 0.075000f);
                    }, 250, 50)
                    
            )
            .build())
        .withSpawnEntityDamage(15f)
        .withSpawnEntityGravityVelocity(0.028f)
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}