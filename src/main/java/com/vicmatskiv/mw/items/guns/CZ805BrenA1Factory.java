package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AR15CarryHandle;
import com.vicmatskiv.mw.models.AR57Receiver;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.CZ805Bren;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.G95_frontsights;
import com.vicmatskiv.mw.models.G95_rearsights;
import com.vicmatskiv.mw.models.G95_upright_frontsights;
import com.vicmatskiv.mw.models.G95_upright_rearsights;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M202RocketPROJECTILE;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M4A1;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.M4Receiver;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.VLTORReceiver;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class CZ805BrenA1Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("cz805_bren_a1")
        //.withAmmoCapacity(30)
        .withFireRate(0.75f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withMaxShots(Integer.MAX_VALUE, 1)
        .withShootSound("cz805brens1")
        .withSilencedShootSound("m4a1_silenced")
        .withReloadSound("g95_reload")
        .withUnloadSound("g95_unload")
        .withEndOfShootSound("gun_click")
        .withInspectSound("m4a1_inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.14f)
        .withShellCasingForwardOffset(0.05f)
        .withShellCasingVerticalOffset(-0.03f)
        
        // .withInaccuracy(1)
        
        .withCreativeTab(ModernWarfareMod.CombatServerTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Modular Assault Rifle", 
        "Damage: 6", 
        "Cartridge: 5.56x45mm NATO",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 75/100",
        "Magazines:",
        "30rnd 5.56x45mm NATO STANAG Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                    2f, // x 
                    2.5f, // y
                    3.5f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
        .withUnremovableAttachmentCategories(AttachmentCategory.SCOPE)
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.GRIP)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.BrenAction, true, (model) -> {
//          GL11.glTranslatef(0F, 0F, 0.75F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.G95UprightIronSights, true, (model) -> {
            if(model instanceof G95_upright_rearsights) {
                GL11.glTranslatef(-0.033F, -0.93F, 0.5F);
                GL11.glScaled(0.25F, 0.25F, 0.25F);
            } else if(model instanceof G95_upright_frontsights) {
            	GL11.glTranslatef(-0.033F, -0.95F, -2F);
                GL11.glScaled(0.25F, 0.25F, 0.25F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M4Rail, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.2F, -0.44F, -2.6F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.2F, -0.3F, -2.6F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(0.07F, -0.09F, -2.55F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.087F, -0.76F, -0.95f);
                GL11.glScaled(0.6F, 0.6F, 0.68F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.087F, -0.76F, -2.6f);
                GL11.glScaled(0.6F, 0.6F, 0.68F);
            }
        })
        .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
            GL11.glTranslatef(-0.16F, 0.8F, -0.77F);
            GL11.glScaled(0.8F, 1.2F, 1.15F);
        })
        .withTextureNames("cz805bren")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new CZ805Bren())
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(0, 0f, 3f);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
            	 GL11.glScaled(0.6F, 0.6F, 0.6F);
                 GL11.glTranslatef(-1.3F, -0.5F, 1.2F);
                 GL11.glRotatef(-45F, 0f, 1f, 0f);
                 GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(3F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.325000f, 0.505000f, -1.224999f);
                
