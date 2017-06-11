package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.ACR;
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
import com.vicmatskiv.mw.models.BushmasterACR;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class ACRFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("ACRTac")
//		.withAmmo(CommonProxy.AR15Mag)
//		.withAmmoCapacity(30)
		.withFireRate(0.7f)
		.withRecoil(3.5f)
		.withZoom(0.9f)
		.withMaxShots(1)
		//.withMaxShots(5)
		.withShootSound("acr")
		.withSilencedShootSound("AR15Silenced")
		.withReloadSound("NoBoltReload")
		.withUnloadSound("m4unload")
		.withReloadingTime(30)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.15f)
        .withFlashOffsetY(() -> 0.1f)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Assault rifle", "Damage: 7", 
		"Caliber: 5.56x45mm NATO", "Magazines:", "30rnd 5.56x45mm NATO Magazine", "20rnd 5.56x45mm NATO Magazine", "40rnd 5.56x45mm NATO Magazine",
		"30rnd 5.56x45mm NATO PMAG Magazine", "100rnd 5.56x45mm NATO Beta-C Magazine",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(GunSkins.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
				}, 
				(a, i) -> {
				}
		)
		.withCompatibleAttachment(GunSkins.Fade, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Fade.getTextureVariantIndex("Ruby"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Amber, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amber.getTextureVariantIndex("Amber"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(GunSkins.Arctic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Arctic.getTextureVariantIndex("Arctic"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(GunSkins.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(GunSkins.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Sapphire.getTextureVariantIndex("Sapphire"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(Magazines.NATOMag1, (model) -> {
		    GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
		})
		.withCompatibleAttachment(Magazines.NATOMag2, (model) -> {
		    GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
		})
		.withCompatibleAttachment(Magazines.NATO20rnd, (model) -> {
		    GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
		})
		.withCompatibleAttachment(Magazines.NATO40rnd, (model) -> {
		    GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
		})
		.withCompatibleAttachment(Magazines.NATODrum100, (model) -> {
		    GL11.glTranslatef(-0.35F, 0.5F, -1.31F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
		})
		.withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
			if(model instanceof ScarIron1) {
				GL11.glTranslatef(0.165F, -1.65F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.24F, -1.56F, -1.7F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.14F, -1.566F, 0.3F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.13F, -1.39F, -2.8F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(-0.22F, -2.08F, -3.7F);
				GL11.glScaled(0.65F, 1.1F, 0.2F);
			} else if(model instanceof M4Iron1) {
				GL11.glTranslatef(-0.162F, -1.665F, -0.3F);
				GL11.glScaled(0.35F, 0.35F, 0.35F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.26F, -1.8F, -2.35F);
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
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(-0.173F, -1.7F, -3.72F);
				GL11.glScaled(0.5F, 0.5F, 0.85F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
			GL11.glTranslatef(-0.288F, -1.625F, -0.5F);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		},(model) -> {
			 if(model instanceof Acog2) {
				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		
		.withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.182F, -1.32F, -0.6F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
	    .withCompatibleAttachment(Attachments.Scope, (player, stack) -> {
	    	
	        GL11.glTranslatef(-0.312F, -1.6F, -0.65F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.272F, 0.67F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(Attachments.Reflex, (model) -> {
			if(model instanceof Reflex) {
			GL11.glTranslatef(-0.07F, -1.45F, -0.8F);
			GL11.glScaled(0.4F, 0.4F, 0.4F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(-0.12F, -1.7F, -0.94F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(Attachments.Kobra, (model) -> {
			if(model instanceof Kobra) {
			    GL11.glTranslatef(-0.055F, -1.49F, -0.8F);
	            GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.12F, -1.69F, -1.4F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(Attachments.Holo2, (model) -> {
			if(model instanceof Holographic) {
			    GL11.glTranslatef(-0.05F, -1.48F, -0.8F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Holo2) {
			    GL11.glTranslatef(-0.12F, -1.78F, -0.8F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(Attachments.Holographic2, (model) -> {
			if(model instanceof Holographic2) {
			    GL11.glTranslatef(-0.05F, -1.48F, -0.8F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Holo2) {
			    GL11.glTranslatef(-0.12F, -1.78F, -0.8F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
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
		.withCompatibleAttachment(Attachments.Grip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.3F, -2.95F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Bipod, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.35F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
		})
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
		.withCompatibleAttachment(AuxiliaryAttachments.BushmasterACRRail, true, (model) -> {
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
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.226F, -1.52F, -3.9F);
                GL11.glScaled(0.76F, 0.87F, 0.8F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.226F, -1.52F, -2F);
                GL11.glScaled(0.76F, 0.87F, 0.8F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.BushmasterACRAction, true, (model) -> {
            if(model instanceof ACRAction) {
                GL11.glTranslatef(-0.06F, -1.4F, -2.9F);
                GL11.glScaled(0.6F, 0.6F, 0.5F);
//                GL11.glRotatef(20F, 0f, 0f, 1f);
            }
            else if(model instanceof ACRAction2) {
            }
        })
		.withTextureNames("AK12")
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
				GL11.glTranslatef(-0.400000f, 0.825000f, -0.150000f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                GL11.glTranslatef(-0.400000f, 0.825000f, 0.2f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2);
                GL11.glTranslatef(-0.905f, 2.2f, -2.3f);
                GL11.glRotatef(-0.8F, 1f, 0f, 0f);

                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.08f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.01f, 0.25f);
                }
                
                // Scope Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.085f, 0.45f);
                } 
                
                // Scope Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.035f, 0.25f);
                } 
                
                // Reflex Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(-0.01F, 0.02f, 0.4f);
                } 

                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.06f, 0.2f);
                } 
                
                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.059f, 0.2f);
                } 
                
                // Holo Zoom
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.01f, 0.4f);
                } 
                
                // Everything else
                {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
				
			.withFirstPersonCustomPositioning(Magazines.NATOMag1, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(Magazines.NATOMag1.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NATOMag1.getRenderablePart(), (renderContext) -> {
                })
			
			.withFirstPersonCustomPositioning(Magazines.NATO20rnd, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(Magazines.NATO20rnd.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NATO20rnd.getRenderablePart(), (renderContext) -> {
                })
				
			.withFirstPersonCustomPositioning(Magazines.NATO40rnd, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(Magazines.NATO40rnd.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NATO40rnd.getRenderablePart(), (renderContext) -> {
                })
				
			.withFirstPersonCustomPositioning(Magazines.NATOMag2, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(Magazines.NATOMag2.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NATOMag2.getRenderablePart(), (renderContext) -> {
                })
				
			.withFirstPersonCustomPositioning(Magazines.NATODrum100, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(Magazines.NATODrum100.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NATODrum100.getRenderablePart(), (renderContext) -> {
                })
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.BushmasterACRRail.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.BushmasterACRRail.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.BushmasterACRRail.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.BushmasterACRAction.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.BushmasterACRAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.9f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.BushmasterACRAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.9f);
                })
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScaled(2F, 2F, 2F);
						GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
						GL11.glRotatef(15.000000f, 0f, 1f, 0f);
						GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-1.274999f, 0.500000f, 0.325000f);
					}, 250, 300),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.274999f, 0.500000f, 0.325000f);
					}, 250, 20)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.274999f, 0.500000f, 0.325000f);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(2F, 2F, 2F);
                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.274999f, 0.500000f, 0.325000f);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.NATOMag1,
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1.2F, 0.2F);
                    GL11.glRotatef(-20F, 0f, 0f, 1f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningUnloading(Magazines.NATO40rnd,
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1.2F, 0.2F);
                    GL11.glRotatef(-20F, 0f, 0f, 1f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningUnloading(Magazines.NATO20rnd,
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1.2F, 0.2F);
                    GL11.glRotatef(-20F, 0f, 0f, 1f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.NATOMag1,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1.2F, 0.2F);
					GL11.glRotatef(-20F, 0f, 0f, 1f);
					GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.NATO40rnd,
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1.2F, 0.2F);
                    GL11.glRotatef(-20F, 0f, 0f, 1f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
			
			.withFirstPersonCustomPositioningReloading(Magazines.NATO20rnd,
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1.2F, 0.2F);
                    GL11.glRotatef(-20F, 0f, 0f, 1f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.NATOMag2,
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1.2F, 0.2F);
                    GL11.glRotatef(-20F, 0f, 0f, 1f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.NATOMag2,
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1.2F, 0.2F);
                    GL11.glRotatef(-20F, 0f, 0f, 1f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningUnloading(Magazines.NATODrum100,
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1.2F, 0.2F);
                    GL11.glRotatef(-20F, 0f, 0f, 1f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.NATODrum100,
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1.2F, 0.2F);
                    GL11.glRotatef(-20F, 0f, 0f, 1f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.BushmasterACRRail.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.05F, 1F, 0F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.BushmasterACRRail.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(1.3F, 0.5F, -0.8F);
//                    GL11.glRotatef(10F, 1f, 0f, 0f);
//                    GL11.glRotatef(10F, 0f, 1f, 0f);
//                    GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
           .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.BushmasterACRAction.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.05F, 1F, 0F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.BushmasterACRAction.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(1.3F, 0.5F, -0.8F);
//                    GL11.glRotatef(10F, 1f, 0f, 0f);
//                    GL11.glRotatef(10F, 0f, 1f, 0f);
//                    GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(2F, 2F, 2);
				GL11.glTranslatef(-0.905f, 2.2f, -2.5f);

				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.08f, 0.6f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.01f, 0.4f);
                }
				
				// Scope Zoom
				else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.085f, 0.6f);
				} 
				
				// Scope Zoom
				else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.035f, 0.25f);
				} 
				
				// Reflex Zoom
				else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(-0.01F, 0.02f, 0.4f);
				} 

				// Holo Zoom
				else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.06f, 0.2f);
				} 
				
				// Holo Zoom
				else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.059f, 0.2f);
				} 
				
				// Holo Zoom
				else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.01f, 0.4f);
				} 
				
				// Everything else
				{
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScaled(2F, 2F, 2F);
				GL11.glRotatef(10.000000f, 1f, 0f, 0f);
				GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
				GL11.glRotatef(20.000000f, 0f, 0f, 1f);
				GL11.glTranslatef(-0.300000f, 0.950000f, -0.550000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScaled(2F, 2F, 2F);
			     GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-0.875000f, 0.625000f, 0.300000f);
			 })
			.withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glTranslatef(0.48f, 0.08f, -0.05f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-70f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.13f, 0.26f, 0.45f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
					 
			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.800000f, 0.150000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.13f, 0.26f, 0.45f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
			        new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.725000f, 0.575000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.750000f, 0.500000f);
                    }, 50, 200))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.13f, 0.26f, 0.45f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.13f, 0.26f, 0.45f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50))
					
			.withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.750000f, 0.500000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.725000f, 0.575000f);
                    }, 50, 200)
                    )
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.13f, 0.26f, 0.45f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.13f, 0.26f, 0.45f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50))
			.build())
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.0118f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}