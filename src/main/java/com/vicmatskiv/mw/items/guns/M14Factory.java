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
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.LeupoldReticle;
import com.vicmatskiv.mw.models.M14;
import com.vicmatskiv.mw.models.M14Action;
import com.vicmatskiv.mw.models.M14Action2;
import com.vicmatskiv.mw.models.M14DMR;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M14Rail;
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

public class M14Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M14")
//		.withAmmo(CommonProxy.M14Mag)
//		.withAmmoCapacity(20)
		.withFireRate(0.4f)
		.withRecoil(2f)
		.withZoom(0.9f)
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("M14")
		.withSilencedShootSound("snipersilencer")
		.withReloadSound("m14reload")
		.withUnloadSound("Unload")
		.withReloadingTime(45)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.06f)
		.withCreativeTab(ModernWarfareMod.SnipersTab)
		.withCrafting(CraftingComplexity.HIGH, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Designated Marksmen Rifle", "Damage: 14", 
		"Caliber: 7.62x51mm NATO", "Magazines:", "21rnd 7.62x51mm NATO Magazine",
		"Fire Rate: Semi"))
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
        .withCompatibleAttachment(GunSkins.Amber, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amber.getTextureVariantIndex("M14Amber"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(Magazines.M14DMRMag, (model) -> {
			GL11.glTranslatef(-0.4F, 0.9F, -2.1F);
			GL11.glScaled(1.4F, 1.5F, 1.5F);
			GL11.glRotatef(-5F, 1f, 0f, 0f);
		})
		.withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(-0.215F, -1.58F, -1.34F);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.129F, -1.63F, -5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(-0.163F, -1.36F, -8.512F);
				GL11.glScaled(0.36F, 0.36F, 0.7F);
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
				GL11.glTranslatef(-0.165F, -1.36F, -1.4F);
				GL11.glScaled(0.23F, 0.23F, 0.23F);
			} else if(model instanceof G36CIron2) {
				GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron1) {
				GL11.glTranslatef(0.177F, -1.65F, 1.4F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.55F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(Attachments.Leupold, (player, stack) -> {
            GL11.glTranslatef(-0.157F, -1.22F, -2.85F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
             if(model instanceof LeupoldReticle) {
                GL11.glTranslatef(0.076F, -0.52F, 4.0251F);
                GL11.glScaled(0.09F, 0.09F, 0.09F);
            }
        })
		.withCompatibleAttachment(AuxiliaryAttachments.M14Action, true, (model) -> {
			if(model instanceof M14Action) {
			    GL11.glTranslatef(0F, 0.01F, 0F);
				GL11.glScaled(1F, 1F, 1F);
			}
		})
		.withCompatibleAttachment(AuxiliaryAttachments.M14Action2, true, (model) -> {
            if(model instanceof M14Action2) {
                GL11.glTranslatef(0F, 0.02F, 0F);
                GL11.glScaled(1F, 1F, 1F);
            }
        })
		
		.withCompatibleAttachment(Attachments.Silencer762x51, (model) -> {
			GL11.glTranslatef(-0.2F, -1.3F, -10.63F);
			GL11.glScaled(1F, 1F, 1.2F);
		})
		
		.withTextureNames("M14DMR")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M14DMR())
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
                GL11.glScaled(0.47F, 0.47F, 0.47F);
                GL11.glTranslatef(-2F, -1.6F, 2.2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
				GL11.glTranslatef(-0.450000f, 0.7f, -0.05f);
				
//				GL11.glRotatef(44F, 0f, 1f, 0f);
//				GL11.glRotatef(-5F, 0f, 0f, 1f);
//				GL11.glRotatef(2F, 1f, 0f, 0f);
//				GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//				GL11.glTranslatef(-0.450000f, 0.55f, -0.1f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.450000f, 0.7f, 0.2f);
				GL11.glRotatef(-1.5F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.8f, 0.65f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Leupold)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.008F, 0.26f, 0.07f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
				
			.withFirstPersonCustomPositioning(Magazines.M14DMRMag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			 .withFirstPersonPositioningCustomRecoiled(Magazines.M14DMRMag, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.M14DMRMag, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.M14Action.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M14Action2.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M14Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.2F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M14Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.2F);
                })
        
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M14Action2.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.34F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M14Action2.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.34F);
                })
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glRotatef(44F, 0f, 1f, 0f);
						GL11.glRotatef(-5F, 0f, 0f, 1f);
						GL11.glRotatef(2F, 1f, 0f, 0f);
						GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
						GL11.glTranslatef(-0.450000f, 0.55f, -0.1f);
					}, 350, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glRotatef(44F, 0f, 1f, 0f);
						GL11.glRotatef(-4F, 0f, 0f, 1f);
						GL11.glRotatef(4F, 1f, 0f, 0f);
						GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
						GL11.glTranslatef(-0.450000f, 0.55f, -0.1f);
					}, 300, 100),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glRotatef(44F, 0f, 1f, 0f);
						GL11.glRotatef(-4F, 0f, 0f, 1f);
						GL11.glRotatef(-2F, 1f, 0f, 0f);
						GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
						GL11.glTranslatef(-0.450000f, 0.6f, -0.1f);
					 }, 100, 130),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
				    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
				    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
				    GL11.glTranslatef(-0.525000f, 1.225000f, 0.200000f);
				}, 400, 100),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				    GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
				    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
				    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
				    GL11.glTranslatef(-0.525000f, 1.225000f, 0.3f);
				}, 120, 20),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				    GL11.glRotatef(-11.500000f, 1f, 0f, 0f);
				    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
				    GL11.glRotatef(17.500000f, 0f, 0f, 1f);
				    GL11.glTranslatef(-0.525000f, 1.225000f, 0.2f);
				}, 70, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glRotatef(44F, 0f, 1f, 0f);
					GL11.glRotatef(-5F, 0f, 0f, 1f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
					GL11.glTranslatef(-0.450000f, 0.55f, -0.1f);
				}, 200, 0),
				new Transition((renderContext) -> { // Reload position
					GL11.glRotatef(44F, 0f, 1f, 0f);
					GL11.glRotatef(-5F, 0f, 0f, 1f);
					GL11.glRotatef(4F, 1f, 0f, 0f);
					GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
					GL11.glTranslatef(-0.450000f, 0.55f, -0.1f);
				}, 180, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.M14DMRMag,
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0.05F, 1F, 0F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.M14DMRMag,
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
					
			.withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M14Action.getRenderablePart(),
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
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M14Action.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0F, 0F, 1F);
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
                    GL11.glTranslatef(0F, 0F, 1.2F);
                    /* GL11.glRotatef(45F, 0f, 1f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M14Action2.getRenderablePart(),
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
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M14Action2.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0F, 0F, 1F);
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
                    GL11.glTranslatef(0F, 0F, 0.34F);
                    /*GL11.glRotatef(45F, 0f, 1f, 0f);
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
			    GL11.glTranslatef(0.350000f, 0.8f, 0.4f);
				
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Leupold)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(-0.008F, 0.26f, 0.2f);
				} 
				
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
			    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
			    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
			    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
			    GL11.glTranslatef(-0.400000f, 0.90000f, 0.150000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
			     GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.050000f, 0.575000f, 0.875000f);
			 })
			 
			.withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 8f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.300000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.400000f, 0.075000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 8f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.300000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.400000f, 0.075000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                    	 GL11.glScalef(4.5f, 4.5f, 8f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.050000f, -0.300000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.400000f, 0.075000f);
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 5f);
					    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.525000f, -0.700000f, 0.100000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 5f);
						GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
						GL11.glRotatef(30.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(0.225000f, -0.675000f, 0.100000f);
					}, 50, 200),

					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 5f);
						GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
						GL11.glRotatef(30.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(0.225000f, -0.675000f, 0.100000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4.5f, 4.5f, 8f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.300000f, 0.250000f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4.5f, 4.5f, 8f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.300000f, 0.250000f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4.5f, 4.5f, 8f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.300000f, 0.250000f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.400000f, 0.075000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.400000f, 0.075000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.400000f, 0.075000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
					    GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.075000f, 0.050000f, 0.225000f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
					    GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.075000f, -0.100000f, 0.225000f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.5f, 3.5f, 4f);
					    GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.075000f, -0.100000f, 0.225000f);
					}, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.675000f, 0.100000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.700000f, 0.100000f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
					}, 250, 50))		
					
			.build())
		.withSpawnEntityDamage(14f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}