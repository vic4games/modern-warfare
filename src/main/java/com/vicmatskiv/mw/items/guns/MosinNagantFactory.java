package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.BulletBig;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MosinBolt;
import com.vicmatskiv.mw.models.MosinBolt2;
import com.vicmatskiv.mw.models.MosinNagant;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class MosinNagantFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("MosinNagantM91-30")
//		.withAmmo(CommonProxy.XWPMag)
		.withAmmoCapacity(5)
		.withFireRate(0.16f)
		.withIteratedLoad()
		.withEjectRoundRequired()
		.withEjectSpentRoundSound("MosinBoltAction")
		.withRecoil(6f)
		.withZoom(0.8f)
		.withMaxShots(1)
		.withShootSound("MosinNagant")
		.withPumpTimeout(1400)
		//.withSilencedShootSound("AR15silenced")
		.withReloadSound("mosinreloadstage1")
		.withAllReloadIterationsCompletedSound("mosinreloadstage3")
		.withReloadIterationSound("loadbullet")
//		 .withReloadSound("drawweapon")
//        .withReloadIterationSound("loadshell")
		.withReloadingTime(2000)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.1f)
		.withCreativeTab(ModernWarfareMod.SnipersTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.MetalComponents,
                CompatibleBlocks.PLANK)
		.withInformationProvider(stack -> Arrays.asList("Type: Bolt-action rifle", "Damage: 20", "Cartridge:", "7.62x54mm Bullet" ,"Fire Rate: Bolt Action"))
		.withCompatibleAttachment(AuxiliaryAttachments.MosinBolt, true, (model) -> {
			if(model instanceof MosinBolt) {
				GL11.glTranslatef(0.85F, -1.29F, -0.03F);
                GL11.glScaled(0.9F, 0.85F, 0.95F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
                
//                GL11.glTranslatef(-0.015F, -0.18F, 0.7F);
//                GL11.glScaled(0.9F, 0.85F, 0.95F);
			}
		})
		.withCompatibleAttachment(AuxiliaryAttachments.MosinBolt2, true, (model) -> {
            if(model instanceof MosinBolt2) {
                GL11.glTranslatef(0.033F, -0.018F, -0F);
                GL11.glScaled(1.2F, 1F, 1F);
            }
        })
//        .withCompatibleAttachment(AuxiliaryAttachments.Bullet, true, (model) -> {
//            if(model instanceof BulletBig) {
//            GL11.glTranslatef(0F, -1F, -1F);
//            GL11.glScaled(4F, 4F, 4F);
//            }
//        })
		.withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
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
//        .withCompatibleAttachment(Attachments.PSO1, (player, stack) -> {
//            
//            GL11.glTranslatef(0.349F, -1.1F, -0.2F);
//            GL11.glScaled(0.7F, 0.7F, 0.7F);
//        },(model) -> {
//             if(model instanceof LPscope) {
//                GL11.glTranslatef(-0.209F, -0.485F, 1.27F);
//                GL11.glScaled(0.07F, 0.07F, 0.07F);
//            }
//             else if(model instanceof PSO12) {
//                 GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
//                 GL11.glScaled(0.8F, 0.8F, 0.8F);
//             }
//        })
		.withCompatibleBullet(Bullets.Bullet762x54, (model) -> {})
		.withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
	    	if(model instanceof M4Iron1) {
	    		GL11.glTranslatef(0.17F, -1.42F, 0.43F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.255F, -0.8F, -2.25F);
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
				GL11.glTranslatef(-0.27F, -1.58F, -3.45F);
				GL11.glScaled(0.7F, 0.7F, 0.7F);
			} else if(model instanceof G36CIron1) {
				GL11.glTranslatef(-0.22F, -1.94F, -1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof G36CIron2) {
			    GL11.glTranslatef(-0.207F, -1.245F, -9.165F);
                GL11.glScaled(0.35F, 0.35F, 0.65F);
			} else if(model instanceof ScarIron1) {
				GL11.glTranslatef(0.165F, -1.65F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.55F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(0.125F, -1.43F, -4.88F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withTextureNames("MosinNagant")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new MosinNagant())
			.withPrepareFirstLoadIterationAnimationDuration(1300)
            .withAllLoadIterationAnimationsCompletedDuration(1100)
			//.withTextureName("AWP")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.32F, 0.32F, 0.32F);
				GL11.glTranslatef(1, 0.8f, 0);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
			    GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(-0.6f, 1f, -0.1f);
				GL11.glRotatef(5F, 0f, 0f, 1f);
				
//				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(35.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.200000f, 1.100000f, 0.525000f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.6f, 1.05f, 0.3f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
				GL11.glRotatef(-2.5F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.39f, 0.750000f, 0.7f);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Scope");
                }   

                // Everything else
                else {
                }   
            
                })
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.MosinBolt.getRenderablePart(), (renderContext) -> {
				})
				
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.MosinBolt2.getRenderablePart(), (renderContext) -> {
                })
                
