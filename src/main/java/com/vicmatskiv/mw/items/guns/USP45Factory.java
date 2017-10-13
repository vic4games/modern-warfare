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
import com.vicmatskiv.mw.models.USP45;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class USP45Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("HKUSP45")
//		.withAmmo(CommonProxy.M9Mag)
//		.withAmmoCapacity(10)
		.withFireRate(0.4f)
		.withRecoil(5f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("USP45")
		.withSilencedShootSound("silencer")
		.withReloadSound("PistolReload")
		.withUnloadSound("pistolUnload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.5f)
		.withFlashOffsetX(() -> 0.2f)
		.withFlashOffsetY(() -> 0.1f)
		.withInaccuracy(3)
		.withCreativeTab(ModernWarfareMod.PistolsTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
		.withInformationProvider(stack -> Arrays.asList("Type: Pistol", "Damage: 5.5", 
		"Caliber: .45 ACP", "Magazines:", "10rnd .45 ACP Magazine",
		"Fire Rate: Semi"))
		 .withCompatibleAttachment(GunSkins.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Forest, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Forest.getTextureVariantIndex("Forest"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(GunSkins.Fade, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Fade.getTextureVariantIndex("Ruby"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Sapphire.getTextureVariantIndex("Sapphire"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(AuxiliaryAttachments.USP45Top, true, (model) -> {
//			GL11.glTranslatef(0.1F, -0.5F, -1F);
//			GL11.glRotatef(45F, 0f, 1f, 0f);
//			GL11.glScaled(0.55F, 0.55F, 0.55F);
		})
		.withCompatibleAttachment(Magazines.ColtM1911Mag, (model) -> {
			GL11.glTranslatef(0F, 0.15F, 0F);
			})
		.withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
			GL11.glTranslatef(-0.25F, -1.2F, -4.6F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
		.withTextureNames("AK12", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new USP45())
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
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(-0.850000f, 0.875000f, -3.4f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(-0.850000f, 0.875000f, -3.1f);
                GL11.glRotatef(-4F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.USP45Top.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.USP45Top.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.ColtM1911Mag, (renderContext) -> {})
            
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.ColtM1911Mag, (renderContext) -> {})
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.6f, -2.5f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            //.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
                
            .withFirstPersonCustomPositioning(Magazines.ColtM1911Mag, (renderContext) -> {})
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.USP45Top.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 1F);
                }
            })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-2.224999f, -0.350000f, -1.075000f);
                    }, 280, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-2.224999f, -0.350000f, -1.075000f);
                    }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(55.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1.074999f, 1.075000f, -1.774999f);
                }, 310, 55),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(55.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1.074999f, 1.075000f, -1.774999f);
                }, 200, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(55.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1.074999f, 1.075000f, -1.774999f);
                }, 210, 40)
                
                
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.224999f, -0.350000f, -1.075000f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.224999f, -0.350000f, -1.075000f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.ColtM1911Mag,
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
////                    GL11.glScaled(0.55F, 0.55F, 0.55F);
////                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1.8F, 0.4F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.ColtM1911Mag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1.8F, 0.4F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000)
                    )
                    
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.USP45Top.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.USP45Top.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.6f, -2.799999f);
                
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
                            GL11.glTranslatef(0.425000f, -0.525000f, 0.140000f);
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
                         GL11.glTranslatef(0.425000f, -0.525000f, 0.140000f);
                     })
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(115.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.050000f, 0.550000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.375000f, -0.950000f, 0.375000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, -0.575000f, 0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, -0.875000f, 0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, -0.575000f, 0.050000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
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
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                      GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
//                      GL11.glTranslatef(0.425000f, -0.525000f, 0.140000f);
                        GL11.glTranslatef(0.39f, -0.525000f, 0.140000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.39f, -0.525000f, 0.140000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.39f, -0.525000f, 0.140000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.375000f, -0.950000f, 0.375000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(115.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.050000f, 0.550000f);
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
		.withSpawnEntityDamage(5.5f)
		.withSpawnEntityGravityVelocity(0.02f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}