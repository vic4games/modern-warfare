package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Magnum;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WorldHelper;
import com.vicmatskiv.weaponlib.animation.Transition;

public class MagnumFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Magnum")
//		.withAmmo(CommonProxy.MagnumAmmo)
		.withAmmoCapacity(6)
		.withFireRate(0.2f)
		.withRecoil(5f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("Magnum")
		//.withSilencedShootSound("M9silenced")
		.withReloadSound("MagnumReload")
		.withReloadingTime(25)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withInaccuracy(4)
		.withCreativeTab(ModernWarfareMod.gunsTab)	
		.withInformationProvider(stack -> Arrays.asList("Type: Revolver", "Damage: 9", 
		"Ammo: .44 Bullet", "Fire Rate: Semi"))
		.withCompatibleAttachment(CommonProxy.RevolverCase, true, (model) -> {
		})
		.withCompatibleBullet(CommonProxy.Magnum44Ammo, (model) -> {})
		.withTextureNames("Magnum", "MagnumGold")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new Magnum())
			//.withTextureName("XEagle")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(-0.9F, 0.6f, 0.5F);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.45F, 0.45F, 0.45F);
				GL11.glTranslatef(-2F, -1.1F, 2.2F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glTranslatef(0.1F, -0.5F, -1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
				GL11.glTranslatef(0.1F, -0.5F, -1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				GL11.glRotatef(-10F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningCustomRecoiled(CommonProxy.RevolverCase.getRenderablePart(), (renderContext) -> {
//				GL11.glTranslatef(0F, 0F, 0F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
				
			.withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.RevolverCase.getRenderablePart(), (renderContext) -> {
//				GL11.glTranslatef(0F, 0F, 0F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glTranslatef(-0.4F, -0.3F, -0.6F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-5F, 1f, 0f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);

				// Zoom
				GL11.glTranslatef(0.23F, -1.19f, 1.3f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
			/*	// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), ModernWarfareMod.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.3f, 1f);
				} */
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(-0.01F, 0.44f, 0.6f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.37F, -1.226f, 3.2f);
				}
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonCustomPositioning(CommonProxy.RevolverCase.getRenderablePart(), (renderContext) -> {
				})
				
			.withFirstPersonPositioningReloading(
					
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(-0.1F, -0.1F, -0.9F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(5F, 1f, 0f, 0f);
					GL11.glRotatef(15F, 0f, 0f, 1f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-1.1F, -0.76F, 1.5F);

				}, 250, 100),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(-0.1F, -0.1F, -0.9F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(5F, 1f, 0f, 0f);
					GL11.glRotatef(15F, 0f, 0f, 1f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-1.1F, -0.76F, 1.5F);

				}, 250, 100)
			) 
			
			.withFirstPersonCustomPositioningReloading(CommonProxy.RevolverCase.getRenderablePart(),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(-0.6F, 0.8F, -1.3F);
//					GL11.glRotatef(45F, 0f, 1f, 0f);
//					GL11.glRotatef(5F, 1f, 0f, 0f);
					GL11.glRotatef(60F, 0f, 0f, 1f);
					GL11.glScaled(0.9F, 0.9F, 0.9F);
					GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				}, 250, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(-0.6F, 0.8F, -1.3F);
//					GL11.glRotatef(45F, 0f, 1f, 0f);
//					GL11.glRotatef(5F, 1f, 0f, 0f);
					GL11.glRotatef(60F, 0f, 0f, 1f);
					GL11.glScaled(0.9F, 0.9F, 0.9F);
					GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				}, 250, 50)
				)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glTranslatef(-0.4F, -0.195F, -0.6F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);

				// Zoom
				GL11.glTranslatef(0.23F, -1.19f, 1.5f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
			/*	// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), ModernWarfareMod.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.3f, 1f);
				} */
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(-0.01F, 0.44f, 0.6f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.37F, -1.226f, 3.2f);
				}
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glTranslatef(0.1F, -1.5F, -1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-50F, 1f, 0f, 0f);
				GL11.glRotatef(0F, 0f, 0f, 1f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
				 GL11.glScaled(1.2F, 1.2F, 1.2F);
					GL11.glRotatef(-35F, 2f, 1f, 1f);
					GL11.glTranslatef(-1F, 0.1F, 0F);
			 })
			 .withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.6f, -0.1f, 0.4f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
						 GL11.glScalef(1.6f, 1.6f, 1.6f);
						 GL11.glTranslatef(1.5f, 0.1f, -0.2f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-10f, 1f, 0f, 0f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.1f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.65f, 0.3f, 0.4f);
						 GL11.glRotatef(130f, 0, 0f, 1f);
						 GL11.glRotatef(-4f, 1f, 0f, 0f);
						 GL11.glRotatef(70f, 0f, 1f, 0f);
					}, 50, 100),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.65f, 0.3f, 0.4f);
						 GL11.glRotatef(130f, 0, 0f, 1f);
						 GL11.glRotatef(-10f, 1f, 0f, 0f);
						 GL11.glRotatef(70f, 0f, 1f, 0f);
					}, 50, 200))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 100),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 200))
					
			.withFirstPersonHandPositioningZooming(
					(renderContext) -> {
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.4f, -0.1f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 1f, 0f, 0f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.34f, 0.48f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-120f, 1f, 0f, 0f);
						 GL11.glRotatef(10f, 0f, 0f, 1f);
					 })
					
			.build())
		.withSpawnEntityDamage(9f)
		.withSpawnEntityGravityVelocity(0.016f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = WorldHelper.getBlockAtPosition(world, position);
			if (WorldHelper.isGlassBlock(block)) {
				WorldHelper.destroyBlock(world, position);
			}
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}