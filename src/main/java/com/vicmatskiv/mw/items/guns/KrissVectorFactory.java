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
import com.vicmatskiv.mw.models.Bipod;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.KrissVector;
import com.vicmatskiv.mw.models.KrissVectorRailRiser;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSFrontSight;
import com.vicmatskiv.mw.models.MBUSRearSight;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MLOKExtendedHandguard;
import com.vicmatskiv.mw.models.MLOKHandguard;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.MilSpecStock;
import com.vicmatskiv.mw.models.OKP7;
import com.vicmatskiv.mw.models.OKP7reticle;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.PSO1reticle;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.RPKbarrel;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.mw.models.TritiumRearSights;
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

public class KrissVectorFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("kriss_vector")
        .withFireRate(0.999f)
        .withRecoil(2.5f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("vector")
        .withSilencedShootSound("mp5_silenced")
        .withReloadSound("vector_reload")
        .withUnloadSound("vector_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.22f)
        .withInaccuracy(2f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Submachine Gun",
        "Damage: 5.3", 
        "Cartridge: .45 ACP",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 99/100",
        "Magazines:",
        "25rnd .45 ACP Vector Magazine",
        "30rnd 5.56x45mm NATO STANAG Magazine (w/ Vector 5.56 Handguard)",
        "30rnd 5.56x45mm NATO PMAG Magazine (w/ Vector 5.56 Handguard)",
        "50rnd 5.56x45mm NATO STANAG Drum Magazine (w/ Vector 5.56 Handguard)",
        "60rnd 5.56x45mm NATO STANAG Drum Magazine (w/ Vector 5.56 Handguard)",
        "100rnd 5.56x45mm NATO STANAG Drum Magazine (w/ Vector 5.56 Handguard)"))
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        
        .withCrafting(CraftingComplexity.MEDIUM,
                Ores.GunmetalIngot,
                Ores.PlasticPlate)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2f, // x 
                0.1f, // y
                3f) // z
        
        .withCompatibleAttachment(Attachments.RailRiser, (model) -> {
            if(model instanceof KrissVectorRailRiser) {
                GL11.glTranslatef(0f, 0f, 0f);
                GL11.glScaled(1F, 1F, 1F);
          } else if(model instanceof AKRail) {
              GL11.glTranslatef(-0.245F, -1.48F, -4.19f);
              GL11.glScaled(0.9F, 0.9F, 1.38F);
          }
        })
        .withCompatibleAttachment(Attachments.KrissVectorReceiver, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.Vector556Handguard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VectorMk1ModularHandguard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VectorCarbineHandguard, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VectorTapedGrip, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VectorStock, true, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.2f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.VectorStockAdapter, (model) -> {
       	 if(model instanceof MilSpecStock) {
       		 GL11.glTranslatef(0.185f, 0.7f, 5.9f);
                GL11.glScaled(1.2F, 1.2F, 1.2F);
            } 
        })
        .withCompatibleAttachment(Magazines.VectorMag, (model) -> {
//            GL11.glTranslatef(-0.43F, 0.8F, 0.2F);
//            GL11.glScaled(1.5F, 1.5F, 1.5F);
//            GL11.glRotatef(17F, 1f, 0f, 0f);		
        })
        .withCompatibleAttachment(Magazines.VectorDrumMag, (model) -> {
//          GL11.glTranslatef(-0.43F, 0.8F, 0.2F);
//          GL11.glScaled(1.5F, 1.5F, 1.5F);
//          GL11.glRotatef(17F, 1f, 0f, 0f);		
      })
        .withCompatibleAttachment(Magazines.FamasF1Mag, (model) -> {
        	GL11.glRotatef(20F, 1f, 0f, 0f);
        	GL11.glScaled(1.3F, 1.3F, 1.3F);
            GL11.glTranslatef(0.03f, 0.2f, -2.8f);
        })
