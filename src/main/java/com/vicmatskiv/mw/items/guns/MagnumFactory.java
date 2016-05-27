package com.vicmatskiv.mw.items.guns;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.Magnum;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;

public class MagnumFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Magnum")
		.withAmmo(CommonProxy.MagnumAmmo)
		.withAmmoCapacity(6)
		.withFireRate(0.16f)
		.withRecoil(4f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("Magnum")
		//.withSilencedShootSound("M9silenced")
		.withReloadSound("MagnumReload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withCreativeTab(ModernWarfareMod.gunsTab)		
		.withCompatibleAttachment(CommonProxy.Laser, (model) -> {
			GL11.glTranslatef(0.01F, -0.95F, -2.3F);
			GL11.glScaled(1.1F, 1.1F, 1.1F);
			GL11.glRotatef(-90F, 0f, 0f, -4f);
		})
		.withTextureNames("Magnum", "Red", "Black", "Desert", "Green", "Blue", "Orange", "Purple", 
			"Cyan", "White", "Arctic")
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
				GL11.glTranslatef(0F, -0.2F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
					float reloadingProgress = Weapon.reloadingProgress(player, itemStack);
					if(itemStack.stackTagCompound != null && reloadingProgress > 0 && reloadingProgress < 0.2f) {
						// Reload
						GL11.glRotatef(-45F, 1f, 0f, 2f);
						GL11.glTranslatef(1F, -1.2F, 0.6F);
					} else if(itemStack.stackTagCompound != null && Weapon.isZoomed(itemStack) /*itemStack.stackTagCompound.getFloat(Weapon.ZOOM_TAG) != 1.0f*/) {
						// Zoom
						GL11.glTranslatef(0.23F, -1.19f, 1.5f);
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
						
					} else {
						// Regular
						GL11.glTranslatef(-1F, -0.75F, 1.3F);
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
		.withSpawnEntityDamage(13f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = world.getBlock(position.blockX, position.blockY, position.blockZ);
			if(block == Blocks.glass) {
				world.func_147480_a(position.blockX, position.blockY, position.blockZ, true);
			}
			
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}