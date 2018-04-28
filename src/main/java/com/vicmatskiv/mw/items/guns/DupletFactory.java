package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.Duplet;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.KSG12;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class DupletFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("Duplet")
//      .withAmmo(CommonProxy.Remington870Mag)
        .withAmmoCapacity(7)
        .withMaxBulletsPerReload(2)
        .withFireRate(0.6f)
        .withRecoil(8f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("KSG12")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("ShotgunReload")
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withInaccuracy(10)
        .withPellets(10)
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.15f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(ModernWarfareMod.FunGunsTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.MetalComponents,
                CompatibleBlocks.PLANK)
        .withInformationProvider(stack -> Arrays.asList("Type: Double Barrel Shotgun", "Damage per Pellet: 10", "Pellets per Shot: 10", 
        "Ammo: 12 Gauge Shotgun Shell", "Fire Rate: Semi"))
        .withCompatibleAttachment(AuxiliaryAttachments.DupletBarrels, true, (model) -> {
        })
        .withCompatibleBullet(Bullets.ShotgunShell, (model) -> {})
//        .withCompatibleAttachment(GunSkins.ElectricSkin, 
//                (a, i) -> {
//                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
//                }, 
//                (a, i) -> {
//                }
//        )
//        .withCompatibleAttachment(GunSkins.Amber, 
//                (a, i) -> {
//                    i.setActiveTextureIndex(GunSkins.Amber.getTextureVariantIndex("Amber"));
//                }, 
//                (a, i) -> {
//                }
//        )
//        .withCompatibleAttachment(GunSkins.Fade, 
//                (a, i) -> {
//                    i.setActiveTextureIndex(GunSkins.Fade.getTextureVariantIndex("Ruby"));
//                }, 
//                (a, i) -> {
//                }
//        )
//        .withCompatibleAttachment(GunSkins.Emerald, 
//                (a, i) -> {
//                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
//                }, 
//                (a, i) -> {
//                }
//        )
//        .withCompatibleAttachment(GunSkins.Diamond, 
//                (a, i) -> {
//                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
//                }, 
//                (a, i) -> {
//                }
//        )
//        .withCompatibleAttachment(GunSkins.Gold, 
//                (a, i) -> {
//                    i.setActiveTextureIndex(GunSkins.Gold.getTextureVariantIndex("Gold"));
//                }, 
//                (a, i) -> {
//                }
//        )
//        .withCompatibleAttachment(GunSkins.Sapphire, 
//                (a, i) -> {
//                    i.setActiveTextureIndex(GunSkins.Sapphire.getTextureVariantIndex("Sapphire"));
//                }, 
//                (a, i) -> {
//                }
//        )
//        .withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
//            GL11.glTranslatef(0.107F, -1.32F, -4F);
//            GL11.glScaled(1.3F, 1.3F, 1.3F);
//        })
        .withTextureNames("Duplet")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Duplet())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })

            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                GL11.glTranslatef(-0.500000f, 1.100000f, -0.475000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                GL11.glTranslatef(-0.500000f, 1.100000f, 0.2f);
                GL11.glRotatef(-4F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                GL11.glTranslatef(0.200000f, 0.950000f, -0.1f);
                GL11.glRotatef(-2.5F, 1f, 0f, 0f);
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.DupletBarrels.getRenderablePart(), (renderContext) -> {
                })
         
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.575000f, 1.349999f, 1.075000f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.575000f, 1.349999f, 1.075000f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.575000f, 1.349999f, 1.075000f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.575000f, 1.349999f, 1.075000f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.575000f, 1.349999f, 1.075000f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.575000f, 1.349999f, 1.075000f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.1F, -0.2F, -0.3F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                
                    GL11.glRotatef(-45F, 1f, 0f, 2f);
                    GL11.glTranslatef(1F, -1.2F, 0F);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.1F, -0.2F, -0.3F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                
                    GL11.glRotatef(-45F, 1f, 0f, 2f);
                    GL11.glTranslatef(1F, -1.2F, 0F);
                }, 250, 50)
            )
    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.DupletBarrels.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                    
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(50F, 1f, 0f, 0f);
                    GL11.glTranslatef(0F, -2.3F, 0.7F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(50F, 1f, 0f, 0f);
                    GL11.glTranslatef(0F, -2.3F, 0.7F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(50F, 1f, 0f, 0f);
                    GL11.glTranslatef(0F, -2.3F, 0.7F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(50F, 1f, 0f, 0f);
                    GL11.glTranslatef(0F, -2.3F, 0.7F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(50F, 1f, 0f, 0f);
                    GL11.glTranslatef(0F, -2.3F, 0.7F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(50F, 1f, 0f, 0f);
                    GL11.glTranslatef(0F, -2.3F, 0.7F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
                )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                GL11.glTranslatef(0.200000f, 0.950000f, -0.550000f);
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.250000f, 1.224999f, 0.200000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(6.000000f, 6.000000f, 6.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.025000f, 0.675000f, 0.350000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 6f);
                         GL11.glTranslatef(0.47f, 0.12f, -0.02f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-80f, 1f, 0f, 0f);
                         GL11.glRotatef(40f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                     })
                     
            .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 6f);
                         GL11.glTranslatef(0.47f, 0.12f, -0.02f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-80f, 1f, 0f, 0f);
                         GL11.glRotatef(40f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.13f, 0.26f, 0.45f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.800000f, 0.150000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                    }, 250, 50)
                    )
                    
            .build())
        .withSpawnEntityDamage(10f)
        .withSpawnEntityGravityVelocity(0.8f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}