//        .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
//          GL11.glTranslatef(-0.2F, -1.06F, -7.55F);
//          GL11.glScaled(1F, 1F, 1F);
//        })
        .withCompatibleAttachment(Attachments.TritiumRearSights, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                	GL11.glTranslatef(0.058F, 0.47F, -0.7F);
                    GL11.glScaled(1.5F, 1.5F, 1.5F);
                } else {
                    GL11.glTranslatef(0.058F, 0.87F, 0.2F);
                    GL11.glScaled(1.5F, 1.5F, 1.5F);
                }
            }
        },(model) -> {
            if(model instanceof TritiumRearSights) {
            	 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                 GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        }, true, false)
        
        .withCompatibleAttachment(Attachments.MBUSRearSights, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                	GL11.glTranslatef(0.048F, 0.31F, -0.6F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                } else {
                	GL11.glTranslatef(0.048F, 0.71F, 0.3F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSRearSight) {
            	 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                 GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        }, false, false)
        
        .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
            	 ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                         AttachmentCategory.RAILING, instance);
                 if(activeAttachment == Attachments.RailRiser) {
                	 GL11.glTranslatef(0.05F, 0.31F, 1.2F);
                     GL11.glScaled(1.4F, 1.4F, 1.4F);
                } else {
                	GL11.glTranslatef(0.05F, 0.71F, 1.2F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSFrontSight) {
            	GL11.glTranslatef(-0.16F, -1.5F, -3.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
              }
        }, true, false)
        
        .withCompatibleAttachment(Attachments.NightRaider, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.238F, -1.6F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(-0.238F, -1.24F, -2.7F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.ACOG, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.358F, -1.65F, -1.5F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(-0.358F, -1.28F, -0.5F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AcogScope2) {
                GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            else if(model instanceof AcogReticle) {
                GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Specter, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.22F, -1.2F, -2.2F);
                    GL11.glScaled(0.62F, 0.62F, 0.62F);
                } else {
                    GL11.glTranslatef(-0.22F, -0.83F, -1.5F);
                    GL11.glScaled(0.62F, 0.62F, 0.62F);
                }
            }
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.MicroReflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
				    GL11.glTranslatef(-0.16F, -2.35F, -1.8F);
				    GL11.glScaled(0.5F, 0.5F, 0.5F);
                } else {
                	GL11.glTranslatef(-0.16F, -2F, -1F);
    			    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }
            }
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        } else if (model instanceof SightMount) {
	//        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
	//            GL11.glScaled(0.4F, 0.4F, 0.4F);
	        }
	    }, false, false)
        .withCompatibleAttachment(Attachments.Reflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.045F, -1.35F, -2F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                } else {
                    GL11.glTranslatef(-0.045F, -1F, -2F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.BijiaReflex, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.035F, -1.3F, -2F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                } else {
                    GL11.glTranslatef(-0.035F, -0.95F, -2F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }
            }
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        }, false, false)
        .withCompatibleAttachment(Attachments.Holographic, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.005F, -1.4F, -2F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                } else {
                    GL11.glTranslatef(-0.005F, -1.05F, -1.5F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                }
            }
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            }, false, false)
        .withCompatibleAttachment(Attachments.HolographicAlt, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.005F, -1.4F, -2F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                } else {
                    GL11.glTranslatef(-0.005F, -1.05F, -1.5F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                }
            }
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.EotechHybrid2, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.005F, -1.4F, -2.5F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                } else {
                    GL11.glTranslatef(-0.005F, -1.05F, -1.5F);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                }
            }
        },(model) -> {
            if(model instanceof EotechScopeRing) {
                GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.VortexRedux, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.355F, -1.66F, -2F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                } else {
                    GL11.glTranslatef(-0.355F, -1.28F, -1.5F);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }
            }
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            }, false, false)
        .withCompatibleAttachment(Attachments.Kobra, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.025F, -1.45F, -2F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                } else {
                    GL11.glTranslatef(-0.025F, -1.05F, -1F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.MicroT1, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.2F, -1.65F, -2F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                } else {
                    GL11.glTranslatef(-0.2F, -1.3F, -1.5F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }
            }
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            }, false, false)
        .withCompatibleAttachment(Attachments.AimpointCompM5, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.2F, -1.65F, -2F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                } else {
                    GL11.glTranslatef(-0.2F, -1.3F, -1.5F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.RMR, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, instance);
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(-0.19F, -1.6F, -2F);
                    GL11.glScaled(0.42F, 0.42F, 0.42F);
                } else {
                    GL11.glTranslatef(-0.19F, -1.25F, -2F);
                    GL11.glScaled(0.42F, 0.42F, 0.42F);
                }
            }
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.03F, -1.5F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Bipod, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.Vector556Handguard) {
                    GL11.glTranslatef(-0.23F, 0.8F, -6F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                } else {
                    GL11.glTranslatef(-0.23F, 0.8F, -3.5F);
                    GL11.glScaled(1.4F, 1.4F, 1.4F);
                }
            }
        },(model) -> {
            if(model instanceof Bipod) {
//                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
//                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        }, false, false)
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.23F, 0.8F, -3.5F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.23F, 0.8F, -3.5F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.23F, 1F, -4F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.23F, 0.8F, -3.5F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
        })
        .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
			GL11.glTranslatef(-0.24F, -0.6F, -6.5F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
        .withTextureNames("krissvector")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new KrissVector())
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
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.375000f, 0.900000f, -1.149999f);
                })
             
             .withFirstPersonPositioning((renderContext) -> {
                 RenderContext<?> rc = (RenderContext<?>) renderContext;
                 ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                         AttachmentCategory.RAILING, rc.getWeaponInstance());
                 if(activeAttachment == Attachments.RailRiser) {
                     GL11.glRotatef(45F, 0f, 1f, 0f);
                     GL11.glScalef(2f, 2f, 2f);
                     GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-0.375000f, 1.000000f, -0.949999f);
                 } else {
                     GL11.glRotatef(45F, 0f, 1f, 0f);
                     GL11.glScalef(1.7f, 1.7f, 1.7f);
                     GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-0.300000f, 0.85f, -1.450000f);
                 }
                 })
            
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                RenderContext<?> rc = (RenderContext<?>) renderContext;
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.RAILING, rc.getWeaponInstance());
                if(activeAttachment == Attachments.RailRiser) {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.375000f, 1.000000f, -0.449999f);
                } else {
                	GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(1.7f, 1.7f, 1.7f);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.300000f, 0.85f, -0.950000f);
                    GL11.glRotatef(-1F, 1f, 0f, 0f);
                }
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.13f, 0.6f, -0.2f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.15f, 0.6f, -0.1f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
            .withFirstPersonCustomPositioning(Magazines.VectorMag, (renderContext) -> {
            	
//            	GL11.glTranslatef(-0f, 1f, 0.1f);
//           	 	GL11.glRotatef(-10F, 0f, 0f, 1f);
//           	 	GL11.glRotatef(-10F, 1f, 0f, 0f);
           	 
//           	 	GL11.glTranslatef(-0f, 1f, 0.1f);
//        	 	GL11.glRotatef(5F, 0f, 0f, 1f);
//        	 	GL11.glRotatef(-10F, 1f, 0f, 0f);
        	 	
//        	 	GL11.glTranslatef(-0f, 0.7f, 0.1f);
//        	 	GL11.glRotatef(-2F, 1f, 0f, 0f);
        	
//        	GL11.glTranslatef(0f, 2.5f, 0f);
            })
            
            .withFirstPersonPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-34.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.499999f, 1.3f, -0.925000f);
                    }, 250, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.499999f, 0.980000f, -0.625000f);
                    }, 180, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-41.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-12.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.499999f, 1.050000f, -0.625000f);
                    }, 110, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-40.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.499999f, 1.1f, -0.625000f);
                    }, 100, 0),
                    
                    // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-42.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.499999f, 0.98f, -0.625000f);
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-44.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.700000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.499999f, 0.9f, -0.625000f);
                }, 60, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-43.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.200000f, 0f, 1f, 0f);
                    GL11.glRotatef(-16.500000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.499999f, 0.95f, -0.625000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(-42.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.400000f, 0f, 1f, 0f);
                    GL11.glRotatef(-12.500000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.499999f, 0.99f, -0.625000f);
                }, 80, 0),
                
                // left hand goes to button
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
               	 	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
               	 	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
               	 	GL11.glRotatef(2.000000f, 0f, 0f, 1f);
               	 	GL11.glTranslatef(-1.075000f, 1.324999f, -0.8f);
                }, 250, 0),
                
                // left hand pushes button
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
               	 	GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
               	 	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
               	 	GL11.glRotatef(4.000000f, 0f, 0f, 1f);
               	 	GL11.glTranslatef(-1.075f, 1.324999f, -0.7f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
               	 	GL11.glRotatef(-19.000000f, 1f, 0f, 0f);
               	 	GL11.glRotatef(35.400000f, 0f, 1f, 0f);
               	 	GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
               	 	GL11.glTranslatef(-1.075f, 1.324999f, -0.74f);
                }, 70, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2f, 2f, 2f);
               	 	GL11.glRotatef(-17.50000f, 1f, 0f, 0f);
               	 	GL11.glRotatef(37.000000f, 0f, 1f, 0f);
               	 	GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
               	 	GL11.glTranslatef(-1.175000f, 1.324999f, -0.9f);
                }, 70, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -1.449999f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.475000f, 0.77f, -1.449999f);
                    }, 140, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-6.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.475000f, 1.30000f, -1.449999f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(41.3F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.475000f, 1.25f, -1.449999f);
                    }, 140, 0)
                    )
                    
                    
            .withFirstPersonCustomPositioningReloading(Magazines.VectorMag,
// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0f, 3.5f, 0.5f);
                    }, 400, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0f, 1.1f, 0.1f);
                   	 	GL11.glRotatef(-10F, 0f, 0f, 1f);
                   	 	GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 300, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0f, 1.1f, 0.15f);
                	 	GL11.glRotatef(5F, 0f, 0f, 1f);
                	 	GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 300, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0f, 0.65f, 0.15f);
                	 	GL11.glRotatef(-2F, 1f, 0f, 0f);
                    }, 300, 50),
                    
                    // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                }, 100, 150),
                
                new Transition((renderContext) -> { // Reload position
                }, 100, 150),
                
                new Transition((renderContext) -> { // Reload position
                }, 100, 150),
                
                new Transition((renderContext) -> { // Reload position
                }, 100, 150),
                
                // left hand reaches action thing
                
                new Transition((renderContext) -> { // Reload position
                }, 350, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 160, 100),
                
                new Transition((renderContext) -> { // Reload position
                }, 160, 100),
                
                new Transition((renderContext) -> { // Reload position
                }, 160, 100)
            )
            
            .withFirstPersonCustomPositioningReloading(Magazines.VectorDrumMag,
            		// left hand goes down
            		                    
            		new Transition((renderContext) -> { // Reload position
            		   GL11.glTranslatef(-0f, 3.5f, 0.5f);
            		}, 400, 0),
            		                    
            		// mag touches gun
            		                    
            		new Transition((renderContext) -> { // Reload position
            		   GL11.glTranslatef(-0f, 1.1f, 0.1f);
            		   GL11.glRotatef(-10F, 0f, 0f, 1f);
            		   GL11.glRotatef(-10F, 1f, 0f, 0f);
            		}, 300, 50),
            		                    
            		new Transition((renderContext) -> { // Reload position
            		   GL11.glTranslatef(-0f, 1.1f, 0.15f);
            		   GL11.glRotatef(5F, 0f, 0f, 1f);
            		   GL11.glRotatef(-10F, 1f, 0f, 0f);
            		}, 300, 50),
            		                    
            		new Transition((renderContext) -> { // Reload position
            		  GL11.glTranslatef(-0f, 0.65f, 0.15f);
            		  GL11.glRotatef(-2F, 1f, 0f, 0f);
            		}, 300, 50),
            		                    
            		// mag inserts
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 100, 150),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 100, 150),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 100, 150),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 100, 150),
            		                
            		// left hand reaches action thing
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 350, 0),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 160, 100),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 160, 100),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 160, 100)
            )
            
            .withFirstPersonCustomPositioningReloading(Magazines.FamasF1Mag,
            		// left hand goes down
            		                    
            		new Transition((renderContext) -> { // Reload position
            		   GL11.glTranslatef(-0f, 3.5f, 0.5f);
            		}, 400, 0),
            		                    
            		// mag touches gun
            		                    
            		new Transition((renderContext) -> { // Reload position
            		   GL11.glTranslatef(-0f, 1.1f, 0.1f);
            		   GL11.glRotatef(-10F, 0f, 0f, 1f);
            		   GL11.glRotatef(-10F, 1f, 0f, 0f);
            		}, 300, 50),
            		                    
            		new Transition((renderContext) -> { // Reload position
            		   GL11.glTranslatef(-0f, 1.1f, 0.15f);
            		   GL11.glRotatef(5F, 0f, 0f, 1f);
            		   GL11.glRotatef(-10F, 1f, 0f, 0f);
            		}, 300, 50),
            		                    
            		new Transition((renderContext) -> { // Reload position
            		  GL11.glTranslatef(-0f, 0.65f, 0.15f);
            		  GL11.glRotatef(-2F, 1f, 0f, 0f);
            		}, 300, 50),
            		                    
            		// mag inserts
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 100, 150),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 100, 150),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 100, 150),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 100, 150),
            		                
            		// left hand reaches action thing
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 350, 0),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 160, 100),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 160, 100),
            		                
            		new Transition((renderContext) -> { // Reload position
            		}, 160, 100)
            )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.VectorMag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2F, -0.15F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                  }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.VectorDrumMag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2F, -0.15F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                  }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.FamasF1Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 2F, -0.15F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                  }, 250, 1000)
                    )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 0.8f, 0f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.2f, 1f, -0.2f);
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
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, 1.524999f, 0.125000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, 1.524999f, -0.225000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, 1.224999f, -0.525000f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.024999f, -0.925000f);
                    }, 190, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.375000f, 0.900000f, -1.149999f);
                    }, 190, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AKaction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.875f, 0.2f);

                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    	GL11.glTranslatef(0F, 0.44f, 0.2f);
                    } else {
                        GL11.glTranslatef(0F, 0.045f, -0.4f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.44f, 0.2f);
                    } else {
                        GL11.glTranslatef(0F, 0.045f, -0.6f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.42f, 0.3f);
                    } else {
                        GL11.glTranslatef(0F, 0.06f, 0f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.48f, 0.7f);
                    } else {
                        GL11.glTranslatef(0F, 0.12f, -0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.41f, 1f);
                    } else {
                        GL11.glTranslatef(0F, 0.045f, 0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.45f, 0.5f);
                    } else {
                        GL11.glTranslatef(0F, 0.1f, -0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.36f, 0.5f);
                    } else {
                        GL11.glTranslatef(0F, 0f, 0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.375f, 0.3f);
                    } else {
                        GL11.glTranslatef(0F, 0.03f, 0.2f);
                    }
                } 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.47f, 0.3f);
                    } else {
                        GL11.glTranslatef(0F, 0.12f, 0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.47f, 0.3f);
                    } else {
                        GL11.glTranslatef(0F, 0.12f, 0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.47f, 0.4f);
                    } else {
                        GL11.glTranslatef(0F, 0.12f, -0.5f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.46f, 0.4f);
                    } else {
                        GL11.glTranslatef(0F, 0.082f, 0f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.42f, 0.8f);
                    } else {
                        GL11.glTranslatef(0F, 0.025f, -0.2f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.45f, 0.8f);
                    } else {
                        GL11.glTranslatef(0F, 0.1f, 0.2f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.45f, 0.8f);
                    } else {
                        GL11.glTranslatef(0F, 0.1f, 0.2f);
                    }
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                  //System.out.println("Position me for Acog");
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.RAILING, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.RailRiser) {
                    GL11.glTranslatef(0F, 0.23f, 0.8f);
                    } else {
                        GL11.glTranslatef(0F, -0.12f, 0.5f);
                    }
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(0.350000f, 0.875f, 0.5f);

                    
                 // Standard Iron Sight Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                        //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        	GL11.glTranslatef(0F, 0.44f, 0.2f);
                        } else {
                            GL11.glTranslatef(0F, 0.045f, -0.4f);
                        }
                    } 
                    
                 // Standard Iron Sight Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                        //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        	GL11.glTranslatef(0F, 0.44f, 0.2f);
                        } else {
                            GL11.glTranslatef(0F, 0.045f, -0.6f);
                        }
                    } 
                    
                 // Standard Iron Sight Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                        //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.42f, 0.2f);
                        } else {
                            GL11.glTranslatef(0F, 0.06f, -0.1f);
                        }
                    } 
                    
                 // Standard Iron Sight Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.48f, 0.5f);
                        } else {
                            GL11.glTranslatef(0F, 0.12f, -0.4f);
                        }
                    } 
                    
                 // Standard Iron Sight Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.41f, 0.9f);
                        } else {
                            GL11.glTranslatef(0F, 0.045f, 0.1f);
                        }
                    } 
                    
                 // Standard Iron Sight Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.45f, 0.5f);
                        } else {
                            GL11.glTranslatef(0F, 0.1f, -0.2f);
                        }
                    } 
                    
                 // Standard Iron Sight Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.36f, 0.5f);
                        } else {
                            GL11.glTranslatef(0F, 0f, 0.2f);
                        }
                    } 
                    
                 // Standard Iron Sight Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.375f, 0.3f);
                        } else {
                            GL11.glTranslatef(0F, 0.03f, 0.2f);
                        }
                    } 
                    
                 // Standard Iron Sight Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.47f, 0.3f);
                        } else {
                            GL11.glTranslatef(0F, 0.12f, 0f);
                        }
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                      //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.47f, 0.3f);
                        } else {
                            GL11.glTranslatef(0F, 0.12f, 0f);
                        }
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                      //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.47f, 0.3f);
                        } else {
                            GL11.glTranslatef(0F, 0.12f, -0.6f);
                        }
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                      //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        	GL11.glTranslatef(0F, 0.46f, 0.4f);
                        } else {
                        	GL11.glTranslatef(0F, 0.082f, 0f);
                        }
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                      //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.42f, 0.8f);
                        } else {
                            GL11.glTranslatef(0F, 0.025f, -0.2f);
                        }
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                      //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.45f, 0.8f);
                        } else {
                            GL11.glTranslatef(0F, 0.1f, 0.2f);
                        }
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                      //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.45f, 0.8f);
                        } else {
                            GL11.glTranslatef(0F, 0.1f, 0.2f);
                        }
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                      //System.out.println("Position me for Acog");
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.RAILING, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.RailRiser) {
                        GL11.glTranslatef(0F, 0.23f, 0.8f);
                        } else {
                            GL11.glTranslatef(0F, -0.12f, 0.5f);
                        }
                    } 
                    
                    // Everything else
                    else {
                    }
                    
                
                    })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScalef(1.500000f, 1.500000f, 1.500000f);
                GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.400000f, 1.200000f, -1.500000f);
			 })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.8f, 0.675000f, -1f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.8f, 0.675000f, -1f);
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
                             GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.450000f, -0.250000f, 0.200000f);
                         } else if(activeAttachment == Attachments.AngledGrip) {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.425000f, -0.250000f, 0.375000f);
                         } else {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.425000f, -0.325000f, 0.200000f);
                             
