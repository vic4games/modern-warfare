package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.FNP90;
import com.vicmatskiv.mw.models.FNP90Sight;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class FNP90Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("FNP90")
//		.withAmmo(CommonProxy.PX90Mag)
//		.withAmmoCapacity(50)
		.withFireRate(0.75f)  
		.withRecoil(2.8f)
		.withZoom(0.9f)
		//.withMaxShots(5)
		.withShootSound("P90")
		.withSilencedShootSound("m9silenced")
		.withReloadSound("P90Reload")
		.withUnloadSound("Unload")
		.withReloadingTime(70)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.29f)
		.withFlashOffsetY(() -> 0.3f)
		.withCreativeTab(ModernWarfareMod.SMGTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Personal defense weapon", "Damage: 6.5", 
		"Caliber: 5.7x28mm", "Magazines:", "50rnd 5.7x28mm Magazine",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(GunSkins.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
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
		.withCompatibleAttachment(GunSkins.Fade, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Fade.getTextureVariantIndex("Ruby"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
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
         .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(Magazines.FNP90Mag, (model) -> {
//		    GL11.glTranslatef(0F, -0.17F, 0F);
//		    GL11.glRotatef(2F, 1f, 0f, 1f);
		})
		.withCompatibleAttachment(AuxiliaryAttachments.FNP90Sight, true, (model) -> {
			if(model instanceof FNP90Sight) {
				GL11.glTranslatef(0.045F, -1.7F, -0.3F);
				GL11.glScaled(0.75F, 0.9F, 0.9F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(0.19F, -1.76F, 0F);
				GL11.glScaled(0.2F, 0.2F, 0.2F);
			}
		})
		.withCompatibleAttachment(Attachments.Laser, (p, s) -> {
			GL11.glTranslatef(.34F, -1.7F, -0.1F);
			GL11.glScaled(0.65F, 0.65F, 0.65F);
		})
		.withCompatibleAttachment(Attachments.Silencer57x38, (model) -> {
			GL11.glTranslatef(0.107F, -1.2F, -2.14F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("ak12")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new FNP90())
			//.withTextureName("PX90")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(2f, 0.5f, 0);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(-1.8F, 0.7F, 1.5F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})	
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glScaled(4F, 4F, 4F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(4F, 0f, 0f, 1f);
				GL11.glTranslatef(-0.850000f, 1.374999f, -3.725005f);
				
//				GL11.glScaled(4F, 4F, 4F);
//                GL11.glRotatef(40F, 0f, 1f, 0f);
//                GL11.glRotatef(4F, 0f, 0f, 1f);
//                GL11.glRotatef(4F, 1f, 0f, 0f);
//                GL11.glTranslatef(-0.850000f, 1.374999f, -3.725005f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glScaled(4F, 4F, 4F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.850000f, 1.374999f, -3.5f);
				GL11.glRotatef(-1F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glScaled(4F, 4F, 4F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(-0.03f, 1.48f, -2.7f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                } 
                // Everything else
                else {
                }
                
            
                })
				
			.withFirstPersonCustomPositioning(Magazines.FNP90Mag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScaled(4F, 4F, 4F);
		                GL11.glRotatef(37F, 0f, 1f, 0f);
		                GL11.glRotatef(6F, 0f, 0f, 1f);
		                GL11.glRotatef(6F, 1f, 0f, 0f);
		                GL11.glTranslatef(-0.850000f, 1.374999f, -3.725005f);
					}, 350, 150),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScaled(4F, 4F, 4F);
		                GL11.glRotatef(40F, 0f, 1f, 0f);
		                GL11.glRotatef(4F, 0f, 0f, 1f);
		                GL11.glRotatef(4F, 1f, 0f, 0f);
		                GL11.glTranslatef(-0.850000f, 1.374999f, -3.725005f);
					}, 320, 50),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(4F, 4F, 4F);
	                GL11.glRotatef(40F, 0f, 1f, 0f);
	                GL11.glRotatef(4F, 0f, 0f, 1f);
	                GL11.glRotatef(3F, 1f, 0f, 0f);
	                GL11.glTranslatef(-0.850000f, 1.374999f, -3.725005f);
				}, 330, 200),
				
				new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(4F, 4F, 4F);
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(4F, 0f, 0f, 1f);
                    GL11.glRotatef(-1F, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.850000f, 1.4f, -3.725005f);
                }, 100, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(4F, 4F, 4F);
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(4F, 0f, 0f, 1f);
                    GL11.glRotatef(3F, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.850000f, 1.374999f, -3.725005f);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(4F, 4F, 4F);
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(4F, 0f, 0f, 1f);
                    GL11.glRotatef(3F, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.850000f, 1.374999f, -3.725005f);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.FNP90Mag,
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0F, -0.17F, 0F);
                    GL11.glRotatef(2F, 1f, 0f, 1f);
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(1F, 1F, 0.5F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.FNP90Mag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(1F, 1F, 0.5F);
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0F, -0.17F, 0F);
		            GL11.glRotatef(2F, 1f, 0f, 1f);
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0f, 0f, 0.1f);
		            GL11.glRotatef(4F, 1f, 0f, 0f);
				}, 250, 1000),
				new Transition((renderContext) -> {
                }, 250, 1000)
					)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
			    GL11.glScaled(4F, 4F, 4F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(-0.03f, 1.48f, -2.8f);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					//System.out.println("Position me for Acog");
				} 
				// Everything else
				else {
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScaled(4F, 4F, 4F);
				GL11.glRotatef(0.000000f, 1f, 0f, 0f);
				GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
				GL11.glRotatef(25.000000f, 0f, 0f, 1f);
				GL11.glTranslatef(-1.3f, 2.2f, -1.6f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScaled(4F, 4F, 4F);
			     GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.574999f, 1.100000f, -2.275000f);
			 })
			  .withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(3f, 3f, 3.5f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(-0.350000f, -0.800000f, -0.075000f);
						 
//						 GL11.glScalef(3f, 3f, 3.5f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(3f, 3f, 4f);
						 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.700000f, -0.725000f, -0.000000f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
						 GL11.glScalef(2.2f, 2.2f, 2.2f);
						 GL11.glTranslatef(1f, 0.2f, 0.2f);
						 GL11.glRotatef(99f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 20f, 20f, -20f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(3f, 3f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.700000f, -0.725000f, -0.000000f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3.5f);
						GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
						GL11.glRotatef(80.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.700000f, -1.125000f, -0.125000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3.5f);
						GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
						GL11.glRotatef(70.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.700000f, -0.700000f, -0.350000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3.5f);
						GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
						GL11.glRotatef(55.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.550000f, -0.725000f, -0.500000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3.5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.675000f, -0.775000f, -0.325000f);
                    }, 50, 200))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.725000f, -0.000000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.725000f, -0.000000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.725000f, -0.000000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.725000f, -0.000000f);
                    }, 250, 50))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, -0.725000f, -0.500000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3.5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, -1.125000f, -0.125000f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.725000f, -0.000000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.725000f, -0.000000f);
					}, 250, 50))
					
			.build())
		.withSpawnEntityDamage(6.5f)
		.withSpawnEntityGravityVelocity(0.028f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}
