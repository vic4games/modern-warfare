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
import com.vicmatskiv.mw.models.KBP9A91;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.OKP7;
import com.vicmatskiv.mw.models.OKP7reticle;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.PSO1reticle;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
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

public class KBP9A91Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("kbp_9a91")
        .withFireRate(0.7f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("kbp_9a91")
        .withSilencedShootSound("kbp9a91_silenced")
        .withReloadSound("kbp9a91_reload")
        .withInspectSound("inspection")
        .withDrawSound("ak_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.15f)
        .withInaccuracy(2f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Carbine",
        "Damage: 7", 
        "Cartridge: 9x39mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 70/100",
        "Magazines:",
        "20rnd 9x39mm KBP Magazine"))
        .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalIngot)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2f, // x 
                0.1f, // y
                3f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        
        .withCompatibleAttachment(AuxiliaryAttachments.KBP9A91action, true, (model) -> {
//            GL11.glTranslatef(0F, 0F, 1F);
        })
        .withCompatibleAttachment(Attachments.KBP9A91Handguard, true, (model) -> {
//            GL11.glTranslatef(0F, 0F, 0.33F);
        })
        .withCompatibleAttachment(Attachments.KBP9A91CompactHandguard, (model) -> {
//          GL11.glTranslatef(0F, 0F, 0.33F);
        })
        .withCompatibleAttachment(Attachments.KBP9A91KulaTacHandguard, (model) -> {
//          GL11.glTranslatef(0F, 0F, 0.33F);
        })
       .withCompatibleAttachment(Magazines.KBP9A91Mag, (model) -> {
//    	   GL11.glTranslatef(-0.4F, 1.5F, 0.2F);
//           GL11.glRotatef(-15F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Attachments.SuppressorKBP9A91, (model) -> {
//          GL11.glTranslatef(-0.25F, -1.14F, -6.4F);
//          GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(Attachments.KobraMount, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.23F, -0.4F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.OKP7, (player, stack) -> {
                GL11.glTranslatef(-0.18F, -0.65F, -1F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof OKP7reticle) {
                GL11.glTranslatef(0.17F, -1.15F, -0.6F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
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
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.15F, -3.3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.15F, -3.3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.15F, -3.3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("kbp9a91")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new KBP9A91())
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
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.200000f, 0.925000f, -0.400000f);
                
//                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//                GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(0.225000f, 1.149999f, 0.150000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.200000f, 0.925000f, -0.100000f);
                GL11.glRotatef(-1.4F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.13f, 0.6f, -0.8f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(2f, 2f, 2f);
                GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.15f, 0.6f, -0.7f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.KBP9A91action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.KBP9A91action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
            
            .withFirstPersonPositioningReloading(
            		
            		// hand down, gun left
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-13.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(24.800000f, 0f, 1f, 0f);
                        GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.42f, 0.98f, -0.325000f);
                    }, 270, 0),
                    
                    // hand up with mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.950000f, -0.325000f);
                    }, 200, 0),
                    
                    // mag touches gun
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-14.400000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.800000f, 0f, 1f, 0f);
                    GL11.glRotatef(61.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, 0.950000f, -0.325000f);
                }, 110, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-14.100000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.200000f, 0f, 1f, 0f);
                    GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, 0.950000f, -0.325000f);
                }, 80, 0),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-14.400000f, 1f, 0f, 0f);
                    GL11.glRotatef(24.900000f, 0f, 1f, 0f);
                    GL11.glRotatef(61.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, 0.96f, -0.325000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-15.700000f, 1f, 0f, 0f);
                    GL11.glRotatef(24.600000f, 0f, 1f, 0f);
                    GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, 0.9f, -0.325000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-14.400000f, 1f, 0f, 0f);
                    GL11.glRotatef(24.500000f, 0f, 1f, 0f);
                    GL11.glRotatef(62.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, 0.9f, -0.325000f);
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-14.100000f, 1f, 0f, 0f);
                    GL11.glRotatef(24.300000f, 0f, 1f, 0f);
                    GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.400000f, 0.93f, -0.325000f);
                }, 90, 0),
                
                // hand moves to action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-14.600000f, 1f, 0f, 0f);
                    GL11.glRotatef(27.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.225000f, 1.149999f, 0.0f);
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.225000f, 1.149999f, 0.150000f);
                }, 90, 0),
                
                // pulls action halfway
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-15.700000f, 1f, 0f, 0f);
                    GL11.glRotatef(31.60000f, 0f, 1f, 0f);
                    GL11.glRotatef(64.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.225000f, 1.2f, 0.17f);
                }, 110, 0),
                
                // finishes pulling action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-16.800000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.500000f, 0f, 1f, 0f);
                    GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.225000f, 1.25f, 0.25f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-16.600000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.900000f, 0f, 1f, 0f);
                    GL11.glRotatef(67.700000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.225000f, 1.22f, 0.22f);
                }, 60, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-16.200000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.400000f, 0f, 1f, 0f);
                    GL11.glRotatef(69.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.225000f, 1.23f, 0.24f);
                }, 70, 0),
                
                // lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-16.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.225000f, 1.15f, 0.1f);
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-15.700000f, 1f, 0f, 0f);
                    GL11.glRotatef(29.600000f, 0f, 1f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.225000f, 1.22f, 0.17f);
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                    GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(32.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(63.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.225000f, 1.23f, 0.12f);
                }, 90, 0)
            )
            
            .withFirstPersonPositioningUnloading(
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.400000f, 0.950000f, -0.325000f);
                    }, 270, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-13.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(67.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.41f, 0.97f, -0.305000f);
                    }, 160, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-12.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.100000f, 0f, 1f, 0f);
                        GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.45f, 0.94f, -0.475000f);
                    }, 180, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(24.800000f, 0f, 1f, 0f);
                        GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, 0.950000f, -0.445000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-11.800000f, 1f, 0f, 0f);
                        GL11.glRotatef(24.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.42f, 0.98f, -0.435000f);
                    }, 50, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                        GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(24.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(66.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.43f, 1f, -0.385000f);
                    }, 200, 0)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.KBP9A91action.getRenderablePart(),
            		// hand down, gun left
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 0),
                    
                    // hand up with mag
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    
                    // mag touches gun
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 80, 0),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0),
                
                // hand moves to action
                
                new Transition((renderContext) -> { // Reload position
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0),
                
                // pulls action halfway
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0F, 0F, 0.4F);
                }, 80, 0),
                
                // finishes pulling action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0F, 0F, 1F);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0F, 0F, 1F);
                }, 60, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0F, 0F, 1F);
                }, 60, 0),
                
                // lets go of action
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0)
            )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.KBP9A91Mag,
            		// hand down, gun left
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0F, 15F, -2F);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 270, 0),
                    
                    // hand up with mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.4F, 1.5F, 0.2F);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 150, 0),
                    
                    // mag touches gun
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0F, 0.6F, -0.15F);
                    GL11.glRotatef(-15F, 1f, 0f, 0f);
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glTranslatef(0F, 0.6F, -0.15F);
                    GL11.glRotatef(-15F, 1f, 0f, 0f);
                }, 80, 0),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0),
                