//            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Bullet.getRenderablePart(), (renderContext) -> {
////                GL11.glScaled(0F, 0F, 0F);
//                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.MosinBolt.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-1.2F, -1F, 0.7F);
                GL11.glScaled(0.9F, 0.85F, 0.95F);
                GL11.glRotatef(90f, 0f, 0f, 1f);
                })
                
//            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.Bullet.getRenderablePart(), (renderContext) -> {
//                GL11.glScaled(0F, 0F, 0F);
////                GL11.glRotatef(90f, 0f, 0f, 1f);
//                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.MosinBolt2.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                GL11.glScaled(1.2F, 1F, 1F);
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.300000f, 1.200000f, 0.525000f);
                })
				
			.withFirstPersonPositioningEjectSpentRound(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
					    GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(44.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.250000f, 1.174999f, 0.425000f);
					}, 200, 10),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
					    GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(43.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.250000f, 1.174999f, 0.46f);
					}, 210, 10),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
					    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(42.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.250000f, 1.174999f, 0.8f);
					}, 200, 20),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
					    GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(44.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.250000f, 1.174999f, 0.425000f);
                    }, 220, 10),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(44.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, 1.174999f, 0.425000f);
                    }, 210, 10)
					
					)
					
			.withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.MosinBolt.getRenderablePart(),
					new Transition((renderContext) -> { // Reload position
						
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
					    GL11.glTranslatef(-1.2F, -1F, -0.03F);
	                    GL11.glScaled(0.9F, 0.85F, 0.95F);
	                    GL11.glRotatef(90f, 0f, 0f, 1f);
					}, 250, 300),
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(-1.2F, -1F, 0.7F);
	                    GL11.glScaled(0.9F, 0.85F, 0.95F);
	                    GL11.glRotatef(90f, 0f, 0f, 1f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glTranslatef(-1.2F, -1F, -0.03F);
                        GL11.glScaled(0.9F, 0.85F, 0.95F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
					
					)
					
//			.withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Bullet.getRenderablePart(),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0F, 0F, 0F);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0F, 0F, 0F);
//                    }, 250, 300),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0F, 0F, 0F);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0F, 0F, 0F);
//                    }, 250, 0),
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0F, 0F, 0F);
//                    }, 250, 0)
//                    
//                    )
					
			.withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.MosinBolt2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                        GL11.glScaled(1.2F, 1F, 1F);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )
				
			.withFirstPersonPositioningReloading(
					
				new Transition((renderContext) -> { // Reload position
				    GL11.glRotatef(45F, 0f, 1f, 0f);
	                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
	                GL11.glTranslatef(-0.6f, 1f, -0.1f);
	                GL11.glRotatef(7F, 0f, 0f, 1f);
	                GL11.glRotatef(2F, 1f, 0f, 0f);
				}, 400, 50),
				new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.300000f, 1.200000f, 0.525000f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.300000f, 1.200000f, 0.525000f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.300000f, 1.200000f, 0.525000f);
                }, 250, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.300000f, 1.200000f, 0.525000f);
                }, 400, 40)
			)
					
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MosinBolt.getRenderablePart(),
				new Transition((renderContext) -> { 
				}, 250, 50),
				new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.2F, -1F, -0.03F);
                    GL11.glScaled(0.9F, 0.85F, 0.95F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.2F, -1F, 0.7F);
                    GL11.glScaled(0.9F, 0.85F, 0.95F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.2F, -1F, 0.7F);
                    GL11.glScaled(0.9F, 0.85F, 0.95F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50)
				)
				
