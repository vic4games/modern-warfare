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
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.L96;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class AWPFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("AWP")
//		.withAmmo(CommonProxy.XWPMag)
//		.withAmmoCapacity(10)
		.withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("L96BoltAction")
        .withRecoil(4f)
        .withZoom(0.8f)
        .withMaxShots(1)
        .withShootSound("L96")
        .withPumpTimeout(1000)
        .withSilencedShootSound("RifleSilencer")
        .withReloadSound("BoltActionReload")
        .withUnloadSound("l96unload")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(1f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.07f)
        .withFlashOffsetY(() -> 0.06f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(ModernWarfareMod.SnipersTab)
        .withCrafting(CraftingComplexity.HIGH, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.BigSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Sniper rifle", "Damage: 27", 
        "Caliber: 7.62x51mm", "Magazines:", "8rnd 7.62x51mm Magazine", "Fire Rate: Bolt Action"))
        .withCompatibleAttachment(GunSkins.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.LightningStrike, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.LightningStrike.getTextureVariantIndex("AWPLightningStrike"));
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
        .withCompatibleAttachment(Magazines.L115Mag, (model) -> {
            GL11.glScaled(1.6F, 1.6F, 1.6F);
            GL11.glTranslatef(-0.27F, 0.6F, -0.97F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.L115Bolt1, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.L115Bolt2, true, (model) -> {
            GL11.glTranslatef(-0.35F, 0.35F, -1.56F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AKRail, true, (model) -> {
            GL11.glTranslatef(-0.22F, -1.36F, -3.15F);
            GL11.glScaled(0.7F, 0.8F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(-0.165F, -1.5F, -1.15F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.262F, -0.8F, -2.25F);
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
                GL11.glTranslatef(-0.22F, -1.75F, -3.07F);
                GL11.glScaled(0.6F, 0.7F, 0.1F);
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
                GL11.glTranslatef(-0.17F, -1.545F, -3.1F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.HP, (player, stack) -> {
            
            GL11.glTranslatef(-0.36F, -1.43F, -1.5F);
            GL11.glScaled(1F, 1F, 1F);
        },(model) -> {
             if(model instanceof LPscope) {
                GL11.glTranslatef(0.237F, -0.235F, 1.16F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Scope, (player, stack) -> {
            
            GL11.glTranslatef(-0.36F, -1.43F, -1F);
            GL11.glScaled(1F, 1F, 1F);
        },(model) -> {
             if(model instanceof LPscope) {
                GL11.glTranslatef(0.237F, -0.272F, 0.67F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.335F, -1.45F, -1.3F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.237F, -0.26F, 0.46F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
            }
        })
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.19F, -1.15F, -1.5F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0.3F, -5.85F);
            GL11.glScaled(1F, 1F, 1F);
        })
//      .withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
//          GL11.glTranslatef(0.107F, -1.45F, -6.95F);
//          GL11.glScaled(1.1F, 1.1F, 1.3F);
//      })
        .withTextureNames("awp")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new L96())
            //.withTextureName("AWP")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.450000f, 0.875000f, -0.100000f);
                })
                
            .withFirstPersonCustomPositioning(Magazines.L115Mag, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.AKRail.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(-0.450000f, 0.875000f, 0.200000f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 1f, 0.2f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.145f, 0.15f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.145f, 0.25f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.13f, 0.75f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.055f, 0.6f);
                } 
                
                // Everything else
                else {
                }
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.L115Bolt1.getRenderablePart(), (renderContext) -> {
                })
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.L115Bolt2.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 200, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 120, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.L115Bolt1.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0F, 0F, 0.8F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0F, 0F, 0.4F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.L115Bolt2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8F, 0.7F, 0F);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8F, 0.7F, 0.8F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8F, 0.7F, 0F);
                    }, 250, 50)     ,
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)     
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.AUGRail.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(-0.7F, -0.4F, 0F);
//                        GL11.glRotatef(0F, 0f, 1f, 0f);
//                        GL11.glRotatef(40F, 0f, 0f, 1f);
//                        GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(-0.7F, -0.4F, 0.4F);
//                        GL11.glRotatef(0F, 0f, 1f, 0f);
//                        GL11.glRotatef(40F, 0f, 0f, 1f);
//                        GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(-0.7F, -0.4F, 0F);
//                        GL11.glRotatef(0F, 0f, 1f, 0f);
//                        GL11.glRotatef(40F, 0f, 0f, 1f);
//                        GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(Magazines.L115Mag.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0F, 0F, 0.6F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glRotatef(0F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)
                    
                    )
                    
            
                
             .withFirstPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.750000f, 0.725000f, 0.025000f);
                    }, 300, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.750000f, 0.725000f, 0.025000f);
                    }, 300, 100),              
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 350, 120),
                    new Transition((renderContext) -> { // Reload positiona
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 200, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.475000f, 0.900000f, -0.250000f);
                    }, 120, 0))
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.750000f, 0.725000f, 0.025000f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.750000f, 0.725000f, 0.025000f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.L115Mag,
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1F, 0F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.L115Mag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.05F, 1F, 0F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                        GL11.glTranslatef(0.05F, 1F, 0F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.05F, 1F, 0F);
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
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AUGRail.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AUGRail.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
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
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.L115Bolt1.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position  
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position  
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0F, 0F, 0.8F);
                  }, 250, 50),
                  new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0F, 0F, 0.4F);
