package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.KN44;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

import net.minecraft.item.Item;

public class KN44Factory implements GunFactory {

    @SuppressWarnings("unchecked")
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("KN44")
//      .withAmmo(CommonProxy.MP5Mag)
//      .withAmmoCapacity(25)
        .withFireRate(0.6f)
        .withRecoil(2.3f)
        .withZoom(0.9f)
        .withMaxShots(Integer.MAX_VALUE, 3, 1)
        //.withMaxShots(5)
        .withShootSound("KN44")
        .withSilencedShootSound("MP5Silenced")
        .withReloadSound("StandardReload")
        .withUnloadSound("Unload")
        .withReloadingTime(43)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(1f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.12f)
        .withCreativeTab(ModernWarfareMod.SMGTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.SteelIngot)
        .withInformationProvider(stack -> Arrays.asList("Type: Assault Rifle", "Damage: 7.7", 
        "Caliber: 5.56x39mm", "Magazines:", "30rnd 5.56x39mm Magazine (Type 2)", "45rnd 5.56x39mm Magazine",
        "Fire Rate: Auto"))
        .withCompatibleAttachment(CommonProxy.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.ElectricSkin.getTextureVariantIndex("Electric"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Fade, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Fade.getTextureVariantIndex("Ruby"));
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
        .withCompatibleAttachment(CommonProxy.Desert, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Desert.getTextureVariantIndex("Desert"));
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
        .withCompatibleAttachment(CommonProxy.KN44Mag, (model) -> {
            GL11.glTranslatef(-0.32F, 0F, -1.26F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
            GL11.glRotatef(-5F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(CommonProxy.KN44Mag45, (model) -> {
            GL11.glTranslatef(-0.32F, 0F, -1.26F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
            GL11.glRotatef(-5F, 1f, 0f, 0f);
        })
      .withCompatibleAttachment(CommonProxy.Extra, true, (model) -> {
            if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.17F, -1.155F, -0.1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.16F, -1.15F, -3F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(-0.157F, -1.425F, -1.57F);
                GL11.glScaled(0.24F, 0.24F, 0.24F);
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
                GL11.glTranslatef(-0.15F, -1.32F, -3.253F);
                GL11.glScaled(0.25F, 0.25F, 0.6F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(-0.1F, -1.235F, -0.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
      .withCompatibleAttachment(CommonProxy.Grip2, (model) -> {
          GL11.glTranslatef(-0.17F, -0.4F, -2.4F);
          GL11.glScaled(0.8F, 0.8F, 0.8F);
      })
      .withCompatibleAttachment(CommonProxy.VGrip, (model) -> {
          GL11.glTranslatef(-0.17F, -0.4F, -2.4F);
          GL11.glScaled(0.8F, 0.8F, 0.8F);
      })
       .withCompatibleAttachment(CommonProxy.Bipod, (model) -> {
           GL11.glTranslatef(-0.17F, -0.4F, -2.4F);
           GL11.glScaled(0.8F, 0.8F, 0.8F);
      })
      .withCompatibleAttachment(CommonProxy.StubbyGrip, (model) -> {
          GL11.glTranslatef(-0.17F, -0.4F, -2.4F);
          GL11.glScaled(0.8F, 0.8F, 0.8F);
      })
        .withCompatibleAttachment(CommonProxy.Silencer556x39, (model) -> {
            GL11.glTranslatef(-0.2F, -1.08F, -5.4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(CommonProxy.PSO1, (player, stack) -> {
            
            GL11.glTranslatef(0.08F, -1F, -0.75F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
             if(model instanceof LPscope) {
                GL11.glTranslatef(-0.209F, -0.485F, 1.27F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
             else if(model instanceof PSO12) {
                 GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                 GL11.glScaled(0.8F, 0.8F, 0.8F);
             }
        })
        .withTextureNames("KN44")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new KN44())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.36F, 0.36F, 0.36F);
                GL11.glTranslatef(1, 2f, -1.4f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.7F, 0.7F, 0.7F);
                GL11.glTranslatef(-1.6F, -0.8F, 1.7F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glTranslatef(0.65F, 0.25F, -0.15F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.95F, 0.95F, 0.95F);
                GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glTranslatef(0.65F, 0.25F, -0.15F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.95F, 0.95F, 0.95F);
                GL11.glTranslatef(-0.4F, -0.7F, 1.15F);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glTranslatef(0F, -0.345F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);

                // Zoom
                GL11.glTranslatef(0.315F, -1.17f, 1.95f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.PSO1)) {
                    GL11.glTranslatef(1.333F, -1.25f, 2.15f);
                } 
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
            
            .withFirstPersonCustomPositioning(CommonProxy.KN44Mag, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(CommonProxy.KN44Mag45, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0.7F, -0.5F, -0.1F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 500),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0.7F, -0.5F, -0.1F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 20),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.65F, 0.25F, -0.15F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                    GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 350, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.65F, 0.25F, -0.15F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                    GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.65F, 0.25F, -0.15F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                    GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.65F, 0.25F, -0.15F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.95F, 0.95F, 0.95F);
                    GL11.glTranslatef(-0.4F, -0.7F, 0.9F);
                    GL11.glRotatef(15F, 0f, 0f, 1f);
                }, 250, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.7F, -0.5F, -0.1F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(-15F, 1f, 0f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.7F, -0.5F, -0.1F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(-15F, 1f, 0f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(CommonProxy.KN44Mag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0.5F, -0.2F);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1.3F, 0.5F, -0.8F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(CommonProxy.KN44Mag45,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0.5F, -0.2F);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(1.3F, 0.5F, -0.8F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.KN44Mag,
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
                    
             .withFirstPersonCustomPositioningReloading(CommonProxy.KN44Mag45,
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
                GL11.glTranslatef(0F, -0.345F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);

                // Zoom
                GL11.glTranslatef(0.315F, -1.17f, 1.9f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.PSO1)) {
                    GL11.glTranslatef(1.333F, -1.25f, 2.15f);
                } 
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(0.95F, 0.95F, 0.95F);
                GL11.glRotatef(-20F, -4f, 1f, -2f);
                GL11.glTranslatef(0.3F, -0.35F, -0.1F);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glRotatef(-35F, 2f, 1f, 1f);
                GL11.glTranslatef(1.3F, -0.8F, -0.2F);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(2.4f, 2.4f, 3.7f);
                         GL11.glTranslatef(0.5f, 0.08f, 0f);
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
                        GL11.glTranslatef(0.5f, 0.08f, 0f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.4f, 2.4f, 3.7f);
                        GL11.glTranslatef(0.5f, 0.08f, 0f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.4f, 2.4f, 3.7f);
                        GL11.glTranslatef(0.5f, 0.08f, 0f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.4f, 2.4f, 3.7f);
                        GL11.glTranslatef(0.5f, 0.08f, 0f);
                        GL11.glRotatef(115f, 0, 0f, 1f);
                        GL11.glRotatef(-70f, 1f, 0f, 0f);
                        GL11.glRotatef(30f, 1f, 1f, 0f);
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
                         GL11.glTranslatef(-0.18f, 0.2f, -0.65f);
                         GL11.glRotatef(95f, 0, 0f, 1f);
                         GL11.glRotatef(60f, 0f, 1f, 0f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.2f, 0.2f, -0.65f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(75f, 0f, 1f, 0f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.2f, 0.2f, -0.65f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(75f, 0f, 1f, 0f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.18f, 0.2f, -0.65f);
                         GL11.glRotatef(95f, 0, 0f, 1f);
                         GL11.glRotatef(60f, 0f, 1f, 0f);
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
        .withSpawnEntityDamage(7.7f)
        .withSpawnEntityGravityVelocity(0.028f)

        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}