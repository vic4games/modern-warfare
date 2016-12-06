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
import com.vicmatskiv.mw.models.HP;
import com.vicmatskiv.mw.models.HP2;
import com.vicmatskiv.mw.models.LP;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;

public class M14Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M14")
		.withAmmo(CommonProxy.M14Mag)
		.withAmmoCapacity(20)
		.withFireRate(0.16f)
		.withRecoil(2f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("M14")
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("StandardReload")
		.withReloadingTime(45)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.7f)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withCompatibleAttachment(CommonProxy.AKMIron, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
					GL11.glTranslatef(0.135F, -1.58F, 0.4F);
					GL11.glScaled(0.4F, 0.4F, 0.4F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(0.129F, -1.37F, -3.5F);
				GL11.glScaled(0.65F, 0.65F, 0.65F);
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
			} else if(model instanceof G36CIron1) {
				GL11.glTranslatef(0.159F, -1.43F, 0.35F);
				GL11.glScaled(0.2F, 0.2F, 0.2F);
			} else if(model instanceof G36CIron2) {
				GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron1) {
					GL11.glTranslatef(0.177F, -1.65F, 1.4F);
					GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron2) {
					GL11.glTranslatef(0.25F, -1.55F, -2F);
					GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Scope, (model) -> {
			if(model instanceof LP) {
			GL11.glTranslatef(0.055F, -1.43F, 0.6F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof LPscope) {
				GL11.glTranslatef(0.202F, -1.76F, 0.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.HP, (model) -> {
			if(model instanceof HP) {
				GL11.glTranslatef(0.055F, -1.43F, 0.6F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof HP2) {
				GL11.glTranslatef(0.202F, -1.76F, 0.4F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Bipod, (model) -> {
			GL11.glTranslatef(.135F, -0.7F, -2F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(CommonProxy.Silencer, (model) -> {
			GL11.glTranslatef(0.12F, -1.38F, -5.1F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("M14", "Red", "Black", "Desert", "Green", "Blue", "Orange", "Purple", 
				"Cyan", "White", "Arctic", "Electric", "Redline", "M4Cyrex", "AKFade", "IceAndFire", "Fade2", "GreenElectric", "Handgun",
				"Creativity", "Dragon", "ASMO", "Vulcan", "GreenVulcan", "Guardian")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M14())
			//.withTextureName("AK47")
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
				GL11.glScaled(0.65F, 0.65F, 0.65F);
				GL11.glTranslatef(-1.6F, 0.4F, 1.3F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((player, itemStack) -> {
				GL11.glTranslatef(0.25F, -0.36F, -0.18F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0F, -0.3F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 250, 1000),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0F, -0.3F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 250, 20),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 0)
			)
				
				.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.6F, 0.6F, 0.6F);

				// Zoom
				GL11.glTranslatef(0.055F, -0.96f, 1.2f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(-0.005F, 0.1315f, 0.5f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Scope)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.148f, 99f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.HP)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.148f, 99f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(-0.01F, 0.18f, 0.2f);
				} 
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(-0.01F, 0.06f, 0.8f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.369F, -1.23f, 3f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((player, itemStack) -> {
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(1F, -0.9F, -1.2F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -1.5F);
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
						GL11.glScalef(2.5f, 2.2f, 2.2f);
						 GL11.glTranslatef(0f, 0.5f, 0.8f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 20f, 20f, -20f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.2f, 2.2f);
						 GL11.glTranslatef(-0.1f, 0.2f, 0.8f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 20f, 20f, -20f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.8f, -0.15f, 0.25f);
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
						 GL11.glTranslatef(-0.1f, -0.25f, 0.6f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0))
			.build())
		.withSpawnEntityDamage(28f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = world.getBlockState(position.getBlockPos()).getBlock();
			if (block == Blocks.glass) {
				world.destroyBlock(position.getBlockPos(), true);
			}
			
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}