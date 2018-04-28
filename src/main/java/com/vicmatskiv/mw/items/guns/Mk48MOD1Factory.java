package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
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
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M249;
import com.vicmatskiv.mw.models.M249Cover;
import com.vicmatskiv.mw.models.M249RearSight;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.Mk48MOD1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Mk48MOD1Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("Mk48MOD1")
//      .withAmmo(CommonProxy.Mk48Mag)
//      .withAmmoCapacity(200)
        .withFireRate(0.75f)
        .withRecoil(3.5f)
        .withZoom(0.9f)
        //.withMaxShots(5)
        .withShootSound("M240")
        .withSilencedShootSound("ar15silenced")
        .withReloadSound("M249Reload")
        .withUnloadSound("M249Unload")
        .withReloadingTime(110)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.1f)
        .withCreativeTab(ModernWarfareMod.ShotgunsTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.MetalComponents,
                Ores.INGOT_ALUMINIUM)
        .withInformationProvider(stack -> Arrays.asList("Type: General-Purpose Machine Gun", "Damage: 12", 
        "Caliber: 7.62x51mm", "Magazines:", "100rnd 7.62x51mm Magazine",
        "Fire Rate: Auto"))
        .withCompatibleAttachment(GunSkins.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
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
        .withCompatibleAttachment(Magazines.Mk48Mag, (model) -> {
//          GL11.glTranslatef(1f, 1.2f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M249Action, true, (model) -> {
          GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M249Cover, true, (model) -> {
            if(model instanceof M249Cover) {
                GL11.glTranslatef(0F, 0F, 0F);
                GL11.glScaled(1F, 1F, 1F);
            } else if(model instanceof M249RearSight) {
                GL11.glTranslatef(0.195F, -1.645F, 1.55f);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.16F, -1.75F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.53F, -2.05F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
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
                GL11.glTranslatef(0.168F, -1.55F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(0.163F, -1.67F, -2.05F);
                GL11.glScaled(0.3F, 0.3F, 0.5F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.15F, -1.7F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(0.055F, -1.7F, 1.1F);
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
            GL11.glTranslatef(0.15F, -1.47F, 0.8F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (model) -> {
            if(model instanceof Reflex) {
            GL11.glTranslatef(.235F, -1.57F, 0.7F);
            GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(0.195F, -1.76F, 0.7F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.Kobra, (model) -> {
            if(model instanceof Kobra) {
                GL11.glTranslatef(.24F, -1.6F, 0.8F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(0.195F, -1.76F, 0.4F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.Holo2, (model) -> {
            if(model instanceof Holographic) {
                GL11.glTranslatef(.25F, -1.6F, 0.8F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(0.195F, -1.78F, 0.8F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Holographic2, (model) -> {
            if(model instanceof Holographic2) {
                GL11.glTranslatef(.25F, -1.6F, 0.8F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(0.195F, -1.78F, 0.8F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (model) -> {
            if(model instanceof MicroT1) {
                GL11.glTranslatef(0.15F, -1.7F, 0.8F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(0.195F, -1.82F, 0.8F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(.135F, -0.54F, -0.7F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(.135F, -0.54F, -0.7F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Grip, (model) -> {
            GL11.glTranslatef(.135F, -0.57F, -0.9F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(.135F, -0.52F, -0.7F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(.32F, -1.14F, -1.2F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(.32F, -1.14F, -1.2F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
        })
        .withCompatibleAttachment(Attachments.Silencer762x51, (model) -> {
            GL11.glTranslatef(0.13F, -1.48F, -4F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withTextureNames("Mk48MOD1")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Mk48MOD1())
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
                GL11.glTranslatef(-1.8F, 0.3F, 1.5F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(5.5F, 5.5F, 5.5F);
                GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                
//              GL11.glScaled(5.5F, 5.5F, 5.5F);
//                GL11.glRotatef(-6.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(12.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.7f, 1.7f, -2.1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScaled(5.5F, 5.5F, 5.5F);
                GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.8f, 1.5f, -2f);
                GL11.glRotatef(-0.6F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glScaled(5.5F, 5.5F, 5.5F);
                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                GL11.glTranslatef(-0.065f, 1.4f, -2f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.012F, 0.16f, 0.6f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.012F, 0.135f, 0.65f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.1f, 0.6f);
                } 
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.1f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.1f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.1f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.15f, 0.6f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(Magazines.Mk48Mag, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M249Action.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M249Cover.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(Attachments.ACOG.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, -1.7F, -1.95F);
//                GL11.glRotatef(80F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(Attachments.Specter.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, -1.7F, -1.95F);
//                GL11.glRotatef(80F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(Attachments.Reflex.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, -1.7F, -1.95F);
//                GL11.glRotatef(80F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(Attachments.Kobra.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, -1.7F, -1.95F);
//                GL11.glRotatef(80F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(Attachments.Holo2.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, -1.7F, -1.95F);
//                GL11.glRotatef(80F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(Attachments.Holographic2.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, -1.7F, -1.95F);
//                GL11.glRotatef(80F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(Attachments.MicroT1.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, -1.7F, -1.95F);
//                GL11.glRotatef(80F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningReloading(

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 400, 20),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(8.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 350, 150),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 1.5f, -2.1f);
                    }, 450, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 1.5f, -2.1f);
                    }, 500, 0),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 1.5f, -2.1f);
                    }, 200, 100),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 350, 20),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 320, 30),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 250, 20),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 400, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 350, 80),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 400, 0),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(-6.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.6f, 1.7f, -2.1f);
                    }, 430, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.6f, 1.7f, -2f);
                    }, 330, 0),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(-6.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.6f, 1.7f, -2.1f);
                    }, 350, 0),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 300, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 400, 20),

                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(5.5F, 5.5F, 5.5F);
                        GL11.glRotatef(8.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                    }, 350, 150),
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(5.5F, 5.5F, 5.5F);
                    GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1f, 1.5f, -2.1f);
                }, 500, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(5.5F, 5.5F, 5.5F);
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1f, 1.5f, -2.1f);
                }, 450, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(5.5F, 5.5F, 5.5F);
                    GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                }, 400, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(5.5F, 5.5F, 5.5F);
                    GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.8f, 1.5f, -2.1f);
                }, 350, 80)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.Mk48Mag,
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1f, 1.2f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1f, 1.2f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1f, 1.2f, 0f);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M249Cover.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glScaled(1F, 1F, 1F);
                        GL11.glTranslatef(0F, -1.4F, 1.4F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.M249Action.getRenderablePart(),
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
                    
            .withFirstPersonCustomPositioningReloading(Magazines.Mk48Mag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1f, 1.2f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1f, 1.2f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1f, 1.2f, 0f);
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
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M249Cover.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glScaled(1F, 1F, 1F);
                    GL11.glTranslatef(0F, -1.4F, 1.4F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M249Action.getRenderablePart(),
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
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.ACOG.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.ACOG.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.7F, -1.95F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.7F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Specter.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.Specter.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -2.5F, -1.95F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -2.5F, -1.95F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Reflex.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.Reflex.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Kobra.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.Kobra.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Holo2.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.Holo2.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.Holographic2.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.Holographic2.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Attachments.MicroT1.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.MicroT1.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, -1.6F, 1.3F);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, -1.6F, 1.3F);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScaled(5.5F, 5.5F, 5.5F);
                GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                GL11.glTranslatef(-0.065f, 1.4f, -2.1f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.012F, 0.16f, 0.65f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.012F, 0.135f, 0.7f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.1f, 0.6f);
                } 
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.1f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.1f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.1f, 0.6f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.15f, 0.6f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(5.5F, 5.5F, 5.5F);
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.700000f, 2.024999f, -1.599999f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(5.5F, 5.5F, 5.5F);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.174999f, 1.424999f, -1.100000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.000000f, -0.450000f, 0.000000f);
                         
//                       GL11.glScalef(3f, 3f, 3f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                         
//                       GL11.glScalef(3f, 3f, 3f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, -0.825000f, -0.100000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.450000f, -0.675000f, -0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.325000f, -0.300000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -1.224999f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -0.775000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, -0.650000f, -0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, -0.700000f, -0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.325000f, -0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.450000f, -0.675000f, -0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.450000f, 0.000000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.450000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.450000f, 0.000000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.450000f, 0.000000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.450000f, 0.000000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.300000f, -0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.475000f, -0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.300000f, -0.050000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.450000f, -0.675000f, -0.275000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.325000f, -0.300000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -1.224999f, 0.000000f);
                    }, 250, 0),
                    
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.325000f, -0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.450000f, -0.675000f, -0.275000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.850000f, 0.000000f);
                    }, 250, 50))
                    
            .build())
        .withSpawnEntityDamage(12f)
        .withSpawnEntityGravityVelocity(0.0118f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}