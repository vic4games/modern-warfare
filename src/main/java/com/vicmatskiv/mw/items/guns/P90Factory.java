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
import com.vicmatskiv.mw.models.P90;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.SR3;
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

public class P90Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("p90")
        .withFireRate(0.85f)
        .withRecoil(1.5f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("p90")
        .withSilencedShootSound("mp5_silenced")
        .withReloadSound("p90_reload")
        .withUnloadSound("p90_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.2f)
        .withFlashOffsetY(() -> 0.27f)
        .withShellCasingEjectEnabled(false)
        .withInaccuracy(2f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Personal Defense Weapon",
        "Damage: 5", 
        "Cartridge: 5.7x28mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 80/100",
        "Magazines:",
        "50rnd 5.7x28mm Magazine",
        "65rnd 5.7x28mm Terminator Magazine (w/ Terminator conversion kit)"))
         .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 0.1f, // y
                 3f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
        .withCompatibleAttachment(AuxiliaryAttachments.P90Action, true, (model) -> {
//            GL11.glTranslatef(0F, 0F, 1F);
        })
        .withCompatibleAttachment(Magazines.P90Mag, (model) -> {
//            GL11.glTranslatef(2F, 0.2F, 1.8F);
//            GL11.glRotatef(90F, 1f, 0f, 0f);
//            GL11.glRotatef(-20F, 0f, 0f, 1f);
//            GL11.glRotatef(-15F, 0f, 1f, 0f);
        	
        	 
//        	 GL11.glTranslatef(0.65F, -0.4F, 1.9F);
//        	 	GL11.glRotatef(10F, 1f, 0f, 0f);
//        	 	GL11.glRotatef(20F, 0f, 1f, 0f);
        	 	
//        	 	GL11.glTranslatef(0F, -0.3F, 1.9F);
//           	 	GL11.glRotatef(5F, 1f, 0f, 0f);
        	 	
//         	GL11.glTranslatef(0F, -0.22F, 0.2F);
//        	 	GL11.glRotatef(5F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.P90TerminatorMag, (model) -> {
            GL11.glTranslatef(0.1F, 0.5F, 1.55F);
            GL11.glScaled(1.1F, 1.5F, 1.55F);
        })
        .withCompatibleAttachment(Attachments.P90Swordfish, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.25F, -2F, -2.8F);
                GL11.glRotatef(69F, 0f, 0f, 1f);
                GL11.glScaled(0.8F, 0.7F, 0.7F);
          } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.57F, -1.8F, -2.8F);
                GL11.glRotatef(-69F, 0f, 0f, 1f);
                GL11.glScaled(0.8F, 0.7F, 0.7F);
          } else if(model instanceof AKRail3) {
              GL11.glTranslatef(0.4F, -0.925F, -2.95F);
              GL11.glRotatef(90F, 0f, 0f, 1f);
              GL11.glScaled(0.9F, 0.7F, 0.3F);
          } else if(model instanceof AKRail4) {
              GL11.glTranslatef(-0.6F, -0.675F, -2.95F);
              GL11.glRotatef(-90F, 0f, 0f, 1f);
              GL11.glScaled(0.9F, 0.7F, 0.3F);
          } else if(model instanceof AKRail5) {
              GL11.glTranslatef(-0.26F, -2.12F, -2.8F);
              GL11.glScaled(0F, 0F, 0F);
          }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
              GL11.glTranslatef(-0.25F, -2.12F, -2.47F);
              GL11.glScaled(0.9F, 0.9F, 0.88F);
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
        .withCompatibleAttachment(Attachments.P90Terminator, (model) -> {
        })
        .withCompatibleAttachment(Attachments.P90DefaultKit, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.P90Placeholder, true, (model) -> {
            GL11.glScaled(0F, 0F, 0F);
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
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.31F, -2.55F, -2.3F);
                GL11.glScaled(1.2F, 0.8F, 0.4F);
            } if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.043F, -1.12F, -3.38F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.19F, -2.27F, -2.4F);
                GL11.glScaled(0.5F, 0.55F, 0.7F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.127F, -1.77F, -2.22F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(-0.09F, -2.13F, -0.9F);
                GL11.glScaled(0.73F, 0.73F, 0.73F);
            } else if(model instanceof M27rearsight) {
                GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MBUSiron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.24F, -2.25F, -2.6F);
            GL11.glScaled(1.0F, 1.0F, 1.0F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.345F, -2.26F, -1F);
            GL11.glScaled(0.93F, 0.93F, 0.93F);
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
                GL11.glTranslatef(-0.2F, -2.25F, -1.3F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                GL11.glTranslatef(-0.2F, -2.25F, -1.3F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.83F, -1.3F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.05F, -2F, -1.5F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
        	GL11.glTranslatef(-0.05F, -1.95F, -1.5F);
            GL11.glScaled(0.63F, 0.63F, 0.63F);
			},(model) -> {
			if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
			    GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
			})
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -2.8F, -1F);
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
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.018F, -2.05F, -1.4F);
                GL11.glScaled(0.85F, 0.85F, 0.85F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                GL11.glTranslatef(-0.018F, -2.05F, -1.4F);
                GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(-0.018F, -2.05F, -1.7F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
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
                GL11.glTranslatef(-0.35F, -2.3F, -1.8F);
                GL11.glScaled(0.58F, 0.58F, 0.58F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.02F, -2.05F, -1.1F);
                GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef(-0.02F, -2.05F, -1.1F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(0.75F, -0.72F, -2.6F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(0.75F, -0.72F, -2.6F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(0.75F, -0.72F, -2.6F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0.15F, -3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.13F, -1.99F, -2F);
            GL11.glRotatef(-20F, 0f, 0f, 1f);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0.13F, -1.99F, -2F);
            GL11.glRotatef(-20F, 0f, 0f, 1f);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Silencer57x38, (model) -> {
            GL11.glTranslatef(-0.22F, -0.99F, -4.77F);
            GL11.glScaled(1.3F, 1.3F, 1.3F);
        })
        .withTextureNames("p90")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new P90())
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
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-2.2F, -1.1F, 2.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 1.800000f, -2.125000f);
                    } else {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.500000f, -1.825000f);
                        
