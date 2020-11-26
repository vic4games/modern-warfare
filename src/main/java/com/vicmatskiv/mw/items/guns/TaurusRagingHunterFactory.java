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
import com.vicmatskiv.mw.models.Python;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.TaurusRagingHunter;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class TaurusRagingHunterFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("taurus_raging_hunter")
        .withAmmoCapacity(6)
        .withMaxBulletsPerReload(6)
        .withFireRate(0.2f)
        .withRecoil(7f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("magnum44")
        //.withSilencedShootSound("M9silenced")
        .withIteratedLoad()
        .withReloadSound("revolver_reload")
        .withReloadIterationSound("revolver_insert_bullet")
        .withAllReloadIterationsCompletedSound("revolver_load_complete")
        .withReloadingTime(2690)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.15f)
        .withInaccuracy(3)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab) 
        .withCrafting(CraftingComplexity.LOW,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
        .withInformationProvider(stack -> Arrays.asList(
                "Type: Revolver",
                "Damage: 14",
                "Cartridge: .44 Bullet", 
                "Fire Rate: Semi",
                "Rate of Fire: 20/100"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                4f, // x 
                2.0f, // y
                4f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.MagnumChamber, true, (model) -> {
//          GL11.glTranslatef(-0.35f, -0.1f, 0f);
//            GL11.glRotatef(25F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.MagnumRail, true, (model) -> {
          GL11.glTranslatef(0.1f, -2.07f, -2.42f);
          GL11.glScaled(0.7F, 0.6F, 0.6F);
        })
//        .withCompatibleAttachment(Attachments.DanWessonLaser, (p, s) -> {
//            GL11.glTranslatef(0.01F, -1.45F, -2.6F);
//            GL11.glScaled(0.9F, 0.9F, 0.9F);
//        })
        .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
            GL11.glTranslatef(0.14F, -2.22F, -1.2F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.155F, -0.1F, -0.5F);
            GL11.glScaled(0.2F, 0.2F, 0.2F);
        }
    })
    .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
        GL11.glTranslatef(0.27F, -1.95F, -1.4F);
        GL11.glScaled(0.6F, 0.6F, 0.6F);
    },(model) -> {
    if(model instanceof Reflex2) {
        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
        GL11.glScaled(0.15F, 0.15F, 0.15F);
    }
    })
        .withCompatibleBullet(Bullets.Bullet44, (model) -> {})
        .withTextureNames("taurusraginghunter")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new TaurusRagingHunter())
            //.withTextureName("XEagle")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.6F, -0.2F, 2.3F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, 1.725000f, -2.599999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.500000f, 1.725000f, -1.8f);
                GL11.glRotatef(-8F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningLoadIterationCompleted((renderContext) -> {
            	GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.300000f, 1.524999f, -1.549999f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.MagnumChamber.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0F, 0F, 0F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MagnumChamber.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0F, 0F, 0F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MagnumChamber.getRenderablePart(), (renderContext) -> {
//              GL11.glTranslatef(0F, 0F, 0F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
            
            .withFirstPersonCustomPositioningLoadIterationCompleted(AuxiliaryAttachments.MagnumChamber.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(-0.35f, -0.1f, 0f);
                GL11.glRotatef(25F, 0f, 0f, 1f);
            })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glTranslatef(0.07f, 1.5f, -2.4f);
                GL11.glRotatef(-7F, 1f, 0f, 0f);
                GL11.glRotatef(-7F, 2f, 0f, 1f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.32f, 1f);
                } 
                
                // Everything else
                else {
                }
                
                })
            
            .withFirstPersonPositioningReloading(
            		// left hand grabs chamber
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(2.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.485000f, 1.474999f, -2.449999f);
                    }, 190, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.485000f, 1.474999f, -2.449999f);
                    }, 60, 0),
                    
                    // left hand opens chamber
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.465000f, 1.474999f, -2.449999f);
                    }, 160, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.445000f, 1.474999f, -2.449999f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(11.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(21.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.385000f, 1.474999f, -2.449999f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.415000f, 1.474999f, -2.449999f);
                    }, 100, 0),
                    
                    // gun goes to the side
                        
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                    	GL11.glRotatef(-52.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.299999f, 2.475000f, -1.324999f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(1.299999f, 2.475000f, -1.324999f);
                    }, 50, 0),
                    
                    // shells fall out 
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.299999f, 2.550000f, -0.849999f);
                    }, 110, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.299999f, 2.550000f, -0.879999f);
                    }, 60, 0),
                    
                    // gun goes up
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-50.400000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.299999f, 2.455000f, -1.294999f);
                    }, 80, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScaled(2F, 2F, 2F);
                         GL11.glRotatef(-50.400000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(1.299999f, 2.455000f, -1.274999f);
                    }, 50, 0),
                    
                    // shells fall out 
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.349999f, 2.550000f, -0.725000f);
                    }, 100, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(1.349999f, 2.550000f, -0.705000f);
                    }, 90, 0),
                    
                    // gun preps for bullet insertion
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, 1.524999f, -1.549999f);
                }, 250, 0)
                ) 
            
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MagnumChamber.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
        	            GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 250, 50)
                    )
            
             .withFirstPersonCustomPositioningAllLoadIterationsCompleted(AuxiliaryAttachments.MagnumChamber.getRenderablePart(),
            		 new Transition((renderContext) -> { // Reload position\
            			 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                         GL11.glRotatef(25F, 0f, 0f, 1f);
                     }, 250, 50),
                     
                     new Transition((renderContext) -> { // Reload position\
                    	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                         GL11.glRotatef(25F, 0f, 0f, 1f);
                     }, 250, 50),
                     
                     new Transition((renderContext) -> { // Reload position\
                    	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                         GL11.glRotatef(25F, 0f, 0f, 1f);
                     }, 250, 50),
                     
                     new Transition((renderContext) -> { // Reload position\
                    	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                         GL11.glRotatef(25F, 0f, 0f, 1f);
                     }, 250, 50),
                     
                     new Transition((renderContext) -> { // Reload position\
                    	 GL11.glTranslatef(-0.35f, -0.1f, 0f);
                         GL11.glRotatef(25F, 0f, 0f, 1f);
                     }, 250, 50),
                     
                     new Transition((renderContext) -> { // Reload position
                     }, 250, 50),
                     
                     new Transition((renderContext) -> { // Reload position
                     }, 250, 50),
                     
                     new Transition((renderContext) -> { // Reload position
                     }, 250, 50),
                     
                     new Transition((renderContext) -> { // Reload position
                     }, 250, 50))
                    
                    .withFirstPersonCustomPositioningLoadIteration(AuxiliaryAttachments.MagnumChamber.getRenderablePart(),  
                    		new Transition((renderContext) -> { // Reload position
                    			GL11.glTranslatef(-0.35f, -0.1f, 0f);
                                GL11.glRotatef(25F, 0f, 0f, 1f);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                                GL11.glRotatef(25F, 0f, 0f, 1f);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                                GL11.glRotatef(25F, 0f, 0f, 1f);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                                GL11.glRotatef(25F, 0f, 0f, 1f);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                                GL11.glRotatef(25F, 0f, 0f, 1f);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                                GL11.glRotatef(25F, 0f, 0f, 1f);
                            }, 250, 50),
                            
                            new Transition((renderContext) -> { // Reload position
                            	GL11.glTranslatef(-0.35f, -0.1f, 0f);
                                GL11.glRotatef(25F, 0f, 0f, 1f);
                            }, 250, 50)
                        )
            
                    .withFirstPersonPositioningAllLoadIterationsCompleted(
                    		
                    		// gun goes up
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.700000f, 1.849999f, -1.699999f);
                        }, 250, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(-16.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(34.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.700000f, 1.849999f, -1.699999f);
                        }, 50, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(-14.500000f, 1f, 0f, 0f);
                            GL11.glRotatef(33.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.700000f, 1.849999f, -1.699999f);
                       }, 70, 0),
                        
                        // gun turns left
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-11.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(32.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 1.849999f, -1.699999f);
                    }, 160, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-11.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(31.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.700000f, 1.849999f, -1.699999f);
                    }, 80, 0),
                    
                    // gun is flicked
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-19.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.890000f, 1.849999f, -1.699999f);
                    }, 130, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-17.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.880000f, 1.849999f, -1.699999f);
                    }, 50, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-18.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.880000f, 1.849999f, -1.699999f);
                    }, 60, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-17.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.880000f, 1.849999f, -1.699999f);
                    }, 80, 0)
                )
            
                .withFirstPersonPositioningLoadIteration(   
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.300000f, 1.524999f, -1.549999f);
                        }, 130, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(26.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.300000f, 1.524999f, -1.539999f);
                        }, 110, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(26.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.300000f, 1.524999f, -1.529999f);
                        }, 110, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(27.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.300000f, 1.524999f, -1.689999f);
                        }, 80, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(27.500000f, 1f, 0f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.300000f, 1.524999f, -1.679999f);
                        }, 70, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(26.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.300000f, 1.524999f, -1.559999f);
                        }, 70, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.300000f, 1.524999f, -1.549999f);
                        }, 150, 0)
                    )
            
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.300000f, 1.300000f, -1.250000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.2f, 1.5f, -1.3f);
                  }, 350, 600)
                    )
            
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.450000f, 1.725000f, -2.599999f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.450000f, 1.725000f, -2.599999f);
                    }, 210, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.490000f, 1.725000f, -2.599999f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScaled(2F, 2F, 2F);
                         GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.500000f, 1.725000f, -2.599999f);
                    }, 240, 0)
                    )
                    
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.03f, 1.52f, -2.999999f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.2f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.32f, 1f);
                } 
                
                // Everything else
                else {
                }
                
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glRotatef(7F, 1f, 0f, 0f);
                GL11.glTranslatef(-0.100000f, 1.725000f, -2.999999f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-2.700000f, 1.700000f, -2.350000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    	 
//                    	 GL11.glScalef(4f, 4f, 4f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                     })
             
             .withFirstPersonHandPositioningLoadIterationCompleted(
            		 (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                    	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                     GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                     GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-0.175000f, -0.850000f, -0.050000f);
                    }, 
                    (renderContext) -> {
                     GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                     GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(0.550000f, -0.575000f, -0.000000f);
                    })
        
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 0))
                    
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                   	 GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.615000f, -0.550000f, -0.025000f);
                    })
            
            .withFirstPersonLeftHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                   	 	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                   	 	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                   	 	GL11.glTranslatef(-0.325000f, -0.725000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.290000f, -0.740000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.270000f, -0.820000f, -0.130000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningLoadIteration(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.625000f, -0.100000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.275000f, -0.600000f, -0.075000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningAllLoadIterationsCompleted(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, -0.075000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.525000f, -0.550000f, -0.025000f);
                    }, 250, 50))
            
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(-0.250000f, -0.900000f, -0.050000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.625000f, -0.025000f);
                    }, 250, 100)
                    )
            
            .build())
        .withSpawnEntityDamage(14f)
        .withSpawnEntityGravityVelocity(0.016f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}