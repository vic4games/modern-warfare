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
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36C;
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
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class G36CFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("G36C")
//		.withAmmo(CommonProxy.G36CMag)
//		.withAmmoCapacity(30)
		.withFireRate(0.7f)
		.withRecoil(3.2f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 3, 1)
		//.withMaxShots(5)
		.withShootSound("G36")
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("StandardReload")
		.withUnloadSound("Unload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.13f)
		.withFlashOffsetY(() -> 0.1f)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Assault rifle/Carbine", "Damage: 7", 
		"Caliber: 5.56x45mm NATO", "Magazines:", "30rnd 5.56x45mm NATO Magazine (Type 3)",
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
        .withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Desert, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Desert.getTextureVariantIndex("Desert"));
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
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
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
        
		.withCompatibleAttachment(Magazines.NATOG36Mag, (model) -> {
			GL11.glTranslatef(-0.37F, 0.8F, -1.7F);
		    GL11.glScaled(1.25F, 1.7F, 1.7F);
			
//		    GL11.glTranslatef(0.4F, 2F, -1.7F);
//		    GL11.glScaled(1.25F, 1.7F, 1.7F);
//		    GL11.glRotatef(-18f, 0f, 0f, 1f);
		})
		.withCompatibleAttachment(Magazines.NATODrum100, (model) -> {
            GL11.glTranslatef(-0.37F, 0.8F, -1.7F);
            GL11.glScaled(1.25F, 1.6F, 1.7F);
            GL11.glRotatef(-5f, 1f, 0f, 0f);
        })
		 .withCompatibleAttachment(AuxiliaryAttachments.G36Rail, true, (model) -> {
            GL11.glTranslatef(-0.31F, -2F, -2.52F);
            GL11.glScaled(0.67F, 0.675F, 0.665F);
        })
         .withCompatibleAttachment(AuxiliaryAttachments.G36Action, true, (model) -> {
        })
		.withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.13F, -1.55F, -3.05F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(0.092F, -1.91F, -0.9F);
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
				GL11.glTranslatef(-0.171F, -1.95F, -0.3F);
				GL11.glScaled(0.25F, 0.25F, 0.25F);
			} else if(model instanceof G36CIron2) {
				GL11.glTranslatef(-0.19F, -1.92F, -3.6F);
				GL11.glScaled(0.45F, 0.45F, 0.45F);
			} else if(model instanceof ScarIron1) {
				GL11.glTranslatef(0.165F, -1.65F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.55F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.14F, -1.74F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
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
            GL11.glTranslatef(-0.21F, -1.64F, -1.4F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		.withCompatibleAttachment(Attachments.Scope, (player, stack) -> {
		    GL11.glTranslatef(-0.325F, -2F, -1F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.272F, 0.67F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(Attachments.Reflex, (model) -> {
			if(model instanceof Reflex) {
			    GL11.glTranslatef(-0.07F, -1.82F, -1.5F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
			} else if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -2.15F, -1.7F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(Attachments.Kobra, (model) -> {
			if(model instanceof Kobra) {
			    GL11.glTranslatef(-0.05F, -1.87F, -1.5F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -2.165F, -1.7F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(Attachments.Holo2, (model) -> {
			if(model instanceof Holographic) {
			    GL11.glTranslatef(-0.05F, -1.87F, -1.5F);
	            GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Holo2) {
			    GL11.glTranslatef(-0.125F, -2.165F, -1.7F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(Attachments.Holographic2, (model) -> {
			if(model instanceof Holographic2) {
			GL11.glTranslatef(-0.05F, -1.87F, -1.5F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(-0.125F, -2.165F, -1.7F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(Attachments.MicroT1, (model) -> {
            if(model instanceof MicroT1) {
                GL11.glTranslatef(-0.17F, -2F, -1F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -2.1F, -1F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
		.withCompatibleAttachment(Attachments.Grip2, (model) -> {
			GL11.glTranslatef(-0.2F, -0.35F, -4F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.35F, -4F);
            GL11.glScaled(1F, 1F, 1F);
		})
//		.withCompatibleAttachment(CommonProxy.Grip, (model) -> {
//			GL11.glTranslatef(.135F, -0.5F, -1.2F);
//			GL11.glScaled(0.6F, 0.6F, 0.6F);
//		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.4F, -4F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
		    GL11.glTranslatef(0.1F, -1.3F, -4.3F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
		})
		.withCompatibleAttachment(Attachments.Laser, (p, s) -> {
			GL11.glTranslatef(0.1F, -1.3F, -4.3F);
			GL11.glScaled(0.85F, 0.85F, 0.85F);
		})
		.withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
			GL11.glTranslatef(-0.2F, -1.45F, -6.4F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("AK12")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new G36C())
			//.withTextureName("AK47")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
			.withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(1.5F, 1.5F, 1.5F);
				GL11.glTranslatef(-0.3f, 0.8f, -0.3f);
				GL11.glRotatef(3F, 0f, 0f, 1f);
				
//				GL11.glRotatef(43F, 0f, 1f, 0f);
//				GL11.glRotatef(2F, 1f, 0f, 0f);
//				GL11.glScaled(1.5F, 1.5F, 1.5F);
//				GL11.glTranslatef(-0.3f, 0.8f, -0.3f);
//				GL11.glRotatef(3F, 0f, 0f, 1f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(1.5F, 1.5F, 1.5F);
                GL11.glTranslatef(-0.3f, 0.8f, -0.2f);
                GL11.glRotatef(3F, 0f, 0f, 1f);
				GL11.glRotatef(-1.5F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 1.374999f, 0.1f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.002F, 0.275f, 0.6f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.009F, 0.283f, 0.4f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0F, 0.29f, 0.5f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.225f, 0.2f);
                } 
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.24f, 0.1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 0.1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 0.1f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.19f, 0.1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
             .withFirstPersonCustomPositioning(AuxiliaryAttachments.G36Action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.G36Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
            
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.G36Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.G36Rail.getRenderablePart(), (renderContext) -> {
                })
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.G36Rail.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.G36Rail.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.NATOG36Mag.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NATOG36Mag.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.NATODrum100.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NATODrum100.getRenderablePart(), (renderContext) -> {
                })
				
			.withFirstPersonCustomPositioning(Magazines.NATOG36Mag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonCustomPositioning(Magazines.NATODrum100, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScaled(1.5, 1.5f, 1.5f);
						GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
						GL11.glRotatef(35.000000f, 0f, 1f, 0f);
						GL11.glRotatef(5.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.300000f, 0.725000f, -0.125000f);
					}, 270, 60),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScaled(1.5, 1.5f, 1.5f);
						GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
						GL11.glRotatef(35.000000f, 0f, 1f, 0f);
						GL11.glRotatef(7.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.300000f, 0.725000f, -0.125000f);
					 }, 200, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScaled(1.5, 1.5f, 1.5f);
						GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
						GL11.glRotatef(35.000000f, 0f, 1f, 0f);
						GL11.glRotatef(7.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.300000f, 0.725000f, -0.125000f);
					}, 150, 100),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glRotatef(43F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glScaled(1.5F, 1.5F, 1.5F);
					GL11.glTranslatef(-0.3f, 0.8f, -0.3f);
					GL11.glRotatef(3F, 0f, 0f, 1f);
				}, 400, 100),
				new Transition((renderContext) -> { // Reload position
					GL11.glRotatef(42F, 0f, 1f, 0f);
					GL11.glRotatef(-1F, 1f, 0f, 0f);
					GL11.glScaled(1.5F, 1.5F, 1.5F);
					GL11.glTranslatef(-0.3f, 0.8f, -0.25f);
					GL11.glRotatef(3F, 0f, 0f, 1f);
				}, 120, 20),
				new Transition((renderContext) -> { // Reload position
					GL11.glRotatef(43F, 0f, 1f, 0f);
					GL11.glRotatef(1F, 1f, 0f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 1f);
					GL11.glScaled(1.5F, 1.5F, 1.5F);
					GL11.glTranslatef(-0.3f, 0.8f, -0.25f);
					GL11.glRotatef(3F, 0f, 0f, 1f);
				}, 70, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glScaled(1.5, 1.5f, 1.5f);
					GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
					GL11.glRotatef(35.000000f, 0f, 1f, 0f);
					GL11.glRotatef(5.000000f, 0f, 0f, 1f);
					GL11.glTranslatef(-0.300000f, 0.725000f, -0.125000f);
				}, 180, 0),
				new Transition((renderContext) -> { // Reload position
					GL11.glScaled(1.5, 1.5f, 1.5f);
					GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
					GL11.glRotatef(35.000000f, 0f, 1f, 0f);
					GL11.glRotatef(10.000000f, 0f, 0f, 1f);
					GL11.glTranslatef(-0.300000f, 0.725000f, -0.125000f);
				}, 150, 0)
			)
			
			.withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.G36Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.G36Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.5F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
			
			.withFirstPersonCustomPositioningUnloading(Magazines.NATOG36Mag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(-0.05F, 0F, 0F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.8F, 2F, 0.2F);
				    GL11.glScaled(1.25F, 1.7F, 1.7F);
				    GL11.glRotatef(-25f, 0f, 0f, 1f);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.NATOG36Mag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.8F, 2F, 0.2F);
				    GL11.glScaled(1.25F, 1.7F, 1.7F);
				    GL11.glRotatef(-25f, 0f, 0f, 1f);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(-0.05F, 0F, 0F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000),
				new Transition((renderContext) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000),
				new Transition((renderContext) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.G36Rail.getRenderablePart(),
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
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.G36Rail.getRenderablePart(),
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
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000)
                    )
					
			.withFirstPersonCustomPositioningUnloading(Magazines.NATODrum100,
			        new Transition((renderContext) -> {
			        	GL11.glTranslatef(-0.05F, 0F, 0F);
	                }, 250, 1000),
	                new Transition((renderContext) -> {
	                	GL11.glTranslatef(0.8F, 2F, 0.2F);
					    GL11.glScaled(1.25F, 1.7F, 1.7F);
					    GL11.glRotatef(-25f, 0f, 0f, 1f);
	                }, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.NATODrum100,
					new Transition((renderContext) -> {
						GL11.glTranslatef(0.8F, 2F, 0.2F);
					    GL11.glScaled(1.25F, 1.7F, 1.7F);
					    GL11.glRotatef(-25f, 0f, 0f, 1f);
					}, 250, 1000),
					new Transition((renderContext) -> {
						GL11.glTranslatef(-0.05F, 0F, 0F);
					}, 250, 1000),
					new Transition((renderContext) -> {
//						GL11.glTranslatef(0.5F, 0F, -0.2F);
//						GL11.glRotatef(0F, 0f, 1f, 0f);
//						GL11.glScaled(0.55F, 0.55F, 0.55F);
//						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 1000),
					new Transition((renderContext) -> {
						/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
					}, 250, 1000),
					new Transition((renderContext) -> {
						/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
					}, 250, 1000),
					new Transition((renderContext) -> {
						/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
					}, 250, 1000)
						)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.350000f, 1.374999f, 0.025000f);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(-0.002F, 0.275f, 0.6f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.009F, 0.283f, 0.4f);
                } 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
					//System.out.println("Position me for Scope");
				    GL11.glTranslatef(-0F, 0.29f, 0.5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.225f, 0.2f);
				} 
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.24f, 0.1f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.24f, 0.1f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
					//System.out.println("Position me for Holo");
				    GL11.glTranslatef(0F, 0.24f, 0.1f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.19f, 0.1f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScaled(1.5F, 1.5F, 1.5F);
				GL11.glRotatef(10.000000f, 1f, 0f, 0f);
				GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
				GL11.glRotatef(25.000000f, 0f, 0f, 1f);
				GL11.glTranslatef(-0.450000f, 1.174999f, -0.125000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScaled(1.5F, 1.5F, 1.5F);
			     GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.249999f, 0.800000f, 0.700000f);
			 })
			 
			 .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 5.5f);
                         GL11.glTranslatef(0.5f, 0.01f, -0.05f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-70f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
// 						GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
// 						GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
// 						GL11.glRotatef(40.000000f, 0f, 0f, 1f);
// 						GL11.glTranslatef(0.650000f, -0.575000f, 0.225000f);
                         
//                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
					     GL11.glScalef(3.5f, 3.5f, 3.5f);
					     GL11.glRotatef(110.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(205.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(0.350000f, -0.775000f, -0.025000f);

					 }, 
					 (renderContext) -> {
					     GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
						GL11.glRotatef(40.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(0.650000f, -0.575000f, 0.225000f);

					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
					    GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.250000f, -0.425000f, 0.050000f);
					}, 50, 200),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
					    GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.250000f, -0.425000f, 0.050000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
					    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(45.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.350000f, -0.175000f, 0.000000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
					    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.150000f, -0.450000f, -0.075000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
					    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.150000f, -0.450000f, -0.075000f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
					    GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.250000f, -0.425000f, 0.050000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
						GL11.glRotatef(40.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(0.650000f, -0.575000f, 0.225000f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50))
					
			.build())
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.0118f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}