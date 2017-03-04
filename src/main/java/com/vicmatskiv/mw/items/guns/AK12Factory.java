package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.ACOG;
import com.vicmatskiv.mw.models.AK12;
import com.vicmatskiv.mw.models.AK12IronSight;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.HK33;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WorldHelper;
import com.vicmatskiv.weaponlib.animation.Transition;

public class AK12Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("AK12")
//		.withAmmo(CommonProxy.MP5Mag)
//		.withAmmoCapacity(25)
		.withFireRate(0.75f)
		.withRecoil(3.5f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 3, 1)
		//.withMaxShots(5)
		.withShootSound("AK12")
		.withSilencedShootSound("AKsilenced")
		.withReloadSound("AKReload")
		.withUnloadSound("Unload")
		.withReloadingTime(43)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.7f)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withInformationProvider(stack -> Arrays.asList("Type: Assault rifle","Damage: 7.3", 
		"Caliber: 5.56x39mm", "Magazines:", "31rnd 5.56x39mm Magazine",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(CommonProxy.AK12Mag, (model) -> {
		})
	  .withCompatibleAttachment(CommonProxy.Extra, true, (model) -> {
			if(model instanceof G36CIron1) {
				GL11.glTranslatef(-0.21F, -1.94F, 4F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof G36CIron2) {
				GL11.glTranslatef(-0.18F, -1.25F, -4.1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(-0.162F, -1.25F, -4.72F);
				GL11.glScaled(0.35F, 0.35F, 0.52F);
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
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.AK12IronSight, true, (model) -> {
			if(model instanceof AK12IronSight) {
				GL11.glTranslatef(-0.166F, -1.4F, -0.3F);
				GL11.glScaled(0.56F, 0.56F, 0.56F);
			}
		})
		.withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
			GL11.glTranslatef(-0.277F, -1.3F, -1F);
			GL11.glScaled(0.65F, 0.65F, 0.65F);
		},(model) -> {
			 if(model instanceof Acog2) {
				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		
		.withCompatibleAttachment(CommonProxy.Scope, (player, stack) -> {
			GL11.glTranslatef(-0.31F, -1.3F, -1F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.272F, 0.67F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		
		 .withCompatibleAttachment(CommonProxy.HP, (player, stack) -> {
			 GL11.glTranslatef(-0.31F, -1.3F, -1.2F);
				GL11.glScaled(0.8F, 0.8F, 0.8F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.235F, 1.16F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		
		.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
			if(model instanceof Reflex) {
			GL11.glTranslatef(-0.065F, -1.13F, -1.8F);
			GL11.glScaled(0.45F, 0.45F, 0.45F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(-0.125F, -1.42F, -1.8F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
			if(model instanceof Holographic) {
				GL11.glTranslatef(-0.055F, -1.18F, -1.4F);
				GL11.glScaled(0.54F, 0.54F, 0.54F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(-0.125F, -1.435F, -1.3F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Holographic2, (model) -> {
			if(model instanceof Holographic2) {
				GL11.glTranslatef(-0.055F, -1.18F, -1.4F);
				GL11.glScaled(0.54F, 0.54F, 0.54F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(-0.125F, -1.435F, -1.3F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
			if(model instanceof Kobra) {
				GL11.glTranslatef(-0.055F, -1.18F, -1.4F);
				GL11.glScaled(0.54F, 0.54F, 0.54F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(-0.125F, -1.407F, -1.85F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Grip2, (model) -> {
			GL11.glTranslatef(-0.2F, -0.23F, -2.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(CommonProxy.StubbyGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.23F, -2.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(CommonProxy.Grip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.18F, -3F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(CommonProxy.Bipod, (model) -> {
			GL11.glTranslatef(-0.2F, -0.23F, -3F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(CommonProxy.VGrip, (model) -> {
			GL11.glTranslatef(-0.2F, -0.23F, -2.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(CommonProxy.Silencer556x39, (model) -> {
			GL11.glTranslatef(-0.2F, -1.02F, -6.35F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("AK12kal", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new AK12())
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
			.withThirdPersonPositioning((player, itemStack) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.6F, -0.8F, 1.7F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((player, itemStack) -> {
				GL11.glTranslatef(0.7F, -0.2F, -0.03F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
				})
			
			.withFirstPersonCustomPositioning(CommonProxy.AK12Mag, (player, itemStack) -> {
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glTranslatef(0.5F, -0.5F, -0.3F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glRotatef(-15F, 1f, 0f, 0f);
						GL11.glScaled(0.6F, 0.6F, 0.6F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 500),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glTranslatef(0.5F, -0.5F, -0.3F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glRotatef(-15F, 1f, 0f, 0f);
						GL11.glScaled(0.6F, 0.6F, 0.6F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 20),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.7F, -0.2F, -0.03F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(7F, 0f, 0f, 1f);
					GL11.glRotatef(-5F, 1f, 0f, 0f);
				}, 350, 60),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.7F, -0.2F, -0.03F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(7F, 0f, 0f, 1f);
					GL11.glRotatef(-5F, 1f, 0f, 0f);
				}, 100, 0),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.7F, -0.2F, -0.03F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(7F, 0f, 0f, 1f);
					GL11.glRotatef(-5F, 1f, 0f, 0f);
				}, 100, 0),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.7F, -0.2F, -0.03F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(7F, 0f, 0f, 1f);
					GL11.glRotatef(-5F, 1f, 0f, 0f);
				}, 250, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.5F, -0.3F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(-15F, 1f, 0f, 0f);
					GL11.glScaled(0.6F, 0.6F, 0.6F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50),
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.5F, -0.3F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(-15F, 1f, 0f, 0f);
					GL11.glScaled(0.6F, 0.6F, 0.6F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(CommonProxy.AK12Mag,
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(0F, 0.5F, -0.2F);
					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(1.3F, 0.5F, -0.8F);
					GL11.glRotatef(10F, 1f, 0f, 0f);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(-90F, 0f, 0f, 1f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.AK12Mag,
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(0.05F, 1F, 0F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((player, itemStack) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((player, itemStack) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000),
				new Transition((player, itemStack) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000),
				new Transition((player, itemStack) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000),
				new Transition((player, itemStack) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000)
					)
				
			.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.315F, -1.25f, 1.8f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Scope)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.2f, 0.6f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.HP)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.2f, 0.2f);
				} 
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.155f, 0.9f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.16f, 1.2f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.136f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.136f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Kobra)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.2f, 3.6f);
				}
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonPositioningRunning((player, itemStack) -> {
				GL11.glScaled(0.8F, 0.8F, 0.8F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(0.7F, -0.5F, 0.2F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(0.8F, -0.8F, -0.3F);
			 })
			 .withFirstPersonHandPositioning(
					 (player,  itemStack) -> {
						 GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.52f, 0.1f, -0.1f);
						 GL11.glRotatef(115f, 0, 0f, 1f);
						 GL11.glRotatef(-70f, 1f, 0f, 0f);
						 GL11.glRotatef(30f, 1f, 1f, 0f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (player,  itemStack) -> {
						 GL11.glScalef(2.2f, 2.2f, 2.2f);
						 GL11.glTranslatef(1f, 0.4f, -0.5f);
						 GL11.glRotatef(99f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 20f, 20f, -20f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.3f, 0.8f, 0.3f);
						 GL11.glRotatef(30f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(30f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.3f, 0.6f, 0.3f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.7f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-70f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.73f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-45f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.73f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-45f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.7f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-70f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0)
					)
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0)
					)
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.65f, -0.2f, 0.37f);
						 GL11.glRotatef(70f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.7f, 0f, 0.37f);
						 GL11.glRotatef(50f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(-40f, 0f, 1f, 0f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50))
			.build())
		.withSpawnEntityDamage(7.3f)
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