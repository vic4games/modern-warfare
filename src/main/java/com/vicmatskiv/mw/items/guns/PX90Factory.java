package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.block.Block;
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
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WorldHelper;
import com.vicmatskiv.weaponlib.animation.Transition;

public class PX90Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("FN P90 TR")
//		.withAmmo(CommonProxy.PX90Mag)
//		.withAmmoCapacity(50)
		.withFireRate(0.75f)  
		.withRecoil(2.8f)
		.withZoom(0.9f)
		//.withMaxShots(5)
		.withShootSound("P90")
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("P90Reload")
		.withUnloadSound("Unload")
		.withReloadingTime(70)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.29f)
		.withFlashOffsetY(() -> 0.3f)
		.withInaccuracy(3)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withInformationProvider(stack -> Arrays.asList("Type: Personal defense weapon", "Damage: 6.5", 
		"Caliber: 5.7x28mm", "Magazines:", "50rnd 5.7x28mm Magazine",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(CommonProxy.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(CommonProxy.ElectricSkin.getTextureVariantIndex("Electric"));
				}, 
				(a, i) -> {
				}
		)
		.withCompatibleAttachment(CommonProxy.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Emerald.getTextureVariantIndex("Emerald"));
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
		.withCompatibleAttachment(CommonProxy.FNP90Mag, (model) -> {})
		.withCompatibleAttachment(CommonProxy.AKMIron, true, (model) -> {
			if(model instanceof M4Iron1) {
				GL11.glTranslatef(0.16F, -1.9F, 0.8F);
				GL11.glScaled(0.35F, 0.35F, 0.35F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof P90iron) {
				GL11.glTranslatef(0.14F, -1.92F, -0.35F);
				GL11.glScaled(0.5F, 0.5F, 0.5F);
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
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
			GL11.glTranslatef(0.055F, -1.95F, 0.6F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
			 if(model instanceof Acog2) {
				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
	.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
		if(model instanceof Reflex) {
		GL11.glTranslatef(.25F, -1.8F, 0F);
		GL11.glScaled(0.4F, 0.4F, 0.4F);
		} else if(model instanceof Reflex2) {
			GL11.glTranslatef(0.202F, -2.05F, 0.0F);
			GL11.glScaled(0.1F, 0.1F, 0.1F);
		}
	})
	.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
		if(model instanceof Holographic) {
		GL11.glTranslatef(.264F, -1.85F, 0.2F);
		GL11.glScaled(0.5F, 0.5F, 0.5F);
		} else if(model instanceof Holo2) {
			GL11.glTranslatef(0.202F, -2.085F, 0.3F);
			GL11.glScaled(0.06F, 0.06F, 0.06F);
		}
	})
	.withCompatibleAttachment(CommonProxy.Holographic2, (model) -> {
		if(model instanceof Holographic2) {
		GL11.glTranslatef(.264F, -1.85F, 0.2F);
		GL11.glScaled(0.5F, 0.5F, 0.5F);
		} else if(model instanceof Holo2) {
			GL11.glTranslatef(0.202F, -2.085F, 0.3F);
			GL11.glScaled(0.06F, 0.06F, 0.06F);
		}
	})
	.withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
		if(model instanceof Kobra) {
		GL11.glTranslatef(.264F, -1.85F, 0.2F);
		GL11.glScaled(0.5F, 0.5F, 0.5F);
		} else if(model instanceof Reflex2) {
			GL11.glTranslatef(0.202F, -2.085F, -0.26F);
			GL11.glScaled(0.06F, 0.06F, 0.06F);
		}
	})
		.withCompatibleAttachment(CommonProxy.Silencer57x38, (model) -> {
			GL11.glTranslatef(0.107F, -1.2F, -2.14F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("P90", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new P90())
			//.withTextureName("PX90")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(2f, 0.5f, 0);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(-1.8F, 0.7F, 1.5F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glTranslatef(0.1F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.5F, -0.6F, 0.3F);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
				GL11.glTranslatef(0.1F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.5F, -0.6F, 0.45F);
				GL11.glRotatef(-3F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glTranslatef(-0.3F, -0.32F, -0.4F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.263F, -0.9f, 1.9f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-0.5F, 1f, 0f, 0f);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, 0.15f, 0.45f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.4f, 0.5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.15f, 0.2f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.15f, 0.2f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.15f, 0.2f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.19f, 2.5f);
				} 
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonCustomPositioning(CommonProxy.FNP90Mag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0.1F, -0.1F, -0.2F);
						GL11.glRotatef(40F, 0f, 1f, 0f);
						GL11.glRotatef(10F, 1f, 0f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.5F, -0.6F, 0.3F);
					}, 250, 500),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0.1F, -0.1F, -0.2F);
						GL11.glRotatef(40F, 0f, 1f, 0f);
						GL11.glRotatef(10F, 1f, 0f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.5F, -0.6F, 0.3F);
					}, 250, 20),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.1F, -0.1F, -0.2F);
					GL11.glRotatef(40F, 0f, 1f, 0f);
					GL11.glRotatef(10F, 1f, 0f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.5F, -0.6F, 0.3F);
				}, 250, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.1F, -0.1F, -0.2F);
					GL11.glRotatef(40F, 0f, 1f, 0f);
					GL11.glRotatef(10F, 1f, 0f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.5F, -0.6F, 0.3F);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.1F, -0.1F, -0.2F);
					GL11.glRotatef(40F, 0f, 1f, 0f);
					GL11.glRotatef(10F, 1f, 0f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.5F, -0.6F, 0.3F);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(CommonProxy.FNP90Mag,
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, -0.15F, 0.8F);
					GL11.glRotatef(5F, 1f, 0f, 0f);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.FNP90Mag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, -0.15F, 0.6F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0F, 0.2F);
					GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000)
					)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glTranslatef(-0.3F, -0.3F, -0.4F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.263F, -0.9f, 1.8f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, 0.15f, 0.45f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.4f, 0.5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.15f, 0.2f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.15f, 0.2f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.15f, 0.2f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.19f, 2.5f);
				} 
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(1F, -0.75F, -1.2F);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -2F);
			 })
			  .withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.8f, -0.35f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
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
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.9f, -0.4f, 0.8f);
						 GL11.glRotatef(80f, 0, 0f, 1f);
						 GL11.glRotatef(-15f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.8f, -0.4f, 0.8f);
						 GL11.glRotatef(70f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.8f, -0.4f, 0.8f);
						 GL11.glRotatef(70f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 0f, 1f);
					}, 50, 200))
					
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
					}, 250, 50))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.8f, -0.4f, 0.8f);
						 GL11.glRotatef(70f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.9f, -0.4f, 0.8f);
						 GL11.glRotatef(80f, 0, 0f, 1f);
						 GL11.glRotatef(-15f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 0f, 1f);
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
		.withSpawnEntityDamage(6.5f)
		.withSpawnEntityGravityVelocity(0.028f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = WorldHelper.getBlockAtPosition(world, position);
			if (WorldHelper.isGlassBlock(block)) {
				WorldHelper.destroyBlock(world, position);
			}
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}
