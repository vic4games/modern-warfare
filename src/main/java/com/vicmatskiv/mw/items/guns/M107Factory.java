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
import com.vicmatskiv.mw.models.AS50;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.HP;
import com.vicmatskiv.mw.models.HP2;
import com.vicmatskiv.mw.models.LP;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M107;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;

public class M107Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M107")
		.withAmmo(CommonProxy.M107Mag)
		.withAmmoCapacity(10)
		.withFireRate(0.16f)
		.withRecoil(4f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("M107")
		.withSilencedShootSound("M107Silenced")
		.withReloadSound("AKReload")
		.withReloadingTime(43)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withCompatibleAttachment(CommonProxy.AKMIron, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.13F, -1.55F, -4.8F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(0.092F, -1.89F, -1.3F);
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
				GL11.glTranslatef(0.14F, -1.56F, -2F);
				GL11.glScaled(0.36F, 0.36F, 0.36F);
			} else if(model instanceof ScarIron1) {
				GL11.glTranslatef(0.176F, -1.56F, 0.9F);
				GL11.glScaled(0.19F, 0.19F, 0.19F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.55F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.ACOG, (model) -> {
			if(model instanceof ACOG) {
			GL11.glTranslatef(0.06F, -1.65F, 0.5F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Acog2) {
				GL11.glTranslatef(0.199F, -1.795F, 0.5F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Scope, (model) -> {
			if(model instanceof LP) {
			GL11.glTranslatef(0.055F, -1.625F, -0F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof LPscope) {
				GL11.glTranslatef(0.202F, -1.76F, 0.2F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(CommonProxy.HP, (model) -> {
			if(model instanceof HP) {
			GL11.glTranslatef(0.055F, -1.625F, -0F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof HP2) {
				GL11.glTranslatef(0.202F, -1.76F, 0.4F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Bipod, (model) -> {
			GL11.glTranslatef(.135F, -0.84F, -2.1F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(CommonProxy.Silencer, (model) -> {
			GL11.glTranslatef(0.107F, -1.48F, -5.8F);
			GL11.glScaled(1.3F, 1.3F, 1.3F);
		})
		.withTextureNames("M107", "Red", "Black", "Desert", "Green", "Blue", "Orange", "Purple", 
		"Cyan", "White", "Arctic", "Electric", "Redline", "M4Cyrex", "Fade", "IceAndFire", "Fade2", "GreenElectric", "Handgun",
		"Creativity", "Dragon", "ASMO", "Vulcan", "GreenVulcan", "Guardian")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M107())
			//.withTextureName("Dragonuv")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(0, 0.5f, 0);
			})
			.withThirdPersonPositioning((player, itemStack) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.8F, 0.3F, 1.5F);
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
				}, 250, 1200),
				
				new Transition((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
					
				GL11.glRotatef(-51F, 1f, 0f, -2f);
				GL11.glTranslatef(-1.2F, -1F, -0.5F);
				}, 250, 0)
				
				)
				
				.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.1377F, -1.1f, 0.5f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(-0.005F, 0.22f, 1.3f);
				}  
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Scope)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.18f, 99f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.HP)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.18f, 99f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.2f, 0.7f);
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
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -0.8F, -1.5F);
			 })
			.build())
		.withSpawnEntityDamage(37.8f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = world.getBlock(position.blockX, position.blockY, position.blockZ);
			if(block == Blocks.glass) {
				world.func_147480_a(position.blockX, position.blockY, position.blockZ, true);
			}
			
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}