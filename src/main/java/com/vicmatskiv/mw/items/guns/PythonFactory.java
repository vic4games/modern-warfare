package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.Python;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class PythonFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Python")
		.withAmmoCapacity(6)
        .withMaxBulletsPerReload(6)
		.withFireRate(0.2f)
		.withRecoil(3f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("python")
		//.withSilencedShootSound("M9silenced")
		.withIteratedLoad()
		.withReloadSound("revolver_reload")
		.withReloadIterationSound("revolverbullet")
	    .withAllReloadIterationsCompletedSound("revolver_load_complete")
		.withReloadingTime(25)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.5f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.2f)
		.withInaccuracy(3)
		.withShellCasingEjectEnabled(false)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)	
		.withCrafting(CraftingComplexity.LOW,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
		.withInformationProvider(stack -> Arrays.asList(
		        "Type: Revolver",
		        "Damage: 10",
		        "Cartridge: .357 Bullet", 
		        "Fire Rate: Semi",
		        "Rate of Fire: 20/100"))
		.withCompatibleAttachment(AuxiliaryAttachments.PythonChamber, true, (model) -> {
//			GL11.glTranslatef(-0.35f, -0.1f, 0f);
//            GL11.glRotatef(25F, 0f, 0f, 1f);
		})
		.withCompatibleAttachment(Attachments.DanWessonLaser, (p, s) -> {
            GL11.glTranslatef(0.01F, -1.45F, -2.6F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
//            GL11.glRotatef(-90F, 0f, 0f, -4f);
        })
		.withCompatibleBullet(Bullets.Bullet357, (model) -> {})
		.withTextureNames("Python")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new Python())
			//.withTextureName("XEagle")
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
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.6F, -0.2F, 2.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.400000f, 1.725000f, -2.999999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.400000f, 1.725000f, -2.5f);
                GL11.glRotatef(-5F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
            	GL11.glScaled(3F, 3F, 3F);
                GL11.glRotatef(-29.000000f, 1f, 0f, 0f);
                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                GL11.glRotatef(24.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.PythonChamber.getRenderablePart(), (renderContext) -> {
//				GL11.glTranslatef(0F, 0F, 0F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
			.withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.PythonChamber.getRenderablePart(), (renderContext) -> {
//				GL11.glTranslatef(0F, 0F, 0F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
			.withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.PythonChamber.getRenderablePart(), (renderContext) -> {
//				GL11.glTranslatef(0F, 0F, 0F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
			
			.withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.PythonChamber.getRenderablePart(), (renderContext) -> {
				GL11.glTranslatef(-0.35f, -0.1f, 0f);
	            GL11.glRotatef(25F, 0f, 0f, 1f);
			})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
				 GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glScaled(3F, 3F, 3F);
	                GL11.glTranslatef(0.03f, 1.52f, -2.5f);
                GL11.glRotatef(-5F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }

                })
			
			.withFirstPersonPositioningReloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
				}, 320, 0),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.8f, 2.7f, -1.85f);
				}, 120, 0),
					
				new Transition((renderContext) -> { // Reload position
					GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.7f, 2.7f, -1.83f);
				}, 300, 0),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.8f, 2.799999f, -1.949999f);
            }, 250, 0)
			) 
			
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.PythonChamber.getRenderablePart(),
				new Transition((renderContext) -> { // Reload position
				}, 250, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(-0.35f, -0.1f, 0f);
	                GL11.glRotatef(25F, 0f, 0f, 1f);
				}, 250, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(-0.35f, -0.1f, 0f);
	                GL11.glRotatef(25F, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                    GL11.glRotatef(25F, 0f, 0f, 1f);
                }, 250, 50)
				)
			
			 .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.PythonChamber.getRenderablePart(),
		                new Transition((renderContext) -> { // Reload position\
		                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
			                GL11.glRotatef(25F, 0f, 0f, 1f);
		                }, 250, 50),
		                
		                new Transition((renderContext) -> { // Reload position
		                }, 250, 50))
		            
		            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.PythonChamber.getRenderablePart(),  
		                new Transition((renderContext) -> { // Reload position
		                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
			                GL11.glRotatef(25F, 0f, 0f, 1f);
		                }, 250, 50),
		                
		                new Transition((renderContext) -> { // Reload position
		                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
			                GL11.glRotatef(25F, 0f, 0f, 1f);
		                }, 250, 50),
		                
		                new Transition((renderContext) -> { // Reload position
		                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
			                GL11.glRotatef(25F, 0f, 0f, 1f);
		                }, 250, 50),
		                
		                new Transition((renderContext) -> { // Reload position
		                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
			                GL11.glRotatef(25F, 0f, 0f, 1f);
		                }, 250, 50),
		                
		                new Transition((renderContext) -> { // Reload position
		                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
			                GL11.glRotatef(25F, 0f, 0f, 1f);
		                }, 250, 50),
		                
		                new Transition((renderContext) -> { // Reload position
		                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
			                GL11.glRotatef(25F, 0f, 0f, 1f);
		                }, 250, 50),
		                
		                new Transition((renderContext) -> { // Reload position
		                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
			                GL11.glRotatef(25F, 0f, 0f, 1f);
		                }, 250, 50),
		                
		                new Transition((renderContext) -> { // Reload position
		                	GL11.glTranslatef(-0.35f, -0.1f, 0f);
			                GL11.glRotatef(25F, 0f, 0f, 1f);
		                }, 250, 50)
		            )
            
				.withFirstPersonPositioningAllLoadIterationsCompleted(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(3F, 3F, 3F);
    	                GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
    	                GL11.glRotatef(38.000000f, 0f, 1f, 0f);
    	                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
    	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
                    }, 230, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(39.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
                }, 190, 0)
            )
            
            .withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-31.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
                }, 170, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-28.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(28.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
                }, 220, 50),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.9f);
                }, 180, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(37.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(27.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.9f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-29.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-28.500000f, 1f, 0f, 0f);
	                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(26.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-0.900000f, 2.799999f, -1.949999f);
                }, 140, 0)
            )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.300000f, 1.300000f, -1.250000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.2f, 1.5f, -1.3f);
                  }, 350, 600)
                    )
            
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.450000f, 1.725000f, -2.999999f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.450000f, 1.725000f, -2.999999f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.450000f, 1.725000f, -2.999999f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.450000f, 1.725000f, -2.999999f);
                    }, 240, 0)
                    )
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.03f, 1.52f, -2.999999f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glRotatef(7F, 1f, 0f, 0f);
                GL11.glTranslatef(-0.100000f, 1.725000f, -2.999999f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2.700000f, 1.700000f, -2.350000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                     })
             
             .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                     	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                     	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                     	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	GL11.glTranslatef(-0.300000f, -1.050000f, -0.125000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
            		(renderContext) -> {
                   	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.175000f, -0.850000f, -0.050000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    })
            
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.125000f, -0.450000f, 0.050000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.125000f, -0.450000f, 0.050000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.125000f, -0.450000f, 0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.125000f, -0.450000f, 0.050000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.425000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.525000f, -0.425000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.42f, -0.5f, -0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                      	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 0))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    })
            
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.300000f, -1.050000f, -0.125000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.775000f, -0.125000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.300000f, -0.700000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -0.500000f, -0.125000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.200000f, -0.500000f, -0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.150000f, -0.475000f, -0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.775000f, -0.125000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.300000f, -1.050000f, -0.125000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 250, 50))
            
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 250, 100)
                    )
            
            .build())
		.withSpawnEntityDamage(10f)
		.withSpawnEntityGravityVelocity(0.016f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}