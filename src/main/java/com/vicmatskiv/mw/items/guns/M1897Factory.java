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
import com.vicmatskiv.mw.models.M1897;
import com.vicmatskiv.mw.models.Remington;
import com.vicmatskiv.mw.models.Remington870;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M1897Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M1897")
//		.withAmmo(CommonProxy.Remington870Mag)
		.withAmmoCapacity(5)
		.withMaxBulletsPerReload(4)
		.withFireRate(0.5f)
		.withEjectRoundRequired()
		.withIteratedLoad()
		.withEjectSpentRoundSound("m1897pump")
        .withPumpTimeout(700)
        .withFireRate(0.1f)
        .withRecoil(9f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("m1897")
        .withSilencedShootSound("ShotgunSilenced")
        .withReloadSound("drawweapon")
        .withReloadIterationSound("loadshell")
        .withAllReloadIterationsCompletedSound("m1897pump")
		.withReloadingTime(15)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")	
		.withShellCasingEjectEnabled(false)
		.withCrosshairZoomed("Sight")
		.withInaccuracy(18)
		.withPellets(10)
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.5f)
		.withFlashOffsetX(() -> 0.11f)
		.withFlashOffsetY(() -> 0.06f)
		.withCreativeTab(ModernWarfareMod.ShotgunsTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Shotgun", "Damage per Pellet: 7", "Pellets per Shot: 10", 
		"Cartridge: 12 Gauge Shotgun Shell", "Fire Rate: Pump-Action"))
		.withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(AuxiliaryAttachments.M1897pump, true, (model) -> {
		})
		.withCompatibleAttachment(Attachments.Silencer12Gauge, (model) -> {
			GL11.glTranslatef(-0.19F, -0.6F, -8F);
			GL11.glScaled(1.4F, 1.4F, 1.4F);
		})
		.withCompatibleAttachment(GunSkins.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Voltaic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Voltaic.getTextureVariantIndex("Voltaic"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Cosmos, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Cosmos.getTextureVariantIndex("Cosmos"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Volcanic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Volcanic.getTextureVariantIndex("Volcanic"));
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
        .withCompatibleAttachment(GunSkins.Desert, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Desert.getTextureVariantIndex("Desert"));
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
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Ruby, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Ruby.getTextureVariantIndex("Ruby"));
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
        .withCompatibleAttachment(GunSkins.Asiimov, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Asiimov.getTextureVariantIndex("Asiimov"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Vulcan, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Vulcan.getTextureVariantIndex("Vulcan"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.CrystalCrimson, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.CrystalCrimson.getTextureVariantIndex("CrystalCrimson"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.PinkIsTheNewBlack, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.PinkIsTheNewBlack.getTextureVariantIndex("PinkIsTheNewBlack"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.DynamicBundle, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.DynamicBundle.getTextureVariantIndex("DynamicBundle"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Woodland_Digital, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Woodland_Digital.getTextureVariantIndex("Woodland_Digital"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Desert_Digital, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Desert_Digital.getTextureVariantIndex("Desert_Digital"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Foliage, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Foliage.getTextureVariantIndex("Foliage"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleBullet(Bullets.ShotgunShell, (model) -> {})
		.withTextureNames("Remington870")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M1897())
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
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-21.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.325000f, 0.100000f, -1.050000f);
                })
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glRotatef(5F, 0f, 0f, 1f);
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glTranslatef(-0.300000f, 0.275000f, -1.174999f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.300000f, 0.275000f, -1f);
				GL11.glRotatef(-1.5F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.250000f, 0.150000f, -0.9f);
                GL11.glRotatef(-2.5F, 1f, 0f, 0f);
//                GL11.glRotatef(-2.5F, 0f, 1f, 0f);
                
//              // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.M1897pump.getRenderablePart(), (renderContext) -> {
				})
				
			.withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.M1897pump.getRenderablePart(), (renderContext) -> {
                })
				
			.withFirstPersonPositioningEjectSpentRound(
			        new Transition((renderContext) -> { // Reload position
			        	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
						GL11.glRotatef(0.000000f, 1f, 0f, 0f);
						GL11.glRotatef(25.000000f, 0f, 1f, 0f);
						GL11.glRotatef(25.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.325000f, 0.500000f, -1.125000f);
	                }, 170, 0),
	                
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
	    				GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
	    				GL11.glRotatef(15.000000f, 0f, 1f, 0f);
	    				GL11.glRotatef(37.000000f, 0f, 0f, 1f);
	    				GL11.glTranslatef(-0.325000f, 0.53f, -1.05f);
	                }, 150, 0),
	                
	                new Transition((renderContext) -> { // Reload position
	                	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
	    				GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
	    				GL11.glRotatef(15.000000f, 0f, 1f, 0f);
	    				GL11.glRotatef(30.000000f, 0f, 0f, 1f);
	    				GL11.glTranslatef(-0.325000f, 0.500000f, -1.125000f);
	                }, 120, 0)
					
					)
					
			.withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.M1897pump.getRenderablePart(),
					new Transition((renderContext) -> { // Reload position
					}, 150, 50),
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0f, 0f, 0.7f);
					}, 170, 50),
					new Transition((renderContext) -> { // Reload position
					}, 150, 50)
					
					)
					
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M1897pump.getRenderablePart(),
				new Transition((renderContext) -> { // Reload position
				}, 250, 50),
				new Transition((renderContext) -> { // Reload position
				}, 250, 50)
				)
				
			.withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.M1897pump.getRenderablePart(),
                new Transition((renderContext) -> { // Reload position\
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0F, 0F, 0.7F);
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
            )
            
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.M1897pump.getRenderablePart(),  
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50),
                
                new Transition((renderContext) -> { // Reload position
                }, 250, 50)
            )
				
			.withFirstPersonPositioningReloading(
					
				new Transition((renderContext) -> { // Reload position
					GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
					GL11.glRotatef(2.000000f, 1f, 0f, 0f);
					GL11.glRotatef(43.000000f, 0f, 1f, 0f);
					GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
					GL11.glTranslatef(-0.325000f, 0.18f, -1.050000f);
				}, 300, 0),
				
				new Transition((renderContext) -> { // Reload position
					GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
					GL11.glRotatef(5.000000f, 1f, 0f, 0f);
					GL11.glRotatef(39.000000f, 0f, 1f, 0f);
					GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
					GL11.glTranslatef(-0.325000f, 0.100000f, -1.050000f);
				}, 280, 0)
			)
			
			.withFirstPersonPositioningAllLoadIterationsCompleted(
                    
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
	                    GL11.glRotatef(3.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-19.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.325000f, 0.100000f, -1.050000f);
	                }, 200, 0),
	                
	                new Transition((renderContext) -> { // Reload position
	                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
	                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(41.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-19.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.325000f, 0.100000f, -1f);
	                }, 140, 100),
	                
	                new Transition((renderContext) -> { // Reload position
	                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
	                    GL11.glRotatef(4.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(42.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.325000f, 0.100000f, -1.050000f);
	                }, 110, 0)
            )
			
			.withFirstPersonPositioningLoadIteration(   
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
    				GL11.glRotatef(6.000000f, 1f, 0f, 0f);
    				GL11.glRotatef(40.000000f, 0f, 1f, 0f);
    				GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
    				GL11.glTranslatef(-0.325000f, 0.100000f, -1.050000f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
    				GL11.glRotatef(5.000000f, 1f, 0f, 0f);
    				GL11.glRotatef(41.000000f, 0f, 1f, 0f);
    				GL11.glRotatef(-19.000000f, 0f, 0f, 1f);
    				GL11.glTranslatef(-0.325000f, 0.13f, -1.050000f);
                }, 170, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
    				GL11.glRotatef(3.000000f, 1f, 0f, 0f);
    				GL11.glRotatef(42.000000f, 0f, 1f, 0f);
    				GL11.glRotatef(-18.000000f, 0f, 0f, 1f);
    				GL11.glTranslatef(-0.325000f, 0.14f, -1.050000f);
                }, 140, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
    				GL11.glRotatef(3.000000f, 1f, 0f, 0f);
    				GL11.glRotatef(41.000000f, 0f, 1f, 0f);
    				GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
    				GL11.glTranslatef(-0.325000f, 0.12f, -1.050000f);
                }, 150, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
    				GL11.glRotatef(4.000000f, 1f, 0f, 0f);
    				GL11.glRotatef(41.000000f, 0f, 1f, 0f);
    				GL11.glRotatef(-21.000000f, 0f, 0f, 1f);
    				GL11.glTranslatef(-0.325000f, 0.100000f, -1.050000f);
                }, 140, 0)
            )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, -0.025000f, -1.274999f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.150000f, 0.325000f, -1.349999f);
                  }, 350, 600)
                    )
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
				GL11.glTranslatef(0.250000f, 0.17f, -1.1f);
				
