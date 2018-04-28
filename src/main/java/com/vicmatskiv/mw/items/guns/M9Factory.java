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
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M9;
import com.vicmatskiv.mw.models.M9Top;
import com.vicmatskiv.mw.models.M9rearsight;
import com.vicmatskiv.mw.models.m9frontsight;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M9Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M9")
//		.withAmmo(CommonProxy.M9Mag)
//		.withAmmoCapacity(10)
		.withFireRate(0.4f)
		.withRecoil(5f)
		.withZoom(0.9f)
		.withMaxShots(1)
		.withShootSound("M9")
		.withSilencedShootSound("m9silenced")
		.withReloadSound("PistolReload")
		.withUnloadSound("pistolUnload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.5f)
		.withFlashOffsetX(() -> 0.2f)
		.withFlashOffsetY(() -> 0.1f)
		.withInaccuracy(3)
		.withCreativeTab(ModernWarfareMod.PistolsTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
		.withInformationProvider(stack -> Arrays.asList("Type: Pistol", "Damage: 5", 
		"Caliber: 9mm", "Magazines:", "15rnd 9mm Magazine",
		"Fire Rate: Semi"))
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
		    if(model instanceof M9Top) {
                GL11.glScaled(1F, 1F, 1F);
		    }
		    else if(model instanceof M9rearsight) {
                GL11.glTranslatef(-0.155F, -1.175F, -0.15F);
                GL11.glScaled(0.3F, 0.3F, 0.4F);
            }
		    else if(model instanceof m9frontsight) {
                GL11.glTranslatef(-0.15F, -1.175F, -1.85F);
                GL11.glScaled(0.25F, 0.25F, 0.3F);
            }
		})
		.withCompatibleAttachment(Magazines.M9BerettaMag, (model) -> {
			GL11.glTranslatef(0F, 0.1F, 0.1F);
			})
		.withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
			GL11.glTranslatef(-0.22F, -1.22F, -4.2F);
			GL11.glScaled(1.3F, 1.3F, 1.3F);
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
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.7f, 0.65f, -3.2f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.7f, 0.65f, -3f);
                GL11.glRotatef(-5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M9Top.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M9Top.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.M9BerettaMag, (renderContext) -> {})
            
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.M9BerettaMag, (renderContext) -> {})
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.6f, -2.4f);
                GL11.glRotatef(-5F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            //.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
                
            .withFirstPersonCustomPositioning(Magazines.M9BerettaMag, (renderContext) -> {})
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M9Top.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }
            })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.299999f, 1.025000f, -2.775002f);
                    }, 280, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.299999f, 1.025000f, -2.775002f);
                    }, 300, 100),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.299999f, 1.025000f, -2.775002f);
                    }, 120, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glTranslatef(-0.75f, 1.5f, -2.7f);
                    }, 200, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(-25F, 1f, 0f, 0f);
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glTranslatef(-0.75f, 1.8f, -2.3f);
                    }, 120, 0)
                    
                    
                )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(-13F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glTranslatef(-1.2f, 1.45f, -3.2f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.M9BerettaMag,
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
////                    GL11.glScaled(0.55F, 0.55F, 0.55F);
////                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M9BerettaMag,
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
                    
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M9Top.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M9Top.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0F);
                }, 250, 1000)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.63f, -2.799999f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
             .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(0.7F, 0.7F, 0.7F);
                GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.575000f, -0.775000f, -1.249999f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.374999f, 0.600000f, -1.449999f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, -0.775000f, 0.125000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                     })
            .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.450000f, 0.000000f, 0.375000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                     })
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                             GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                             GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.275000f, -0.125000f, 0.400000f);
                         }, 
                         (renderContext) -> {
                             GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                             GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.365000f, -0.536000f, 0.135000f);
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
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.375000f, -0.950000f, 0.375000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-180.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.375000f, -0.675000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-185.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, -0.675000f, 0.175000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.348000f, -0.540000f, 0.144000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.348000f, -0.540000f, 0.144000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.348000f, -0.540000f, 0.144000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.348000f, -0.540000f, 0.144000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.348000f, -0.540000f, 0.144000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, -0.825000f, 0.250000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.348000f, -0.540000f, 0.144000f);
                    }, 250, 1000))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                      GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                      GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.125000f, -0.775000f, 0.125000f);
                  }, 
                  (renderContext) -> {
                      GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                  })
            .build())
		.withSpawnEntityDamage(5f)
		.withSpawnEntityGravityVelocity(0.02f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}