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
import com.vicmatskiv.mw.models.Glock18C;
import com.vicmatskiv.mw.models.Glock18Cslide;
import com.vicmatskiv.mw.models.Glock19Rockslide;
import com.vicmatskiv.mw.models.Glock19Slide;
import com.vicmatskiv.mw.models.GlockRazorbackSlide;
import com.vicmatskiv.mw.models.GlockRearSight;
import com.vicmatskiv.mw.models.M1911frontsight;
import com.vicmatskiv.mw.models.M1911rearsight;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Glock18CFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("glock_18c")
        .withFireRate(0.999f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("glock")
        .withSilencedShootSound("colt_m45a1_silenced")
        .withReloadSound("glock18c_reload")
        .withUnloadSound("pistol_unload")
        .withInspectSound("inspection")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.14f)
        .withFlashOffsetY(() -> 0.14f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Machine Pistol", 
        "Damage: 5", 
        "Cartridge: 9x19mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 95/100",
        "Magazines:",
        "13rnd 9x19mm Glock Magazine",
        "20rnd 9x19mm Magazine",
        "50rnd 9x19mm Drum Magazine"))
        .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.INGOT_STEEL)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2.5f, // x 
                0.1f, // y
                1f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.Glock18CBody, true, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//          GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.Glock19Body, (model) -> {
//            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.Glock19XBody, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//          GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.Glock19RazorbackBody, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//          GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.Glock18CSlide, true, (model) -> {
            if(model instanceof Glock19Slide) {
                GL11.glScaled(1F, 1F, 1F);
//                GL11.glTranslatef(0F, 0F, 0.5F);
            }
            else if(model instanceof GlockRearSight) {
            	GL11.glTranslatef(-0.107F, -1.17F, 0F);
                GL11.glScaled(0.22F, 0.15F, 0.4F);
            }
            else if(model instanceof M1911frontsight) {
            	GL11.glTranslatef(-0.107F, -1.155F, -2.05F);
                GL11.glScaled(0.21F, 0.24F, 0.16F);
            }
        })
        .withCompatibleAttachment(Attachments.Glock18CCNCSlide, (model) -> {
            if(model instanceof Glock19Slide) {
                GL11.glScaled(1F, 1F, 1F);
//                GL11.glTranslatef(0F, 0F, 0.5F);
            }
            else if(model instanceof GlockRearSight) {
            	GL11.glTranslatef(-0.107F, -1.17F, 0F);
                GL11.glScaled(0.22F, 0.15F, 0.4F);
            }
            else if(model instanceof M1911frontsight) {
            	GL11.glTranslatef(-0.107F, -1.155F, -2.05F);
                GL11.glScaled(0.21F, 0.24F, 0.16F);
            }
        })
        .withCompatibleAttachment(Magazines.Glock18CMag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.GlockMag13, (model) -> {
        })
        .withCompatibleAttachment(Magazines.GlockMag50, (model) -> {
            GL11.glTranslatef(0F, 0F, -0.08F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.05F, -0.65F, -2.3F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
            GL11.glRotatef(-90F, 0f, 0f, -4f);
        })
        .withCompatibleAttachment(Attachments.GlockStock, (model) -> {
            GL11.glTranslatef(0.03F, 0F, 0F);
            GL11.glScaled(0.9F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.18F, -1.19F, -4.36F);
            GL11.glScaled(1.3F, 1.3F, 1.3F);
        })
//        .withCompatibleAttachment(Attachments.GlockHOGUEGrip, (p, s) -> {
//        })
//        .withCompatibleAttachment(Attachments.GlockHOGUEGripTan, (p, s) -> {
//        })
        .withCompatibleAttachment(Attachments.FABDefenseMount, (model) -> {
            GL11.glTranslatef(-0.18f, -0.53f, -1.9f);
            GL11.glScaled(0.6F, 0.6F, 0.7F);
        })
        .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
                GL11.glTranslatef(-0.14F, -1.35F, -1.1F);
                GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.1F, -0.5F);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.015F, -1.1F, -1.4F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withTextureNames("glock19")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Glock18C())
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
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning((renderContext) -> {
                RenderContext<?> rc = (RenderContext<?>) renderContext;
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.STOCK, rc.getWeaponInstance());
                if(activeAttachment == Attachments.GlockStock) {
                	GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.200000f, 0.750000f, -1.599999f);
                } else {
                	GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.200000f, 0.950000f, -1.499999f);
                }
               })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                RenderContext<?> rc = (RenderContext<?>) renderContext;
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.STOCK, rc.getWeaponInstance());
                if(activeAttachment == Attachments.GlockStock) {
                	GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.200000f, 0.750000f, -1.399999f);
                    GL11.glRotatef(-1F, 1f, 0f, 0f);
                } else {
                	GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.200000f, 0.950000f, -1.299999f);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                }
               })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(14F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.15f, 0.45f, -2f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(18F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.15f, 0.45f, -1.8f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);    
                })
                
            .withFirstPersonPositioningCustomRecoiled(Attachments.Glock18CSlide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.7F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Attachments.Glock18CSlide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.7F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
                
            .withFirstPersonCustomPositioning(Attachments.Glock18CSlide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.7F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(Attachments.Glock18CCNCSlide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.7F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Attachments.Glock18CCNCSlide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.7F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
                
            .withFirstPersonCustomPositioning(Attachments.Glock18CCNCSlide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.7F);
                }
            })
                
.withFirstPersonPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-29.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.800000f, -1.680000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-34.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.600000f, -1.500000f);
                    }, 180, 50),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-32.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-39.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.200000f, -1.550000f);
                    }, 150, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-29.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.37f, -1.550000f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-38.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.25f, -1.550000f);
                    }, 90, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-36.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.33f, -1.550000f);
                    }, 120, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-33.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.550000f);
                    }, 230, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-31.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.550000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-32.300000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.550000f);
                    }, 100, 0),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.600000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.450000f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.550000f);
                    }, 80, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-24.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.550000f);
                    }, 100, 0)
                )
                
            .withFirstPersonPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(36F, 0f, 1f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 0.4f, -1.9f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-17F, 1f, 0f, 0f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 1.1f, -1.9f);
                    }, 150, 0),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-14F, 1f, 0f, 0f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-1F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 0.95f, -1.9f);
                    }, 120, 0)
                )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.GlockMag13,
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.05f, 2f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.07f, 1f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
//                    	GL11.glTranslatef(-0.02f, 0f, 0f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0)
                )
                        
            .withFirstPersonCustomPositioningUnloading(Magazines.GlockMag13,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0F, 1F, 0.4F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.7F, 0.4F);
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Magazines.Glock18CMag,
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.05f, 2f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.07f, 1f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
//                    	GL11.glTranslatef(-0.02f, 0f, 0f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0)
                )
                        
            .withFirstPersonCustomPositioningUnloading(Magazines.Glock18CMag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0F, 1F, 0.4F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.7F, 0.4F);
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(Magazines.GlockMag50,
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.05f, 2f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.07f, 1f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
//                    	GL11.glTranslatef(-0.02f, 0f, 0f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0)
                )
                        
            .withFirstPersonCustomPositioningUnloading(Magazines.GlockMag50,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0F, 1F, 0.4F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.7F, 0.4F);
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Glock18CSlide.getRenderablePart(),
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0)
                )
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.Glock18CSlide.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(Attachments.Glock18CCNCSlide.getRenderablePart(),
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0)
                )
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.Glock18CCNCSlide.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.624999f, 0.450000f, -2.174999f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.300000f, 0.925000f, -2.049999f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 10),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 70, 50)
                )
                    
                    
            .withThirdPersonCustomPositioningReloading(Attachments.Glock19Slide.getRenderablePart(),
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
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.29f, 1.6f, -1.8f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.29f, 1.2f, -1.8f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.29f, 0.95f, -1.8f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-8F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.29f, 0.98f, -1.45f);
                    }, 130, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.29f, 0.95f, -1.8f);
                    }, 120, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(Attachments.Glock18CSlide.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonCustomPositioningDrawing(Attachments.Glock18CCNCSlide.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.31f, 0.6f, -2f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.26f, 1.4f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.36f, 1.4f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.31f, 0.6f, -1.7f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                GL11.glRotatef(-1F, 0f, 0f, 1f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.26f, 1.4f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.36f, 1.4f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glRotatef(7F, 1f, 0f, 0f);
                GL11.glTranslatef(0.200000f, 0.800000f, -2.1f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.8f, 0.8f, -2f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.774999f, 0.100000f, -1.949999f);
             })
             .withFirstPersonHandPositioning(
            		 (renderContext) -> {
            			 GL11.glScalef(4f, 4f, 4f);
            			 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
            			 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
            			 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
            			 GL11.glTranslatef(-0.075000f, -0.800000f, 0.025000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.415000f, -0.450000f, 0.165000f);
                     })
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.800000f, 0.075000f);
                        
//                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    }, 
                    (renderContext) -> {
//                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                        
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    })
            .withFirstPersonHandPositioningRunning(
            		(renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.800000f, 0.075000f);
                        
//                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    }, 
                    (renderContext) -> {
//                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                        
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    })
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.275000f, -0.125000f, 0.8f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(110.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.750000f, 0.025000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.550000f, 0.125000f);
                    })
            .withFirstPersonLeftHandPositioningReloading(
                    
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.825000f, 0.200000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.900000f, 0.225000f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 70, 0)
                )
                    
            .withFirstPersonRightHandPositioningReloading(
                    
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                    }, 70, 0)
                )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.850000f, 0.125000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -1.000000f, 0.250000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -1.000000f, 0.250000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 250, 0))
                    
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.800000f, 0.075000f);
                        
//                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    }, 
                    (renderContext) -> {
//                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                        
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    })
                  
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.900000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.725000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.175000f);
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
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
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
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.150000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.150000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, 0.075000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.675000f, 0.150000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.725000f, 0.025000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.675000f, 0.150000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.415000f, -0.450000f, 0.165000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.415000f, -0.450000f, 0.165000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.415000f, -0.450000f, 0.165000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.415000f, -0.450000f, 0.165000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.415000f, -0.450000f, 0.165000f);
                    }, 280, 0)
                    )
                          
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
