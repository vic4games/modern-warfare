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
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.GL06;
import com.vicmatskiv.mw.models.Grenade;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M110;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M416;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class GL06Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("GL06")
//      .withAmmo(CommonProxy.AR15Mag)
        .withAmmoCapacity(1)
        .withFireRate(0.7f)
        .withRecoil(5f)
        .withZoom(0.9f)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("GL06")
        .withReloadSound("GL06reload")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0f)
        .withFlashScale(() -> 0f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.101f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withCrafting(CraftingComplexity.HIGH, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Grenade Launcher", "Damage: 70", 
        "Cartridge: 40mm Grenade", "Fire Rate: Semi"))
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
        .withCompatibleAttachment(Bullets.Grenade40mm, (model) -> {})
        
        .withCompatibleAttachment(AuxiliaryAttachments.GLgrenade, true, (model) -> {
//            GL11.glTranslatef(0F, -0.4f, 0F);
//            GL11.glScaled(1F, 1F, 1F);
//            GL11.glRotatef(8F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.GL06Cartridge, true, (model) -> {
//            GL11.glTranslatef(0F, -0.4f, 0F);
//            GL11.glScaled(1F, 1F, 1F);
//            GL11.glRotatef(8F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.31F, -1.41F, -0.7F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
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
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.17F, -1.14F, -0.45F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Scope, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.38F, -0.3F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof LPscope) {
                GL11.glTranslatef(0.237F, -0.272F, 0.67F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
                }
            })
        .withCompatibleAttachment(Attachments.Reflex, (model) -> {
            if(model instanceof Reflex) {
                GL11.glTranslatef(-0.072F, -1.2F, -0.9F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.123F, -1.47F, -0.9F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.Holo2, (model) -> {
            if(model instanceof Holographic) {
            GL11.glTranslatef(-0.053F, -1.25F, -0.6F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.52F, -0.5F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Holographic2, (model) -> {
            if(model instanceof Holographic2) {
                GL11.glTranslatef(-0.053F, -1.25F, -0.6F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.52F, -0.5F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Kobra, (model) -> {
            if(model instanceof Kobra) {
                GL11.glTranslatef(-0.053F, -1.25F, -0.6F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.122F, -1.5F, -1.05F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (model) -> {
            if(model instanceof MicroT1) {
                GL11.glTranslatef(-0.17F, -1.36F, -0.6F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -1.465F, -0.7F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.RMR, (model) -> {
            if(model instanceof RMRsight) {
            GL11.glTranslatef(-0.163F, -1.38F, -0.5F);
            GL11.glScaled(0.28F, 0.28F, 0.28F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.123F, -1.38F, -0.8F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0F, -2.1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0F, -2.1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0F, -2.1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0F, -2.1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0.05F, -0.8F, -2.85F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.05F, -0.8F, -2.85F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withTextureNames("GL06")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new GL06())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(3F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.500000f, 1.125000f, -1.5f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(3F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.500000f, 1.15f, -1.3f);
                GL11.glRotatef(-3F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.85f, -1.05f);
                GL11.glRotatef(-1F, 1f, 0f, 0f); 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 1.6f);
                } 
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.13f, 1.3f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.002F, 0.21f, 1.2f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.125f, 1f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.125f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.06f, 1.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.GLgrenade.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.GL06Cartridge.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(Attachments.ACOG.getRenderablePart(), (renderContext) -> {
                })
            
            .withFirstPersonCustomPositioning(Attachments.Specter.getRenderablePart(), (renderContext) -> {
                })
   
            .withFirstPersonCustomPositioning(Attachments.Scope.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(Attachments.Holo2.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(Attachments.Holographic2.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(Attachments.Kobra.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(Attachments.Reflex.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(Attachments.MicroT1.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(Attachments.RMR.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(6F, 0f, 0f, 1f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.500000f, 1.2f, -1.5f);
                        GL11.glRotatef(7F, 1f, 0f, 0f);
                    }, 400, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-5F, 0f, 0f, 1f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.500000f, 1.2f, -1.5f);
                        GL11.glRotatef(-45F, 1f, 0f, 0f);
                    }, 430, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-4F, 0f, 0f, 1f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.500000f, 1.2f, -1.5f);
                        GL11.glRotatef(-47F, 1f, 0f, 0f);
                    }, 200, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.500000f, 1.2f, -1.5f);
                    GL11.glRotatef(-46F, 1f, 0f, 0f);
                }, 320, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-4F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.500000f, 1.2f, -1.5f);
                    GL11.glRotatef(-45F, 1f, 0f, 0f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.2f, 1.3f, -1.5f);
                    GL11.glRotatef(-16F, 1f, 0f, 0f);
                }, 310, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(22F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.2f, 1.3f, -1.5f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                }, 290, 170),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(21F, 0f, 0f, 1f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.2f, 1.3f, -1.5f);
                    GL11.glRotatef(-4F, 1f, 0f, 0f);
                }, 170, 0)
            )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.GLgrenade.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 1F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 1F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 1F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0.5F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
             .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.GL06Cartridge.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
             .withFirstPersonCustomPositioningReloading(Attachments.ACOG.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
             .withFirstPersonCustomPositioningReloading(Attachments.Specter.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.7f, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
             .withFirstPersonCustomPositioningReloading(Attachments.Scope.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -0.4f, -0.2F);
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glRotatef(8F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Holo2.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Holographic2.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Kobra.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Reflex.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.35f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.MicroT1.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.RMR.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -0.37f, -0.2F);
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 0.8f, -0.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.225000f, 1.4f, -0.8f);
                  }, 350, 600)
                    )
           
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.8f, -1.1f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 1.6f);
                } 
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.13f, 1.3f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.002F, 0.21f, 1.2f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.125f, 1f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.16f, 1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.125f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.06f, 1.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.3f, 1.199999f, -1f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1f, 0.700000f, -1.3f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.300000f, -0.475000f, 0.200000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.75f, -0.175000f, 0.6f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.375000f, 0.250000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.6f, -0.1f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.8f, -0f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-107.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.35f, -0.7f, -0.25f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-107.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.35f, -0.8f, -0.23f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.650000f, -0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.475000f, 0.200000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.475000f, 0.200000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.475000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.475000f, 0.200000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50))
                    
            .build())
            .withSpawnEntityDamage(70f)
			.withSpawnEntityGravityVelocity(0.3f)
			.withSpawnEntitySpeed(5f)
            .withSpawnEntityExplosionRadius(3f)
			.build(ModernWarfareMod.MOD_CONTEXT);
		}
	}