//                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                
//            	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
//                GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.700000f, 0.450000f, -1.075000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(3F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.325000f, 0.505000f, -0.824999f);
                GL11.glRotatef(-1F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.18f, 1.1f, -0.75f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.18f, 1.1f, -0.6f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(Magazines.M4A1Mag, (renderContext) -> {
//            	GL11.glTranslatef(0F, 1.5F, 0.5F);
//            	GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.BrenAction.getRenderablePart(), (renderContext) -> {
            })
            
	        .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.BrenAction.getRenderablePart(), (renderContext) -> {
	            GL11.glTranslatef(0F, 0F, 0.75F);
	            })
	            
	        .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.BrenAction.getRenderablePart(), (renderContext) -> {
	            GL11.glTranslatef(0F, 0F, 0.75F);
	            })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { 
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-33.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.775000f, 0.350000f, -1.025000f);
                    }, 180, 0),
                    
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.775000f, 0.280000f, -1.025000f);
                    }, 150, 70),
                
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-43.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.735000f, 0.10000f, -1.025000f);
                    }, 60, 130),
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-42.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 0.50000f, -1.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.790000f, 0.480000f, -1.075000f);
                    }, 70, 0)
                    )
                    
            .withFirstPersonPositioningUnloading(
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 0.380000f, -1.025000f);
                    }, 160, 0),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 0.70000f, -1.025000f);
                    }, 120, 0),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(-16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.525000f, 0.630000f, -1.025000f);
                    }, 160, 0)
                    )
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
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
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M4A1Mag,
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 1.5F, 0.5F);
                    	GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0.5F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.M4A1Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1F, 0F);
//                        GL11.glRotatef(50F, 0f, 0f, 1f);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                          GL11.glTranslatef(-0.5F, 2F, 0F);
                          GL11.glRotatef(50F, 0f, 0f, 1f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                    	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.525000f, 0.250000f, -0.750000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.100000f, 0.900000f, -0.725000f);
                  }, 350, 600)
                    )
                    
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 300, 600),
                  new Transition((renderContext) -> {
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 180, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 100),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 170),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 10),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 100, 50)
                    )
                    
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(3F, 0f, 0f, 1f);
                        GL11.glRotatef(26F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.325000f, 0.505000f, -1.224999f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(3F, 0f, 0f, 1f);
                        GL11.glRotatef(18F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.325000f, 0.505000f, -1.224999f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(4F, 0f, 0f, 1f);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.325000f, 0.505000f, -1.254999f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.325000f, 0.505000f, -1.324999f);
                    }, 110, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(1F, 0f, 0f, 1f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glTranslatef(-0.325000f, 0.505000f, -1.224999f);
                    }, 100, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
//                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.235f, 0.402f, -0.6f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
//                    GL11.glTranslatef(0f, 0.22f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.235f, 0.402f, -0.4f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
//                    GL11.glTranslatef(0f, 0.22f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(2.00000f, 2.00000f, 2.00000f);
                GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.200000f, 0.525000f, -0.675000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
            	 GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
             	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
             	GL11.glRotatef(10.000000f, 0f, 1f, 0f);
             	GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
             	GL11.glTranslatef(-0.525000f, 0.250000f, -0.750000f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
            	 GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
             	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
             	GL11.glRotatef(10.000000f, 0f, 1f, 0f);
             	GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
             	GL11.glTranslatef(-0.525000f, 0.250000f, -0.750000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.300000f, -0.625000f, 0.200000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
            			GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.300000f, -0.625000f, 0.200000f);
                   	 
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
            		(renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.200000f, -0.475000f, 0.175000f);
                   	 
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    })
                     
            .withFirstPersonHandPositioningModifyingAlt(
            		(renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.200000f, -0.475000f, 0.175000f);
                   	 
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.600000f, -0.600000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.375000f, -0.675000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(4f, 4f, 4f);
	                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.275000f, -0.700000f, 0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { 
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.825000f, 0.100000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.050000f, -0.750000f, 0.175000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                   
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
	                   	 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.175000f, 0.025000f, 0.525000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
	                   	 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.175000f, 0.025000f, 0.525000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
	                   	 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(0.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(15.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.175000f, 0.025000f, 0.525000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                      	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.200000f, -0.475000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                      	 GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.200000f, -0.475000f, 0.175000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 250, 50)
                    )
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.150000f, 0.375000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.300000f, -0.625000f, 0.200000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.300000f, -0.625000f, 0.200000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.300000f, -0.625000f, 0.200000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.300000f, -0.625000f, 0.200000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.300000f, -0.625000f, 0.200000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, -0.600000f, 0.275000f);
                    }, 110, 0)
                    )
                    
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.0118f)
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}