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
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AR15CarryHandle;
import com.vicmatskiv.mw.models.AR57Receiver;
import com.vicmatskiv.mw.models.ARCarryHandle;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.G95_upright_frontsights;
import com.vicmatskiv.mw.models.G95_upright_rearsights;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M16A1;
import com.vicmatskiv.mw.models.M16A4;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M4A1;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.M4Receiver;
import com.vicmatskiv.mw.models.MBUSFrontSight;
import com.vicmatskiv.mw.models.MBUSRearSight;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MPX;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.ScorpionEVO3A1;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.mw.models.TritiumRearSights;
import com.vicmatskiv.mw.models.VLTORReceiver;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class ScorpionEVO3A1Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("scorpion_evo3_a1")
		//.withAmmoCapacity(30)
		.withFireRate(0.999f)
		.withRecoil(2f)
		.withZoom(0.9f)
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("scorpion")
		.withSilencedShootSound("m4a1_silenced")
		.withReloadSound("scorpion_reload")
		.withUnloadSound("mpx_unload")
		.withEndOfShootSound("gun_click")
		.withInspectSound("inspection")
		.withDrawSound("noaction_draw")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.5f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.12f)
		.withFlashOffsetY(() -> 0.15f)
		.withShellCasingForwardOffset(0.05f)
		.withShellCasingVerticalOffset(-0.03f)
