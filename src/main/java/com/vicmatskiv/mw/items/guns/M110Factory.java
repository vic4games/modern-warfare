package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

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
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M110;
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

import net.minecraft.item.Item;

public class M110Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M110")
//		.withAmmo(CommonProxy.M110Mag)
//		.withAmmoCapacity(10)
		.withFireRate(0.2f)
		.withRecoil(3.5f)
		.withZoom(0.9f)
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("M110")
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("StandardReload")
		.withUnloadSound("Unload")
		.withReloadingTime(50)
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
                CommonProxy.SteelIngot)
		.withInformationProvider(stack -> Arrays.asList("Type: Sniper rifle/Designated marksmen rifle", "Damage: 15", 
		"Caliber: 7.62x51mm NATO", "Magazines:", "10rnd 7.62x51mm NATO Magazine (Type 2)",
		"Fire Rate: Semi"))
		.withCompatibleAttachment(CommonProxy.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(CommonProxy.ElectricSkin.getTextureVariantIndex("Electric"));
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
        .withCompatibleAttachment(CommonProxy.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(CommonProxy.M110Mag, (model) -> {
			GL11.glScaled(1F, 1F, 0.9F);
			GL11.glTranslatef(0F, -0.1F, -0.08F);
		})
		.withCompatibleAttachment(CommonProxy.AKMIron, true, (model) -> {
		    	if(model instanceof M4Iron1) {
					GL11.glTranslatef(0.162F, -1.75F, 1F);
					GL11.glScaled(0.33F, 0.35F, 0.33F);
				} else if(model instanceof M4Iron2) {
					GL11.glTranslatef(0.255F, -1.55F, -3.1F);
					GL11.glScaled(0.8F, 0.8F, 0.8F);
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
					GL11.glTranslatef(0.127F, -1.77F, -3.1F);
					GL11.glScaled(0.55F, 0.58F, 0.55F);
				} else if(model instanceof M14Iron) {
					GL11.glTranslatef(0.129F, -1.63F, -2.08F);
					GL11.glScaled(0F, 0F, 0F);
				} else if(model instanceof MP5Iron) {
					GL11.glTranslatef(0.215F, -1.54F, 1.2F);
					GL11.glScaled(0F, 0F, 0F);
				}
			})
			.withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
			GL11.glTranslatef(0.055F, -1.64F, 0.6F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
			 if(model instanceof Acog2) {
				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
			.withCompatibleAttachment(CommonProxy.Scope, (player, stack) -> {
	    	
				GL11.glTranslatef(0.055F, -1.62F, 0.8F);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
			},(model) -> {
				if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.272F, 0.67F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			 	}
			})
			.withCompatibleAttachment(CommonProxy.HP, (player, stack) -> {
	    	
				GL11.glTranslatef(0.055F, -1.62F, 0.4F);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.235F, 1.16F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
			.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
				if(model instanceof Reflex) {
				GL11.glTranslatef(.27F, -1.48F, 0F);
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				} else if(model instanceof Reflex2) {
					GL11.glTranslatef(0.202F, -1.8F, 0.0F);
					GL11.glScaled(0.1F, 0.1F, 0.1F);
				}
			})
			.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
				if(model instanceof Holographic) {
				GL11.glTranslatef(.264F, -1.53F, 0.2F);
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				} else if(model instanceof Holo2) {
					GL11.glTranslatef(0.202F, -1.76F, 0.3F);
					GL11.glScaled(0.06F, 0.06F, 0.06F);
				}
			})
			.withCompatibleAttachment(CommonProxy.Holographic2, (model) -> {
				if(model instanceof Holographic2) {
				GL11.glTranslatef(.264F, -1.53F, 0.2F);
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				} else if(model instanceof Holo2) {
					GL11.glTranslatef(0.202F, -1.76F, 0.3F);
					GL11.glScaled(0.06F, 0.06F, 0.06F);
				}
			})
			.withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
				if(model instanceof Kobra) {
				GL11.glTranslatef(.27F, -1.48F, 0F);
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				} else if(model instanceof Reflex2) {
					GL11.glTranslatef(0.202F, -1.675F, -0.45F);
					GL11.glScaled(0.1F, 0.1F, 0.1F);
				}
			})
			.withCompatibleAttachment(CommonProxy.Grip2, (model) -> {
				GL11.glTranslatef(.135F, -0.7F, -2.3F);
				GL11.glScaled(0.8F, 0.8F, 0.8F);
			})
			.withCompatibleAttachment(CommonProxy.StubbyGrip, (model) -> {
				GL11.glTranslatef(.135F, -0.7F, -2.3F);
				GL11.glScaled(0.8F, 0.8F, 0.8F);
			})
			/*.withCompatibleAttachment(CommonProxy.Grip, (model) -> {
				GL11.glTranslatef(.135F, -0.6F, -2.3F);
				GL11.glScaled(0.8F, 0.8F, 0.8F);
			})*/
			.withCompatibleAttachment(CommonProxy.VGrip, (model) -> {
				GL11.glTranslatef(.135F, -0.7F, -2.3F);
				GL11.glScaled(0.8F, 0.8F, 0.8F);
			})
			.withCompatibleAttachment(CommonProxy.Bipod, (model) -> {
				GL11.glTranslatef(.135F, -0.7F, -2.3F);
				GL11.glScaled(0.8F, 0.8F, 0.8F);
			})
			.withCompatibleAttachment(CommonProxy.Silencer762x51, (model) -> {
				GL11.glTranslatef(0.107F, -1.5F, -5.65F);
				GL11.glScaled(1F, 1F, 1F);
			})
			.withTextureNames("M110", "Electric")
			.withRenderer(new WeaponRenderer.Builder()
				.withModId(ModernWarfareMod.MODID)
				.withModel(new M110())
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
					GL11.glScaled(0.6F, 0.6F, 0.6F);
					GL11.glTranslatef(-1.8F, 0.3F, 1.5F);
					GL11.glRotatef(-45F, 0f, 1f, 0f);
					GL11.glRotatef(70F, 1f, 0f, 0f);
					})
					
					
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glTranslatef(0.44F, -0.32F, -0.11F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.3F, -0.8F, 0.8F);
				})
					
			.withFirstPersonPositioningRecoiled((renderContext) -> {
				GL11.glTranslatef(0.44F, -0.32F, -0.11F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.3F, -0.8F, 0.86F);
				GL11.glRotatef(-2F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glTranslatef(-0.1F, -0.3F, -0.3F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.135F, -0.97f, 1.43f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-0.6F, 1f, 0f, 0f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.AKMIron)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.025f, 0.55f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 0.2f);
				} 

				// HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 0.2f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.03f, 0.3f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.04f, 0.6f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.04f, 0.6f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.373F, -1.32f, 2.8f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
					
			.withFirstPersonCustomPositioning(CommonProxy.M110Mag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0F, -0.4F, -0.4F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glRotatef(-10F, 1f, 0f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 500),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0F, -0.4F, -0.4F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glRotatef(-10F, 1f, 0f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 250),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.44F, -0.32F, -0.11F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.3F, -0.8F, 0.8F);
					GL11.glRotatef(5F, 0f, 0f, 1f);
				}, 450, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0F, -0.4F, -0.4F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(-10F, 1f, 0f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0F, -0.4F, -0.4F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(-10F, 1f, 0f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(CommonProxy.M110Mag,
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
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.M110Mag,
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
				}, 250, 1000)
					)
					
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glTranslatef(-0.1F, -0.3F, -0.3F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.135F, -0.97f, 1.4f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.AKMIron)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.025f, 0.55f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 0.2f);
				} 

				// HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 0.2f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.03f, 0.3f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.04f, 0.6f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.04f, 0.6f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.373F, -1.32f, 2.8f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				.withFirstPersonPositioningRunning((renderContext) -> {
					GL11.glScaled(0.8F, 0.8F, 0.8F);
					GL11.glRotatef(-20F, -4f, 1f, -2f);
					GL11.glTranslatef(0.5F, -0.35F, -1F);
				 })
				 .withFirstPersonPositioningModifying((renderContext) -> {
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glRotatef(-35F, 2f, 1f, 1f);
					GL11.glTranslatef(1F, -0.8F, -1.5F);
				 })
				 .withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.75f, -0.25f, 0.22f);
						 GL11.glRotatef(110f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
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
						 GL11.glTranslatef(0.4f, 0.5f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(20f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 0.5f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.65f, -0.2f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(20f, 0, 1f, 0f);
						 GL11.glRotatef(-55f, 1f, 0f, 0f);
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
					}, 250, 0))
					
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
			.withSpawnEntityDamage(15f)
			.withSpawnEntityGravityVelocity(0.0118f)
			
			 
			.build(ModernWarfareMod.MOD_CONTEXT);
		}
	}