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
import com.vicmatskiv.mw.models.AK101DustCover;
import com.vicmatskiv.mw.models.AK15;
import com.vicmatskiv.mw.models.AK15DustCover;
import com.vicmatskiv.mw.models.AK15HandleGuard;
import com.vicmatskiv.mw.models.AK15ironsight;
import com.vicmatskiv.mw.models.AK47;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AKiron3;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.FNFAL;
import com.vicmatskiv.mw.models.FNFALPARAHandguard;
import com.vicmatskiv.mw.models.FamasF1;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MLOKExtendedHandguard;
import com.vicmatskiv.mw.models.MLOKHandguard;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.OKP7;
import com.vicmatskiv.mw.models.OKP7reticle;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.PSO1reticle;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.RPKbarrel;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.SA58DustCover;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.mw.models.VeprDustCover;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class FamasF1Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("famas_f1")
        .withFireRate(0.8f)
        .withRecoil(2.5f)
        .withZoom(0.9f)
        .withMaxShots(1, 3, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("fnfal")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("fnfal_reload")
        .withUnloadSound("fnfal_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.09f)
        .withFlashOffsetY(() -> 0.2f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Bullpup Assault Rifle",
        "Damage: 6", 
        "Cartridge: 5.56x45mm NATO",
        "Fire Rate: SEMI, BURST",
        "Rate of Fire: 60/100",
        "Magazines:",
        "20rnd 7.62x51mm Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2.5f, // x 
                1f, // y
                2f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCrafting(CraftingComplexity.MEDIUM,
                Ores.GunmetalIngot,
                Ores.PlasticPlate)
        .withCompatibleAttachment(Attachments.FamasPlaceholder, true, (model) -> {
//        	GL11.glRotatef(20.000000f, 1f, 0f, 0f);
//            GL11.glTranslatef(0f, 0f, -0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.FamasF1Action, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Magazines.FamasF1Mag, (model) -> {
//        	GL11.glRotatef(20.000000f, 1f, 0f, 0f);
//            GL11.glTranslatef(0f, 0f, -0f);
        })
        .withCompatibleAttachment(Attachments.FamasF1ScopeMount, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.218F, -2.13F, -2.85f);
                GL11.glScaled(0.7F, 0.6F, 1.2F);
            }
        })
        .withCompatibleAttachment(Attachments.FamasF1PicatinnyRail, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.26F, -0.97F, -3f);
                GL11.glScaled(0.55F, 0.6F, 0.5F);
                GL11.glRotatef(90F, 0f, 0f, 1f); 
            } else if(model instanceof AKRail2) {
            	GL11.glTranslatef(-0.5F, -0.81F, -3f);
                GL11.glScaled(0.55F, 0.6F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 1f); 
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0F, -0.57F, -3f);
                GL11.glScaled(0.8F, 0.6F, 0.5F);
                GL11.glRotatef(180F, 0f, 0f, 1f); 
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -2.2F, -2F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.295F, -2.25F, -0.7F);
            GL11.glScaled(0.73F, 0.73F, 0.73F);
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
        
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.155F, -2.08F, -1.6F);
		            GL11.glScaled(0.43F, 0.43F, 0.43F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
		            GL11.glTranslatef(-0.185F, -1.93F, -1F);
		            GL11.glScaled(0.4F, 0.4F, 0.4F);
		},(model) -> {
		    if(model instanceof Acog2) {
		        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
        
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.15F, -2.74F, -1F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		//        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
		//            GL11.glScaled(0.4F, 0.4F, 0.4F);
		        }
		    })
        
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
        	GL11.glTranslatef(-0.177F, -2.22F, -1.2F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.177F, -1.52F, -1.2F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.065F, -2.02F, -1.2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.066F, -2.02F, -1.2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -2.08F, -1.2F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -2.08F, -1.2F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -2.08F, -1.2F);
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
        
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -2.25F, -1.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
        	GL11.glTranslatef(-0.044F, -2.07F, -1F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	GL11.glTranslatef(-0.044F, -2.07F, -1F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.1F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.05F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.1F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
		    GL11.glTranslatef(0.15F, -1F, -2.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Laser, (p, s) -> {
			GL11.glTranslatef(0.15F, -1F, -2.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
        	GL11.glTranslatef(-0.2F, -1.15F, -5.8F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("famasf1")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new FamasF1())
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
                GL11.glTranslatef(-2.1F, -1.1F, 2.2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.26f, 1.43f, -0.900000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glScalef(2f, 2f, 2f);
                 GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.26f, 1.43f, -0.55f);
                GL11.glRotatef(-1.2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.325000f, 0.675000f, -0.425000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.325000f, 0.675000f, -0.025000f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.FamasF1Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.FamasF1Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
            
            .withFirstPersonPositioningReloading(
                    
            		// hand goes down
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-29.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 1.25f, -2.299999f);
                    }, 450, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-31.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 1.21f, -2.299999f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-29.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 1.23f, -2.299999f);
                    }, 50, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-29.400000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 1.18f, -2.299999f);
                    }, 60, 0),
                    
                    // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-32.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.400000f, 0f, 1f, 0f);
                    GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.875000f, 1.14f, -2.299999f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-31.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.875000f, 0.9f, -2.299999f);
                }, 70, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-31.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.800000f, 0f, 1f, 0f);
                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.875000f, 0.9f, -2.299999f);
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-30.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-12.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.875000f, 1.05f, -2.2f);
                }, 90, 0),
                
                
                // left hand goes to action
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-0.3f, 1.5f, -1.7f);
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-0.1f, 1.4f, -1.2f);
               }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(55.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-0f, 1.349999f, -0.9f);
               }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.050000f, 1.349999f, -0.775000f);
               }, 80, 0),
                
                // left hand pulls action
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(61.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(42.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.050000f, 1.349999f, -0.6f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(61.600000f, 0f, 1f, 0f);
                     GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.050000f, 1.349999f, -0.64f);
                }, 50, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-13.500000f, 1f, 0f, 0f);
                     GL11.glRotatef(61.200000f, 0f, 1f, 0f);
                     GL11.glRotatef(44.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.050000f, 1.349999f, -0.63f);
               }, 70, 0),
                
                // action slides forward
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(60.300000f, 0f, 1f, 0f);
                     GL11.glRotatef(47.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.050000f, 1.349999f, -0.83f);
                }, 75, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(38.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.050000f, 1.349999f, -0.72f);
                }, 50, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-6.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(59.800000f, 0f, 1f, 0f);
                     GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.050000f, 1.349999f, -0.74f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(59.900000f, 0f, 1f, 0f);
                     GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.050000f, 1.349999f, -0.7f);
               }, 90, 0)
                //19 transitions
            )
            
            .withFirstPersonPositioningUnloading(
            		
            		// mag is taken out
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.505000f, -1.725000f);
                    }, 240, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-28.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.485000f, -1.725000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.575000f, -1.725000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.555000f, -1.705000f);
                    }, 160, 0)
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FamasF1Action.getRenderablePart(),
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
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
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
                    
            .withFirstPersonCustomPositioningReloading(Magazines.FamasF1Mag,
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2F, 0.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0f, 0.1f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0f, 0.1f, -0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0f, 0.1f, -0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glRotatef(2.000000f, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.FamasF1Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0f, 0f, -0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2F, 0.2F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2F, 0.2F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.200000f, 1.300000f, -1.200000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                	  GL11.glScalef(2f, 2f, 2f);
                	  GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                	  GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                	  GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                	  GL11.glTranslatef(0.600000f, 1.700000f, -1.600000f);
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
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 190),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(95F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                    GL11.glRotatef(12F, 0f, 0f, 1f);
                }, 120, 0)
