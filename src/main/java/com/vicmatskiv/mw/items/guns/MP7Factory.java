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
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5A5;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MP7;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.SR3;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.UTGTriRailHandGuard;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class MP7Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("mp7")
        .withFireRate(0.9f)
        .withRecoil(1f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("mp7")
        .withSilencedShootSound("mp5_silenced")
        .withReloadSound("mp5_reload")
        .withUnloadSound("mp5_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.16f)
        .withFlashOffsetY(() -> 0.23f)
        .withInaccuracy(2f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Sub Machine Gun/ Personal Defense Weapon/ Machine Pistol",
        "Damage: 5", 
        "Cartridge: 4.6x30mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 80/100",
        "Magazines:",
        "40rnd 4.6x30mm HK Magazine"))
         .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 0.1f, // y
                 3f) // z
         
         .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
         .withCompatibleAttachment(Attachments.GripPlaceholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(Attachments.LaserPlaceholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
        .withCompatibleAttachment(Magazines.MP7Mag, (model) -> {
            GL11.glTranslatef(-2.75F, 1.2F, 0F);
            
//            GL11.glTranslatef(-2.75F, 2.9F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
//                GL11.glTranslatef(0.13F, -1.17F, -3.5F);
//                GL11.glScaled(0.6F, 0.6F, 0.6F);
//                GL11.glRotatef(90F, 0f, 0f, 1f);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail2) {
//                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
//                GL11.glScaled(0.6F, 0.6F, 0.6F);
//                GL11.glRotatef(-90F, 0f, 0f, 1f);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.5F, 0.11F, -2.3f);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
                GL11.glScaled(1.4F, 1F, 0.75F);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.165F, -1.02F, -1.81f);
                GL11.glScaled(1.2F, 1.2F, 1.9F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(0.5F, -0.28F, -2.3f);
                GL11.glRotatef(90F, 0f, 0f, 1f);
                GL11.glScaled(1.4F, 1F, 0.75F);
            }
        })
        .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.255F, -1.55F, -2.25F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.15F, -1.45F, -1.4F);
                GL11.glRotatef(180F, 0f, 1f, 0f);
                GL11.glScaled(0.9F, 0.9F, 1F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(0.26F, -1.5F, 2.65F);
                GL11.glRotatef(180F, 0f, 1f, 0f);
                GL11.glScaled(1.6F, 0.9F, 0.6F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.037F, -0.9F, -1.45F);
                GL11.glRotatef(180F, 1f, 0f, 0f);
                GL11.glScaled(0.5F, 0.9F, 0.9F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.015F, -1.35F, -1.45F);
                GL11.glRotatef(180F, 1f, 0f, 0f);
                GL11.glScaled(0.1F, 0.7F, 0.9F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M27rearsight) {
                GL11.glTranslatef(-0.06F, -1.4F, 2.65F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            } else if(model instanceof MBUSiron) {
                GL11.glTranslatef(-0.085F, -1.1F, -1.6F);
                GL11.glRotatef(90F, 1f, 0f, 0f);
                GL11.glScaled(0.75F, 0.6F, 0.5F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.17F, -1.2F, -1F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.315F, -1.2F, 1.5F);
            GL11.glScaled(1.3F, 1.3F, 1.3F);
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
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.125F, -1.3F, 1F);
                GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                GL11.glTranslatef(-0.125F, -1.3F, 1F);
                GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -0.65F, 1F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(0.1F, -0.83F, 0.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(0.14F, -0.95F, 0.7F);
                GL11.glScaled(1.1F, 1.1F, 1.1F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(0.14F, -0.95F, 0.7F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(0.13F, -0.95F, 0.7F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
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
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                GL11.glTranslatef(-0.31F, -1.25F, 0.5F);
                GL11.glScaled(0.78F, 0.78F, 0.78F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(0.13F, -0.95F, 1F);
                GL11.glScaled(1.05F, 1.05F, 1.05F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.3F, -0.28F, -2F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0.3F, -0.28F, -2F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.SilencerMP7, (model) -> {
            GL11.glTranslatef(-0.12F, -0.35F, -4.7F);
            GL11.glScaled(1.5F, 1.5F, 1.3F);
        })
        .withTextureNames("gun")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new MP7())
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
                GL11.glScaled(0.3F, 0.3F, 0.3F);
                GL11.glTranslatef(-2F, -0.8F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                GL11.glTranslatef(-0.650000f, 0.700000f, -4.424999f);
                
//                GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
//                GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-2.199999f, 1.100000f, -3.625002f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                GL11.glTranslatef(-0.650000f, 0.700000f, -3.724999f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.25f, 0.7f, -0.7f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.25f, 0.7f, -0.6f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MP5A5action.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MP5A5action.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0f, 0f, 1f);
                })
            
            .withFirstPersonPositioningReloading(
            		
            		//left hand goes down
                    new Transition((renderContext) -> {
                    	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                        GL11.glRotatef(-31.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(33.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.999999f, 1.000000f, -3.725002f);
                    }, 300, 0),
                    
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                        GL11.glRotatef(-37.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-2.199999f, 1.100000f, -3.625002f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-2.199999f, 1.050000f, -3.625002f);
                    }, 100, 0),
                    
                    // mag inserts halfway
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                        GL11.glRotatef(-36.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(29.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-2.199999f, 0.900000f, -3.625002f);
                    }, 100, 0),
                
                    // mag inserts
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                    GL11.glRotatef(-38.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(29.500000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.199999f, 0.710000f, -3.625002f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                    GL11.glRotatef(-37.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.199999f, 0.790000f, -3.625002f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                    GL11.glRotatef(-37.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.199999f, 0.850000f, -3.625002f);
                }, 110, 0),
                
                // right hand about to click
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                    GL11.glRotatef(-35.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.199999f, 0.980000f, -3.635002f);
                }, 180, 0),
                
                // click
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                    GL11.glRotatef(-36.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.199999f, 0.980000f, -3.845002f);
                }, 40, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                    GL11.glRotatef(-37.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.199999f, 0.980000f, -3.685002f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                    GL11.glRotatef(-36.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.199999f, 0.980000f, -3.725002f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                    GL11.glRotatef(-37.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.199999f, 0.980000f, -3.715002f);
                }, 100, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-1.200000f, 0.900000f, -4.350005f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(41F, 0f, 1f, 0f);
                        GL11.glRotatef(-14F, 1f, 0f, 0f);
                        GL11.glRotatef(1F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-1.200000f, 1.900000f, -4.350005f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(-9F, 1f, 0f, 0f);
                        GL11.glRotatef(-2F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-1.200000f, 1.500000f, -4.350005f);
                    }, 130, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.MP7Mag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 3F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1.8F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1.8F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1F, 0F);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.MP7Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0.45F, -0.15F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2.4F, -0.15F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-2f, 0.375000f, -3.7f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.400000f, 1.6f, -3f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                        GL11.glTranslatef(-3.5F, 0F, 3.5F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                    GL11.glTranslatef(-3.5F, 0F, 3.5F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 120, 190),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                    GL11.glTranslatef(-3.5F, 0F, 3.5F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                    GL11.glTranslatef(-3.5F, 0F, 3.5F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.3F, 0.3F, 0.3F);
                    GL11.glTranslatef(-3.5F, 0F, 3.5F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 120, 0)
//                }, 100, 0)
            )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glRotatef(30F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.800000f, 0.900000f, -4.350005f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.800000f, 0.900000f, -4.350005f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glRotatef(18F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.800000f, 0.900000f, -4.350005f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.800000f, 0.900000f, -4.350005f);
                    }, 190, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5F, 0f, 0f, 1f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glTranslatef(-0.800000f, 0.900000f, -4.350005f);
                    }, 190, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.23f, 0.938f, -3.5f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0.9f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.06f, 1.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.17f, 1.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.17f, 1.3f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 1.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.06f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.04f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.04f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.04f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.07f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0.8f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.23f, 0.938f, -3.2f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0.8f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.06f, 1.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.17f, 1.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.17f, 1.3f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.06f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.04f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.04f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.04f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.07f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0.8f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 1f, 0f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                GL11.glTranslatef(-0.300000f, 0.5f, -3.250005f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2f, 0.375000f, -3.7f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-6.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2.7f, -0.275000f, -3f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         RenderContext<?> rc = (RenderContext<?>) renderContext;
                         ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                 AttachmentCategory.LASER, rc.getWeaponInstance());
                         if(activeAttachment == Attachments.Laser ||
                                activeAttachment == Attachments.Laser2) {
                        	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                        	 GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(-0.000000f, -0.700000f, 0.150000f);
                         } else {
                        	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(-0.025000f, -0.700000f, 0.125000f);
                         }
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    	 
//                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.700000f, 0.125000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                        GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.700000f, 0.125000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.075000f, 0.875000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.775000f, 0.325000f);
                    })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(100.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.975000f, 0.025000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.950000f, 0.150000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		
            		//left hand goes down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.600000f, 0.300000f);
                    }, 50, 200),
                    
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.600000f, 0.300000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.600000f, 0.300000f);
                    }, 50, 200),
                    
                    // mag inserts halfway
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.850000f, 0.200000f);
                    }, 50, 200),
                    
                    // mag inserts
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -1.025000f, 0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -1.025000f, 0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -1.025000f, 0.300000f);
                    }, 250, 0),
                    
                    //click
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -1.025000f, 0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -1.025000f, 0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -1.025000f, 0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -1.025000f, 0.300000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -1.025000f, 0.300000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                   }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.475000f, -0.625000f, 0.350000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.445000f, -0.625000f, 0.350000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(0.465000f, -0.655000f, 0.350000f);
                   }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(0.465000f, -0.655000f, 0.350000f);
                   }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                      	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                      	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                      	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                      	GL11.glTranslatef(0.465000f, -0.655000f, 0.350000f);
                      }, 280, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(5.5f, 5.5f, 5.5f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.725000f, 0.350000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.775000f, 0.325000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.775000f, 0.325000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.5f, 3.5f, 3.5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.025000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.100000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.025000f, 0.075000f);
                    }, 300, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-49.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 280, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.725000f, 0.575000f);
                    }, 300, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.775000f, 0.325000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.775000f, 0.325000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.775000f, 0.325000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.775000f, 0.325000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.775000f, 0.325000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

