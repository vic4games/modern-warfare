package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M107;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M107Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M107")
//		.withAmmo(CommonProxy.M107Mag)
//		.withAmmoCapacity(10)
		.withFireRate(0.5f)
		.withRecoil(4f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("M107")
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("m107reload")
		.withUnloadSound("akunload")
		.withReloadingTime(43)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.1f)
		.withCreativeTab(ModernWarfareMod.SnipersTab)
		.withCrafting(CraftingComplexity.HIGH, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.BigSteelPlate)
		.withInformationProvider(stack -> Arrays.asList("Type: Anti-materiel sniper rifle", "Damage: 35", 
		"Caliber: .50 BMG", "Magazines:", "10rnd .50 BMG Magazine (Type 2)", "Fire Rate: Semi"))
		.withCompatibleAttachment(Magazines.M107BMag, (model) -> {
		    GL11.glTranslatef(-0.42F, 0.8F, -1.4F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
		.withCompatibleAttachment(GunSkins.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
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
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.13F, -1.55F, -4.8F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(-0.2F, -1.8F, -5F);
				GL11.glScaled(0.5F, 0.6F, 0.2F);
			} else if(model instanceof M4Iron1) {
				GL11.glTranslatef(-0.16F, -1.65F, -0.3F);
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
				GL11.glTranslatef(0.14F, -1.56F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron1) {
			    GL11.glTranslatef(-0.165F, -1.62F, -0.4F);
                GL11.glScaled(0.38F, 0.38F, 0.38F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.52F, -3.08F);
				GL11.glScaled(0F, 0f, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(-0.08F, -1.53F, -5F);
				GL11.glScaled(0.3F, 0.7F, 0.4F);
				GL11.glRotatef(180F, 0f, 0f, 1f);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
			GL11.glTranslatef(-0.345F, -1.55F, -0.8F);
			GL11.glScaled(0.95F, 0.95F, 0.95F);
		},(model) -> {
			 if(model instanceof Acog2) {
				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.2F, -1.2F, -1.2F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		.withCompatibleAttachment(Attachments.Scope, (player, stack) -> {
		    GL11.glTranslatef(-0.36F, -1.53F, -0.8F);
            GL11.glScaled(1F, 1F, 1F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.272F, 0.67F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(Attachments.HP, (player, stack) -> {
		    GL11.glTranslatef(-0.335F, -1.53F, -1.2F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.235F, 1.16F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(Attachments.Bipod, (model) -> {
			GL11.glTranslatef(-0.16F, -0.4F, -5F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
			GL11.glTranslatef(0.107F, -1.48F, -7.9F);
			GL11.glScaled(1.3F, 1.3F, 1.6F);
		})
		.withCompatibleAttachment(AuxiliaryAttachments.AUGRail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.245F, -1.45F, -4.5F);
                GL11.glScaled(0.9F, 0.9F, 0.9F);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.245F, -1.45F, -6.25F);
                GL11.glScaled(0.9F, 0.9F, 0.9F);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.03F, -0.52F, -3.5F);
                GL11.glScaled(0F, 0F, 0f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.245F, -1.45F, -2.33F);
                GL11.glScaled(0.9F, 0.9F, 0.9F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M107action, true, (model) -> {
            GL11.glTranslatef(0F, 0F, 0F);
            GL11.glScaled(1F, 1F, 1F);
        })
		.withTextureNames("M107")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M107())
			//.withTextureName("Dragonuv")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.3F, 0.3F, 0.3F);
				GL11.glTranslatef(0.8f, 0.8f, 0);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
			    GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(-0.350000f, 1.075000f, -0.525000f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.350000f, 1.075000f, 0f);
				GL11.glRotatef(-2F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.3505f, 1.125f, -0.3f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.125f, 0.7f);
                }  
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.036f, 0.8f);
                }  
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.09f, 0.5f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Scope")
                    GL11.glTranslatef(0f, 0.12f, 0.55f);
                } 
                // Everything else
                else {
                }
                
            
                })
		
			.withFirstPersonCustomPositioning(Magazines.M107BMag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningCustomZoomingRecoiled(Magazines.M107BMag, (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.M107BMag, (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.AUGRail.getRenderablePart(), (renderContext) -> {
                })
        
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.AUGRail.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.AUGRail.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M107action.getRenderablePart(), (renderContext) -> {
                })
        
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M107action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 2F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M107action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 2F);
                })
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
					    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.575000f, 0.725000f, 0.000000f);
					}, 300, 60),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
					    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.575000f, 0.725000f, 0.000000f);
					}, 300, 200),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
				    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
				    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
				    GL11.glTranslatef(-0.250000f, 1.274999f, -0.125000f);
				}, 400, 100),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
				    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
				    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
				    GL11.glTranslatef(-0.250000f, 1.274999f, -0.125000f);
				}, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.250000f, 1.274999f, -0.125000f);
                }, 130, 150)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.575000f, 0.725000f, 0.000000f);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.575000f, 0.725000f, 0.000000f);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.M107BMag,
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1F, 0F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.M107BMag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1F, 0F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
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
					
			.withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AUGRail.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AUGRail.getRenderablePart(),
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M107action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M107action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 2f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.3505f, 1.125f, -0.550000f);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					//System.out.println("Position me for Acog");
				    GL11.glTranslatef(0f, 0.125f, 0.8f);
				}  
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.036f, 0.9f);
                }  
				
				// HP Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
					//System.out.println("Position me for Scope");
				    GL11.glTranslatef(0f, 0.09f, 0.6f);
				} 
				
				// HP Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
					//System.out.println("Position me for Scope")
				    GL11.glTranslatef(0f, 0.12f, 0.65f);
				} 
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
			    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
			    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
			    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
			    GL11.glTranslatef(-0.325000f, 1.249999f, 0.000000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
			     GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.000000f, 0.525000f, 0.350000f);
			 })
			 
			 .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 7f);
                         GL11.glTranslatef(0.43f, 0.03f, -0.01f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-80f, 1f, 0f, 0f);
                         GL11.glRotatef(40f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 4f);
                         GL11.glTranslatef(-0.15f, 0.35f, 0.53f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
					 
			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glTranslatef(0.9f, 0.5f, -0.4f);
                         GL11.glRotatef(99f, 0, 0f, 1f);
                         GL11.glRotatef(-60f, 20f, 20f, -20f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 4f);
                         GL11.glTranslatef(-0.15f, 0.35f, 0.53f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 7f);
					    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.200000f, -0.675000f, 0.325000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 7f);
					    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(45.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.100000f, -0.475000f, 0.075000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 7f);
                        GL11.glTranslatef(0.43f, 0.03f, -0.01f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-80f, 1f, 0f, 0f);
                        GL11.glRotatef(40f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 7f);
                        GL11.glTranslatef(0.43f, 0.03f, -0.01f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-80f, 1f, 0f, 0f);
                        GL11.glRotatef(40f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 7f);
                        GL11.glTranslatef(0.43f, 0.03f, -0.01f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-80f, 1f, 0f, 0f);
                        GL11.glRotatef(40f, 1f, 1f, 0f);
                    }, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 4f);
                        GL11.glTranslatef(-0.15f, 0.35f, 0.53f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 4f);
                        GL11.glTranslatef(-0.15f, 0.35f, 0.53f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 10f);
					    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.250000f, -0.175000f, -0.225000f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 10f);
					    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.350000f, -0.500000f, -0.225000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 10f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.175000f, -0.225000f);
                    }, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 7f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.475000f, 0.075000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 7f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.675000f, 0.325000f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 4f);
                        GL11.glTranslatef(-0.15f, 0.35f, 0.53f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 4f);
                        GL11.glTranslatef(-0.15f, 0.35f, 0.53f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50))
					
			.build())
		.withSpawnEntityDamage(35f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}