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
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Remington;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;

public class Remington900Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Remington870")
		.withAmmo(CommonProxy.Remington870Mag)
		.withAmmoCapacity(4)
		.withFireRate(0.1f)
		.withRecoil(9f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withPumpTimeout(1400)
		.withShootSound("Remington")
		//.withSilencedShootSound("AR15silenced")
		.withReloadSound("RemingtonReload")
		.withReloadingTime(40)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")	
		.withCrosshairZoomed("Sight")
		.withCreativeTab(ModernWarfareMod.gunsTab)
		 .withCompatibleAttachment(CommonProxy.AKMIron, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.14F, -1.566F, 0.3F);
				GL11.glScaled(0f, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.13F, -1.39F, -2.8F);
				GL11.glScaled(0.65F, 0.65F, 0.65F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(0.13F, -1.55F, -3.05F);
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
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.14F, -1.566F, 0.3F);
				GL11.glScaled(0.37F, 0.37F, 0.37F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Laser2, (model) -> {
			GL11.glTranslatef(.24F, -1.2F, -0.8F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
		})
		.withTextureNames("Remington", "Red", "Black", "Desert", "Green", "Blue", "Orange", "Purple", 
				"Cyan", "White", "Arctic", "Electric", "Redline", "M4Cyrex", "Fade", "IceAndFire", "Fade2", "GreenElectric", "Handgun",
				"Creativity", "Dragon", "ASMO", "Vulcan", "GreenVulcan", "Guardian")
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
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(0,  0.5f, 0);
			})
			.withThirdPersonPositioning((player, itemStack) -> {
				GL11.glScaled(0.8F, 0.8F, 0.8F);
				GL11.glTranslatef(-1.6F, 0.5F, 1.3F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.5F, -0.6F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
				new Transition((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				GL11.glRotatef(-45F, 1f, 0f, 2f);
				GL11.glTranslatef(1F, -1.2F, 0.1F);
				}, 250, 1200)
				
				)
				
				.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
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
				GL11.glTranslatef(1F, -1F, -1.2F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -1F);
			 })
			.build())
		.withSpawnEntityDamage(30f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = world.getBlock(position.blockX, position.blockY, position.blockZ);
			if(block == Blocks.glass) {
				world.func_147480_a(position.blockX, position.blockY, position.blockZ, true);
			}
			
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}