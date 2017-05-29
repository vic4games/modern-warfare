package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.M9;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;

public class M9SDFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M9SD")
//		.withAmmo(CommonProxy.M9Mag)
//		.withAmmoCapacity(10)
		.withFireRate(0.45f)
		.withRecoil(5f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("silencer")
		.withSilencedShootSound("silencer")
		.withReloadSound("PistolReload")
		.withUnloadSound("Unload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.5f)
		.withFlashScale(() -> 0.5f)
		.withFlashOffsetX(() -> 0.2f)
		.withFlashOffsetY(() -> 0.1f)
		.withInaccuracy(3)
		.withCreativeTab(ModernWarfareMod.PistolsTab)
		.withInformationProvider(stack -> Arrays.asList("--Automatically Silenced--", "",  "Type: Pistol", "Damage: 4.5", 
		"Caliber: 9mm", "Magazines:", "15rnd 9mm Magazine",
		"Fire Rate: Semi"))
		.withCraftingRecipe("AX",
                'X', CommonProxy.M9,
                'A', Attachments.Silencer9mm
        )
		.withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(AuxiliaryAttachments.M9Top, true, (model) -> {
//			GL11.glTranslatef(0.1F, -0.5F, -1F);
//			GL11.glRotatef(45F, 0f, 1f, 0f);
//			GL11.glScaled(0.55F, 0.55F, 0.55F);
		})
		.withCompatibleAttachment(Magazines.M9BerettaMag, (model) -> {
			GL11.glTranslatef(0F, 0.1F, 0.1F);
			})
			
		.withCompatibleAttachment(AuxiliaryAttachments.M9SDsuppressor, true, (model) -> {
			GL11.glTranslatef(-0.25F, -1.23F, -4.52F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
			})
			
		.withTextureNames("M9", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M9())
			//.withTextureName("M9")
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
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(-1.8F, -1F, 2F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glTranslatef(0.1F, -0.5F, -1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
				GL11.glTranslatef(0F, -0.6F, -1.1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-10F, 1f, 0f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M9Top.getRenderablePart(), (renderContext) -> {
				GL11.glTranslatef(0F, 0F, 0.5F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
				
			.withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M9Top.getRenderablePart(), (renderContext) -> {
				GL11.glTranslatef(0F, 0F, 0.5F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(Magazines.M9BerettaMag, (renderContext) -> {})
			
			.withFirstPersonPositioningCustomZoomingRecoiled(Magazines.M9BerettaMag, (renderContext) -> {})
			
			.withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M9SDsuppressor.getRenderablePart(), (renderContext) -> {})
			
			.withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M9SDsuppressor.getRenderablePart(), (renderContext) -> {})
		
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				GL11.glTranslatef(-0.3F, -0.4F, -0.5F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-4F, 1f, 0f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.31F, -1.34f, 1.5f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
			/*	// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), ModernWarfareMod.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.3f, 1f);
				} */
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.5f, 0.7f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.38F, -1.115f, 3.2f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			//.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
				
			.withFirstPersonCustomPositioning(Magazines.M9BerettaMag, (renderContext) -> {})
			
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.M9Top.getRenderablePart(), (renderContext) -> {
				if(renderContext.getWeaponInstance().getAmmo() == 0) {
					GL11.glTranslatef(0F, 0F, 0.5F);
				}
			})
			
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.M9SDsuppressor.getRenderablePart(), (renderContext) -> {
				if(renderContext.getWeaponInstance().getAmmo() == 0) {
					GL11.glTranslatef(0F, 0F, 0.5F);
				}
			})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(-0.6F, -0.6F, -0.6F);
						GL11.glRotatef(0F, 0f, 1f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
					
						GL11.glRotatef(-60F, 1f, 0f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glTranslatef(1F, -1.2F, 0F);
					}, 250, 500),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(-0.4F, -0.2F, -0.3F);
						GL11.glRotatef(0F, 0f, 1f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
					
						GL11.glRotatef(-30F, 1f, 0f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glTranslatef(1F, -1.2F, 0F);
					}, 250, 1000),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(-0.4F, -0.2F, -0.3F);
					GL11.glRotatef(0F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-30F, 1f, 0f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 50, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(-0.6F, -0.6F, -0.6F);
					GL11.glRotatef(0F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-60F, 1f, 0f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(-0.6F, -0.6F, -0.6F);
					GL11.glRotatef(0F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
				
					GL11.glRotatef(-60F, 1f, 0f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glTranslatef(1F, -1.2F, 0F);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.M9BerettaMag,
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//					GL11.glRotatef(-20F, 1f, 0f, 0f);
////					GL11.glScaled(0.55F, 0.55F, 0.55F);
////					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1.3F, 0.4F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.M9BerettaMag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1.3F, 0.4F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					/*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
				}, 250, 1000)
					)
					
					
			.withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M9Top.getRenderablePart(),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M9Top.getRenderablePart(),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(45F, 0f, 1f, 0f);
//				    GL11.glScaled(0.55F, 0.55F, 0.55F);
//				    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M9SDsuppressor.getRenderablePart(),
				new Transition((renderContext) -> {
			
				}, 250, 1000),
				new Transition((renderContext) -> {
					
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0F, 0F, 0.5F);
//					GL11.glRotatef(45F, 0f, 1f, 0f);
//				    GL11.glScaled(0.55F, 0.55F, 0.55F);
//				    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M9SDsuppressor.getRenderablePart(),
				new Transition((renderContext) -> {
					
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
				
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glTranslatef(-0.20F, -0.31F, -0.4F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.31F, -1.31f, 1.5f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
			/*	// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), ModernWarfareMod.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.3f, 1f);
				} */
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.5f, 0.7f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.38F, -1.17f, 3.3f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glTranslatef(0.1F, -1.5F, -1F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(-50F, 1f, 0f, 0f);
				GL11.glRotatef(0F, 0f, 0f, 1f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
				 GL11.glScaled(1.2F, 1.2F, 1.2F);
					GL11.glRotatef(-35F, 2f, 1f, 1f);
					GL11.glTranslatef(-1F, 0.1F, 0F);
			 })
			  .withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.6f, -0.1f, 0.4f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
						 GL11.glScalef(1.6f, 1.6f, 1.6f);
						 GL11.glTranslatef(1.5f, 0.1f, -0.2f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-10f, 1f, 0f, 0f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.1f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.9f, 0.8f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 20f, 20f, -20f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.5f, 0.5f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 1f, 0f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.5f, 0.5f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 1f, 0f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.8f, 0.1f, 0.6f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 1f, 0f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.8f, 0.1f, 0.6f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-30f, 1f, 0f, 0f);
						 GL11.glRotatef(40f, 0f, 1f, 0f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50))
					
			.withFirstPersonHandPositioningZooming(
					(renderContext) -> {
						 GL11.glScalef(3f, 3f, 3f);
						 GL11.glTranslatef(0.4f, -0.1f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 1f, 0f, 0f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(3.3f, 3.3f, 3.3f);
						 GL11.glTranslatef(-0.34f, 0.48f, 0.3f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-120f, 1f, 0f, 0f);
						 GL11.glRotatef(10f, 0f, 0f, 1f);
					 })
			.build())
		.withSpawnEntityDamage(4.5f)
		.withSpawnEntityGravityVelocity(0.02f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}