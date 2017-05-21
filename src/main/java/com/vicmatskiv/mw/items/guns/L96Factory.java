package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.L96;
import com.vicmatskiv.mw.models.LPscope;
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

public class L96Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("L96")
//		.withAmmo(CommonProxy.XWPMag)
//		.withAmmoCapacity(10)
		.withFireRate(0.16f)
		.withEjectRoundRequired()
		.withEjectSpentRoundSound("L96BoltAction")
		.withRecoil(4f)
		.withZoom(0.8f)
		.withMaxShots(1)
		.withShootSound("L96")
		.withPumpTimeout(2000)
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("BoltActionReload")
		.withUnloadSound("Unload")
		.withReloadingTime(40)
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
		.withInformationProvider(stack -> Arrays.asList("Type: Sniper rifle", "Damage: 32.2", 
		"Caliber: .50 BMG", "Magazines:", "10rnd .50 BMG Magazine (Type 3)", "Fire Rate: Bolt Action"))
		.withCompatibleAttachment(CommonProxy.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.ElectricSkin.getTextureVariantIndex("Electric"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.LightningStrike, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.LightningStrike.getTextureVariantIndex("AWPLightningStrike"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(CommonProxy.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(CommonProxy.L115Mag, (model) -> {})
		.withCompatibleAttachment(CommonProxy.L115Bolt1, true, (model) -> {})
		.withCompatibleAttachment(CommonProxy.L115Bolt2, true, (model) -> {})
		.withCompatibleAttachment(CommonProxy.Extra, true, (model) -> {
	    	if(model instanceof M4Iron1) {
	    		GL11.glTranslatef(0.17F, -1.42F, 0.43F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.255F, -0.8F, -2.25F);
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
				GL11.glTranslatef(0.165F, -1.65F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.55F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(0.125F, -1.43F, -4.88F);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.AKMIron, true, (model) -> {
	    	if(model instanceof M4Iron1) {
	    		GL11.glTranslatef(0.17F, -1.42F, 0.43F);
				GL11.glScaled(0.25F, 0.25F, 0.25F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.255F, -0.8F, -2.25F);
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
				GL11.glTranslatef(0.165F, -1.65F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.55F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(0.125F, -1.43F, -4.88F);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.HP, (player, stack) -> {
	    	
			GL11.glTranslatef(0.055F, -1.45F, 0.1F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.235F, 1.16F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Scope, (player, stack) -> {
	    	
	    	GL11.glTranslatef(0.055F, -1.45F, 0.3F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.272F, 0.67F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
			GL11.glTranslatef(0.055F, -1.45F, 0.2F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
			 if(model instanceof Acog2) {
				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Bipod, (model) -> {
			GL11.glTranslatef(.135F, -0.6F, -2.33F);
			GL11.glScaled(0.9F, 0.9F, 0.9F);
		})
		.withCompatibleAttachment(CommonProxy.Silencer50BMG, (model) -> {
			GL11.glTranslatef(0.107F, -1.45F, -6.95F);
			GL11.glScaled(1.1F, 1.1F, 1.3F);
		})
		.withTextureNames("L96", "L96Blue", "L96Red", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new L96())
			//.withTextureName("AWP")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.32F, 0.32F, 0.32F);
				GL11.glTranslatef(1, 0.8f, 0);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.8F, 0.25F, 1.5F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glTranslatef(0.2F, -0.28F, -0.3F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
				})
				
			.withFirstPersonCustomPositioning(CommonProxy.L115Mag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
				GL11.glTranslatef(0.2F, -0.28F, -0.3F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-0.4F, -0.8F, 1.3F);
				GL11.glRotatef(-4F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glTranslatef(0.2F, -0.3F, 0.1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);

				// Zoom
				GL11.glTranslatef(0.17F, -0.95f, 0.52f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-1F, 1f, 0f, 0f);
				
				// HP Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.16f, 0.15f);
				} 
				
				// HP Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.16f, 0.2f);
				} 
				
				// HP Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(1.38F, -1.19f, 2.9f);
				} 
				
				/* // Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.2f, 0.7f);
				} 
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1f, 3f);
				} 
				*/
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonCustomPositioning(CommonProxy.L115Bolt1.getRenderablePart(), (renderContext) -> {
                })
            .withFirstPersonCustomPositioning(CommonProxy.L115Bolt2.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0.2F, -0.28F, -0.3F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0.2F, -0.28F, -0.3F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0.2F, -0.28F, -0.3F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0.2F, -0.28F, -0.3F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
                    }, 150, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(CommonProxy.L115Bolt1.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0F, 0F, 0.6F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.4F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(CommonProxy.L115Bolt2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.7F, -0.4F, 0F);
                        GL11.glRotatef(0F, 0f, 1f, 0f);
                        GL11.glRotatef(40F, 0f, 0f, 1f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.7F, -0.4F, 0.4F);
                        GL11.glRotatef(0F, 0f, 1f, 0f);
                        GL11.glRotatef(40F, 0f, 0f, 1f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.7F, -0.4F, 0F);
                        GL11.glRotatef(0F, 0f, 1f, 0f);
                        GL11.glRotatef(40F, 0f, 0f, 1f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)     
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(CommonProxy.L115Mag.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0F, 0F, 0.6F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)
                    
                    )
                    
            
                
             .withFirstPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0.2F, -0.28F, -0.3F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0.2F, -0.28F, -0.3F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
                    }, 250, 300),                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.2F, -0.5F, -0.3F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 350, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.2F, -0.5F, -0.3F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.2F, -0.28F, -0.3F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                    GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
                }, 350, 250),
                    new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.2F, -0.28F, -0.3F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                    GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
                }, 150, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.2F, -0.28F, -0.3F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(7F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                    GL11.glTranslatef(-0.4F, -0.8F, 1.2F);
                }, 150, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.2F, -0.5F, -0.3F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.2F, -0.5F, -0.3F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(CommonProxy.L115Mag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.2F, 0.5F, -0.2F);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1.3F, 0.5F, -0.8F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.L115Mag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.05F, 1F, 0F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.05F, 1F, 0F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1F, 0F);
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
                }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(CommonProxy.L115Bolt1.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position  
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position  
                        GL11.glTranslatef(0F, 0F, 0.3F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 0.3F);
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position 
                    GL11.glTranslatef(0F, 0F, 0.3F);
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position 
                    GL11.glTranslatef(0F, 0F, 0.3F);
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position  
                    GL11.glTranslatef(0F, 0F, 0.3F);
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position  
                }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningReloading(CommonProxy.L115Bolt2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position  
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position  
                        GL11.glTranslatef(0F, 0F, 0.3F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 0.3F);
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position 
                    GL11.glTranslatef(0F, 0F, 0.3F);
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position 
                    GL11.glTranslatef(0F, 0F, 0.3F);
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position  
                    GL11.glTranslatef(0F, 0F, 0.3F);
//                  GL11.glRotatef(40F, 0f, 1f, 0f);
//                  GL11.glRotatef(10F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position  
                }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningUnloading(CommonProxy.L115Bolt1.getRenderablePart(),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000)
                        )
                        
            .withFirstPersonCustomPositioningUnloading(CommonProxy.L115Bolt2.getRenderablePart(),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000)
                        )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(0.2F, -0.3F, 0.1F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.6F, 0.6F, 0.6F);

                // Zoom
                GL11.glTranslatef(0.17F, -0.95f, 0.5f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.16f, 0.15f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.16f, 0.2f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(1.38F, -1.19f, 2.9f);
                } 
                
                /* // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.2f, 0.7f);
                } 
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(1.373F, -1f, 3f);
                } 
                */
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(0.9F, 0.9F, 0.9F);
                GL11.glRotatef(-20F, -4f, 1f, -2f);
                GL11.glTranslatef(0.5F, -0.3F, -1F);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glRotatef(-35F, 2f, 1f, 1f);
                GL11.glTranslatef(1F, -0.8F, -1.5F);
             })
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(1.7f, 1.7f, 3f);
                            GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                            GL11.glRotatef(110f, 0, 0f, 1f);
                            GL11.glRotatef(-50f, 1f, 0f, 0f);
                            GL11.glRotatef(20f, 0f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(1.8f, 1.8f, 2.5f);
                         GL11.glTranslatef(-0.15f, 0f, 1f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glTranslatef(1f, 0.2f, 0.2f);
                         GL11.glRotatef(99f, 0, 0f, 1f);
                         GL11.glRotatef(-60f, 20f, 20f, -20f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(1.8f, 1.8f, 2.5f);
                         GL11.glTranslatef(-0.15f, 0f, 1f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.7f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-90f, 1f, 0f, 0f);
                         GL11.glRotatef(20f, 0f, 0f, 1f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.55f, -0.25f, 0.5f);
                         GL11.glRotatef(110f, 0, 0f, 1f);
                         GL11.glRotatef(20f, 0, 1f, 0f);
                         GL11.glRotatef(-105f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.67f, -0.15f, 0.6f);
                         GL11.glRotatef(110f, 0, 0f, 1f);
                         GL11.glRotatef(20f, 0, 1f, 0f);
                         GL11.glRotatef(-105f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.15f, 0.06f, 0.95f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.15f, 0.06f, 0.95f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.67f, -0.15f, 0.6f);
                         GL11.glRotatef(110f, 0, 0f, 1f);
                         GL11.glRotatef(20f, 0, 1f, 0f);
                         GL11.glRotatef(-105f, 1f, 0f, 0f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.55f, -0.25f, 0.6f);
                         GL11.glRotatef(110f, 0, 0f, 1f);
                         GL11.glRotatef(20f, 0, 1f, 0f);
                         GL11.glRotatef(-105f, 1f, 0f, 0f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                         GL11.glTranslatef(-0.29f, 0.032f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(20f, 0, 1f, 0f);
                         GL11.glRotatef(-90f, 1f, 0f, 0f);
                    }, 350, 1050))
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                        GL11.glTranslatef(0.65f, -0.04f, 0.3f);
                        GL11.glRotatef(110f, 0, 0f, 1f);
                        GL11.glRotatef(-50f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 250, 50)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.55f, -0.25f, 0.5f);
                         GL11.glRotatef(110f, 0, 0f, 1f);
                         GL11.glRotatef(20f, 0, 1f, 0f);
                         GL11.glRotatef(-105f, 1f, 0f, 0f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.67f, -0.25f, 0.6f);
                         GL11.glRotatef(110f, 0, 0f, 1f);
                         GL11.glRotatef(20f, 0, 1f, 0f);
                         GL11.glRotatef(-105f, 1f, 0f, 0f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.55f, -0.25f, 0.6f);
                         GL11.glRotatef(110f, 0, 0f, 1f);
                         GL11.glRotatef(20f, 0, 1f, 0f);
                         GL11.glRotatef(-105f, 1f, 0f, 0f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                         GL11.glTranslatef(-0.29f, 0.032f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(20f, 0, 1f, 0f);
                         GL11.glRotatef(-90f, 1f, 0f, 0f);
                    }, 350, 1050))
                
                .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                         GL11.glTranslatef(0.65f, -0.2f, 0.37f);
                         GL11.glRotatef(70f, 0, 0f, 1f);
                         GL11.glRotatef(-50f, 1f, 0f, 0f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                         GL11.glTranslatef(0.7f, 0f, 0.37f);
                         GL11.glRotatef(50f, 0, 0f, 1f);
                         GL11.glRotatef(-90f, 1f, 0f, 0f);
                         GL11.glRotatef(-40f, 0f, 1f, 0f);
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
		.withSpawnEntityDamage(32.2f)
		.withSpawnEntityGravityVelocity(0f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}