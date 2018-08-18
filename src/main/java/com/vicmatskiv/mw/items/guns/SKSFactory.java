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
import com.vicmatskiv.mw.models.PUmount;
import com.vicmatskiv.mw.models.PUreticle;
import com.vicmatskiv.mw.models.PUscope;
import com.vicmatskiv.mw.models.SKS;
import com.vicmatskiv.mw.models.SVT40;
import com.vicmatskiv.mw.models.SVTmount;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class SKSFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("SKS")
        .withFireRate(0.3f)
        .withRecoil(4f)
        .withAmmoCapacity(10)
        .withZoom(0.9f)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("sks")
        .withSilencedShootSound("AKsilenced")
        .withReloadSound("sksreload")
        .withUnloadSound("svt40unload")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.4f)
        .withFlashOffsetX(() -> 0.15f)
        .withFlashOffsetY(() -> 0.1f)
        .withCreativeTab(ModernWarfareMod.SnipersTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.MetalComponents,
                CompatibleBlocks.PLANK) 
        .withInformationProvider(stack -> Arrays.asList("Type: Semi-automatic Carbine","Damage: 8", 
        "Cartridge: 7.62x39mm", "Fire Rate: Semi"))
         .withCompatibleAttachment(Attachments.PUscope, (player, stack) -> {
            GL11.glTranslatef(0.4F, -1.15F, 0.55F);
            GL11.glScaled(1F, 1F, 1F);
        },(model) -> {
             if(model instanceof PUscope) {
                GL11.glTranslatef(-0.508F, 0.46F, -0.55F);
                GL11.glScaled(0.22F, 0.22F, 0.22F);
            }
             else if(model instanceof PUmount) {
                 GL11.glTranslatef(-0.508F, 0.46F, -0.55F);
                 GL11.glScaled(0.22F, 0.22F, 0.22F);
             }
             else if(model instanceof SVTmount) {
                 GL11.glScaled(0F, 0F, 0F);
             }
             else if(model instanceof PUreticle) {
                 GL11.glTranslatef(-0.5F, 0.23F, 0.82F);
                 GL11.glScaled(0.03F, 0.03F, 0.03F);
             }
        })
        .withCompatibleAttachment(Attachments.PSO1, (player, stack) -> {
            
            GL11.glTranslatef(0.07F, -0.6F, 0.4F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
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
        
        .withCompatibleAttachment(Attachments.OKP7, (model) -> {
            if(model instanceof OKP7) {
                GL11.glTranslatef(-0.13F, -0.43F, 0.22F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if(model instanceof OKP7reticle) {
                GL11.glTranslatef(-0.07F, -0.9F, -0F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AKpart, true, (model) -> {
            GL11.glTranslatef(-0.1F, -0.43F, -5F);
            GL11.glScaled(0.7F, 0.7F, 2.7F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.SKSaction, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 0.5f);
        })
        .withCompatibleAttachment(Attachments.Silencer762x39, (model) -> {
          GL11.glTranslatef(-0.2F, -0.62F, -6.77F);
          GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleBullet(Bullets.Bullet762x39, (model) -> {})
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.175F, -0.99F, -1.35F);
                GL11.glScaled(0.6F, 0.6F, 0.75F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.13F, -0.71F, -5.15F);
                GL11.glScaled(0.3F, 0.35F, 0.5F);
            } else if(model instanceof ScarIron1) {
                    GL11.glTranslatef(0.165F, -1.65F, 1F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                    GL11.glTranslatef(0.25F, -1.55F, -2F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
         .withCompatibleAttachment(GunSkins.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Voltaic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Voltaic.getTextureVariantIndex("Voltaic"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Cosmos, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Cosmos.getTextureVariantIndex("Cosmos"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Volcanic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Volcanic.getTextureVariantIndex("Volcanic"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
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
        .withCompatibleAttachment(GunSkins.Desert, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Desert.getTextureVariantIndex("Desert"));
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
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Ruby, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Ruby.getTextureVariantIndex("Ruby"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(GunSkins.Arctic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Arctic.getTextureVariantIndex("Arctic"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Asiimov, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Asiimov.getTextureVariantIndex("Asiimov"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Vulcan, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Vulcan.getTextureVariantIndex("Vulcan"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.CrystalCrimson, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.CrystalCrimson.getTextureVariantIndex("CrystalCrimson"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.PinkIsTheNewBlack, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.PinkIsTheNewBlack.getTextureVariantIndex("PinkIsTheNewBlack"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.DynamicBundle, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.DynamicBundle.getTextureVariantIndex("DynamicBundle"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Woodland_Digital, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Woodland_Digital.getTextureVariantIndex("Woodland_Digital"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Desert_Digital, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Desert_Digital.getTextureVariantIndex("Desert_Digital"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Foliage, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Foliage.getTextureVariantIndex("Foliage"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(AuxiliaryAttachments.SKSmag1, true, (model) -> {
            GL11.glTranslatef(-0.1f, 1.1f, 2f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.SKSmag2, true, (model) -> {
            GL11.glTranslatef(-0.1f, 1.1f, 2f);
        })
        .withTextureNames("sks")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new SKS())
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
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-1F, 0.3F, 1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(5f, 5f, 5f);
                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.450000f, 0.63f, -1.5f);
                
//                GL11.glRotatef(43F, 0f, 1f, 0f);
//                GL11.glRotatef(12F, 0f, 0f, 1f);
//                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
//                GL11.glTranslatef(-0.3f, 0.6f, -1f);
//                GL11.glRotatef(-3F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(5f, 5f, 5f);
                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.450000f, 0.63f, -1.3f);
                GL11.glRotatef(-1.3F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(0.25f, 0.34f, -0.9f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PUscope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005f, 0.158f, -0.25f);
                } 
                
                // ACOG Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.014f, 0.162f, -0.05f);
                } 
                
             // ACOG Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.011f, 0.147f, -0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.AKpart.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.SKSaction.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
//                    GL11.glTranslatef(0f, 0f, 0.5f);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.SKSaction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.5f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.SKSaction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.5f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.AKpart.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.AKpart.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.SKSmag1.getRenderablePart(), (renderContext) -> {
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.SKSmag1.getRenderablePart(), (renderContext) -> {
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.SKSmag1.getRenderablePart(), (renderContext) -> {
//                GL11.glScalef(0.6f, 0.6f, 0.6f);
//                GL11.glTranslatef(-0.08f, -2.1f, -3f);
//                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.SKSmag2.getRenderablePart(), (renderContext) -> {
                
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.SKSmag2.getRenderablePart(), (renderContext) -> {
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.SKSmag2.getRenderablePart(), (renderContext) -> {
//                GL11.glScalef(0.6f, 0.6f, 0.6f);
//                GL11.glTranslatef(-0.08f, -2.1f, -3f);
//                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.3f, 0.5f, -1f);
                    GL11.glRotatef(-3F, 1f, 0f, 0f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.3f, 0.5f, -1f);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                }, 150, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.3f, 0.6f, -1f);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                }, 350, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.3f, 0.6f, -1f);
                    GL11.glRotatef(-3F, 1f, 0f, 0f);
                }, 330, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(39F, 0f, 1f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.3f, 0.6f, -1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                }, 340, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(36F, 0f, 1f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.4f, 0.6f, -1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(36F, 0f, 1f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.4f, 0.67f, -1f);
                    GL11.glRotatef(-1f, 1f, 0f, 0f);
                }, 310, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(36F, 0f, 1f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.4f, 0.67f, -1f);
                    GL11.glRotatef(-2F, 1f, 0f, 0f);
                }, 320, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(36F, 0f, 1f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.3f, 0.6f, -1.1f);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                }, 80, 0)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SKSaction.getRenderablePart(),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.5f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.5f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.5f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.5f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.5f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.5f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.5f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AKpart.getRenderablePart(),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 200)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SKSmag1.getRenderablePart(),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.8f, 0f, 0f);
                    }, 250, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.8f, 0f, 0f);
                    }, 250, 200),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.8f, 0f, 0f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0.6f, 0.6f, 0.6f);
                        GL11.glTranslatef(-1.2f, -0.9f, -3f);
                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0.6f, 0.6f, 0.6f);
                        GL11.glTranslatef(-0.08f, -1.5f, -3.2f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0.6f, 0.6f, 0.6f);
                        GL11.glTranslatef(-0.08f, -2.1f, -3f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0.6f, 0.6f, 0.6f);
                        GL11.glTranslatef(-0.08f, -1f, -3f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0.6f, 0.6f, 0.6f);
                        GL11.glTranslatef(-0.08f, -1f, -3f);
                    }, 250, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0.6f, 0.6f, 0.6f);
                        GL11.glTranslatef(-0.08f, -1f, -3f);
                    }, 250, 200)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.SKSmag2.getRenderablePart(),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.8f, 0f, 0f);
                  }, 250, 200),
                  
                  new Transition((renderContext) -> { // Reload position
                      GL11.glScaled(0.6F, 0.6F, 0.6F);
                      GL11.glTranslatef(-0.8f, 0f, 0f);
                  }, 250, 200),
              
                  new Transition((renderContext) -> { // Reload position
                      GL11.glScaled(0.6F, 0.6F, 0.6F);
                      GL11.glTranslatef(-0.8f, 0f, 0f);
                  }, 250, 200),
                  new Transition((renderContext) -> { // Reload position
                      GL11.glScalef(0.6f, 0.6f, 0.6f);
                      GL11.glTranslatef(-1.2f, -0.9f, -3f);
                      GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                  }, 250, 200),
                  new Transition((renderContext) -> { // Reload position
                      GL11.glScalef(0.6f, 0.6f, 0.6f);
                      GL11.glTranslatef(-0.08f, -1.5f, -3.2f);
                      GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                  }, 250, 200),
                  new Transition((renderContext) -> { // Reload position
                      GL11.glScalef(0.6f, 0.6f, 0.6f);
                      GL11.glTranslatef(-0.08f, -2.1f, -3f);
                  }, 250, 200),
                  new Transition((renderContext) -> { // Reload position
                      GL11.glScalef(0.6f, 0.6f, 0.6f);
                      GL11.glTranslatef(-0.08f, -2.1f, -3.07f);
                      GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                  }, 250, 200),
                  new Transition((renderContext) -> { // Reload position
                      GL11.glScalef(0.6f, 0.6f, 0.6f);
                      GL11.glTranslatef(-0.08f, -2.1f, -3.07f);
                      GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                  }, 250, 200),
                  new Transition((renderContext) -> { // Reload position
                      GL11.glScalef(0.6f, 0.6f, 0.6f);
                      GL11.glTranslatef(-8.5f, -5f, -2f);
                      GL11.glRotatef(-45F, 1f, 0f, 0f);
                      GL11.glRotatef(-45F, 0f, 0f, 1f);
                  }, 250, 200)
            )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 0f, -0.9f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.1f, 0.8f, -1.3f);
                  }, 350, 600)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(0.25f, 0.34f, -1f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PUscope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005f, 0.158f, -0.2f);
                } 
                
             // ACOG Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.014f, 0.162f, 0f);
                } 
                
             // ACOG Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.011f, 0.147f, -0.5f);
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
                GL11.glTranslatef(-0.350000f, 0.6f, -0.400000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4f, 4f, 4f);
                 GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.575000f, 0.075000f, -0.725000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.608000f, -0.868999f, 0.051000f);
                         
//                         GL11.glScalef(2.5f, 2.5f, 2.5f);
//                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(0.050000f, -0.275000f, 0.100000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.608000f, -0.868999f, 0.051000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.300000f, -0.675000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.608000f, -0.868999f, 0.051000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 250, 0)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.225000f, 0.050000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.350000f, 0.050000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.725000f, 0.325000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.275000f, 0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.300000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.300000f, -0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.350000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.350000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.225000f, 0.050000f);
                    }, 250, 50)
                    
            )
            
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.300000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.608000f, -0.868999f, 0.051000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.608000f, -0.868999f, 0.051000f);
                    }, 250, 50))
             
            .build())
            .withSpawnEntityDamage(8f)
            .withSpawnEntityGravityVelocity(0.0118f)
                    
            .build(ModernWarfareMod.MOD_CONTEXT);
        }
    }