//                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    }
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 1.800000f, -1.425000f);
                    } else {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.500000f, -1.225000f);
                    }
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
            
            .withFirstPersonCustomPositioning(Magazines.P90TerminatorMag.getRenderablePart(), (renderContext) -> {
//            	GL11.glTranslatef(-0.1F, -0.6F, 1.1F);
//            	GL11.glRotatef(90F, 0f, 1f, 0f);
//            	GL11.glRotatef(20F, 1f, 0f, 0f);
//            	GL11.glRotatef(-10F, 0f, 0f, 1f);
                })
            
            .withFirstPersonPositioningReloading(
            		
            		// left hand goes to pouch
            		
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                        	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(8.000000f, 1f, 0f, 0f);
	                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                        GL11.glRotatef(18.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.694999f, -1.749999f);
                        } else {
	                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(8.000000f, 1f, 0f, 0f);
	                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                        GL11.glRotatef(18.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.694999f, -1.749999f);
                        }
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                        	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(7.000000f, 1f, 0f, 0f);
	                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.714999f, -1.749999f);
                        } else {
	                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(7.000000f, 1f, 0f, 0f);
	                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.714999f, -1.749999f);
                        }
                    }, 60, 0),
                    
                    // left hand raises mag out of pouch
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                        	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
	                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.614999f, -1.749999f);
                        } else {
	                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
	                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.614999f, -1.749999f);
                        }
                    }, 150, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                        	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(5.300000f, 1f, 0f, 0f);
	                        GL11.glRotatef(25.100000f, 0f, 1f, 0f);
	                        GL11.glRotatef(15.500000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.654999f, -1.749999f);
                        } else {
	                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(5.300000f, 1f, 0f, 0f);
	                        GL11.glRotatef(25.100000f, 0f, 1f, 0f);
	                        GL11.glRotatef(15.500000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.654999f, -1.749999f);
                        }
                    }, 60, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                        	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
	                        GL11.glRotatef(24.600000f, 0f, 1f, 0f);
	                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.674999f, -1.749999f);
                        } else {
	                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
	                        GL11.glRotatef(24.600000f, 0f, 1f, 0f);
	                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.674999f, -1.749999f);
                        }
                    }, 80, 0),
                    
                 // mag begins to angle
                    
                    new Transition((renderContext) -> {  // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                        	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(5.200000f, 1f, 0f, 0f);
	                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
	                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.674999f, -1.749999f);
                        } else {
	                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                        GL11.glRotatef(5.200000f, 1f, 0f, 0f);
	                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
	                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
	                        GL11.glTranslatef(-0.525000f, 1.674999f, -1.749999f);
                        }
                    }, 150, 0),
                    
                    // positions mag at an angle touching the gun
                
                new Transition((renderContext) -> {  // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.600000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.674999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(4.900000f, 1f, 0f, 0f);
	                    GL11.glRotatef(23.500000f, 0f, 1f, 0f);
	                    GL11.glRotatef(18.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.674999f, -1.849999f);
                    }
                }, 170, 0),
                
                // repositions mag aligned with the gun
                
                new Transition((renderContext) -> { // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(5.100000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.674999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(4.200000f, 1f, 0f, 0f);
	                    GL11.glRotatef(23.800000f, 0f, 1f, 0f);
	                    GL11.glRotatef(14.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.674999f, -2.049999f);
                    }
                }, 220, 0),
                
                new Transition((renderContext) -> { // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(5.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.674999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(4.100000f, 1f, 0f, 0f);
	                    GL11.glRotatef(24.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(15.500000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.674999f, -1.929999f);
                    }
                }, 50, 0),
                
                new Transition((renderContext) -> { // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.900000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.900000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.674999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(4.300000f, 1f, 0f, 0f);
	                    GL11.glRotatef(24.700000f, 0f, 1f, 0f);
	                    GL11.glRotatef(13.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.674999f, -1.89999f);
                    }
                }, 60, 0),
                
                // left hand pushes mag in
                
                new Transition((renderContext) -> {  // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(3.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.614999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(7.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(14.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.674999f, -1.849999f);
                    }
                }, 120, 0),
                
                new Transition((renderContext) -> {  // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(3.400000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.694999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(7.500000f, 1f, 0f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(17.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.674999f, -1.879999f);
                    }
                }, 70, 0),
                
                // mag clamps
                
                new Transition((renderContext) -> {  // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(5.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.684999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(8.300000f, 1f, 0f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(14.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.764999f, -1.799999f);
                    }
                }, 100, 0),
                new Transition((renderContext) -> {  // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(5.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.634999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(8.100000f, 1f, 0f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(17.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.724999f, -1.799999f);
                    }
                }, 60, 0),
                new Transition((renderContext) -> {  // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(5.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.684999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(8.100000f, 1f, 0f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.754999f, -1.799999f);
                    }
                }, 80, 0),
                new Transition((renderContext) -> {  // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.P90Terminator) {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(5.200000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(17.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.694999f, -1.749999f);
                    } else {
	                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
	                    GL11.glRotatef(8.200000f, 1f, 0f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(16.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.525000f, 1.754999f, -1.799999f);
                    }
                }, 100, 0),
                
                // left hand goes to action
                
                new Transition((renderContext) -> { 
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(41F, 0f, 1f, 0f);
                    GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.500000f, 1.500000f, -1.805000f);
                }, 260, 0),
                
                new Transition((renderContext) -> { 
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(41F, 0f, 1f, 0f);
                    GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.500000f, 1.500000f, -1.805000f);
                }, 70, 0),
                
                // left hand pulls action
                
                new Transition((renderContext) -> { 
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(42F, 0f, 1f, 0f);
                    GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.500000f, 1.500000f, -1.725000f);
                }, 100, 0),
                
                new Transition((renderContext) -> { 
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(41.5F, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.500000f, 1.500000f, -1.735000f);
                }, 50, 0),
                
                // left hand lets go of action
                
                new Transition((renderContext) -> { 
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(42F, 0f, 1f, 0f);
                    GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.500000f, 1.500000f, -1.895000f);
                }, 80, 0),
                
                new Transition((renderContext) -> { 
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.500000f, 1.500000f, -1.815000f);
                }, 60, 0),
                
                new Transition((renderContext) -> { 
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(42.5F, 0f, 1f, 0f);
                    GL11.glRotatef(2.500000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.500000f, 1.500000f, -1.845000f);
                }, 70, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { 
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(32.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.694999f, -1.829999f);
                    }, 330, 0),
                    new Transition((renderContext) -> { 
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(28.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.694999f, -1.799999f);
                    }, 150, 0),
                    new Transition((renderContext) -> { 
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(4.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.694999f, -1.809999f);
                    }, 180, 0),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(6.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 1.694999f, -1.749999f);
                    }, 200, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.P90Mag,
            		//mag inside pouch
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(2F, 0.2F, 1.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                        GL11.glRotatef(-15F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(2F, 0.2F, 1.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                        GL11.glRotatef(-15F, 0f, 1f, 0f);
                    }, 250, 1000),
                    // mag revealed
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(2F, -0.2F, 1.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                        GL11.glRotatef(-15F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(2F, -0.2F, 1.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                        GL11.glRotatef(-15F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(2F, -0.2F, 1.8F);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                        GL11.glRotatef(-15F, 0f, 1f, 0f);
                    }, 250, 1000),
                    //mag begins angling
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(1F, 0.2F, 0.5F);
                        GL11.glRotatef(25F, 0f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                    }, 250, 1000),
                    //mag angled
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.65F, -0.4F, 1.9F);
                   	 	GL11.glRotatef(10F, 1f, 0f, 0f);
                   	 	GL11.glRotatef(20F, 0f, 1f, 0f);
                    }, 250, 1000),
                    //mag positioned
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.3F, 1.9F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.3F, 1.9F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.3F, 1.9F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    //mag inserted
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.22F, 0.2F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.22F, 0.2F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    //mag clamps
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
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.P90Action.getRenderablePart(),
            		//mag inside pouch
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // mag revealed
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    //mag begins angling
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    //mag angled
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    //mag positioned
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    //mag inserted
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    //mag clamps
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    
                    // action grabbed
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // action goes back
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    // action lets go
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.P90Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.3F, 1.9F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                   	 GL11.glTranslatef(0.65F, -0.4F, 1.9F);
                	 	GL11.glRotatef(10F, 1f, 0f, 0f);
                	 	GL11.glRotatef(20F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(1.5F, -0.1F, 4F);
                	 	GL11.glRotatef(15F, 1f, 0f, 0f);
                	 	GL11.glRotatef(20F, 0f, 1f, 0f);
                    }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(Magazines.P90TerminatorMag,
            		//mag inside pouch
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(-0.1F, -0F, 1.1F);
                    	GL11.glRotatef(90F, 0f, 1f, 0f);
                    	GL11.glRotatef(20F, 1f, 0f, 0f);
                    	GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(-0.1F, -0F, 1.1F);
                    	GL11.glRotatef(90F, 0f, 1f, 0f);
                    	GL11.glRotatef(20F, 1f, 0f, 0f);
                    	GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 250, 1000),
                    // mag revealed
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(-0.1F, -0.6F, 1.1F);
                    	GL11.glRotatef(90F, 0f, 1f, 0f);
                    	GL11.glRotatef(20F, 1f, 0f, 0f);
                    	GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(-0.1F, -0.6F, 1.1F);
                    	GL11.glRotatef(90F, 0f, 1f, 0f);
                    	GL11.glRotatef(20F, 1f, 0f, 0f);
                    	GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(-0.1F, -0.6F, 1.1F);
                    	GL11.glRotatef(90F, 0f, 1f, 0f);
                    	GL11.glRotatef(20F, 1f, 0f, 0f);
                    	GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 250, 1000),
                    //mag begins angling
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(1F, 0.2F, 0.5F);
                        GL11.glRotatef(25F, 0f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                    }, 250, 1000),
                    //mag angled
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.65F, -0.4F, 1.9F);
                   	 	GL11.glRotatef(10F, 1f, 0f, 0f);
                   	 	GL11.glRotatef(20F, 0f, 1f, 0f);
                    }, 250, 1000),
                    //mag positioned
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.3F, 1.9F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.3F, 1.9F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.3F, 1.9F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    //mag inserted
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.22F, 0.2F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, -0.22F, 0.2F);
                   	 	GL11.glRotatef(5F, 1f, 0f, 0f);
                    }, 250, 1000),
                    //mag clamps
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
                    
