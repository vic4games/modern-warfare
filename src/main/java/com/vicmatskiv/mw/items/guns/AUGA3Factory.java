package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AUG;
import com.vicmatskiv.mw.models.AUGA3;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class AUGA3Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("AUG A3")
//		.withAmmo(CommonProxy.AR15Mag)
//		.withAmmoCapacity(30)
		.withFireRate(0.7f)
		.withRecoil(3.5f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 3, 1)
		//.withMaxShots(5)
		.withShootSound("AR15")
		.withSilencedShootSound("AR15Silenced")
		.withReloadSound("StandardReload")
		.withUnloadSound("Unload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.1f)
		.withShellCasingForwardOffset(-0.1f)
		.withCreativeTab(ModernWarfareMod.AR2Tab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.SteelIngot)
		.withInformationProvider(stack -> Arrays.asList("Type: Assault rifle", "Damage: 7", 
		"Caliber: 5.56x45mm NATO", "Magazines:", "30rnd 5.56x45mm NATO Magazine",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(CommonProxy.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(CommonProxy.ElectricSkin.getTextureVariantIndex("Electric"));
				}, 
				(a, i) -> {
				}
		)
		 .withCompatibleAttachment(CommonProxy.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Sapphire.getTextureVariantIndex("Sapphire"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Forest, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Forest.getTextureVariantIndex("Forest"));
                }, 
                (a, i) -> {
                }
        )
		
		.withCompatibleAttachment(CommonProxy.AUGAction, true, (model) -> {
        })
        .withCompatibleAttachment(CommonProxy.NATOMag1, (model) -> {
            GL11.glTranslatef(-0.335F, 0.9F, 1.2F);
            GL11.glScaled(1F, 1.5F, 1.5F);
            GL11.glRotatef(-5F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(CommonProxy.AKMIron, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.255F, -1.55F, -2.25F);
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
                GL11.glTranslatef(-0.248F, -1.58F, 0.3F);
                GL11.glScaled(0.8F, 0.7F, 0.3F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.18F, -1.26F, -2.9F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.127F, -1.77F, -2.22F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(CommonProxy.AUGRail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.16F, -0.88F, -3.5F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.39F, -0.715F, -3.5F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.03F, -0.52F, -3.5F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.23F, -1.26F, -2.9F);
                GL11.glScaled(0.8F, 1F, 1.4F);
            }
        })
        .withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.28F, -1.37F, -0.3F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.237F, -0.26F, 0.46F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
            }
        })
        .withCompatibleAttachment(CommonProxy.Scope, (player, stack) -> {
            GL11.glTranslatef(-0.36F, -1.37F, -0.3F);
            GL11.glScaled(1F, 1F, 1F);
            },(model) -> {
                if(model instanceof LPscope) {
                GL11.glTranslatef(0.237F, -0.272F, 0.67F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
                }
            })
//        .withCompatibleAttachment(CommonProxy.HP, (player, stack) -> {
//            GL11.glTranslatef(-0.3F, -1.38F, -0.5F);
//            GL11.glScaled(0.75F, 0.75F, 0.75F);
//        },(model) -> {
//             if(model instanceof LPscope) {
//                GL11.glTranslatef(0.237F, -0.235F, 1.16F);
//                GL11.glScaled(0.1F, 0.1F, 0.1F);
//            }
//        })
        .withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
            if(model instanceof Reflex) {
                GL11.glTranslatef(-0.072F, -1.17F, -0.9F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -1.44F, -0.9F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
            if(model instanceof Holographic) {
                GL11.glTranslatef(-0.053F, -1.22F, -0.6F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.49F, -0.5F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(CommonProxy.Holographic2, (model) -> {
            if(model instanceof Holographic2) {
                GL11.glTranslatef(-0.053F, -1.22F, -0.6F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.49F, -0.5F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
            if(model instanceof Kobra) {
                GL11.glTranslatef(-0.053F, -1.2F, -0.6F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.12F, -1.45F, -1.05F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(CommonProxy.Grip2, (model) -> {
            GL11.glTranslatef(-0.17F, -0.1F, -2.8F);
            GL11.glScaled(0.8F, 1F, 1F);
        })
        .withCompatibleAttachment(CommonProxy.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.17F, -0.2F, -2.8F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
//        .withCompatibleAttachment(CommonProxy.Grip, (model) -> {
//            GL11.glTranslatef(-0.2F, -0.35F, -2.9F);
//            GL11.glScaled(1F, 1F, 1F);
//        })
        .withCompatibleAttachment(CommonProxy.VGrip, (model) -> {
            GL11.glTranslatef(-0.17F, -0.1F, -2.8F);
            GL11.glScaled(0.8F, 1F, 1F);
        })
        .withCompatibleAttachment(CommonProxy.Bipod, (model) -> {
            GL11.glTranslatef(-0.17F, -0.1F, -3.2F);
            GL11.glScaled(0.8F, 1F, 1F);
        })
        .withCompatibleAttachment(CommonProxy.Laser2, (p, s) -> {
            GL11.glTranslatef(-0.17F, -0.2F, -2.8F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(CommonProxy.Laser, (p, s) -> {
            GL11.glTranslatef(0.05F, -0.9F, -2.8F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withCompatibleAttachment(CommonProxy.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.2F, -0.97F, -5.12F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("AK12")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new AUGA3())
            //.withTextureName("AK47")
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
                GL11.glTranslatef(-1.5F, -0.9F, 1.7F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.300000f, 0.400000f, -0.600000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.300000f, 0.400000f, -0.200000f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.908F, 1.75F, -2.7F);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.AKMIron)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005F, 0.278f, 0.64f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.37f, 0.3f);
                } 

                // HP Zoomw
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.0017f, 0f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.185f, 0.3f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.22f, 0.4f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.219f, 0.3f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(1.373F, -1.14f, 2.8f);
                } 
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(CommonProxy.NATOMag1, (renderContext) -> {
//              GL11.glTranslatef(-0.2F, -0.32F, 0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
            
            .withFirstPersonCustomPositioning(CommonProxy.AUGAction.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(CommonProxy.AUGRail.getRenderablePart(), (renderContext) -> {
                })
        
            .withFirstPersonPositioningCustomRecoiled(CommonProxy.AUGAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.AUGAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(CommonProxy.NATOMag1.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.NATOMag1.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.AUGRail.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(CommonProxy.AUGRail.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
                    }, 300, 60),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
                    }, 400, 200),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.175000f, -0.100000f, -0.125000f);
                }, 400, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.175000f, -0.100000f, -0.125000f);
                }, 150, 100)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
                }, 150, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(CommonProxy.NATOMag1,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.2F, 0.5F, -0.2F);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.2F, 0.9F, -0.2F);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.NATOMag1,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1F, 0F);
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
                }, 250, 1000)
                    )
                    
           .withFirstPersonCustomPositioningUnloading(CommonProxy.AUGRail.getRenderablePart(),
                new Transition((renderContext) -> {
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.AUGRail.getRenderablePart(),
                new Transition((renderContext) -> {
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
                }, 250, 1000)
                    )
           
            .withFirstPersonCustomPositioningUnloading(CommonProxy.AUGAction.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.AUGAction.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.908F, 1.75F, -2.9F);
                
                // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.AKMIron)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005F, 0.278f, 0.8f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.37f, 0.3f);
                } 

                // HP Zoomw
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.0017f, 0f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.185f, 0.3f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.22f, 0.4f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.219f, 0.3f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(1.373F, -1.14f, 2.8f);
                } 
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.300000f, 0.500000f, -1.050000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.900000f, 0.350000f, -0.450000f);
             })
             
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, -0.525000f, 0.45f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.35f, -0.5f, 0.12f);
                     })
                     
           .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, -0.525000f, 0.45f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.4f, -0.5f, 0.12f);
                     })
                     
           .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, -0.525000f, 0.45f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.35f, -0.5f, 0.12f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, -0.525000f, 0.45f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.35f, -0.5f, 0.12f);
                     })
                     
             .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 1.4f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-90f, 1f, 0f, 0f);
                         GL11.glRotatef(20f, 0f, 0f, 1f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 1.4f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.650000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.725000f, -0.050000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.5f, 0.12f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.5f, 0.12f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.35f, -0.5f, 0.12f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.35f, -0.5f, 0.12f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glTranslatef(0.4f, 0.5f, 1.4f);
                        GL11.glRotatef(60f, 0, 0f, 1f);
                        GL11.glRotatef(-85f, 1f, 0f, 0f);
                        GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                        GL11.glTranslatef(0.4f, 0.5f, 1.4f);
                        GL11.glRotatef(60f, 0, 0f, 1f);
                        GL11.glRotatef(-90f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 0f, 1f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.5f, 0.12f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.4f, -0.5f, 0.12f);
                    }, 250, 50))
                    
            .build())
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.0118f)
				
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}
