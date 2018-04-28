
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
import com.vicmatskiv.mw.models.M1014;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
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

public class M1014Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M1014")
//		.withAmmo(CommonProxy.Remington870Mag)
		.withAmmoCapacity(8)
		.withMaxBulletsPerReload(7)
		.withIteratedLoad()
        .withEjectSpentRoundSound("pump")
        .withFireRate(0.3f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("M1014")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("drawweapon")
        .withReloadIterationSound("loadshell")
		.withReloadingTime(15)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")	
		.withCrosshairZoomed("Sight")
		.withInaccuracy(7)
		.withPellets(10)
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.1f)
		.withShellCasingEjectEnabled(false)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withCreativeTab(ModernWarfareMod.ShotgunsTab)
		.withInformationProvider(stack -> Arrays.asList("Type: Combat shotgun", "Damage per Pellet: 7", "Pellets per Shot: 10", 
		"Ammo: 12 Gauge Shotgun Shell", "Fire Rate: Semi"))
		.withCompatibleAttachment(GunSkins.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
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
        .withCompatibleAttachment(GunSkins.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Sapphire.getTextureVariantIndex("Sapphire"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleBullet(Bullets.ShotgunShell, (model) -> {})
		.withTextureNames("M1014")
		 .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
			if(model instanceof M4Iron1) {
				GL11.glTranslatef(0.161F, -1.61F, 0.3F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.24F, -1.53F, -1.9F);
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
				GL11.glTranslatef(-0.111F, -0.635F, 0.44F);
				GL11.glScaled(0.16F, 0.16F, 0.16F);
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
				GL11.glTranslatef(-0.118F, -0.61F, -4.5F);
				GL11.glScaled(0.3F, 0.3F, 1F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(-0.145F, -0.84F, 0.5F);
				GL11.glScaled(0.4F, 0.55F, 0.55F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
			GL11.glTranslatef(-0.22F, -0.67F, 0.1F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
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
		.withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
		    GL11.glTranslatef(-0.133F, -0.45F, -0.25F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		.withCompatibleAttachment(Attachments.Reflex, (model) -> {
			if(model instanceof Reflex) {
			GL11.glTranslatef(-0.046F, -0.55F, -0.3F);
			GL11.glScaled(0.3F, 0.3F, 0.3F);
			} else if(model instanceof Reflex2) {
				GL11.glTranslatef(-0.085F, -0.76F, -0.3F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(Attachments.Holo2, (model) -> {
			if(model instanceof Holographic) {
			    GL11.glTranslatef(-0.025F, -0.57F, -0.3F);
	            GL11.glScaled(0.45F, 0.45F, 0.45F);
			} else if(model instanceof Holo2) {
			    GL11.glTranslatef(-0.085F, -0.79F, -0.3F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
			}
		})
		.withCompatibleAttachment(Attachments.Holographic2, (model) -> {
			if(model instanceof Holographic2) {
			    GL11.glTranslatef(-0.025F, -0.57F, -0.3F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.085F, -0.79F, -0.3F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
			}
		})
		.withCompatibleAttachment(Attachments.Kobra, (model) -> {
			if(model instanceof Kobra) {
			    GL11.glTranslatef(-0.025F, -0.57F, -0.3F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
			} else if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.085F, -0.77F, -0.7F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(Attachments.MicroT1, (model) -> {
            if(model instanceof MicroT1) {
                GL11.glTranslatef(-0.13F, -0.67F, -0F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.085F, -0.78F, -0.2F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
		.withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
		    GL11.glTranslatef(-0.19F, -0.6F, -6.9F);
            GL11.glScaled(1.4F, 1.4F, 1.4F);
		})
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M1014())
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
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(1f, -0.075000f, -1f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.5f, 0.35f, -2.1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.5f, 0.35f, -1.9f);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.252f, 0.21f, -1f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
//                GL11.glRotatef(-2.5F, 0f, 1f, 0f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.195f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.185f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.15f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.17f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.17f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.16f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.175f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
          
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 250, 50)
            )
            
            .withFirstPersonPositioningAllLoadIterationsCompleted(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(66.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 230, 50)
            )
            
            .withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(66.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 170, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(67.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(66.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1f, -0.075000f, -1f);
                }, 140, 0)
            )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.252f, 0.21f, -1.3f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.195f, 1f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.185f, 1f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.15f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.17f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.17f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.16f, 0.5f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.175f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.350000f, 0.200000f, -1f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.800000f, -0.300000f, -1.474999f);
             }) 
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.575000f, -0.825000f, 0.275000f);
                     })
                     
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 5.5f);
                         GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2, 2, 2f);
                         GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.300000f, -0.400000f, 0.800000f);
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
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.575000f, -0.825000f, 0.275000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.175000f, -0.450000f, 0.200000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.575000f, -0.825000f, 0.275000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.825000f, 0.275000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.825000f, 0.275000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 5.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-52.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.475000f, -0.275000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.400000f, 0.800000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.425000f, 0.450000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.350000f, 0.300000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.425000f, 0.450000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2, 2, 2f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.400000f, 0.800000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 6.5f);
                        GL11.glRotatef(-0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.525000f, -0.300000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.825000f, 0.275000f);
                    }, 250, 1000)
                    
                    )
                    
					
			.build())
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.8f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}