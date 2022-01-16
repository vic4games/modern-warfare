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
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AS50;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.GunwerksHAMR;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.M107;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M82Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("m82_barrett")
        .withFireRate(0.1f)
        .withRecoil(15f)
        .withZoom(0.8f)
        .withMaxShots(1)
        .withShootSound("m82")
        .withPumpTimeout(1000)
        .withSilencedShootSound("as50_silenced")
        .withReloadSound("as50_reload")
        .withUnloadSound("as50_unload")
        .withInspectSound("inspection")
        .withDrawSound("as50_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.08f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Anti-Materiel Sniper Rifle",
        "Damage: 25", 
        "Cartridge: .50 BMG",
        "Fire Rate: SEMI",
        "Rate of Fire: 10/100",
        "Magazines:",
        "10rnd .50 BMG NATO Magazine"))
         .withCrafting(CraftingComplexity.HIGH,
                Ores.PlasticPlate,
                Ores.GunmetalPlate,
                Ores.GunmetalIngot)
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 6f, // x 
                 -5f, // y
                 12f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.GripPlaceholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M82Action, true, (model) -> {
//        	GL11.glTranslatef(0f, 0f, 0.8f);
        	
//            GL11.glTranslatef(0F, 0F, 1.5F);
        })
        .withCompatibleAttachment(Magazines.M82Mag, (model) -> {
            GL11.glTranslatef(-0.42F, 0.8F, -1.4F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.22F, -1.58F, -2.5F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
         .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.328F, -1.6F, -1.2F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
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
            GL11.glTranslatef(-0.19F, -1.22F, -1.5F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef(-0.155F, -1.4F, -2.2F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.145F, -2.15F, -1F);
		    GL11.glScaled(0.38F, 0.38F, 0.38F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		//        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
		//            GL11.glScaled(0.4F, 0.4F, 0.4F);
		        }
		    })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                GL11.glTranslatef(-0.045F, -1.35F, -1.5F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.04F, -1.32F, -1.6F);
            GL11.glScaled(0.63F, 0.63F, 0.63F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(-0.015F, -1.4F, -1.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.015F, -1.4F, -1.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.015F, -1.4F, -1.8F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
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
            GL11.glTranslatef(-0.315F, -1.61F, -1.5F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.025F, -1.42F, -1F);
                GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	 GL11.glTranslatef(-0.025F, -1.42F, -1F);
             GL11.glScaled(0.75F, 0.75F, 0.75F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
        	GL11.glTranslatef(-0.186F, -1.6F, -1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.186F, -1.6F, -1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.18F, -0.15F, -4.9F);
            GL11.glScaled(1F, 1F, 1F);
      })
      .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.226F, -1.48F, -4.5F);
                GL11.glScaled(0.82F, 0.82F, 0.9F);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.226F, -1.48F, -6.25F);
                GL11.glScaled(0.82F, 0.82F, 0.9F);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.03F, -0.52F, -3.5F);
                GL11.glScaled(0F, 0F, 0f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.226F, -1.48F, -2.28F);
                GL11.glScaled(0.82F, 0.82F, 0.9F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.245F, -1.45F, -2.33F);
                GL11.glScaled(0F, 0F, 0f);
            }
        })
        .withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
            GL11.glTranslatef(-0.23F, -1.4F, -12.4F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withTextureNames("m107")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new M107())
            //.withTextureName("AWP")
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
                GL11.glTranslatef(-2.2F, -1.1F, 2.4F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(3f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.225000f, 1.299999f, -0.425000f);
                
//                GL11.glScalef(2.5f, 2.5f, 2.5f);
//                GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                
//                GL11.glScalef(2.5f, 2.5f, 2.5f);
//                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.575000f, 1.474999f, -0.350000f);
                
//                GL11.glScalef(2.5f, 2.5f, 2.5f);
//                GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(0.325000f, 1.574999f, -0.125000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(3f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.225000f, 1.299999f, 0.2f);
                GL11.glRotatef(-3f, 1f, 0f, 0f);
                })
                
             .withFirstPersonPositioningProning((renderContext) -> {
                 GL11.glScalef(2.5f, 2.5f, 2.5f);
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(8f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.6f, 2.2f, -1.2f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScalef(2.5f, 2.5f, 2.5f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.6f, 2.2f, -1f);
//                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
                
             .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M82Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M82Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
            
            .withFirstPersonCustomPositioning(Magazines.M82Mag, (renderContext) -> {
//           	 GL11.glTranslatef(0f, 0.8f, -0.3f);
//           	 GL11.glRotatef(-20F, 1f, 0f, 0f);
               })
                
             .withFirstPersonPositioningReloading(
            		 
            		// mag touches gun
                     
                     new Transition((renderContext) -> { // Reload position
                     	GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-37.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                     }, 330, 0),
            		 
            		 // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-44.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                    }, 350, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-42.700000f, 1f, 0f, 0f);
                        GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                    }, 80, 0),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-43.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(8.500000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                }, 110, 0),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-40.00000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                }, 110, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-40.300000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.800000f, 0f, 1f, 0f);
                    GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-40.200000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                }, 75, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.300000f, 0f, 1f, 0f);
                    GL11.glRotatef(10.500000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                }, 80, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(34.100000f, 0f, 1f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.650000f, 1.499999f, 0.025000f);
                }, 110, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(33.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, -0.125000f);
                }, 360, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-4.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(31.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(29.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, -0.125000f);
                }, 80, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-5.100000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.100000f, 0f, 1f, 0f);
                    GL11.glRotatef(31.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, -0.125000f);
                }, 100, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(33.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, 0.105000f);
                }, 200, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(36.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, 0.235000f);
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-9.200000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(32.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, 0.245000f);
                }, 70, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-8.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, 0.225000f);
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-8.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(34.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, 0.228000f);
                }, 100, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, -0.165000f);
                }, 100, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, -0.115000f);
                }, 70, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    GL11.glRotatef(-3.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(34.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, 1.574999f, -0.125000f);
                }, 80, 0)
            )
            
            .withFirstPersonPositioningUnloading(
            		
            		// left hand moves to lever
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.554999f, -0.350000f);
                    }, 300, 80),
                    
                    // left hand pushes lever
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.564999f, -0.350000f);
                    }, 120, 50),
                    
                    // left hand grabs mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.534999f, -0.350000f);
                    }, 250, 0),
                    
                    // left hand drops mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.674999f, -0.350000f);
                    }, 260, 0),
                    
                    // left hand drops mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, 1.654999f, -0.350000f);
                    }, 200, 0)
            )
            
            .withFirstPersonCustomPositioningReloading(Magazines.M82Mag,
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 3f, 0.7f);
                      	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 400, 150),
            		
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0.8f, -0.3f);
                      	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0.8f, -0.3f);
                      	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 300, 60),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0.8f, -0.3f);
                  	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                }, 100, 170),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                }, 350, 100),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 220, 200),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 220, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0)
            )
                      
            .withFirstPersonCustomPositioningUnloading(Magazines.M82Mag,
//                    new Transition((renderContext) -> {
//                      }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0f, 0.6f, -0.3f);
                       	 GL11.glRotatef(-15F, 1f, 0f, 0f);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0f, 0.8f, -0.3f);
                        	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0f, 3f, 0.7f);
                       	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0f, 3f, 0.7f);
                       	 GL11.glRotatef(-20F, 1f, 0f, 0f);
                      }, 250, 1000)
                      )
                      
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M82Action.getRenderablePart(),
            		
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 400, 150),
            		
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 400, 150),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 300, 60),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 100, 170),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                }, 350, 100),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 220, 200),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 220, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0.8f);
                }, 450, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0f, 1.5f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0f, 1.5f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0f, 1.5f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0f, 0f, 1.5f);
                }, 450, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 450, 0)
            )
                        
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M82Action.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000)
                        )
                        
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.125000f, 1.949999f, -1.474999f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.000000f, 2.375000f, -1.424999f);
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
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.47F, 0.47F, 0.47F);
                        GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                    GL11.glTranslatef(-3.5F, -1.8F, 3.4F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 100, 170),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                    GL11.glTranslatef(-3.8F, -2F, 4F);
                    GL11.glRotatef(-60F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 350, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                    GL11.glTranslatef(-3.8F, -2F, 4F);
                    GL11.glRotatef(-60F, 0f, 1f, 0f);
                    GL11.glRotatef(100F, 1f, 0f, 0f);
                }, 220, 200),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                    GL11.glTranslatef(-3.8F, -2F, 4F);
                    GL11.glRotatef(-60F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 220, 0)