//                             GL11.glScalef(4f, 4f, 4f);
                         }
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
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
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.450000f, -0.250000f, 0.200000f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.425000f, -0.250000f, 0.375000f);
                        } else {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.300000f, -0.400000f, 0.325000f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
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
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.450000f, -0.250000f, 0.200000f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.425000f, -0.250000f, 0.375000f);
                        } else {
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.300000f, -0.400000f, 0.325000f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.275000f, 0.000000f, 0.625000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                     })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, 0.000000f, 0.625000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.500000f, -0.125000f, 0.075000f);
                    }, 400, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.665000f, -0.260000f, 0.090000f);
                    }, 300, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.665000f, -0.240000f, 0.010000f);
                    }, 300, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.475000f, -0.100000f, 0.025000f);
                    }, 300, 50),
                    
                    // mag inserts
                
                    new Transition((renderContext) -> { // Reload position
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Vector556Handguard) {
                        	GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.600000f, -0.425000f, 0.150000f);
                        } else {
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.425000f, -0.280000f, 0.050000f);
                        }
    				}, 50, 200),
                
                new Transition((renderContext) -> { // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.Vector556Handguard) {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.425000f, 0.150000f);
                    } else {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.425000f, -0.280000f, 0.050000f);
                    }
				}, 50, 200),
                
                new Transition((renderContext) -> { // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.Vector556Handguard) {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.425000f, 0.150000f);
                    } else {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.425000f, -0.280000f, 0.050000f);
                    }
				}, 50, 200),
                
                new Transition((renderContext) -> { // Reload position
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.GUARD, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.Vector556Handguard) {
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.425000f, 0.150000f);
                    } else {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.425000f, -0.280000f, 0.050000f);
                    }
				}, 50, 200),
                
                // left hand reaches button
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.175000f, -0.500000f, 0.150000f);
                }, 350, 0),
                
                // left hand pushes button
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4f, 4f, 4f);
                	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                	 GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                	 GL11.glTranslatef(0.175000f, -0.400000f, 0.100000f);
                }, 160, 100),
                
                new Transition((renderContext) -> { // Reload position
	               	 GL11.glScalef(4f, 4f, 4f);
	               	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
	               	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
	               	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	               	GL11.glTranslatef(0.175000f, -0.400000f, 0.100000f);
               }, 160, 100),
                
                new Transition((renderContext) -> { // Reload position
	               	 GL11.glScalef(4f, 4f, 4f);
	               	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
	               	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
	               	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
	               	GL11.glTranslatef(0.175000f, -0.400000f, 0.100000f);
              }, 160, 100)
            )
                    
            .withFirstPersonRightHandPositioningReloading(
                    
// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 400, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 300, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 300, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 300, 50),
                    
                    // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4f, 4f, 4f);
                     GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                }, 100, 150),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4f, 4f, 4f);
                     GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                }, 100, 150),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4f, 4f, 4f);
                     GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                }, 100, 150),
                
                new Transition((renderContext) -> { // Reload position
                	 GL11.glScalef(4f, 4f, 4f);
                     GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                }, 100, 150),
                
                // left hand reaches button
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                }, 350, 0),
                
                // left hand pushes button
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                }, 160, 100),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
               }, 160, 100),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
               }, 160, 100)
            )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.300000f, -0.475000f, 0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.250000f, 0.175000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.125000f, 0.375000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.125000f, 0.375000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.35f, -0.13f, 0.25f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.35f, -0.13f, 0.25f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
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
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(5.3f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

