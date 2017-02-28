package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.P2000;
import com.vicmatskiv.weaponlib.Tags;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WorldHelper;
import com.vicmatskiv.weaponlib.animation.Transition;

public class P30Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("HK P30")
//		.withAmmo(CommonProxy.M9Mag)
//		.withAmmoCapacity(10)
		.withFireRate(0.6f)
		.withRecoil(6f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("P30")
		.withSilencedShootSound("silencer")
		.withReloadSound("PistolReload")
		.withUnloadSound("Unload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withInaccuracy(3)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withInformationProvider(stack -> Arrays.asList("Type: Pistol", "Damage: 8", 
		"Caliber: 9mm", "Magazines:", "15rnd 9mm Magazine",
		"Fire Rate: Semi"))
		.withCompatibleAttachment(CommonProxy.P30Top, true, (model) -> {
//			GL11.glTranslatef(0.1F, -0.5F, -1F);
//			GL11.glRotatef(45F, 0f, 1f, 0f);
//			GL11.glScaled(0.55F, 0.55F, 0.55F);
		})
		.withCompatibleAttachment(CommonProxy.M9BerettaMag, (model) -> {
			GL11.glTranslatef(0F, 0.1F, 0.1F);
			})
		.withCompatibleAttachment(CommonProxy.Laser, (model) -> {
			GL11.glTranslatef(0.01F, -0.7F, -2.2F);
			GL11.glScaled(1.1F, 1.1F, 1.1F);
			GL11.glRotatef(-90F, 0f, 0f, -4f);
		})
		.withCompatibleAttachment(CommonProxy.Silencer9mm, (model) -> {
			GL11.glTranslatef(-0.25F, -1.15F, -4.61F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
		.withTextureNames("GunmetalTexture", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new P2000())
			//.withTextureName("G18")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.4F, 0.4F, 0.4F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(0, 0.8f, 0);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((player, itemStack) -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(-1.8F, -1F, 2F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((player, itemStack) -> {
				GL11.glTranslatef(0.1F, -0.5F, -1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				})
				
			.withFirstPersonPositioningRecoiled((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.6F, -1.1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-10F, 1f, 0f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(CommonProxy.P30Top.getRenderablePart(), (player, itemStack) -> {
				GL11.glTranslatef(0F, 0F, 0.5F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
				
			.withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.P30Top.getRenderablePart(), (player, itemStack) -> {
				GL11.glTranslatef(0F, 0F, 0.5F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(CommonProxy.M9BerettaMag, (player, itemStack) -> {})
			
			.withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.M9BerettaMag, (player, itemStack) -> {})
				
			.withFirstPersonPositioningZoomingRecoiled((player, itemStack) -> {
				GL11.glTranslatef(-0.3F, -0.4F, -0.5F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-4F, 1f, 0f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.31F, -1.34f, 1.5f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
			/*	// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, ModernWarfareMod.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.3f, 1f);
				} */
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.5f, 0.7f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.38F, -1.115f, 3.2f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			//.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
				
			.withFirstPersonCustomPositioning(CommonProxy.M9BerettaMag, (player, itemStack) -> {})
			
			.withFirstPersonCustomPositioning(CommonProxy.P30Top.getRenderablePart(), (player, itemStack) -> {
				if(Tags.getAmmo(itemStack) == 0) {
					GL11.glTranslatef(0F, 0F, 0.5F);
				}
			})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glTranslatef(-0.6F, -0.6F, -0.6F);
						GL11.glRotatef(0F, 0f, 1f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
					
						GL11.glRotatef(-60F, 1f, 0f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glTranslatef(1F, -1.2F, 0F);
					}, 250, 500),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glTranslatef(-0.4F, -0.2F, -0.3F);
						GL11.glRotatef(0F, 0f, 1f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
					
						GL11.glRotatef(-30F, 1f, 0f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glTranslatef(1F, -1.2F, 0F);
					}, 250, 1000),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(-0.4F, -0.2F, -0.3F);
					GL11.glRotatef(0F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-30F, 1f, 0f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 50, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(-0.6F, -0.6F, -0.6F);
					GL11.glRotatef(0F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-60F, 1f, 0f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 150, 50),
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(-0.6F, -0.6F, -0.6F);
					GL11.glRotatef(0F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-60F, 1f, 0f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(CommonProxy.M9BerettaMag,
				new Transition((player, itemStack) -> {
//					GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//					GL11.glRotatef(-20F, 1f, 0f, 0f);
////					GL11.glScaled(0.55F, 0.55F, 0.55F);
////					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(0.05F, 1.3F, 0.4F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.M9BerettaMag,
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(0.05F, 1.3F, 0.4F);
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
				}, 250, 1000)
					)
					
					
			.withFirstPersonCustomPositioningUnloading(CommonProxy.P30Top.getRenderablePart(),
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.P30Top.getRenderablePart(),
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((player, itemStack) -> {
//					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(45F, 0f, 1f, 0f);
//				    GL11.glScaled(0.55F, 0.55F, 0.55F);
//				    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
				
				.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(-0.235F, -0.3F, -0.44F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.31F, -1.34f, 1.5f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
			/*	// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, ModernWarfareMod.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.3f, 1f);
				} */
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.5f, 0.7f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.38F, -1.115f, 3.2f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((player, itemStack) -> {
				GL11.glTranslatef(0.1F, -1.5F, -1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-50F, 1f, 0f, 0f);
				GL11.glRotatef(0F, 0f, 0f, 1f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				 GL11.glScaled(1.2F, 1.2F, 1.2F);
					GL11.glRotatef(-35F, 2f, 1f, 1f);
					GL11.glTranslatef(-1F, 0.1F, 0F);
			 })
			  .withFirstPersonHandPositioning(
					 (player,  itemStack) -> {
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.6f, -0.1f, 0.4f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (player,  itemStack) -> {
						 GL11.glScalef(1.6f, 1.6f, 1.6f);
						 GL11.glTranslatef(1.5f, 0.1f, -0.2f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-10f, 1f, 0f, 0f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.1f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.9f, 0.8f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 20f, 20f, -20f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.5f, 0.5f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 1f, 0f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.5f, 0.5f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 1f, 0f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.8f, 0.1f, 0.6f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 1f, 0f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.8f, 0.1f, 0.6f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 1f, 0f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50))
					
			.withFirstPersonHandPositioningZooming(
					(player,  itemStack) -> {
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.4f, -0.1f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 1f, 0f, 0f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.34f, 0.48f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-120f, 1f, 0f, 0f);
						 GL11.glRotatef(10f, 0f, 0f, 1f);
					 })
			.build())
		.withSpawnEntityDamage(8f)
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
