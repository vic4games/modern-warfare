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
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Gewehr98;
import com.vicmatskiv.mw.models.Ghost350;
import com.vicmatskiv.mw.models.Ghost350bolt;
import com.vicmatskiv.mw.models.Ghost350string1;
import com.vicmatskiv.mw.models.Ghost350string2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.LeeEnfieldClip;
import com.vicmatskiv.mw.models.LeeEnfieldClipBullets;
import com.vicmatskiv.mw.models.LeeEnfieldSMLEAction;
import com.vicmatskiv.mw.models.LeeEnfieldSMLEMk3;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PUmount;
import com.vicmatskiv.mw.models.PUreticle;
import com.vicmatskiv.mw.models.PUscope;
import com.vicmatskiv.mw.models.PriscopicScope;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.SVTmount;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.UnertlReticle;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Ghost350Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("Ghost350")
        .withAmmoCapacity(1)
        .withFireRate(0.16f)
        .withRecoil(1f)
        .withZoom(0.8f)
        .withMaxShots(1)
        .withShootSound("Ghost350")
        //.withSilencedShootSound("AR15silenced")
        .withReloadSound("ghost350reload")
//       .withReloadSound("drawweapon")
//        .withReloadIterationSound("loadshell")
        .withReloadingTime(500)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withSmokeOffsetX(() -> 20f)
        .withSmokeOffsetY(() -> 20f)
        .withFlashIntensity(0f)
        .withFlashScale(() -> 0f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.1f)
        .withShootSoundVolume(1f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(ModernWarfareMod.SnipersTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.MetalComponents,
                CompatibleBlocks.PLANK)
        .withInformationProvider(stack -> Arrays.asList("Type: Crossbow", "Damage: 25", "Cartridge:", 
        "Ghost-350 Crossbow Bolt"))
        .withCompatibleAttachment(AuxiliaryAttachments.CrossbowString1, true, (model) -> {
            if(model instanceof Ghost350string1) {
//                GL11.glRotatef(-68F, 0f, 1f, 0f);
//                GL11.glScalef(2.7f, 1f, 1f);
//                GL11.glTranslatef(-0.15f, 0.01f, 5.1f);
            }
        })
        
        .withCompatibleAttachment(AuxiliaryAttachments.CrossbowString2, true, (model) -> {
            if(model instanceof Ghost350string2) {
            }
        })
        
        .withCompatibleAttachment(AuxiliaryAttachments.CrossbowBolt, true, (model) -> {
            if(model instanceof Ghost350bolt) {
            }
        })
        .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
            if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.24F, -1.56F, -1.7F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.14F, -1.566F, 0.3F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.39F, -2.8F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.19F, -2.4F, -1.7F);
                GL11.glScaled(0.65F, 1.1F, 0.2F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(-0.125F, -1.98F, -0F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.8F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.145F, -2F, -1.75F);
                GL11.glScaled(0.5F, 0.5F, 0.85F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MBUSiron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.26F, -1.93F, -0.4F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
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
        .withCompatibleAttachment(Attachments.MicroT1, (model) -> {
            if(model instanceof MicroT1) {
                GL11.glTranslatef(-0.13F, -1.92F, -0.6F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.085F, -2.02F, -0.7F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.RMR, (model) -> {
            if(model instanceof RMRsight) {
                GL11.glTranslatef(-0.13F, -1.92F, -0.6F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.085F, -1.95F, -0.7F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -1.6F, -0.6F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })

        .withCompatibleAttachment(Attachments.Scope, (player, stack) -> {

            GL11.glTranslatef(-0.275F, -1.88F, -0.2F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
             if(model instanceof LPscope) {
                GL11.glTranslatef(0.237F, -0.272F, 0.67F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (model) -> {
            if(model instanceof Reflex) {
            GL11.glTranslatef(-0.034F, -1.75F, -0.5F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.085F, -2F, -0.5F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Kobra, (model) -> {
            if(model instanceof Kobra) {
                GL11.glTranslatef(-0.022F, -1.75F, -0.4F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.085F, -1.96F, -0.7F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Holo2, (model) -> {
            if(model instanceof Holographic) {
                GL11.glTranslatef(-0.01F, -1.75F, -0.8F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.085F, -2.04F, -0.8F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
            }
        })
        .withCompatibleAttachment(Attachments.Holographic2, (model) -> {
            if(model instanceof Holographic2) {
                GL11.glTranslatef(-0.01F, -1.75F, -0.8F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.085F, -2.04F, -0.8F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
            }
        })
        .withCompatibleBullet(Bullets.Ghost350Bolt, (model) -> {})
        .withTextureNames("Ghost350")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Ghost350())
            //.withTextureName("AWP")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.32F, 0.32F, 0.32F);
                GL11.glTranslatef(1, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-2.5F, -1F, 2.5F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.875000f, 1.599999f, -1.025000f);
                
//                GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(1.400000f, 1.050000f, -0.600000f);
                })
            
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.875000f, 1.599999f, -0.8f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.31f, 1.48f, -0.42f);
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    GL11.glTranslatef(0f, 0.09f, 0.7f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    GL11.glTranslatef(0f, -0.07f, 0f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    GL11.glTranslatef(0f, -0.04f, 0f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    GL11.glTranslatef(0f, 0.01f, 0f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    GL11.glTranslatef(0.01f, -0.03f, 0.7f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    GL11.glTranslatef(0.005f, 0.05f, 0.4f);
                }  

                // Everything else
                else {
                }   
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.CrossbowString1.getRenderablePart(), (renderContext) -> {
                if (renderContext.getWeaponInstance() .getAmmo() > 0) {
                    GL11.glRotatef(-68F, 0f, 1f, 0f);
                    GL11.glScalef(2.7f, 1f, 1f);
                    GL11.glTranslatef(-0.15f, 0.01f, 5.1f);
                } else {
                    GL11.glTranslatef(0f, 0.01f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }
            })
               
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.CrossbowString2.getRenderablePart(), (renderContext) -> {
                if (renderContext.getWeaponInstance() .getAmmo() > 0) {
                    GL11.glRotatef(68F, 0f, 1f, 0f);
                    GL11.glScalef(2.7f, 1f, 1f);
                    GL11.glTranslatef(0.2f, 0.01f, 5f);
                } else {
                    GL11.glTranslatef(0f, 0.01f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 0f);
                    GL11.glScalef(1f, 1f, 1f);
                }
            })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.CrossbowBolt.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(-10f, 20f, -10f);
                }
            })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.CrossbowString1.getRenderablePart(), (renderContext) -> {
                })
              
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.CrossbowString1.getRenderablePart(), (renderContext) -> {
                }) 
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.CrossbowString2.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.CrossbowString2.getRenderablePart(), (renderContext) -> {
                }) 
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.CrossbowBolt.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, -10f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.CrossbowBolt.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, -10f);
                })
                
            .withFirstPersonPositioningReloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(60.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.475000f, -2.975002f);
                }, 470, 130),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(60.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.475000f, -3f);
                }, 460, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(60.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.475000f, -2.9f);
                }, 230, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(60.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.150000f, 0.475000f, -2.975002f);
                }, 200, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.875000f, 1.599999f, -1.025000f);
                }, 350, 0)
            )
                
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.CrossbowString1.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0.01f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0.01f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0.01f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(-68F, 0f, 1f, 0f);
                        GL11.glScalef(2.7f, 1f, 1f);
                        GL11.glTranslatef(-0.15f, 0.01f, 5.1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(-68F, 0f, 1f, 0f);
                        GL11.glScalef(2.7f, 1f, 1f);
                        GL11.glTranslatef(-0.15f, 0.01f, 5.1f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.CrossbowString2.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0.01f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0.01f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0.01f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 0f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(68F, 0f, 1f, 0f);
                        GL11.glScalef(2.7f, 1f, 1f);
                        GL11.glTranslatef(0.2f, 0.01f, 5f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(68F, 0f, 1f, 0f);
                        GL11.glScalef(2.7f, 1f, 1f);
                        GL11.glTranslatef(0.2f, 0.01f, 5f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.CrossbowBolt.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-10f, 20f, -10f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-10f, 20f, -10f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-10f, 20f, -10f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.31f, 1.48f, -0.5f);
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    GL11.glTranslatef(0f, 0.09f, 0.7f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    GL11.glTranslatef(0f, -0.07f, 0f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    GL11.glTranslatef(0f, -0.04f, 0f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    GL11.glTranslatef(0f, 0.01f, 0f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    GL11.glTranslatef(0.01f, -0.03f, 0.7f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    GL11.glTranslatef(0.005f, 0.05f, 0.4f);
                }  

                // Everything else
                else {
                }   
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.7f, 0.8f, 0.275000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.500000f, 1.525000f, -0.200000f);
             })
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(5f, 5f, 5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(5f, 5f, 5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                    })
                    
             .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(5f, 5f, 5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(5f, 5f, 5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                     })
                    
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.025000f, 0.175000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                    }, 250, 1000),
                    
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.450000f, 0.175000f);
                    }, 250, 1000))
                    
            .build())
        .withSpawnEntityDamage(25f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

