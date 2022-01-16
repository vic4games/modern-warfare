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
import com.vicmatskiv.mw.models.ARX160;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.CZ805Bren;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36C;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Glock18C;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M38DMR;
import com.vicmatskiv.mw.models.M4A1;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
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

public class ARX160Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("arx160")
        .withFireRate(0.75f)
        .withRecoil(2.5f)
        .withZoom(0.9f)
        .withMaxShots(1, 3, Integer.MAX_VALUE)
        .withShootSound("arx160")
        .withSilencedShootSound("m4a1_silenced")
        .withReloadSound("g36c_reload")
        .withUnloadSound("g36c_unload")
        .withEndOfShootSound("gun_click")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.15f)
        .withShellCasingForwardOffset(0.05f)
        .withShellCasingVerticalOffset(-0.03f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Assault Rifle", 
        "Damage: 6", 
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
                Ores.GunmetalIngot,
                Ores.GunmetalPlate)
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 0.5f, // x 
                 0f, // y
                 3.5f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.ARX160Chassis, true, (model) -> {
//            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.ARX160ChassisOlive, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//          GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.ARX160ChassisTan, (model) -> {
//          GL11.glTranslatef(0.01f, -0.19f, -0.4f);
//          GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
		    GL11.glTranslatef(-0.325F, 0.1F, -1.49F);
            GL11.glScaled(1F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
        	 GL11.glTranslatef(-0.325F, 0.1F, -1.49F);
             GL11.glScaled(1F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
            GL11.glTranslatef(0F, -0.35F, -0.2F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, -0.1F, -0.3F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
            GL11.glTranslatef(-0.35F, 0.3F, -1.4F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.ARX160Action, true, (model) -> {
//            GL11.glTranslatef(0F, 0F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.Mk18HandGuard) {
                    GL11.glTranslatef(0F, 0F, -0.6F);
                    GL11.glScaled(1F, 1F, 1F);
                } else if(activeAttachment == Attachments.M38HandGuard) {
                    GL11.glTranslatef(0F, 0F, -0.4F);
                    GL11.glScaled(1F, 1F, 1F);
                } else if(activeAttachment == Attachments.M16A4HandGuard) {
                    GL11.glTranslatef(0F, 0F, -1.2F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSFrontSight) {
            	GL11.glTranslatef(-0.16F, -2.1F, -3.5F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
              }
        }, true, false)
		.withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
	           if(model instanceof MBUSRearSight) {
	        	   GL11.glTranslatef(-0.159F, -2.1F, -0.2F);
	               GL11.glScaled(0.35F, 0.35F, 0.35F);
	           }
	       })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -2F, -2.4F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.31F, -2F, -1F);
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
            GL11.glTranslatef(-0.19F, -1.66F, -1.4F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.06F, -1.8F, -1.8F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.066F, -1.8F, -1.4F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.037F, -1.85F, -1.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(-0.037F, -1.85F, -1.4F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.31F, -2.05F, -1.8F);
            GL11.glScaled(0.48F, 0.48F, 0.48F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.84F, -1.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.18F, -2.02F, -1.5F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.18F, -2.02F, -1.5F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.15F, -0.4F, -0.35F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    	})
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
			GL11.glTranslatef(-0.2F, -0.57F, -3.3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.57F, -3.3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.5F, -3.5F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.57F, -3.3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Bipod, (model) -> {
			GL11.glTranslatef(-0.18F, -0.38F, -3.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0F, -1.6F, -4.3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
        	GL11.glTranslatef(0F, -1.6F, -4.3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.2F, -1.5F, -6.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.217F, -1.9F, -2.22F);
                GL11.glScaled(0.67F, 0.675F, 0.9F);
            } else if(model instanceof AKRail2) {
            	GL11.glTranslatef(-0.217F, -1.9F, -3.93F);
                GL11.glScaled(0.67F, 0.675F, 0.9F);
            } else if(model instanceof AKRail3) {
            	GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail4) {
            	GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail5) {
            	GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withTextureNames("arx160")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Glock18C())
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
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-2F, -0.9F, 2.1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(6F, 0f, 0f, 1f);
                    GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                    GL11.glTranslatef(-0.3f, 1.83f, -0.550000f);
                    
//                    GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
//                    GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
//                    GL11.glRotatef(40.500000f, 0f, 1f, 0f);
//                    GL11.glRotatef(1.500000f, 0f, 0f, 1f);
//                    GL11.glTranslatef(-0.550000f, 2.024999f, -0.430000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(6F, 0f, 0f, 1f);
                    GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                    GL11.glTranslatef(-0.3f, 1.82f, -0.25000f);
                    GL11.glRotatef(-1F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                    GL11.glTranslatef(-0.3f, 1.65f, -0.550000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                    GL11.glTranslatef(-0.3f, 1.65f, -0.350000f);
                })
        
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.ARX160Action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
//                    GL11.glTranslatef(0F, 0F, 1F);
                }
            })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.ARX160Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.ARX160Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
                })
                
            .withFirstPersonPositioningReloading(
			        
					// mag is at bottom
					
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                    GL11.glRotatef(-34.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-22.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-1.349999f, 1.984999f, -0.525000f);
                    }, 300, 0),
			        
			        //mag touches gun
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                    GL11.glRotatef(-35.300000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.200000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-19.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-1.349999f, 1.894999f, -0.525000f);
                    }, 210, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                    GL11.glRotatef(-35.500000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.100000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-21.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-1.349999f, 1.894999f, -0.525000f);
			        }, 60, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.100000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-1.349999f, 1.894999f, -0.525000f);
			        }, 70, 0),
			        
			        //mag gets pushed in
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                    GL11.glRotatef(-36.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.100000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-1.349999f, 1.644999f, -0.525000f);
                    }, 90, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.500000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-21.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-1.349999f, 1.644999f, -0.525000f);
			        }, 60, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                    GL11.glRotatef(-35.500000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-23.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-1.349999f, 1.644999f, -0.525000f);
			        }, 90, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.200000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-22.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-1.349999f, 1.644999f, -0.525000f);
			        }, 100, 0),
                    
                    // left hand grabs action
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 2.024999f, -0.430000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-14.400000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.200000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 2.024999f, -0.435000f);
                    }, 60, 0),
                    
                    // left hand pulls back action halfway
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-16.00000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 2.024999f, -0.300000f);
                    }, 150, 0),
                    
                    // finishes pulling
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-18.300000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.400000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 2.024999f, -0.200000f);
                    }, 30, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-16.800000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.00000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 2.024999f, -0.220000f);
                    }, 80, 0),
                    
                    // left hand lets go of action
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.400000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 2.024999f, -0.50000f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 2.024999f, -0.40000f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-12.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 2.024999f, -0.450000f);
                    }, 80, 0)
			        )
                    
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-2f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.4f, -0.325000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-1f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.3f, -0.325000f);
                    }, 140, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-8f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.7f, -0.325000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-6f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.6f, -0.325000f);
                    }, 190, 0)
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ARX160Action.getRenderablePart(),
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
                    	GL11.glTranslatef(0F, 0F, 0.8F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.ARX160Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M4A1Mag,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.27f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.27f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.27f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M4A1Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                  }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(Magazines.M38Mag,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.27f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.27f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.27f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M38Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                  }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag50,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.4f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.4f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.4f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Stanag50,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                  }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag60,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.4f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.4f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.4f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Stanag60,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                  }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag100,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.27f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.27f, 0f);
