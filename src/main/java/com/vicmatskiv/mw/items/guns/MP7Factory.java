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
import com.vicmatskiv.mw.models.MP5;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MP7;
import com.vicmatskiv.mw.models.MP7FrontSightFlipped;
import com.vicmatskiv.mw.models.MP7FrontSights;
import com.vicmatskiv.mw.models.MP7RearSightFlipped;
import com.vicmatskiv.mw.models.MP7RearSights;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.MilSpecStock;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.SightMount;
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
        "Damage: 5.5", 
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
         
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
         .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(Attachments.LaserPlaceholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(AuxiliaryAttachments.MP7Grip, true, (model) -> {
//             GL11.glTranslatef(0f, -3.7f, 0.5f);
//        	 GL11.glRotatef(90F, 1f, 0f, 0f);
         })
         .withCompatibleAttachment(AuxiliaryAttachments.MP7action, true, (model) -> {
//           GL11.glTranslatef(0f, -3.7f, 0.5f);
//      	 GL11.glRotatef(90F, 1f, 0f, 0f);
       })
         .withCompatibleAttachment(Attachments.MP7Stock, true, (model) -> {
//           GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//           GL11.glScaled(0F, 0F, 0F);
         })
         .withCompatibleAttachment(Attachments.MP7MilSpecStock, (model) -> {
        	 if(model instanceof MilSpecStock) {
       		 GL11.glTranslatef(0f, -1.7f, 0.9f);
//                GL11.glScaled(1.2F, 1.2F, 1.2F);
            } 
        })
        .withCompatibleAttachment(Magazines.MP7Mag, (model) -> {
//            GL11.glTranslatef(0.0F, 1.8F, 0.8F);
//            GL11.glRotatef(15F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.MP7IronSights, true, (model) -> {
            if(model instanceof MP7RearSights) {
                GL11.glTranslatef(-0.12F, -2.67F, 0.63F);
                GL11.glScaled(0.2F, 0.2F, 0.2F); 
            } else if(model instanceof MP7FrontSights) {
            	GL11.glTranslatef(-0.12F, -2.67F, -0.8F);
                GL11.glScaled(0.2F, 0.2F, 0.2F); 
            } 
        })
        .withCompatibleAttachment(Attachments.MP7IronSightsStanding, true, (model) -> {
            if(model instanceof MP7RearSightFlipped) {
                GL11.glTranslatef(-0.12F, -2.67F, 0.63F);
                GL11.glScaled(0.2F, 0.2F, 0.2F); 
            } else if(model instanceof MP7FrontSightFlipped) {
            	GL11.glTranslatef(-0.12F, -2.67F, -0.8F);
                GL11.glScaled(0.2F, 0.2F, 0.2F); 
            } 
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.203F, -3.0F, -1.18F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.288F, -3F, 0F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
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
                GL11.glTranslatef(-0.175F, -3.04F, 0F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.175F, -3.04F, 0F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -2.48F, 0.2F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.18F, -2.73F, -0.3F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.07F, -2.84F, -0.5F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
        	GL11.glTranslatef(-0.065F, -2.81F, -0.5F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.035F, -2.86F, -0.4F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -2.86F, -0.4F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -2.86F, -0.7F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
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
                GL11.glTranslatef(-0.3F, -3.06F, -0.5F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.043F, -2.88F, 0F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	GL11.glTranslatef(-0.043F, -2.88F, 0F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -3.55F, -0.5F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                } else if (model instanceof SightMount) {
//                	GL11.glTranslatef(-0.15F, -1.82F, -1F);
//                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }
            })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(-0.25F, -2.3F, -2F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(-180F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
        	GL11.glTranslatef(-0.25F, -2.3F, -2F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(-180F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.SilencerMP7, (model) -> {
            GL11.glTranslatef(-0.21F, -2.62F, -3.8F);
            GL11.glScaled(1.1F, 1.1F, 1.0F);
        })
        .withTextureNames("mp7")
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
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(1, 2.3f, 0.95f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                GL11.glTranslatef(0.100000f, 3.875000f, 1.700000f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
            	 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                 GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.150000f, 2.63000f, -1.35000f);
                 
//                 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                 
//                 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
//                 GL11.glRotatef(8.000000f, 1f, 0f, 0f);
//                 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
//                 GL11.glRotatef(15.000000f, 0f, 0f, 1f);
//                 GL11.glTranslatef(-0.400000f, 2.849999f, -1.200000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                 GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.150000f, 2.63000f, -1.05000f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.25f, 0.7f, -0.6f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
//            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MP5A5action.getRenderablePart(), (renderContext) -> {
////                GL11.glTranslatef(0f, 0f, 1f);
//                })
//                
//            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MP5A5action.getRenderablePart(), (renderContext) -> {
////                GL11.glTranslatef(0f, 0f, 1f);
//                })
            
            .withFirstPersonPositioningReloading(
            		
            		//left hand goes down
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 2.700000f, -1.300000f);
                    }, 200, 0),
                    
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 2.64f, -1.300000f);
                    }, 150, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.100000f, 2.60f, -1.300000f);
                    }, 60, 0),
                
                    // mag inserts
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-39.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.700000f, 0f, 1f, 0f);
                    GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.100000f, 2.73f, -1.300000f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-39.400000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.300000f, 0f, 1f, 0f);
                    GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.08f, 2.75f, -1.300000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-39.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.100000f, 2.75f, -1.300000f);
                }, 110, 0),
                
                // right hand about to click
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-39.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.400000f, 0f, 1f, 0f);
                    GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.100000f, 2.74f, -1.31f);
                }, 60, 0),
                
                // click
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-39.700000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.100000f, 2.72f, -1.36f);
                }, 40, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-39.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-12.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.100000f, 2.72f, -1.27f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-39.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.100000f, 2.73f, -1.32f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    GL11.glRotatef(-39.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-12.700000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.100000f, 2.73f, -1.31f);
                }, 100, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-17.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.700000f, 2.6f, -1.45f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(40.300000f, 0f, 1f, 0f);
                         GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.700000f, 3f, -1.500000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-21.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.700000f, 3f, -1.500000f);
                    }, 70, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.MP7Mag,
            		//left hand goes down
                    new Transition((renderContext) -> {
                    	 GL11.glTranslatef(0.0F, 1.8F, 0.8F);
                         GL11.glRotatef(15F, 1f, 0f, 0f);
                    }, 300, 0),
                    
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.0F, 0.8F, 0F);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.0F, 0.8F, 0F);
                    }, 100, 0),
                
                    // mag inserts
                new Transition((renderContext) -> { // Reload position
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 110, 0),
                
                // right hand about to click
                
                new Transition((renderContext) -> { // Reload position
                }, 180, 0),
                
                // click
                
                new Transition((renderContext) -> { // Reload position
                }, 40, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 100, 0)
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
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.100000f, 2.799999f, -1.600000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                		GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
	                      GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
	                      GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                      GL11.glRotatef(75.000000f, 0f, 0f, 1f);
	                      GL11.glTranslatef(0.500000f, 2.999999f, -1.800000f);
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
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.400000f, 3.149999f, -0.900000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(8.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.45f, 2.5f, -1.3f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.45f, 2.5f, -1.55f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 2.63000f, -1.45000f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 2.63000f, -1.35000f);
                    }, 100, 0)
                    )
            
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.MP7Grip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -3.7f, 0.5f);
                   	 GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -3.7f, 0.5f);
                   	 GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, -3.7f, 0.5f);
                   	 GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.35f, 2.455f, -1.1f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MP7IronSightsStanding)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.175f, 0f);
                } 

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.15f, 0.8f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.155f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.17f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.17f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.14f, 0.7f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.12f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.12f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.12f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.215f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.215f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.211f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.21f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.6f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.35f, 2.455f, -0.9f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MP7IronSightsStanding)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.175f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.15f, 0.6f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.155f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.17f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.17f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.14f, 0.7f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.12f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.12f, 1f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.12f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.215f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.215f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.211f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.21f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.6f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
            	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.100000f, 2.625000f, -1.100000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.700000f, 2.525000f, -1.400000f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
            	 GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
            	 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
            	 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
            	 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
            	 GL11.glTranslatef(-1.200000f, 1.825000f, -1.200000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                        	 GL11.glScalef(3f, 3f, 3f);
                        	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(-0.250000f, -0.175000f, -0.250000f);
                        	 
//                        	 GL11.glScalef(3f, 3f, 3f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    	 
//                    	 GL11.glScalef(3f, 3f, 3f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.175000f, -0.250000f);
                   	 
//                   	 GL11.glScalef(3f, 3f, 3f);
                }, 
                (renderContext) -> {
	               	 GL11.glScalef(3f, 3f, 3f);
	               	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
	               	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
	               	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	               	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
               	 
//               	 GL11.glScalef(0f, 0f, 0f);
                })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.000000f, -0.500000f, 0.625000f);
                    }, 
                    (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.025000f, -0.200000f, -0.125000f);
                    }, 
                    (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.350000f, -0.400000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		
            		//left hand goes down
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.625000f, 0.250000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.125000f, -0.625000f, 0.100000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.125000f, -0.625000f, 0.100000f);
                    }, 100, 0),
                
                    // mag inserts
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(3f, 3f, 3f);
                  	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                  	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                  	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                  	 GL11.glTranslatef(-0.350000f, -0.625000f, 0.050000f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(3f, 3f, 3f);
                  	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                  	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                  	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                  	 GL11.glTranslatef(-0.350000f, -0.625000f, 0.050000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(3f, 3f, 3f);
                  	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                  	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                  	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                  	 GL11.glTranslatef(-0.350000f, -0.625000f, 0.050000f);
                }, 110, 0),
                
                // right hand about to click
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(3f, 3f, 3f);
                 	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                 	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                 	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                 	 GL11.glTranslatef(-0.350000f, -0.625000f, 0.050000f);
                	
                }, 180, 0),
                
                // click
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(3f, 3f, 3f);
                 	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                 	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                 	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                 	 GL11.glTranslatef(-0.350000f, -0.625000f, 0.050000f);
                }, 40, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(3f, 3f, 3f);
                 	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                 	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                 	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                 	 GL11.glTranslatef(-0.350000f, -0.625000f, 0.050000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(3f, 3f, 3f);
                 	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                 	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                 	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                 	 GL11.glTranslatef(-0.350000f, -0.625000f, 0.050000f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(3f, 3f, 3f);
                 	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                 	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                 	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                 	 GL11.glTranslatef(-0.350000f, -0.625000f, 0.050000f);
                }, 100, 0)
            )
                    
            .withFirstPersonRightHandPositioningReloading(
            		//left hand goes down
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 100, 0),
                
                    // mag inserts
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(3f, 3f, 3f);
                	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(3f, 3f, 3f);
                	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(3f, 3f, 3f);
                	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                }, 110, 0),
                
                // right hand about to click
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(3f, 3f, 3f);
                	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                }, 180, 0),
                
                // click
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(3f, 3f, 3f);
                	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                }, 40, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(3f, 3f, 3f);
                	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(3f, 3f, 3f);
                	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(3f, 3f, 3f);
                	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                }, 100, 0)
            )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(-0.000000f, -0.700000f, -0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.700000f, -0.175000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.700000f, -0.175000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(35.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.075000f, -0.350000f, 0.875000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(10.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.725000f, -0.475000f, 0.500000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.500000f, -0.550000f, -0.425000f);
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
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.050000f, -0.325000f, -0.150000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.050000f, -0.325000f, -0.150000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.050000f, -0.325000f, -0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(-0.250000f, -0.175000f, -0.250000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(-0.250000f, -0.175000f, -0.250000f);
                    }, 300, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.450000f, -0.400000f, -0.375000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(5.5f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

