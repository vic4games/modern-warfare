package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMN;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.VSSVintorez;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WorldHelper;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class VSSVintorezFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("VSS Vintorez")
        //.withAmmo(CommonProxy.AK47Mag)
//      .withAmmoCapacity(30)
        .withFireRate(0.8f)
        .withRecoil(2.5f)
        .withZoom(0.9f)
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("VSSVintorez")
        .withReloadSound("AKReload")
        .withUnloadSound("Unload")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(1f)
        .withFlashScale(() -> 0f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.1f)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.MetalComponents,
                CommonProxy.SteelIngot)
        .withCreativeTab(ModernWarfareMod.SnipersTab)
        .withInformationProvider(stack -> Arrays.asList("Type: Suppressed Sniper Rifle","Damage: 12", 
        "Caliber: 9x39mm", "Magazines:", "10rnd 9x39mm Magazine",
        "Fire Rate: Semi"))
        .withCompatibleAttachment(CommonProxy.Fade, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Fade.getTextureVariantIndex("Ruby"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(CommonProxy.Arctic, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Arctic.getTextureVariantIndex("Arctic"));
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
        .withCompatibleAttachment(CommonProxy.PSO1, (player, stack) -> {
            
            GL11.glTranslatef(0.4F, -1.1F, 0.2F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
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
        .withCompatibleAttachment(CommonProxy.VSSVintorezMag, (model) -> {})
        .withCompatibleAttachment(CommonProxy.Extra, true, (model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.14F, -1.49F, -3.04F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(0.092F, -1.65F, -1.63F);
                GL11.glScaled(0.7F, 0.8F, 0.7F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
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
                GL11.glTranslatef(0.145F, -1.27F, -3.4F);
                GL11.glScaled(0.5F, 0.5F, 1F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withTextureNames("VSSVintorez")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new VSSVintorez())
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
                GL11.glTranslatef(0.43F, -0.46F, -0.23F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glTranslatef(0.43F, -0.46F, -0.23F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-0.4F, -0.8F, 1.1F);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glTranslatef(-0.06F, -0.38F, -0.26F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                // Zoom

                GL11.glTranslatef(0.135F, -1.08f, 1.33f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glRotatef(-0.4F, 1f, 0f, 0f);

                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.PSO1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(1.36F, -1.14f, 2.5f);
                }   

                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }   


            })
            
            .withFirstPersonCustomPositioning(CommonProxy.VSSVintorezMag, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })  
                
            /*.withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-0.4F, -0.8F, 1.0F);
                })*/
            
            .withFirstPersonPositioningReloading(
                    
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.28F, -0.22F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(5F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 500),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.28F, -0.22F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(5F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 140),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.25F, -0.2F, -0.18F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    GL11.glRotatef(7F, 1f, 0f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                }, 350, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.25F, -0.2F, -0.18F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    GL11.glRotatef(7F, 1f, 0f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                }, 70, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.28F, -0.22F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(5F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glTranslatef(0.28F, -0.22F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(5F, 1f, 0f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(CommonProxy.VSSVintorezMag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.2F, 0.5F, -0.2F);
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
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.VSSVintorezMag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0.7F, 0F);
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
            
           .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(-0.06F, -0.38F, -0.26F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                // Zoom

                GL11.glTranslatef(0.135F, -1.08f, 1.3f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);

                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.PSO1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(1.36F, -1.14f, 2.5f);
                }   

                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }   


            })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(0.8F, 0.8F, 0.8F);
                GL11.glRotatef(-20F, -4f, 1f, -2f);
                GL11.glTranslatef(0.5F, -0.35F, -1F);
             })
            
             .withFirstPersonPositioningModifying((renderContext) -> {
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glRotatef(-35F, 2f, 1f, 1f);
                GL11.glTranslatef(1F, -0.8F, -1.5F);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(1.8f, 1.8f, 3f);
                         GL11.glTranslatef(0.73f, -0.1f, 0.33f);
                         GL11.glRotatef(110f, 0, 0f, 1f);
                         GL11.glRotatef(-50f, 1f, 0f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(1.8f, 1.8f, 2.5f);
                         GL11.glTranslatef(-0.15f, 0.1f, 1f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glTranslatef(1f, 0.2f, 0.2f);
                         GL11.glRotatef(99f, 0, 0f, 1f);
                         GL11.glRotatef(-60f, 20f, 20f, -20f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(1.8f, 1.8f, 2.5f);
                         GL11.glTranslatef(-0.15f, 0.1f, 1f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-90f, 1f, 0f, 0f);
                         GL11.glRotatef(20f, 0f, 0f, 1f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2f, 2f, 2.5f);
                         GL11.glTranslatef(0.4f, 0.5f, 0.8f);
                         GL11.glRotatef(60f, 0, 0f, 1f);
                         GL11.glRotatef(-85f, 1f, 0f, 0f);
                         GL11.glRotatef(60f, 0f, 0f, 1f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                         GL11.glTranslatef(0.65f, -0.35f, 0.37f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-55f, 1f, 0f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                         GL11.glTranslatef(0.65f, -0.35f, 0.37f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-55f, 1f, 0f, 0f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.15f, 0.1f, 1f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.15f, 0.1f, 1f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                         GL11.glTranslatef(0.05f, -0.05f, 0.05f);
                         GL11.glRotatef(30f, 0, 0f, 1f);
                         GL11.glRotatef(-160f, 1f, 0f, 0f);
                         //GL11.glRotatef(85f, 0f, 1f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                         GL11.glTranslatef(-0.05f, -0.05f, 0.05f);
                         GL11.glRotatef(30f, 0, 0f, 1f);
                         GL11.glRotatef(-180f, 1f, 0f, 0f);
                         //GL11.glRotatef(85f, 0f, 1f, 0f);
                    }, 250, 0))
             
//           .withFirstPersonHandPositioningZooming((renderContext) -> {
//               GL11.glScalef(1.8f, 1.8f, 5f);
//               GL11.glTranslatef(0.8f, -0.1f, 0.3f);
//               GL11.glRotatef(90f, 0, 0f, 1f);
//               GL11.glRotatef(-20f, 1f, 0f, 0f);
//           }, null)
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                         GL11.glTranslatef(0.65f, -0.2f, 0.37f);
                         GL11.glRotatef(70f, 0, 0f, 1f);
                         GL11.glRotatef(-50f, 1f, 0f, 0f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.7f, 1.7f, 3f);
                         GL11.glTranslatef(0.7f, 0.2f, 0.37f);
                         GL11.glRotatef(50f, 0, 0f, 1f);
                         GL11.glRotatef(-90f, 1f, 0f, 0f);
                         GL11.glRotatef(-40f, 0f, 1f, 0f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.15f, 0.1f, 1f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.8f, 1.8f, 2.5f);
                        GL11.glTranslatef(-0.15f, 0.1f, 1f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50))
            .build())
        .withSpawnEntityDamage(12f)
        .withSpawnEntityGravityVelocity(0.0118f)
       
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