//                    GL11.glRotatef(40F, 0f, 1f, 0f);
//                    GL11.glRotatef(10F, 0f, 0f, 1f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
//                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                  }, 250, 300),
                  new Transition((renderContext) -> { // Reload position
                      GL11.glTranslatef(0F, 0F, 1F);
                  }, 250, 50),
                  new Transition((renderContext) -> { // Reload position
//                    GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                    GL11.glRotatef(40F, 0f, 1f, 0f);
//                    GL11.glRotatef(10F, 0f, 0f, 1f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
//                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                  }, 250, 50),
                  new Transition((renderContext) -> { // Reload position
//                    GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                    GL11.glRotatef(40F, 0f, 1f, 0f);
//                    GL11.glRotatef(10F, 0f, 0f, 1f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
//                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                  }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.L115Bolt2.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position 
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position  
                    }, 250, 50),
new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8F, 0.7F, 0F);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8F, 0.7F, 0.8F);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(50F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8F, 0.7F, 0F);
                    }, 250, 50)     ,
                    new Transition((renderContext) -> { // Reload position
//                      GL11.glTranslatef(0.3F, -0.39F, -0.26F);
//                      GL11.glRotatef(40F, 0f, 1f, 0f);
//                      GL11.glRotatef(10F, 0f, 0f, 1f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
//                      GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 50)     
                    
                )
                
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.L115Bolt1.getRenderablePart(),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000)
                        )
                        
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.L115Bolt2.getRenderablePart(),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                      GL11.glTranslatef(0F, 0F, 0.5F);
//                      GL11.glRotatef(0F, 0f, 1f, 0f);
//                      GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000)
                        )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 1f, -0.125000f);
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.145f, 0.35f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.145f, 0.5f);
                } 
                
                // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.13f, 1f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.055f, 0.8f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.425000f, 1.025000f, -0.375000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.050000f, 0.675000f, 0.575000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 7.5f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 7.5f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.05f, -0.275000f, -0.35f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.33f, -0.5f, 0.08f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.5f, -0.800000f, 0.1f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.675000f, 0.700000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.800000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.400000f, -0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.095000f, -0.310000f, -0.020000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.515000f, -0.125000f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.095000f, -0.310000f, -0.020000f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.400000f, -0.075000f);
                    }, 350, 1050))
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 7.5f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.275000f, -0.34f);
                    }, 250, 50)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.400000f, -0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.095000f, -0.310000f, -0.020000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.515000f, -0.125000f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.095000f, -0.310000f, -0.020000f);
                    }, 350, 1050),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.400000f, -0.075000f);
                    }, 350, 1050))
                
                .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.800000f, 0.250000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.675000f, 0.700000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-05.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.44f, -0.5f, 0.08f);
                    }, 250, 50))
                    
            .build())
        .withSpawnEntityDamage(27f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}