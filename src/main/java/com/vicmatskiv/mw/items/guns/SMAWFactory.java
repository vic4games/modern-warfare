package com.vicmatskiv.mw.items.guns;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
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
                .withRecoil(2f)
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
                .withCompatibleAttachment(CommonProxy.AKMIron, true, (model) -> {
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
                    }
                })
                .withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
                    GL11.glTranslatef(0.4F, -2F, 1.2F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                },(model) -> {
                    if(model instanceof Acog2) {
                        GL11.glTranslatef(0.237F, -0.26F, 0.46F);
                        GL11.glScaled(0.06F, 0.06F, 0.06F);
                    }
                })
                .withCompatibleAttachment(CommonProxy.SMAWRocket, (model) -> {
                    GL11.glTranslatef(0F, 0F, 0.07F);
                })
                .withCompatibleAttachment(CommonProxy.Fade, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Fade.getTextureVariantIndex("SMAWRuby"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(CommonProxy.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Gold.getTextureVariantIndex("SMAWGold"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Sapphire.getTextureVariantIndex("SMAWSapphire"));
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
                            GL11.glScaled(0.55F, 0.55F, 0.55F);
                            GL11.glTranslatef(-0.4F, -1F, 0.9F);
                        })

                        .withFirstPersonPositioningRecoiled((renderContext) -> {
                            GL11.glTranslatef(0.1F, -0.2F, -0.3F);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                            GL11.glScaled(0.55F, 0.55F, 0.55F);
                            GL11.glTranslatef(-0.4F, -1F, 1.3F);
                            GL11.glRotatef(-4F, 1f, 0f, 0f);
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
                            GL11.glTranslatef(0F, -0.58F, -0.2F);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                            GL11.glScaled(0.55F, 0.55F, 0.55F);

                            // Zoom
                                GL11.glTranslatef(0.753F, -1f, 2.5f);
                                GL11.glScaled(0.55F, 0.55F, 0.55F);
                                
                             // ACOG Zoom
                                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
                                    //System.out.println("Position me for Acog");
                                    GL11.glTranslatef(-0.09F, -0.03F, -0.13F);
                                } 

                            })

                        .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                            GL11.glTranslatef(0F, -0.58F, -0.2F);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                            GL11.glScaled(0.55F, 0.55F, 0.55F);

                            // Zoom
                                GL11.glTranslatef(0.753F, -1f, 2.53f);
                                GL11.glScaled(0.55F, 0.55F, 0.55F);
                                
                             // ACOG Zoom
                                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
                                    //System.out.println("Position me for Acog");
                                    GL11.glTranslatef(-0.09F, -0.03F, -0.13F);
                                } 
                         
                            })

                        .withFirstPersonPositioningRunning((renderContext) -> {
                            GL11.glScaled(0.7F, 0.7F, 0.7F);
                            GL11.glRotatef(-20F, -4f, 1f, -2f);
                            GL11.glTranslatef(1F, -0.5F, -0.8F);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GL11.glScaled(0.55F, 0.55F, 0.55F);
                            GL11.glRotatef(-35F, 2f, 1f, 1f);
                            GL11.glTranslatef(1F, -0.8F, -1.5F);
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