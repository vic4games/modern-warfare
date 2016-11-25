package com.vicmatskiv.mw.items.guns;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M1014;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Remington;
import com.vicmatskiv.mw.models.SPAS12;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;

public class SPAS12Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("SPAS-12")
		.withAmmo(CommonProxy.Remington870Mag)
		.withAmmoCapacity(8)
		.withFireRate(0.1f)
		.withRecoil(9f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withPumpTimeout(1100)
		.withShootSound("M1014")
		//.withSilencedShootSound("AR15silenced")
		.withReloadSound("SPAS12Reload")
		.withReloadingTime(130)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")	
		.withCrosshairZoomed("Sight")
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withTextureNames("SPAS12", "Red", "Black", "Desert", "Green", "Blue", "Orange", "Purple", 
				"Cyan", "White", "Arctic", "Electric", "Redline", "M4Cyrex", "Fade", "IceAndFire", "Fade2", "GreenElectric", "Handgun",
				"Creativity", "Dragon", "ASMO", "Vulcan", "GreenVulcan", "Guardian")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new SPAS12())
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
				GL11.glTranslatef(0.4F, -0.4F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
				new Transition((player, itemStack) -> {
				GL11.glTranslatef(0.5F, -0.1F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				GL11.glRotatef(-45F, 1f, 0f, 2f);
				GL11.glTranslatef(1F, -1.2F, 0.1F);
				}, 250, 50), 
				new Transition((player, itemStack) -> {
					GL11.glTranslatef(0.5F, -0.1F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0.1F);
					}, 250, 50), 
					new Transition((player, itemStack) -> {
						GL11.glTranslatef(0.5F, -0.1F, -0.2F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						
						GL11.glRotatef(-45F, 1f, 0f, 2f);
						GL11.glTranslatef(1F, -1.2F, 0.1F);
						}, 250, 50), 
						new Transition((player, itemStack) -> {
							GL11.glTranslatef(0.5F, -0.1F, -0.2F);
							GL11.glRotatef(45F, 0f, 1f, 0f);
							GL11.glScaled(0.55F, 0.55F, 0.55F);
							
							GL11.glRotatef(-45F, 1f, 0f, 2f);
							GL11.glTranslatef(1F, -1.2F, 0.1F);
							}, 250, 50), 
							new Transition((player, itemStack) -> {
								GL11.glTranslatef(0.5F, -0.1F, -0.2F);
								GL11.glRotatef(45F, 0f, 1f, 0f);
								GL11.glScaled(0.55F, 0.55F, 0.55F);
								
								GL11.glRotatef(-45F, 1f, 0f, 2f);
								GL11.glTranslatef(1F, -1.2F, 0.1F);
								}, 250, 50), 
								new Transition((player, itemStack) -> {
									GL11.glTranslatef(0.5F, -0.1F, -0.2F);
									GL11.glRotatef(45F, 0f, 1f, 0f);
									GL11.glScaled(0.55F, 0.55F, 0.55F);
									
									GL11.glRotatef(-45F, 1f, 0f, 2f);
									GL11.glTranslatef(1F, -1.2F, 0.1F);
									}, 250, 50), 
									new Transition((player, itemStack) -> {
										GL11.glTranslatef(0.5F, -0.1F, -0.2F);
										GL11.glRotatef(45F, 0f, 1f, 0f);
										GL11.glScaled(0.55F, 0.55F, 0.55F);
										
										GL11.glRotatef(-45F, 1f, 0f, 2f);
										GL11.glTranslatef(1F, -1.2F, 0.1F);
										}, 250, 50), 
										new Transition((player, itemStack) -> {
											GL11.glTranslatef(0.5F, -0.1F, -0.2F);
											GL11.glRotatef(45F, 0f, 1f, 0f);
											GL11.glScaled(0.55F, 0.55F, 0.55F);
											
											GL11.glRotatef(-45F, 1f, 0f, 2f);
											GL11.glTranslatef(1F, -1.2F, 0.1F);
											}, 250, 50), 
											new Transition((player, itemStack) -> {
												GL11.glTranslatef(0.5F, -0.1F, -0.2F);
												GL11.glRotatef(45F, 0f, 1f, 0f);
												GL11.glScaled(0.55F, 0.55F, 0.55F);
												
												GL11.glRotatef(-45F, 1f, 0f, 2f);
												GL11.glTranslatef(1F, -1.2F, 0.1F);
												}, 250, 50), 
												new Transition((player, itemStack) -> {
													GL11.glTranslatef(0.5F, -0.1F, -0.2F);
													GL11.glRotatef(45F, 0f, 1f, 0f);
													GL11.glScaled(0.55F, 0.55F, 0.55F);
													
													GL11.glRotatef(-45F, 1f, 0f, 2f);
													GL11.glTranslatef(1F, -1.2F, 0.1F);
													}, 250, 50), 
													new Transition((player, itemStack) -> {
														GL11.glTranslatef(0.5F, -0.1F, -0.2F);
														GL11.glRotatef(45F, 0f, 1f, 0f);
														GL11.glScaled(0.55F, 0.55F, 0.55F);
														
														GL11.glRotatef(-45F, 1f, 0f, 2f);
														GL11.glTranslatef(1F, -1.2F, 0.1F);
														}, 250, 50), 
														new Transition((player, itemStack) -> {
															GL11.glTranslatef(0.5F, -0.1F, -0.2F);
															GL11.glRotatef(45F, 0f, 1f, 0f);
															GL11.glScaled(0.55F, 0.55F, 0.55F);
															
															GL11.glRotatef(-45F, 1f, 0f, 2f);
															GL11.glTranslatef(1F, -1.2F, 0.1F);
															}, 250, 50), 
															new Transition((player, itemStack) -> {
																GL11.glTranslatef(0.5F, -0.1F, -0.2F);
																GL11.glRotatef(45F, 0f, 1f, 0f);
																GL11.glScaled(0.55F, 0.55F, 0.55F);
																
																GL11.glRotatef(-45F, 1f, 0f, 2f);
																GL11.glTranslatef(1F, -1.2F, 0.1F);
																}, 250, 50)
				
				)
				
				.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(-0.21F, -0.313F, -0.41F);
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
				GL11.glScaled(0.8F, 0.8F, 0.8F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(1F, -0.5F, -1.2F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -1F);
			 })
			 .withFirstPersonHandPositioning(
					 (player,  itemStack) -> {
						 GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.8f, -0.15f, 0.25f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (player,  itemStack) -> {
						 GL11.glScalef(2.5f, 2.2f, 2.2f);
						 GL11.glTranslatef(0.7f, 0.3f, 0.1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 20f, 20f, -20f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 .withFirstPersonLeftHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0.1f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0.1f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0.1f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0.1f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0.1f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0.1f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.85f, 0.1f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(0.1f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000))
			.build())
		.withSpawnEntityDamage(30f)
		.withSpawnEntityGravityVelocity(0.8f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = world.getBlockState(position.getBlockPos()).getBlock();
			if (block == Blocks.glass) {
				world.destroyBlock(position.getBlockPos(), true);
			}
			
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}