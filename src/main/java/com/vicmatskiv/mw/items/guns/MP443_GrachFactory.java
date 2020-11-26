package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.Emp1911;
import com.vicmatskiv.mw.models.Emp1911Slide;
import com.vicmatskiv.mw.models.M1911frontsight;
import com.vicmatskiv.mw.models.M1911rearsight;
import com.vicmatskiv.mw.models.M9A1;
import com.vicmatskiv.mw.models.M9A1frontsight;
import com.vicmatskiv.mw.models.M9A1rearsight;
import com.vicmatskiv.mw.models.MP443;
import com.vicmatskiv.mw.models.MP443Slide;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class MP443_GrachFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("mp443_grach")
        .withFireRate(0.7f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("mp443_grach")
        .withSilencedShootSound("m9a1_silenced")
        .withReloadSound("mp443_grach_reload")
        .withUnloadSound("mp443_grach_unload")
        .withInspectSound("inspection")
        .withDrawSound("m17_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.07f)
        .withFlashOffsetY(() -> 0.18f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(ModernWarfareMod.CombatServerTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Military Service Pistol", 
        "Damage: 5", 
        "Cartridge: 9x19mm",
        "Fire Rate: SEMI",
        "Rate of Fire: 70/100",
        "Magazines:",
        "18rnd 9x19mm 443 Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2.5f, // x 
                0.1f, // y
                0.5f) // z
        
        .withCompatibleAttachment(AuxiliaryAttachments.MP443Slide, true, (model) -> {
            if(model instanceof MP443Slide) {
                GL11.glScaled(1F, 1F, 1F);
            }
            else if(model instanceof M1911rearsight) {
                GL11.glTranslatef(0.151F, -1.97F, 0.9F);
                GL11.glScaled(0.4F, 0.35F, 0.35F);
            }
            else if(model instanceof M1911frontsight) {
                GL11.glTranslatef(0.155F, -1.97F, -1.5F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
            }
        })
        .withCompatibleAttachment(Magazines.MP443Mag, (model) -> {
            GL11.glTranslatef(0F, 0F, 0.12F);
            
//            GL11.glTranslatef(0F, 1.4F, 0F);
//            GL11.glRotatef(-8F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.4F, -1F, -2.2F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
            GL11.glRotatef(-90F, 0f, 0f, -4f);
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(0.08F, -1.97F, -4.15F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withTextureNames("mp443")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new MP443())
            //.withTextureName("M9")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-2.7F, -0.4F, 2.5F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(1.5F, 1.5F, 1.5F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(19F, 0f, 0f, 1f);
                GL11.glTranslatef(0.000000f, 1.699999f, -3.124998f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	 GL11.glScaled(1.5F, 1.5F, 1.5F);
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(19F, 0f, 0f, 1f);
                 GL11.glTranslatef(0.000000f, 1.499999f, -3.124998f);
                GL11.glRotatef(-20F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(11F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.8f, 1.4f, -3.4f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(11F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.8f, 1.4f, -3.2f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MP443Slide.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0F, 0F, 1.05F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MP443Slide.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0F, 0F, 1.05F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.MP443Slide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 1.05F);
                }
            })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1.5F, 1.5F, 1.5F);
                        GL11.glRotatef(-38.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.500000f, 1.000000f, -2.825000f);
                    }, 180, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1.5F, 1.5F, 1.5F);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.500000f, 1.130000f, -2.825000f);
                    }, 120, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1.5F, 1.5F, 1.5F);
                        GL11.glRotatef(-43.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.500000f, 0.78000f, -2.825000f);
                    }, 100, 130),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1.5F, 1.5F, 1.5F);
                        GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.800000f, 1.100000f, -3.525000f);
                    }, 180, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1.5F, 1.5F, 1.5F);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.800000f, 1.100000f, -3.625000f);
                    }, 60, 0)
                )
                
            .withFirstPersonPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1.5F, 1.5F, 1.5F);
                        GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.500000f, 1.000000f, -2.825000f);
                    }, 150, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1.5F, 1.5F, 1.5F);
                        GL11.glRotatef(-33.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.500000f, 1.750000f, -2.725000f);
                    }, 90, 0),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(1.5F, 1.5F, 1.5F);
                        GL11.glRotatef(-36.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.500000f, 1.730000f, -2.705000f);
                    }, 100, 0)
                )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.MP443Mag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1.4F, 0F);
                        GL11.glRotatef(-14F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonCustomPositioningUnloading(Magazines.MP443Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 3F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 5F, 0F);
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MP443Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MP443Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.05F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-2.f, 1.5f, -2f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.5f, 2.5f, -2f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-3.6F, -0.4F, 3.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-3.6F, -0.4F, 3.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-3.6F, -0.4F, 3.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 10),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-3.6F, -0.4F, 3.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-3.6F, -0.4F, 3.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-3.6F, -0.4F, 3.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-3.6F, -0.4F, 3.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                        GL11.glTranslatef(-3.6F, -0.4F, 3.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 70, 50)
                )
                    
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.MP443Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.8f, 2.7f, -3.4f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.8f, 2.4f, -3.4f);
                    }, 40, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                        GL11.glRotatef(-7F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.4f, 2.05f, -3f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(41F, 0f, 1f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.4f, 2.15f, -3.35f);
                    }, 50, 100)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.MP443Slide.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 130, 60)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.03f, 1.42f, -3.5f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.03f, 1.15f, -3.3f);
                GL11.glRotatef(-6F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glRotatef(7F, 1f, 0f, 0f);
                GL11.glTranslatef(-0.2f, 1.7f, -3.7f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2f, 1.4f, -2.5f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                       GL11.glScalef(5.5f, 5.5f, 5.5f);
                       GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.350000f, -0.775000f, -0.050000f);
                       
//                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                   }, 
                   (renderContext) -> {
                       GL11.glScalef(5.5f, 5.5f, 5.5f);
                       GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.500000f, -0.550000f, 0.050000f);
                       
//                       GL11.glScalef(5.5f, 5.5f, 5.5f);
//                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                       GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
//                       GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
//                       GL11.glTranslatef(0.425000f, -0.675000f, 0.035000f);
                   })
            .withFirstPersonHandPositioningProning(
            		 (renderContext) -> {
                         GL11.glScalef(5.5f, 5.5f, 5.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.350000f, -0.775000f, -0.050000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(5.5f, 5.5f, 5.5f);
                         GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.500000f, -0.550000f, 0.050000f);
                     })
            .withFirstPersonHandPositioningRunning(
            		 (renderContext) -> {
                         GL11.glScalef(5.5f, 5.5f, 5.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.350000f, -0.775000f, -0.050000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(5.5f, 5.5f, 5.5f);
                         GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.500000f, -0.550000f, 0.050000f);
                     })   
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.275000f, -0.125000f, 0.7f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(5.5f, 5.5f, 5.5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.500000f, -0.575000f, 0.050000f);
                     })
            .withFirstPersonLeftHandPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.725000f, -0.825000f, 0.200000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.150000f, -0.900000f, 0.200000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
	                   	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(-0.150000f, -0.900000f, 0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
	                   	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
	                   	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
	                   	GL11.glTranslatef(-0.350000f, -0.750000f, -0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.315000f, -0.760000f, -0.015000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.675000f, 0.035000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.675000f, 0.035000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.675000f, 0.035000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.675000f, 0.035000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.675000f, 0.035000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
	                   	 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.175000f, -0.200000f, 0.600000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
	                   	 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.175000f, -0.200000f, 0.600000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
	                   	 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.175000f, -0.200000f, 0.600000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.675000f, 0.035000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.675000f, 0.035000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.675000f, 0.035000f);
                    }, 250, 0))
                    
            .withFirstPersonHandPositioningZooming(
            		 (renderContext) -> {
                         GL11.glScalef(5.5f, 5.5f, 5.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.350000f, -0.775000f, -0.050000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(5.5f, 5.5f, 5.5f);
                         GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.500000f, -0.550000f, 0.050000f);
                     })
                  
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.25f, -0.81f, -0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.25f, -0.81f, -0.075000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.575000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.575000f, 0.050000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-48.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-66.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-57.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.725000f, 0.050000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.700000f, -0.100000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.725000f, 0.050000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.575000f, 0.050000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.575000f, 0.050000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.575000f, 0.050000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.575000f, 0.050000f);
                    }, 280, 0)
                    )
                          
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
