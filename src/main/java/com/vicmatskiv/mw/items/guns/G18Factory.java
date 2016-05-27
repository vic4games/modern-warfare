package com.vicmatskiv.mw.items.guns;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.G18;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;

public class G18Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Glock18")
		.withAmmo(CommonProxy.G18Mag)
		.withAmmoCapacity(20)
		.withFireRate(0.6f)
		.withRecoil(1.5f)
		.withZoom(0.9f)
		//.withMaxShots(5)
		.withShootSound("G18")
		.withSilencedShootSound("G18silenced")
		.withReloadSound("PistolReload")
		.withReloadingTime(40)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withCreativeTab(ModernWarfareMod.gunsTab)
		/*.withCompatibleAttachment(ModernWarfareMod.ACOG, (model) -> {
			GL11.glTranslatef(0.107F, -1.625F, -0F);
			GL11.glScaled(0.4F, 0.4F, 0.4F);
			})*/
		.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
			if(model instanceof Reflex) {
			GL11.glTranslatef(-0.02F, -1.06F, -1.3F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		} else if(model instanceof Reflex2) {
			GL11.glTranslatef(-0.11F, -1.59F, -1.2F);
			GL11.glScaled(0.12F, 0.12F, 0.12F);
		}
	})
		.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
			if(model instanceof Holographic) {
				GL11.glTranslatef(-0.06F, -1.12F, -0.6F);
				GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(-0.122F, -1.36F, -0.5F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		/*.withCompatibleAttachment(ModernWarfareMod.Grip, (model) -> {
			GL11.glTranslatef(.135F, -0.6F, -1.25F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})*/
		.withCompatibleAttachment(CommonProxy.Laser, (model) -> {
			GL11.glTranslatef(0.01F, -0.7F, -2F);
			GL11.glScaled(1.1F, 1.1F, 1.1F);
			GL11.glRotatef(-90F, 0f, 0f, -4f);
		})
		.withCompatibleAttachment(CommonProxy.Silencer, (model) -> {
			GL11.glTranslatef(-0.25F, -1.15F, -4.61F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
		.withTextureNames("G18", "Red", "Black", "Desert", "Green", "Blue", "Orange", "Purple", 
				"Cyan", "White", "Arctic", "Electric", "Redline", "M4Cyrex", "Fade", "IceAndFire", "Fade2", "GreenElectric", "Handgun",
				"Creativity", "Dragon", "ASMO", "Vulcan", "GreenVulcan", "GreenVulcan", "Guardian")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new G18())
			//.withTextureName("G18")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.4F, 0.4F, 0.4F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(0f, 0f, 1f);
			})
			.withThirdPersonPositioning((player, itemStack) -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(-1.8F, -1F, 2F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
			.withFirstPersonPositioning((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
					float reloadingProgress = Weapon.reloadingProgress(player, itemStack);
					if(itemStack.stackTagCompound != null && reloadingProgress > 0 && reloadingProgress < 0.2f) {
						// Reload
						GL11.glRotatef(-45F, 1f, 0f, 2f);
						GL11.glTranslatef(1F, -1.2F, 0.6F);
					} else if(itemStack.stackTagCompound != null && Weapon.isZoomed(itemStack) /*itemStack.stackTagCompound.getFloat(Weapon.ZOOM_TAG) != 1.0f*/) {
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
						
					} else {
						// Regular
						GL11.glTranslatef(-1F, -0.73F, 1.5F);
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
		.withSpawnEntityDamage(5.5f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = world.getBlock(position.blockX, position.blockY, position.blockZ);
			if(block == Blocks.glass) {
				world.func_147480_a(position.blockX, position.blockY, position.blockZ, true);
			}
			
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}
