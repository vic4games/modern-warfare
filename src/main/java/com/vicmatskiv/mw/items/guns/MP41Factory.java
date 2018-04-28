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
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP40;
import com.vicmatskiv.mw.models.MP41;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class MP41Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("MP41")
//      .withAmmo(CommonProxy.MP40Mag)
//      .withAmmoCapacity(32)
        .withFireRate(0.7f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withMaxShots(Integer.MAX_VALUE, 1)
        .withShootSound("MP40")
        .withSilencedShootSound("MP5Silenced")
        .withReloadSound("mp40reload")
        .withUnloadSound("pistolunload")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.3f)
        .withFlashOffsetX(() -> 0.16f)
        .withFlashOffsetY(() -> 0.09f)
        .withInaccuracy(1)
        .withShellCasingForwardOffset(0.23f)
        .withShellCasingVerticalOffset(-0.02f)
        .withCreativeTab(ModernWarfareMod.SMGTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Submachine gun", "Damage: 6", 
        "Caliber: 9mm", "Magazines:", "32rnd 9mm Magazine",
        "Fire Rate: Auto"))
        .withCompatibleAttachment(GunSkins.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Forest, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Forest.getTextureVariantIndex("Forest"));
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
        .withCompatibleAttachment(Magazines.MP40Mag, (model) -> {
            GL11.glTranslatef(-0.365F, 0.4F, -1.52F);
            GL11.glScaled(1.2F, 1F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.04F, -1.216F, -1.65F);
                GL11.glScaled(0.4F, 0.3F, 0.7F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.18F, -1.19F, -5.63F);
                GL11.glScaled(0.4F, 0.45F, 0.45F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0F, -1.5F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
//              GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.2F, -1.46F, -1.585F);
                GL11.glScaled(0.5F, 0.5F, 0.08F);
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
                GL11.glTranslatef(0.129F, -1.63F, -1.55F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.2F, -1.15F, -7.2F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.MP40action, true, (model) -> {
        })
        .withTextureNames("MP41")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new MP41())
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
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.725000f, 1.1f, -1.1f);
                GL11.glRotatef(3F, 0f, 0f, 1f);
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
//                GL11.glTranslatef(-0.725000f, 1.1f, -2f);
//                GL11.glRotatef(3F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.725000f, 1.1f, -1f);
                GL11.glRotatef(3F, 0f, 0f, 1f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.25f, 0.84f, -0.4f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                GL11.glRotatef(2F, 0f, 0f, 1f);
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                }
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(Magazines.MP40Mag, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.MP40Mag, (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.MP40Mag, (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.MP40action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MP40action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MP40action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
            
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.725000f, 1.1f, -1.1f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                    }, 280, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.725000f, 1.1f, -1.1f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glRotatef(2F, 1f, 0f, 0f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.725000f, 1.1f, -1.1f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glRotatef(-8F, 1f, 0f, 0f);
                    }, 100, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.725000f, 1.1f, -1f);
                    GL11.glRotatef(6F, 0f, 0f, 1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                }, 310, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.725000f, 1.1f, -0.7f);
                    GL11.glRotatef(10F, 0f, 0f, 1f);
                    GL11.glRotatef(-4F, 1f, 0f, 0f);
                }, 200, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.725000f, 1.1f, -0.8f);
                    GL11.glRotatef(6F, 0f, 0f, 1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                }, 210, 40)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.725000f, 1.1f, -1.1f);
                    GL11.glRotatef(-3F, 0f, 0f, 1f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                }, 150, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.725000f, 1.1f, -1.1f);
                    GL11.glRotatef(3F, 0f, 0f, 1f);
                    GL11.glRotatef(-3F, 1f, 0f, 0f);
                }, 150, 0)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.MP40Mag,
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 1F, 0F);
//                  GL11.glRotatef(30F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.MP40Mag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 1F, 0F);
//                  GL11.glRotatef(30F, 0f, 1f, 0f);
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
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MP40action.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.05F, 1F, 0F);
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
                    GL11.glTranslatef(0F, 0F, 1F);
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MP40action.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(1.3F, 0.5F, -0.8F);
//                    GL11.glRotatef(10F, 1f, 0f, 0f);
//                    GL11.glRotatef(10F, 0f, 1f, 0f);
//                    GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.295f, 0.84f, -0.625000f);
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                }
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(3F, 3F, 3F);
                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.6f, 1.3f, -0.8f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                GL11.glScaled(3F, 3F, 3F);
                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.9f, 0.600000f, -0.9f);
             })
               .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 5f);
                         GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.225000f, 0.000000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.575000f, 0.050000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 5f);
                         GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.225000f, 0.000000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.575000f, 0.050000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.150000f, 0.025000f, 0.375000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.575000f, 0.050000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.450000f, 0.425000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.325000f, 0.200000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.325000f, 0.200000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.550000f, -0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.675000f, -0.025000f);
                   }, 250, 0),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.150000f, -0.450000f, 0.375000f);
                  }, 250, 0)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.650000f, 0.050000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.650000f, 0.050000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.650000f, 0.050000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.650000f, 0.050000f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.5f, 3.5f, 3.5f);
                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.425000f, -0.650000f, 0.050000f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.5f, 3.5f, 3.5f);
                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.425000f, -0.650000f, 0.050000f);
                }, 250, 50)
                    )
                
                .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.275000f, 0.650000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 5f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.375000f, 0.575000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.650000f, 0.050000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.650000f, 0.050000f);
                    }, 250, 50))
                    
                    
                
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.028f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
