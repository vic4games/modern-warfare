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
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.HS12;
import com.vicmatskiv.mw.models.HS12Barrels;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.M1911frontsight;
import com.vicmatskiv.mw.models.MP43E;
import com.vicmatskiv.mw.models.RPK16handguard;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class HS12Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("hs12")
        .withAmmoCapacity(2)
        .withMaxBulletsPerReload(4)
        .withIteratedLoad()
        .withFireRate(0.3f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("mp43e")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("mp43ereload")
        .withReloadIterationSound("load_shell")
        .withDrawSound("noaction_draw")
        .withAllReloadIterationsCompletedSound("mp43ereloadfin")
        .withReloadingTime(15)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")    
        .withShellCasingEjectEnabled(false)
        .withCrosshairZoomed("Sight")
        .withInaccuracy(8)
        .withPellets(10)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.09f)
        .withFlashOffsetY(() -> 0.12f)
         .withCrafting(CraftingComplexity.HIGH,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 5f, // x 
                 1f, // y
                 10f) // z
         
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Double-Barrel Shotgun",
        "Damage per Pellet: 12",
        "Pellets per Shot: 10", 
        "Cartridge: 12 Gauge Shotgun Shell",
        "Fire Rate: SEMI ACTION",
        "Rate of Fire: 30/100"))
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.HS12Barrels, true, (model) -> {
            if(model instanceof HS12Barrels) {
//              GL11.glScaled(1F, 0.98F, 1);
          } else if(model instanceof AKRail) {
              GL11.glTranslatef(-0.148F, -0.75F, -0.91f);
              GL11.glScaled(0.5F, 0.6F, 0.4F);
          } else if(model instanceof M1911frontsight) {
              GL11.glTranslatef(-0.1F, -0.71F, -4.3f);
              GL11.glScaled(0.2F, 0.4F, 0.4F);
          } else if(model instanceof AKRail2) {   
              GL11.glTranslatef(-0.01F, -0.1F, -4.4f);
              GL11.glScaled(0.5F, 0.6F, 0.33F);
              GL11.glRotatef(180.000000f, 0f, 0f, 1f);
          }
      })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.245F, -0.85F, -0.1F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof AcogScope2) {
                GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            else if(model instanceof AcogReticle) {
                GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.035F, -0.66F, -0.6F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })
    .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
        GL11.glTranslatef(-0.01F, -0.7F, -0.35F);
        GL11.glScaled(0.55F, 0.55F, 0.55F);
    },(model) -> {
        if(model instanceof Holo2) {
            GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
            GL11.glScaled(0.1F, 0.1F, 0.1F);
        }
    })
    .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        GL11.glTranslatef(-0.01F, -0.7F, -0.35F);
        GL11.glScaled(0.55F, 0.55F, 0.55F);
    },(model) -> {
        if(model instanceof Holo2) {
            GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
            GL11.glScaled(0.1F, 0.1F, 0.1F);
        }
    })
//    .withCompatibleAttachment(Attachments.Vortex, (player, stack) -> {
//            GL11.glTranslatef(-0.2F, -0.86F, -0.7F);
//            GL11.glScaled(0.3F, 0.3F, 0.4F);
//        },(model) -> {
//            if(model instanceof Holo2) {
//                GL11.glTranslatef(0.395F, -0.33F, -0.1F);
//                GL11.glScaled(0.15F, 0.15F, 0.15F);
//            }
//        })
    .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef(-0.025F, -0.71F, -0.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })
    .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -0.85F, -0.3F);
            GL11.glScaled(0.28F, 0.28F, 0.28F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
    .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        GL11.glTranslatef(-0.12F, -0.85F, -0.3F);
        GL11.glScaled(0.28F, 0.28F, 0.28F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })
    .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
        GL11.glTranslatef(-0.12F, -0.82F, -0.4F);
        GL11.glScaled(0.26F, 0.26F, 0.26F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.15F, -0.03F, -1.5F);
            GL11.glScaled(0.3F, 0.3F, 0.3F);
        }
    })
        .withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
            GL11.glTranslatef(-0.19F, -0.6F, -8F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleBullet(Bullets.Shotgun12Guage, (model) -> {})
        .withTextureNames("gun")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new HS12())
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
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.3F, -0.1F, 1.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glRotatef(3F, 1f, 0f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.2f, 0.6f, -0.8f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.175000f, 0.525000f, -0.875000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.175000f, 0.525000f, -0.275000f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.HS12Barrels.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.HS12Barrels.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, -0.1f, 0f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.Reflex.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 1.1f, -0.9f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioningReloading(Attachments.Reflex.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 320, 50)
                    )
            
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Reflex.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIteration(Attachments.Reflex.getRenderablePart(),  
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 1.1f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.Holographic.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0.4f, -0.6f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioningReloading(Attachments.Holographic.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 320, 50)
                    )
            
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Holographic.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIteration(Attachments.Holographic.getRenderablePart(),  
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.HolographicAlt.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0.4f, -0.6f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioningReloading(Attachments.HolographicAlt.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 320, 50)
                    )
            
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.HolographicAlt.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIteration(Attachments.HolographicAlt.getRenderablePart(),  
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.6f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.ACOG.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0.4f, -0.9f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioningReloading(Attachments.ACOG.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 320, 50)
                    )
            
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.ACOG.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIteration(Attachments.ACOG.getRenderablePart(),  
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.4f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50)
                )
            
