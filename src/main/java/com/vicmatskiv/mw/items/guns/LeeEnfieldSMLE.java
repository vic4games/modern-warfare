package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Gewehr98;
import com.vicmatskiv.mw.models.LeeEnfieldClip;
import com.vicmatskiv.mw.models.LeeEnfieldClipBullets;
import com.vicmatskiv.mw.models.LeeEnfieldSMLEAction;
import com.vicmatskiv.mw.models.LeeEnfieldSMLEMk3;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PUmount;
import com.vicmatskiv.mw.models.PUreticle;
import com.vicmatskiv.mw.models.PUscope;
import com.vicmatskiv.mw.models.PriscopicScope;
import com.vicmatskiv.mw.models.SVTmount;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.UnertlReticle;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class LeeEnfieldSMLE {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("LeeEnfieldSMLEMkIII")
        .withAmmoCapacity(10)
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("springfieldboltaction")
        .withRecoil(6f)
        .withZoom(0.8f)
        .withMaxShots(1)
        .withShootSound("LeeEnfield")
        .withPumpTimeout(1400)
        //.withSilencedShootSound("AR15silenced")
        .withReloadSound("leeenfieldsmlereload")
//       .withReloadSound("drawweapon")
//        .withReloadIterationSound("loadshell")
        .withReloadingTime(500)
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
        .withInformationProvider(stack -> Arrays.asList("Type: Bolt-action rifle", "Damage: 26", "Cartridge:", 
        ".303 British Bullet" ,"Fire Rate: Bolt Action"))
        .withCompatibleAttachment(AuxiliaryAttachments.LeeEnfieldSMLEaction, true, (model) -> {
            if(model instanceof LeeEnfieldSMLEAction) {
//                GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
//                GL11.glRotatef(90f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.LeeEnfieldClip, true, (model) -> {
            if(model instanceof LeeEnfieldClip) {
                GL11.glTranslatef(-0.2F, -0.7F, -2.1F);
                GL11.glScaled(0.9F, 0.9F, 0.9F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.LeeEnfieldClipBullets, true, (model) -> {
            if(model instanceof LeeEnfieldClipBullets) {
                GL11.glTranslatef(-0.2F, -0.7F, -2.1F);
                GL11.glScaled(0.9F, 0.9F, 0.9F);
            }
        })
        .withCompatibleAttachment(GunSkins.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
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
        .withCompatibleBullet(Bullets.Bullet303British, (model) -> {})
        .withCompatibleAttachment(AuxiliaryAttachments.LeeEnfieldSMLESight, true, (model) -> {
            GL11.glTranslatef(-0.26F, -1.47F, -3.65F);
            GL11.glScaled(0.2F, 0.25F, 0.2F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.17F, -1.42F, 0.43F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.11F, -1.29F, -9.7F);
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
                GL11.glTranslatef(-0.27F, -1.58F, -6F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, -1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.207F, -1.245F, -9.165F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.24F, -1.39F, -8.35F);
                GL11.glScaled(0.6F, 0.6F, 1F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
//        .withCompatibleAttachment(Attachments.PUscope, (player, stack) -> {
//            GL11.glTranslatef(0.4F, -1.9F, -2.5F);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
//        },(model) -> {
//             if(model instanceof PUscope) {
//                GL11.glTranslatef(-0.508F, 0.46F, -0.55F);
//                GL11.glScaled(0.22F, 0.22F, 0.22F);
//            }
//             else if(model instanceof PUmount) {
//                 GL11.glTranslatef(-0.508F, 0.46F, -0.55F);
//                 GL11.glScaled(0.22F, 0.22F, 0.22F);
//             }
//             else if(model instanceof SVTmount) {
//                 GL11.glScaled(0F, 0F, 0F);
//             }
//             else if(model instanceof PUreticle) {
//                 GL11.glTranslatef(-0.5F, 0.23F, 0.82F);
//                 GL11.glScaled(0.03F, 0.03F, 0.03F);
//             }
//        })
        .withCompatibleAttachment(Attachments.PriscopicScope, (player, stack) -> {
            GL11.glTranslatef(0.62F, -1.57F, -3.6F);
            GL11.glScaled(1F, 1F, 1F);
        },(model) -> {
             if(model instanceof PriscopicScope) {
                GL11.glTranslatef(-0.508F, 0.46F, -0.55F);
                GL11.glScaled(0.22F, 0.22F, 0.22F);
            }
             else if(model instanceof UnertlReticle) {
                 GL11.glTranslatef(-0.48F, 0.285F, 2.28F);
                 GL11.glScaled(0.015F, 0.015F, 0.015F);
             }
        })
        .withTextureNames("LeeEnfieldSMLE")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new LeeEnfieldSMLEMk3())
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
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.4f, 1.22f, 0.2f);
                
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(44.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.250000f, 1.174999f, 0f);
                })
                
            
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.4f, 1.22f, 0.6f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.39f, 0.92f, 0.7f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PUscope)) {
                    GL11.glTranslatef(-0.003f, 0.105f, 1.3f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PriscopicScope)) {
                    GL11.glTranslatef(-0.3f, -0.12f, 0.93f);
                }   

                // Everything else
                else {
                }   
            
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.LeeEnfieldSMLEaction.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
//                GL11.glRotatef(90f, 0f, 0f, 1f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.LeeEnfieldSMLESight.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.LeeEnfieldClip.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.LeeEnfieldClipBullets.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, -0.6F, 0F);
//                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningReloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 1.924999f, 1.100000f);
                }, 400, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 1.924999f, 1.100000f);
                }, 300, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2f, 1.5f);
                }, 200, 100),
                
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2f, 1.4f);
                }, 470, 130),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 1.924999f, 1.3f);
                }, 460, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-34.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(29.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 1.924999f, 1.3f);
                }, 480, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-36.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(28.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2f, 1.3f);
                }, 100, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-38.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2.1f, 1.3f);
                }, 100, 0),
                
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2f, 1.4f);
                }, 470, 130),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 1.924999f, 1.3f);
                }, 460, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-34.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(29.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 1.924999f, 1.3f);
                }, 480, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-36.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(28.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2f, 1.3f);
                }, 100, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-38.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2.1f, 1.3f);
                }, 100, 0),
                
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2f, 1.3f);
                }, 400, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-37.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(31.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.76f, 2f, 1.1f);
                }, 200, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2f, 1.1f);
                }, 260, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-33.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.775000f, 2f, 1.1f);
                }, 320, 0)
            )
                
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
                        GL11.glTranslatef(-0.250000f, 1.174999f, 1f);
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
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.LeeEnfieldSMLESight.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.LeeEnfieldSMLEaction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.LeeEnfieldClip.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )
                    
           .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.LeeEnfieldClipBullets.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.LeeEnfieldClip.getRenderablePart(),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
                    }, 250, 50),
                    
                    
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
//                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.6F, -0.2F, 0F);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0F, -0.6F, 0F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0F, -0.6F, 0F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0F, -1.5F, 1F);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
//                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.6F, -0.2F, 0F);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0F, -0.6F, 0F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0F, -0.6F, 0F);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0F, -1.5F, 1F);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0F, -1.5F, 1F);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0F, -1.5F, 1F);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0F, -1.5F, 1F);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.5F, 1F, 0.5F);
                    }, 250, 50)
                    )
                
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.LeeEnfieldClipBullets.getRenderablePart(),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.5F, 1F, 0.5F);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.5F, 1F, 0.5F);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.5F, 1F, 0.5F);
                }, 250, 50),
                
                
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.5F, 1F, 0.5F);
//                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.6F, -0.2F, 0F);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(0F, -0.6F, 0F);
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.5F, 1F, 0.5F);
//                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.6F, -0.2F, 0F);
                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(0F, -0.6F, 0F);
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50)
                )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.LeeEnfieldSMLESight.getRenderablePart(),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50)
                )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.LeeEnfieldSMLEaction.getRenderablePart(),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 0F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 1.1F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 0F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                }, 250, 50)
                )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.39f, 0.89f, 0.4f);
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PUscope)) {
                    GL11.glTranslatef(-0.003f, 0.105f, 1.5f);
                }   
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PriscopicScope)) {
                    GL11.glTranslatef(-0.3f, -0.12f, 1.15f);
                }   

                // Everything else
                else {
                }   
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.05f, 1.4f, 0.625000f);
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
                         GL11.glScalef(4f, 4f, 4.5f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.425000f, -0.050000f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.08f, 0.08f);
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
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.205000f, -0.325000f, 0.000000f);
                    })
                    
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.200000f, -0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.200000f, -0.125000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.375000f, -0.225000f);
                    }, 250, 1000),
                    
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.275000f, -0.500000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, 0.200000f, -0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.150000f, -0.325000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.000000f, -0.100000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.000000f, -0.100000f);
                    }, 250, 1000),
                    
                    
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.275000f, -0.500000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, 0.200000f, -0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.150000f, -0.325000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.000000f, -0.100000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.000000f, -0.100000f);
                    }, 250, 1000),
                    
                    
                    
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.375000f, -0.225000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.200000f, -0.125000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.200000f, -0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.425000f, -0.050000f);
                    }, 250, 1000)
                    
            )
                    
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, 0.150000f, 0.050000f);
                    }, 250, 50)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.200000f, -0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.200000f, -0.125000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.375000f, -0.225000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.200000f, -0.125000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.200000f, -0.200000f);
                    }, 250, 1000)
                    )
                    
            .build())
        .withSpawnEntityDamage(26f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