//			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Bullet.getRenderablePart(),
//                new Transition((renderContext) -> { 
//                    GL11.glScaled(0F, 0F, 0F);
//                }, 250, 50),
//                new Transition((renderContext) -> { 
//                    GL11.glScaled(0F, 0F, 0F);
//                }, 250, 50),
//                new Transition((renderContext) -> { 
//                    GL11.glScaled(0F, 0F, 0F);
//                }, 250, 50),
//                new Transition((renderContext) -> { 
//                    GL11.glScaled(0F, 0F, 0F);
//                }, 250, 50),
//                new Transition((renderContext) -> { 
//                    GL11.glScaled(0F, 0F, 0F);
//                }, 250, 50)
//                )
				
			.withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MosinBolt2.getRenderablePart(),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                    GL11.glScaled(1.2F, 1F, 1F);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                    GL11.glScaled(1.2F, 1F, 1F);
                }, 250, 50)
                )
				
			.withFirstPersonPositioningLoadIteration(
			        new Transition((renderContext) -> { 
			            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
	                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.300000f, 1.200000f, 0.525000f);
	                }, 200, 20),
	                new Transition((renderContext) -> { 
	                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
	                    GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.300000f, 1.200000f, 0.525000f);
	                }, 180, 20),
	                new Transition((renderContext) -> { 
	                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
	                    GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.300000f, 1.25f, 0.525000f);
	                }, 210, 20),
	                new Transition((renderContext) -> { 
	                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
	                    GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.300000f, 1.25f, 0.525000f);
	                }, 180, 0),
	                new Transition((renderContext) -> { 
	                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
	                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
	                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                    GL11.glTranslatef(-0.300000f, 1.200000f, 0.525000f);
	                }, 220, 20))
	                
	        .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.MosinBolt2.getRenderablePart(), 
	                new Transition((renderContext) -> {
	                    GL11.glTranslatef(0.033F, -0.018F, 0.7F);
	                    GL11.glScaled(1.2F, 1F, 1F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                        GL11.glScaled(1.2F, 1F, 1F);
                    }, 250, 50),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                        GL11.glScaled(1.2F, 1F, 1F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                        GL11.glScaled(1.2F, 1F, 1F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                        GL11.glScaled(1.2F, 1F, 1F);
                    }, 250, 50))
                    
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.MosinBolt.getRenderablePart(), 
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
                        GL11.glScaled(0.9F, 0.85F, 0.95F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
                        GL11.glScaled(0.9F, 0.85F, 0.95F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
                        GL11.glScaled(0.9F, 0.85F, 0.95F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
                        GL11.glScaled(0.9F, 0.85F, 0.95F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
                        GL11.glScaled(0.9F, 0.85F, 0.95F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50))
                    
//             .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.Bullet.getRenderablePart(), 
//                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
//                        GL11.glScaled(0.9F, 0.85F, 0.95F);
//                        GL11.glRotatef(90f, 0f, 0f, 1f);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
//                        GL11.glScaled(0.9F, 0.85F, 0.95F);
//                        GL11.glRotatef(90f, 0f, 0f, 1f);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
//                        GL11.glScaled(0.9F, 0.85F, 0.95F);
//                        GL11.glRotatef(90f, 0f, 0f, 1f);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
//                        GL11.glScaled(0.9F, 0.85F, 0.95F);
//                        GL11.glRotatef(90f, 0f, 0f, 1f);
//                    }, 250, 50),
//                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
//                        GL11.glScaled(0.9F, 0.85F, 0.95F);
//                        GL11.glRotatef(90f, 0f, 0f, 1f);
//                    }, 250, 50))
			
			.withFirstPersonPositioningAllLoadIterationsCompleted(
			        new Transition((renderContext) -> { 
			            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, 1.200000f, 0.525000f);
                    }, 300, 50),
			        new Transition((renderContext) -> { 
			            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, 1.200000f, 0.525f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, 1.200000f, 0.525f);
                    }, 250, 100),
                    new Transition((renderContext) -> { 
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, 1.200000f, 0.4f);
                    }, 250, 50))
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.MosinBolt.getRenderablePart(), 
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
                        GL11.glScaled(0.9F, 0.85F, 0.95F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.2F, -1F, 0.7F);
                        GL11.glScaled(0.9F, 0.85F, 0.95F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.2F, -1F, -0.03F);
                        GL11.glScaled(0.9F, 0.85F, 0.95F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50))
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.MosinBolt2.getRenderablePart(), 
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                        GL11.glScaled(1.2F, 1F, 1F);
                    }, 250, 50),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.033F, -0.018F, 0.7F);
                        GL11.glScaled(1.2F, 1F, 1F);
                    }, 250, 50),
                    new Transition((renderContext) -> {
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50))
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.39f, 0.750000f, 0.400000f);
				
				// Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Scope");
                }   

                // Everything else
                else {
                }   
			
				})
				
			.withFirstPersonPositioningRunning((renderContext) -> {
			    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
			    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
			    GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
			    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
			    GL11.glTranslatef(-0.300000f, 1.100000f, 0.800000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
			     GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.200000f, 0.550000f, 1.300000f);
			 })
			.withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(3.5f, 3.5f, 7f);
						 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
						 GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
						 GL11.glRotatef(80.000000f, 0f, 0f, 1f);
						 GL11.glTranslatef(0.125000f, -0.275000f, -0.300000f);
					 }, 
					 (renderContext) -> {
					     GL11.glScalef(3f, 3f, 3f);
					     GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(0.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(0.200000f, -0.425000f, -0.050000f);
					     
//					     GL11.glScalef(3f, 3f, 3f);
//	                     GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
//	                     GL11.glRotatef(15.000000f, 0f, 1f, 0f);
//	                     GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
//	                     GL11.glTranslatef(-0.100000f, -0.150000f, 0.425000f);
					 })
					 
			.withFirstPersonHandPositioningZooming(
			        (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.425000f, -0.050000f);
                    })
					 
			.withFirstPersonHandPositioningModifying(
			        (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.700000f, -0.360000f, 0.130000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.205000f, -0.325000f, 0.000000f);
                    })
                    
             .withFirstPersonHandPositioningRunning(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.205000f, -0.325000f, 0.000000f);
                    })
                    
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 7f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                     }, 
                     (renderContext) -> {
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
					}, 50, 200),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 50, 200)
					)
					
			.withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
			        new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 250, 1000),
			        new Transition((renderContext) -> { // Reload position
			            GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.300000f, -0.050000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.075000f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, -0.150000f);
                    }, 250, 1000))
					
			.withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.075000f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.300000f, -0.050000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 1000)
                    
            )
					
			.withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.150000f, 0.425000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, -0.125000f, 0.225000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -0.125000f, 0.225000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.150000f, 0.425000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    }, 50, 200)
                    )
					
			
					
			.withFirstPersonLeftHandPositioningEjectSpentRound(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
					}, 250, 50),
					new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 7f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.350000f, -0.425000f);
                    }, 250, 50)
					
				)
					
			.withFirstPersonRightHandPositioningEjectSpentRound(
			        new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.075000f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.300000f, -0.050000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.075000f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, -0.150000f);
                    }, 250, 1000)
					)
					
			.build())
		.withSpawnEntityDamage(20f)
		.withSpawnEntityGravityVelocity(0f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}