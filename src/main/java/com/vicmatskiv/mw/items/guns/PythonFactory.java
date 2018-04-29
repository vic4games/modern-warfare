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
//		.withAmmo(CommonProxy.MagnumAmmo)
//		.withAmmoCapacity(6)
		.withFireRate(0.2f)
		.withRecoil(5f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("Python")
		//.withSilencedShootSound("M9silenced")
		.withReloadSound("revolverreload")
		.withUnloadSound("revolverunload")
		.withReloadingTime(25)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.5f)
		.withFlashOffsetX(() -> 0.2f)
		.withFlashOffsetY(() -> 0.1f)
		.withInaccuracy(4)
		.withCreativeTab(ModernWarfareMod.PistolsTab)	
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
		.withInformationProvider(stack -> Arrays.asList("Type: Revolver", "Damage: 6", 
		"Ammo: .357 Bullet", "Fire Rate: Semi"))
		 .withCompatibleAttachment(GunSkins.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
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
         .withCompatibleAttachment(GunSkins.Arctic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Arctic.getTextureVariantIndex("Arctic"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(AuxiliaryAttachments.PythonCase, true, (model) -> {
		})
		.withCompatibleAttachment(Magazines.PythonClip, (model) -> {
            GL11.glScaled(0F, 0F, 0F);
        })
		.withCompatibleBullet(Bullets.Bullet357, (model) -> {})
		.withTextureNames("Python", "MagnumGold")
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
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(-0.850000f, 0.875000f, -3.4f);
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScaled(3F, 3F, 3F);
//                GL11.glTranslatef(-0.850000f, 1.15f, -3.4f);
//                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
//                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(-0.850000f, 0.875000f, -3.1f);
                GL11.glRotatef(-4F, 1f, 0f, 0f);
                })
				
			.withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.PythonCase.getRenderablePart(), (renderContext) -> {
//				GL11.glTranslatef(0F, 0F, 0F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
				
			.withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.PythonCase.getRenderablePart(), (renderContext) -> {
//				GL11.glTranslatef(0F, 0F, 0F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.59f, -2.5f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.PythonCase.getRenderablePart(), (renderContext) -> {
//			    GL11.glTranslatef(0f, 0f, 0f);
//			    GL11.glRotatef(15F, 0f, 0f, 1f);
				})
				
			.withFirstPersonCustomPositioning(Magazines.PythonClip, (renderContext) -> {
//              GL11.glTranslatef(0f, 0f, 0f);
//              GL11.glRotatef(15F, 0f, 0f, 1f);
                })
				
			.withFirstPersonPositioningCustomRecoiled(Magazines.PythonClip, (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.PythonClip, (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioningUnloading(Magazines.PythonClip,
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.PythonClip,
                new Transition((renderContext) -> {
                    GL11.glScaled(0F, 0F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(0F, 0F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(0F, 0F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(0F, 0F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(0F, 0F, 0F);
                }, 250, 1000)
                    )
				
			.withFirstPersonPositioningReloading(
					
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glScaled(3F, 3F, 3F);
	                GL11.glTranslatef(-0.850000f, 0.875000f, -3.4f);
	                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);

				}, 250, 100),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glScaled(3F, 3F, 3F);
	                GL11.glTranslatef(-0.850000f, 1.15f, -3.4f);
	                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
					
				}, 200, 200),
					
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glScaled(3F, 3F, 3F);
	                GL11.glTranslatef(-0.850000f, 1.15f, -3.4f);
	                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);

				}, 300, 330),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glScaled(3F, 3F, 3F);
	                GL11.glTranslatef(-0.850000f, 1.15f, -3.4f);
	                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);

            }, 250, 200),
            
            new Transition((renderContext) -> { // Reload position
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(-0.850000f, 0.875000f, -3.4f);
                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);

        }, 200, 0)
			) 
			
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.PythonCase.getRenderablePart(),
				new Transition((renderContext) -> { // Reload position
				}, 250, 50),
				new Transition((renderContext) -> { // Reload position
				    GL11.glTranslatef(0f, 0f, 0f);
	                GL11.glRotatef(15F, 0f, 0f, 1f);
				}, 250, 50),
				new Transition((renderContext) -> { // Reload position
				    GL11.glTranslatef(0f, 0f, 0f);
	                GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
				)
				
				.withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.PythonCase.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 1000)
                    )
				
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glTranslatef(-0.850000f, 1.15f, -3.4f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glTranslatef(-0.850000f, 1.15f, -3.4f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                }, 150, 50)
            )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.75f, -2.799999f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(3F, 3F, 3F);
                GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.9f, 2.250000f, -1.699999f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2.375000f, 0.700000f, -0.125000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
//                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(-0.250000f, -0.650000f, 0.125000f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.400000f, -0.775000f, 0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.425000f, -0.5f, 0.11f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.025000f, -0.875000f, 0.250000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.5f, 0.11f);
                     })
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -1.100000f, 0.350000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -1.100000f, 0.350000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, -0.650000f, 0.125000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -1.100000f, 0.350000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -1.100000f, 0.350000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.5f, 0.11f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.5f, 0.11f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.5f, 0.11f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.5f, 0.11f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.5f, 0.11f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, -0.650000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.375000f, -0.950000f, 0.375000f);
                        
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.525000f, 0.140000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, -0.525000f, 0.140000f);
                    }, 250, 50))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.400000f, -0.775000f, 0.275000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.550000f, 0.150000f);
                    })
            .build())
		.withSpawnEntityDamage(6f)
		.withSpawnEntityGravityVelocity(0.016f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}