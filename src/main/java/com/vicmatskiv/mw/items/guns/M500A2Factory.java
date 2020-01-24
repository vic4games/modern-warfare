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
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.M500A2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M500A2Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("m500a2")
//		.withAmmo(CommonProxy.Remington870Mag)
		.withAmmoCapacity(8)
		.withMaxBulletsPerReload(7)
		.withFireRate(0.5f)
		.withEjectRoundRequired()
		.withIteratedLoad()
		.withEjectSpentRoundSound("pump_action")
        .withFireRate(0.1f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withPumpTimeout(800)
        .withShootSound("m500a2")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("drawweapon")
        .withReloadIterationSound("load_shell")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withAllReloadIterationsCompletedSound("pump_action")
		.withReloadingTime(15)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")	
		.withShellCasingEjectEnabled(false)
		.withCrosshairZoomed("Sight")
		.withInaccuracy(10)
		.withPellets(10)
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 1f)
		.withFlashOffsetX(() -> 0.05f)
		.withFlashOffsetY(() -> 0.15f)
		 .withCrafting(CraftingComplexity.HIGH,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withInformationProvider(stack -> Arrays.asList(
		"Type: Shotgun",
		"Damage per Pellet: 12",
		"Pellets per Shot: 10", 
		"Cartridge: 12 Gauge Shotgun Shell",
		"Fire Rate: PUMP ACTION",
		"Rate of Fire: 50/100"))
		.withCompatibleAttachment(AuxiliaryAttachments.M500A2pump, true, (model) -> {
		})
		.withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
		    if(model instanceof AKRail) {
                GL11.glTranslatef(0.1F, -0.25F, -3.85F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.25F, -0.08F, -3.85F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(0.01F, 0.02F, -3.85F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.2F, -1.5F, -1.9f);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.2F, -1.335F, -4.45f);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
		.withCompatibleAttachment(AuxiliaryAttachments.ShotgunShell, true, (model) -> {
		    GL11.glTranslatef(-0.12F, -0.08F, -1F);
		    GL11.glRotatef(90F, 1f, 0f, 0f);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        })
//		.withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
//			GL11.glTranslatef(-0.19F, -0.6F, -8F);
//			GL11.glScaled(1.4F, 1.4F, 1.4F);
//		})
		.withCompatibleAttachment(Attachments.Grip2, (model) -> {
		    GL11.glTranslatef(-0.15F, 0.35F, -2.8F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.15F, 0.35F, -2.8F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.15F, 0.35F, -2.8F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.15F, 0.35F, -2.8F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0.03F, -0.26F, -3.8F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.03F, -0.26F, -3.8F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
		.withCompatibleBullet(Bullets.Shotgun12Guage, (model) -> {})
		.withTextureNames("gun")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M500A2())
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
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(-7F, 0f, 0f, 1f);
                GL11.glRotatef(3.5F, 1f, 0f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.21f, 0.35f, -1.25f);
                })
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(5F, 0f, 0f, 1f);
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glTranslatef(-0.15f, 0.45f, -1.2f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.15f, 0.45f, -0.9f);
				GL11.glRotatef(-1.5F, 1f, 0f, 0f);
				})
				
		    .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(13F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.15f, 0.25f, -1.5f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(13F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.15f, 0.25f, -1.3f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                })
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.15f, -1f);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.M500A2pump.getRenderablePart(), (renderContext) -> {
//			    GL11.glTranslatef(0F, 0F, 1F);
				})
				
			.withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.M500A2pump.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0.07F, 1.15F, -0.3F);
