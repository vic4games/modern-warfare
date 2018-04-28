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
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PPSH41;
import com.vicmatskiv.mw.models.PPSHRearSight;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class PPSh41Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("PPSh41")
//      .withAmmo(CommonProxy.PPSHDrumMag)
//      .withAmmoCapacity(32)
        .withFireRate(0.8f)
        .withRecoil(3f)
        .withZoom(0.9f)
        //.withMaxShots(5)
        .withShootSound("PPSh41")
        .withSilencedShootSound("PPSh41Silenced")
        .withReloadSound("ppsh41reload")
        .withUnloadSound("type100unload")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.3f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.08f)
        .withInaccuracy(2)
        .withShellCasingForwardOffset(0.23f)
        .withShellCasingVerticalOffset(-0.02f)
        .withCreativeTab(ModernWarfareMod.SMGTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Submachine gun", "Damage: 7.1", 
        "Caliber: 7.52x25mm Tokarev", "Magazines:", "71rnd 7.62x25mm Tokarev Drum Magazine",
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
        .withCompatibleAttachment(Magazines.PPSH41DrumMag, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.04F, -1.216F, -1.65F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.13F, -0.73F, -3.45F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0F, -1.5F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
//              GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.2F, -1.46F, -1.585F);
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
        .withCompatibleAttachment(AuxiliaryAttachments.PPSHRearSight, true, (model) -> {
            if(model instanceof PPSHRearSight) {
                GL11.glTranslatef(-0.1645F, -0.715F, -0.12F);
                GL11.glScaled(0.2F, 0.21F, 0.2F);
            }
        })
//        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
//            GL11.glTranslatef(-0.2F, -1.15F, -7.2F);
//            GL11.glScaled(1F, 1F, 1F);
//        })
        .withCompatibleAttachment(AuxiliaryAttachments.PPSH41action, true, (model) -> {
        })
        .withTextureNames("PPSH41")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new PPSH41())
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
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-1.1F, -0F, 1.2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
                GL11.glTranslatef(-0.45f, 0.65f, -1.4f);
                
//                GL11.glRotatef(40F, 0f, 1f, 0f);
//                GL11.glRotatef(-5F, 0f, 0f, 1f);
//                GL11.glRotatef(-5F, 1f, 0f, 0f);
//                GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
//                GL11.glTranslatef(-0.6f, 0.7f, -1.1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(44F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
                GL11.glTranslatef(-0.45f, 0.65f, -1.2f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(5f, 5f, 5f);
                GL11.glTranslatef(0.21f, 0.425000f, -0.9f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                }
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(Magazines.PPSH41DrumMag, (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.PPSH41DrumMag, (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.PPSH41DrumMag, (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.PPSH41action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.PPSH41action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.5f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.PPSH41action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.5f);
                })
            
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(-5F, 0f, 0f, 1f);
                        GL11.glRotatef(-5F, 1f, 0f, 0f);
                        GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
                        GL11.glTranslatef(-0.6f, 0.7f, -1.1f);
                    }, 300, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(-5F, 0f, 0f, 1f);
                        GL11.glRotatef(-4F, 1f, 0f, 0f);
                        GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
                        GL11.glTranslatef(-0.6f, 0.7f, -1.1f);
                    }, 320, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-5F, 0f, 0f, 1f);
                        GL11.glRotatef(2F, 1f, 0f, 0f);
                        GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
                        GL11.glTranslatef(-0.55f, 0.55f, -1.1f);
                    }, 100, 250),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.175000f, 1.274999f, -0.575000f);
                }, 350, 55),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-44.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.175000f, 1.274999f, -0.35f);
                }, 200, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-42.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.175000f, 1.274999f, -0.45f);
                }, 210, 40)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glRotatef(-4F, 1f, 0f, 0f);
                    GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
                    GL11.glTranslatef(-0.6f, 0.7f, -1.1f);
                }, 150, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                    GL11.glScalef(5.000000f, 5.000000f, 5.000000f);
                    GL11.glTranslatef(-0.6f, 0.7f, -1.1f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.PPSH41DrumMag,
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.7F, 1F, 1F);
//                  GL11.glRotatef(30F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.PPSH41DrumMag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.7F, 1F, 1F);
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
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.PPSH41action.getRenderablePart(),
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.PPSH41action.getRenderablePart(),
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
                GL11.glScalef(5f, 5f, 5f);
                GL11.glTranslatef(0.225000f, 0.425000f, -1.000000f);
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                }
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(5F, 5F, 5F);
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.8f, 1.3f, -0.1f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                GL11.glScaled(5F, 5F, 5F);
                GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-1f, 0f, -1f);
                
             })
               .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.150000f, -0.400000f, 0.375000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.8f, 2.8f, 2.8f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.575000f, -0.700000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.150000f, -0.400000f, 0.375000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.8f, 2.8f, 2.8f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.575000f, -0.700000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.400000f, 0.375000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(2.8f, 2.8f, 2.8f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.700000f, 0.150000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.175000f, 0.225000f, 0.375000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.8f, 2.8f, 2.8f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.575000f, -0.700000f, 0.150000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 5f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.375000f, 0.575000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.625000f, -0.175000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.625000f, -0.175000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.625000f, -0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.625000f, -0.175000f);
                   }, 250, 0),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(3.5f, 3.5f, 3.5f);
                       GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.125000f, -0.625000f, -0.175000f);
                  }, 250, 0)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.8f, 2.8f, 2.8f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.700000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.8f, 2.8f, 2.8f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.700000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.8f, 2.8f, 2.8f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.700000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.8f, 2.8f, 2.8f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.200000f, 0.050000f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(2.8f, 2.8f, 2.8f);
                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.175000f, -0.475000f, -0.025000f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(2.8f, 2.8f, 2.8f);
                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.150000f, -0.200000f, 0.050000f);
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
                        GL11.glScalef(2.8f, 2.8f, 2.8f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.700000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.8f, 2.8f, 2.8f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.700000f, 0.150000f);
                    }, 250, 50))
                    
                    
                
            .build())
        .withSpawnEntityDamage(7.1f)
        .withSpawnEntityGravityVelocity(0.028f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}