// hand moves to action
                
                new Transition((renderContext) -> { // Reload position
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0),
                
                // pulls action halfway
                
                new Transition((renderContext) -> { // Reload position
                }, 80, 0),
                
                // finishes pulling action
                
                new Transition((renderContext) -> { // Reload position
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 60, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 60, 0),
                
                // lets go of action
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                }, 90, 0)
            )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.KBP9A91Mag,
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    }, 170, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0F, 0.6F, -0.15F);
                        GL11.glRotatef(-15F, 1f, 0f, 0f);
                    }, 150, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.4F, 1.6F, 0.4F);
                        GL11.glRotatef(-8F, 1f, 0f, 0f);
                        GL11.glRotatef(25F, 0f, 0f, 1f);
                    }, 100, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.6F, 1.2F, -0.6F);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glRotatef(30F, 0f, 0f, 1f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.7F, 2.6F, -1.5F);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0F, 15F, -2F);
                        GL11.glRotatef(35F, 1f, 0f, 0f);
                        GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 70, 0)
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
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.KBP9A91action.getRenderablePart(),
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
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 1.249999f, -0.5f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 1.249999f, -0.45f);
                    }, 190, 150),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(27.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 1.249999f, -0.5f);
                    }, 190, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.KBP9A91action.getRenderablePart(),
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
                GL11.glTranslatef(0.350000f, 0.73f, -0.4f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraMount)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0F, 0.305f, 0f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.06F, 0.17f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.015F, 0.22f, 0.25f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.72f, -0.2f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraMount)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0F, 0.305f, 0f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.06F, 0.17f, 0f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.015F, 0.22f, 0.1f);
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
                                activeAttachment == Attachments.VGrip) {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.350000f, -0.275000f, 0.100000f);
                         } else {
                        	 GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.125000f, -0.450000f, 0.150000f);
                             
