package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.OKP7;
import com.vicmatskiv.mw.models.OKP7reticle;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.PSO1reticle;
import com.vicmatskiv.mw.models.Saiga12;
import com.vicmatskiv.mw.models.Saiga410;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.makarovfrontsight;
import com.vicmatskiv.mw.models.makarovrearsight;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Saiga410Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("Saiga410")
        .withFireRate(0.4f)
        .withRecoil(8f)
        .withZoom(0.9f)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("Saiga12")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("AKReload")
        .withUnloadSound("akunload")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.14f)
        .withFlashOffsetY(() -> 0.1f)
        .withInaccuracy(7)
        .withPellets(15)
        .withCreativeTab(ModernWarfareMod.ShotgunsTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.MetalComponents,
                Ores.INGOT_STEEL)
        .withInformationProvider(stack -> Arrays.asList("Type: Shotgun", "Damage per Pellet: 4.5", "Pellets per Shot: 15",  
        "Cartridge: .410 Shotgun Shell", "Magazines:", "7rnd .410 Shell Magazine",
        "Fire Rate: Semi"))
        .withCompatibleAttachment(GunSkins.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(Attachments.PSO1, (player, stack) -> {
            
            GL11.glTranslatef(0.14F, -0.9F, -1.1F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        },(model) -> {
            if(model instanceof PSO1reticle) {
                GL11.glTranslatef(-0.212F, -0.486F, 1.27F);
                GL11.glScaled(0.017F, 0.017F, 0.017F);
            }
             else if(model instanceof PSO12) {
                 GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                 GL11.glScaled(0.8F, 0.8F, 0.8F);
             }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Saiga12sights, true, (model) -> {
            if(model instanceof makarovrearsight) {
                GL11.glTranslatef(-0.1393F, -1.51F, -2.8F);
                GL11.glScaled(0.2F, 0.22F, 0.2F);
            }
            else if(model instanceof makarovfrontsight) {
                GL11.glTranslatef(-0.124F, -1.29F, -4.9F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Saiga12action, true, (model) -> {
        })
        .withCompatibleAttachment(Magazines.Saiga410Mag, (model) -> {
//          GL11.glRotatef(7F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
          GL11.glTranslatef(-0.22F, -1.1F, -8.9F);
          GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.04F, -1.216F, -1.65F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.13F, -0.73F, -3.45F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0F, -1.5F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
//              GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.13F, -0.892F, 0.5F);
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
                GL11.glTranslatef(-0.1F, -1.45F, -4.9F);
                GL11.glScaled(0.1F, 0.3F, 0.8F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
         .withCompatibleAttachment(GunSkins.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
        .withTextureNames("Saiga410")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Saiga410())
            //.withTextureName("AK47")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.45f, 1f, -0.4f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.450000f, 1f, -0.3f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.95f, 0.9f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.013F, -0f, -1.2f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(Magazines.Saiga410Mag, (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Saiga12sights.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.Saiga12sights.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.Saiga12sights.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Saiga12action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.Saiga12action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.Saiga12action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.Saiga410Mag.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.Saiga410Mag.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glTranslatef(-0.45f, 1.1f, -0.3f);
                        GL11.glRotatef(-4F, 0f, 0f, 1f);
                        GL11.glRotatef(-8F, 1f, 0f, 0f);
                    }, 350, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glTranslatef(-0.45f, 1.1f, -0.3f);
                        GL11.glRotatef(-4F, 0f, 0f, 1f);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.45f, 1.1f, -0.3f);
                    GL11.glRotatef(-2F, 0f, 0f, 1f);
                    GL11.glRotatef(-15F, 1f, 0f, 0f);
                }, 100, 130),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.45f, 1f, -0.3f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                }, 400, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.45f, 1f, -0.15f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                }, 200, 70),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.4f, 1f, -0.3f);
                    GL11.glRotatef(-8F, 0f, 0f, 1f);
                    GL11.glRotatef(-3F, 1f, 0f, 0f);
                }, 180, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.45f, 1.1f, -0.3f);
                    GL11.glRotatef(-2F, 0f, 0f, 1f);
                    GL11.glRotatef(-15F, 1f, 0f, 0f);
                }, 200, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.45f, 1.1f, -0.3f);
                    GL11.glRotatef(-4F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                }, 100, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.45f, 1.1f, -0.3f);
                    GL11.glRotatef(-4F, 0f, 0f, 1f);
                    GL11.glRotatef(-8F, 1f, 0f, 0f);
                }, 100, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.Saiga12action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Saiga12action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.5F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.Saiga12sights.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Saiga12sights.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.Saiga410Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0.6F, -0.3F);
                        GL11.glRotatef(-25F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.05F, 1.5F, -0.5F);
                        GL11.glRotatef(-30F, 1f, 0f, 0f);
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Saiga410Mag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.05F, 1.5F, -0.5F);
                        GL11.glRotatef(-30F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0.6F, -0.3F);
                        GL11.glRotatef(-25F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                    }, 250, 1000)
                        )
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.95f, 0.8f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.013F, -0f, -1.2f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.350000f, 1.025000f, -0.400000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.149999f, 0.450000f, 0.525000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glTranslatef(0.5f, 0.1f, -0.1f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-70f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glTranslatef(0.49f, 0.14f, -0.1f);
                         GL11.glRotatef(120f, 0, 0f, 1f);
                         GL11.glRotatef(-70f, 1f, 0f, 0f);
                         GL11.glRotatef(25f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.33f, -0.5f, 0.08f);
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
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.02f, -0.38f, 0.500000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0f, -0.625000f, 0.425000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.600000f, 0.225000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glTranslatef(0.5f, 0.15f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glTranslatef(0.5f, 0.15f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glTranslatef(0.5f, 0.15f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.425000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                    }, 280, 0))
             
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.600000f, 0.225000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0f, -0.625000f, 0.425000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.02f, -0.38f, 0.500000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 250, 50))
             
            .build())
        .withSpawnEntityDamage(4.5f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