//                }, 100, 0)
            )
            
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.FamasF1Action.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(40.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.474999f, -1.224999f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(30.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.474999f, -1.224999f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.474999f, -1.224999f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.474999f, -1.424999f);
                    }, 190, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, 1.474999f, -1.124999f);
                    }, 190, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.352f, 1.37f, -0.7f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.45f, 0.95f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.5f, 1.15f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.45f, 0.75f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.41f, 1.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.48f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.445f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.445f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.435f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.42f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.50f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.50f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.50f, 0.85f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.49f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.48f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.48f, 0.7f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.352f, 1.37f, -0.45f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.45f, 0.85f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.50f, 1.05f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.45f, 0.65f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.41f, 1.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.48f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.445f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.445f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.435f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.42f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.50f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.50f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.50f, 0.75f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.49f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.48f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.48f, 0.7f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
            	GL11.glScalef(1f, 1f, 1f);
                GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.950000f, 1.449999f, -0.375000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.5f, 1.075000f, -1.5f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2.300000f, 1.00000f, 0.100000f);
             })
            
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         RenderContext<?> rc = (RenderContext<?>) renderContext;
                         ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                 AttachmentCategory.GRIP, rc.getWeaponInstance());
                         if(activeAttachment == Attachments.Grip2 ||
                                activeAttachment == Attachments.StubbyGrip || 
                                activeAttachment == Attachments.VGrip) {
                        	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                        	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(0.075000f, -0.375000f, 0.100000f);
                        	 
//                        	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         } else if(activeAttachment == Attachments.AngledGrip) {
                        	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                        	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(0.100000f, -0.325000f, 0.100000f);
                         } else {
                             GL11.glScalef(4.5f, 4.5f, 4.5f);
                             GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.190000f, -0.370000f, 0.000000f);
                             
