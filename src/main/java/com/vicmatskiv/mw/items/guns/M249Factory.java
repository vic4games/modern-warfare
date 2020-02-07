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
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK15;
import com.vicmatskiv.mw.models.AK15ironsight;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M249;
import com.vicmatskiv.mw.models.M249Hatch;
import com.vicmatskiv.mw.models.M249RearSight;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.M60;
import com.vicmatskiv.mw.models.MG42;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M249Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("m249")
        .withFireRate(0.7f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withMaxShots(Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("m249")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("mg42_reload")
        .withUnloadSound("mg42_unload")
        .withInspectSound("inspection")
        .withDrawSound("mg42_draw")
//        .withDrawSound("mg42_reload")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.9f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.22f)
        .withInaccuracy(1f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: General-Purpose Machine Gun",
        "Damage: 10", 
        "Cartridge: 5.56x45mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 75/100",
        "Magazines:",
        "100rnd 5.56x45mm Magazine"))
         .withCrafting(CraftingComplexity.HIGH,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
         .withCompatibleAttachment(Attachments.M249HandGuard, true, (model) -> {
         })
         .withCompatibleAttachment(Attachments.M249Stock, true, (model) -> {
         })
         .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
//         .withCompatibleAttachment(Attachments.M60E4HandGuard, true, (model) -> {
//             if(model instanceof AKRail) {
//                 GL11.glTranslatef(0.33F, 0.45F, 0.1F);
//                 GL11.glScaled(0.6F, 0.6F, 0.7F);
//                 GL11.glRotatef(90F, 0f, 0f, 1f);
//             } else if(model instanceof AKRail2) {
//                 GL11.glTranslatef(-0.25F, 0.63F, 0.1F);
//                 GL11.glScaled(0.6F, 0.6F, 0.7F);
//                 GL11.glRotatef(-90F, 0f, 0f, 1f);
//             } else if(model instanceof AKRail3) {
//                 GL11.glTranslatef(0.12F, 1.35F, -0.7F);
//                 GL11.glScaled(0.6F, 0.6F, 1.05F);
//                 GL11.glRotatef(180F, 0f, 0f, 1f);
//             } 
//       })
        .withCompatibleAttachment(AuxiliaryAttachments.M249Action, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M249Hatch, true, (model) -> {
            if(model instanceof M249Hatch) {
            } else if(model instanceof M249RearSight) {
                GL11.glTranslatef(0.04f, -0.85f, 5.95f);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M249Belt, true, (model) -> {
//            GL11.glTranslatef(0.3F, 0.1F, 0F);
//          GL11.glRotatef(-15F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Magazines.M249Mag, (model) -> {
//            GL11.glTranslatef(0.3F, 0.1F, 0F);
//            GL11.glRotatef(-15F, 0f, 0f, 1f);
            
//            GL11.glTranslatef(0.15F, 0.9F, 0F);
//            GL11.glRotatef(10F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.09F, -0.92F, 3.3F);
                GL11.glScaled(0.9F, 0.9F, 0.9F);
            } else if(model instanceof AKRail2) {
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail3) {
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail4) {
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail5) {
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.183F, -1.32F, -5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.25F, -1.65F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.53F, -2.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.005F, -0.88F, 0.08F);
                GL11.glScaled(0.3F, 0.3F, 1F);
            } else if(model instanceof ScarIron1) {
                    GL11.glTranslatef(0.165F, -1.65F, 1F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                    GL11.glTranslatef(0.25F, -1.55F, -2F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.06F, -0.15F, -2.32F);
                GL11.glScaled(0.15F, 0.3F, 0.8F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.05F, -1F, 3.8F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.155F, -1.05F, 5.3F);
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
            GL11.glTranslatef(-0.035F, -0.7F, 4.7F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(0.1F, -0.83F, 4.6F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(0.1F, -0.83F, 4.6F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(0.12F, -0.83F, 4.6F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(0.12F, -0.83F, 4.6F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(0.12F, -0.85F, 4.8F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof EotechScopeRing) {
                GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Vortex, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -1.1F, 4.3F);
            GL11.glScaled(0.4F, 0.4F, 0.5F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef(0.125F, -0.85F, 4.8F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef(-0.04F, -1.05F, 4.6F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.02F, -0.25F, 3.8F);
            GL11.glScaled(0.38F, 0.38F, 0.38F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.05F, 1.75F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.05F, 1.75F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.05F, 1.85F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.05F, 1.75F, 0.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
//        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
//            GL11.glTranslatef(-0.2F, -0.41F, -3.7F);
//            GL11.glScaled(1F, 1F, 1F);
//        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0.2F, 0.45F, 0F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.2F, 0.45F, 0F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withTextureNames("gun")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new M249())
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
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-0.6F, 3.5F, 0.5F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glScalef(2.5f, 2.5f, 2.5f);
                 GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.445000f, 0.700000f, -5.900000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.445000f, 0.700000f, -5.600000f);
                GL11.glRotatef(-0.500000f, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.400000f, -5.074998f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, -0.400000f, -4.774998f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M249Belt.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.1F, -0.1F, 0F);
                GL11.glRotatef(25F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M249Belt.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.1F, -0.1F, 0F);
                GL11.glRotatef(25F, 0f, 0f, 1f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M249Belt.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(-0.5F, -0.4F, 0F);
                    GL11.glRotatef(40F, 0f, 0f, 1f);
                }
            })
            
            .withFirstPersonPositioningReloading(
                    
                    //hand grabs latch
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.445000f, 0.700000f, -5.900000f);
                    }, 330, 0),
                    //hand opens latch
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.445000f, 0.700000f, -5.900000f);
                    }, 280, 0),
                    
                    //gun movement to indicate character grabbing new magazine
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.445000f, 0.700000f, -5.900000f);
                    }, 530, 0),
                //left hand moves magazine to position
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(42F, 0f, 1f, 0f);
                    GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.445000f, 0.700000f, -5.900000f);
                }, 440, 10),
                //left hand pushes magazine in
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(42F, 0f, 1f, 0f);
                    GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.445000f, 0.700000f, -5.900000f);
                }, 240, 50),
                //left hand grabs belt
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(41F, 0f, 1f, 0f);
                    GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.445000f, 0.700000f, -5.900000f);
                }, 330, 100),
                //left hand drags belt
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.445000f, 0.700000f, -5.900000f);
                }, 400, 100),
              //left hand grabs latch
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(6.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.445000f, 0.700000f, -5.900000f);
                }, 350, 0),
              //left hand closes latch
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.345000f, 0.900000f, -5.900000f);
                }, 300, 0),
              //hand goes to action
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(38F, 0f, 1f, 0f);
                    GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.245000f, 1.200000f, -5.900000f);
                }, 340, 0),
                //hand pulls action back
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(31F, 0f, 1f, 0f);
                    GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(42.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.245000f, 1.200000f, -5.700000f);
                }, 260, 100),
                //hand pushes action
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(31F, 0f, 1f, 0f);
                    GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(41.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.245000f, 1.200000f, -5.800000f);
                }, 280, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                    
                  //left hand begins grabs magazine out
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.445000f, 0.700000f, -5.800000f);
                    }, 300, 100),
                    //left hand begins grabs magazine out
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.445000f, 0.750000f, -6.000000f);
                    }, 300, 0),
                    //left hand drops magazine
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.445000f, 0.730000f, -5.950000f);
                    }, 340, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M249Action.getRenderablePart(),
                    
                    
                    
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000)
                        )
                        
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M249Action.getRenderablePart(),
                    
                    
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M249Hatch.getRenderablePart(),
                    
                    
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M4Rail.getRenderablePart(),
                    
                    
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.45F, 3.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
             
             .withFirstPersonCustomPositioningReloading(Attachments.NightRaider.getRenderablePart(),
                     
                     
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.1F, -1.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.1F, -1.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.1F, -1.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.1F, -1.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.1F, -1.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.1F, -1.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.1F, -1.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.ACOG.getRenderablePart(),
                     
                     
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.5F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.5F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.5F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.5F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.5F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.5F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.5F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.Specter.getRenderablePart(),
                     
                     
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.Reflex.getRenderablePart(),
                     
                     
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.BijiaReflex.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2.6F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.Holographic.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.HolographicAlt.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.EotechHybrid2.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.7F, -0.6F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.7F, -0.6F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.7F, -0.6F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.7F, -0.6F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.7F, -0.6F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.7F, -0.6F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -0.7F, -0.6F);
                         GL11.glRotatef(70F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.Kobra.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -2.6F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -2.6F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -2.6F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -2.6F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -2.6F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -2.6F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -2.6F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.Vortex.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -1.4F, -3.2F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.MicroT1.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
             .withFirstPersonCustomPositioningReloading(Attachments.AimpointCompM5.getRenderablePart(),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                         GL11.glTranslatef(0F, -2F, -3.8F);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     }, 250, 1000)
                         )
             
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M249Hatch.getRenderablePart(),
                    
                    
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M249Belt.getRenderablePart(),
                    
                    
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.4F, 1.8F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.4F, 1.8F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.4F, 1.8F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 0.2F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.15F, 0.2F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.15F, 0.2F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M249Belt.getRenderablePart(),
                    
                    
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.45F, 0.2F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.4F, 1.8F, 0F);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M249Mag,
                    
                    
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 0.1F, 0F);
                        GL11.glRotatef(-15F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M249Mag,
                    
                    new Transition((renderContext) -> {
                        
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 0.1F, 0F);
                        GL11.glRotatef(-15F, 0f, 0f, 1f);
                        
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.15F, 0.9F, 0F);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, 0.925000f, -1.125000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(2f, 2f, 2f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.525000f, 1.174999f, -1.125000f);
                  }, 350, 600))
              
      .withFirstPersonPositioningDrawing(
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 200, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 230, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 300, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 250, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 230, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                  GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.504998f);
              }, 180, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glRotatef(45F, 0f, 1f, 0f);
                  GL11.glScalef(2f, 2f, 2f);
                  GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                  GL11.glTranslatef(-0.400000f, 0.500000f, -5.574998f);
              }, 180, 0)
              )
              
         .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.M249Belt.getRenderablePart(),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 200, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 230, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 300, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 250, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 230, 0),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 180, 100),
              new Transition((renderContext) -> { // Reload position
                  GL11.glTranslatef(-0.5F, -0.4F, 0F);
                  GL11.glRotatef(40F, 0f, 0f, 1f);
              }, 180, 0)
              )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.19f, 0.32f, -6.2f);
                GL11.glRotatef(-0.55F, 1f, 0f, 0f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.24f, 0.6f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.315f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.275f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.265f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.265f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.245f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.245f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.245f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.315f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.29f, 0.3f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.19f, 0.32f, -6.05f);
                GL11.glRotatef(-0.55F, 1f, 0f, 0f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.06f, -0.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.14f, 0.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.265f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.265f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.245f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.245f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.245f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.315f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.29f, 0.3f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.445000f, 1.45f, -5.900000f);
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(2f, 2f, 2f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.950000f, -0.125000f, -6.125000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    
                  
                    //hand grabs latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-165.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, -1.174999f, -0.975000f);
                    }, 250, 1000),
                    //hand opens latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, -1.075000f, -0.625000f);
                    }, 250, 1000),
                    //hand grabs magazine
                    
                    //hand stays down there
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.010000f, -1.855000f, -0.030000f);
                    }, 250, 1000),
                    //hand pulls up new magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.310000f, -1.715000f, 0.070000f);
                    }, 250, 1000),
                    //hand pushes in magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.490000f, -1.695000f, 0.170000f);
                    }, 250, 1000),
                    //hand grabs belt
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.625000f, -1.649999f, -0.150000f);
                    }, 250, 1000),
                    //hand drags belt
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-180.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -1.499999f, -0.300000f);
                    }, 250, 1000),
                    //hand grabs latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, -1.075000f, -0.625000f);
                    }, 250, 1000),
                    //hand closes latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-165.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, -1.174999f, -0.975000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningReloading(
                    
                    
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -1.474999f, -0.150000f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.825000f, -1.674999f, -0.075000f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -1.474999f, -0.150000f);
                    }, 500, 1000))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    
                  
                  //hand grabs magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.490000f, -1.695000f, 0.170000f);
                    }, 250, 1000),
                    //hand grabs magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.310000f, -1.715000f, 0.070000f);
                    }, 250, 1000),
                    //hand drops magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.010000f, -1.855000f, -0.030000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    
                    
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.900000f, -1.774999f, 0.450000f);
                    }, 250, 1000))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.200000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.200000f, 0.175000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.650000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.650000f, -0.650000f, 0.175000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    //does nothing
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 500, 1000),
                  //does nothing
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 500, 1000),
                  //does nothing
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 500, 1000),
                    //hand grabs latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand opens latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.200000f);
                    }, 250, 1000),
                    //hand grabs magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.100000f, 0.075000f);
                    }, 250, 1000),
                    //hand drops magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.025000f, 0.025000f);
                    }, 250, 1000),
                    //hand stays down there
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.025000f, 0.025000f);
                    }, 250, 1000),
                    //hand pulls up new magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand pushes in magazine
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand grabs belt
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.025000f, 0.125000f);
                    }, 250, 1000),
                    //hand drags belt
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.050000f, 0.150000f);
                    }, 250, 1000),
                    //hand grabs latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.200000f);
                    }, 250, 1000),
                    //hand closes latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, 0.100000f);
                    }, 250, 1000),
                    //hand lifts up
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    //hand smacks latch
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 250, 1000))
                    
            .withThirdPersonRightHandPositioningReloading(
                    //hand grabs action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.050000f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.050000f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.050000f);
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.050000f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition((renderContext) -> {
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.050000f);
                    }, 500, 1000))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.199999f, 0.075000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(0f, 0f, 0f);
                    }, 250, 100),
                    new Transition((renderContext) -> {
                        GL11.glScalef(0f, 0f, 0f);
                    }, 500, 1000),
                    //hand pulls action
                    new Transition((renderContext) -> {
                        GL11.glScalef(0f, 0f, 0f);
                    }, 500, 1000),
                    //hand pushes action
                    new Transition((renderContext) -> {
                        GL11.glScalef(0f, 0f, 0f);
                    }, 500, 1000)
                    )
             
            .build())
        .withSpawnEntityDamage(10f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

