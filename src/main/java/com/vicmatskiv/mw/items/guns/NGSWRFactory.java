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
import com.vicmatskiv.mw.models.HK416;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M4A1;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.M4Receiver;
import com.vicmatskiv.mw.models.MBUSFrontSight;
import com.vicmatskiv.mw.models.MBUSRearSight;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.NGSWR;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.SIGMCX;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
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

public class NGSWRFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("ngsw_r")
		//.withAmmoCapacity(30)
		.withFireRate(0.75f)
		.withRecoil(3f)
		.withZoom(0.9f)
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("m38_dmr")
		.withSilencedShootSound("m4a1_silenced")
		.withReloadSound("m4a1_reload")
		.withUnloadSound("m4a1_unload")
		.withEndOfShootSound("gun_click")
		.withInspectSound("m4a1_inspection")
		.withDrawSound("m4_draw")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.5f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.11f)
		.withFlashOffsetY(() -> 0.16f)
		.withShellCasingForwardOffset(0.05f)
		.withShellCasingVerticalOffset(-0.03f)
//		.withShellCasingEjectEnabled(false)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withInformationProvider(stack -> Arrays.asList(
		"Type: Assault Rifle", 
		"Damage: 6", 
		"Cartridge: 6.5mm",
		"Fire Rate: SEMI, AUTO",
		"Rate of Fire: 75/100",
		"Magazines:",
        "20rnd 6.5mm Magazine"))
		 .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
		 
		 .withScreenShaking(RenderableState.SHOOTING, 
	                1f, // x 
	                1f, // y
	                3f) // z
		 
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.HK416FrontSight, renderContext -> {
        	PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.SIGMCXHandguardShort) {
                    GL11.glTranslatef(0F, 0F, 1F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof G95_upright_frontsights) {
            	GL11.glTranslatef(-0.155F, -1.85F, -4.5F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
              }
        }, true, false)
        .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.SIGMCXHandguardShort) {
                    GL11.glTranslatef(0F, 0F, 1F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSFrontSight) {
            	GL11.glTranslatef(-0.16F, -1.8F, -5F);
                GL11.glScaled(0.37F, 0.37F, 0.37F);
              }
        }, false, false)
        .withCompatibleAttachment(Attachments.HK416Grip, (model) -> {
          GL11.glTranslatef(0f, -0.075f, 0f);
        })
        .withCompatibleAttachment(Attachments.HK416GripTan, true, (model) -> {
            GL11.glTranslatef(0f, -0.075f, 0f);
          })
        .withCompatibleAttachment(Attachments.M4Grip, (model) -> {
        	GL11.glTranslatef(0f, -0.075f, 0f);
        })
        .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
        	GL11.glTranslatef(0f, -0.075f, 0f);
        })
        .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
        	GL11.glTranslatef(0f, -0.075f, 0f);
        })
        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
        	GL11.glTranslatef(-0.02f, -0.47f, 0.5f);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
        	GL11.glTranslatef(-0.02f, -0.47f, 0.5f);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStock, true, (model) -> {
        	GL11.glTranslatef(-0.02f, -0.47f, 0.5f);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
        })
        .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
        	GL11.glTranslatef(-0.02f, -0.47f, 0.5f);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStockTan, (model) -> {
        	GL11.glTranslatef(-0.02f, -0.47f, 0.5f);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStockTan, (model) -> {
        	GL11.glTranslatef(-0.02f, -0.47f, 0.5f);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
        })
        .withCompatibleAttachment(Attachments.HK416StockTan, true, (model) -> {
        	GL11.glTranslatef(-0.02f, -0.47f, 0.5f);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
        })
        .withCompatibleAttachment(Magazines.NGSWRMag, (model) -> {
//		    GL11.glTranslatef(-0.333F, 0.45F, -1.4F);
//            GL11.glScaled(1.02F, 1.35F, 1.33F);
        })
		.withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
            GL11.glTranslatef(-0.175F, -1.535F, -0.6F);
            GL11.glScaled(0.7F, 0.4F, 0.7F);
        })
		.withCompatibleAttachment(AuxiliaryAttachments.SIGMCXAction, true, (model) -> {
          GL11.glTranslatef(-0F, 0.1F, 0.1F);
          GL11.glScaled(1.1F, 1.1F, 1.1F);
		})
	   .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
           if(model instanceof TritiumRearSights) {
           	 GL11.glTranslatef(-0.16F, -1.8F, -0.5F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
           }
       })
	   .withCompatibleAttachment(Attachments.HK416RearSights, true, (model) -> {
           if(model instanceof G95_upright_rearsights) {
        	   GL11.glTranslatef(-0.157F, -1.82F, -0.5F);
               GL11.glScaled(0.32F, 0.32F, 0.32F);
           }
       })
	   .withCompatibleAttachment(Attachments.MBUSRearSights, (model) -> {
           if(model instanceof MBUSRearSight) {
        	   GL11.glTranslatef(-0.162F, -1.8F, -0.3F);
               GL11.glScaled(0.37F, 0.37F, 0.37F);
           }
       })
        
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.21F, -1.67F, -1.9F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.28F, -1.7F, -0.5F);
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
		
		.withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GL11.glTranslatef(-0.192F, -1.38F, -1F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
            if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.16F, -1.53F, -1.8F);
		            GL11.glScaled(0.46F, 0.46F, 0.46F);
        },(model) -> {
             if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
            }
        })
		
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -2.2F, -1F);
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
		
		.withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GL11.glTranslatef(-0.06F, -1.5F, -1.2F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
		},(model) -> {
            if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.055F, -1.46F, -1.1F);
                    GL11.glScaled(0.54F, 0.54F, 0.54F);
		},(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
		})
		
		.withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.0265F, -1.52F, -1.1F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
			},(model) -> {
	            if(model instanceof Holo2) {
	                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
	                GL11.glScaled(0.1F, 0.1F, 0.1F);
	            }
	        })
		
		.withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
			GL11.glTranslatef(-0.0265F, -1.52F, -1.1F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
			GL11.glTranslatef(-0.0265F, -1.52F, -1.5F);
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
            GL11.glTranslatef(-0.32F, -1.73F, -1.3F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
	    
		.withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.032F, -1.53F, -0.9F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
		},(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		
		.withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
					GL11.glTranslatef(-0.032F, -1.53F, -0.9F);
		            GL11.glScaled(0.73F, 0.73F, 0.73F);
		},(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		
		.withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.187F, -1.75F, -1F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
		
		.withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
			 GL11.glTranslatef(-0.187F, -1.75F, -1F);
             GL11.glScaled(0.43F, 0.43F, 0.43F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		.withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -1.1F, -0.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
		.withCompatibleAttachment(Attachments.Grip2, (model) -> {
			GL11.glTranslatef(-0.2F, -0.3F, -3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.59F, -3.37F);
			GL11.glScaled(1F, 1F, 1F);
        })
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.3F, -3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.3F, -3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.3F, -3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Bipod, (model) -> {
			GL11.glTranslatef(-0.2F, -0.3F, -4F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
		    GL11.glTranslatef(-0.22F, -1.21F, -3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
		})
		.withCompatibleAttachment(Attachments.Laser, (p, s) -> {
			GL11.glTranslatef(0.05F, -1.15F, -3.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
			GL11.glTranslatef(-0.2F, -1.235F, -7F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("ngswr")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new NGSWR())
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
			    GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.2F, -1F, 2.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.26f, 1.55f, -0.9f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.26f, 1.55f, -0.55f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
            	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
            	GL11.glRotatef(45F, 0f, 1f, 0f);
            	GL11.glRotatef(5.000000f, 0f, 0f, 1f);
            	GL11.glTranslatef(-0.225000f, 1.050000f, -0.750000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
            	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
            	GL11.glRotatef(45F, 0f, 1f, 0f);
            	GL11.glRotatef(5.000000f, 0f, 0f, 1f);
            	GL11.glTranslatef(-0.225000f, 1.050000f, -0.400000f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
		
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.SIGMCXAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.7f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.SIGMCXAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.7f);
                })
                
            .withFirstPersonCustomPositioning(Magazines.NGSWRMag, (renderContext) -> {
//            	 GL11.glTranslatef(0.2f, 0.35f, 0f);
//            	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                })
				
            .withFirstPersonPositioningReloading(
			        
					// mag is at bottom
					
			        new Transition((renderContext) -> {
			        	GL11.glTranslatef(0f, 0.3f, 0f);
			        	
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-25.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.98f, 1.32f, -0.72f);
                    }, 300, 0),
			        
			        //mag touches gun
			        
			        new Transition((renderContext) -> { 
			        	GL11.glTranslatef(0f, 0.3f, 0f);
			        	
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-24.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(36.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.90f, 1.2f, -0.72f);
                    }, 180, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glTranslatef(0f, 0.3f, 0f);
			        	
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-24.300000f, 1f, 0f, 0f);
		                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.94f, 1.15f, -0.72f);
			        }, 40, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glTranslatef(0f, 0.3f, 0f);
			        	
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-25.300000f, 1f, 0f, 0f);
		                GL11.glRotatef(35.600000f, 0f, 1f, 0f);
		                GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.95f, 1.15f, -0.72f);
			        }, 50, 0),
			        
			        //mag gets pushed in
			        
			        new Transition((renderContext) -> {
			        	GL11.glTranslatef(0f, 0.3f, 0f);
			        	
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-24.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(36.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.9f, 1.05f, -0.72f);
                    }, 100, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glTranslatef(0f, 0.3f, 0f);
			        	
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-25.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(36.400000f, 0f, 1f, 0f);
		                GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.9f, 1f, -0.72f);
			        }, 70, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glTranslatef(0f, 0.3f, 0f);
			        	
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-25.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(35.700000f, 0f, 1f, 0f);
		                GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.93f, 1.15f, -0.72f);
			        }, 120, 0),
                    
                    // left hand goes left
                    
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.3f, 0f);
                    	
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-20.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(38.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.75f, 1.35f, -1f);
                    }, 180, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.3f, 0f);
                    	
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-15.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(42.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.6f, 1.35f, -0.7f);
                    }, 120, 0),
                    
                    // left hand hits button thingy thing
                    
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.3f, 0f);
                    	
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-15.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(43.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.9f, 1.35f, -0.7f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.3f, 0f);
                    	
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-15.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(44.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.8f, 1.35f, -0.7f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.3f, 0f);
                    	
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-15.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(43.500000f, 0f, 1f, 0f);
		                GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.74f, 1.35f, -0.7f);
                    }, 80, 0)
			        )
			        
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.4f, 2.5f, 1f);
                    	
                    	 GL11.glRotatef(44F, 0f, 1f, 0f);
                         GL11.glRotatef(6F, 0f, 0f, 1f);
                         GL11.glRotatef(4F, 1f, 0f, 0f);
                         GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                         GL11.glTranslatef(-0.300000f, 0.45f, -1.174999f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.4f, 2.7f, 1f);
                    	
                    	 GL11.glRotatef(44F, 0f, 1f, 0f);
                         GL11.glRotatef(7F, 0f, 0f, 1f);
                         GL11.glRotatef(3F, 1f, 0f, 0f);
                         GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                         GL11.glTranslatef(-0.300000f, 0.45f, -1.174999f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.4f, 2.7f, 1f);
                    	
                    	 GL11.glRotatef(43.5F, 0f, 1f, 0f);
                         GL11.glRotatef(1F, 0f, 0f, 1f);
                         GL11.glRotatef(-2F, 1f, 0f, 0f);
                         GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                         GL11.glTranslatef(-0.300000f, 0.76f, -1.174999f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.4f, 2.7f, 1f);
                    	
                    	 GL11.glRotatef(43.8F, 0f, 1f, 0f);
                         GL11.glRotatef(7F, 0f, 0f, 1f);
                         GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                         GL11.glTranslatef(-0.300000f, 0.66f, -1.174999f);
                    }, 180, 0)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
			.withFirstPersonCustomPositioningReloading(Magazines.NGSWRMag,
					new Transition((renderContext) -> {
						GL11.glTranslatef(0.05F, 2.1F, 0.5F);
                        GL11.glRotatef(6F, 0f, 0f, 1f);
                        GL11.glRotatef(6F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0.35F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0.35F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0.35F, 0F);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.NGSWRMag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.05F, 2.1F, 0.5F);
                        GL11.glRotatef(6F, 0f, 0f, 1f);
                        GL11.glRotatef(6F, 1f, 0f, 0f);
                  }, 250, 1000)
                    )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.600000f, 1.325000f, -0.575000f);
                    }, 300, 600),
                    new Transition((renderContext) -> {
                  	  GL11.glScalef(2f, 2f, 2f);
                  	  GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                  	  GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                  	  GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                  	  GL11.glTranslatef(0.500000f, 1.500000f, -0.875000f);
                    }, 350, 600)
                    )
                    
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 300, 600),
                  new Transition((renderContext) -> {
                  }, 350, 600)
                    )
            
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.SIGMCXAction.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 300, 600),
                  new Transition((renderContext) -> {
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
            			GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(24F, 0f, 0f, 1f);
                        GL11.glRotatef(30F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.26f, 1.5f, -0.7f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(37F, 0f, 1f, 0f);
                        GL11.glRotatef(15F, 0f, 0f, 1f);
                        GL11.glRotatef(20F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.26f, 1.45f, -0.8f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(16F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.26f, 1.55f, -0.9f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glRotatef(20F, 0f, 0f, 1f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.26f, 1.55f, -1f);
                    }, 140, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(11F, 0f, 0f, 1f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.26f, 1.55f, -0.9f);
                    }, 120, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
			
            .withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.35f, 1.3f, -0.1f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                        GL11.glTranslatef(0F, -0f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                        GL11.glTranslatef(0F, 0.015f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.0f, 0f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	GL11.glTranslatef(0F, 0.00f, 0.2f);
                } 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                        GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        GL11.glTranslatef(-0.01F, 0.02f, 0.3f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, -0.025f, 0.4f);
                } 

				// HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        GL11.glTranslatef(0.001F, -0.0f, 0.2f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, 0.02f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        GL11.glTranslatef(0F, -0.01f, 0f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        GL11.glTranslatef(0F, 0.053f, 0f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                	GL11.glTranslatef(0F, 0.053f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	GL11.glTranslatef(-0.004F, 0.05f, 0.25f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        GL11.glTranslatef(0F, 0.06f, 0f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        GL11.glTranslatef(0F, 0.04f, 0f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        GL11.glTranslatef(0F, 0.04f, 0f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        GL11.glTranslatef(0F, 0.07f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                	GL11.glTranslatef(0F, 0.07f, 0.3f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.35f, 1.3f, 0.1f);
//                GL11.glRotatef(-0.5F, 1, 0, 0);
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	GL11.glTranslatef(0F, 0.0f, 0.1f);
                } 
                
             // Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                        GL11.glTranslatef(0F, -0.0f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                        GL11.glTranslatef(0F, 0.015f, 0f);
				} 
                
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.0f, 0f);
				} 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                        GL11.glTranslatef(0F, 0f, 0f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    	GL11.glTranslatef(-0.01F, 0.02f, 0.15f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    	GL11.glTranslatef(-0.003F, -0.025f, 0.3f);
                } 

             // HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        GL11.glTranslatef(0.001F, -0.0f, 0.05f);
				} 
                
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					GL11.glTranslatef(0F, 0.02f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        GL11.glTranslatef(0F, -0.01f, 0f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
					GL11.glTranslatef(0F, 0.053f, 0f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                	GL11.glTranslatef(0F, 0.053f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	GL11.glTranslatef(-0.004F, 0.05f, 0.25f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        GL11.glTranslatef(0F, 0.06f, 0f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
					GL11.glTranslatef(0F, 0.04f, 0f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
					GL11.glTranslatef(0F, 0.04f, 0f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                	GL11.glTranslatef(0F, 0.07f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                	GL11.glTranslatef(0F, 0.07f, 0.3f);
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
                GL11.glTranslatef(-0.400000f, 1.475000f, -0.500000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
			     GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(15.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.300000f, 1.300000f, -0.650000f);
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.800000f, 0.50000f, -0.400000f);
             })
			 
			 .withFirstPersonHandPositioning(
			         (renderContext) -> {
                         RenderContext<?> rc = (RenderContext<?>) renderContext;
                         ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                 AttachmentCategory.GRIP, rc.getWeaponInstance());
                         if(activeAttachment == Attachments.Grip2 ||
                                activeAttachment == Attachments.StubbyGrip || 
                                activeAttachment == Attachments.VGrip || 
                                activeAttachment == Attachments.JunoGrip) {
                             GL11.glScalef(3f, 3f, 3f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.300000f, 0.050000f, 0.075000f);
                         } else if(activeAttachment == Attachments.AngledGrip) {
                        	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                             GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.300000f, -0.210000f, 0.085000f);
                         } else {
                             GL11.glScalef(3.5f, 3.5f, 3.5f);
                             GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.310000f, -0.070000f, 0.085000f);
                         }
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     })
			 
			 .withFirstPersonHandPositioningZooming(
					 (renderContext) -> {
                         RenderContext<?> rc = (RenderContext<?>) renderContext;
                         ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                 AttachmentCategory.GRIP, rc.getWeaponInstance());
                         if(activeAttachment == Attachments.Grip2 ||
                                activeAttachment == Attachments.StubbyGrip || 
                                activeAttachment == Attachments.VGrip) {
                             GL11.glScalef(3f, 3f, 3f);
                             GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.175000f, -0.050000f, 0.175000f);
                         } else if(activeAttachment == Attachments.AngledGrip) {
                        	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                             GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.300000f, -0.210000f, 0.085000f);
                         } else if(activeAttachment == Attachments.JunoGrip) {
                             GL11.glScalef(3f, 3f, 3f);
                             GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.275000f, -0.150000f, 0.350000f);
                         } else if(activeAttachment == Attachments.Bipod) {
                             GL11.glScalef(3f, 3f, 3f);
                             GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.150000f, -0.075000f, 0.200000f);
                         } else {
                        	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                             GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.310000f, -0.070000f, 0.085000f);
                             
//                             GL11.glScalef(3f, 3f, 3f);
                         }
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.175000f, -0.050000f, 0.175000f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.300000f, -0.210000f, 0.085000f);
                        } else if(activeAttachment == Attachments.JunoGrip) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.150000f, 0.350000f);
                        } else if(activeAttachment == Attachments.Bipod) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.150000f, -0.075000f, 0.200000f);
                        } else {
                            GL11.glScalef(3.5f, 3.5f, 3.5f);
                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.350000f, 0.025000f);
                            
