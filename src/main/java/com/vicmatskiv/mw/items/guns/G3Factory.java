package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G3;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
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

public class G3Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("G3")
//		.withAmmo(CommonProxy.MP5Mag)
//		.withAmmoCapacity(25)
		.withFireRate(0.4f)
		.withRecoil(2.3f)
		.withZoom(0.95f)
		.withMaxShots(1, 3, Integer.MAX_VALUE)
		.withShootSound("G3")
		.withSilencedShootSound("G3Silenced")
		.withReloadSound("StandardReload")
		.withUnloadSound("Unload")
		.withReloadingTime(43)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.1f)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withCrafting(CraftingComplexity.HIGH, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.SteelIngot)
		.withInformationProvider(stack -> Arrays.asList("Type: Battle rifle", "Damage: 15", 
		"Caliber: 7.62x51mm", "Magazines:", "21rnd 7.62x51mm Magazine",
		"Fire Rate: Semi"))
		.withCompatibleAttachment(CommonProxy.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(CommonProxy.ElectricSkin.getTextureVariantIndex("Electric"));
				}, 
				(a, i) -> {
				}
		)
		.withCompatibleAttachment(CommonProxy.Amber, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Amber.getTextureVariantIndex("Amber"));
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
        .withCompatibleAttachment(CommonProxy.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(CommonProxy.G3Mag, (model) -> {})
	  .withCompatibleAttachment(CommonProxy.Extra, true, (model) -> {
			if(model instanceof G36CIron1) {
				GL11.glTranslatef(-0.21F, -1.94F, 4F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof G36CIron2) {
				GL11.glTranslatef(-0.18F, -1.25F, -4.1F);
				GL11.glScaled(0.5F, 0.54F, 0.5F);
			} else if(model instanceof AKMiron1) {
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
				GL11.glTranslatef(-0.1F, -1.235F, -0.2F);
				GL11.glScaled(0.45F, 0.42F, 0.45F);
			}
		})
//		.withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
//			GL11.glTranslatef(0.055F, -1.64F, 0.6F);
//			GL11.glScaled(0.6F, 0.6F, 0.6F);
//		},(model) -> {
//			 if(model instanceof Acog2) {
//				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
//			if(model instanceof Reflex) {
//			GL11.glTranslatef(.27F, -1.48F, 0F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Reflex2) {
//				GL11.glTranslatef(0.202F, -1.8F, 0.0F);
//				GL11.glScaled(0.1F, 0.1F, 0.1F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
//			if(model instanceof Holographic) {
//			GL11.glTranslatef(.264F, -1.53F, 0.2F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Holo2) {
//				GL11.glTranslatef(0.202F, -1.76F, 0.3F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Holographic2, (model) -> {
//			if(model instanceof Holographic2) {
//			GL11.glTranslatef(.264F, -1.53F, 0.2F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Holo2) {
//				GL11.glTranslatef(0.202F, -1.76F, 0.3F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
//			if(model instanceof Kobra) {
//			GL11.glTranslatef(.264F, -1.53F, 0.2F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Reflex2) {
//				GL11.glTranslatef(0.202F, -1.76F, -0.2F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Grip2, (model) -> {
//			GL11.glTranslatef(.135F, -0.8F, -0.8F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.Grip, (model) -> {
//			GL11.glTranslatef(.135F, -0.65F, -0.8F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.VGrip, (model) -> {
//			GL11.glTranslatef(.135F, -0.8F, -0.8F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
		.withCompatibleAttachment(CommonProxy.Silencer762x51, (model) -> {
			GL11.glTranslatef(-0.2F, -1.08F, -6.55F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("G3", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new G3())
			//.withTextureName("M4A1")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.32F, 0.32F, 0.32F);
				GL11.glTranslatef(1, 1.8f, -1f);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.6F, -0.8F, 1.7F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glTranslatef(0.5F, -0.2F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
				GL11.glTranslatef(0.5F, -0.2F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glTranslatef(-0.4F, -0.7F, 0.95F);
				GL11.glRotatef(-2F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.315F, -1.25f, 1.65f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-1F, 1f, 0f, 0f);

				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, 0.21f, 0.6f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.26f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.19f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.19f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.15f, 3.2f);
				}
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			
			.withFirstPersonCustomPositioning(CommonProxy.G3Mag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0.3F, -0.5F, -0.4F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glRotatef(-15F, 1f, 0f, 0f);
						GL11.glScaled(0.6F, 0.6F, 0.6F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 500),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0.3F, -0.5F, -0.4F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glRotatef(-15F, 1f, 0f, 0f);
						GL11.glScaled(0.6F, 0.6F, 0.6F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 20),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.1F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(-3F, 1f, 0f, 0f);
				}, 350, 60),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.1F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(-3F, 1f, 0f, 0f);
				}, 100, 0),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.1F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(-3F, 1f, 0f, 0f);
				}, 100, 0),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.1F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(-3F, 1f, 0f, 0f);
				}, 250, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.3F, -0.5F, -0.4F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(-15F, 1f, 0f, 0f);
					GL11.glScaled(0.6F, 0.6F, 0.6F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.3F, -0.5F, -0.4F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(-15F, 1f, 0f, 0f);
					GL11.glScaled(0.6F, 0.6F, 0.6F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(CommonProxy.G3Mag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0.5F, -0.2F);
					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(1.3F, 0.5F, -0.8F);
					GL11.glRotatef(10F, 1f, 0f, 0f);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(-90F, 0f, 0f, 1f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.G3Mag,
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
				}, 250, 1000),
				new Transition((renderContext) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000)
					)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.315F, -1.25f, 1.6f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, 0.21f, 0.6f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.26f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.19f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.19f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.15f, 3.2f);
				}
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(0.7F, -0.6F, -0.1F);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -1F);
			 })
			 .withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.55f, 0.1f, -0f);
						 GL11.glRotatef(115f, 0, 0f, 1f);
						 GL11.glRotatef(-70f, 1f, 0f, 0f);
						 GL11.glRotatef(30f, 1f, 1f, 0f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
						 GL11.glScalef(2.2f, 2.2f, 2.2f);
						 GL11.glTranslatef(1f, 0.3f, -0.3f);
						 GL11.glRotatef(99f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 20f, 20f, -20f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.3f, 0.8f, 0.3f);
						 GL11.glRotatef(30f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(30f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.3f, 0.6f, 0.3f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.7f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-70f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.73f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-45f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.73f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-45f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.7f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-70f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0)
					)
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0)
					)
					
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
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50))
			.build())
		.withSpawnEntityDamage(15f)
		.withSpawnEntityGravityVelocity(0.028f)
		
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}