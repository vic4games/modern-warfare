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
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.Famas;
import com.vicmatskiv.mw.models.FamasG2;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
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

public class FamasG2Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("FamasG2")
//		.withAmmo(CommonProxy.AR15Mag)
//		.withAmmoCapacity(30)
		.withFireRate(0.75f)
		.withRecoil(2.5f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 3, 1)
		//.withMaxShots(5)
		.withShootSound("Famas")
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("StandardReload")
		.withUnloadSound("Unload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.8f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.11f)
		.withFlashOffsetY(() -> 0.12f)
		 .withShellCasingForwardOffset(-0.1f)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Bullpup assault rifle", "Damage: 7", 
		"Caliber: 5.56x45mm NATO", "Magazines:", "30rnd 5.56x45mm NATO Magazine",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(GunSkins.Voltaic, 
				(a, i) -> {
					i.setActiveTextureIndex(GunSkins.Voltaic.getTextureVariantIndex("voltaic"));
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
			GL11.glTranslatef(-0.355F, 0.9F, 1.45F);
			GL11.glScaled(1.2F, 1.5F, 1.5F);
			GL11.glRotatef(-9F, 1f, 0f, 0f);
		})
		.withCompatibleAttachment(AuxiliaryAttachments.FamasCarryHandle, true, (model) -> {
            GL11.glTranslatef(-0.241F, -1.15F, -1.1F);
            GL11.glScaled(0.52F, 0.55F, 0.85F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.FamasBipod1, true, (model) -> {
            GL11.glTranslatef(-0.05F, -1.2F, -2.5F);
            GL11.glScaled(1F, 1F, 0.88F);
            GL11.glRotatef(-20F, 0f, 0f, 1f);
            GL11.glRotatef(1F, 1f, 0f, 0f);
            GL11.glRotatef(1.8F, 0f, 1f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.FamasBipod2, true, (model) -> {
            GL11.glTranslatef(-0.25F, -1.05F, -2.5F);
            GL11.glScaled(1F, 1F, 0.88F);
            GL11.glRotatef(200F, 0f, 0f, 1f);
            GL11.glRotatef(-0.8F, 1f, 0f, 0f);
            GL11.glRotatef(1.5F, 0f, 1f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.FamasAction, true, (model) -> {
        })
//		.withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
//			GL11.glTranslatef(0.03F, -1.9F, 0.4F);
//			GL11.glScaled(0.7F, 0.7F, 0.7F);
//		},(model) -> {
//			 if(model instanceof Acog2) {
//				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
//			if(model instanceof Reflex) {
//				GL11.glTranslatef(.264F, -1.8F, 0.2F);
//				GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Reflex2) {
//				GL11.glTranslatef(0.19999F, -2.125F, 0.2F);
//				GL11.glScaled(0.1F, 0.1F, 0.1F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
//			if(model instanceof Holographic) {
//			GL11.glTranslatef(.264F, -1.9F, 0.2F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Holo2) {
//				GL11.glTranslatef(0.19999F, -2.125F, 0.3F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Holographic2, (model) -> {
//			if(model instanceof Holographic2) {
//			GL11.glTranslatef(.264F, -1.9F, 0.2F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Holo2) {
//				GL11.glTranslatef(0.19999F, -2.125F, 0.3F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Grip2, (model) -> {
//			GL11.glTranslatef(.135F, -0.6F, -0.7F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.StubbyGrip, (model) -> {
//			GL11.glTranslatef(.135F, -0.6F, -0.7F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.Grip, (model) -> {
//			GL11.glTranslatef(.135F, -0.5F, -0.7F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.VGrip, (model) -> {
//			GL11.glTranslatef(.135F, -0.6F, -0.7F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.Bipod, (model) -> {
//			GL11.glTranslatef(.135F, -0.6F, -0.7F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.Laser2, (p, s) -> {
//			GL11.glTranslatef(.25F, -1.4F, -1.3F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.Laser, (p, s) -> {
//			GL11.glTranslatef(.25F, -1.4F, -1.3F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
		.withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
			GL11.glTranslatef(-0.2F, -1.11F, -5.5F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("AK12")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new FamasG2())
			//.withTextureName("M4A1")
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
			    GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(2F, 2F, 2F);
				GL11.glTranslatef(-0.300000f, 0.700000f, -0.8f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.300000f, 0.700000f, -0.4f);
				GL11.glRotatef(-3F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(1.5F, 1.5F, 1.5F);
                GL11.glTranslatef(-0.795f, 1.941f, -2.2f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, 0.246f, 0.3f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, -0.04f, 5f);
                } 

                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, -0.04f, 5f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.33f, 0.28f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.3f, 0.5f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(1.373F, -1.04f, 2.8f);
                } 
                
                
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
				
			.withFirstPersonCustomPositioning(Magazines.NATOMag1, (renderContext) -> {
//				GL11.glTranslatef(-0.2F, -0.32F, 0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.FamasCarryHandle.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.FamasBipod1.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.FamasBipod1.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.FamasBipod1.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.FamasBipod2.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.FamasBipod2.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.FamasBipod2.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.FamasAction.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.FamasCarryHandle.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.FamasCarryHandle.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.NATOMag1.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NATOMag1.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.FamasAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.FamasAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
                })
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
					}, 300, 60),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
					}, 400, 200),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
				    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
				    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
				    GL11.glTranslatef(-0.175000f, -0.100000f, -0.125000f);
				}, 400, 100),
				new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.175000f, -0.100000f, -0.125000f);
                }, 150, 100)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
				}, 150, 50),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.NATOMag1,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.2F, 0.5F, -0.2F);
					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.2F, 0.9F, -0.2F);
					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.NATOMag1,
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
                }, 250, 1000)
					)
			
			.withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.FamasCarryHandle.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FamasCarryHandle.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.FamasAction.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FamasAction.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.FamasBipod1.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FamasBipod1.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.FamasBipod2.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FamasBipod2.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(1.5F, 1.5F, 1.5F);
				GL11.glTranslatef(-0.795f, 1.941f, -2.5f);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, 0.246f, 0.3f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 5f);
				} 

				// HP Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.33f, 0.28f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.3f, 0.5f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.04f, 2.8f);
				} 
				
				
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
				
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScaled(2F, 2F, 2F);
			    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
			    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
			    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
			    GL11.glTranslatef(-0.475000f, 0.900000f, -0.925000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
				GL11.glScaled(2F, 2F, 2F);
				GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
				GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
				GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
				GL11.glTranslatef(-0.850000f, 0.575000f, -0.500000f);
			 })
			 
			.withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.475000f, -0.225000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.35f, -0.5f, 0.12f);
                     })
            
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.475000f, -0.225000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                     })
					 
			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.2f, -0.800000f, 0.150000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.35f, -0.5f, 0.12f);
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 0.5f, 1.4f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(20f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 0.5f, 1.4f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 5f);
					    GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(45.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.125000f, -0.575000f, 0.075000f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 5f);
						GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.250000f, -0.600000f, -0.075000f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.5f, 0.12f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.5f, 0.12f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.35f, -0.5f, 0.12f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.35f, -0.5f, 0.12f);
                    }, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glTranslatef(0.4f, 0.5f, 1.4f);
                        GL11.glRotatef(60f, 0, 0f, 1f);
                        GL11.glRotatef(-85f, 1f, 0f, 0f);
                        GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glTranslatef(0.4f, 0.5f, 1.4f);
                        GL11.glRotatef(60f, 0, 0f, 1f);
                        GL11.glRotatef(-90f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 0f, 1f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.5f, 0.12f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.5f, 0.12f);
					}, 250, 50))
					
			.build())
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.0118f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}