//               	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.27f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Stanag100,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1F, 0.8F);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, 1.225000f, -0.625000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                      GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.500000f, 1.775000f, -0.475000f);
                  }, 350, 600)
                    )
                    
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.ARX160Action.getRenderablePart(),
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
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.G36CMag.getRenderablePart(),
                    new Transition((renderContext) -> {
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                          GL11.glTranslatef(1F, 1.5F, 0.4F);
                          GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1F, 1.5F, 0.4F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                  }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1F, 1.5F, 0.4F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.01F, 0F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.01F, 0F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.01F, 0F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glRotatef(20F, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.2f, 1.95f, -0.550000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glRotatef(30F, 0f, 0f, 1f);
                        GL11.glRotatef(7F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.2f, 2.25f, -0.550000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(39F, 0f, 1f, 0f);
                        GL11.glRotatef(40F, 0f, 0f, 1f);
                        GL11.glRotatef(2F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0f, 2.15f, -0.550000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(70F, 0f, 0f, 1f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(0.3f, 2.15f, -0.550000f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(36F, 0f, 1f, 0f);
                        GL11.glRotatef(60F, 0f, 0f, 1f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(0.4f, 2.15f, -0.550000f);
                    }, 170, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.ARX160Action.getRenderablePart(),
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
                GL11.glTranslatef(0.350000f, 1.374999f, 0.025000f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.002F, 0.22f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.002F, 0.25f, 0.75f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.002F, 0.275f, 0.75f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.185f, 0.65f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.005F, 0.24f, 0.85f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.19f, 0f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.24f, 0.85f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.26f, 0.55f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.26f, 0.55f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.3f, 0.85f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.26f, 0.75f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.26f, 0.75f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 1.374999f, 0.125000f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.002F, 0.22f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.002F, 0.25f, 0.7f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.002F, 0.275f, 0.75f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.185f, 0.65f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.005F, 0.24f, 0.85f);
                } 
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.19f, 0f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.24f, 0.85f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.26f, 0.55f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.26f, 0.55f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.3f, 0.85f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.26f, 0.75f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.26f, 0.75f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(38F, 0f, 1f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glRotatef(10F, 1f, 0f, 0f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.3f, 2.1f, -0.250000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.875000f, 1.2f, -0.725000f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.875000f, 1.2f, -0.725000f);
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
                        	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(0.400000f, -0.225000f, -0.050000f);
                         } else if(activeAttachment == Attachments.AngledGrip) {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.325000f, -0.050000f, 0.175000f);
                         } else {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.325000f, -0.200000f, -0.025000f);
                             
//                             GL11.glScalef(4f, 4f, 4f);
                         }
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.400000f, 0.125000f);
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
                       	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.400000f, -0.225000f, -0.050000f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.325000f, -0.050000f, 0.175000f);
                        } else {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.325000f, -0.200000f, -0.025000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.400000f, 0.125000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.475000f, -0.500000f, 0.150000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.450000f, 0.100000f);
                     })
            
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.500000f, 0.150000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.450000f, 0.100000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
			        
            		// mag is at bottom
					
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4.00000f, 4.00000f, 4.00000f);
			        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.475000f, -0.275000f, -0.075000f);
			        	
                    }, 300, 0),
			        
			        //mag touches gun
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(4.00000f, 4.00000f, 4.00000f);
			        	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.200000f, -0.275000f, -0.075000f);
                    }, 210, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(4.00000f, 4.00000f, 4.00000f);
			        	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.200000f, -0.275000f, -0.075000f);
			        }, 40, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(4.00000f, 4.00000f, 4.00000f);
			        	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.200000f, -0.275000f, -0.075000f);
			        }, 40, 0),
			        
			        //mag gets pushed in
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4.00000f, 4.00000f, 4.00000f);
			        	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.075000f, -0.325000f, -0.050000f);
                    }, 120, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4.00000f, 4.00000f, 4.00000f);
			        	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.075000f, -0.325000f, -0.050000f);
			        }, 60, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4.00000f, 4.00000f, 4.00000f);
			        	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.075000f, -0.325000f, -0.050000f);
			        }, 90, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(4.00000f, 4.00000f, 4.00000f);
			        	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.075000f, -0.325000f, -0.050000f);
			        }, 90, 0),
                    
                    // left hand goes left
                    
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.055000f, -0.400000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.055000f, -0.400000f, 0.025000f);
                    }, 250, 0),
                    
                    // left hand pulls back action halfway
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.065000f, -0.560000f, 0.025000f);
                    }, 80, 0),
                    
                    // left hand finishes pulling back action
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.135000f, -0.610000f, -0.035000f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.135000f, -0.610000f, -0.035000f);
                    }, 80, 0),
                    
                    // left hand lets go
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.035000f, -0.530000f, -0.065000f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.095000f, -0.380000f, -0.105000f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.205000f, -0.330000f, -0.135000f);
                    }, 80, 0)
			        )
					
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
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.00000f, 4.00000f, 4.00000f);
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
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.300000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.425000f, 0.025000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.450000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.450000f, 0.100000f);
                    }, 250, 50)
                    )
                    
            .withThirdPersonLeftHandPositioningReloading(
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
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.025000f, 0.100000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.025000f, 0.100000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.025000f, 0.100000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.025000f, 0.100000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.025000f, 0.100000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 110, 0)
                    )
                    
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}