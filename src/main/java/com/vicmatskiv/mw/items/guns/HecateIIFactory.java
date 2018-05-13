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
import com.vicmatskiv.mw.models.HecateII;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class HecateIIFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("HecateII")
//      .withAmmo(CommonProxy.XWPMag)
//      .withAmmoCapacity(10)
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("L96BoltAction")
        .withRecoil(4f)
        .withZoom(0.8f)
        .withMaxShots(1)
        .withShootSound("HecateII")
        .withPumpTimeout(1000)
        .withSilencedShootSound("RifleSilenced")
        .withReloadSound("BoltActionReload")
        .withUnloadSound("Unload")
        .withReloadingTime(30)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.1f)
        .withCreativeTab(ModernWarfareMod.SnipersTab)
        .withShellCasingEjectEnabled(false)
        .withCrafting(CraftingComplexity.HIGH,
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.BigSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Sniper rifle", "Damage: 40",
        "Caliber: .50 BMG", "Magazines:", "7rnd .50 BMG Magazine", "Fire Rate: Bolt Action"))
        .withCompatibleAttachment(GunSkins.ElectricSkin,
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
                },
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Amber,
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amber.getTextureVariantIndex("HecateIIAmber"));
                },
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Arctic,
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Arctic.getTextureVariantIndex("HecateIIArctic"));
                },
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Gold,
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Gold.getTextureVariantIndex("HecateIIGold"));
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
        .withCompatibleAttachment(Magazines.HecateIIMag, (model) -> {
            GL11.glTranslatef(0F, -0.25F, 0F);
            GL11.glScaled(1.2F, 0.7F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.HecateIIBoltAction, true, (model) -> {
            GL11.glTranslatef(-0.01F, 0.02F, 0.03F);
            GL11.glScaled(1F, 1F, 1F);
        })


        .withCompatibleAttachment(Attachments.HP, true, true, (player, stack) -> {

            GL11.glTranslatef(0.06F, -1.37F, 0.3F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
        },(model) -> {
             if(model instanceof LPscope) {
                GL11.glTranslatef(0.237F, -0.235F, 1.16F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Bipod, true, (model) -> {
            GL11.glTranslatef(.135F, -0.55F, -1.2F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
            GL11.glTranslatef(0.107F, -1.36F, -5.8F);
            GL11.glScaled(1.1F, 1.1F, 1.3F);
        })
        .withTextureNames("HecateII")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new HecateII())
            //.withTextureName("AWP")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1f, 1.5f, -0.7f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.7F, 0.7F, 0.7F);
                GL11.glTranslatef(-1.6F, 0.4F, 1.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })


           .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-2F, 0f, 0f, 1f);
                GL11.glScaled(5F, 5F, 5F);
                GL11.glTranslatef(-0.650000f, 1.15f, -2f);
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glRotatef(5F, 0f, 0f, 1f);
//                GL11.glRotatef(-1F, 1f, 0f, 0f);
//                GL11.glScaled(5F, 5F, 5F);
//                GL11.glTranslatef(-0.650000f, 1.2f, -1.9f);
                })

            .withFirstPersonCustomPositioning(Magazines.HecateIIMag, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })

            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-2F, 0f, 0f, 1f);
                GL11.glScaled(5F, 5F, 5F);
                GL11.glTranslatef(-0.650000f, 1.15f, -1.85f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                })

            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(5F, 5F, 5F);
                GL11.glTranslatef(-0.07F, 1.2f, -0.93f);

                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Scope");
                }

                // Everything else
                else {
                }


                })

            .withFirstPersonCustomPositioning(AuxiliaryAttachments.HecateIIBoltAction.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(-0.01F, 0.02F, 0.1F);
//                GL11.glScaled(0.97F, 0.97F, 0.97F);
                })

            .withFirstPersonPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glRotatef(-1F, 1f, 0f, 0f);
                        GL11.glScaled(5F, 5F, 5F);
                        GL11.glTranslatef(-0.650000f, 1.2f, -1.9f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glScaled(5F, 5F, 5F);
                        GL11.glTranslatef(-0.650000f, 1.2f, -1.8f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(6F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glScaled(5F, 5F, 5F);
                        GL11.glTranslatef(-0.650000f, 1.2f, -1.8f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                        GL11.glScaled(5F, 5F, 5F);
                        GL11.glTranslatef(-0.650000f, 1.25f, -1.9f);
                    }, 150, 0)

                    )

            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.HecateIIBoltAction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0F, 0F, 0.6F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);

                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.3F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)

                    )

            .withFirstPersonCustomPositioningEjectSpentRound(Magazines.HecateIIMag.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0F, 0F, 0.6F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);

                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)

                    )



            .withFirstPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5F, 5F, 5F);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.650000f, 1.150000f, -2.100000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5F, 5F, 5F);
                        GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.750000f, 1.23f, -1.950000f);
                    }, 250, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(5F, 5F, 5F);
                    GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.750000f, 1.2f, -1.950000f);
                }, 350, 0),

                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(5F, 5F, 5F);
                    GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.85f, 1.25f, -1.950000f);
                }, 250, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(5F, 5F, 5F);
                    GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.8f, 1.25f, -1.950000f);
                }, 350, 0)
            )

            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(5F, 5F, 5F);
                    GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.85f, 1.25f, -1.950000f);
                }, 150, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(5F, 5F, 5F);
                    GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.85f, 1.3f, -1.950000f);
                }, 150, 0)
            )

            .withFirstPersonCustomPositioningUnloading(Magazines.HecateIIMag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.2F, 1.2F, 0F);
                    GL11.glRotatef(-8F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.2F, 1.2F, 0F);
                    GL11.glRotatef(-8F, 0f, 0f, 1f);
                }, 250, 1000)
                    )

            .withFirstPersonCustomPositioningReloading(Magazines.HecateIIMag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.2F, 1.2F, 0F);
                        GL11.glRotatef(-8F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.2F, 1.2F, 0F);
                        GL11.glRotatef(-8F, 0f, 0f, 1f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.2F, 1.2F, 0F);
                    GL11.glRotatef(-8F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.1F, 0.5F, 0F);
                    GL11.glRotatef(-8F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )

            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.HecateIIBoltAction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                new Transition((renderContext) -> { // Reload position
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50)
                )

            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.HecateIIBoltAction.getRenderablePart(),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000)
                        )

            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(5F, 5F, 5F);
                GL11.glTranslatef(-0.07F, 1.2f, -1f);

                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Scope");
                }

                // Everything else
                else {
                }


                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(1.5F, 1.5F, 1.5F);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.125000f, 0.325000f, -1.349999f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(5F, 5F, 5F);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.825000f, 1.000000f, -1.574999f);
             })
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                     },
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                     })

            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.075000f, 0.025000f, 0.625000f);
                     },
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                     })

            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.7f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-90f, 1f, 0f, 0f);
                         GL11.glRotatef(20f, 0f, 0f, 1f);
                    }, 50, 200),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.7f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                    }, 50, 200)
                    )

            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                    }, 250, 1000),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                    }, 250, 1000),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                    }, 350, 1050))

            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.525000f, 0.025000f);
                    }, 250, 50)

                )

            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.525000f, -0.075000f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.825000f, -0.5f, -0.1f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.525000f, -0.075000f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.6f, -0.075000f);
                    }, 350, 1050))

                .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glTranslatef(0.4f, 0.5f, 0.7f);
                        GL11.glRotatef(60f, 0, 0f, 1f);
                        GL11.glRotatef(-85f, 1f, 0f, 0f);
                        GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 50, 200),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glTranslatef(0.4f, 0.5f, 0.7f);
                        GL11.glRotatef(60f, 0, 0f, 1f);
                        GL11.glRotatef(-90f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 0f, 1f);
                    }, 50, 200)
                    )

            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                    }, 250, 1000),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.675000f, -0.025000f);
                    }, 250, 50))

            .build())
        .withSpawnEntityDamage(40f)
        .withSpawnEntityGravityVelocity(0f)

        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}