//				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
					//System.out.println("Position me for Holo");
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
                GL11.glTranslatef(-0.350000f, 0.200000f, -0.400000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
			     GL11.glRotatef(0.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-0.375000f, -0.200000f, -1.274999f);
			 }) 
			.withFirstPersonHandPositioning(
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 4f);
					     GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(40.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(2.5f, 2.5f, 2.5f);
					     GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(20.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(0.575000f, -0.825000f, -0.000000f);
					     
//					     GL11.glScalef(2.5f, 2.5f, 2.5f);
					 })
					 
			.withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.500000f, -0.600000f, 0.400000f);
                     })
					 
			.withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.575000f, -0.825000f, -0.000000f);
                     })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
					     GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(2.5f, 2.5f, 2.5f);
                         GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.575000f, -0.825000f, -0.000000f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
					}, 250, 50)
					)
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.600000f, 0.400000f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.600000f, 0.400000f);
					}, 250, 50)
					)
					
			.withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.600000f, 0.400000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.575000f, 0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.675000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.600000f, 0.400000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
            		new Transition((renderContext) -> { // Reload position
            		    GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50),
					
			        new Transition((renderContext) -> { // Reload position
			            GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.065000f, -0.695000f, 0.280000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50)
					
					)
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.875000f, -0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.875000f, -0.125000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.875000f, -0.125000f);
                    }, 250, 50)
                    )
					
			.withFirstPersonLeftHandPositioningEjectSpentRound(
			        new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.065000f, -0.695000f, 0.280000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50)
                    
                    )
					
			.withFirstPersonRightHandPositioningEjectSpentRound(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.875000f, -0.125000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.875000f, -0.125000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.875000f, -0.125000f);
					}, 250, 50)
					
					)
					
		    .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.525000f, 0.230000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.875000f, -0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.875000f, -0.125000f);
                    }, 250, 50))
					
			.build())
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.8f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}