//                }, 100, 0)
            )
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M82Action.getRenderablePart(),
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
                        GL11.glTranslatef(0f, 0f, 1.3f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                     
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 1.524999f, -0.275000f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 1.324999f, -0.325000f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, 1.324999f, 1.050000f);
                    }, 450, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(82.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, 1.324999f, 1.13f);
                    }, 340, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(81.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, 1.324999f, 1.05f);
                    }, 350, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(3f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, 1.299999f, -0.425000f);
                    }, 400, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.M82Action.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 1.3f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
              
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.345f, 1.125f, -0.550000f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.12f, 0.8f);
                }  
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005f, 0.15f, 1.3f);
                }  
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.05f, 1.2f);
                }  
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.11f, 0.6f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.1f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.08f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.1f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.14f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                	 GL11.glTranslatef(0f, 0.14f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                	 GL11.glTranslatef(0f, 0.135f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.11f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.12f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.12f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.11f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0f, 0.11f, 0.9f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.345f, 1.125f, -0.350000f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.12f, 0.8f);
                }  
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005f, 0.15f, 1.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.05f, 1.2f);
                }  
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.11f, 0.55f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.1f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.08f, 1f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.1f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.14f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                	 GL11.glTranslatef(0f, 0.14f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                	 GL11.glTranslatef(0f, 0.135f, 0.9f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.11f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.12f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.12f, 0.5f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.11f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                	GL11.glTranslatef(0f, 0.11f, 1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.300000f, 1.5f, -0.175000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.2f, 0.8f, -0.3f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.150000f, 0.375000f);
                         
//                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    	 
//                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);   
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);   
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.200000f, 0.000000f);
                    }, 400, 150),
            		
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.425000f, 0.130000f);
                    }, 400, 150),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.425000f, 0.130000f);
                    }, 300, 60),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.150000f, -0.425000f, 0.130000f);
                }, 100, 170),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.000000f, -0.365000f, 0.020000f);
                }, 350, 100),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.000000f, -0.365000f, 0.020000f);
                }, 220, 200),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.000000f, -0.365000f, 0.020000f);
                }, 220, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.000000f, -0.365000f, 0.020000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.000000f, -0.365000f, 0.020000f);
                }, 450, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                }, 450, 0)
            )
                    
            .withFirstPersonRightHandPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 400, 150),
            		
            		// mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 400, 150),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 300, 60),
                    
                    // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                }, 100, 170),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                }, 350, 100),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                }, 220, 200),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                }, 220, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                }, 450, 0),
                
                // gun rotates left - right hand grabs action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
	               	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	               	 GL11.glRotatef(60.000000f, 0f, 1f, 0f);
	               	 GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
	               	 GL11.glTranslatef(-0.080000f, -0.150000f, 0.110000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
	               	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	               	 GL11.glRotatef(60.000000f, 0f, 1f, 0f);
	               	 GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
	               	 GL11.glTranslatef(-0.080000f, -0.150000f, 0.110000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
	               	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	               	 GL11.glRotatef(60.000000f, 0f, 1f, 0f);
	               	 GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
	               	 GL11.glTranslatef(-0.080000f, -0.150000f, 0.110000f);
                }, 450, 0),
                
                // right hand pulls action half way
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(-0.010000f, -0.280000f, 0.080000f);
                }, 450, 0),
                
                // right hand finishes pulling
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.060000f, -0.390000f, 0.060000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.060000f, -0.390000f, 0.060000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.060000f, -0.390000f, 0.060000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.060000f, -0.390000f, 0.060000f);
                }, 450, 0),
                
                // right hand lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.330000f, -0.510000f, 0.110000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.330000f, -0.510000f, 0.110000f);
                }, 450, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.5f, 4.5f, 4.5f);
                	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.330000f, -0.510000f, 0.110000f);
                }, 450, 0)
            )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f); 
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.650000f, 0.175000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.575000f, 0.175000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.425000f, 0.130000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.200000f, 0.000000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.200000f, 0.000000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0f, -0.15f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.55f, -0.35f, 0.2f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.525000f, 0.050000f);
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
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.050000f, 0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.150000f, 0.100000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.150000f, 0.100000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.150000f, 0.100000f);
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
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-58.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-59.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-21.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.100000f, 0.125000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.100000f, 0.275000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.175000f, 0.275000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.100000f, 0.275000f);
                    }, 300, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                    }, 110, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);  
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 7.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.225000f, 0.100000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 7.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.425000f, 0.025000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 7.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.175000f, 0.075000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.475000f, 0.175000f);
                    }, 130, 0)
                    )
                    
            
                    
            .build())
        .withSpawnEntityDamage(25f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}