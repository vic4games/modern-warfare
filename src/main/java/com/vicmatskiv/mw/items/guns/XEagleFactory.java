package com.vicmatskiv.mw.items.guns;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Deagle;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;

public class XEagleFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Deagle")
		.withAmmo(CommonProxy.M9Mag)
		.withAmmoCapacity(10)
		.withFireRate(0.15f)
		.withRecoil(4f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("Deagle")
		.withSilencedShootSound("DeagleSilenced")
		.withReloadSound("PistolReload")
		.withReloadingTime(40)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withCreativeTab(ModernWarfareMod.gunsTab)		
		.withCompatibleAttachment(CommonProxy.Laser, (model) -> {
			GL11.glTranslatef(0.01F, -0.7F, -2F);
			GL11.glScaled(1.1F, 1.1F, 1.1F);
			GL11.glRotatef(-90F, 0f, 0f, -4f);
		})
		.withCompatibleAttachment(CommonProxy.Silencer, (model) -> {
			GL11.glTranslatef(-0.25F, -1.18F, -4.51F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
		.withTextureNames("Deagle", "Red", "Black", "DeagleGold", "Green", "Blue", "Orange", "Purple", 
			"Cyan", "White", "Arctic", "ASMO", "Vulcan", "GreenVulcan", "Guardian")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new Deagle())
			//.withTextureName("XEagle")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(0f, 0f, 1f);
			})
			.withThirdPersonPositioning((player, itemStack) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.6F, -1F, 1.7F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1F, -0.73F, 1.5F);
				})
				
			.withFirstPersonPositioningReloading(
					
				new Transition((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				GL11.glRotatef(-45F, 1f, 0f, 3f);
				GL11.glTranslatef(0.4F, -1.7F, 0.6F);
				}, 250, 1000),
				
				new Transition((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
					
				//GL11.glRotatef(45F, 1f, 0f, 0f);
				GL11.glTranslatef(-0.3F, -1.2F, 0.8F);
				}, 250, 0)
				)
				
				.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.2F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);

				// Zoom
				GL11.glTranslatef(0.23F, -1.27f, 1.3f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
			/*	// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, ModernWarfareMod.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.3f, 1f);
				} */
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(-0.01F, 0.44f, 0.6f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.37F, -1.226f, 3.2f);
				}
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((player, itemStack) -> {
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(1F, -1F, -1.2F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				 GL11.glScaled(1.2F, 1.2F, 1.2F);
					GL11.glRotatef(-35F, 2f, 1f, 1f);
					GL11.glTranslatef(-1F, 0.1F, 0F);
			 })
			.build())
		.withSpawnEntityDamage(13.5f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = world.getBlock(position.blockX, position.blockY, position.blockZ);
			if(block == Blocks.glass) {
				world.func_147480_a(position.blockX, position.blockY, position.blockZ, true);
			}
			
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}