//                             GL11.glScalef(4.5f, 4.5f, 4.5f);
                         }
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.475000f, 0.150000f);
                    	 
//                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                     })
                     
             .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	 GL11.glRotatef(35.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.475000f, -0.225000f, 0.225000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.475000f, 0.150000f);
                     })
             
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.350000f, -0.225000f, 0.050000f);
                        } else {
                        	GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.200000f, -0.400000f, 0.000000f);
                            
                            
                        }
                    }, 
                    (renderContext) -> {
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.475000f, 0.150000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.075000f, -0.375000f, 0.100000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.100000f, -0.325000f, 0.100000f);
                        } else {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.200000f, -0.400000f, 0.000000f);
                            
//                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            
                        }
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.475000f, 0.150000f);
                   	 
//                   	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.175000f, -0.075000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.475000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                     (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(105.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.175000f, -0.550000f, -0.275000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	 GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.325000f, -0.525000f, 0.125000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    
            		// left hand goes down
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.050000f, -0.900000f, 0.350000f);
                    }, 50, 200),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.125000f, -0.925000f, 0.200000f);
                    }, 50, 200),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.125000f, -0.925000f, 0.200000f);
                    }, 250, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.125000f, -0.925000f, 0.200000f);
                    }, 250, 0),
                    
                    // mag inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.225000f, -0.950000f, 0.225000f);
                    }, 250, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.225000f, -0.950000f, 0.225000f);
                    }, 250, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.225000f, -0.950000f, 0.225000f);
                    }, 250, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.225000f, -0.950000f, 0.225000f);
                    }, 250, 0),
                    
                    // left hand goes to action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.850000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.525000f, 0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.075000f, -0.525000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.555000f, 0.025000f);
                    }, 250, 0),
                    
                    // left hand pulls action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.200000f, -0.645000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.200000f, -0.645000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.200000f, -0.645000f, 0.000000f);
                    }, 250, 0),
                    
                    // action slides forward
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.160000f, -0.585000f, -0.020000f);
                    }, 300, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.070000f, -0.495000f, -0.020000f);
                    }, 300, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.020000f, -0.435000f, -0.020000f);
                    }, 300, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.020000f, -0.435000f, -0.020000f);
                    }, 300, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                   }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                   }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                   }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                   }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                   }, 250, 50),
                   
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                  	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                  	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                  	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                  	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                   }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                   }, 280, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
            		
            		// mag is taken out
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.100000f, -0.950000f, 0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.050000f, -0.900000f, 0.350000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.050000f, -0.900000f, 0.350000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
            		
            		//mag is taken out
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.500000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
	                   	 GL11.glRotatef(25.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.325000f, -0.075000f, 0.300000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, -0.100000f);
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
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 280, 0))
                    
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
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.025000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                    }, 300, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.350000f, -0.225000f, 0.050000f);
                        } else {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.350000f, -0.270000f, 0.050000f);
                            
                            
                        }
                    }, 150, 0),
                    new Transition((renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.350000f, -0.225000f, 0.050000f);
                        } else {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.350000f, -0.270000f, 0.050000f);
                            
                            
                        }
                    }, 130, 0),
                    new Transition((renderContext) -> { 
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.350000f, -0.225000f, 0.050000f);
                        } else {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.350000f, -0.270000f, 0.050000f);
                            
                            
                        }
                    }, 200, 0),
                    new Transition((renderContext) -> { 
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.350000f, -0.225000f, 0.050000f);
                        } else {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.350000f, -0.270000f, 0.050000f);
                            
                            
                        }
                    }, 130, 60),
                    new Transition((renderContext) -> { 
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                       	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                       	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.350000f, -0.225000f, 0.050000f);
                        } else {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.350000f, -0.270000f, 0.050000f);
                            
                            
                        }
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.400000f, 0.225000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.400000f, 0.225000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.400000f, 0.225000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.400000f, 0.225000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.325000f, -0.400000f, 0.225000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

