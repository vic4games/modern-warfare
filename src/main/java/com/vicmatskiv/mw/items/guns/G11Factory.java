package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK15;
import com.vicmatskiv.mw.models.AK15ironsight;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G11;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MP7;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.UTGTriRailHandGuard;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class G11Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("g11")
        .withFireRate(0.9f)
        .withRecoil(1f)
        .withZoom(0.9f)
        .withMaxShots(3, 1)
        //.withMaxShots(5)
        .withShootSound("g11")
        .withSilencedShootSound("mp5_silenced")
        .withReloadSound("g11_reload")
        .withUnloadSound("g11_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.14f)
        .withFlashOffsetY(() -> 0.18f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Assault Rifle/Light Machine Gun/Personal Defense Weapon",
        "Damage: 5", 
        "Cartridge: 4.73x33mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 80/100",
        "Magazines:",
        "50rnd 4.73x33mm Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1f, // x 
                0.1f, // y
                3f) // z
        
         .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
             GL11.glTranslatef(0.01f, -0.19f, -0.4f);
             GL11.glScaled(0F, 0F, 0F);
         })
        .withCompatibleAttachment(Magazines.G11Mag, (model) -> {
//            GL11.glTranslatef(0F, -0.12F, 2F);
//            GL11.glRotatef(5F, 1f, 0f, 0f);
//            GL11.glRotatef(-10F, 0f, 1f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.G11Action, true, (model) -> {
//          GL11.glTranslatef(0F, -0.12F, 2F);
//          GL11.glRotatef(5F, 1f, 0f, 0f);
//          GL11.glRotatef(-10F, 0f, 1f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
              GL11.glTranslatef(-0.245F, -1.91F, -1.4F);
              GL11.glScaled(0.9F, 0.8F, 0.88F);
          } else if(model instanceof AKRail2) {
              GL11.glScaled(0F, 0F, 0F);
          } else if(model instanceof AKRail3) {
              GL11.glScaled(0F, 0F, 0F);
          } else if(model instanceof AKRail4) {
              GL11.glScaled(0F, 0F, 0F);
          } else if(model instanceof AKRail5) {
              GL11.glScaled(0F, 0F, 0F);
          }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.24F, -2.05F, -1.6F);
            GL11.glScaled(1F, 1F, 1F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.362F, -2.08F, -0.1F);
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
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.2F, -2.1F, -0.3F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.2F, -2.1F, -0.3F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.64F, -0.3F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.05F, -1.8F, -0.8F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.05F, -1.8F, -0.8F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(-0.018F, -1.85F, -0.4F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                GL11.glTranslatef(-0.018F, -1.85F, -0.4F);
                GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(-0.018F, -1.85F, -0.7F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
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
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.02F, -1.85F, -0.3F);
                GL11.glScaled(0.85F, 0.85F, 0.85F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
                GL11.glTranslatef(-0.194F, -2.1F, -0.3F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.03F, -1.5F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
        })
//        .withCompatibleAttachment(Attachments.SilencerMP5, (model) -> {
//            GL11.glTranslatef(-0.2F, -1.08F, -4.6F);
//            GL11.glScaled(1F, 1F, 1F);
//        })
        .withTextureNames("gun")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new G11())
            //.withTextureName("AK47")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            
            .withFirstPersonPositioningCustomRecoiled(Magazines.G11Mag.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.G11Mag.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.G11Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.G11Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
            
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
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-2.2F, -1.1F, 2.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.SCOPE, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.Specter || activeAttachment == Attachments.NightRaider || 
                            activeAttachment == Attachments.ACOG) {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.9f, -1.5f);
                    } else {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.7f, -2f);
                        
//                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//                        GL11.glRotatef(38F, 0f, 1f, 0f);
//                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
//                        GL11.glRotatef(7.000000f, 1f, 0f, 0f);
//                        GL11.glTranslatef(-0.500000f, 2f, -1.2f);
                    }
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                    RenderContext<?> rc = (RenderContext<?>) renderContext;
                    ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                            AttachmentCategory.SCOPE, rc.getWeaponInstance());
                    if(activeAttachment == Attachments.Specter) {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.9f, -1f);
                    } else {
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, 1.7f, -1.5f);
                    }
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, 1.5f, -1.6f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.25f, 0.7f, -0.6f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(37F, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, 2f, -1f);
                    }, 300, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(36F, 0f, 1f, 0f);
                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(8.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, 2f, -1f);
                    }, 200, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(37F, 0f, 1f, 0f);
                    GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(7.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.500000f, 2f, -0.9f);
                }, 130, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(38F, 0f, 1f, 0f);
                    GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(7.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.500000f, 1.8f, -0.8f);
                }, 220, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(38F, 0f, 1f, 0f);
                    GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                    GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                    GL11.glTranslatef(-0.55f, 1.7f, -1.1f);
                }, 120, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, 1.8f, -1.7f);
                    }, 330, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, 1.9f, -1.2f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(37F, 0f, 1f, 0f);
                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, 2f, -1f);
                    }, 240, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.500000f, 2f, -1f);
                    }, 200, 0))
                    
            .withFirstPersonCustomPositioningReloading(Magazines.G11Mag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1.6F, 4F, -0.5F);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(00F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1.6F, 4F, -0.5F);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(00F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1.6F, 0.9F, -0.5F);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0.2F, -0.5F);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                        
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.G11Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0.2F, -0.5F);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1.6F, 0.9F, -0.5F);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 0f, 1f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(1.6F, 4F, -0.5F);
                        GL11.glRotatef(-6F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(00F, 0f, 1f, 0f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.6f, 1.175000f, -1.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                      GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.300000f, 2.5f, -1f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 190),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2.2F, -2F, 2.7F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }, 120, 0)
//                }, 100, 0)
            )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(65F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(55F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(25F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(50F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(5F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 190, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 1.700000f, -2.125000f);
                    }, 190, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 1.74f, -0.8f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, -0.1f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.01f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.01f, 0.5f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.03f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.05f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.05f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.02f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.122f, 0.2f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 1.74f, -0.6f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, -0.2f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.05f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.01f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.01f, 0.5f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.03f, -0.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.05f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.05f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, -0.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.02f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, -0.122f, 0.2f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(8F, 1f, 0f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glTranslatef(-0.550000f, 2.200000f, -1.9f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.6f, 1.275000f, -1.7f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.6f, 1.275000f, -1.7f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                             GL11.glScalef(4.5f, 4.5f, 4.5f);
                             GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.100000f, -0.175000f, 0.050000f);
                             
//                             GL11.glScalef(4.5f, 4.5f, 4.5f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.175000f, 0.050000f);
                }, 
                (renderContext) -> {
                    GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                })
                     
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.100000f, -0.175000f, 0.050000f);
                }, 
                (renderContext) -> {
                    GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.025000f, 0.475000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, 0.025000f, 0.475000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.725000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.725000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.725000f, 0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.225000f, 0.575000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.225000f, 0.300000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 280, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.225000f, 0.300000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.225000f, 0.575000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.725000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.725000f, 0.100000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.5f, 3.5f, 3.5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.025000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.100000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.025000f, 0.075000f);
                    }, 300, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-49.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                    }, 260, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(23.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.200000f, 0.050000f);
                    }, 280, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.975000f, 0.150000f);
                    }, 300, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.450000f, -0.525000f, 0.150000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

