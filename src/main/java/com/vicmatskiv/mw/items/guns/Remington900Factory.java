package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Remington;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WorldHelper;
import com.vicmatskiv.weaponlib.animation.Transition;

public class Remington900Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Remington870")
//		.withAmmo(CommonProxy.Remington870Mag)
		.withAmmoCapacity(4)
		.withMaxBulletsPerReload(4)
		.withFireRate(0.5f)
		.withEjectRoundRequired()
		.withEjectSpentRoundSound("KSG12Pump")
		.withPumpTimeout(1000)
		.withFireRate(0.1f)
		.withRecoil(9f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withPumpTimeout(1000)
		.withShootSound("M1014")
		.withSilencedShootSound("ShotgunSilenced")
		.withReloadSound("ShotgunReload")
		.withReloadingTime(15)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")	
		.withCrosshairZoomed("Sight")
		.withInaccuracy(10)
		.withPellets(10)
		.withFlashIntensity(1f)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withInformationProvider(stack -> Arrays.asList("Type: Shotgun", "Damage per Pellet: 5", "Pellets per Shot: 10", 
		"Ammo: 12 Gauge Shotgun Shell", "Fire Rate: Pump-Action"))
		.withCompatibleAttachment(CommonProxy.R870Pump, true, (model) -> {
		})
		.withCompatibleAttachment(CommonProxy.Silencer12Gauge, (model) -> {
			GL11.glTranslatef(0.107F, -1.4F, -5.75F);
			GL11.glScaled(1.1F, 1.1F, 1.1F);
		})
		.withCompatibleBullet(CommonProxy.ShotgunShell, (model) -> {})
		.withTextureNames("Remington", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new Remington())
			//.withTextureName("Remington900")
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
				GL11.glScaled(0.8F, 0.8F, 0.8F);
				GL11.glTranslatef(-1.6F, 0.5F, 1.3F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((player, itemStack) -> {
				GL11.glTranslatef(0.55F, -0.42F, -0.1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningRecoiled((player, itemStack) -> {
				GL11.glTranslatef(0.55F, -0.42F, -0.1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				GL11.glRotatef(-5F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((player, itemStack) -> {
				GL11.glTranslatef(-0.07F, -0.313F, -0.27F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glRotatef(-1F, 1f, 0f, 0f);

				// Zoom
				GL11.glTranslatef(0.055F, -0.95f, 1.4f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.37F, -1.4f, 3.4f);
				} 
				// Holo Zoom
				/*if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.1f, 3f);
				} */
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonCustomPositioning(CommonProxy.R870Pump.getRenderablePart(), (player, itemStack) -> {
				})
				
			.withFirstPersonPositioningEjectSpentRound(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glTranslatef(0.4F, -0.4F, 0F);
						GL11.glRotatef(40F, 0f, 1f, 0f);
						GL11.glRotatef(20F, 0f, 0f, 1f);
						GL11.glRotatef(5F, 1f, 0f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 50),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glTranslatef(0.4F, -0.4F, 0F);
						GL11.glRotatef(40F, 0f, 1f, 0f);
						GL11.glRotatef(20F, 0f, 0f, 1f);
						GL11.glRotatef(5F, 1f, 0f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 50)
					
					)
					
			.withFirstPersonCustomPositioningEjectSpentRound(CommonProxy.R870Pump.getRenderablePart(),
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
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.R870Pump.getRenderablePart(),
				new Transition((player, itemStack) -> { // Reload position
				}, 250, 50),
				new Transition((player, itemStack) -> { // Reload position
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
				
			.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(-0.07F, -0.313F, -0.27F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);

				// Zoom
				GL11.glTranslatef(0.055F, -0.95f, 1.4f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.37F, -1.4f, 3.4f);
				} 
				// Holo Zoom
				/*if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.1f, 3f);
				} */
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((player, itemStack) -> {
				GL11.glScaled(1F, 1F, 1F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(0.3F, -0.05F, -1F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -1F);
			 }) 
			.withFirstPersonHandPositioning(
					 (player,  itemStack) -> {
						 GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.7f, -0.25f, 0.2f);
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
						 GL11.glTranslatef(-0.15f, -0.1f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, -0.1f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50)
					)
					
			.withFirstPersonLeftHandPositioningEjectSpentRound(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.7f, -0.25f, 0.3f);
						 GL11.glRotatef(95f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
					}, 250, 50),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.7f, -0.25f, 0.2f);
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