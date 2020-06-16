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
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.BulletBig;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kar98K;
import com.vicmatskiv.mw.models.Kar98Kboltaction;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.Springfield;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Kar98KFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("Kar98K")
//      .withAmmo(CommonProxy.XWPMag)
        .withAmmoCapacity(5)
        .withFireRate(0.16f)
        .withIteratedLoad()
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("kar98k_boltaction")
        .withRecoil(6f)
        .withZoom(0.8f)
        .withMaxShots(1)
        .withShootSound("kar98k")
        .withPumpTimeout(950)
        //.withSilencedShootSound("AR15silenced")
        .withReloadSound("kar98k_boltback")
        .withAllReloadIterationsCompletedSound("kar98k_boltforward")
        .withReloadIterationSound("loadbullet")
        .withDrawSound("noaction_draw")
//       .withReloadSound("drawweapon")
//        .withReloadIterationSound("loadshell")
        .withReloadingTime(500)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 1f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.16f)
        .withShellCasingEjectEnabled(false)
        .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Bolt-action rifle",
        "Damage: 27",
        "Cartridge: 7.92x57mm", 
        "Fire Rate: Bolt Action",
        "Rate of Fire: 16/100"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                3f, // x 
                2f, // y
                6f) // z
        
        .withCompatibleBullet(Bullets.Bullet792x57, (model) -> {})
        .withCompatibleAttachment(Attachments.Kar98Krail, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(-0.243F, -1.47F, -2.8f);
                GL11.glScaled(0.6F, 0.55F, 0.4F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Kar98Kaction, true, (model) -> {
            if(model instanceof Kar98Kboltaction) {
//                GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
//                GL11.glRotatef(90f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Bullet, true, (model) -> {
            if(model instanceof BulletBig) {
                GL11.glScaled(0.4F, 0.4F, 0.6F);
                GL11.glTranslatef(-0.52F, -2.9F, -3.5F);
                GL11.glRotatef(90f, 1f, 0f, 0f);
                
                
//                GL11.glScaled(0.4F, 0.4F, 0.6F);
//                GL11.glTranslatef(-0.95F, -3.1F, -3.5F);
//                GL11.glRotatef(70f, 1f, 0f, 0f);
//                GL11.glRotatef(5f, 0f, 1f, 0f);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.24F, -1.55F, -3F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.33F, -1.58F, -1.8F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
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
            GL11.glTranslatef(-0.22F, -1.3F, -2.2F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.HP, (player, stack) -> {
            GL11.glTranslatef(-0.34F, -1.55F, -1.9F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.237F, -0.215F, 1.155001F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                GL11.glTranslatef(-0.11F, -1.38F, -2.5F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.11F, -1.38F, -2.3F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(-0.1F, -1.42F, -2.2F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(-0.1F, -1.42F, -2.2F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(-0.1F, -1.42F, -2.4F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof EotechScopeRing) {
                GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Vortex, (player, stack) -> {
                GL11.glTranslatef(-0.28F, -1.58F, -2.5F);
                GL11.glScaled(0.3F, 0.3F, 0.4F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.1F, -1.43F, -2F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.21F, -1.56F, -2.2F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.56F, -2.2F);
            GL11.glScaled(0.32F, 0.32F, 0.32F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
            GL11.glTranslatef(-0.2F, -1.55F, -2.1F);
            GL11.glScaled(0.26F, 0.26F, 0.26F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.03F, -1.5F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
        })
        .withCompatibleAttachment(Attachments.Kar98Ksight, true, (model) -> {
             if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.29F, -1.71F, -3.88F);
                GL11.glScaled(0.8F, 0.7F, 1F);
            } 
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
                GL11.glTranslatef(-0.29F, -1.71F, -3.88F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, -1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.21F, -1.37F, -8.65F);
                GL11.glScaled(0.3F, 0.43F, 1.2F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.13F, -1.39F, -9.7F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withTextureNames("M1903A3")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Kar98K())
            .withPrepareFirstLoadIterationAnimationDuration(1100)
            .withAllLoadIterationAnimationsCompletedDuration(800)
            //.withTextureName("AWP")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
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
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.125000f, 0.875000f, 0.750000f);
                
//                GL11.glRotatef(42F, 0f, 1f, 0f);
//                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//                GL11.glRotatef(18F, 0f, 0f, 1f);
//                GL11.glRotatef(2F, 1f, 0f, 0f);
//                GL11.glTranslatef(-0.125000f, 1f, 0.750000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.125000f, 0.875000f, 1.15f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.1f, 0.7f, 0.6f);
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//                GL11.glRotatef(0.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.12f, 0.7f, 0.8f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Kar98Kaction.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.Kar98Kaction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                GL11.glRotatef(90f, 0f, 0f, 1f);
                })
                
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.Bullet.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.3F, 0.3F, -0.4F);
                GL11.glRotatef(0f, 1f, 0f, 0f);
                GL11.glRotatef(0f, 0f, 1f, 0f);
                })
                
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                })
                
            .withFirstPersonPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(14F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.1f, 0.875000f, 0.750000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(17F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.1f, 0.875000f, 0.750000f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(41F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(19F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.11f, 0.93f, 1f);
                        GL11.glRotatef(-1F, 1f, 0f, 0f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(14.5F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.11f, 0.88f, 0.8f);
                        GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(44.5F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(14F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.11f, 0.875000f, 0.750000f);
                    }, 160, 0)
                    
                    )
            
            .withFirstPersonPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(14F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3f, 0.675000f, 0.750000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(17F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3f, 0.675000f, 0.750000f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(41F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(19F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3f, 0.73f, 1f);
                        GL11.glRotatef(-1F, 1f, 0f, 0f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(14.5F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3f, 0.68f, 0.8f);
                        GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(44.5F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(14F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3f, 0.675000f, 0.750000f);
                    }, 160, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Kar98Kaction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Bullet.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0.4F, 0.4F, 0.6F);
//                        GL11.glTranslatef(-0.52F, -2.9F, -3.5F);
//                        GL11.glRotatef(90f, 1f, 0f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0F, -0.5F, 0F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0.4F, 0.4F, 0.6F);
                        GL11.glTranslatef(-2F, -1F, -6F);
                        GL11.glRotatef(60f, 1f, 0f, 0f);
                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0.4F, 0.4F, 0.6F);
                        GL11.glTranslatef(-4F, 0F, -6F);
                        GL11.glRotatef(60f, 1f, 0f, 0f);
                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.52F, 3F, -6F);
                        GL11.glRotatef(60f, 1f, 0f, 0f);
                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 0)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Bullet.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0.4F, 0.4F, 0.6F);
//                        GL11.glTranslatef(-0.52F, -2.9F, -3.5F);
//                        GL11.glRotatef(90f, 1f, 0f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0F, -0.5F, 0F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0.4F, 0.4F, 0.6F);
                        GL11.glTranslatef(-2F, -1F, -6F);
                        GL11.glRotatef(60f, 1f, 0f, 0f);
                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0.4F, 0.4F, 0.6F);
                        GL11.glTranslatef(-4F, 0F, -6F);
                        GL11.glRotatef(60f, 1f, 0f, 0f);
                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.52F, 3F, -6F);
                        GL11.glRotatef(60f, 1f, 0f, 0f);
                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 0)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Kar98Kaction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 0)
                    
                    )
                    
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Bullet.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0.4F, 0.4F, 0.6F);
//                        GL11.glTranslatef(-0.52F, -2.9F, -3.5F);
//                        GL11.glRotatef(90f, 1f, 0f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0F, -0.5F, 0F);
//                        GL11.glRotatef(60f, 1f, 0f, 0f);
//                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0.4F, 0.4F, 0.6F);
                        GL11.glTranslatef(-2F, -1F, -6F);
                        GL11.glRotatef(60f, 1f, 0f, 0f);
                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScaled(0.4F, 0.4F, 0.6F);
                        GL11.glTranslatef(-4F, 0F, -6F);
                        GL11.glRotatef(60f, 1f, 0f, 0f);
                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(-0.52F, 3F, -6F);
                        GL11.glRotatef(60f, 1f, 0f, 0f);
                        GL11.glRotatef(45f, 0f, 1f, 0f);
                    }, 250, 0)
                    
                    )
                    
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(43F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.100000f, 0.93f, 0.850000f);
                }, 250, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(42F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.100000f, 0.92f, 0.850000f);
                }, 200, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                }, 210, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(39F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                }, 190, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                }, 220, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Kar98Kaction.getRenderablePart(),
                new Transition((renderContext) -> { 
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 0F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                    GL11.glRotatef(90f, 0f, 0f, 1f);
                }, 250, 50)
                )
                
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Bullet.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.3F, 0.3F, -0.2F);
                    GL11.glRotatef(0f, 1f, 0f, 0f);
                    GL11.glRotatef(0f, 0f, 1f, 0f);
                    
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.3F, 0.3F, -0.2F);
                    GL11.glRotatef(0f, 1f, 0f, 0f);
                    GL11.glRotatef(0f, 0f, 1f, 0f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.3F, 0.3F, -0.2F);
                    GL11.glRotatef(0f, 1f, 0f, 0f);
                    GL11.glRotatef(0f, 0f, 1f, 0f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.3F, 0.3F, -0.2F);
                    GL11.glRotatef(0f, 1f, 0f, 0f);
                    GL11.glRotatef(0f, 0f, 1f, 0f);
                }, 250, 50),
                new Transition((renderContext) -> { 
                    GL11.glTranslatef(-0.3F, 0.3F, -0.2F);
                    GL11.glRotatef(0f, 1f, 0f, 0f);
                    GL11.glRotatef(0f, 0f, 1f, 0f);
                }, 250, 50)
                )
                
            .withFirstPersonPositioningLoadIteration(
                    new Transition((renderContext) -> { 
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                    }, 120, 20),
                    new Transition((renderContext) -> { 
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.92f, 0.850000f);
                    }, 150, 20),
                    new Transition((renderContext) -> { 
                        GL11.glRotatef(39.3F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.93f, 0.850000f);
                    }, 130, 20),
                    new Transition((renderContext) -> { 
                        GL11.glRotatef(39.5F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.92f, 0.850000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { 
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                    }, 170, 20))
                    
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.Kar98Kaction.getRenderablePart(), 
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50))
                    
            .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.Bullet.getRenderablePart(), 
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.5F, 0.6F, -0.6F);
                        GL11.glRotatef(-20f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                        
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(0.45F, 0.5F, -0.6F);
                        GL11.glRotatef(-20f, 1f, 0f, 0f);
                        GL11.glRotatef(20f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.3F, 0.5F, -0.2F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-0.3F, 0.3F, -0.2F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50))
                    
            .withFirstPersonPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { 
                        GL11.glRotatef(41F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                    }, 320, 0),
                    new Transition((renderContext) -> { 
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                    }, 140, 0),
                    new Transition((renderContext) -> { 
                        GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                    }, 120, 50),
                    new Transition((renderContext) -> { 
                        GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.900000f, 0.850000f);
                    }, 130, 0))
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.Kar98Kaction.getRenderablePart(), 
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.38F, -1.05F, 0.59F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                        GL11.glTranslatef(-1.38F, -1.05F, 0F);
                        GL11.glRotatef(90f, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
                    }, 250, 50))
                    
            .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.Bullet.getRenderablePart(), 
                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-0F, 0.5F, 0F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-0F, 0.5F, 0F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-0F, 0.5F, 0F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { 
//                        GL11.glTranslatef(-0F, 0.5F, 0F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50))
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, 0.625000f, 0.375000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.075000f, 1.2f, 0.6f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.5F, -1.1F, 2.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 0)
            )
                    