//                             GL11.glScalef(4f, 4f, 4f);
                         }
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                         
//                    	 GL11.glScalef(4f, 4f, 4f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		 (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, -0.450000f, 0.150000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningZooming(
            		 (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.125000f, -0.450000f, 0.150000f);
                     }, 
                     (renderContext) -> {
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.175000f, -0.575000f, -0.075000f);
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
                    
// hand down, gun left
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                    }, 270, 0),
                    
                    // hand up with mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                    }, 150, 0),
                    
                    // mag touches gun
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                }, 80, 0),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                    GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                }, 90, 0),
                
// hand moves to action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                }, 90, 0),
                
                // pulls action halfway
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                }, 80, 0),
                
                // finishes pulling action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                }, 60, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                }, 60, 0),
                
                // lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.275000f, -0.225000f, 0.075000f);
                }, 90, 0)
            )
                    
            .withFirstPersonRightHandPositioningReloading(
                    
// hand down, gun left
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                   	 GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.075000f, -0.075000f, 0.075000f);
                    }, 270, 0),
                    
                    // hand up with mag
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, -0.175000f, -0.000000f);
                    }, 150, 0),
                    
                    // mag touches gun
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-90.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.000000f, -0.225000f, 0.160000f);
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-90.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.000000f, -0.225000f, 0.160000f);
                }, 80, 0),
                
                // mag inserts
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.190000f, -0.225000f, 0.030000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.190000f, -0.225000f, 0.030000f);
                }, 70, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.190000f, -0.225000f, 0.030000f);
                }, 80, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.190000f, -0.225000f, 0.030000f);
                }, 90, 0),
                
// hand moves to action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
	               	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
	               	 GL11.glRotatef(55.000000f, 0f, 1f, 0f);
	               	 GL11.glRotatef(-90.000000f, 0f, 0f, 1f);
	               	 GL11.glTranslatef(0.050000f, -0.125000f, 0.050000f);
                }, 120, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	 GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
	               	 GL11.glRotatef(55.000000f, 0f, 1f, 0f);
	               	 GL11.glRotatef(-90.000000f, 0f, 0f, 1f);
	               	 GL11.glTranslatef(0.050000f, -0.125000f, 0.050000f);
                }, 90, 0),
                
                // pulls action halfway
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.115000f, -0.150000f, 0.160000f);
                }, 80, 0),
                
                // finishes pulling action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.145000f, -0.280000f, 0.160000f);
                }, 60, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.145000f, -0.280000f, 0.160000f);
                }, 60, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.145000f, -0.280000f, 0.160000f);
                }, 60, 0),
                
                // lets go of action
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.125000f, -0.230000f, 0.180000f);
                }, 90, 0),
                
                // jiggle
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.125000f, -0.230000f, 0.180000f);
                }, 90, 0),
                
                new Transition((renderContext) -> { // Reload position
                	GL11.glScalef(4f, 4f, 4f);
                	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                	GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                	GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                	GL11.glTranslatef(0.165000f, -0.370000f, 0.180000f);
                }, 90, 0)
            )
                    
            .withFirstPersonLeftHandPositioningUnloading(
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                    }, 170, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                    }, 150, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                    }, 100, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.360000f, 0.040000f);
                    }, 70, 0)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
            		// gun goes to the side, hand goes to mag
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.475000f, -0.200000f, 0.200000f);
                    }, 170, 0),
                    // mag moves
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    	GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.500000f, -0.125000f, 0.375000f);
                    }, 150, 0),
                    // mag is out
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.550000f, -0.200000f, 0.475000f);
                    }, 100, 0),
                    // mag is flung
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.600000f, 0.025000f, 0.375000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.550000f, 0.025000f, 0.500000f);
                    }, 70, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.550000f, 0.025000f, 0.500000f);
                    }, 70, 0)
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
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-190.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(140.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.225000f, -0.300000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-205.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(140.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.025000f, -0.450000f, -0.225000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-190.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(140.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.225000f, -0.300000f);
                    }, 280, 0)
                    )
             
            .build())
        .withSpawnEntityDamage(7f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

