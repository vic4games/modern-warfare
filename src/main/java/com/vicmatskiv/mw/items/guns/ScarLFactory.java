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
import com.vicmatskiv.mw.models.M4A1;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.MilSpecStock;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.Scar;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.ScarL;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class ScarLFactory implements GunFactory {

    @SuppressWarnings("unchecked")
	public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("scar_l")
        .withFireRate(0.6f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("scar_l")
        .withSilencedShootSound("m4a1_silenced")
        .withReloadSound("scar_reload")
        .withUnloadSound("scar_unload")
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
        .withFlashOffsetY(() -> 0.17f)
        .withShellCasingForwardOffset(0.05f)
        .withShellCasingVerticalOffset(-0.03f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Carbine", 
        "Damage: 6", 
        "Cartridge: 5.56x45mm NATO",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 65/100",
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
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withCompatibleAttachment(Attachments.ScarHandGuard, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.ScarMidWestIndustriesHandGuard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.ScarMLOKHandguard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.ScarStock, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.ScarRetractableStock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
      })
        .withCompatibleAttachment(Attachments.ScarAdapterStock, (model) -> {
       	 if(model instanceof MilSpecStock) {
       		GL11.glTranslatef(0f, -0.28f, 0.2f);
//               GL11.glScaled(1.2F, 1.2F, 1.2F);
           } 
       })
        .withCompatibleAttachment(Attachments.ScarLReceiver, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.M4Grip, (model) -> {
        	 GL11.glTranslatef(0f, 0.04f, -0.08f);
        })
        .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
        	 GL11.glTranslatef(0f, 0.04f, -0.08f);
        })
        .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
        	 GL11.glTranslatef(0f, 0.04f, -0.08f);
        })
        .withCompatibleAttachment(Attachments.M110Grip, true, (model) -> {
          GL11.glTranslatef(0f, 0.04f, -0.08f);
      })
        .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
		    GL11.glTranslatef(-0.335F, 0.4F, -1.4F);
            GL11.glScaled(1.04F, 1.25F, 1.25F);
            