//            .withFirstPersonCustomPositioningReloading(Magazines.HK50Drum,
//                    new Transition((renderContext) -> {
//                        GL11.glTranslatef(0F, 2.4F, -0.15F);
//                        GL11.glRotatef(-10F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                        GL11.glTranslatef(0F, 0.45F, -0.15F);
//                        GL11.glRotatef(-10F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000)
//                    )
//                    
//            .withFirstPersonCustomPositioningUnloading(Magazines.HK50Drum,
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                        GL11.glTranslatef(0F, 0.45F, -0.15F);
//                        GL11.glRotatef(-10F, 1f, 0f, 0f);
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                        GL11.glTranslatef(0F, 2.4F, -0.15F);
//                        GL11.glRotatef(-10F, 1f, 0f, 0f);
//                    }, 250, 1000)
//                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.6f, 1.175000f, -1.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.300000f, 2.5f, -1f);
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
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 0)
//                }, 100, 0)
            )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(65F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(55F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(50F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(5F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 190, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 190, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 1.74f, -0.8f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.9f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.21f, 1.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.11f, 1.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.175f, 1.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.175f, 1.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.15f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.11f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.12f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.235f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.18f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.18f, 0.8f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 1.74f, -0.4f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.2f, 0.65f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.21f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.11f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.175f, 1.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.175f, 1.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.15f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.11f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.12f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.235f, 1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.18f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.18f, 0.8f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 1f, 0f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.550000f, 1.900000f, -2.125000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.3f, 0.975000f, -1.5f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2.250000f, 0.725000f, -1.80000f);
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
                             GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(-0.050000f, -0.200000f, 0.325000f);
                         } else {
                             GL11.glScalef(5f, 5f, 5f);
                             GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.100000f, -0.500000f, 0.045000f);
                         }
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
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
                            GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.050000f, -0.200000f, 0.325000f);
                        } else {
                            GL11.glScalef(5f, 5f, 5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.100000f, -0.500000f, 0.045000f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
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
                            GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.050000f, -0.200000f, 0.325000f);
                        } else {
                            GL11.glScalef(5f, 5f, 5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.100000f, -0.500000f, 0.045000f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, 0.075000f);
                    }, 
                    (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, 0.075000f);
                    }, 
                    (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
            		
            		// left hand reaches for pouch
            		
                    new Transition((renderContext) -> { 
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.450000f, -0.975000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { 
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.450000f, -0.975000f, 0.050000f);
                    }, 50, 200),
                    
                    // mag is revealed
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.500000f, -0.950000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.500000f, -0.950000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.500000f, -0.950000f, -0.025000f);
                    }, 50, 200),
                    
                    // mag begins angling
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.575000f, -0.825000f, 0.075000f);
                    	
                    }, 250, 0),
                    
                    // mag is angled
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(100.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.490000f, -0.700000f, -0.355000f);
                    }, 250, 0),
                    
                    // mag is positioned
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-165.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.450000f, -0.675000f, -0.450000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-165.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.450000f, -0.675000f, -0.450000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-165.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.450000f, -0.675000f, -0.450000f);
                    }, 250, 0),
                    
                    // mag is inserted
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-165.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.425000f, -0.675000f, -0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                    	GL11.glScalef(5f, 5f, 5f);
                    	GL11.glRotatef(-165.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.425000f, -0.675000f, -0.150000f);
                    }, 250, 0),
                    
                    // mag clamps
            
		            new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-175.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(110.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.455000f, -0.700000f, -0.125000f);
		            }, 250, 0),
		            new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-175.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(110.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.455000f, -0.700000f, -0.125000f);
		            }, 250, 0),
		            new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-175.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(110.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.455000f, -0.700000f, -0.125000f);
		            }, 250, 0),
		            new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-175.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(110.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.455000f, -0.700000f, -0.125000f);
		            }, 250, 0),
		            
		            // goes to action
		            
		            new Transition((renderContext) -> {
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(0.050000f, -0.600000f, 0.100000f);
		            }, 250, 0),
		            
		            new Transition((renderContext) -> {
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(0.050000f, -0.600000f, 0.100000f);
		            }, 250, 0),
		            
		            // pulls action
		            
		            new Transition((renderContext) -> {
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(75.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.125000f, -0.775000f, 0.100000f);
		            }, 250, 0),
		            
		            new Transition((renderContext) -> {
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(75.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.125000f, -0.775000f, 0.100000f);
		            }, 250, 0),
		            
		            // lets go of action
		            
		            new Transition((renderContext) -> {
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.250000f, -0.800000f, 0.100000f);
		            }, 250, 0),
		            
		            new Transition((renderContext) -> {
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.225000f, -0.800000f, 0.100000f);
		            }, 250, 0),
		            
		            new Transition((renderContext) -> {
		            	GL11.glScalef(5f, 5f, 5f);
		            	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.200000f, -0.800000f, 0.100000f);
		            }, 250, 0)
		            )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                   }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                   }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                   }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                      }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                   }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                      }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                      }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                   }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                   }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                      }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                      }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                   }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                      }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                      }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                      	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                           GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                      }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                     	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                          GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                          GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                          GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                          GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                     }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                     }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                     }, 280, 0)
                    )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator || activeAttachment == Attachments.StubbyGrip) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-175.000000f, 1f, 0f, 0f);
		            	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
		            	GL11.glRotatef(110.000000f, 0f, 0f, 1f);
		            	GL11.glTranslatef(-0.455000f, -0.700000f, -0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator || activeAttachment == Attachments.StubbyGrip) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-165.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.450000f, -0.675000f, -0.450000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator || activeAttachment == Attachments.StubbyGrip) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(100.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.490000f, -0.700000f, -0.355000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.FRONTSIGHT, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.P90Terminator || activeAttachment == Attachments.StubbyGrip) {
                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                        }
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.575000f, -1.025000f, -0.075000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
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
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, 0.045000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, 0.045000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, 0.045000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, 0.045000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, 0.045000f);
                    }, 300, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.460000f, -0.550000f, 0.175000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