//            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.KS23pump.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
//                    new Transition((renderContext) -> {
//                        GL11.glTranslatef(0f, 0f, 0.8f);
//                    }, 250, 1000),
//                    new Transition((renderContext) -> {
//                    }, 250, 1000)
//                        )
            
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(18F, 0f, 0f, 1f);
                        GL11.glRotatef(7F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 1.25f, 0.750000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(18F, 0f, 0f, 1f);
                        GL11.glRotatef(2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 1f, 0.750000f);
                    }, 230, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(15F, 0f, 0f, 1f);
                        GL11.glRotatef(3F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 0.875000f, 0.65f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                        GL11.glRotatef(1F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.125000f, 0.875000f, 0.750000f);
                    }, 250, 0)
                    )
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.39f, 0.86f, 0.400000f);
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.3f, 1.000000f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.34f, 1.200000f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.29f, 1.300000f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.325f, 0.7f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.26f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.24f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.255f, 0.2f);
                }   
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.255f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.25f, 1.3f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.255f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.24f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.28f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.28f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.16f, 0.2f);
                }   

                // Everything else
                else {
                }   
            
                })
            
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.39f, 0.9f, 0.5f);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.3f, 1.000000f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.34f, 1.200000f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.29f, 1.300000f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.325f, 0.7f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.26f, 0.2f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.24f, 0.2f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.255f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.255f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.25f, 1.3f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Vortex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.255f, 0.2f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.24f, 0.2f);
                } 
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.28f, 0.2f);
                }   
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.28f, 0.2f);
                }  
                
             // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0f, 0.16f, 0.2f);
                }  

                // Everything else
                else {
                }   
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(38F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(18F, 0f, 0f, 1f);
                GL11.glRotatef(5F, 1f, 0f, 0f);
                GL11.glTranslatef(-0.125000f, 1.175000f, 0.750000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.325000f, 0.625000f, 0.375000f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.325000f, 0.625000f, 0.375000f);
             })
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                         
//                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
//                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(-0.000000f, 0.175000f, 0.150000f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
//                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(-0.050000f, 0.050000f, 0.175000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, 0.050000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
//                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
//                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                         GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
//                         GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    })
            
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    })
                    
             .withFirstPersonHandPositioningRunning(
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.075000f, 0.175000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    })
                    
            .withFirstPersonHandPositioningLoadIterationCompleted(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 3.5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.000000f, 0.175000f, 0.150000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.06f, -0.25f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.06f, -0.25f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.125000f, -0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, -0.200000f);
                    }, 250, 1000))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.150000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.06f, -0.25f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.250000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.050000f);
                    }, 250, 1000)
                    
            )
                    
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.000000f, 0.175000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, 0.050000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 0.075000f, 0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, 0.050000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.000000f, 0.175000f, 0.150000f);
                    }, 50, 200)
                    )
                    
            
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.150000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.06f, -0.25f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.125000f, -0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, -0.200000f);
                    }, 250, 1000)
                    )

            .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.150000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.03f, -0.07f, -0.03f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.06f, -0.25f, -0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.125000f, -0.200000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.225000f, -0.200000f);
                    }, 250, 1000)
                    )
            
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.475000f, -0.025000f, -0.025000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.000000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.050000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.075000f, 0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, 0.050000f, 0.075000f);
                    }, 50, 200))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.125000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.225000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.075000f, 0.000000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3f, -0.05f, 0.15f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.3f, -0.08f, 0.15f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, 0.025000f, 0.175000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.350000f, 0.025000f);
                    }, 250, 100)
                    )
                    
            .build())
        .withSpawnEntityDamage(27f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}