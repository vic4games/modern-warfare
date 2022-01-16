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
import com.vicmatskiv.mw.models.ACRAction;
import com.vicmatskiv.mw.models.ACRAction2;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AKRail6;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.BushmasterACR;
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
import com.vicmatskiv.mw.models.M27rearsight;
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
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.mw.models.TritiumRearSights;
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

public class ACRFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("acr")
		.withFireRate(0.65f)
		.withRecoil(3.5f)
		.withZoom(0.9f)
		.withMaxShots(1, 3, Integer.MAX_VALUE)
		//.withMaxShots(5)
		.withShootSound("acr")
		.withSilencedShootSound("m4a1_silenced")
		.withReloadSound("acr_reload")
		.withUnloadSound("acr_unload")
		.withDrawSound("acr_draw")
		.withReloadingTime(30)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.14f)
        .withFlashOffsetY(() -> 0.16f)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withInformationProvider(stack -> Arrays.asList(
        "Type: Modular Assault Rifle", 
        "Damage: 6", 
        "Cartridge: 5.56x45mm NATO",
        "Fire Rate: SEMI, BURST, AUTO",
        "Rate of Fire: 65/100",
        "Magazines:",
        "30rnd 5.56x45mm NATO STANAG Magazine",
        "30rnd 5.56x45mm NATO PMAG Magazine",
        "50rnd 5.56x45mm NATO STANAG Drum Magazine",
		"60rnd 5.56x45mm NATO STANAG Drum Magazine",
		"100rnd 5.56x45mm NATO STANAG Drum Magazine"))
        .withCrafting(CraftingComplexity.MEDIUM,
                Ores.GunmetalIngot,
                Ores.PlasticPlate)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1f, // x 
                1f, // y
                3f) // z
        
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.ACRStock, true, (model) -> {
//            GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.ACRStockBlack, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
      })
        .withCompatibleAttachment(Attachments.ACRPRSStock, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.ACRPRSStockTan, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.ACRFixedStock, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.ACRFixedStockTan, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.ACRLongRangeStock, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.ACRPDWStock, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
//          GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.ACRHandGuard, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.19F, -1.15F, -3.9F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.43F, -0.93F, -3.92F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.ACRHandGuardBlack, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.19F, -1.15F, -3.9F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.43F, -0.93F, -3.92F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.ACRWEMSKHandGuard, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } 
        })
        .withCompatibleAttachment(Attachments.ACRWEMSKHandGuardTan, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } 
        })
        .withCompatibleAttachment(Attachments.ACRPrecisionHandGuard, (model) -> {
//        	GL11.glTranslatef(0.01f, -0.35f, -0.15f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.ACRPrecisionHandGuardTan, (model) -> {
//        	GL11.glTranslatef(0.01f, -0.35f, -0.15f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.ACRPolymerHandGuard, (model) -> {
//        	GL11.glTranslatef(0.01f, -0.35f, -0.15f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.ACRPolymerHandGuardTan, (model) -> {
//        	GL11.glTranslatef(0.01f, -0.35f, -0.15f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.ACRSBRHandGuard, (model) -> {
//        	GL11.glTranslatef(0.01f, -0.35f, -0.15f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.ACRSBRHandGuardTan, (model) -> {
//        	GL11.glTranslatef(0.01f, -0.35f, -0.15f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.ACRSquareDropHandguard, (model) -> {
        	GL11.glTranslatef(0.001f, -0f, 0f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Attachments.ACRSquareDropHandguardTan, (model) -> {
        	GL11.glTranslatef(0.001f, -0f, 0f);
//            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })
        .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
            GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
            GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
            GL11.glTranslatef(0F, -0.15F, -0.1F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0.08F, -0.15F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
            GL11.glTranslatef(-0.35F, 0.5F, -1.31F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.22F, -1.6F, -2F);
            GL11.glScaled(0.82F, 0.82F, 0.82F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.32F, -1.62F, -0.9F);
            GL11.glScaled(0.83F, 0.83F, 0.83F);
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
            GL11.glTranslatef(-0.2F, -1.26F, -1F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.154F, -1.45F, -1.7F);
		            GL11.glScaled(0.46F, 0.46F, 0.46F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
	.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
			    GL11.glTranslatef(-0.148F, -2.12F, -1F);
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
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.0555F, -1.4F, -1.5F);
            GL11.glScaled(0.52F, 0.52F, 0.52F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.034F, -1.46F, -1.4F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.034F, -1.46F, -1.4F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.034F, -1.46F, -1.4F);
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
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.054F, -1.38F, -1.3F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.64F, -1.4F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.45F, -0.99F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
	            GL11.glTranslatef(-0.04F, -1.45F, -0.99F);
	            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.18F, -1.64F, -1F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.18F, -1.64F, -1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.15F, -0.4F, -0.35F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.3F, -2.95F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
            GL11.glTranslatef(-0.23F, -0.62F, -2.9F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.ACRPrecisionHandGuard 
                		|| activeAttachment == Attachments.ACRPrecisionHandGuardTan) {
                	GL11.glTranslatef(-0.2F, -0.35F, -5F);
    	            GL11.glScaled(1F, 1F, 1F);
                } else {
                	GL11.glTranslatef(-0.18F, -0.35F, -3.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }
            }
        },(model) -> {
            if(model instanceof AcogReticle) {
                GL11.glTranslatef(0F, 0F, 0f);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
        	GL11.glTranslatef(0.08F, -1.15F, -3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.08F, -1.15F, -3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.19F, -1.205F, -6.8F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
            if(model instanceof TritiumRearSights) {
            	 GL11.glTranslatef(-0.165F, -1.72F, -0.27F);
                 GL11.glScaled(0.38F, 0.38F, 0.38F);
            }
        })
 	   .withCompatibleAttachment(Attachments.HK416RearSights, (model) -> {
            if(model instanceof G95_upright_rearsights) {
         	   GL11.glTranslatef(-0.156F, -1.73F, -0.5F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
            }
        })
 	   .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
            if(model instanceof MBUSRearSight) {
         	   GL11.glTranslatef(-0.16F, -1.73F, -0.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        })
 	  .withCompatibleAttachment(Attachments.HK416FrontSight, (model) -> {
 		  		if(model instanceof G95_upright_frontsights) {
 		  			GL11.glTranslatef(-0.155F, -1.76F, -3.5F);
 	                GL11.glScaled(0.32F, 0.32F, 0.32F);
 		  		}
              })
      
      .withCompatibleAttachment(Attachments.MBUSFrontSight, true, (model) -> {
    	  if(model instanceof MBUSFrontSight) {
    		  GL11.glTranslatef(-0.16F, -1.73F, -3.6F);
              GL11.glScaled(0.35F, 0.35F, 0.35F);
           }
      })
        .withCompatibleAttachment(Attachments.AKMIron, (model) -> {
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
                GL11.glTranslatef(-0.17F, -1.68F, -3.8F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.22F, -2F, -3.8F);
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
                GL11.glTranslatef(-0.09F, -1.525F, -3.8F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M27rearsight) {
            	GL11.glTranslatef(-0.164F, -1.7F, -0.5F);
                GL11.glScaled(0.38F, 0.38F, 0.38F);
            } else if(model instanceof MBUSiron) {
            	 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F); 
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.ACRRails, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.19F, -1.15F, -3.9F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.43F, -0.93F, -3.92F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.226F, -1.52F, -3.9F);
                GL11.glScaled(0.76F, 0.87F, 0.8F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.226F, -1.52F, -2F);
                GL11.glScaled(0.76F, 0.87F, 0.8F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.ACRAction, true, (model) -> {
            if(model instanceof ACRAction) {
                GL11.glTranslatef(-0.06F, -1.4F, -2.9F);
                GL11.glScaled(0.6F, 0.6F, 0.5F);
//                GL11.glRotatef(20F, 0f, 0f, 1f);
            }
            else if(model instanceof ACRAction2) {
            }
        })
        .withTextureNames("acr")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new BushmasterACR())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })


            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.250000f, 1.105000f, -0.325000f);
                
//                GL11.glScaled(2F, 2F, 2F);
//                GL11.glRotatef(-15f, 1f, 0f, 0f);
//                GL11.glRotatef(42.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(-25f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.270000f, 0.9f, -0.325000f);
                })

            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.250000f, 1.105000f, 0.1f);
                GL11.glRotatef(1F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.33f, 0.9f, -0.5f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.33f, 0.9f, 0f);
                })
            
            .withFirstPersonCustomPositioning(Magazines.M4A1Mag, (renderContext) -> {
//           	 	GL11.glTranslatef(0.28f, 0.66f, -0.18f);
//           	 	GL11.glRotatef(10F, 0f, 1f, 0f);
//           	 	GL11.glRotatef(-8F, 1f, 0f, 0f);
               })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.ACRAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.ACRAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.ACRAction.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 1F);
                }
            })

            .withFirstPersonPositioningReloading(
            		
            		// left hand goes down
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.270000f, 0.9f, -0.325000f);
                    }, 280, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-12f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.270000f, 0.95f, -0.325000f);
                    }, 230, 120),
                    
                    // left hand inserts mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.270000f, 0.75f, -0.325000f);
                    }, 100, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.270000f, 0.75f, -0.325000f);
                    }, 50, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-16f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.270000f, 0.75f, -0.325000f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-16f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.270000f, 0.75f, -0.325000f);
                    }, 80, 0),
                    
                    // left hand goes left
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(9f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.105000f, -0.325000f);
                    }, 260, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(4f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.105000f, -0.325000f);
                    }, 90, 0),
                    
                    // left hand hits thingy thing
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.45000f, 1.105000f, -0.325000f);
                    }, 100, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(4f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.420000f, 1.105000f, -0.325000f);
                    }, 50, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.40000f, 1.105000f, -0.325000f);
                    }, 70, 0)
                    )
                    
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-2f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1f, -0.325000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-1f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 0.9f, -0.325000f);
                    }, 140, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-8f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.3f, -0.325000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-6f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-3f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.2f, -0.325000f);
                    }, 190, 0)
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ACRAction.getRenderablePart(),
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
                	GL11.glTranslatef(0F, 0F, 1F);
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
                	GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.ACRAction.getRenderablePart(),
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
                    	GL11.glTranslatef(0F, 0F, 1F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M4A1Mag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.2f, 0.66f, -0.18f);
                   	 	GL11.glRotatef(10F, 0f, 1f, 0f);
                   	 	GL11.glRotatef(-8F, 1f, 0f, 0f);
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
                          GL11.glTranslatef(0F, 0.5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2F, 0F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M38Mag,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.2f, 0.66f, -0.18f);
                   	 	GL11.glRotatef(10F, 0f, 1f, 0f);
                   	 	GL11.glRotatef(-8F, 1f, 0f, 0f);
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
                          GL11.glTranslatef(0F, 0.5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2F, 0F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag50,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.2f, 0.66f, -0.18f);
                   	 	GL11.glRotatef(10F, 0f, 1f, 0f);
                   	 	GL11.glRotatef(-8F, 1f, 0f, 0f);
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
                          GL11.glTranslatef(0F, 0.5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2F, 0F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag60,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.2f, 0.66f, -0.18f);
                   	 	GL11.glRotatef(10F, 0f, 1f, 0f);
                   	 	GL11.glRotatef(-8F, 1f, 0f, 0f);
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
                          GL11.glTranslatef(0F, 0.5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2F, 0F);
                  }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Stanag100,
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.2f, 0.66f, -0.18f);
                   	 	GL11.glRotatef(10F, 0f, 1f, 0f);
                   	 	GL11.glRotatef(-8F, 1f, 0f, 0f);
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
                          GL11.glTranslatef(0F, 0.5F, 0F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 2F, 0F);
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
                    
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.ACRAction.getRenderablePart(),
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
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25f, 0f, 0f, 1f);
                        GL11.glRotatef(30f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.250000f, 1.405000f, -0.325000f);
                    }, 140, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15f, 0f, 0f, 1f);
                        GL11.glRotatef(20f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.250000f, 1.305000f, -0.325000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                        GL11.glRotatef(10f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.250000f, 1.205000f, -0.325000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13f, 0f, 0f, 1f);
                        GL11.glRotatef(3f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.250000f, 1.105000f, -0.325000f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(4f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.310000f, 1.105000f, -0.325000f);
                    }, 80, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.ACRAction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glTranslatef(0f, 0f, 1f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 1f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 1f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 1f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )

            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2);
                GL11.glTranslatef(0.465f, 0.865f, -0.1f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.07f, 0f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.055f, 0f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0f);
                }

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0.45f);
                }
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0F, 0.11f, 0.9f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0.35f);
                }
                
             // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, 0.055f, 0.6f);
                }

                // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, 0.055f, 0.6f);
                }
                
             // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, 0.045f, 0.6f);
                }

                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                	 GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Holo");
                	 GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0F, 0.08f, 0.8f);
                }

                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0.001F, 0.08f, 0.9f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0.001F, 0.08f, 0.9f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.039f, 0.2f);
                }

                // Everything else
                {
                }


                })
            
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2);
                GL11.glTranslatef(0.465f, 0.865f, 0.2f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.07f, 0f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.055f, 0f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0f);
                }

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.08f, 0.25f);
                }
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(-0F, 0.11f, 0.7f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0.15f);
                }
                
             // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, 0.055f, 0.4f);
                }

             // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0F, 0.055f, 0.4f);
                }

             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Holo");
                	 GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Holo");
                	 GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
             // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Reflex");
                	GL11.glTranslatef(-0F, 0.045f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0F, 0.08f, 0.8f);
                }

                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0.001F, 0.08f, 0.9f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(-0.001F, 0.08f, 0.9f);
                }
                
             // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.039f, 0.2f);
                }

                // Everything else
                {
                }


                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.225000f, 1.500000f, -0.200000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(2F, 2F, 2F);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.500000f, 0.525000f, -0.875000f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScaled(2F, 2F, 2F);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.400000f, 0.325000f, -0.875000f);
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
                            GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.150000f, -0.125000f, 0.125000f);
                        } else if(activeAttachment == Attachments.Bipod) {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.125000f, 0.150000f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.150000f, -0.025000f);
                        } else {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.200000f, -0.200000f, 0.175000f);
                            
//                            GL11.glScalef(4f, 4f, 4f);
                        }
                     },
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })

            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.050000f, 0.425000f);
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
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(105.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.150000f, -0.675000f, -0.025000f);
                     },
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, -0.550000f, 0.100000f);
                     })
            
            .withFirstPersonLeftHandPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.5f, 0.125000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.475000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.375000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.375000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.375000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.375000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.700000f, -0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.700000f, -0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -0.675000f, 0.100000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -0.675000f, 0.100000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -0.675000f, 0.100000f);
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
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 0.000000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 0.000000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 0.000000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 0.000000f, 0.325000f);
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
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
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
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.200000f, 0.175000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.200000f, 0.175000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.200000f, 0.175000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.700000f, -0.150000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -0.675000f, 0.100000f);
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