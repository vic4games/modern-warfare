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
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Grip2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MP5K;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class MP5KFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("HKMP5K")
//		.withAmmo(CommonProxy.MP5Mag)
//		.withAmmoCapacity(25)
		.withFireRate(0.85f)
		.withRecoil(2.3f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 1)
		//.withMaxShots(5)
		.withShootSound("MP5K")
		.withSilencedShootSound("MP5Silenced")
		.withReloadSound("StandardReload")
		.withUnloadSound("Unload")
		.withReloadingTime(43)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.16f)
		.withFlashOffsetY(() -> 0.12f)
		.withInaccuracy(2)
		.withCreativeTab(ModernWarfareMod.SMGTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Submachine gun", "Damage: 6.6", 
		"Caliber: 9mm", "Magazines:", "25rnd 9mm Magazine",
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
		.withCompatibleAttachment(Magazines.MP5KMag, (model) -> {})
		.withCompatibleAttachment(AuxiliaryAttachments.MP5KGrip, true, (model) -> {
			if(model instanceof Grip2) {
				GL11.glTranslatef(-0.21F, -0.5F, -2.3F);
				GL11.glScaled(1F, 0.8F, 1F);
			}
		})
	  .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
			if(model instanceof G36CIron1) {
				GL11.glTranslatef(-0.21F, -1.94F, 4F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof G36CIron2) {
				GL11.glTranslatef(-0.18F, -1.25F, -3.05F);
				GL11.glScaled(0.5F, 0.54F, 0.5F);
			} else if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.13F, -1.55F, -3.05F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(0.092F, -1.91F, -0.9F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron1) {
				GL11.glTranslatef(0.155F, -1.74F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof P90iron) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
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
				GL11.glTranslatef(-0.1F, -1.235F, -0.2F);
				GL11.glScaled(0.45F, 0.42F, 0.45F);
			}
		})
