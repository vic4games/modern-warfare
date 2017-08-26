package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.MP7;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class MP7Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("HKMP7")
//		.withAmmo(CommonProxy.MP7Mag)
//		.withAmmoCapacity(20)
		.withFireRate(0.8f)
		.withRecoil(3.3f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 3, 1)
		//.withMaxShots(5)
		.withShootSound("MP7")
		.withSilencedShootSound("MP5Silenced")
		.withReloadSound("mp7reload")
		.withUnloadSound("mp7unload")
		.withReloadingTime(37)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.2f)
		.withFlashOffsetY(() -> 0.21f)
		.withCreativeTab(ModernWarfareMod.SMGTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Personal defense weapon", "Damage: 6.6", 
		"Caliber: 4.6x30mm", "Magazines:", "20rnd 4.6x30mm Magazine",
		"Fire Rate: Auto"))
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
		.withCompatibleAttachment(Magazines.HKMP7Mag, (model) -> {})
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
			GL11.glTranslatef(0.01F, -1.66F, 1F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		},(model) -> {
			 if(model instanceof Acog2) {
				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		
		.withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(0.125F, -1.35F, 0.7F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		.withCompatibleAttachment(Attachments.Reflex, (model) -> {
			if(model instanceof Reflex) {
			GL11.glTranslatef(.27F, -1.48F, 0.2F);
			GL11.glScaled(0.5F, 0.5F, 0.5F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(0.202F, -1.81F, 0.2F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(Attachments.Holo2, (model) -> {
			if(model instanceof Holographic) {
			GL11.glTranslatef(.27F, -1.53F, 0.6F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(0.196F, -1.82F, 0.45F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(Attachments.Holographic2, (model) -> {
			if(model instanceof Holographic2) {
			    GL11.glTranslatef(.27F, -1.53F, 0.6F);
	            GL11.glScaled(0.6F, 0.6F, 0.6F);
	            } else if(model instanceof Holo2) {
	                GL11.glTranslatef(0.196F, -1.82F, 0.45F);
	                GL11.glScaled(0.06F, 0.06F, 0.06F);
	            }
		})
		.withCompatibleAttachment(Attachments.Kobra, (model) -> {
			if(model instanceof Kobra) {
			GL11.glTranslatef(.28F, -1.53F, 0.6F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Reflex2) {
			    GL11.glTranslatef(0.202F, -1.78F, 0.2F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
			GL11.glTranslatef(.3F, -1.2F, -0.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Laser, (p, s) -> {
			GL11.glTranslatef(.3F, -1.2F, -0.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.SilencerMP7, (model) -> {
			GL11.glTranslatef(0.107F, -1.26F, -2.6F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("AK12", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new MP7())
			//.withTextureName("M4A1")
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
				GL11.glTranslatef(-1.8F, 0.3F, 1.5F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glTranslatef(-0.775000f, 1.399999f, -2.400000f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.775000f, 1.399999f, -2.2f);
				GL11.glRotatef(-1F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.025000f, 1.224999f, -2.55f);
                GL11.glRotatef(-0.2F, 1f, 0f, 0f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.23f, 1.2f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, 0.18f, 1.05f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.22f, 0.8f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.19f, 0.8f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.19f, 0.8f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.18f, 0.8f);
                }
                
                // Everything else
                else {
                }
                
            
                })
			
			.withFirstPersonCustomPositioning(Magazines.HKMP7Mag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
					    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-1.199999f, 0.300000f, -2.074999f);
					}, 300, 60),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
					    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-1.199999f, 0.300000f, -2.074999f);
					}, 300, 200),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
				    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
				    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
				    GL11.glTranslatef(-0.650000f, 1.324999f, -1.949999f);
				}, 400, 80)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.199999f, 0.300000f, -2.074999f);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.199999f, 0.300000f, -2.074999f);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.HKMP7Mag,
				new Transition((renderContext) -> {
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.2F, 1.6F, -0.2F);
					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.HKMP7Mag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1.6F, 0F);
					GL11.glRotatef(-20F, 1f, 0f, 0f);
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
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glTranslatef(-0.025000f, 1.224999f, -2.625001f);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.23f, 1.2f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, 0.18f, 1.05f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.22f, 0.8f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
				    GL11.glTranslatef(0F, 0.19f, 0.8f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
					//System.out.println("Position me for Holo");
				    GL11.glTranslatef(0F, 0.19f, 0.8f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
					//System.out.println("Position me for Holo");
				    GL11.glTranslatef(0F, 0.18f, 0.8f);
				}
				
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glRotatef(0.000000f, 1f, 0f, 0f);
				GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
				GL11.glRotatef(25.000000f, 0f, 0f, 1f);
				GL11.glTranslatef(-0.650000f, 1.524999f, -1.649999f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
			     GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.474999f, 0.825000f, -1.249999f);
			 })
			  .withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(4f, 4f, 5f);
						 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(55.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(-0.300000f, -0.650000f, 0.200000f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(4f, 4f, 5f);
						 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.550000f, -0.800000f, 0.125000f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 4f);
					     GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(70.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(-0.325000f, -0.750000f, 0.225000f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.550000f, -0.800000f, 0.125000f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(4f, 4f, 4f);
						GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
						GL11.glRotatef(5.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(0.100000f, -1.199999f, 0.150000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
						GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
						GL11.glRotatef(30.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.425000f, -1.174999f, 0.050000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
					    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.450000f, -0.850000f, 0.075000f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.800000f, 0.125000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.800000f, 0.125000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.800000f, 0.125000f);
					}, 250, 0))
			
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -1.174999f, 0.050000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -1.199999f, 0.150000f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.800000f, 0.125000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.550000f, -0.800000f, 0.125000f);
					}, 250, 50))
					
			.build())
		.withSpawnEntityDamage(6.6f)
		.withSpawnEntityGravityVelocity(0.028f)
		
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}