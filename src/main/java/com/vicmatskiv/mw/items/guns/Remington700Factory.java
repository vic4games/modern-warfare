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
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AX50;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.G95_frontsights;
import com.vicmatskiv.mw.models.G95_rearsights;
import com.vicmatskiv.mw.models.GunwerksHAMR;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.Remington700;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Remington700Factory implements GunFactory {

    @SuppressWarnings("unchecked")
	public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("remington_700")
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("r700_boltaction")
        .withRecoil(10f)
        .withZoom(0.8f)
        .withMaxShots(1)
        .withShootSound("r700")
        .withPumpTimeout(1100)
        .withSilencedShootSound("snipersilencer")
        .withReloadSound("r700_reload")
        .withUnloadSound("r700_unload")
        .withInspectSound("inspection")
        .withDrawSound("ax50_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.14f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(ModernWarfareMod.CombatServerTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Precision Sniper Rifle",
        "Damage: 20", 
        "Cartridge: .300 Winchester",
        "Fire Rate: BOLT ACTION",
        "Rate of Fire: 16/100",
        "Magazines:",
        "6rnd .300 Winchester M700 Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 6f, // y
                 10f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.SCOPE)
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withCompatibleAttachment(Magazines.R700Mag, (model) -> {
//        	GL11.glTranslatef(0f, 0.2f, 0f);
//        	GL11.glRotatef(-20f, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Remington700BoltAction, true, (model) -> {
        	GL11.glTranslatef(-0.105F, -0.585F, 0.63F);
            GL11.glScalef(0.62f, 0.62f, 0.5f);
        })
        .withCompatibleAttachment(Attachments.Remington700Chassis, true, (model) -> {
//          GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
//          GL11.glRotatef(70f, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.LeupoldScope, true, (player, stack) -> {
            GL11.glTranslatef(-0.105F, -0.53F, -0.43F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
             if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
            }
        })
        .withTextureNames("gun")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Remington700())
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
            	GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-0.9F, 0.4F, 1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.075000f, 0.200000f, -1.025000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(4f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.075000f, 0.200000f, -0.225000f);
                 GL11.glRotatef(-2f, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.5f, 1.4f, -1.4f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(8f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.5f, 1.4f, -1.2f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(), (renderContext) -> {
            
//            	GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
//                GL11.glRotatef(90F, 0f, 0f, 1f);
//                GL11.glScalef(1f, 1f, 1f); 
                
//            	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
//                  GL11.glRotatef(90F, 0f, 0f, 1f);
//                  GL11.glScalef(1f, 1f, 1f);
            
            })
                
            .withFirstPersonPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.080000f, 0.260000f, -0.995000f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.120000f, 0.300000f, -0.998000f);
                    }, 110, 70),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.300000f, -0.775000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.300000f, -0.795000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.300000f, -0.785000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.280000f, -0.975000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, 0.250000f, -0.995000f);
                    }, 80, 0)
                    
                    )
            
            .withFirstPersonPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.260000f, -0.995000f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.300000f, -0.998000f);
                    }, 110, 70),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.300000f, -0.775000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.300000f, -0.795000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.300000f, -0.785000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.280000f, -0.975000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, 0.250000f, -0.995000f);
                    }, 80, 0)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
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
                    new Transition((renderContext) -> { // Reload position
                    	
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                          GL11.glRotatef(90F, 0f, 0f, 1f);
                          GL11.glScalef(1f, 1f, 1f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                      }, 250, 50)
                    
                    )
            
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
                
             .withFirstPersonPositioningReloading(
            		 
            		// reload
            		 
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.225000f, -0.950000f);
                     }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.235000f, -0.950000f);
                    }, 350, 130),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.215000f, -0.950000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-10.500000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.215000f, -0.950000f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.215000f, -0.950000f);
                    }, 60, 0),
                    
                    // bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(8.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.260000f, -0.995000f);
                    }, 160, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.300000f, -0.998000f);
                    }, 110, 70),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.300000f, -0.775000f);
                    }, 80, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-4.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.300000f, -0.795000f);
                    }, 20, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.300000f, -0.785000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.280000f, -0.975000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.070000f, 0.250000f, -0.995000f);
                    }, 80, 0)
                    
                    )
                    
            .withFirstPersonPositioningUnloading(
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-7.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.135000f, -0.950000f);
                     }, 220, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.245000f, -0.950000f);
                     }, 100, 0),
                     new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.125000f, 0.225000f, -0.950000f);
                     }, 270, 0))
            
            .withFirstPersonCustomPositioningReloading(Magazines.R700Mag,
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 3f, 0f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.2f, 0f);
                    	GL11.glRotatef(-20f, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.R700Mag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 0.2f, 0f);
                    	GL11.glRotatef(-20f, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0f, 3f, 0f);
                    	GL11.glRotatef(15f, 1f, 0f, 0f);
                    }, 250, 1000)
                    )
                        
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 0.125000f, -0.925000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                	  GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                	  GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                	  GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                	  GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                	  GL11.glTranslatef(-0.050000f, 0.450000f, -0.900000f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-3.3F, 0.2F, 3F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(95F, 1f, 0f, 0f);
                         GL11.glRotatef(10F, 0f, 0f, 1f);
                     }, 370, 50),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(100F, 1f, 0f, 0f);
                         GL11.glRotatef(10F, 0f, 0f, 1f);
                     }, 200, 100),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                         GL11.glRotatef(-70F, 0f, 1f, 0f);
                         GL11.glRotatef(100F, 1f, 0f, 0f);
                         GL11.glRotatef(10F, 0f, 0f, 1f);
                     }, 140, 100),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-2.5F, 0F, 3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 270, 0),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-2.5F, 0F, 3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 240, 0),
                     new Transition((renderContext) -> { // Reload position
                         GL11.glScaled(0.52F, 0.52F, 0.52F);
                         GL11.glTranslatef(-2.5F, 0F, 3F);
                         GL11.glRotatef(-45F, 0f, 1f, 0f);
                         GL11.glRotatef(90F, 1f, 0f, 0f);
                     }, 500, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-2.5F, 0F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(100F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 280, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-3.3F, -0.2F, 3.3F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(100F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 220, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.52F, 0.52F, 0.52F);
                        GL11.glTranslatef(-3.3F, 0.2F, 3F);
                        GL11.glRotatef(-70F, 0f, 1f, 0f);
                        GL11.glRotatef(95F, 1f, 0f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                    }, 160, 0))
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-1.39f, -1.13f, 1.5f);
                        GL11.glRotatef(70f, 0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(16.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.350000f, -0.925000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.320000f, -0.925000f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                        GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.280000f, -0.925000f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    	 GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30F, 0f, 1f, 0f);
                         GL11.glRotatef(16f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, 0.240000f, -1.025000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                    	 GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(40F, 0f, 1f, 0f);
                         GL11.glRotatef(12f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, 0.200000f, -1.065000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(8f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, 0.200000f, -1.125000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                         GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(4f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.075000f, 0.200000f, -1.025000f);
                    }, 100, 0)
                    
                    )
            
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                  	  GL11.glTranslatef(-0.59F, -0.43F, 0.5F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                  	  GL11.glTranslatef(-0.59F, -0.43F, -0.01F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScalef(1f, 1f, 1f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50)
                  
                  )
              
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(0.309f, 0.21f, -0.7f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 0.65f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glTranslatef(0.309f, 0.21f, -0.6f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 0.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
            	GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
            	GL11.glRotatef(15.000000f, 1f, 0f, 0f);
            	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
            	GL11.glRotatef(20.000000f, 0f, 0f, 1f);
            	GL11.glTranslatef(-0.100000f, 0.500000f, -0.500000f);
             })
             
             .withFirstPersonPositioningModifying((renderContext) -> {
            	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.175000f, 0.125000f, -0.925000f);
             })
             
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
            	 GL11.glScalef(2.500000f, 2.500000f, 2.500000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.175000f, 0.125000f, -0.925000f);
             })
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    	 
//                    	 GL11.glScalef(3f, 3f, 3f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    	 
//                    	 GL11.glScalef(3f, 3f, 3f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
            		(renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    })
                     
            .withFirstPersonHandPositioningModifyingAlt(
            		(renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3f, 3f, 3f);
                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    })
            
            .withFirstPersonLeftHandPositioningReloading(
            		
            		// reload
            		
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.350000f, -1.199999f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.000000f, -1.000000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.050000f, -0.875000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.050000f, -0.875000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.050000f, -0.875000f, 0.250000f);
                    }, 50, 200),
                    
                    // bolt action
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.600000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.325000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.050000f, -0.875000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.000000f, -1.000000f, 0.250000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.350000f, -1.199999f, 0.250000f);
                    }, 50, 200))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRound(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.600000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.325000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200))
            
            .withFirstPersonLeftHandPositioningEjectSpentRoundAimed(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                       	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                       	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                       	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(3f, 3f, 3f);
                    	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 50, 200)
                    
                )
                    
            .withFirstPersonRightHandPositioningEjectSpentRoundAimed(
            		new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.600000f, 0.000000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.325000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                      	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                      	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                      	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                      	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                      	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.650000f, -0.900000f, 0.175000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.100000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.075000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.125000f, -0.025000f);
                    }, 50, 200))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.175000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.125000f, 0.150000f);
                    }, 50, 200))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                     	 GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                     	 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                     	 GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                     	 GL11.glTranslatef(0.250000f, -0.400000f, 0.325000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
            		new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-120.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.800000f, -0.600000f, -0.050000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.325000f, -0.600000f, -0.075000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.425000f, -0.775000f, 0.150000f);
                    }, 50, 200))
                    
            .build())
        .withSpawnEntityDamage(20f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}