//            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.Vortex.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0f, 1.15f, -0.9f);
//                GL11.glRotatef(35F, 1f, 0f, 0f);
//                GL11.glScalef(1f, 1f, 1f);
//                })
            
//            .withFirstPersonCustomPositioningReloading(Attachments.Vortex.getRenderablePart(),
//                    new Transition((renderContext) -> { // Reload position
//                    }, 250, 50),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 320, 50)
//                    )
            
//            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Vortex.getRenderablePart(),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                    }, 250, 50)
//                )
            
//            .withFirstPersonCustomPositioningLoadIteration(Attachments.Vortex.getRenderablePart(),  
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 250, 50),
//                    
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0f, 1.15f, -0.9f);
//                        GL11.glRotatef(35F, 1f, 0f, 0f);
//                        GL11.glScalef(1f, 1f, 1f);
//                    }, 250, 50)
//                )
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.Kobra.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0.5f, -0.9f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioningReloading(Attachments.Kobra.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 320, 50)
                    )
            
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Kobra.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIteration(Attachments.Kobra.getRenderablePart(),  
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.5f, -0.9f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.MicroT1.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0.75f, -1.5f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioningReloading(Attachments.MicroT1.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 320, 50)
                    )
            
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.MicroT1.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIteration(Attachments.MicroT1.getRenderablePart(),  
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.AimpointCompM5.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0.75f, -1.5f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioningReloading(Attachments.AimpointCompM5.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 320, 50)
                    )
            
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.AimpointCompM5.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIteration(Attachments.AimpointCompM5.getRenderablePart(),  
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.75f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(Attachments.RMR.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0.95f, -1.5f);
                GL11.glRotatef(35F, 1f, 0f, 0f);
                GL11.glScalef(1f, 1f, 1f);
                })
            
            .withFirstPersonCustomPositioningReloading(Attachments.RMR.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 320, 50)
                    )
            
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.RMR.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                )
            
            .withFirstPersonCustomPositioningLoadIteration(Attachments.RMR.getRenderablePart(),  
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0.95f, -1.5f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.HS12Barrels.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 320, 50)
                )
                
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.HS12Barrels.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.HS12Barrels.getRenderablePart(),  
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, -0.1f, 0f);
                    GL11.glRotatef(35F, 1f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }, 250, 50)
            )
                
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(9F, 0f, 0f, 1f);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.15f, 0.8f, -0.8f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(8F, 0f, 0f, 1f);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.15f, 0.65f, -0.8f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(44F, 0f, 1f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glRotatef(3F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.15f, 0.65f, -0.8f);
                }, 140, 0)
            )
            
            .withFirstPersonPositioningAllLoadIterationsCompleted(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.55f, -0.8f);
                    }, 130, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(8F, 0f, 0f, 1f);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.2f, 0.55f, -0.8f);
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(9F, 0f, 0f, 1f);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.2f, 0.67f, -0.8f);
                }, 130, 0)
            )
            
            .withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glRotatef(3F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.2f, 0.6f, -0.8f);
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(6F, 0f, 0f, 1f);
                    GL11.glRotatef(5F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.18f, 0.6f, -0.8f);
                }, 130, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glRotatef(4F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.17f, 0.6f, -0.8f);
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(6F, 0f, 0f, 1f);
                    GL11.glRotatef(4F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.18f, 0.6f, -0.8f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glRotatef(3F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.2f, 0.6f, -0.8f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glRotatef(3F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.2f, 0.6f, -0.8f);
                }, 130, 0)
            )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.150000f, -0.950000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.375000f, 0.700000f, -0.825000f);
                  }, 350, 600)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                        GL11.glRotatef(13F, 0f, 0f, 1f);
                        GL11.glRotatef(9F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.7f, -1.4f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(6F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.5f, -1.4f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.4f, -1.4f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.2f, 0.45f, -1.4f);
                    }, 240, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.31f, -1.1f);
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.3f, 0.8f);
                } 
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.18f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.255f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.255f, 0.5f);
                } 
                
//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GL11.glTranslatef(0f, 0.235f, 0.7f);
//                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 0.7f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.23f, 0.7f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.23f, 0.7f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.122f, 0.7f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.31f, -0.8f);
                GL11.glRotatef(-2.5F, 1f, 0f, 0f);
//                GL11.glRotatef(-2.5F, 0f, 1f, 0f);
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.3f, 0.6f);
                } 
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.18f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.255f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.255f, 0.5f);
                } 
                
//             // Holo Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
//                    //System.out.println("Position me for Holo");
//                    GL11.glTranslatef(0f, 0.235f, 0.7f);
//                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 0.7f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.23f, 0.7f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.23f, 0.7f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.122f, 0.7f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glTranslatef(-0.175000f, 0.925000f, -0.875000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.725000f, 0.1f, -1.324999f);
             }) 
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                     })
                     
            .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.850000f, -0.075000f);
                     })
                     
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
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
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
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
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.075000f, 0.175000f, 0.450000f);
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
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.600000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.500000f, 0.350000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.575000f, 0.400000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
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
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -1.025000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.825000f, 0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.825000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -1.025000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -1.025000f, 0.675000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
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
                    }, 250, 50),
                    
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
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.575000f, 0.400000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.575000f, 0.400000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.650000f, 0.275000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
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
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
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
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.125000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 100)
                    )
                    
            .build())
        .withSpawnEntityDamage(12f)
        .withSpawnEntityGravityVelocity(0.8f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}