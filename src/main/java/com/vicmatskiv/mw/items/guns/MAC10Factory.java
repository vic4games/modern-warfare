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
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MAC10;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class MAC10Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("MAC-10")
//		.withAmmo(CommonProxy.M9Mag)
//		.withAmmoCapacity(10)
		.withFireRate(0.9f)
		.withRecoil(2.7f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 1)
		.withShootSound("MAC10")
		.withSilencedShootSound("MP5Silenced")
		.withReloadSound("mac10reload")
		.withUnloadSound("pistolunload")
		.withReloadingTime(30)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.7f)
		.withFlashOffsetX(() -> 0.22f)
		.withFlashOffsetY(() -> 0.1f)
		.withInaccuracy(2)
		.withCreativeTab(ModernWarfareMod.PistolsTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
		.withInformationProvider(stack -> Arrays.asList("Type: Machine pistol", "Damage: 5.5", 
		"Caliber: .45 ACP", "Magazines:", "26rnd .45 ACP Magazine",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
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
        .withCompatibleAttachment(GunSkins.Amber, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amber.getTextureVariantIndex("Amber"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
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
        .withCompatibleAttachment(GunSkins.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Sapphire.getTextureVariantIndex("Sapphire"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.162F, -1.75F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.055F, -1.35F, -4.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.1F, -1.05F, -1.4F);
                GL11.glScaled(0.2F, 0.45F, 0.3F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
		.withCompatibleAttachment(Magazines.VectorMag, (model) -> {
			GL11.glTranslatef(-0.32F, 0.2F, 1.12F);
			})
		.withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
			GL11.glTranslatef(-0.25F, -1.1F, -3.8F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
		.withTextureNames("AK12", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new MAC10())
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
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScaled(4F, 4F, 4F);
//                GL11.glTranslatef(-0.850000f, 0.875000f, -3f);
//                GL11.glRotatef(5F, 0f, 0f, 1f);
                
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(-0.850000f, 0.875000f, -3.5f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(-0.850000f, 0.875000f, -3.2f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glRotatef(-4F, 1f, 0f, 0f);
                })
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(0.275000f, 0.775000f, -2.3f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(1.38F, -4f, 3.2f);
                } 
                
                // Everything else
                else {
                }
                
            
                })

			//.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
				
			.withFirstPersonCustomPositioning(Magazines.VectorMag, (renderContext) -> {})
			.withFirstPersonPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScaled(4F, 4F, 4F);
		                GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-2.024999f, 0.650000f, -0.550000f);
					}, 300, 60),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(4F, 4F, 4F);
	                GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
	                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
	                GL11.glTranslatef(-2.024999f, 0.650000f, -0.550000f);
				}, 300, 200),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glScaled(4F, 4F, 4F);
	                GL11.glTranslatef(-0.850000f, 0.875000f, -2.5f);
	                GL11.glRotatef(20F, 0f, 0f, 1f);
	                GL11.glRotatef(-10F, 1f, 0f, 0f);
	                GL11.glRotatef(-10F, 0f, 1f, 0f);
				}, 400, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(4F, 4F, 4F);
                    GL11.glTranslatef(-0.850000f, 0.875000f, -2.5f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-10F, 0f, 1f, 0f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(4F, 4F, 4F);
                    GL11.glTranslatef(-0.850000f, 0.875000f, -2.5f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glRotatef(-10F, 0f, 1f, 0f);
                }, 130, 150)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(4F, 4F, 4F);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.024999f, 0.650000f, -0.550000f);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(4F, 4F, 4F);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-2.024999f, 0.650000f, -0.550000f);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.VectorMag,
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0F, 2F, 0F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.VectorMag,
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0F, 2F, 0F);
				}, 250, 1000),
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
					)
			
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(4F, 4F, 4F);
				GL11.glTranslatef(0.275000f, 0.775000f, -2.66f);
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.38F, -1.18f, 3.3f);
				} 
				
				// Everything else
				else {
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScaled(4F, 4F, 4F);
                GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-1.349999f, 1.724999f, -1.224999f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScaled(4F, 4F, 4F);
			     GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.674999f, 0.500000f, -0.525000f);
			 })
			  .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4.5f, 4.5f, 4.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.550000f, -0.475000f, 0.400000f);
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
					     GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.325000f, 0.675000f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
					 })
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
					    GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.550000f, -0.925000f, 0.725000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
					    GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.500000f, -0.825000f, 0.525000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, -0.625000f, -0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, -0.625000f, -0.050000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, -0.625000f, -0.050000f);
                    }, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.525000f, 0.12f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.525000f, 0.12f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.525000f, 0.12f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.525000f, 0.12f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.525000f, 0.12f);
                    }, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.825000f, 0.525000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, -0.925000f, 0.725000f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.525000f, 0.12f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.525000f, 0.12f);
					}, 250, 50))
					
			.withFirstPersonHandPositioningZooming(
					(renderContext) -> {
					    GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.675000f, 0.175000f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
					 })
			.build())
		.withSpawnEntityDamage(5.5f)
		.withSpawnEntityGravityVelocity(0.02f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}