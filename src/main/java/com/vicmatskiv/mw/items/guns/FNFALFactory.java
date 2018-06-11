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
import com.vicmatskiv.mw.models.FNFAL;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class FNFALFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("FNFAL")
//		.withAmmo(CommonProxy.FNFALMag)
//		.withAmmoCapacity(20)
		.withFireRate(0.5f)
		.withRecoil(6f)
		.withZoom(0.9f)
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("FNFAL")
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("fnfalreload")
		.withUnloadSound("m4unload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.1f)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withCrafting(CraftingComplexity.HIGH, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Battle rifle", "Damage: 13", 
		"Caliber: 7.62x51mm NATO", "Magazines:", "20rnd 7.62x51mm NATO Magazine",
		"Fire Rate: Semi"))
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
         .withCompatibleAttachment(GunSkins.Arctic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Arctic.getTextureVariantIndex("Arctic"));
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
		.withCompatibleAttachment(Magazines.FALMag, (model) -> {
//			GL11.glTranslatef(0F, 0.08F, -0.38F);
//			GL11.glRotatef(-25F, 1f, 0f, 0f);
		})
		.withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(0.129F, -1.62F, -2.08F);
				GL11.glScaled(0.65F, 0.65F, 0.65F);
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
				GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof G36CIron2) {
				GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron1) {
				GL11.glTranslatef(0.177F, -1.65F, 1.4F);
				GL11.glScaled(0.2F, 0.2F, 0.2F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.55F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
			GL11.glTranslatef(0.055F, -1.65F, 0.6F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
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
			GL11.glTranslatef(0.16F, -1.46F, 0.6F);
            GL11.glScaled(0.3F, 0.3F, 0.3F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		.withCompatibleAttachment(Attachments.MicroT1, (model) -> {
            if(model instanceof MicroT1) {
                GL11.glTranslatef(0.155F, -1.65F, 0.4F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
            	GL11.glTranslatef(0.198F, -1.725F, 0.0F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		.withCompatibleAttachment(Attachments.Scope, (player, stack) -> {
	    	
	    	GL11.glTranslatef(0.055F, -1.65F, 0.6F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.272F, 0.67F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(Attachments.HP, (player, stack) -> {
	    	
	    	GL11.glTranslatef(0.055F, -1.61F, 0.4F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
		    if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.237F, -0.215F, 1.155001F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
		})
		.withCompatibleAttachment(Attachments.Reflex, (model) -> {
			if(model instanceof Reflex) {
			GL11.glTranslatef(.245F, -1.52F, 0F);
			GL11.glScaled(0.37F, 0.37F, 0.37F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(0.2F, -1.75F, 0.0F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(Attachments.Kobra, (model) -> {
			if(model instanceof Kobra) {
			GL11.glTranslatef(.27F, -1.55F, 0.5F);
			GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(0.2F, -1.75F, 0.1F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(Attachments.Holo2, (model) -> {
			if(model instanceof Holographic) {
			GL11.glTranslatef(.264F, -1.53F, 0.2F);
			GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(0.2F, -1.76F, 0.3F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(Attachments.Holographic2, (model) -> {
			if(model instanceof Holographic2) {
			GL11.glTranslatef(.264F, -1.53F, 0.2F);
			GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(0.2F, -1.76F, 0.3F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(Attachments.RMR, (model) -> {
            if(model instanceof RMRsight) {
            GL11.glTranslatef(0.16F, -1.7F, 0.5F);
            GL11.glScaled(0.28F, 0.28F, 0.28F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(0.2F, -1.7F, 0.2F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		.withCompatibleAttachment(Attachments.Grip2, (model) -> {
			GL11.glTranslatef(.135F, -0.8F, -1.25F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
			GL11.glTranslatef(.135F, -0.8F, -1.25F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Grip, (model) -> {
			GL11.glTranslatef(.135F, -0.8F, -1.25F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
			GL11.glTranslatef(.135F, -0.8F, -1.25F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Bipod, (model) -> {
			GL11.glTranslatef(.135F, -0.8F, -1.25F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
			GL11.glTranslatef(.2F, -1.5F, -1.25F);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withCompatibleAttachment(Attachments.Silencer762x51, (model) -> {
			GL11.glTranslatef(0.107F, -1.45F, -4.8F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("AK12", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new FNFAL())
			//.withTextureName("AK47")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(1, 0.8f, 0);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.8F, 0.3F, 1.5F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(1.000000f, 0f, 0f, 1f);
				GL11.glTranslatef(-0.6f, 1.35f, -1.8f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.57f, 1.37f, -1.65f);
				GL11.glRotatef(-1F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(-0.026f, 1.25f, -1.399999f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005F, 0.1315f, 0.7f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005F, 0.1f, 0.6f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.135f, 0.68f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.1f, 0.55f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.135f, 0.7f);
                } 
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.125f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.105f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.105f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.105f, 0.7f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.085f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
				
			.withFirstPersonCustomPositioning(Magazines.FALMag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
						GL11.glRotatef(43F, 0f, 1f, 0f);
						GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
						GL11.glRotatef(-1F, 1f, 0f, 0f);
						GL11.glTranslatef(-0.7f, 1.299999f, -1.799999f);
					}, 350, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
						GL11.glRotatef(43F, 0f, 1f, 0f);
						GL11.glRotatef(-3.500000f, 0f, 0f, 1f);
						GL11.glRotatef(-4F, 1f, 0f, 0f);
						GL11.glTranslatef(-0.7f, 1.35f, -1.799999f);
					}, 300, 100),
				
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
						GL11.glRotatef(43F, 0f, 1f, 0f);
						GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
						GL11.glRotatef(-8F, 1f, 0f, 0f);
						GL11.glTranslatef(-0.7f, 1.35f, -1.799999f);
					}, 100, 130),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.500000f, 1.299999f, -1.799999f);
					}, 400, 100),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
						GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
						GL11.glTranslatef(-0.500000f, 1.299999f, -1.75f);
					}, 120, 20),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.500000f, 1.299999f, -1.799999f);
					}, 70, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
					GL11.glRotatef(43F, 0f, 1f, 0f);
					GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
					GL11.glRotatef(-1F, 1f, 0f, 0f);
					GL11.glTranslatef(-0.7f, 1.299999f, -1.799999f);
				}, 190, 0),
				new Transition((renderContext) -> { // Reload position
					GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
					GL11.glRotatef(43F, 0f, 1f, 0f);
					GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glTranslatef(-0.7f, 1.299999f, -1.799999f);
				}, 180, 0)
			)
					
			.withFirstPersonCustomPositioningReloading(Magazines.FALMag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1F, 0F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0.08F, -0.38F);
					GL11.glRotatef(-25F, 1f, 0f, 0f);
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
				}, 250, 1000),
				new Transition((renderContext) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningUnloading(Magazines.FALMag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0.08F, -0.38F);
					GL11.glRotatef(-25F, 1f, 0f, 0f);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1F, 0F);
				}, 250, 1000)
					)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(4F, 4F, 4F);
				GL11.glTranslatef(-0.026f, 1.25f, -1.499999f);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(-0.005F, 0.1315f, 0.75f);
				} 
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(-0.005F, 0.1f, 0.65f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.135f, 0.73f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.1f, 0.6f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.135f, 0.7f);
				} 
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.125f, 0.6f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.105f, 0.6f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.105f, 0.6f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.105f, 0.7f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.085f, 0f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glRotatef(10.000000f, 1f, 0f, 0f);
				GL11.glRotatef(10.000000f, 0f, 1f, 0f);
				GL11.glRotatef(20.000000f, 0f, 0f, 1f);
				GL11.glTranslatef(-0.5f, 1.524999f, -2f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
				 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
					GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
					GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
					GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
					GL11.glTranslatef(-0.900000f, 1.125000f, -1.249999f);
			 })
			 
			 .withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(30.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.000000f, -0.325000f, 0.000000f);
						 
//						 GL11.glScalef(3f, 3f, 3f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
						 GL11.glScalef(2.2f, 2.2f, 2.2f);
						 GL11.glTranslatef(1f, 0.2f, 0.2f);
						 GL11.glRotatef(99f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 20f, 20f, -20f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
						GL11.glRotatef(30.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.050000f, -0.850000f, 0.250000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
						GL11.glRotatef(30.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.175000f, -0.775000f, 0.025000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
						GL11.glRotatef(20.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.150000f, -0.700000f, 0.000000f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(30.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(-0.200000f, -0.600000f, -0.125000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(-0.350000f, -0.750000f, -0.175000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(-0.275000f, -0.750000f, -0.175000f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					}, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
						GL11.glRotatef(30.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.175000f, -0.775000f, 0.025000f);
					}, 100, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
						GL11.glRotatef(30.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.050000f, -0.850000f, 0.250000f);
					}, 80, 0)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.650000f, -0.950000f, -0.050000f);
					}, 250, 50))
			 
			.build())
		.withSpawnEntityDamage(13f)
		.withSpawnEntityGravityVelocity(0.0118f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}