//		.withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
//			GL11.glTranslatef(0.055F, -1.64F, 0.6F);
//			GL11.glScaled(0.6F, 0.6F, 0.6F);
//		},(model) -> {
//			 if(model instanceof Acog2) {
//				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
//			if(model instanceof Reflex) {
//			GL11.glTranslatef(.27F, -1.48F, 0F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Reflex2) {
//				GL11.glTranslatef(0.202F, -1.8F, 0.0F);
//				GL11.glScaled(0.1F, 0.1F, 0.1F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
//			if(model instanceof Holographic) {
//			GL11.glTranslatef(.264F, -1.53F, 0.2F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Holo2) {
//				GL11.glTranslatef(0.202F, -1.76F, 0.3F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Holographic2, (model) -> {
//			if(model instanceof Holographic2) {
//			GL11.glTranslatef(.264F, -1.53F, 0.2F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Holo2) {
//				GL11.glTranslatef(0.202F, -1.76F, 0.3F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
//			if(model instanceof Kobra) {
//			GL11.glTranslatef(.264F, -1.53F, 0.2F);
//			GL11.glScaled(0.5F, 0.5F, 0.5F);
//			} else if(model instanceof Reflex2) {
//				GL11.glTranslatef(0.202F, -1.76F, -0.2F);
//				GL11.glScaled(0.06F, 0.06F, 0.06F);
//			}
//		})
//		.withCompatibleAttachment(CommonProxy.Grip2, (model) -> {
//			GL11.glTranslatef(.135F, -0.8F, -0.8F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.Grip, (model) -> {
//			GL11.glTranslatef(.135F, -0.65F, -0.8F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
//		.withCompatibleAttachment(CommonProxy.VGrip, (model) -> {
//			GL11.glTranslatef(.135F, -0.8F, -0.8F);
//			GL11.glScaled(0.8F, 0.8F, 0.8F);
//		})
		.withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
			GL11.glTranslatef(-0.2F, -1.08F, -4.8F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("MP5K", "Electric")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new MP5K())
			//.withTextureName("M4A1")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.32F, 0.32F, 0.32F);
				GL11.glTranslatef(1, 1.8f, -1f);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.6F, -0.8F, 1.7F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.425000f, 0.925000f, -0.550000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.425000f, 0.925000f, -0.30000f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.36f, 0.750000f, -0.7f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                }
                
                // Everything else
                else {
                }
                
            
                })
			
			.withFirstPersonCustomPositioning(Magazines.MP5KMag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.MP5KGrip.getRenderablePart(), (renderContext) -> {
				if(renderContext.getWeaponInstance().getAmmo() == 0) {
				}
			})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0.3F, -0.5F, -0.4F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glRotatef(-15F, 1f, 0f, 0f);
						GL11.glScaled(0.6F, 0.6F, 0.6F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 500),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0.3F, -0.5F, -0.4F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-10F, 0f, 0f, 1f);
						GL11.glRotatef(-15F, 1f, 0f, 0f);
						GL11.glScaled(0.6F, 0.6F, 0.6F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 20),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.1F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(-3F, 1f, 0f, 0f);
				}, 350, 60),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.1F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(-3F, 1f, 0f, 0f);
				}, 100, 0),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.1F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(-3F, 1f, 0f, 0f);
				}, 100, 0),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.5F, -0.1F, -0.2F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
					GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
					GL11.glRotatef(-3F, 1f, 0f, 0f);
				}, 250, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.3F, -0.5F, -0.4F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(-15F, 1f, 0f, 0f);
					GL11.glScaled(0.6F, 0.6F, 0.6F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0.3F, -0.5F, -0.4F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 0f, 0f, 1f);
					GL11.glRotatef(-15F, 1f, 0f, 0f);
					GL11.glScaled(0.6F, 0.6F, 0.6F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(Magazines.MP5KMag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 0.5F, -0.2F);
					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(1.3F, 0.5F, -0.8F);
					GL11.glRotatef(10F, 1f, 0f, 0f);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(-90F, 0f, 0f, 1f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(Magazines.MP5KMag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1F, 0F);
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
					
			.withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MP5KGrip.getRenderablePart(),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0F, 0.5F, -0.2F);
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
					
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MP5KGrip.getRenderablePart(),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.05F, 1F, 0F);
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
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.36f, 0.750000f, -0.800000f);
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                }
                
                // Everything else
                else {
                }
                
            
                })
				
			.withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.225000f, 1.025000f, -0.450000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.650000f, 0.650000f, 0.025000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glTranslatef(0.48f, 0.08f, 0.05f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-70f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
					 
			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glTranslatef(1f, 0.3f, -0.3f);
                         GL11.glRotatef(99f, 0, 0f, 1f);
                         GL11.glRotatef(-60f, 20f, 20f, -20f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.3f, 0.8f, 0.3f);
						 GL11.glRotatef(30f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(30f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.3f, 0.6f, 0.3f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(60f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.7f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-70f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.73f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-45f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.73f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-45f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.4f, 2.4f, 3.7f);
						 GL11.glTranslatef(0.7f, 0.3f, -0.05f);
						 GL11.glRotatef(160f, 0, 0f, 1f);
						 GL11.glRotatef(-70f, 1f, 0f, 0f);
						 GL11.glRotatef(50f, 1f, 1f, 0f);
					}, 250, 0)
					)
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 0)
					)
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.65f, -0.2f, 0.37f);
						 GL11.glRotatef(70f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.7f, 1.7f, 3f);
						 GL11.glTranslatef(0.7f, 0f, 0.37f);
						 GL11.glRotatef(50f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(-40f, 0f, 1f, 0f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2.5f, 2.5f, 3f);
						 GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 1f, 0f, 0f);
					}, 250, 50))
			.build())
		.withSpawnEntityDamage(6.6f)
		.withSpawnEntityGravityVelocity(0.028f)
		
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}