//		.withShellCasingEjectEnabled(false)
		.withInaccuracy(2f)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withInformationProvider(stack -> Arrays.asList(
		"Type: Pistol Caliber Carbine/ Submachine Gun", 
		"Damage: 5", 
		"Cartridge: 9x19mm",
		"Fire Rate: SEMI, AUTO",
		"Rate of Fire: 99/100",
		"Magazines:",
        "30rnd 9x19mm EVO Magazine"))
		 .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
		 
		 .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 0.1f, // y
                 2.5f) // z
		 
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.ScorpionRearSight, true, (model) -> {
            GL11.glTranslatef(-0.117f, -2.37f, -0.8f);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        })
        .withCompatibleAttachment(Attachments.ScorpionFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.ScorpionHandguardLong) {
                	GL11.glTranslatef(-0.117f, -2.37f, -3.5f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                } else {
                	GL11.glTranslatef(-0.117f, -2.37f, -2f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }
            }
        },(model) -> {
            if(model instanceof G95_upright_frontsights) {
            	GL11.glTranslatef(-0.155F, -1.55F, -3.3F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
              }
        }, true, false)
		.withCompatibleAttachment(Magazines.ScorpionMag, (model) -> {
//		    GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
//            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
		.withCompatibleAttachment(AuxiliaryAttachments.ScorpionAction, true, (model) -> {
//            GL11.glTranslatef(-0.175F, -1.58F, -0.86F);
//            GL11.glScaled(0.75F, 0.43F, 0.75F);
        })
//		.withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
//            GL11.glTranslatef(-0.175F, -1.58F, -0.86F);
//            GL11.glScaled(0.75F, 0.43F, 0.75F);
//        })
		.withCompatibleAttachment(Attachments.ScorpionHandguardShort, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.215F, -1.645F, -3f);
                GL11.glScaled(0.7F, 0.8F, 0.5F);
            } else if(model instanceof AKRail2) {
            	GL11.glTranslatef(0.1F, -1.25F, -3.6f);
                GL11.glScaled(0.7F, 0.8F, 0.45F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.35F, -1.03F, -3.6f);
                GL11.glScaled(0.7F, 0.8F, 0.45F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
            	GL11.glTranslatef(-0.02F, -0.83F, -3.6f);
                GL11.glScaled(0.7F, 0.8F, 0.45F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })
		.withCompatibleAttachment(Attachments.ScorpionHandguardLong, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.215F, -1.645F, -4.8f);
                GL11.glScaled(0.7F, 0.8F, 1F);
            }
        })
		.withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.215F, -1.645F, -2.46f);
            	GL11.glScaled(0.7F, 0.8F, 1F);
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
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.215F, -1.72F, -2.3F);
                    GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.31F, -1.75F, -0.7F);
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
                    GL11.glTranslatef(-0.195F, -1.4F, -1F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -2.35F, -1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                } else if (model instanceof SightMount) {
//                	GL11.glTranslatef(-0.15F, -1.82F, -1F);
//                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }
            })
		
		.withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GL11.glTranslatef(-0.056F, -1.53F, -1.3F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
		},(model) -> {
            if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
	                    GL11.glTranslatef(-0.05F, -1.52F, -1.3F);
	                    GL11.glScaled(0.53F, 0.53F, 0.53F);
			},(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
			})
		
		.withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.025F, -1.58F, -1.2F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
			},(model) -> {
	            if(model instanceof Holo2) {
	                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
	                GL11.glScaled(0.1F, 0.1F, 0.1F);
	            }
	        })
		
		.withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
				 GL11.glTranslatef(-0.025F, -1.58F, -1.2F);
	             GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
				 GL11.glTranslatef(-0.025F, -1.58F, -1.2F);
	             GL11.glScaled(0.75F, 0.75F, 0.75F);
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
	            GL11.glTranslatef(-0.335F, -1.81F, -1.4F);
	            GL11.glScaled(0.55F, 0.55F, 0.55F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
	    
		.withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.026F, -1.58F, -1F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
		},(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		
		.withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
					GL11.glTranslatef(-0.026F, -1.58F, -1F);
		            GL11.glScaled(0.75F, 0.75F, 0.75F);
		},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		
		.withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.183F, -1.77F, -1F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
		
		.withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
					GL11.glTranslatef(-0.183F, -1.77F, -1F);
		            GL11.glScaled(0.43F, 0.43F, 0.43F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		.withCompatibleAttachment(Attachments.Grip2, (model) -> {
			GL11.glTranslatef(-0.21F, -0.35F, -3F);
			GL11.glScaled(1.1F, 1.1F, 1.1F);
		})
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.35F, -3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.35F, -2.8F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(-0.05F, -1.25F, -3.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
        	GL11.glTranslatef(-0.05F, -1.25F, -3.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
		.withCompatibleAttachment(Attachments.Silencer9mm, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.ScorpionHandguardLong) {
                	GL11.glTranslatef(-0.2F, -1.35F, -7.5F);
        			GL11.glScaled(1F, 1F, 1F);
                } else {
                	GL11.glTranslatef(-0.2F, -1.35F, -5.35F);
        			GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.19F, -0.6F, -7.8F);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, false, false)
		.withTextureNames("scorpionevo3a1")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new ScorpionEVO3A1())
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(0, 0f, 3f);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
			    GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
			    GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-2F, -0.8F, 2.1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning((renderContext) -> {
	                GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glRotatef(8F, 0f, 0f, 1f);
	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.925000f);
	                
//	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
//  	                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
//  	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
//  	                GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
//  	                GL11.glTranslatef(-0.965000f, 1.799999f, -0.125000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
                GL11.glTranslatef(-0.300000f, 1.449999f, -0.525000f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
            })
                
            .withFirstPersonPositioningProning((renderContext) -> {
            	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
            	GL11.glRotatef(45F, 0f, 1f, 0f);
            	GL11.glRotatef(13.000000f, 0f, 0f, 1f);
            	GL11.glTranslatef(-0.325000f, 1.40000f, -1.050000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
            	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
            	GL11.glRotatef(45F, 0f, 1f, 0f);
            	GL11.glRotatef(13.000000f, 0f, 0f, 1f);
            	GL11.glTranslatef(-0.325000f, 1.40000f, -0.650000f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                })
		
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.ScorpionAction.getRenderablePart(), (renderContext) -> {
//			    GL11.glTranslatef(0f, 0f, 0.7f);
                })
			
			.withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.ScorpionAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.7f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.ScorpionAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.7f);
                })
                
            .withFirstPersonCustomPositioning(Magazines.ScorpionMag, (renderContext) -> {
//            	 GL11.glTranslatef(0f, 0.5f, 0f);
//            	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                })
				
			.withFirstPersonPositioningReloading(
			        
					// mag is at bottom 1
					
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.100000f, 0f, 1f, 0f);
			                GL11.glRotatef(-3.500000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 300, 0),
			        
			        //mag touches gun 2
			        
			        new Transition((renderContext) -> { 
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-24.500000f, 1f, 0f, 0f);
			                GL11.glRotatef(34.900000f, 0f, 1f, 0f);
			                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 210, 0),
			        
			        new Transition((renderContext) -> { 
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
			        }, 60, 0),
			        
			        //mag gets pushed in 4
			        
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-26.400000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.59f, -0.725000f);
                    }, 140, 0),
			        
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-25.500000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.69f, -0.725000f);
			        }, 80, 0),
			        
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
			                GL11.glRotatef(-25.800000f, 1f, 0f, 0f);
			                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(-5.500000f, 0f, 0f, 1f);
			                GL11.glTranslatef(-0.925000f, 1.68f, -0.725000f);
			        }, 110, 0),
                    
                    // left hand grabs action 7
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
      	                GL11.glRotatef(-19.500000f, 1f, 0f, 0f);
      	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
      	                GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
      	                GL11.glTranslatef(-0.965000f, 1.799999f, -0.135000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
      	                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
      	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
      	                GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
      	                GL11.glTranslatef(-0.965000f, 1.799999f, -0.125000f);
                   }, 80, 0),
                    
                    // left hand pulls action halfway 9
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
      	                GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
      	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
      	                GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
      	                GL11.glTranslatef(-0.965000f, 1.799999f, 0.065000f);
                    }, 140, 0),
                    
                    // left hand pulls action back 10
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
      	                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
      	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
      	                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
      	                GL11.glTranslatef(-0.965000f, 1.799999f, 0.265000f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
      	                GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
      	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
      	                GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
      	                GL11.glTranslatef(-0.965000f, 1.799999f, 0.205000f);
                    }, 90, 0),
                    
                    // left hand lets go of action 12
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
      	                GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
      	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
      	                GL11.glRotatef(1.000000f, 0f, 0f, 1f);
      	                GL11.glTranslatef(-0.965000f, 1.799999f, -0.205000f);
                   }, 60, 0),
                   
                   new Transition((renderContext) -> {
                	   GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
     	                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
     	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
     	                GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
     	                GL11.glTranslatef(-0.965000f, 1.799999f, -0.125000f);
                   }, 80, 0),
                   
                   new Transition((renderContext) -> {
                	   GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
     	                GL11.glRotatef(-19.000000f, 1f, 0f, 0f);
     	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
     	                GL11.glRotatef(0.000000f, 0f, 0f, 1f);
     	                GL11.glTranslatef(-0.965000f, 1.799999f, -0.175000f);
                     }, 100, 0)
			        )
			        
			.withFirstPersonPositioningUnloading(
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
		                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 190, 0),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
		                GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 170, 0),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
		                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-3.500000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 150, 0),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
		                GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.925000f, 1.699999f, -0.725000f);
                    }, 190, 0)
                    )
			
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ScorpionAction.getRenderablePart(),
                new Transition((renderContext) -> { //1
                }, 250, 1000),
                new Transition((renderContext) -> { //2
                }, 250, 1000),
                new Transition((renderContext) -> { //3
                }, 250, 1000),
                new Transition((renderContext) -> { //4
                }, 250, 1000),
                new Transition((renderContext) -> { //5
                }, 250, 1000),
                new Transition((renderContext) -> { //6
                }, 250, 1000),
                new Transition((renderContext) -> { //7
                }, 250, 1000),
                new Transition((renderContext) -> { //8
                }, 250, 1000),
                new Transition((renderContext) -> { //9
                	GL11.glTranslatef(0f, 0f, 0.35f);
                }, 250, 1000),
                new Transition((renderContext) -> { //10
                	GL11.glTranslatef(0f, 0f, 0.7f);
                }, 250, 1000),
                new Transition((renderContext) -> { //11
                	GL11.glTranslatef(0f, 0f, 0.7f);
                }, 250, 1000),
                new Transition((renderContext) -> { //12
                }, 250, 1000),
                new Transition((renderContext) -> { //13
                }, 250, 1000),
                new Transition((renderContext) -> { //14
                }, 250, 1000)
                    )
                    
			.withFirstPersonCustomPositioningReloading(Magazines.ScorpionMag,
					new Transition((renderContext) -> { //1
						GL11.glTranslatef(0F, 2.5F, 0F);
                    }, 250, 1000),
                new Transition((renderContext) -> { //2
                	GL11.glTranslatef(0f, 0.5f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> { //3
                	GL11.glTranslatef(0f, 0.5f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> { //4
                }, 250, 1000),
                new Transition((renderContext) -> { //5
                }, 250, 1000),
                new Transition((renderContext) -> { //6
                }, 250, 1000),
                new Transition((renderContext) -> { //7
                }, 250, 1000),
                new Transition((renderContext) -> { //8
                }, 250, 1000),
                new Transition((renderContext) -> { //9
                }, 250, 1000),
                new Transition((renderContext) -> { //10
                }, 250, 1000),
                new Transition((renderContext) -> { //11
                }, 250, 1000),
                new Transition((renderContext) -> { //12
                }, 250, 1000),
                new Transition((renderContext) -> { //13
                }, 250, 1000),
                new Transition((renderContext) -> { //14
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.ScorpionMag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                          GL11.glTranslatef(0F, 0.5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2.5F, 0F);
                  }, 250, 1000)
                    )
					
		    .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.5f, 1.2f, -0.6f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glRotatef(50F, 0f, 1f, 0f);
                      GL11.glRotatef(60F, 0f, 0f, 1f);
                      GL11.glRotatef(-11F, 1f, 0f, 0f);
                      GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                      GL11.glTranslatef(0.6f, 1.5f, -1.2f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 180, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 100),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 170),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 10),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 100, 50)
                    )
                    
                    
            .withFirstPersonPositioningDrawing(
            		new Transition((renderContext) -> { // Reload position
            			GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(16F, 0f, 0f, 1f);
    	                GL11.glRotatef(25F, 1f, 0f, 0f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.925000f);
                    }, 60, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(14F, 0f, 0f, 1f);
    	                GL11.glRotatef(17F, 1f, 0f, 0f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.925000f);
                    }, 60, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(12F, 0f, 0f, 1f);
    	                GL11.glRotatef(10F, 1f, 0f, 0f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -1.125000f);
                    }, 140, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(10F, 0f, 0f, 1f);
    	                GL11.glRotatef(4F, 1f, 0f, 0f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.905000f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
    	                GL11.glRotatef(8F, 0f, 0f, 1f);
    	                GL11.glScalef(2.50000f, 2.50000f, 2.5000f);
    	                GL11.glTranslatef(-0.300000f, 1.449999f, -0.925000f);
                    }, 170, 0)
                    )
			
            .withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.347f, 1.338f, 0f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ScorpionRearSight)) {
                        GL11.glTranslatef(0F, -0.17f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.07f, 0f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	 GL11.glTranslatef(-0.003F, 0.03f, 0.1f);
                } 
                
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					 GL11.glTranslatef(-0.003F, 0.06f, 0.3f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, 0.02f, 0.1f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, 0.01f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                		GL11.glTranslatef(0F, 0.01f, 0.1f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
						GL11.glTranslatef(0F, 0.08f, 0.1f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                		GL11.glTranslatef(0F, 0.08f, 0.1f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                		GL11.glTranslatef(0F, 0.08f, -0.15f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                		GL11.glTranslatef(0F, 0.12f, 0.1f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
						GL11.glTranslatef(0F, 0.07f, 0.1f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
						GL11.glTranslatef(0F, 0.07f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                		GL11.glTranslatef(0F, 0.0555f, 0.1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                		GL11.glTranslatef(0F, 0.0555f, 0.1f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.347f, 1.338f, 0.2f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ScorpionRearSight)) {
                        GL11.glTranslatef(0F, -0.17f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.07f, 0f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	 GL11.glTranslatef(-0.003F, 0.03f, 0f);
                } 
                
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					 GL11.glTranslatef(-0.003F, 0.06f, 0.2f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, 0.02f, 0f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, 0.01f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                		GL11.glTranslatef(0F, 0.01f, 0.1f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
						GL11.glTranslatef(0F, 0.08f, 0.1f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                		GL11.glTranslatef(0F, 0.08f, 0.1f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                		GL11.glTranslatef(0F, 0.08f, -0.25f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                		GL11.glTranslatef(0F, 0.12f, 0.1f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
						GL11.glTranslatef(0F, 0.07f, 0.1f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
						GL11.glTranslatef(0F, 0.07f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                		GL11.glTranslatef(0F, 0.0555f, 0.1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                		GL11.glTranslatef(0F, 0.0555f, 0.1f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
				
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glRotatef(20F, 0f, 0f, 1f);
                GL11.glRotatef(10F, 1f, 0f, 0f);
                GL11.glScalef(2.00000f, 2.00000f, 2.00000f);
                GL11.glTranslatef(-0f, 1.35f, -0.55f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.925000f, 1.10000f, -0.800000f);
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.825000f, 1.00000f, -0.700000f);
             })
			 
			 .withFirstPersonHandPositioning(
			         (renderContext) -> {
                         RenderContext<?> rc = (RenderContext<?>) renderContext;
                         ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                 AttachmentCategory.GRIP, rc.getWeaponInstance());
                         if(activeAttachment == Attachments.Grip2 ||
                                activeAttachment == Attachments.StubbyGrip || 
                                activeAttachment == Attachments.VGrip) {
                        	 GL11.glScalef(4f, 4f, 4f);
                        	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(0.175000f, -0.100000f, 0.075000f);
                        	 
//                        	 GL11.glScalef(4f, 4f, 4f);
                         } else {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.325000f, -0.210000f, 0.035000f);
                         }
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                        	 GL11.glScalef(4f, 4f, 4f);
                        	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(0.175000f, -0.100000f, 0.075000f);
                        } else {
                        	 GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.325000f, -0.210000f, 0.035000f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                    })
					 
			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, 0.025000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, 0.025000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
			        
					// mag is at bottom 1
					
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4f, 4f, 4f);
                		GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                		GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                		GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                		GL11.glTranslatef(0.500000f, -0.275000f, 0.200000f);
                    }, 300, 0),
			        
			        //mag touches gun 2 
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(4f, 4f, 4f);
			        	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.300000f, -0.225000f, 0.100000f);
                    }, 210, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(4f, 4f, 4f);
			        	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.300000f, -0.225000f, 0.100000f);
			        }, 40, 0),
			        
			        //mag gets pushed in 4
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4f, 4f, 4f);
			        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.250000f, -0.450000f, 0.100000f);
                    }, 120, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4f, 4f, 4f);
			        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.250000f, -0.450000f, 0.100000f);
			        }, 60, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4f, 4f, 4f);
			        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.250000f, -0.450000f, 0.100000f);
			        }, 90, 0),
                    
                    // left hand grabs action 7
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.175000f, -0.200000f, -0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.175000f, -0.200000f, -0.050000f);
                    }, 250, 0),
                    
                    // left hand pulls back action halfway 9
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.150000f, -0.300000f, -0.025000f);
                    }, 80, 0),
                    
                    // left hand pulls action back 10
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.090000f, -0.380000f, -0.075000f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.090000f, -0.380000f, -0.075000f);
                    }, 80, 0),
                    
                    // left hand lets go 12
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.040000f, -0.570000f, -0.075000f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.040000f, -0.570000f, -0.075000f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.040000f, -0.570000f, -0.075000f);
                    }, 80, 0)
			        )
					
			.withFirstPersonRightHandPositioningReloading(
			       
					new Transition((renderContext) -> { // Reload position 1
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position 2
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position 3
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position 4
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position 5
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position 6
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 1000),
					new Transition((renderContext) -> { // Reload position 7
					    GL11.glScalef(4f, 4f, 5f); 
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position 8
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
					new Transition((renderContext) -> { // Reload position 9
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position 10
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position 11
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
					new Transition((renderContext) -> { // Reload position 12
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
					new Transition((renderContext) -> { // Reload position 13
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
					new Transition((renderContext) -> { // Reload position 14
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> {
                    		GL11.glScalef(4f, 4f, 4f);
                    		GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    		GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    		GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    		GL11.glTranslatef(0.075000f, -0.425000f, 0.125000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                		GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                		GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                		GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                		GL11.glTranslatef(0.075000f, -0.425000f, 0.125000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    		GL11.glScalef(4f, 4f, 4f);
                    		GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    		GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    		GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    		GL11.glTranslatef(0.175000f, -0.375000f, 0.125000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    		GL11.glScalef(4f, 4f, 4f);
                    		GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    		GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    		GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    		GL11.glTranslatef(0.500000f, -0.275000f, 0.200000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
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
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                    }, 250, 50)
                    )
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.150000f, 0.375000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, -0.210000f, 0.035000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, -0.210000f, 0.035000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, -0.210000f, 0.035000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, -0.210000f, 0.035000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, -0.210000f, 0.035000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
            		new Transition((renderContext) -> { // Reload position
            			 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.150000f);
                    }, 110, 0)
                    )
					
			.build())
		.withSpawnEntityDamage(5f)
		.withSpawnEntityGravityVelocity(0.0118f)
				
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}