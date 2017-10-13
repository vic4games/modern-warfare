package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.Grip2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.MP9;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class MP9Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("MP9")
//      .withAmmo(CommonProxy.M9Mag)
//      .withAmmoCapacity(10)
        .withFireRate(0.8f)
        .withRecoil(2.7f)
        .withZoom(0.9f)
        //.withMaxShots(1)
        .withShootSound("Weevil")
        .withSilencedShootSound("MP5Silenced")
        .withReloadSound("m4reload")
        .withUnloadSound("m4unload")
        .withReloadingTime(30)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(1f)
        .withFlashScale(() -> 0.7f)
        .withFlashOffsetX(() -> 0.212f)
        .withFlashOffsetY(() -> 0.22f)
        .withCreativeTab(ModernWarfareMod.SMGTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Submachine gun", "Damage: 5", 
        "Caliber: 9mm", "Magazines:", "20rnd 9mm Magazine",
        "Fire Rate: Auto"))
        .withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Fade, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Fade.getTextureVariantIndex("Ruby"));
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
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
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
        .withCompatibleAttachment(GunSkins.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Sapphire.getTextureVariantIndex("Sapphire"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(Magazines.G18Mag, (model) -> {
            GL11.glTranslatef(0F, 0.1F, -0.05F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.25F, -1.04F, -4.4F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.MP5KGrip, true, (model) -> {
            if(model instanceof Grip2) {
                GL11.glTranslatef(-0.2F, -0.2F, -1.4F);
                GL11.glScaled(0.9F, 0.9F, 0.9F);
                GL11.glRotatef(-6F, 1f, 0f, 0f);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.31F, -1.2F, -0.1F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.237F, -0.26F, 0.46F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
            }
        })
        
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.19F, -0.88F, -0.5F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (model) -> {
            if(model instanceof Reflex) {
            GL11.glTranslatef(-0.055F, -1F, -0.9F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.12F, -1.335F, -0.9F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Holo2, (model) -> {
            if(model instanceof Holographic) {
                GL11.glTranslatef(-0.04F, -1.02F, -0.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.335F, -0.4F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Holographic2, (model) -> {
            if(model instanceof Holographic2) {
                GL11.glTranslatef(-0.04F, -1.02F, -0.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.335F, -0.4F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Kobra, (model) -> {
            if(model instanceof Kobra) {
                GL11.glTranslatef(-0.035F, -1.05F, -0.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
                } else if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.12F, -1.335F, -0.9F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
            GL11.glTranslatef(-0.175F, -1.06F, -0.35F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withTextureNames("AK12")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new MP9())
            //.withTextureName("M9")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(0, 0.3f, 0.5F);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.475000f, 0.950000f, -1.050000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.475000f, 0.950000f, -0.85f);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.285f, 0.72f, -0.6f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.005F, 0.278f, 0.3f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.217f, 0.3f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.245f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.205f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.205f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.245f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })

            //.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
                
            .withFirstPersonCustomPositioning(Magazines.G18Mag, (renderContext) -> {})
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.MP5KGrip.getRenderablePart(), (renderContext) -> {
                
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                }
            })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.AR15Action.getRenderablePart(), (renderContext) -> {
                
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                }
            })
            
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.174999f, -0.150000f, -0.850000f);
                    }, 300, 60),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.174999f, -0.150000f, -0.850000f);
                    }, 400, 200),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.500000f, 0.975000f, -1.075000f);
                }, 400, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.500000f, 0.975000f, -1.075000f);
                }, 150, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.500000f, 0.975000f, -1.075000f);
                }, 60, 0)
              
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.174999f, -0.150000f, -0.850000f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.174999f, -0.150000f, -0.850000f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.G18Mag,
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
////                    GL11.glScaled(0.55F, 0.55F, 0.55F);
////                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1.9F, 0.4F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.G18Mag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1.9F, 0.4F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MP5KGrip.getRenderablePart(),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(1.3F, 0.5F, -0.8F);
//                  GL11.glRotatef(10F, 1f, 0f, 0f);
//                  GL11.glRotatef(10F, 0f, 1f, 0f);
//                  GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MP5KGrip.getRenderablePart(),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.05F, 1F, 0F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(1.3F, 0.5F, -0.8F);
//                  GL11.glRotatef(10F, 1f, 0f, 0f);
//                  GL11.glRotatef(10F, 0f, 1f, 0f);
//                  GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.05F, 1F, 0F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                    /*GL11.glRotatef(45F, 0f, 1f, 0f);
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
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.285f, 0.72f, -0.825000f);
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.005F, 0.278f, 0.4f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.217f, 0.4f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.245f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.205f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.205f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.245f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.400000f, 1.174999f, -0.425000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.950000f, 0.600000f, 0.000000f);
             })
              .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 4f);
                         GL11.glTranslatef(0.52f, -0.1f, 0.15f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-40f, 1f, 0f, 0f);
                         GL11.glRotatef(-4f, 1, 0f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(1.6f, 1.6f, 1.6f);
                         GL11.glTranslatef(1.5f, 0.1f, -0.2f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-10f, 1f, 0f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.1f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.950000f, 0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.950000f, 0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, -0.825000f, -0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, -0.950000f, -0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, -0.825000f, -0.050000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                        GL11.glTranslatef(-0.44f, 0.48f, 0.2f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-140f, 1f, 0f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                        GL11.glTranslatef(-0.44f, 0.48f, 0.2f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-140f, 1f, 0f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                        GL11.glTranslatef(-0.44f, 0.48f, 0.2f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-140f, 1f, 0f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.950000f, 0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.950000f, 0.075000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glTranslatef(0.52f, -0.1f, 0.15f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-40f, 1f, 0f, 0f);
                        GL11.glRotatef(-4f, 1, 0f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.34f, 0.48f, 0.3f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-120f, 1f, 0f, 0f);
                         GL11.glRotatef(10f, 0f, 0f, 1f);
                     })
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}