package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.LeupoldReticle;
import com.vicmatskiv.mw.models.Remington700;
import com.vicmatskiv.mw.models.Remington870;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Remington700Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("Remington700")
//      .withAmmo(CommonProxy.Remington870Mag)
        .withAmmoCapacity(6)
        .withMaxBulletsPerReload(6)
        .withFireRate(0.5f)
        .withEjectRoundRequired()
        .withIteratedLoad()
        .withEjectSpentRoundSound("r700action")
        .withPumpTimeout(1000)
        .withFireRate(0.1f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withPumpTimeout(850)
        .withShootSound("remington700")
        .withAllReloadIterationsCompletedSound("r700boltforward")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("r700boltback")
        .withReloadIterationSound("loadbullet")
        .withReloadingTime(1000)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")    
        .withShellCasingEjectEnabled(false)
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.11f)
        .withFlashOffsetY(() -> 0.06f)
        .withCreativeTab(ModernWarfareMod.SnipersTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
       .withInformationProvider(stack -> Arrays.asList("Type: Sniper rifle", "Damage: 27", 
        "Cartridge: .308 Winchester", "Fire Rate: Bolt Action"))
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(AuxiliaryAttachments.R700action, true, (model) -> {
            GL11.glTranslatef(-0.105F, -0.585F, 0.63F);
            GL11.glScalef(0.62f, 0.62f, 0.5f);
            
            
        })
        .withCompatibleAttachment(Attachments.Leupold, (player, stack) -> {
            GL11.glTranslatef(-0.105F, -0.5F, -0.43F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
             if(model instanceof LeupoldReticle) {
                GL11.glTranslatef(0.076F, -0.52F, 4.0251F);
                GL11.glScaled(0.09F, 0.09F, 0.09F);
            }
        })
        .withCompatibleBullet(Bullets.Bullet308, (model) -> {})
        .withTextureNames("Remington700")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Remington700())
            //.withTextureName("Remington900")
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
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-0.9F, 0.4F, 1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-5F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.4f, 0.4f, -1f);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.4f, 0.4f, -1.3f);
                
                
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.45f, 0.48f, -1.15f);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.22f, 0.150000f, -1.2f);
                GL11.glRotatef(-1F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Leupold)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.185f, 0.45f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.R700action.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.R700action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
                GL11.glScalef(1f, 1f, 1f);
                })
                
            .withFirstPersonPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.3f, 0.35f, -1.1f);
                    }, 170, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.3f, 0.35f, -0.9f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                    }, 150, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.3f, 0.35f, -0.9f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                    }, 150, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.3f, 0.35f, -1.1f);
                    }, 150, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.R700action.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 150, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 150, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.R700action.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                   GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                   GL11.glRotatef(90F, 0f, 0f, 1f);
                   GL11.glScalef(1f, 1f, 1f);
                }, 170, 50),
                new Transition((renderContext) -> { // Reload position
                   GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                   GL11.glRotatef(90F, 0f, 0f, 1f);
                   GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.R700action.getRenderablePart(),
//                new Transition((renderContext) -> { // Reload position\
//                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.R700action.getRenderablePart(),  
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                    GL11.glRotatef(90F, 0f, 0f, 1f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50)
            )
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.3f, 0.35f, -1.1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.3f, 0.35f, -0.9f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                    }, 220, 40),
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.4f, 0.35f, -1f);
                }, 170, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.4f, 0.4f, -1f);
                    GL11.glRotatef(-1F, 1f, 0f, 0f);
                }, 200, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.4f, 0.4f, -1f);
                    GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                }, 220, 0)
            )
            
            .withFirstPersonPositioningAllLoadIterationsCompleted(
                    
//                new Transition((renderContext) -> { // Reload position
//                    GL11.glRotatef(45F, 0f, 1f, 0f);
//                    GL11.glRotatef(-5F, 0f, 0f, 1f);
//                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
//                    GL11.glTranslatef(-0.4f, 0.35f, -1f);
//                }, 230, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.3f, 0.35f, -0.9f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                }, 230, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glRotatef(8F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.3f, 0.35f, -1.1f);
                }, 150, 0)
            )
            
            .withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.4f, 0.4f, -1f);
                    GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.4f, 0.4f, -1f);
                    GL11.glRotatef(-1F, 1f, 0f, 0f);
                }, 170, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.38f, 0.43f, -1f);
                    GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                }, 290, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.38f, 0.42f, -1f);
                    GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                }, 180, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.4f, 0.41f, -1f);
                    GL11.glRotatef(-1F, 1f, 0f, 0f);
                }, 200, 0)
            )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.150000f, -1.3f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Leupold)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.185f, 0.45f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.3f, 0.65f, -0.5f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.475000f, -0.025000f, -0.625000f);
             }) 
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
//                       GL11.glScalef(2.5f, 2.5f, 2.5f);
//                       GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
//                       GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
//                       GL11.glRotatef(55.000000f, 0f, 0f, 1f);
//                       GL11.glTranslatef(0.275000f, -0.075000f, -0.475000f);
                         
                         GL11.glScalef(2.5f, 2.5f, 5.5f);
                         GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                         
//                         GL11.glScalef(2f, 2f, 2f);
                     })
                     
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 5.5f);
                         GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 5.5f);
                         GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, -0.475000f, -0.18f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.000000f, -1.050000f, 0.550000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, -0.225000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
//                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.600000f, -0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
//                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                        GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.575000f, -0.325000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.725000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.550000f, 0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.475000f, 0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.550000f, 0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.725000f, 0.000000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(2.5f, 2.5f, 5.5f);
//                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
//                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(2f, 2f, 2f);
//                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
//                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.575000f, -0.325000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.600000f, -0.200000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, -0.225000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
//                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.600000f, -0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
//                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                        GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.575000f, -0.325000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.575000f, -0.325000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.600000f, -0.200000f);
                    }, 250, 50)
                    
                    )
                    
            .build())
        .withSpawnEntityDamage(27f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
