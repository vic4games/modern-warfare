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
import com.vicmatskiv.mw.models.M14;
import com.vicmatskiv.mw.models.M14Body;
import com.vicmatskiv.mw.models.M14DMRSocomChassis;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M14TriRailCover;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.Mk14Body;
import com.vicmatskiv.mw.models.Mk14EBR;
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
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Mk14EBRFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("mk14_ebr")
        .withFireRate(0.7f)
        .withRecoil(4.5f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("mk14ebr")
        .withSilencedShootSound("mk14ebr_silenced")
        .withReloadSound("mk14ebr_reload")
        .withUnloadSound("mk14_unload")
        .withInspectSound("inspection")
        .withDrawSound("mk14_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.10f)
        .withInaccuracy(1f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Battle Rifle/Designated Marksmen Rifle",
        "Damage: 10", 
        "Cartridge: 7.62x51mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 75/100",
        "Magazines:",
        "20rnd 7.62x51mm NATO EBR Magazine",
        "50rnd 7.62x51mm NATO EBR Drum Magazine"))
         .withCrafting(CraftingComplexity.HIGH,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 1f, // y
                 6f) // z
         
//        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(AuxiliaryAttachments.Mk14EBRaction, true, (model) -> {
//        	GL11.glTranslatef(0f, 0f, 0.73f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Mk14EBRsight, true, (model) -> {
            GL11.glTranslatef(-0.125F, -1.16F, -1.334F);
            GL11.glScaled(0.12F, 0.12F, 0.12F);
        })
        .withCompatibleAttachment(Attachments.M14Body, true, (model) -> {
        	if(model instanceof M14Body) {
//                GL11.glTranslatef(0F, 0F, 0F);
//                GL11.glScaled(1F, 1F, 1F);
              } else if(model instanceof FALIron) {
                  GL11.glTranslatef(-0.19F, -1.34F, -8.5F);
                  GL11.glScaled(0F, 0F, 0F);
              }
          })
        .withCompatibleAttachment(Attachments.M14SOCOMChassis, (model) -> {
        	if(model instanceof M14DMRSocomChassis) {
	                GL11.glTranslatef(0F, 0F, 0F);
	                GL11.glScaled(1F, 1F, 1F);
	        	} else if(model instanceof FALIron) {
	                GL11.glTranslatef(-0.19F, -1.34F, -8.5F);
	                GL11.glScaled(0F, 0F, 0F);
	            } 
	        	else if(model instanceof AKRail) {
            	  GL11.glTranslatef(-0.015F, -0.65F, -6f);
                  GL11.glScaled(0.75F, 0.8F, 1F);
                  GL11.glRotatef(180F, 0f, 0f, 1f);
              } 
        })
        .withCompatibleAttachment(Attachments.Mk14TanBody, (model) -> {
        	if(model instanceof Mk14Body) {
                GL11.glTranslatef(0F, 0F, 0F);
                GL11.glScaled(1F, 1F, 1F);
              } else if(model instanceof AKRail) {
            	  GL11.glTranslatef(-0.224F, -1.38F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
              } else if(model instanceof AKRail2) {
            	  GL11.glTranslatef(-0.015F, -0.6F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
                  GL11.glRotatef(180F, 0f, 0f, 1f);
              }
        })
        .withCompatibleAttachment(Attachments.Mk14SnowBody, (model) -> {
        	if(model instanceof Mk14Body) {
                GL11.glTranslatef(0F, 0F, 0F);
                GL11.glScaled(1F, 1F, 1F);
              } else if(model instanceof AKRail) {
            	  GL11.glTranslatef(-0.224F, -1.38F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
              } else if(model instanceof AKRail2) {
            	  GL11.glTranslatef(-0.015F, -0.6F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
                  GL11.glRotatef(180F, 0f, 0f, 1f);
              }
        })
        .withCompatibleAttachment(Attachments.Mk14BlackBody, (model) -> {
        	if(model instanceof Mk14Body) {
                GL11.glTranslatef(0F, 0F, 0F);
                GL11.glScaled(1F, 1F, 1F);
              } else if(model instanceof AKRail) {
            	  GL11.glTranslatef(-0.224F, -1.38F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
              } else if(model instanceof AKRail2) {
            	  GL11.glTranslatef(-0.015F, -0.6F, -6f);
                  GL11.glScaled(0.75F, 0.75F, 1.2F);
                  GL11.glRotatef(180F, 0f, 0f, 1f);
              }
        })
        .withCompatibleAttachment(Attachments.M14Cover, true, (model) -> {
//          GL11.glTranslatef(-0.2F, -1.3F, -9F);
//          GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.M14TriRailCover, (model) -> {
            if(model instanceof M14TriRailCover) {
              GL11.glTranslatef(0F, 0F, 0F);
              GL11.glScaled(1F, 1F, 1F);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(0.12F, -1.25F, -6.6f);
                GL11.glScaled(0.7F, 0.75F, 0.75F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
            	GL11.glTranslatef(-0.36F, -1.04F, -6.6f);
                GL11.glScaled(0.7F, 0.75F, 0.75F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.224F, -1.38F, -6.6f);
                GL11.glScaled(0.75F, 0.75F, 1.4F);
            }
        })
        .withCompatibleAttachment(Attachments.M14Rail, (model) -> {
        	GL11.glTranslatef(-0.21F, -1.4F, -2.7F);
            GL11.glScaled(1.15F, 1F, 1F);
        })
        .withCompatibleAttachment(Magazines.Mk14EBRMag, (model) -> {
//        	GL11.glTranslatef(0F, 0.8F, -0.3F);
//            GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.M14Drum50, (model) -> {
            GL11.glTranslatef(0F, 0.1F, -0.62F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
            GL11.glRotatef(-10F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.Silencer762x51, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.BACKGRIP, instance);
                if(activeAttachment == Attachments.Mk14TanBody) {
                	GL11.glTranslatef(-0.2F, -1.3F, -9.5F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                	GL11.glTranslatef(-0.2F, -1.3F, -10.3F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AcogReticle) {
                GL11.glTranslatef(0F, 0F, 0f);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, false, false)
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                		AttachmentCategory.BACKGRIP, instance);
                if(activeAttachment == Attachments.Mk14TanBody || 
                		activeAttachment == Attachments.Mk14SnowBody || 
                		activeAttachment == Attachments.Mk14BlackBody) {
                    GL11.glTranslatef(0F, 0F, 0.75F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
//                	GL11.glTranslatef(-0.2F, -1.06F, -8.8F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
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
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
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
                    GL11.glTranslatef(0.25F, -1.55F, -2F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
            	GL11.glTranslatef(-0.19F, -1.34F, -8.5F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, true, false)
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.5F, -3F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef(-0.155F, -1.34F, -3F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.29F, -1.52F, -1.5F);
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
        	GL11.glTranslatef(-0.177F, -1.5F, -3.5F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.177F, -1.5F, -3.5F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -0.74F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.145F, -2.02F, -3.6F);
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
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.182F, -1.22F, -2F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.055F, -1.3F, -4F);
            GL11.glScaled(0.53F, 0.53F, 0.53F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.052F, -1.28F, -3.9F);
            GL11.glScaled(0.56F, 0.56F, 0.56F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
        	GL11.glTranslatef(-0.027F, -1.33F, -3.7F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(-0.027F, -1.33F, -3.7F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.027F, -1.33F, -2.4F);
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
                GL11.glTranslatef(-0.307F, -1.53F, -4F);
                GL11.glScaled(0.47F, 0.47F, 0.47F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
        	GL11.glTranslatef(-0.033F, -1.35F, -3.5F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
	            GL11.glTranslatef(-0.033F, -1.35F, -3.5F);
	            GL11.glScaled(0.7F, 0.7F, 0.7F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.21F, -0.07F, -4.8F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.21F, -0.07F, -4.8F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.21F, -0.07F, -5.3F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
        	GL11.glTranslatef(-0.21F, -0.07F, -4.8F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
        	GL11.glTranslatef(-0.21F, -0.07F, -4F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
        	 GL11.glTranslatef(0.03F, -1.25F, -5.5F);
             GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.03F, -1.25F, -5.5F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withTextureNames("m14dmr")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new M14())
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
                GL11.glTranslatef(-2.2F, -1.8F, 2.4F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
            	 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glScalef(2f, 2f, 2f);
                 GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.2f, 1.025000f, 0.800000f);
                 
//                 GL11.glScalef(2f, 2f, 2f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glScalef(2f, 2f, 2f);
                 GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.2f, 1.025000f, 1.20000f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.300000f, 0.65f, 0.6f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.300000f, 0.65f, 1f);
                GL11.glRotatef(0.5F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.73f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.73f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                	GL11.glTranslatef(0f, 0f, 0.73f);
                }
              })
            
            .withFirstPersonPositioningReloading(
            		
            		// left hand reaches down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-21.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.400000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.74f, 1.15f, 0.5f);
                    }, 210, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.400000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.600000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.74f, 1.12f, 0.5f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.600000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.74f, 1.11f, 0.5f);
                    }, 80, 0),
                    
                    // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-22.700000f, 1f, 0f, 0f);
                    GL11.glRotatef(39.100000f, 0f, 1f, 0f);
                    GL11.glRotatef(-11.600000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.74f, 1.16f, 0.5f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-26.300000f, 1f, 0f, 0f);
                    GL11.glRotatef(38.800000f, 0f, 1f, 0f);
                    GL11.glRotatef(-16.600000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.74f, 1.05f, 0.5f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-25.600000f, 1f, 0f, 0f);
                    GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-12.600000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.74f, 1.1f, 0.5f);
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-25.300000f, 1f, 0f, 0f);
                    GL11.glRotatef(39.400000f, 0f, 1f, 0f);
                    GL11.glRotatef(-14.600000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.74f, 1.09f, 0.5f);
                }, 90, 0),
                
                // right hand goes to action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(44.700000f, 0f, 1f, 0f);
                    GL11.glRotatef(44.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.100000f, 1.240000f, 0.675000f);
                }, 250, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-14.400000f, 1f, 0f, 0f);
                    GL11.glRotatef(44.800000f, 0f, 1f, 0f);
                    GL11.glRotatef(43.300000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.11f, 1.250000f, 0.63f);
                }, 60, 0),
                
                // right hand pulls action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(44.400000f, 0f, 1f, 0f);
                    GL11.glRotatef(41.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.11f, 1.27f, 0.7f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-19.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(44.100000f, 0f, 1f, 0f);
                    GL11.glRotatef(39.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.11f, 1.28f, 0.73f);
                }, 70, 0),
                
                // action releases
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(44.700000f, 0f, 1f, 0f);
                    GL11.glRotatef(44.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.12f, 1.240000f, 0.62f);
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(44.200000f, 0f, 1f, 0f);
                    GL11.glRotatef(36.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.07f, 1.240000f, 0.68f);
                }, 60, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(44.700000f, 0f, 1f, 0f);
                    GL11.glRotatef(41.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.03f, 1.23f, 0.65f);
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-9.400000f, 1f, 0f, 0f);
                    GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(37.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.0f, 1.22f, 0.66f);
                }, 110, 0)
            )
            
            .withFirstPersonPositioningUnloading(
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-17.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.76f, 1.12f, 0.46f);
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.750000f, 1.150000f, 0.48f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.00000f, 0f, 1f, 0f);
                        GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 1.150000f, 0.4f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.74f, 1.14f, 0.45f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.200000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.74f, 1.150000f, 0.47f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.600000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.74f, 1.22f, 0.5f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 0.85f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 0.85f);
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
                        
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(),
                 // gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Mk14EBRMag,
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.1F, 2.3F, 0.5F);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.8F, -0.25F);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.8F, -0.25F);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Mk14EBRMag,
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0.8F, -0.25F);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1F, 1.4F, -0.22F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(1F, 2.5F, -1.5F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(1.6F, 3F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2F, 6.5F, -2.5F);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M14Drum50,
            		new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.3F, 2.3F, 0.5F);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.8F, -0.25F);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.8F, -0.25F);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M14Drum50,
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0.55F, -0.22F);
                        GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1F, 1.4F, -0.22F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(1F, 2.5F, -1.5F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(1.6F, 3F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2F, 6.5F, -2.5F);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.025000f, 1.100000f, 0.725000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                	  GL11.glScalef(2f, 2f, 2f);
                	  GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                	  GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                	  GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                	  GL11.glTranslatef(0.375000f, 1.300000f, 0.625000f);
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
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2F, -2.5F, 2.7F);
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
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(),
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
                        GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.3f, 1.3f, -0f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.3f, 1.3f, -0f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.2f, 1.2f, 0.2f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(8.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.2f, 1.2f, 0.4f);
                    }, 190, 150),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(27.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.2f, 1.2f, 0.2f);
                    }, 190, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.785f, 0.9f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.34f, 0.4f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.35f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.305f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.305f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.36f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.35f, 0.2f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.338f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.355f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.345f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.383f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.383f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.38f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.37f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.37f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.37f, 2f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.30000f, 0.81f, 1.2f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                GL11.glRotatef(2F, 0f, 0f, 1f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.34f, 0.2f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.35f, 0.15f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.305f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.305f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.36f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.35f, 0f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.338f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.355f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.345f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.383f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.383f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.38f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.37f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.37f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.37f, 2f);
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
                GL11.glTranslatef(-0.100000f, 1.300000f, 0.600000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1f, 0.675000f, 0f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1f, 0.675000f, 0f);
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
                             GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.600000f, 0.100000f, 0.200000f);
                         } else {
                             GL11.glScalef(3.5f, 3.5f, 3.5f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.650000f, -0.075000f, 0.025000f);
                             
//                             GL11.glScalef(3.5f, 3.5f, 3.5f);
                         }
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                         
//                         GL11.glScalef(2.5f, 2.5f, 2.5f);
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
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.550000f, -0.075000f, 0.050000f);
                        } else {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.520000f, -0.000000f, 0.115000f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                        	GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.550000f, -0.075000f, 0.050000f);
                        } else {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.520000f, -0.000000f, 0.115000f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.350000f, 0.000000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                     })
            
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.350000f, 0.000000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.300000f, 0.075000f);
                    }, 50, 200),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.265000f, 0.185000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.265000f, 0.185000f);
                    }, 50, 200),
                    
                    // mag inserts
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.220000f, -0.205000f, 0.085000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.220000f, -0.205000f, 0.085000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.220000f, -0.205000f, 0.085000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.220000f, -0.205000f, 0.085000f);
                    }, 250, 0),
                    
                    // right hand reaches action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, 0.000000f);
                    }, 300, 0))
                    
            
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 280, 0),
                    
                    // right hand reaches action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.110000f, 0.120000f, -0.010000f);
                    }, 280, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.110000f, 0.120000f, -0.010000f);
                    }, 280, 0),
                    
                    // pulls action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.110000f, 0.080000f, -0.010000f);
                    }, 280, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.110000f, 0.080000f, -0.010000f);
                    }, 280, 0),
                    
                    // action releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.160000f, 0.170000f, 0.040000f);
                    }, 280, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.140000f, 0.110000f, 0.120000f);
                    	
                    }, 280, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.110000f, 0.040000f, 0.130000f);
                    }, 280, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.5f, 2.5f, 2.5f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.110000f, -0.040000f, 0.140000f);
                    }, 280, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.125000f);
                        
                        GL11.glTranslatef(0.150000f, 0.175000f, 0.000000f);
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.550000f, 0.175000f);
                    	
                    	GL11.glTranslatef(0.150000f, 0.175000f, 0.000000f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.425000f, -0.475000f, 0.175000f);
                    	
                    	GL11.glTranslatef(0.150000f, 0.175000f, 0.000000f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.225000f, 0.150000f);
                    	
                    	GL11.glTranslatef(0.150000f, 0.175000f, 0.000000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.225000f, 0.150000f);
                    	
                    	GL11.glTranslatef(0.150000f, 0.175000f, 0.000000f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.225000f, 0.150000f);
                    	
                    	GL11.glTranslatef(0.150000f, 0.175000f, 0.000000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.375000f, 0.250000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.275000f, -0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.475000f, -0.300000f, -0.175000f);
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
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, -0.025000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, -0.025000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, -0.025000f);
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
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
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
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.100000f, 0.075000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.200000f, 0.130000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.100000f, 0.075000f);
                    }, 280, 0))
             
            .build())
        .withSpawnEntityDamage(10f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

