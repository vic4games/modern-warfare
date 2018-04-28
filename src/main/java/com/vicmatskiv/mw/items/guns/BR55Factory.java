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
import com.vicmatskiv.mw.models.AK12;
import com.vicmatskiv.mw.models.AK12IronSight;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.BR55;
import com.vicmatskiv.mw.models.BR55scopereticle;
import com.vicmatskiv.mw.models.DMRscopeReticle;
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
import com.vicmatskiv.mw.models.MA37;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class BR55Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("BR55")
        .withFireRate(0.7f)
        .withRecoil(3.5f)
        .withZoom(0.9f)
        .withOneClickBurst()
        .withBurstShootSound("br55")
        .withBurstTimeout(300)
//        .withBurstTimeout(400)
        .withMaxShots(3)
        .withReloadSound("br55reload")
        .withUnloadSound("akunload")
        .withReloadingTime(43)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.14f)
        .withFlashOffsetY(() -> 0.12f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
//        .withCrafting(CraftingComplexity.MEDIUM, 
//                CommonProxy.SteelPlate,
//                CommonProxy.MiniSteelPlate,
//                CommonProxy.MetalComponents)
        .withInformationProvider(stack -> Arrays.asList("Type: Assault rifle","Damage: 16", 
        "Caliber: 9.5×40mm", "Magazines:", "36rnd 9.5×40mm Magazine",
        "Fire Rate: Burst"))
       
//        .withCompatibleAttachment(Attachments.Silencer762x51, (model) -> {
//            GL11.glTranslatef(-0.22F, -1.3F, -7.8F);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
//        })
        
        .withCompatibleAttachment(Attachments.DMRscope, (player, stack) -> {
            GL11.glTranslatef(-0.34F, -2.38F, -2F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
             if(model instanceof DMRscopeReticle) {
                GL11.glTranslatef(0.4F, -0.115F, 0.001F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
            }
        })
        
        .withCompatibleAttachment(Attachments.BR55scope, true, (player, stack) -> {
            GL11.glTranslatef(-0.17F, -2.3F, -1.9F);
            GL11.glScaled(0.44F, 0.44F, 0.44F);
        },(model) -> {
             if(model instanceof BR55scopereticle) {
                GL11.glTranslatef(0.2F, -0.32F, 0.2F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
            }
        })
        
        .withCompatibleAttachment(AuxiliaryAttachments.BR55action, true, (model) -> {
        })
        
         .withCompatibleAttachment(Magazines.BR55mag, (model) -> {
//             GL11.glTranslatef(0F, 1F, 0F);
        })
      
        .withTextureNames("BR55")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new BR55())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.32F, 0.32F, 0.32F);
                GL11.glTranslatef(1, 1.8f, -1f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(-2.6F, -1.2F, 2.7F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4f, 4f, 4f);
                GL11.glTranslatef(-0.775000f, 1.649999f, -0.8f);
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScalef(4f, 4f, 4f);
//                GL11.glTranslatef(-1.05f, 1.9f, -1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4f, 4f, 4f);
                GL11.glTranslatef(-0.775000f, 1.649999f, -0.6f);
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScalef(4f, 4f, 4f);
//                GL11.glTranslatef(-1.05f, 1.9f, -0.8f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(0.25f, 2.1f, 1.25f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.DMRscope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.02f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BR55scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, -0.075f, 0.7f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonCustomPositioning(Magazines.BR55mag, (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.BR55action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 1.2F);
                }
            })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.AK12IronSight.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.BR55action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.2F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.BR55action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.2F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.AK12IronSight.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.AK12IronSight.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.BR55mag, (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.BR55mag, (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0f);
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.224999f, 1.5f, -1.4f);
                    }, 350, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-57.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.224999f, 1.5f, -1.4f);
                    }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.224999f, 1.5f, -1.2f);
                }, 100, 130),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.45f, 1.6f, -0.6f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                }, 400, 0),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.45f, 1.6f, -0.6f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glRotatef(-5F, 1f, 0f, 0f);
                }, 180, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.224999f, 1.224999f, -1.624999f);
                }, 200, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-58.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.224999f, 1.224999f, -1.624999f);
                }, 100, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-57.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.224999f, 1.224999f, -1.624999f);
                }, 100, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.BR55mag,
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 1F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 2F, 0F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.BR55mag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 2F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 1F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.BR55action.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.2F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.2F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.2F);
              }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.BR55action.getRenderablePart(),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.2F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.2F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.2F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.2F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(0.25f, 2.1f, 1.2f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.DMRscope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, 0.02f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BR55scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0f, -0.075f, 0.7f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
//                GL11.glScalef(4f, 4f, 4f);
//                GL11.glRotatef(0.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.8f, 2.3f, -0.3f);
                
                GL11.glScalef(1f, 1f, 1f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.175000f, 0.375000f, -0.200000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4f, 4f, 4f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.4f, 1.6f, 0.000000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(6f, 6f, 6f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.200000f, -0.025000f, 0.225000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(6f, 6f, 6f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.500000f, 0.175000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(6f, 6f, 6f);
                         GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.300000f, -0.275000f, 0.025000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(6f, 6f, 6f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.500000f, 0.175000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -1.274999f, 0.250000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -1.100000f, 0.225000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, -1.224999f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, -0.600000f, -0.225000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(5f, 5f, 5f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.275000f, -0.600000f, -0.100000f);
                    }, 250, 0)
                    )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.500000f, 0.175000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.500000f, 0.175000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.500000f, 0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.500000f, 0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.500000f, 0.175000f);
                    }, 250, 0)
                    )
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, -1.224999f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -1.100000f, 0.225000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -1.274999f, 0.250000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.500000f, 0.175000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.500000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(6f, 6f, 6f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.500000f, 0.175000f);
                    }, 250, 50))
            .build())
        .withSpawnEntityDamage(16f)
        .withSpawnEntityGravityVelocity(0.028f)
        
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}