//                            GL11.glScalef(3.5f, 3.5f, 3.5f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    })
					 
			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.075000f, 0.375000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(125.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.50000f, -0.160000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.31000f, -0.550000f, 0.100000f);
                     })
					 
            .withFirstPersonLeftHandPositioningReloading(
            		
            		// mag is at bottom
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.400000f, -0.125000f, 0.100000f);
					}, 50, 200),
			        // mag touches gun
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.100000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.100000f);
				}, 50, 200),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.100000f);
				}, 50, 200),
			        // mag inserts
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
			        	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.150000f, -0.440000f, 0.100000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
			        	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.150000f, -0.440000f, 0.100000f);
				}, 50, 200),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
			        	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.150000f, -0.440000f, 0.100000f);
				}, 50, 200),
			        // hand goes left
					new Transition((renderContext) -> {
						GL11.glTranslatef(0.000000f, -0.0f, -0.3f);
						
						GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.575000f, 0.025000f);
					}, 250, 0),
					new Transition((renderContext) -> {
						GL11.glTranslatef(0.000000f, -0.0f, -0.3f);
						
						GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.650000f, -0.250000f);
				}, 250, 0),
					// hand hits 
					new Transition((renderContext) -> {
						GL11.glTranslatef(0.000000f, -0.0f, -0.3f);
						
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
						GL11.glRotatef(55.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.075000f, -0.650000f, 0.025000f);
                    }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glTranslatef(0.000000f, -0.0f, -0.3f);
						
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
						GL11.glRotatef(55.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.075000f, -0.650000f, 0.025000f);
                }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glTranslatef(0.000000f, -0.0f, -0.3f);
						
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
						GL11.glRotatef(55.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.075000f, -0.650000f, 0.025000f);
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
                    }, 250, 0))
                    
			.withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.175000f, -0.300000f, 0.375000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 0.150000f, 0.450000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 0.150000f, 0.450000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 0.150000f, 0.450000f);
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
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, 0.000000f, 0.275000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.300000f, 0.050000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.500000f, 0.100000f);
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
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.125000f, 0.075000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.125000f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.125000f, 0.075000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.125000f, 0.075000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.125000f, 0.075000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
            		new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 110, 0)
                    )
					
			.build())
		.withSpawnEntityDamage(6f)
		.withSpawnEntityGravityVelocity(0.0118f)
				
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}