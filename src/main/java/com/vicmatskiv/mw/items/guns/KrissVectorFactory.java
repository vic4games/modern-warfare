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
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.KrissVector;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class KrissVectorFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("KrissVector")
		//.withAmmo(CommonProxy.AK47Mag)
//		.withAmmoCapacity(30)
		.withFireRate(0.8f)
		.withRecoil(3f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 2, 1)
		//.withMaxShots(5)
		.withShootSound("Vector")
		.withSilencedShootSound("VectorSilenced")
		.withReloadSound("vectorreload")
		.withUnloadSound("m4unload")
		.withReloadingTime(45)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.15f)
		.withFlashOffsetY(() -> 0.2f)
		.withInaccuracy(2f)
		.withCrafting(CraftingComplexity.LOW, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL,
                CommonProxy.BigSteelPlate)
		.withCreativeTab(ModernWarfareMod.SMGTab)
		.withInformationProvider(stack -> Arrays.asList("Type: Submachine gun", "Damage: 6.8", 
		"Caliber: .45 ACP", "Magazines:", "26rnd .45 ACP Magazine",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(GunSkins.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
				}, 
				(a, i) -> {
				}
		)
		
		.withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("KrissVectorEmerald"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Gold.getTextureVariantIndex("KrissVectorGold"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Sapphire.getTextureVariantIndex("KrissVectorSapphire"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(Magazines.VectorMag, (model) -> {
			GL11.glTranslatef(-0.43F, 0.8F, 0.2F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
			GL11.glRotatef(17F, 1f, 0f, 0f);
		})
		.withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.6F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(-0.205F, -1.38F, -3.75F);
				GL11.glScaled(0.7F, 0.7F, 0.7F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(0.092F, -1.75F, -0.85F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron1) {
				GL11.glTranslatef(-0.19F, -1.34F, -0.2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof P90iron) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
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
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		
		.withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.6F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(-0.22F, -1.38F, -3.75F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(0.092F, -1.75F, -0.85F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron1) {
			    GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof P90iron) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
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
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			 } else if(model instanceof MBUSiron) {
			    GL11.glTranslatef(-0.2F, -1.42F, -0.2F);
	            GL11.glScaled(0.7F, 0.65F, 0.7F);
	         }
		})
		.withCompatibleAttachment(Attachments.MicroT1, (model) -> {
            if(model instanceof MicroT1) {
                GL11.glTranslatef(-0.19F, -1.23F, -0.6F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -1.4F, -0.8F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
			GL11.glTranslatef(-0.36F, -1.22F, -0.5F);
			GL11.glScaled(1F, 1F, 1F);
		},(model) -> {
		    if(model instanceof AcogScope2) {
                GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            else if(model instanceof AcogReticle) {
                GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
		.withCompatibleAttachment(Attachments.Reflex, (model) -> {
			if(model instanceof Reflex) {
				GL11.glTranslatef(-0.05F, -1F, -1.5F);
				GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(-0.125F, -1.405F, -1.6F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(Attachments.Holo2, (model) -> {
			if(model instanceof Holographic) {
				GL11.glTranslatef(-0.02F, -1.05F, -1.5F);
				GL11.glScaled(0.8F, 0.8F, 0.8F);
			} else if(model instanceof Holo2) {
			    GL11.glTranslatef(-0.124F, -1.42F, -1.6F);
                GL11.glScaled(0.08F, 0.08F, 0.08F);
			}
		})
		.withCompatibleAttachment(Attachments.Holographic2, (model) -> {
			if(model instanceof Holographic2) {
			    GL11.glTranslatef(-0.02F, -1.05F, -1.5F);
                GL11.glScaled(0.8F, 0.8F, 0.8F);
			} else if(model instanceof Holo2) {
			    GL11.glTranslatef(-0.124F, -1.42F, -1.6F);
                GL11.glScaled(0.08F, 0.08F, 0.08F);
			}
		})
		.withCompatibleAttachment(Attachments.Kobra, (model) -> {
			if(model instanceof Kobra) {
			GL11.glTranslatef(-0.025F, -1.05F, -0.9F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
			} else if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -1.405F, -1.6F);
				GL11.glScaled(0.1F, 0.1F, 0.1F);
			}
		})
		.withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
			GL11.glTranslatef(-0.245F, -0.47F, -6.7F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
			GL11.glTranslatef(-0.245F, 0.83F, -3.5F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
		.withTextureNames("KrissVector", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new KrissVector())
			//.withTextureName("AK47")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.3F, 0.3F, 0.3F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.24F, 0.24F, 0.24F);
				GL11.glTranslatef(1, 1.5f, -1.5f);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.45F, 0.45F, 0.45F);
				GL11.glTranslatef(-2.1F, -1.2F, 2.2F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
			    GL11.glScaled(3F, 3F, 3F);
			    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
			    GL11.glTranslatef(-0.550000f, 0.925000f, -1.224999f);
			    
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.550000f, 0.95f, -0.95f);
                GL11.glRotatef(-2f, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(0.287f, 1.04f, -0.6f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);

                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, 0.04f, 0.65f);
                } 

                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                } 
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                } 

                // Everything else
                else {
                }   

            })
				
			.withFirstPersonCustomPositioning(Magazines.VectorMag, (renderContext) -> {
//				GL11.glTranslatef(0F, 0.8F, 0F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})				
			
			.withFirstPersonPositioningReloading(
					
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(40F, 0f, 1f, 0f);
	                GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
	                GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
	                GL11.glTranslatef(-0.8f, 1.1f, -1.224999f);
				}, 270, 0),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(40F, 0f, 1f, 0f);
	                GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
	                GL11.glRotatef(2.000000f, 1f, 0f, 0f);
	                GL11.glTranslatef(-0.8f, 1.1f, -1.224999f);
				 }, 400, 200),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(40F, 0f, 1f, 0f);
	                GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
	                GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
	                GL11.glTranslatef(-0.8f, 1.1f, -1.1f);
				 }, 100, 130),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(43F, 0f, 1f, 0f);
	                GL11.glScaled(3F, 3F, 3F);
	                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
	                GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
	                GL11.glTranslatef(-0.6f, 1.2f, -1f);
				}, 500, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.6f, 1.2f, -0.7f);
                }, 200, 70),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.6f, 1.2f, -0.9f);
                }, 180, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.28F, -0.22F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(5F, 1f, 0f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.28F, -0.22F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(5F, 1f, 0f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.VectorMag,
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(1.3F, 0.5F, -0.8F);
//					GL11.glRotatef(10F, 1f, 0f, 0f);
//					GL11.glRotatef(10F, 0f, 1f, 0f);
//					GL11.glRotatef(-90F, 0f, 0f, 1f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.VectorMag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0.7F, 0F);
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
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(4F, 4F, 4F);
				GL11.glTranslatef(0.287f, 1.04f, -0.950000f);

				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, 0.04f, 0.9f);
				} 

				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
					//System.out.println("Position me for Reflex");
				} 
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
					//System.out.println("Position me for Reflex");
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
					//System.out.println("Position me for Holo");
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
					//System.out.println("Position me for Holo");
				} 

				// Everything else
				else {
				}	

			})
				
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScalef(1.5f, 1.5f, 1.5f);
			    GL11.glRotatef(15.000000f, 1f, 0f, 0f);
			    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
			    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
			    GL11.glTranslatef(-0.225000f, 0.500000f, -0.700000f);
			 })
			 
			 .withFirstPersonPositioningModifying((renderContext) -> {
			    GL11.glScalef(1.5f, 1.5f, 1.5f);
			    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
			    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
			    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
			    GL11.glTranslatef(-0.925000f, 0.275000f, 0.125000f);
			 })
			 
			 .withFirstPersonHandPositioning(
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 5f);
					     GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(5.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(35.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(0.025000f, -0.225000f, 0.350000f);
					     
//					     GL11.glScalef(4f, 4f, 5f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(4f, 4f, 4f);
						 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
						 GL11.glScalef(2.8f, 2.8f, 2.8f);
						 GL11.glTranslatef(1f, 0.5f, -0.4f);
						 GL11.glRotatef(99f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 20f, 20f, -20f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						
						GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.300000f, 0.425000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
						GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
						GL11.glRotatef(20.000000f, 0f, 1f, 0f);
						GL11.glRotatef(50.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.050000f, -0.300000f, 0.450000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
						GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
						GL11.glRotatef(55.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(0.200000f, -0.475000f, 0.250000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
					    GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.075000f, -0.550000f, 0.475000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.000000f, -0.675000f, 0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.550000f, 0.475000f);
                    }, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 0.3f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(20f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 0.5f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(20f, 0f, 0f, 1f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
					}, 250, 50))
			.build())
		.withSpawnEntityDamage(6.8f)
		.withSpawnEntityGravityVelocity(0.0118f)
		
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}
