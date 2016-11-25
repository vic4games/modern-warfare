package com.vicmatskiv.mw.items.guns;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
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
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MP7;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;

public class MP7Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("MP7")
		.withAmmo(CommonProxy.MP7Mag)
		.withAmmoCapacity(20)
		.withFireRate(0.61f)
		.withRecoil(3.3f)
		.withZoom(0.9f)
		//.withMaxShots(5)
		.withShootSound("MP7")
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("StandardReload")
		.withReloadingTime(37)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withCompatibleAttachment(CommonProxy.ACOG, (model) -> {
			if(model instanceof ACOG) {
				GL11.glTranslatef(0.033F, -1.7F, 0.9F);
				GL11.glScaled(0.7F, 0.7F, 0.7F);
			} else if(model instanceof Acog2) {
				GL11.glTranslatef(0.197F, -1.877F, 0.7F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
			if(model instanceof Reflex) {
			GL11.glTranslatef(.27F, -1.48F, 0.2F);
			GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(0.202F, -1.8F, 0.2F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
			if(model instanceof Holographic) {
			GL11.glTranslatef(.264F, -1.53F, 0.6F);
			GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(0.202F, -1.76F, 0.6F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
			if(model instanceof Kobra) {
			GL11.glTranslatef(.264F, -1.53F, 0.6F);
			GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(0.202F, -1.73F, 0.2F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Laser2, (model) -> {
			GL11.glTranslatef(.3F, -1.2F, -0.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(CommonProxy.Laser, (model) -> {
			GL11.glTranslatef(.3F, -1.2F, -0.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(CommonProxy.Silencer, (model) -> {
			GL11.glTranslatef(0.107F, -1.26F, -2.6F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("AK12", "Red", "Black", "Desert", "Green", "Blue", "Orange", "Purple", 
				"Cyan", "White", "Arctic", "Electric", "Redline", "M4Cyrex", "Fade", "IceAndFire", "Fade2", "GreenElectric", "Handgun",
				"Creativity", "Dragon", "ASMO4", "Vulcan", "GreenVulcan", "Guardian")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new MP7())
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
				GL11.glTranslatef(0F, -0.35F, -0.5F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
				})
			
			.withFirstPersonPositioningReloading(
					
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(-0.3F, -0.3F, -0.8F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 250, 1000),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(-0.3F, -0.3F, -0.8F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 250, 20),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0F, -0.35F, -0.5F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
				}, 250, 0)
			)
				
				.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(-0.2F, -0.285F, -0.4F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.135F, -1.1f, 1.1f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, 0.26f, 0.7f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.22f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.14f, 0.7f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Kobra)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.19f, 3.2f);
				}
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonPositioningRunning((player, itemStack) -> {
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(1F, -0.7F, -1.2F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -1.5F);
			 })
			  .withFirstPersonHandPositioning(
					 (player,  itemStack) -> {
						 GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.8f, -0.1f, 0.4f);
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
						 GL11.glTranslatef(0f, 0.5f, 1.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 20f, 20f, -20f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.2f, 2.2f);
						 GL11.glTranslatef(-0.1f, 0.2f, 1.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 20f, 20f, -20f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 6f);
						 GL11.glTranslatef(0.8f, -0.14f, 0.4f);
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
					}, 250, 0))
			.build())
		.withSpawnEntityDamage(8f)
		.withSpawnEntityGravityVelocity(0.028f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = world.getBlockState(position.getBlockPos()).getBlock();
			if (block == Blocks.glass) {
				world.destroyBlock(position.getBlockPos(), true);
			}
			
		 })
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}