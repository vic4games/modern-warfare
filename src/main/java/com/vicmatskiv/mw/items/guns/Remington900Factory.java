package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.Remington;
import com.vicmatskiv.mw.models.Remington870;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Remington900Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Remington870")
//		.withAmmo(CommonProxy.Remington870Mag)
		.withAmmoCapacity(5)
		.withMaxBulletsPerReload(4)
		.withFireRate(0.5f)
		.withEjectRoundRequired()
		.withIteratedLoad()
		.withEjectSpentRoundSound("pump")
        .withPumpTimeout(1000)
        .withFireRate(0.1f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withPumpTimeout(500)
        .withShootSound("remington870")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("drawweapon")
        .withReloadIterationSound("loadshell")
		.withReloadingTime(15)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")	
		.withShellCasingEjectEnabled(false)
		.withCrosshairZoomed("Sight")
		.withInaccuracy(10)
		.withPellets(10)
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.5f)
		.withFlashOffsetX(() -> 0.11f)
		.withFlashOffsetY(() -> 0.06f)
		.withCreativeTab(ModernWarfareMod.ShotgunsTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Shotgun", "Damage per Pellet: 5", "Pellets per Shot: 10", 
		"Cartridge: 12 Gauge Shotgun Shell", "Fire Rate: Pump-Action"))
		.withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(AuxiliaryAttachments.R870Pump, true, (model) -> {
		    GL11.glTranslatef(0.02F, 0.07F, 0.55F);
		    GL11.glScalef(1.3f, 1.2f, 1.2f);
		})
		.withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
			GL11.glTranslatef(-0.19F, -0.6F, -8F);
			GL11.glScaled(1.4F, 1.4F, 1.4F);
		})
		.withCompatibleBullet(Bullets.ShotgunShell, (model) -> {})
		.withTextureNames("Remington870")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new Remington870())
			//.withTextureName("Remington900")
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
			.withThirdPersonPositioning((renderContext) -> {
			    GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-0.9F, 0.4F, 1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
			    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(1f, -0.075000f, -1f);
                })
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(5F, 0f, 0f, 1f);
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glTranslatef(-0.4f, 0.33f, -1.5f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.4f, 0.33f, -1.3f);
				GL11.glRotatef(-1.5F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.150000f, -0.9f);
                GL11.glRotatef(-2.5F, 1f, 0f, 0f);
//                GL11.glRotatef(-2.5F, 0f, 1f, 0f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.R870Pump.getRenderablePart(), (renderContext) -> {
				})
				
			.withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.R870Pump.getRenderablePart(), (renderContext) -> {
                })
				
			.withFirstPersonPositioningEjectSpentRound(
			        new Transition((renderContext) -> { // Reload position
			            GL11.glRotatef(45F, 0f, 1f, 0f);
		                GL11.glRotatef(8F, 0f, 0f, 1f);
		                GL11.glRotatef(-1F, 1f, 0f, 0f);
		                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
		                GL11.glTranslatef(-0.35f, 0.35f, -1.3f);
	                }, 170, 0),
	                
	                new Transition((renderContext) -> { // Reload position
	                    GL11.glRotatef(45F, 0f, 1f, 0f);
	                    GL11.glRotatef(8F, 0f, 0f, 1f);
	                    GL11.glRotatef(-1F, 1f, 0f, 0f);
	                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
	                    GL11.glTranslatef(-0.35f, 0.35f, -1.4f);
	                }, 150, 0)
					
					)
					
			.withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.R870Pump.getRenderablePart(),
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0F, 0F, 0.7F);
//						GL11.glRotatef(0F, 0f, 1f, 0f);
//						GL11.glRotatef(0F, 0f, 0f, 1f);
//						GL11.glScaled(0.55F, 0.55F, 0.55F);
						
					}, 170, 50),
					new Transition((renderContext) -> { // Reload position
//						GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//						GL11.glRotatef(40F, 0f, 1f, 0f);
//						GL11.glRotatef(10F, 0f, 0f, 1f);
//						GL11.glScaled(0.55F, 0.55F, 0.55F);
//						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 150, 50)
					
					)
					
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.R870Pump.getRenderablePart(),
				new Transition((renderContext) -> { // Reload position
				}, 250, 50),
				new Transition((renderContext) -> { // Reload position
				}, 250, 50)
				)
				
			.withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.R870Pump.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position\
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 0.7F);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.R870Pump.getRenderablePart(),  
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
            )
				
			.withFirstPersonPositioningReloading(
					
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
				}, 250, 50),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
				}, 250, 50)
			)
			
			.withFirstPersonPositioningAllLoadIterationsCompleted(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 230, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-26.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(64.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -0.9f);
                }, 230, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(64.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 240, 0)
            )
			
			.withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(66.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 170, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(67.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(66.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 140, 0)
            )
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glTranslatef(0.250000f, 0.17f, -1.5f);
				
//				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
					//System.out.println("Position me for Holo");
				} 
				
				// Everything else
				else {
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.350000f, 0.200000f, -0.400000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
			     GL11.glRotatef(0.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-0.375000f, -0.200000f, -1.274999f);
			 }) 
			.withFirstPersonHandPositioning(
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 4f);
					     GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(40.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(2f, 2f, 2f);
						 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
					 })
					 
			.withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2, 2, 2f);
                         GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.300000f, -0.400000f, 0.800000f);
                     })
					 
			.withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                     })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(2f, 2f, 2f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
					}, 250, 50)
					)
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
					}, 250, 50)
					)
					
			.withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.400000f, 0.800000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.425000f, 0.450000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.350000f, 0.300000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.425000f, 0.450000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.400000f, 0.800000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.500000f, -0.225000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
                    }, 250, 50)
                    )
					
			.withFirstPersonLeftHandPositioningEjectSpentRound(
			        new Transition((renderContext) -> { // Reload position
			            GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.15f, -0.52f, 0.22f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                    }, 250, 50)
					
					)
					
			.withFirstPersonRightHandPositioningEjectSpentRound(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.925000f, 0.030000f);
					}, 250, 50)
					
					)
					
			.build())
		.withSpawnEntityDamage(5f)
		.withSpawnEntityGravityVelocity(0.8f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}