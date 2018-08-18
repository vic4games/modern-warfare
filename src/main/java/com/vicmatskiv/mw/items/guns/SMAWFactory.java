package com.vicmatskiv.mw.items.guns;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
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
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.SMAW;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class SMAWFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withModId(ModernWarfareMod.MODID)
                .withName("SMAW")
                .withAmmoCapacity(1)
                .withFireRate(0.5f)
                .withRecoil(8f)
                .withZoom(0.9f)
                .withMaxShots(1)
                .withShootSound("SMAW")
                // .withSilencedShootSound("AK47silenced")
                .withReloadSound("RocketLauncherReload")
                .withReloadingTime(70)
                .withCrosshair("gun")
                .withCrosshairRunning("Running")
                .withCrosshairZoomed("Sight")
                .withShellCasingEjectEnabled(false)
                .withCreativeTab(ModernWarfareMod.ShotgunsTab)
                .withCrafting(CraftingComplexity.HIGH, 
                CommonProxy.SteelPlate,
                CommonProxy.MetalComponents,
                CommonProxy.BigSteelPlate)
                .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
                    if (model instanceof M4Iron1) {
                        GL11.glTranslatef(0.41F, -2.13F, 1.1F);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof M4Iron2) {
                        GL11.glTranslatef(0.26F, -2F, -2.22F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron1) {
                        GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof G36CIron1) {
                        GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof G36CIron2) {
                        GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof ScarIron1) {
                        GL11.glTranslatef(0.165F, -1.65F, 1F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GL11.glTranslatef(0.25F, -1.55F, -2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GL11.glTranslatef(0.36F, -2.1F, -2F);
                        GL11.glScaled(0.5F, 0.5F, 1F);
                    } else if (model instanceof M14Iron) {
                        GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if(model instanceof MBUSiron) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(0.4F, -2F, 1.2F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
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
                .withCompatibleAttachment(Bullets.SMAWRocket, (model) -> {
                    GL11.glTranslatef(0F, 0F, 0.07F);
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
                .withTextureNames("SMAW")
                .withRenderer(new WeaponRenderer.Builder().withModId(ModernWarfareMod.MODID).withModel(new SMAW())

                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.6F, 0.6F, 0.6F);
                            GL11.glRotatef(-90F, 0f, 0f, 4f);
                        })
                        
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.3F, 0.3F, 0.3F);
                            GL11.glTranslatef(1f, 0f, 1.9f);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })

                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.8F, 0.8F, 0.8F);
                            GL11.glTranslatef(-1.8F, 0.3F, 1.5F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning((renderContext) -> {
                            GL11.glTranslatef(0.1F, -0.2F, -0.3F);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                            GL11.glRotatef(-2F, 0f, 0f, 1f);
                            GL11.glScaled(5F, 5F, 5F);
                            GL11.glTranslatef(-0.950000f, 1.324999f, -1.574999f);
                        	
                        
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                        	GL11.glTranslatef(0.1F, -0.2F, -0.3F);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                            GL11.glRotatef(-2F, 0f, 0f, 1f);
                            GL11.glScaled(5F, 5F, 5F);
                            GL11.glTranslatef(-0.950000f, 1.324999f, -1.2f);
                        })

                        .withFirstPersonPositioningReloading(

                        new Transition((renderContext) -> { // Reload position
                                    GL11.glTranslatef(0.1F, 0.2F, -0.3F);
                                    GL11.glRotatef(45F, 0f, 1f, 0f);
                                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                                    GL11.glTranslatef(-0.1F, -0.1F, 2F);
                                    GL11.glRotatef(45F, 1f, 0f, 0f);

                                }, 600, 4000))

                        .withFirstPersonPositioningZooming((renderContext) -> {
                             GL11.glRotatef(45F, 0f, 1f, 0f);
                             GL11.glScaled(5F, 5F, 5F);
                             GL11.glTranslatef(-0.31f, 1.86f, -1.6f);
                                
                             // ACOG Zoom
                                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                    //System.out.println("Position me for Acog");
                                	GL11.glTranslatef(-0.1f, -0.035f, 0.1f);
                                } 

                            })
                            
                        .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.625000f, 1.2f, -2f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.225000f, 1.075000f, -2f);
                  }, 350, 600)
                    )

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GL11.glTranslatef(0F, -0.58F, -0.2F);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                            GL11.glScaled(0.55F, 0.55F, 0.55F);

                            // Zoom
                                GL11.glTranslatef(0.753F, -1f, 2.53f);
                                GL11.glScaled(0.55F, 0.55F, 0.55F);
                                
                             // ACOG Zoom
                                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                    //System.out.println("Position me for Acog");
                                    GL11.glTranslatef(-0.09F, -0.03F, -0.13F);
                                } 
                         
                            })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                        	 GL11.glScaled(5F, 5F, 5F);
                             GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(-0.875000f, 1.924999f, -1.749999f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                        	GL11.glScaled(5F, 5F, 5F);
                        	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(-0.975000f, 1.424999f, -1.424999f);
                        })

                        .withFirstPersonHandPositioning((renderContext) -> {
                            GL11.glScalef(1.8f, 1.8f, 3f);
                            GL11.glTranslatef(0.85f, -0.1f, 0.35f);
                            GL11.glRotatef(110f, 0, 0f, 1f);
                            GL11.glRotatef(-30f, 1f, 0f, 0f);
                        }, (renderContext) -> {
                            GL11.glScalef(1.8f, 1.8f, 2.5f);
                            GL11.glTranslatef(-0.15f, 0.1f, 1f);
                            GL11.glRotatef(90f, 0, 0f, 1f);
                            GL11.glRotatef(-95f, 1f, 0f, 0f);
                        })

                        .withFirstPersonHandPositioningModifying((renderContext) -> {
                            GL11.glScalef(2f, 2f, 2f);
                            GL11.glTranslatef(0.85f, -0f, 0.18f);
                            GL11.glRotatef(110f, 0, 0f, 1f);
                            GL11.glRotatef(-20f, 1f, 0f, 0f);
                        }, (renderContext) -> {
                            GL11.glScalef(1.8f, 1.8f, 2.5f);
                            GL11.glTranslatef(-0.15f, 0.1f, 1f);
                            GL11.glRotatef(90f, 0, 0f, 1f);
                            GL11.glRotatef(-95f, 1f, 0f, 0f);
                        })

                        .withFirstPersonLeftHandPositioningReloading(new Transition((renderContext) -> {
                            GL11.glScalef(1.8f, 1.8f, 3f);
                            GL11.glTranslatef(0.85f, -0.1f, 0.35f);
                            GL11.glRotatef(110f, 0, 0f, 1f);
                            GL11.glRotatef(-30f, 1f, 0f, 0f);
                        }, 50, 200)
                        )

                        .withFirstPersonRightHandPositioningReloading(new Transition((renderContext) -> {
                            GL11.glScalef(1.8f, 1.8f, 2.5f);
                            GL11.glTranslatef(-0.15f, 0.1f, 1f);
                            GL11.glRotatef(90f, 0, 0f, 1f);
                            GL11.glRotatef(-95f, 1f, 0f, 0f);
                        }, 250, 1000))
                        
                        .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 3f);
                        GL11.glTranslatef(0.85f, -0.1f, 0.35f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-30f, 1f, 0f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 3f);
                        GL11.glTranslatef(0.85f, -0.1f, 0.35f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-30f, 1f, 0f, 0f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.15f, 0.1f, 1f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.15f, 0.1f, 1f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50))

                        .build())
                // .withSpawnEntityModel(new Grenade())
                // .withSpawnEntityModelTexture("Grenade")
                .withSpawnEntitySpeed(5f)
                // .withSpawnEntityGravityVelocity(0.3f)
                .withSpawnEntityDamage(60f).withSpawnEntityExplosionRadius(4f)
                // .withSpawnEntityClass(EntityGrenade.class)
                // .withSpawnEntity((player) -> new
                // EntityGrenade(player.worldObj, player, 60f, 6f))
               

                .build(ModernWarfareMod.MOD_CONTEXT);
    }
}