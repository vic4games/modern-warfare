package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M1Carbine;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M1CarbineFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M1Carbine")
//		.withAmmo(CommonProxy.M1Mag)
//		.withAmmoCapacity(15)
		.withFireRate(0.3f)
		.withRecoil(2.5f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("M1Carbine")
		//.withSilencedShootSound("M1CarbineSuppressed")
		.withReloadSound("M1CarbineReload")
		.withUnloadSound("Unload")
		.withReloadingTime(60)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.1f)
		.withInaccuracy(1)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.SteelIngot,
                CompatibleBlocks.PLANK)
		.withInformationProvider(stack -> Arrays.asList("Type: Semi-automatic carbine", "Damage: 7", 
		"Caliber: .30 Carbine", "Magazines:", "15rnd .30 Carbine Magazine",
		"Fire Rate: Semi"))
		.withCompatibleAttachment(GunSkins.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
				}, 
				(a, i) -> {
				}
		)
		 .withCompatibleAttachment(GunSkins.Arctic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Arctic.getTextureVariantIndex("Arctic"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(Magazines.M1CarbineMag, (model) -> {
			GL11.glTranslatef(-0.3F, 0.5F, -1.3F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
			    GL11.glTranslatef(-0.2F, -1.4F, -0.7F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
			    GL11.glTranslatef(-0.16F, -1.158F, -6.3F);
                GL11.glScaled(0.33F, 0.33F, 1.2F);
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
			    GL11.glTranslatef(-0.16F, -1.215F, -0.76F);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
			} else if(model instanceof G36CIron2) {
			    GL11.glTranslatef(-0.16F, -1.16F, -3F);
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
		.withTextureNames("m1carbine")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M1Carbine())
			//.withTextureName("AKM")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.25F, 0.25F, 0.25F);
                GL11.glTranslatef(1, 2.6f, -2.1f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.2F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
		    .withFirstPersonPositioning((renderContext) -> {
                GL11.glTranslatef(0.5F, -0.2F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
                GL11.glTranslatef(-0.5F, -0.7F, 1.3F);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glTranslatef(0.5F, -0.2F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
                GL11.glTranslatef(-0.5F, -0.7F, 1.6F);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glTranslatef(0F, -0.35F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);

                // Zoom
                GL11.glTranslatef(0.315F, -1.21f, 1.8f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, 0.18f, 0.3f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.148f, 5f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.148f, 5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.23f, 0.2f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.15f, 0.2f);
				} 
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.373F, -1.23f, 2.9f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonCustomPositioning(Magazines.M1CarbineMag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
					    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
					}, 250, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
					}, 350, 150),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
				    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
				    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
				    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
				    GL11.glTranslatef(-0.175000f, 0.075000f, 0.625000f);
				}, 400, 80),
					new Transition((renderContext) -> { // Reload position
	                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
	                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.175000f, 0.075000f, 0.625000f);
	                }, 100, 200)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.M1CarbineMag,
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0F, 1.5F, 1F);
//                  GL11.glRotatef(10F, 1f, 0f, 0f);
//                  GL11.glRotatef(10F, 0f, 1f, 0f);
//                  GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.M1CarbineMag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 1.5F, 1F);
//					GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glRotatef(10F, 0f, 1f, 0f);
//					GL11.glRotatef(-90F, 0f, 0f, 1f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
////					GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//					GL11.glRotatef(-20F, 1f, 0f, 0f);
////					GL11.glScaled(0.55F, 0.55F, 0.55F);
////					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//					GL11.glRotatef(45F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//                  GL11.glRotatef(45F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
					)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(0F, -0.35F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);

                // Zoom
                GL11.glTranslatef(0.315F, -1.21f, 1.7f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.285f, 0.53f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.236f, 0.7f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.236f, 0.7f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.235f, 0.7f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(1.373F, -1.15f, 3.2f);
                }
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
                
				
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
			    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
			    GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
			    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
			    GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
			     GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(0.000000f, 0.000000f, 0.000000f);
			 })
			 .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(2.7f, 2.7f, 4f);
                         GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-70f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.25f, 0.15f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-7f, 0, 1f, 0f);
                         GL11.glRotatef(-110f, 1f, 0f, 0f);
                     })
					 
			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.475000f, -1.050000f, -0.100000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
                     
             .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(2.7f, 2.7f, 4f);
                         GL11.glTranslatef(0.6f, 0.2f, -0.1f);
                         GL11.glRotatef(125f, 0, 0f, 1f);
                         GL11.glRotatef(-60f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.4f, 0.1f, 0.3f);
                         GL11.glRotatef(95f, 0, 0f, 1f);
                         GL11.glRotatef(-7f, 0, 1f, 0f);
                         GL11.glRotatef(-130f, 1f, 0f, 0f);
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
						GL11.glRotatef(50.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(0.450000f, -0.425000f, -0.200000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
					    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(95.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.300000f, -0.600000f, -0.225000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.7f, 2.7f, 4f);
                        GL11.glTranslatef(0.5f, 0.08f, -0.1f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0)
				)
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.25f, 0.15f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-7f, 0, 1f, 0f);
                        GL11.glRotatef(-110f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.25f, 0.15f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-7f, 0, 1f, 0f);
                        GL11.glRotatef(-110f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
						GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.025000f, -0.075000f, -0.200000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.250000f, -0.200000f);
                    }, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.600000f, -0.225000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.425000f, -0.200000f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.25f, 0.15f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-7f, 0, 1f, 0f);
                        GL11.glRotatef(-110f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.25f, 0.15f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-7f, 0, 1f, 0f);
                        GL11.glRotatef(-110f, 1f, 0f, 0f);
					}, 250, 50))	
					
			.build())
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.0118f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}