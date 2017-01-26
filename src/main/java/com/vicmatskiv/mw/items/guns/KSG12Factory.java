package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.ACOG;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.KSG12;
import com.vicmatskiv.mw.models.Kobra;
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
import com.vicmatskiv.weaponlib.WorldHelper;
import com.vicmatskiv.weaponlib.animation.Transition;

public class KSG12Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("KSG12")
//		.withAmmo(CommonProxy.Remington870Mag)
		.withAmmoCapacity(7)
		.withMaxBulletsPerReload(7)
		.withFireRate(0.5f)
		.withEjectRoundRequired()
		.withEjectSpentRoundSound("KSG12Pump")
		.withPumpTimeout(1000)
		.withRecoil(9f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("KSG12")
		//.withSilencedShootSound("AR15silenced")
		.withReloadSound("ShotgunReload")
		.withReloadingTime(15)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withInaccuracy(10)
		.withPellets(10)
		.withFlashIntensity(1f)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withInformationProvider(stack -> Arrays.asList("Damage per Pellet: 5", "Pellets per Shot: 10", 
		"Ammo: 12 Gauge Shotgun Shell", "Fire Rate: Pump-Action"))
		.withCompatibleAttachment(CommonProxy.KSGPump, true, (model) -> {
		})
		.withCompatibleBullet(CommonProxy.ShotgunShell, (model) -> {})
	    .withCompatibleAttachment(CommonProxy.AKMIron, true, (model) -> {
			if(model instanceof M4Iron1) {
				GL11.glTranslatef(0.161F, -1.61F, 0.3F);
				GL11.glScaled(0.32F, 0.34F, 0.32F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.24F, -1.53F, -1.9F);
				GL11.glScaled(0.5F, 0.32F, 0.32F);
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
				GL11.glTranslatef(0.152F, -1.66F, -1.9F);
				GL11.glScaled(0.35F, 0.35F, 0.35F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.ACOG, (model) -> {
			if(model instanceof ACOG) {
				GL11.glTranslatef(0.06F, -1.5F, 0F);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Acog2) {
				GL11.glTranslatef(0.2F, -1.65F, 0F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
			if(model instanceof Reflex) {
			GL11.glTranslatef(.25F, -1.38F, -0.6F);
			GL11.glScaled(0.4F, 0.4F, 0.4F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(0.2F, -1.62F, -0.6F);
				GL11.glScaled(0.12F, 0.12F, 0.12F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
			if(model instanceof Holographic) {
			GL11.glTranslatef(.264F, -1.4F, -0.3F);
			GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(0.202F, -1.64F, -0.15F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
			if(model instanceof Kobra) {
			GL11.glTranslatef(.27F, -1.4F, -0.2F);
			GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(0.202F, -1.6F, -0.6F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withTextureNames("GunmetalTexture", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new KSG12())
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
			.withThirdPersonPositioning((player, itemStack) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.8F, 0.3F, 1.5F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})

			.withFirstPersonPositioning((player, itemStack) -> {
				GL11.glTranslatef(0.3F, -0.39F, -0.26F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningRecoiled((player, itemStack) -> {
				GL11.glTranslatef(0.3F, -0.39F, -0.26F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				GL11.glRotatef(-5F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-1F, 1f, 0f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.135F, -1.05f, 1.1f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.01f, 1f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Scope)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 5f);
				} 

				// HP Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.HP)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.02f, 0.3f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, -0.015f, 0.3f);
				} 
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.373F, -1.36f, 2.8f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonCustomPositioning(CommonProxy.KSGPump.getRenderablePart(), (player, itemStack) -> {
				})
				
			.withFirstPersonPositioningEjectSpentRound(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glTranslatef(0.3F, -0.39F, -0.26F);
						GL11.glRotatef(40F, 0f, 1f, 0f);
						GL11.glRotatef(10F, 0f, 0f, 1f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 50),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glTranslatef(0.3F, -0.39F, -0.26F);
						GL11.glRotatef(40F, 0f, 1f, 0f);
						GL11.glRotatef(10F, 0f, 0f, 1f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 50)
					
					)
					
			.withFirstPersonCustomPositioningEjectSpentRound(CommonProxy.KSGPump.getRenderablePart(),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glTranslatef(0F, 0F, 0.6F);
//						GL11.glRotatef(0F, 0f, 1f, 0f);
//						GL11.glRotatef(0F, 0f, 0f, 1f);
//						GL11.glScaled(0.55F, 0.55F, 0.55F);
						
					}, 250, 50),
					new Transition((player, itemStack) -> { // Reload position
//						GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//						GL11.glRotatef(40F, 0f, 1f, 0f);
//						GL11.glRotatef(10F, 0f, 0f, 1f);
//						GL11.glScaled(0.55F, 0.55F, 0.55F);
//						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 50)
					
					)
				
			.withFirstPersonPositioningReloading(
					
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.1F, -0.2F, -0.3F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 250, 50),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.1F, -0.2F, -0.3F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 250, 50)
			)
	
			.withFirstPersonCustomPositioningReloading(CommonProxy.KSGPump.getRenderablePart(),
				new Transition((player, itemStack) -> { // Reload position
				}, 250, 50),
				new Transition((player, itemStack) -> { // Reload position
				}, 250, 50)
				)
				
			.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.135F, -1.05f, 1.1f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.01f, 1f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Scope)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 5f);
				} 

				// HP Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.HP)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.02f, 0.3f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, -0.015f, 0.3f);
				} 
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.373F, -1.36f, 2.8f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((player, itemStack) -> {
				GL11.glScaled(0.8F, 0.8F, 0.8F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(0.5F, -0.35F, -1F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -1.5F);
			 })
			 
			 .withFirstPersonHandPositioning(
					 (player,  itemStack) -> {
						 GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.7f, -0.2f, 0.3f);
						 GL11.glRotatef(95f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (player,  itemStack) -> {
						 GL11.glScalef(2.2f, 2.2f, 2.2f);
						 GL11.glTranslatef(1f, 0.2f, 0.2f);
						 GL11.glRotatef(99f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 20f, 20f, -20f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 0.5f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 250, 50),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 0.5f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 250, 50)
					)
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50)
					)
					
			.withFirstPersonLeftHandPositioningEjectSpentRound(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.7f, -0.2f, 0.4f);
						 GL11.glRotatef(95f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
					}, 250, 50),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.7f, -0.2f, 0.3f);
						 GL11.glRotatef(95f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
					}, 250, 50)
					
					)
					
			.withFirstPersonRightHandPositioningEjectSpentRound(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50)
					
					)
					
			.build())
		.withSpawnEntityDamage(5f)
		.withSpawnEntityGravityVelocity(0.8f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = WorldHelper.getBlockAtPosition(world, position);
			if (WorldHelper.isGlassBlock(block)) {
				WorldHelper.destroyBlock(world, position);
			}
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}