package com.vicmatskiv.mw.items.guns;



import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.ACOG;
import com.vicmatskiv.mw.models.AK12;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class AK12Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("AK12")
		.withAmmo(CommonProxy.AK47Mag)
		.withAmmoCapacity(30)
		.withFireRate(0.58f)
		.withRecoil(1.6f)
		.withZoom(0.9f)
		//.withMaxShots(5)
		.withShootSound("AK12")
		.withSilencedShootSound("AK12Silenced")
		.withReloadSound("AKReload")
		.withReloadingTime(45)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withCompatibleAttachment(CommonProxy.ACOG, (model) -> {
			if(model instanceof ACOG) {
			GL11.glTranslatef(-0.385F, -2.2F, -1.3F);
			GL11.glScaled(1.1F, 1.1F, 1.1F);
			} else if(model instanceof Acog2) {
				GL11.glTranslatef(-0.129F, -2.5F, -1F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
			if(model instanceof Reflex) {
			GL11.glTranslatef(-0.03F, -1.97F, -1.4F);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(-0.126F, -2.43F, -1.4F);
				GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
			if(model instanceof Holographic) {
				GL11.glTranslatef(-0.01F, -2F, -1.7F);
				GL11.glScaled(0.9F, 0.9F, 0.9F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(-0.12F, -2.445F, -1.5F);
				GL11.glScaled(0.07F, 0.07F, 0.07F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
			if(model instanceof Kobra) {
				GL11.glTranslatef(-0.01F, -2F, -1.7F);
				GL11.glScaled(0.9F, 0.9F, 0.9F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(-0.12F, -2.45F, -2.4F);
				GL11.glScaled(0.08F, 0.08F, 0.08F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Grip2, (model) -> {
			GL11.glTranslatef(-0.19F, -0.25F, -3.4F);
			GL11.glScaled(1.3F, 1.3F, 1.3F);
		})
		.withCompatibleAttachment(CommonProxy.Grip, (model) -> {
			GL11.glTranslatef(-0.19F, -0.12F, -3.8F);
			GL11.glScaled(1.3F, 1.3F, 1.3F);
		})
		.withCompatibleAttachment(CommonProxy.VGrip, (model) -> {
			GL11.glTranslatef(-0.19F, -0.25F, -3.4F);
			GL11.glScaled(1.3F, 1.3F, 1.3F);
		})
		.withCompatibleAttachment(CommonProxy.Bipod, (model) -> {
			GL11.glTranslatef(-0.19F, -0.25F, -3.4F);
			GL11.glScaled(1.3F, 1.3F, 1.3F);
		})
		.withCompatibleAttachment(CommonProxy.Laser2, (model) -> {
			GL11.glTranslatef(-0.03F, -1.6F, -3.9F);
			GL11.glScaled(1.4F, 1.4F, 1.4F);
		})
		.withCompatibleAttachment(CommonProxy.Laser, (model) -> {
			GL11.glTranslatef(-0.03F, -1.6F, -3.9F);
			GL11.glScaled(1.4F, 1.4F, 1.4F);
		})
		.withCompatibleAttachment(CommonProxy.Silencer, (model) -> {
			GL11.glTranslatef(-0.2F, -1.66F, -8.96F);
			GL11.glScaled(1.3F, 1.3F, 1.3F);
		})
		.withTextureNames("AK12", "Red", "Black", "Desert", "Green", "Blue", "Orange", "Purple", 
				"Cyan", "White", "Arctic", "Electric", "Redline", "M4Cyrex", "Fade", "IceAndFire", "Fade2", "GreenElectric", "Handgun",
				"Creativity", "Dragon", "ASMO4", "Vulcan", "GreenVulcan", "Guardian")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new AK12())
			//.withTextureName("AK12")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.25F, 0.25F, 0.25F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.3F, 0.3F, 0.3F);
				GL11.glTranslatef(0, 0.5f, 2f);
			})
			.withThirdPersonPositioning((player, itemStack) -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(-2.8F, -1.1F, 2.9F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
			
			.withFirstPersonPositioning((player, itemStack) ->{
				GL11.glTranslatef(-0.3F, 0F, 0.1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				float reloadingProgress = Weapon.reloadingProgress(player, itemStack);
				if(itemStack.stackTagCompound != null && reloadingProgress > 0 && reloadingProgress < 0.2f) {
					// Reload
					GL11.glRotatef(-45F, 1f, 0f, 2f);
					GL11.glTranslatef(1F, -1.2F, 0.6F);
				} else {
					// Regular
					GL11.glTranslatef(-0.1F, -0.8F, 1.3F);
				}
				})
			
			.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(-0.3F, 0F, 0.1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				

				// Zoom
				GL11.glTranslatef(1.26F, -1.68f, 2.03f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.01F, 0.4f, 0.7f);
				} 

				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.4f, 0.8f);
				} 


				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.35f, 1f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Kobra)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.37F, -0.98f, 3.5f);
				} 

				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
			})
			
			.withFirstPersonPositioningRunning((player, itemStack) -> {
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(0F, 0F, 0.5F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				GL11.glScaled(0.45F, 0.45F, 0.45F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(0.5F, -1F, -0.2F);
			 })
			.build())
		.withSpawnEntityDamage(7.5f)
	//	.withSpawnEntityModel(new Bullet())
	//	.withSpawnEntityModelTexture("Bullet")
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = world.getBlock(position.blockX, position.blockY, position.blockZ);
			if(block == Blocks.glass) {
				world.func_147480_a(position.blockX, position.blockY, position.blockZ, true);
			}
			
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
        }

}