//                GL11.glRotatef(-70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.07F, 1.4F, 0.7F);
                GL11.glRotatef(-45F, 1f, 0f, 0f);
                })
				
			.withFirstPersonPositioningEjectSpentRound(
			        new Transition((renderContext) -> { // Reload position
			            GL11.glRotatef(43F, 0f, 1f, 0f);
		                GL11.glRotatef(10F, 0f, 0f, 1f);
		                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
		                GL11.glTranslatef(-0.15f, 0.5f, -1.3f);
                    }, 200, 0),
                    
			        new Transition((renderContext) -> { // Reload position
			            GL11.glRotatef(43F, 0f, 1f, 0f);
		                GL11.glRotatef(18F, 0f, 0f, 1f);
		                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
		                GL11.glTranslatef(-0.15f, 0.45f, -0.9f);
	                }, 140, 100),
	                
	                new Transition((renderContext) -> { // Reload position
	                    GL11.glRotatef(44F, 0f, 1f, 0f);
	                    GL11.glRotatef(16F, 0f, 0f, 1f);
	                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
	                    GL11.glTranslatef(-0.15f, 0.45f, -1.1f);
	                }, 110, 0)
					
					)
					
			.withFirstPersonCustomPositioningEjectSpentRound(Attachments.AngledGrip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(Attachments.Grip2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(Attachments.VGrip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(Attachments.StubbyGrip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(Attachments.Laser.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(Attachments.Laser2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
					
			.withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.M4Rail.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
					
			.withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.M500A2pump.getRenderablePart(),
					new Transition((renderContext) -> { // Reload position
						
					}, 170, 50),
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0F, 0F, 1F);
					}, 150, 50),
					
					new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
					
					)
					
			.withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0F, -0.3F, 0.5F);
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.9F, 1F, 0.5F);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 1F, 5F);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    }, 150, 50)
                    
                    )
			
			.withFirstPersonPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(-1F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(0.25f, 0.2f, -1.2f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(0.25f, 0.2f, -1f);
                    }, 140, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(-1F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(0.25f, 0.2f, -1.1f);
                    }, 110, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.AngledGrip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.Grip2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.VGrip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.StubbyGrip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.Laser.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(Attachments.Laser2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.M4Rail.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.M500A2pump.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0F, -0.3F, 0.5F);
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.9F, 1F, 0.5F);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 1F, 5F);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    }, 150, 50)
                    
                    )
					
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M500A2pump.getRenderablePart(),
				new Transition((renderContext) -> { // Reload position
				}, 250, 50),
				new Transition((renderContext) -> { // Reload position
				}, 250, 50)
				)
				
			.withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.M500A2pump.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position\
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.M500A2pump.getRenderablePart(),  
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
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M4Rail.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.M4Rail.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position\
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.M4Rail.getRenderablePart(),  
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
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.ShotgunShell.getRenderablePart(),  
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.07F, 1.4F, 0.7F);
                    GL11.glRotatef(-45F, 1f, 0f, 0f);
                    
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.07F, 1.15F, -0.3F);
                    GL11.glRotatef(-70F, 1f, 0f, 0f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0.45F, 0.3F);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 2F);
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.AngledGrip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Grip2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.VGrip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.StubbyGrip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Laser.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(Attachments.Laser2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 170, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 150, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 50)
                    
                    )
                    
            
				
			.withFirstPersonPositioningReloading(
					
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glRotatef(-3F, 0f, 0f, 1f);
	                GL11.glRotatef(1F, 1f, 0f, 0f);
	                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
	                GL11.glTranslatef(-0.21f, 0.35f, -1.25f);
				}, 300, 0),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glRotatef(-6F, 0f, 0f, 1f);
	                GL11.glRotatef(3F, 1f, 0f, 0f);
	                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
	                GL11.glTranslatef(-0.21f, 0.35f, -1.25f);
				}, 280, 0)
			)
			
			.withFirstPersonPositioningAllLoadIterationsCompleted(
                    
			        new Transition((renderContext) -> { // Reload position
			            GL11.glRotatef(45F, 0f, 1f, 0f);
		                GL11.glRotatef(3F, 0f, 0f, 1f);
		                GL11.glRotatef(1F, 1f, 0f, 0f);
		                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
		                GL11.glTranslatef(-0.21f, 0.4f, -1.25f);
                    }, 350, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(3F, 0f, 0f, 1f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.21f, 0.4f, -1.18f);
                }, 140, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 0f, 0f, 1f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.21f, 0.4f, -1.2f);
                }, 110, 0)
            )
			
			.withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-7F, 0f, 0f, 1f);
                    GL11.glRotatef(3.5F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.21f, 0.35f, -1.25f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-7F, 0f, 0f, 1f);
                    GL11.glRotatef(2.5F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.21f, 0.36f, -1.25f);
                }, 170, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(44.5F, 0f, 1f, 0f);
                    GL11.glRotatef(-7F, 0f, 0f, 1f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.21f, 0.36f, -1.25f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(44.5F, 0f, 1f, 0f);
                    GL11.glRotatef(-7F, 0f, 0f, 1f);
                    GL11.glRotatef(2.5F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.21f, 0.35f, -1.25f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-7F, 0f, 0f, 1f);
                    GL11.glRotatef(3F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(-0.21f, 0.35f, -1.25f);
                }, 140, 0)
            )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.6f, 0.000000f, -1.2f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.225000f, 0.4f, -1.2f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-1.5F, 0.4F, 2F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0)
            )
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M500A2pump.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.M4Rail.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.Laser2.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 0.8f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.Laser.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.StubbyGrip.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.AngledGrip.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.Grip2.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withThirdPersonCustomPositioningReloading(Attachments.VGrip.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                        GL11.glRotatef(13F, 0f, 0f, 1f);
                        GL11.glRotatef(9F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.15f, 0.7f, -1.2f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(6F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.15f, 0.5f, -1.2f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.15f, 0.4f, -1.3f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(0F, 1f, 0f, 0f);
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glTranslatef(-0.15f, 0.45f, -1.2f);
                    }, 240, 0)
                    )
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glTranslatef(0.250000f, 0.17f, -1.1f);
				
//				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
					//System.out.println("Position me for Holo");
				} 
				
				// Everything else
				else {
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glRotatef(20F, 0f, 0f, 1f);
                GL11.glRotatef(5F, 1f, 0f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.15f, 0.65f, -1.2f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.6f, 0.000000f, -1.2f);
             }) 
			.withFirstPersonHandPositioning(
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 4f);
					     GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(35.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(3f, 3f, 3f);
					     GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
					 })
					 
		    .withFirstPersonHandPositioningProning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
//                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                     })
					 
			.withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.200000f, -1.249999f, 0.075000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
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
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                     })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 4f);
					     GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(10.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(-0.075000f, -0.750000f, 0.050000f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -1.249999f, 0.075000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -1.249999f, 0.075000f);
					}, 250, 50)
					)
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
					}, 250, 50)
					)
					
			.withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -1.249999f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.950000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.78f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.950000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -1.249999f, 0.075000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.650000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50)
                    )
					
			.withFirstPersonLeftHandPositioningEjectSpentRound(
			        new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.650000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 250, 50)
					
					)
					
			.withFirstPersonRightHandPositioningEjectSpentRound(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50)
					
					)
			
			.withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.650000f, 0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50)
                    
                    )
					
		    .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.750000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.8f, -0.03f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.000000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.050000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.050000f, 0.075000f);
                    }, 50, 200))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.225000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.400000f, 0.275000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.775000f, 0.250000f);
                    }, 250, 100)
                    )
                    
			.build())
		.withSpawnEntityDamage(12f)
		.withSpawnEntityGravityVelocity(0.8f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}