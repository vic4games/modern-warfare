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
import com.vicmatskiv.mw.models.Webley;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class WebleyFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("WebleyMkVI")
//      .withAmmo(CommonProxy.Remington870Mag)
        .withAmmoCapacity(6)
        .withMaxBulletsPerReload(6)
        .withFireRate(0.3f)
        .withIteratedLoad()
        .withRecoil(9f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withPumpTimeout(850)
        .withShootSound("webley")
        .withAllReloadIterationsCompletedSound("webleyclose")
        .withReloadSound("webleyopen")
        .withReloadIterationSound("revolverload")
        .withReloadingTime(1000)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")    
        .withShellCasingEjectEnabled(false)
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.11f)
        .withFlashOffsetY(() -> 0.06f)
        .withCreativeTab(ModernWarfareMod.PistolsTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
       .withInformationProvider(stack -> Arrays.asList("Type: Service Revolver", "Damage: 7", 
        "Cartridge: .455 Webley Mk II Bullet", "Fire Rate: Double Action Revolver"))
        
        .withCompatibleAttachment(AuxiliaryAttachments.WebleyCylinder, true, (model) -> {
//            GL11.glTranslatef(0F, -2.6F, -0.45F);
//            GL11.glRotatef(65F, 1f, 0f, 0f);
//            GL11.glScalef(1f, 1f, 1f);
            
            GL11.glScalef(1f, 1f, 1f);
        })
        
        .withCompatibleAttachment(AuxiliaryAttachments.WebleyBullets, true, (model) -> {
//            GL11.glTranslatef(0F, -2.6F, -0.45F);
//            GL11.glRotatef(65F, 1f, 0f, 0f);
//            GL11.glScalef(1f, 1f, 1f);
            
            GL11.glScalef(1f, 1f, 1f);
        })
        
        .withCompatibleBullet(Bullets.Bullet455, (model) -> {})
        .withTextureNames("Webley")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Webley())
            .withPrepareFirstLoadIterationAnimationDuration(900)
            .withAllLoadIterationAnimationsCompletedDuration(400)
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
                GL11.glScaled(0.25F, 0.25F, 0.25F);
                GL11.glTranslatef(-3.5F, -2F, 3.5F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glRotatef(25F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.75f, 2.3f, -3f);
                GL11.glRotatef(-25F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-1.149999f, 1.5f, -5f);
                
//                GL11.glRotatef(35F, 0f, 1f, 0f);
//                GL11.glRotatef(10F, 0f, 0f, 1f);
//                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//                GL11.glTranslatef(-2f, 1.8f, -4f);
//                GL11.glRotatef(-15F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-1.149999f, 1.8f, -4.5f);
                GL11.glRotatef(-15F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(0.43f, 1.1f, -4f);
                GL11.glRotatef(-10F, 1f, 0f, 0f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Leupold)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.185f, 0.45f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.WebleyCylinder.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.WebleyBullets.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.WebleyCylinder.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.WebleyBullets.getRenderablePart(), (renderContext) -> {
                })     
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.WebleyCylinder.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.WebleyBullets.getRenderablePart(), (renderContext) -> {
                })     
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.WebleyCylinder.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, -2.6F, -0.45F);
                GL11.glRotatef(65F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.WebleyBullets.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, -15F, -0.45F);
                GL11.glRotatef(65F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
                
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.WebleyCylinder.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                   GL11.glScalef(1f, 1f, 1f);
                }, 300, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 100, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 280, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 290, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 270, 0)
                )
                
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.WebleyCylinder.getRenderablePart(),
//                new Transition((renderContext) -> { // Reload position\
//                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.WebleyCylinder.getRenderablePart(),  
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.WebleyBullets.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                   GL11.glScalef(1f, 1f, 1f);
                }, 170, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -15F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -15F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -15F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -15F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -15F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.WebleyBullets.getRenderablePart(),
//                new Transition((renderContext) -> { // Reload position\
//                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -2.6F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(1f, 1f, 1f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.WebleyBullets.getRenderablePart(),  
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -15F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, -15F, -0.45F);
                    GL11.glRotatef(65F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50)
            )
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-1.2f, 1.8f, -3f);
                        GL11.glRotatef(-35F, 1f, 0f, 0f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(20F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-1f, 2.3f, -3f);
                        GL11.glRotatef(0F, 1f, 0f, 0f);
                    }, 100, 150),
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-1f, 2.3f, -3f);
                    GL11.glRotatef(-15F, 1f, 0f, 0f);
                }, 270, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-1f, 2.3f, -3f);
                    GL11.glRotatef(-25F, 1f, 0f, 0f);
                }, 250, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-1f, 2.3f, -3f);
                    GL11.glRotatef(-25F, 1f, 0f, 0f);
                }, 260, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-1f, 2.3f, -3f);
                    GL11.glRotatef(-25F, 1f, 0f, 0f);
                }, 240, 0)
            )
            
            .withFirstPersonPositioningAllLoadIterationsCompleted(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(25F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.7f, 2.3f, -3f);
                    GL11.glRotatef(-25F, 1f, 0f, 0f);
                }, 10, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-1f, 2.3f, -3f);
                    GL11.glRotatef(-25F, 1f, 0f, 0f);
                }, 300, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-1f, 2.3f, -3f);
                    GL11.glRotatef(-25F, 1f, 0f, 0f);
                }, 280, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-1.2f, 1.8f, -3f);
                    GL11.glRotatef(-50F, 1f, 0f, 0f);
                }, 100, 150),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-2f, 1.8f, -4f);
                    GL11.glRotatef(-15F, 1f, 0f, 0f);
                }, 300, 0)
            )
            
            .withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(25F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.8f, 2.5f, -3f);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                }, 300, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(23F, 0f, 0f, 1f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glTranslatef(-0.9f, 2.3f, -3f);
                    GL11.glRotatef(-23F, 1f, 0f, 0f);
                }, 290, 0)
            )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(0.43f, 1.1f, -5f);
                GL11.glRotatef(1F, 1f, 0f, 0f);
                
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
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-1.424999f, 3.600005f, -1.125000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-3.299999f, 0.100000f, -0.500000f);
             }) 
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(7f, 7f, 7f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.275000f, -0.700000f, 0.225000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(7f, 7f, 7f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                     })
                     
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(7f, 7f, 7f);
                         GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.175000f, -0.550000f, -0.200000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(7f, 7f, 7f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(7f, 7f, 7f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.275000f, -0.700000f, 0.225000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(7f, 7f, 7f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(7f, 7f, 7f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.000000f, -0.950000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(7f, 7f, 7f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.475000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.475000f, -0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.475000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.575000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.725000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, -0.550000f, -0.200000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, -0.550000f, -0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, -0.550000f, -0.200000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, -0.550000f, -0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, -0.650000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.475000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.500000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, -0.725000f, -0.375000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(7f, 7f, 7f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.575000f, 0.177000f);
                    }, 250, 50)
                    )
                    
            
                    
            .build())
        .withSpawnEntityDamage(7f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