//            GL11.glTranslatef(0F, 0.35F, 0F);
        })
		.withCompatibleAttachment(Magazines.SOCOM_Mag, (model) -> {
			GL11.glTranslatef(-0.335F, 0.4F, -1.4F);
            GL11.glScaled(1.04F, 1.25F, 1.25F);
        })
        .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
        	GL11.glTranslatef(-0.335F, 0.4F, -1.4F);
            GL11.glScaled(1.04F, 1.25F, 1.25F);
        })
        .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
        	GL11.glTranslatef(0F, 0.05F, -0.16F);
        })
        .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
        	GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0.25F, -0.16F);
        })
        .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
        	GL11.glTranslatef(-0.35F, 0.69F, -1.4F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.ScarAction, true, (model) -> {
//        	 GL11.glTranslatef(0F, 0F, 0.2F);
        })
         .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
             if(model instanceof M4Iron1) {
                 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
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
                 GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof G36CIron1) {
                 GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof G36CIron2) {
                 GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof ScarIron1) {
                 GL11.glTranslatef(-0.1635F, -1.71F, -0.1F);
                 GL11.glScaled(0.36F, 0.36F, 0.36F);
             } else if(model instanceof ScarIron2) {
                 GL11.glTranslatef(-0.085F, -1.67F, -4.15F);
                 GL11.glScaled(0.45F, 0.45F, 0.45F);
             } else if(model instanceof FALIron) {
                 GL11.glTranslatef(-0.11F, -1.78F, -4.1F);
                 GL11.glScaled(0.07F, 0.25F, 0.2F);
                 GL11.glRotatef(180F, 0f, 0f, 1f);
             } else if(model instanceof M14Iron) {
                 GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof MP5Iron) {
                 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof MBUSiron) {
                 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof M27rearsight) {
                 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F);
             }
         })
         .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.212F, -1.6F, -1.9F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.31F, -1.65F, -0.7F);
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
            GL11.glTranslatef(-0.185F, -1.32F, -1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef(-0.155F, -1.46F, -2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.066F, -1.44F, -1.1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.148F, -2.14F, -1F);
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
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.06F, -1.41F, -1F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
		},(model) -> {
		if(model instanceof Reflex2) {
		    GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
		    GL11.glScaled(0.15F, 0.15F, 0.15F);
		}
		})
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(-0.042F, -1.46F, -1.1F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -1.46F, -1.1F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -1.46F, -1.5F);
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
                GL11.glTranslatef(-0.3F, -1.67F, -1.3F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef(-0.044F, -1.48F, -1F);
            GL11.glScaled(0.63F, 0.63F, 0.63F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	 GL11.glTranslatef(-0.044F, -1.48F, -1F);
             GL11.glScaled(0.63F, 0.63F, 0.63F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef(-0.175F, -1.63F, -1F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.175F, -1.63F, -1F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -1.02F, -1F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.32F, -3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.32F, -3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.03F, -0.25F, -3.2F);
            GL11.glRotatef(180F, 0f, 1f, 0f);
            GL11.glScaled(1.1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
            GL11.glTranslatef(-0.23F, -0.74F, -3.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.32F, -3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0.27F, -3.5F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(-0.25F, -0.9F, -4F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(180F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
        	GL11.glTranslatef(-0.25F, -0.9F, -4F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(180F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.2F, -1.18F, -7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("scarl")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new ScarL())
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
                GL11.glTranslatef(-2F, -1.2F, 2.2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.24f, 1.4f, -0.9f);
                
//            	GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glRotatef(15F, 0f, 0f, 1f);
//                GL11.glRotatef(4F, 1f, 0f, 0f);
//                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
//                GL11.glTranslatef(-0.23f, 1.4f, -1.1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.24f, 1.4f, -0.65f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(2.00000f, 2.00000f, 2.00000f);
                GL11.glTranslatef(-0.3f, 1f, -0.775000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 0f, 0f, 1f);
                GL11.glScalef(2.00000f, 2.00000f, 2.00000f);
                GL11.glTranslatef(-0.3f, 1f, -0.675000f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
        
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.ScarAction.getRenderablePart(), (renderContext) -> {
              if(renderContext.getWeaponInstance().getAmmo() == 0) {
                GL11.glTranslatef(0F, 0F, 1.3F);
              }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.ScarAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.3F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.ScarAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.3F);
                })
                
            .withFirstPersonPositioningReloading(
			        
					// mag is at bottom
					
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(44.800000f, 0f, 1f, 0f);
		                GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.48f, 1.52f, -1.1f);
                    }, 300, 0),
			        
			        //mag touches gun
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.51f, 1.48f, -1.000000f);
                    }, 210, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-10.500000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.400000f, 0f, 1f, 0f);
		                GL11.glRotatef(-7.500000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.53f, 1.46f, -1.000000f);
			        }, 60, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-10.200000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.200000f, 0f, 1f, 0f);
		                GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.52f, 1.44f, -1.000000f);
			        }, 70, 0),
			        
			        //mag gets pushed in
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-10.600000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.600000f, 0f, 1f, 0f);
		                GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.62f, 1.43f, -1.000000f);
                    }, 100, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.200000f, 0f, 1f, 0f);
		                GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.7f, 1.33f, -1.000000f);
			        }, 70, 0),
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(45.500000f, 0f, 1f, 0f);
		                GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.67f, 1.34f, -1.000000f);
			        }, 120, 0),
                    
                    // left hand goes left
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.500000f, -1.000000f);
                    }, 190, 0),
                    
                    // left hand hits button thingy thing
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.70000f, 0f, 1f, 0f);
                        GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.48f, -1.1f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.500000f, -1.000000f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.500000f, -1.06f);
                    }, 80, 0)
			        )
			        
			.withFirstPersonPositioningUnloading(
			        
			        new Transition((renderContext) -> {
			        	GL11.glRotatef(44F, 0f, 1f, 0f);
		                GL11.glRotatef(2F, 0f, 0f, 1f);
		                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glTranslatef(-0.36f, 1.3f, -0.9f);
		                GL11.glRotatef(2F, 1f, 0f, 0f);
                    }, 190, 0),
			        new Transition((renderContext) -> {
			        	GL11.glRotatef(43.7F, 0f, 1f, 0f);
		                GL11.glRotatef(4F, 0f, 0f, 1f);
		                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glTranslatef(-0.4f, 1.55f, -0.93f);
		                GL11.glRotatef(-5F, 1f, 0f, 0f);
                    }, 130, 0),
			        new Transition((renderContext) -> {
			        	GL11.glRotatef(43.1F, 0f, 1f, 0f);
		                GL11.glRotatef(1F, 0f, 0f, 1f);
		                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glTranslatef(-0.38f, 1.53f, -0.93f);
		                GL11.glRotatef(-3F, 1f, 0f, 0f);
                    }, 140, 0)
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ScarAction.getRenderablePart(),
            		new Transition((renderContext) -> {
            			GL11.glTranslatef(0F, 0F, 1.3F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 1.3F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 1.3F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 1.3F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 1.3F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 1.3F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 1.3F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 1.3F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.ScarAction.getRenderablePart(),
            		new Transition((renderContext) -> {
            			GL11.glTranslatef(0F, 0F, 1.3F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0F, 1.3F);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0F, 0F, 1.3F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M4A1Mag,
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
                }, 250, 1000)
                    )
			
			.withFirstPersonCustomPositioningReloading(Magazines.SOCOM_Mag,
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
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M4A1Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1F, 0F);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    	  GL11.glTranslatef(0F, 2F, 0F);
//                          GL11.glRotatef(-3F, 0f, 0f, 1f);
                    }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.SOCOM_Mag,
            		 new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     	GL11.glTranslatef(0F, 1F, 0F);
                       }, 250, 1000),
                       new Transition((renderContext) -> {
                     	  GL11.glTranslatef(0F, 2F, 0F);
//                           GL11.glRotatef(-3F, 0f, 0f, 1f);
                     }, 250, 1000)
                     )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M38Mag,
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
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M38Mag,
            		 new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     	GL11.glTranslatef(0F, 1F, 0F);
                       }, 250, 1000),
                       new Transition((renderContext) -> {
                     	  GL11.glTranslatef(0F, 2F, 0F);
//                           GL11.glRotatef(-3F, 0f, 0f, 1f);
                     }, 250, 1000)
                     )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag50,
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
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Stanag50,
            		 new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     	GL11.glTranslatef(0F, 1F, 0F);
                       }, 250, 1000),
                       new Transition((renderContext) -> {
                     	  GL11.glTranslatef(0F, 2F, 0F);
//                           GL11.glRotatef(-3F, 0f, 0f, 1f);
                     }, 250, 1000)
                     )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag60,
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
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Stanag60,
            		 new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     	GL11.glTranslatef(0F, 1F, 0F);
                       }, 250, 1000),
                       new Transition((renderContext) -> {
                     	  GL11.glTranslatef(0F, 2F, 0F);
//                           GL11.glRotatef(-3F, 0f, 0f, 1f);
                     }, 250, 1000)
                     )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag100,
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
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.Stanag100,
            		 new Transition((renderContext) -> {
                     }, 250, 1000),
                     new Transition((renderContext) -> {
                     	GL11.glTranslatef(0F, 1F, 0F);
                       }, 250, 1000),
                       new Transition((renderContext) -> {
                     	  GL11.glTranslatef(0F, 2F, 0F);
//                           GL11.glRotatef(-3F, 0f, 0f, 1f);
                     }, 250, 1000)
                     )
                    
            .withFirstPersonPositioningInspecting(
            		new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.6f, 1.3f, -0.7f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                	  GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                      GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.600000f, 1.500000f, -1.100000f);
                  }, 350, 600)
                    )
                    
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.ScarAction.getRenderablePart(),
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
                    	GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(30F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.04f, 1.4f, -0.6f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glRotatef(11F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(0.25f, 1.5f, -0.6f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(39.8F, 0f, 1f, 0f);
                        GL11.glRotatef(52F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(0.35f, 1.5f, -0.7f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(52F, 0f, 0f, 1f);
                        GL11.glRotatef(8F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(0.35f, 1.5f, -0.7f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(40.4F, 0f, 1f, 0f);
                        GL11.glRotatef(53F, 0f, 0f, 1f);
                        GL11.glRotatef(6F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(0.35f, 1.5f, -0.53f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glRotatef(38F, 0f, 0f, 1f);
                        GL11.glRotatef(5F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.12f, 1.5f, -0.85f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(44.5F, 0f, 1f, 0f);
                        GL11.glRotatef(15F, 0f, 0f, 1f);
                        GL11.glRotatef(1F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.22f, 1.47f, -1.1f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.24f, 1.4f, -0.9f);
                        
//                        GL11.glRotatef(45F, 0f, 1f, 0f);
//                        GL11.glRotatef(4F, 0f, 0f, 1f);
//                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
//                        GL11.glTranslatef(-0.24f, 1.4f, -0.9f);
                    }, 80, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.ScarAction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0F, 0.2F);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glTranslatef(0F, 0F, 0.2F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                   	 GL11.glTranslatef(0F, 0F, 0.2F);
                   }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 1.237f, -0.3f);
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.01f, 0.5f);
                } 
                
//                // Standard Iron Sight Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
//                    //System.out.println("Position me for Acog");
//                    GL11.glTranslatef(0F, -0.115f, 0.7f);
//                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005F, 0.06f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0F, -0.07f, 0.8f);
                } 

                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.015f, 0.7f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, -0.02f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.01f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, -0.02f, 0.7f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.01f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Reflex");
                	 GL11.glTranslatef(0F, 0.01f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, -0.018f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, -0.018f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, 0f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.035f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0.005F, 0.032f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.005F, 0.032f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.004F, 0.027f, 0.6f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glTranslatef(0.350000f, 1.237f, -0.1f);
                 GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, -0.01f, 0.35f);
                } 
                
//             // Standard Iron Sight Zoom
//                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
//                    //System.out.println("Position me for Acog");
//                    GL11.glTranslatef(0F, 0.03f, 0.7f);
//                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005F, 0.06f, 0.55f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0F, -0.07f, 0.65f);
                } 

             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, -0.015f, 0.55f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, -0.02f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, 0.01f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, -0.02f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                	 GL11.glTranslatef(0F, 0.01f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Reflex");
                	 GL11.glTranslatef(0F, 0.01f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, -0.018f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, -0.018f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, 0f, 0.8f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0F, 0.035f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(0.005F, 0.032f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.005F, 0.032f, 0.7f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.004F, 0.027f, 0.45f);
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
                GL11.glTranslatef(-0.3f, 1.4f, -0.6f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
            	 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
			     GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(15.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.1f, 1.2f, -0.8f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(2.00000f, 2.00000f, 2.00000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.400000f, 0.800000f, -0.900000f);
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
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.125000f, -0.075000f, 0.100000f);
                         } else if(activeAttachment == Attachments.AngledGrip) {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.175000f, -0.050000f, 0.300000f);
                         } else {
                             GL11.glScalef(3.7f, 3.7f, 3.7f);
                             GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.300000f, -0.075000f, 0.100000f);
                             
//                             GL11.glScalef(3.7f, 3.7f, 3.7f);
                         }
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
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
                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.125000f, -0.075000f, 0.100000f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.175000f, -0.050000f, 0.300000f);
                        } else {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.325000f, -0.275000f, 0.050000f);
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
						GL11.glScalef(3.7f, 3.7f, 3.7f);
						GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
						GL11.glRotatef(45.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.075000f, -0.600000f, 0.100000f);
				}, 250, 0),
					// hand hits 
					new Transition((renderContext) -> {
						GL11.glScalef(3.7f, 3.7f, 3.7f);
						GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
						GL11.glRotatef(45.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.075000f, -0.575000f, 0.125000f);
                   }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.7f, 3.7f, 3.7f);
						GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
						GL11.glRotatef(45.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.075000f, -0.575000f, 0.125000f);
               }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.7f, 3.7f, 3.7f);
						GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
						GL11.glRotatef(45.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.075000f, -0.575000f, 0.125000f);
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
                   }, 250, 0))
                   
           .withFirstPersonLeftHandPositioningUnloading(
                   new Transition((renderContext) -> {
                	   GL11.glScalef(3.7f, 3.7f, 3.7f);
                       GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.175000f, -0.150000f, 0.300000f);
                   }, 50, 200),
                   new Transition((renderContext) -> {
                	   GL11.glScalef(3.7f, 3.7f, 3.7f);
                       GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.175000f, -0.150000f, 0.300000f);
                   }, 50, 200),
                   new Transition((renderContext) -> { // Reload position
                	   GL11.glScalef(3.7f, 3.7f, 3.7f);
                       GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.175000f, -0.150000f, 0.300000f);
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
                    	GL11.glScalef(3.7f, 3.7f, 3.7f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, -0.025000f);
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
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.500000f, 0.150000f);
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
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.275000f, 0.050000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.7f, 3.7f, 3.7f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.425000f, 0.000000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.7f, 3.7f, 3.7f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.575000f, 0.000000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.7f, 3.7f, 3.7f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.575000f, 0.000000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.7f, 3.7f, 3.7f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.125000f, -0.575000f, 0.000000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.7f, 3.7f, 3.7f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.425000f, 0.000000f);
                    }, 110, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.7f, 3.7f, 3.7f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.075000f, 0.100000f);
                    }, 110, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.7f, 3.7f, 3.7f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.075000f, 0.100000f);
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
                    }, 130, 60),
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
                    }, 110, 0),
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