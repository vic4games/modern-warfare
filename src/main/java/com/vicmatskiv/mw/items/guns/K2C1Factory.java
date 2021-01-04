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
import com.vicmatskiv.mw.models.K2C1;
import com.vicmatskiv.mw.models.K2C1RearSight;
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
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
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

public class K2C1Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("k2c1")
		//.withAmmoCapacity(30)
		.withFireRate(0.75f)
		.withRecoil(3f)
		.withZoom(0.9f)
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("k2c1")
		.withSilencedShootSound("m4a1_silenced")
		.withReloadSound("k2c1_reload")
		.withUnloadSound("m4a1_unload")
		.withEndOfShootSound("gun_click")
		.withInspectSound("inspection")
		.withDrawSound("noaction_draw")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.5f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.11f)
		.withFlashOffsetY(() -> 0.14f)
		.withShellCasingForwardOffset(0.05f)
		.withShellCasingVerticalOffset(-0.03f)
//		.withShellCasingEjectEnabled(false)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withInformationProvider(stack -> Arrays.asList(
		"Type: Assault Rifle", 
		"Damage: 7", 
		"Cartridge: 5.56x45mm NATO",
		"Fire Rate: SEMI, AUTO",
		"Rate of Fire: 75/100",
		"Magazines:",
        "30rnd 5.56x45mm NATO STANAG Magazine",
        "30rnd 5.56x45mm NATO PMAG Magazine",
        "50rnd 5.56x45mm NATO STANAG Drum Magazine",
		"60rnd 5.56x45mm NATO STANAG Drum Magazine",
		"100rnd 5.56x45mm NATO STANAG Drum Magazine"))
		 .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
		 
		 .withScreenShaking(RenderableState.SHOOTING, 
	                1f, // x 
	                1f, // y
	                3f) // z
		 
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
        	 GL11.glTranslatef(0.01f, -0.1f, 0.5f);
             GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStock, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.1f, 0.5f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
        	 GL11.glTranslatef(0.01f, -0.1f, 0.5f);
             GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
        	 GL11.glTranslatef(0.01f, -0.1f, 0.5f);
             GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStockTan, (model) -> {
        	 GL11.glTranslatef(0.01f, -0.1f, 0.5f);
             GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStockTan, (model) -> {
        	 GL11.glTranslatef(0.01f, -0.1f, 0.5f);
             GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.HK416StockTan, (model) -> {
        	 GL11.glTranslatef(0.01f, -0.1f, 0.5f);
             GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
//        .withCompatibleAttachment(Attachments.M4MagpulHandGuardTan, (model) -> {
//        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.2F, -1.5F, -1.82f);
                GL11.glScaled(0.6F, 0.8F, 0.78F);
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
        .withCompatibleAttachment(Attachments.K2C1Handguard, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.2F, -1.5F, -4f);
                GL11.glScaled(0.6F, 0.8F, 0.85F);
          } else if(model instanceof AKRail2) {
        	  GL11.glTranslatef(-0.035F, -0.73F, -4f);
              GL11.glScaled(0.6F, 0.8F, 0.85F);
              GL11.glRotatef(180F, 0f, 0f, 1f);
          } 
        })
        .withCompatibleAttachment(Attachments.K2C1Grip, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.K2C1RearSights, true, (model) -> {
        	if(model instanceof ScarIron2) {
        		GL11.glTranslatef(-0.065F, -1.5F, -5.1F);
                GL11.glScaled(0.65F, 0.65F, 0.8F);
        	} else if(model instanceof FALIron) {
          	  GL11.glTranslatef(-0.105F, -1.7F, -5F);
                GL11.glScaled(0.1F, 0.25F, 0.2F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
          } else if(model instanceof K2C1RearSight) {
        	  GL11.glTranslatef(-0.152f, -1.665f, 0f);
	        	GL11.glScaled(0.28F, 0.28F, 0.28F);
          } 
      })
		.withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
		    GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
          GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
            GL11.glTranslatef(0F, 0.05F, 0F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0.25F, -0F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
            GL11.glTranslatef(-0.35F, 0.69F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
		.withCompatibleAttachment(AuxiliaryAttachments.K2C1Action, true, (model) -> {
//            GL11.glTranslatef(-0.175F, -1.28F, -0.67F);
//            GL11.glScaled(0.7F, 0.4F, 0.7F);
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.21F, -1.58F, -1.8F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.28F, -1.59F, -0.5F);
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
                    GL11.glTranslatef(-0.18F, -1.29F, -0.8F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
            if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.151F, -1.433F, -1.2F);
		            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
            }
        })
		
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -2.1F, -1F);
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
                    GL11.glTranslatef(-0.066F, -1.4F, -0.9F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
		},(model) -> {
            if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.062F, -1.37F, -1F);
                    GL11.glScaled(0.48F, 0.48F, 0.48F);
		},(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
		})
		
		.withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.44F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
			},(model) -> {
	            if(model instanceof Holo2) {
	                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
	                GL11.glScaled(0.1F, 0.1F, 0.1F);
	            }
	        })
		
		.withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
				GL11.glTranslatef(-0.041F, -1.44F, -0.7F);
	            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
			GL11.glTranslatef(-0.041F, -1.44F, -1.3F);
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
            GL11.glTranslatef(-0.3F, -1.63F, -1.1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
	    
		.withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.445F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
		},(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		
		.withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef(-0.041F, -1.445F, -0.7F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
		},(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		
		.withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.18F, -1.63F, -1F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
		
		.withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
				GL11.glTranslatef(-0.18F, -1.63F, -1F);
	            GL11.glScaled(0.38F, 0.38F, 0.38F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		.withCompatibleAttachment(Attachments.Grip2, (model) -> {
			GL11.glTranslatef(-0.2F, -0.3F, -2.5F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.3F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.3F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Bipod, (model) -> {
		    GL11.glTranslatef(-0.18F, -0.3F, -2.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
		    GL11.glTranslatef(-0.22F, -1.18F, -3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
		})
		.withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
			GL11.glTranslatef(-0.2F, -1.25F, -7.5F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("k2c1")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new K2C1())
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
			    GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -0.8F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                GL11.glTranslatef(-0.250000f, 1.274999f, -0.700000f);
                
//                GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
//                GL11.glRotatef(-15.300000f, 1f, 0f, 0f);
//                GL11.glRotatef(44.500000f, 0f, 1f, 0f);
//                GL11.glRotatef(64.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(0.250000f, 1.549999f, -0.675000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                GL11.glTranslatef(-0.250000f, 1.274999f, -0.200000f);
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
            	GL11.glTranslatef(-0.225000f, 1.050000f, -0.450000f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
		
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.K2C1Action.getRenderablePart(), (renderContext) -> {
//			    GL11.glTranslatef(0f, 0f, 0.5f);
                })
			
			.withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.K2C1Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.6f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.K2C1Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.6f);
                })
                
            .withFirstPersonCustomPositioning(Magazines.M4A1Mag, (renderContext) -> {
//            	 GL11.glTranslatef(0.2f, 0.35f, 0f);
//            	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                })
				
            .withFirstPersonPositioningReloading(
			        
					// mag is at bottom
					
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(43.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.374999f, -0.850000f);
                    }, 300, 0),
			        
			        //mag touches gun
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-25.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(44.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.324999f, -0.850000f);
                    }, 210, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-25.200000f, 1f, 0f, 0f);
		                GL11.glRotatef(44.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.334999f, -0.850000f);
			        }, 40, 0),
			        
			        //mag gets pushed in
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-29.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.234999f, -0.850000f);
                    }, 120, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.304999f, -0.850000f);
			        }, 60, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-28.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.294999f, -0.850000f);
			        }, 90, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-27.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.304999f, -0.850000f);
			        }, 110, 0),
                    
                    // left hand goes left
                    
			        new Transition((renderContext) -> { // Reload position
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(65.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(0.250000f, 1.549999f, -0.605000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(59.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 1.549999f, -0.605000f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(62.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 1.549999f, -0.605000f);
                    }, 80, 0),
                    
                    // pushes button, action releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glRotatef(-16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 1.549999f, -0.705000f);
                    }, 30, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glRotatef(-14.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(59.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 1.549999f, -0.62000f);
                    }, 60, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glRotatef(-15.300000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 1.549999f, -0.675000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(61.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 1.549999f, -0.665000f);
                    }, 120, 0)
                    )
            
            // 13 transitions
			        
			.withFirstPersonPositioningUnloading(
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.324999f, -0.850000f);
                    }, 140, 0),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.254999f, -0.850000f);
                    }, 170, 0),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-5.500000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.464999f, -0.850000f);
                    }, 150, 0),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
		                GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.500000f, 1.394999f, -0.850000f);
                    }, 190, 0)
                    )
			
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.K2C1Action.getRenderablePart(),
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
                	GL11.glTranslatef(0F, 0.0F, 0.5F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0.0F, 0.5F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0.0F, 0.5F);
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.K2C1Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
			.withFirstPersonCustomPositioningReloading(Magazines.M4A1Mag,
					new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.5F, 0F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M4A1Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                          GL11.glTranslatef(-0.01F, 0F, 0F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	 GL11.glTranslatef(0F, 2.2F, 0F);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M38Mag,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.5F, 0F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M38Mag,
            		new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                          GL11.glTranslatef(-0.01F, 0F, 0F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2.2F, 0F);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag50,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.5F, 0F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Stanag50,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                          GL11.glTranslatef(-0.01F, 0F, 0F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2.2F, 0F);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag60,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.5F, 0F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Stanag60,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                          GL11.glTranslatef(-0.01F, 0F, 0F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2.2F, 0F);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag100,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.5F, 0F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0.1f, 0.35f, 0f);
               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Stanag100,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                          GL11.glTranslatef(-0.01F, 0F, 0F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2.2F, 0F);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                  }, 250, 1000)
                    )
					
		    .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 1f, -0.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                	  GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                      GL11.glRotatef(-16.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(44.500000f, 0f, 1f, 0f);
                      GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.450000f, 1.349999f, -0.705000f);
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
                        GL11.glRotatef(13F, 0f, 0f, 1f);
                        GL11.glRotatef(20F, 1f, 0f, 0f);
                        GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glTranslatef(-0.250000f, 1.344999f, -0.700000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glTranslatef(-0.250000f, 1.304999f, -0.700000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glTranslatef(-0.250000f, 1.294999f, -0.700000f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(6F, 0f, 0f, 1f);
                        GL11.glRotatef(5F, 1f, 0f, 0f);
                        GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glTranslatef(-0.250000f, 1.274999f, -0.600000f);
                    }, 140, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glScalef(2.50000f, 2.50000f, 2.50000f);
                        GL11.glTranslatef(-0.250000f, 1.274999f, -0.600000f);
                    }, 130, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.K2C1Action.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
			
            .withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.35f, 1.18f, -0.1f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.K2C1RearSights)) {
                        GL11.glTranslatef(0F, -0.035f, -0.2f);
				}
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.025f, 0f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	GL11.glTranslatef(0F, 0.025f, 0f);
                } 
                
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        GL11.glTranslatef(-0.01F, 0.03f, 0.3f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, -0.05f, 0.2f);
                } 

				// HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        GL11.glTranslatef(0.001F, -0.027f, -0.2f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, -0.015f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        GL11.glTranslatef(0F, -0.02f, 0f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    	GL11.glTranslatef(0F, 0.03f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	GL11.glTranslatef(-0.004F, 0.03f, 0.2f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        GL11.glTranslatef(0F, 0.055f, 0f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        GL11.glTranslatef(0F, 0.053f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                        GL11.glTranslatef(0F, 0.053f, 0.3f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.35f, 1.18f, 0.1f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.K2C1RearSights)) {
                        GL11.glTranslatef(0F, -0.035f, -0.2f);
				}
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.025f, 0f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	GL11.glTranslatef(0F, 0.025f, 0f);
                } 
                
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        GL11.glTranslatef(-0.01F, 0.03f, 0.2f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, -0.05f, 0.1f);
                } 

				// HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        GL11.glTranslatef(0.001F, -0.027f, -0.1f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, -0.015f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        GL11.glTranslatef(0F, -0.02f, 0f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    	GL11.glTranslatef(0F, 0.03f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	GL11.glTranslatef(-0.004F, 0.03f, 0.1f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        GL11.glTranslatef(0F, 0.055f, 0f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        GL11.glTranslatef(0F, 0.053f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                        GL11.glTranslatef(0F, 0.053f, 0.3f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
				
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glRotatef(20F, 0f, 0f, 1f);
                GL11.glRotatef(10F, 1f, 0f, 0f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.2f, 1.5f, -0.7f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.725000f, 0.900000f, -1.000000f);
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.800000f, 0.50000f, -0.700000f);
             })
			 
			 .withFirstPersonHandPositioning(
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
                         } else if(activeAttachment == Attachments.Bipod) {
                             GL11.glScalef(3f, 3f, 3f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.075000f, -0.350000f, 0.125000f);
                         } else {
                             GL11.glScalef(3.5f, 3.5f, 3.5f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.375000f, -0.350000f, 0.025000f);
                             
//                             GL11.glScalef(3.5f, 3.5f, 3.5f);
//                             GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
//                             GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
//                             GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                             GL11.glTranslatef(0.075000f, -0.475000f, 0.000000f);
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
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, 0.025000f, 0.125000f);
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
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, 0.000000f, 0.475000f);
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
			        
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.275000f, 0.075000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                            GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.575000f, 0.275000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.575000f, 0.275000f);
				}, 50, 200),
			        new Transition((renderContext) -> {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.275000f, -0.350000f, 0.000000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.275000f, -0.350000f, 0.000000f);
				}, 50, 200),
			        new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.275000f, -0.350000f, 0.000000f);
				}, 50, 200),
			        new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.275000f, -0.350000f, 0.000000f);
				}, 50, 200),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.475000f, 0.000000f);
					}, 50, 200),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.475000f, 0.000000f);
                    }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.475000f, 0.000000f);
                }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.475000f, 0.000000f);
                }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.475000f, 0.000000f);
                }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.475000f, 0.000000f);
                }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.475000f, 0.000000f);
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
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.175000f, -0.400000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.175000f, -0.400000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.2f, -0.5f, 0f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.275000f, 0.075000f);
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
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
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
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.0118f)
				
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}