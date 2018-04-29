package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M1Garand;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PUmount;
import com.vicmatskiv.mw.models.PUreticle;
import com.vicmatskiv.mw.models.PUscope;
import com.vicmatskiv.mw.models.SVTmount;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M1GarandFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("M1Garand")
        .withFireRate(0.35f)
        .withAmmoCapacity(8)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("m1Garand")
        .withReloadSound("m1garandreload")
        .withUnloadSound("Unload")
        .withEndOfShootSound("m1garandping")
        .withReloadingTime(43)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.4f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.06f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
       .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL,
                CompatibleBlocks.PLANK)
        .withInformationProvider(stack -> Arrays.asList("Type: Semi-automatic Rifle", "Damage: 15", "Cartridge:", ".30-06 Springfield Bullet",
        "Fire Rate: Semi"))
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
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
        .withCompatibleAttachment(GunSkins.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
      .withCompatibleBullet(Bullets.BulletSpringfield3006, (model) -> {})
      .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.16F, -1.247F, -0.9F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.16F, -1.16F, -3F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(0.092F, -1.91F, -0.9F);
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
                GL11.glTranslatef(-0.153F, -1.25F, -6.15F);
                GL11.glScaled(0.3F, 0.3F, 1.2F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(-0.2F, -1.43F, -0.85F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(-0.1F, -1.235F, -0.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M1Garandaction, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 0.44f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M1GarandMag1, true, (model) -> {
//            GL11.glScaled(0.5F, 0.5F, 0.5F);
//            GL11.glTranslatef(-1.8f, -1f, -2.5f);
//            GL11.glRotatef(-20F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M1GarandMag2, true, (model) -> {
//            GL11.glScaled(0.5F, 0.5F, 0.5F);
//            GL11.glTranslatef(-1.8f, -1f, -2.5f);
//            GL11.glRotatef(-20F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M1GarandRearSight, true, (model) -> {
          GL11.glTranslatef(-0.125F, -1.075F, -0.85F);
          GL11.glScaled(0.11F, 0.11F, 0.11F);
        })
//        .withCompatibleAttachment(Attachments.PUscope, (player, stack) -> {
//            GL11.glTranslatef(0.41F, -1.75F, -1.4F);
//            GL11.glScaled(1.1f, 1.1F, 1.1F);
//        },(model) -> {
//             if(model instanceof PUscope) {
//                GL11.glTranslatef(-0.5096F, 0.46F, -0.53F);
//                GL11.glScaled(0.22F, 0.22F, 0.22F);
//            }
//             else if(model instanceof PUmount) {
//                 GL11.glTranslatef(-0.508F, 0.46F, -0.55F);
//                 GL11.glScaled(0.22F, 0.22F, 0.22F);
//             }
//             else if(model instanceof SVTmount) {
//                 GL11.glScalef(0f, 0f, 0f);
//                 GL11.glTranslatef(-0.4F, 1.2F, -0.19F);
//             }
//             else if(model instanceof PUreticle) {
//                 GL11.glTranslatef(-0.5F, 0.23F, 0.82F);
//                 GL11.glScaled(0.03F, 0.03F, 0.03F);
//             }
//        })
        .withTextureNames("M1Garand")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new M1Garand())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.25F, 0.25F, 0.25F);
                GL11.glTranslatef(1, 2.6f, -2.1f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.9F, -1F, 2.2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.425000f, 1.075000f, -0.2f);
                
                
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.42f, 1.085f, 0f);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(0.294f, 0.84f, 0.45f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PUscope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.25f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M1Garandaction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.44F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M1Garandaction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.44F);
                })
            
//            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M1Garandaction.getRenderablePart(), (renderContext) -> {
////                GL11.glTranslatef(0F, 0F, 0.44F);
//                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M1GarandMag1.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M1GarandMag1.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M1GarandMag1.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M1GarandMag2.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M1GarandMag2.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M1GarandMag2.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M1Garandaction.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.44F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M1GarandRearSight.getRenderablePart(), (renderContext) -> {
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M1GarandRearSight.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M1GarandRearSight.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.675000f, 1.424999f, 1.349999f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-28.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.675000f, 1.424999f, 1.44f);
                }, 150, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-28.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.675000f, 1.424999f, 1.44f);
                }, 350, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.675000f, 1.424999f, 1.44f);
                }, 330, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.675000f, 1.424999f, 1.44f);
                }, 340, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.675000f, 1.424999f, 1.44f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.675000f, 1.424999f, 1.349999f);
                }, 310, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.675000f, 1.424999f, 1.349999f);
                }, 200, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.675000f, 1.424999f, 1.349999f);
                }, 120, 0)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M1Garandaction.getRenderablePart(),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.44F);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.44f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.44f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.44f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.44f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.44f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.44f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.44f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M1GarandMag1.getRenderablePart(),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-1.8f, -1f, -2.5f);
                        GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -2.15f, -3.1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -2.15f, -3.1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -1.65f, -3.1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -1.65f, -3.1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -1.65f, -3.1f);
                    }, 250, 200)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M1GarandMag2.getRenderablePart(),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-1.8f, -1f, -2.5f);
                        GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -2.15f, -3.1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -2.15f, -3.1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -1.65f, -3.1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -1.65f, -3.1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-0.22f, -1.65f, -3.1f);
                    }, 250, 200)
            )
            
//            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M1Garandaction.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                }, 150, 50),
//                new Transition((renderContext) -> {
//                }, 150, 50)
//            )
            
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(0.294f, 0.84f, 0.3f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PUscope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.25f, 0.75f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(4f, 4f, 4f);
                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.225000f, 1.5f, 0.225000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4f, 4f, 4f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.725000f, 0.650000f, 0.600000f);
                 
                 
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(2.7f, 2.7f, 5f);
                         GL11.glTranslatef(0.5f, 0.1f, -0.1f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-70f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.275000f, -0.500000f, -0.075000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(2.7f, 2.7f, 4f);
                         GL11.glTranslatef(0.6f, 0.2f, -0.1f);
                         GL11.glRotatef(125f, 0, 0f, 1f);
                         GL11.glRotatef(-60f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.275000f, -0.500000f, -0.075000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.475000f, -1.050000f, -0.100000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.275000f, -0.500000f, -0.075000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.1f, -0.000000f, -0.12f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.025000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.050000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.050000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.050000f, 0.125000f);
                    }, 250, 50)
                    
            )
            .build())
        .withSpawnEntityDamage(15f)
        .withSpawnEntityGravityVelocity(0.028f)
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}