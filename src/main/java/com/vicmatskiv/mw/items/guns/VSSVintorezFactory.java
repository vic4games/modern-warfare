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
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.MilSpecStock;
import com.vicmatskiv.mw.models.OKP7reticle;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.PSO1reticle;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.VSSVintorez;
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

public class VSSVintorezFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("vss_vintorez")
        .withFireRate(0.7f)
        .withRecoil(1.5f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("vss_vintorez")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("ak15_reload")
        .withUnloadSound("ak_unload")
        .withInspectSound("inspection")
        .withDrawSound("ak_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.4f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.11f)
        .withShootSoundVolume(1f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Special Sniper Rifle",
        "Damage: 7", 
        "Cartridge: 9x39mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 70/100",
        "Magazines:",
        "20rnd 9x39mm Magazine"))
         .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 0.1f, // y
                 3f) // z
         
         .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
         .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         
        .withCompatibleAttachment(AuxiliaryAttachments.VSSVintorezAction, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSVintorezDustCover, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSMDustCover, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSVintorezStock, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.ASValStock, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSVintorezHandguard, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.ASValHandguard, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSVintorezMilspecStock, (player, stack) -> {
//        	GL11.glTranslatef(-0.212F, -0.486F, 1.27F);
//            GL11.glScaled(0.017F, 0.017F, 0.017F);
        },(model) -> {
        	if(model instanceof MilSpecStock) {
                GL11.glTranslatef(0F, 0.12F, -0.1F);
//                GL11.glScaled(0.017F, 0.017F, 0.017F);
            }
        })
        .withCompatibleAttachment(Attachments.VSSVintorezTriRailMount, (model) -> {
        })
        .withCompatibleAttachment(Magazines.VSSVintorezMag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.ASValMag, (model) -> {
        })
        .withCompatibleAttachment(Attachments.PSO1, (player, stack) -> {
            GL11.glTranslatef(0.14F, -0.9F, -1.2F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        },(model) -> {
            if(model instanceof PSO1reticle) {
                GL11.glTranslatef(-0.212F, -0.486F, 1.27F);
                GL11.glScaled(0.017F, 0.017F, 0.017F);
            }
             else if(model instanceof PSO12) {
                 GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                 GL11.glScaled(0.8F, 0.8F, 0.8F);
             }
        })
        .withCompatibleAttachment(Attachments.OKP7, (player, stack) -> {
                GL11.glTranslatef(-0.2F, -0.65F, -1F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof OKP7reticle) {
                GL11.glTranslatef(0.17F, -1.15F, -0.6F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraMount, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.23F, -0.6F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
        	GL11.glTranslatef(0F, -0.95F, -4.5F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Laser, (p, s) -> {
			GL11.glTranslatef(0F, -0.95F, -4.5F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.1F, -4.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.15F, -3.8F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.15F, -3.8F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.2F, 0F, -4.2F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("vssvintorez")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new VSSVintorez())
            //.withTextureName("AK47")
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
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
             .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.24f, 0.84f, -0.500000f);
                
//                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//                GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(39.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.750000f, 1.150000f, -0.500000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.24f, 0.84f, -0.200000f);
                GL11.glRotatef(-0.6F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.13f, 0.6f, -0.7f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.15f, 0.6f, -0.6f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
            .withFirstPersonCustomPositioning(Magazines.VSSVintorezMag.getRenderablePart(), (renderContext) -> {
//            	GL11.glTranslatef(2F, 6.5F, -2.5F);
//                GL11.glRotatef(15F, 1f, 0f, 0f);
//                GL11.glRotatef(-10F, 0f, 0f, 1f);
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.VSSVintorezAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.VSSVintorezAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
            
            .withFirstPersonPositioningReloading(
            		
            		// reaches down to get mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.750000f, 1.14f, -0.500000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-24.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.750000f, 1.05f, -0.500000f);
                    }, 300, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-23.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.750000f, 1.050000f, -0.470000f);
                    }, 80, 0),
                    
                    // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.700000f, 0f, 1f, 0f);
                    GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.750000f, 1.1f, -0.500000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-26.300000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.300000f, 0f, 1f, 0f);
                    GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.750000f, 0.94f, -0.500000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-26.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.100000f, 0f, 1f, 0f);
                    GL11.glRotatef(-12.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.750000f, 1.0f, -0.500000f);
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-26.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.100000f, 0f, 1f, 0f);
                    GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.750000f, 0.99f, -0.500000f);
                }, 80, 0),
                
                // begins reaching action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-26.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.750000f, 1.02f, -0.500000f);
                }, 150, 0),
                
                // reaches action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 0.6f, -0.42f);
                }, 200, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-24.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-38.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 0.525000f, -0.43f);
                }, 70, 0),
                
                // pulls action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-26.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(39.500000f, 0f, 1f, 0f);
                    GL11.glRotatef(-42.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 0.525000f, -0.35f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-28.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 0.525000f, -0.22f);
                }, 50, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-27.200000f, 1f, 0f, 0f);
                    GL11.glRotatef(39.200000f, 0f, 1f, 0f);
                    GL11.glRotatef(-43.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 0.525000f, -0.23f);
                }, 90, 0),
                
                // lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-21.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 0.525000f, -0.47f);
                }, 100, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-36.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 0.525000f, -0.38f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-37.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 0.55f, -0.43f);
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-20.500000f, 1f, 0f, 0f);
                    GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-34.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.800000f, 0.6f, -0.4f);
                }, 90, 0)
            )
            
            .withFirstPersonPositioningUnloading(
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-17.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(41.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.76f, 1.12f, -0.44f);
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(39.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.750000f, 1.150000f, -0.42f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.00000f, 0f, 1f, 0f);
                        GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 1.150000f, -0.5f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.74f, 1.14f, -0.45f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.200000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.74f, 1.150000f, -0.43f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(38.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.600000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.74f, 1.13f, -0.4f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.VSSVintorezAction.getRenderablePart(),
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
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 1F);
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
                    
            .withFirstPersonCustomPositioningReloading(Magazines.VSSVintorezMag,
            		// mag is down
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 3F, -0.15F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 250, 1000),
                    // mag touches gun
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.55F, -0.22F);
                        GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.55F, -0.22F);
                        GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 250, 1000),
                    // mag inserts
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // begins reaching action
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // reaches action
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // pulls action
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // lets go of action
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningReloading(Magazines.ASValMag,
            		// mag is down
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 3F, -0.15F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                    }, 250, 1000),
                    // mag touches gun
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.55F, -0.22F);
                        GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0F, 0.55F, -0.22F);
                        GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 250, 1000),
                    // mag inserts
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // begins reaching action
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // reaches action
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // pulls action
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    // lets go of action
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.VSSVintorezMag,
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0.55F, -0.22F);
                        GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1F, 1.4F, -0.22F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(1F, 2.5F, -1.5F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(1.6F, 3F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2F, 6.5F, -2.5F);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 200, 0)
                    )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.ASValMag,
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0.55F, -0.22F);
                        GL11.glRotatef(-20F, 1f, 0f, 0f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.1F, 1.4F, -0.22F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(1F, 2.5F, -1.5F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(1.6F, 3F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(2F, 6.5F, -2.5F);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.900000f, 0.900000f, -0.375000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                	  GL11.glScalef(2f, 2f, 2f);
                	  GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                	  GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                	  GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                	  GL11.glTranslatef(0.500000f, 1.500000f, -0.875000f);
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
            
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.VSSVintorezAction.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 500, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0f, 0f, 1f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
                        
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.449999f, -0.6f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.449999f, -0.6f);
                    }, 120, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.3f, 0.9f, -0.8f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.3f, 0.8f, -0.85f);
                    }, 190, 150),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-27.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.3f, 0.8f, -0.8f);
                    }, 190, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.VSSVintorezAction.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.7f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.67f, -0.2f);

                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.015F, 0.28f, 0.1f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.04F, 0.24f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraMount)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.36f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.67f, 0f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.015F, 0.28f, -0.05f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.04F, 0.24f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraMount)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.36f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningRunning((renderContext) -> {
            	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                GL11.glRotatef(12.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(0.375000f, 0.175000f, 0.175000f);
             })
             
            .withFirstPersonPositioningModifying((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-1f, 0.675000f, -0.5f);
            })
            
            .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-2.300000f, 0.600000f, 0.500000f);
            })
             
             .withFirstPersonHandPositioning(
			         (renderContext) -> {
                         RenderContext<?> rc = (RenderContext<?>) renderContext;
                         ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                 AttachmentCategory.GRIP, rc.getWeaponInstance());
                         if(activeAttachment == Attachments.Grip2 ||
                                activeAttachment == Attachments.StubbyGrip || 
                                activeAttachment == Attachments.VGrip ||
                                activeAttachment == Attachments.AngledGrip) {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.425000f, -0.125000f, 0.150000f);
                         } else {
                        	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.315000f, -0.315000f, 0.060000f);
                         }
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.315000f, -0.315000f, 0.060000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    })
                     
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
                        GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.315000f, -0.315000f, 0.060000f);
                    }, 
                    (renderContext) -> {
                   	 GL11.glScalef(3.5f, 3.5f, 3.5f);
                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.425000f, 0.100000f, 0.300000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                    })
                    
           .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(130.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.675000f, -0.450000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.625000f, 0.150000f);
                    })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    // mag is down
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.425000f, -0.125000f, -0.050000f);
                    }, 50, 200),
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.300000f, -0.475000f, 0.175000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.300000f, -0.475000f, 0.175000f);
                    }, 50, 200),
                    // mag inserts
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.375000f, 0.100000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.375000f, 0.100000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.375000f, 0.100000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.200000f, -0.375000f, 0.100000f);
                    }, 250, 0),
                    // begins reaching action
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.450000f, 0.225000f);
                    }, 250, 0),
                    // reaches action
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.050000f, -0.500000f, 0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.050000f, -0.500000f, 0.175000f);
                    }, 250, 0),
                    // pulls action
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.575000f, 0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.100000f, -0.625000f, 0.175000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.100000f, -0.625000f, 0.175000f);
                    }, 250, 0),
                    // lets go of action
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.725000f, 0.175000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.325000f, -0.725000f, 0.175000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.325000f, -0.725000f, 0.175000f);
                    }, 300, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.325000f, -0.725000f, 0.175000f);
                    }, 300, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    
            		// reaches mag
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 1000),
                    // mag touches gun
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 1000),
                    
                    // mag inserts
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 50),
                    
                    // begins for action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 50),
                    
                    // action
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 50),
                    
                    // pulls
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 260, 0),
                    
                    // lets go
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 250, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 280, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.150000f, -0.450000f, 0.125000f);
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.225000f, -0.550000f, 0.175000f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.425000f, -0.475000f, 0.175000f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.225000f, 0.150000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.225000f, 0.150000f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.625000f, -0.225000f, 0.150000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
	                   	 GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(25.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.385000f, -0.425000f, 0.200000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.050000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.225000f, -0.375000f, -0.100000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.500000f, 0.150000f);
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
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.350000f, 0.275000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.525000f, 0.300000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.350000f, 0.275000f);
                    }, 300, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.17f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.17f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(13f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

