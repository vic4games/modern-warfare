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
import com.vicmatskiv.mw.models.APS;
import com.vicmatskiv.mw.models.APSrearsight;
import com.vicmatskiv.mw.models.Emp1911;
import com.vicmatskiv.mw.models.Emp1911Slide;
import com.vicmatskiv.mw.models.M1911frontsight;
import com.vicmatskiv.mw.models.M1911rearsight;
import com.vicmatskiv.mw.models.M9A1;
import com.vicmatskiv.mw.models.M9A1frontsight;
import com.vicmatskiv.mw.models.M9A1rearsight;
import com.vicmatskiv.mw.models.APSslide;
import com.vicmatskiv.mw.models.makarovfrontsight;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class APSFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("aps")
        .withFireRate(0.6f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("aps")
        .withSilencedShootSound("m9a1_silenced")
        .withReloadSound("aps_reload")
        .withUnloadSound("pistol_unload")
        .withInspectSound("inspection")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.19f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Machine Pistol", 
        "Damage: 5", 
        "Cartridge: 9x19mm",
        "Fire Rate: SEMI",
        "Rate of Fire: 75/100",
        "Magazines:",
        "20rnd 9x19mm Magazine (APS)"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2.5f, // x 
                0.1f, // y
                1f) // z
        
        .withCrafting(CraftingComplexity.LOW,
                Ores.GunmetalPlate,
                Ores.PlasticPlate)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(AuxiliaryAttachments.APSslide, true, (model) -> {
            if(model instanceof APSslide) {
                GL11.glScaled(1F, 1F, 1F);
//                GL11.glTranslatef(0F, 0F, 0.5F);
            }
            else if(model instanceof APSrearsight) {
                GL11.glTranslatef(-0.147F, -1.1F, 0.02F);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
            }
            else if(model instanceof makarovfrontsight) {
                GL11.glTranslatef(-0.15F, -1.09F, -2.23F);
                GL11.glScaled(0.2F, 0.2F, 0.25F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.APShammer, true, (model) -> {
//          GL11.glTranslatef(-0F, -0.17F, 0.53F);
//        	GL11.glRotatef(45F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.APSMag, (model) -> {
//            GL11.glTranslatef(0F, 0.2F, 0.12F);
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.215F, -1.05F, -4.52F);
            GL11.glScaled(1.1F, 1.1F, 1.3F);
        })
        .withCompatibleAttachment(Attachments.APSStock, (model) -> {
//            GL11.glTranslatef(-0.215F, -1.05F, -4.52F);
//            GL11.glScaled(1.1F, 1.1F, 1.3F);
        })
        .withCompatibleAttachment(Attachments.APSGrip, true, (model) -> {
//          GL11.glTranslatef(-0.215F, -1.05F, -4.52F);
//          GL11.glScaled(1.1F, 1.1F, 1.3F);
      })
        .withTextureNames("APS")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new APS())
            //.withTextureName("M9")
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
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.025000f, 0.800000f, -1.599999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	 GL11.glScaled(2F, 2F, 2F);
                 GL11.glRotatef(45F, 0f, 1f, 0f);
                 GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.025000f, 0.800000f, -1.199999f);
                GL11.glRotatef(-6F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(14F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.15f, 0.45f, -2f);
                
//                GL11.glScaled(2F, 2F, 2F);
//                GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(36.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(35.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.5f, 1.1f, -1.8f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(18F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.15f, 0.45f, -1.8f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);    
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.APSslide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.APSslide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.APShammer.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(-0F, -0.17F, 0.53F);
            	GL11.glRotatef(45F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.APShammer.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(-0F, -0.17F, 0.53F);
            	GL11.glRotatef(45F, 1f, 0f, 0f);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.APSslide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.6F);
                }
            })
                
            .withFirstPersonPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-29.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.800000f, -1.680000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-34.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.650000f, -1.500000f);
                    }, 180, 50),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-32.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-39.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.300000f, -1.550000f);
                    }, 150, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-29.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.37f, -1.550000f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-38.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.25f, -1.550000f);
                    }, 90, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-36.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 0.33f, -1.550000f);
                    }, 120, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-33.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.60000f);
                    }, 230, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-31.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.500000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.650000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-32.300000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.650000f);
                    }, 100, 0),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.700000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.550000f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.650000f);
                    }, 80, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-24.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.199999f, 1.100000f, -1.650000f);
                    }, 100, 0)
                )
                
            .withFirstPersonPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-19.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.950000f, 0.9050000f, -1.524999f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(36.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.950000f, 1.100000f, -1.524999f);
                    }, 150, 0),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-21.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.500000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.950000f, 0.980000f, -1.524999f);
                    }, 120, 0)
                )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.APSMag,
// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.05f, 2f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.07f, 1f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
//                    	GL11.glTranslatef(-0.02f, 0f, 0f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0)
                )
                        
            .withFirstPersonCustomPositioningUnloading(Magazines.APSMag,
            		new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(0F, 1F, 0.4F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 1.7F, 0.4F);
                    }, 250, 1000)
                        )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.APSslide.getRenderablePart(),
// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.4f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.4f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.4f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.4f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.4f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.4f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.4f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.4f);
                    }, 270, 50),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.4f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    }, 70, 0)
                )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.APSslide.getRenderablePart(),
            		new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.4F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.4F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.4F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.100000f, 0.800000f, -0.975000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(1.000000f, 1.300000f, -1.075000f);
                  }, 350, 600)
                    )
                    
            .withThirdPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 10),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 70, 50)
                )
                    
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.APSslide.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(15F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.000000f, 0.700000f, -2.1f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(7F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.000000f, 0.700000f, -2.1f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(0F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.000000f, 0.700000f, -2.1f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(-5F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.000000f, 0.80000f, -2.1f);
                    }, 130, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, 0.700000f, -2.1f);
                    }, 120, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.APSslide.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.54f, -2f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.32f, 0.45f, -1.7f);
                GL11.glRotatef(-5F, 1f, 0f, 0f);
                GL11.glRotatef(2F, 0f, 0f, 1f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(15F, 0f, 0f, 1f);
                GL11.glRotatef(7F, 1f, 0f, 0f);
                GL11.glTranslatef(0.200000f, 0.800000f, -2.1f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.374999f, 0.600000f, -1.449999f);
             })
             .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScaled(3F, 3F, 3F);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.774999f, 0.100000f, -1.949999f);
             })
             .withFirstPersonHandPositioning(
            		 (renderContext) -> {
            			 GL11.glScalef(4f, 4f, 4f);
            			 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
            			 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
            			 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
            			 GL11.glTranslatef(-0.075000f, -0.825000f, 0.050000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.430000f, -0.485000f, 0.200000f);
                     })
            .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.125000f, 0.400000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    })
           
            .withFirstPersonHandPositioningModifyingAlt(
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(110.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.750000f, 0.025000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.550000f, 0.125000f);
                    })
           .withFirstPersonLeftHandPositioningReloading(
                   
           		// left hand goes down
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                       GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.825000f, 0.200000f);
                   }, 300, 0),
                   
                   // mag touches gun
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(85.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(0.200000f, -1.025000f, 0.050000f);
                   }, 200, 0),
                   
                   // mag slides in
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(75.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.025000f, -0.850000f, 0.025000f);
                   }, 200, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(75.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.025000f, -0.850000f, 0.025000f);
                   }, 200, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(75.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.025000f, -0.850000f, 0.025000f);
                   }, 200, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(75.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.025000f, -0.850000f, 0.025000f);
                   }, 200, 0),
                   
                   // gun rotates (ready to push release button)
               
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.175000f, -0.925000f, 0.000000f);
                   }, 270, 50),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.175000f, -0.925000f, 0.000000f);
                   }, 270, 50),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.175000f, -0.925000f, 0.000000f);
                   }, 270, 50),
                   
                   // slide releases
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.175000f, -0.925000f, 0.000000f);
                   }, 70, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.175000f, -0.925000f, 0.000000f);
                   }, 70, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.175000f, -0.925000f, 0.000000f);
                   }, 70, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
          			 GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
          			 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
          			 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
          			 GL11.glTranslatef(0.175000f, -0.925000f, 0.000000f);
                   }, 70, 0)
               )
                   
           .withFirstPersonRightHandPositioningReloading(
                   
           		// left hand goes down
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.525000f, 0.125000f);
                   }, 300, 0),
                   
                   // mag touches gun
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.525000f, 0.125000f);
                   }, 200, 0),
                   
                   // mag slides in
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.525000f, 0.125000f);
                   }, 200, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.525000f, 0.125000f);
                   }, 200, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.525000f, 0.125000f);
                   }, 200, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.525000f, 0.125000f);
                   }, 200, 0),
                   
                   // gun rotates (ready to push release button)
               
                   new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                   }, 270, 50),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                   }, 270, 50),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                   	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                   	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                   }, 270, 50),
                   
                   // slide releases
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                   }, 70, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                   }, 70, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                   }, 70, 0),
                   
                   // jiggle
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                   	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(0.410000f, -0.490000f, 0.160000f);
                   }, 70, 0)
               )
                   
           .withFirstPersonLeftHandPositioningUnloading(
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(-0.050000f, -0.800000f, 0.225000f);
                   	
                   }, 330, 200),
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
	           			 GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
	           			 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
	           			 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
	           			 GL11.glTranslatef(-0.025000f, -0.825000f, 0.250000f);
                   }, 50, 200),
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                   	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                   	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                   	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                   	GL11.glTranslatef(0.275000f, -0.750000f, 0.425000f);
                   }, 250, 0))
                   
           .withFirstPersonRightHandPositioningUnloading(
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.525000f, 0.125000f);
                   }, 250, 1000),
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.525000f, 0.125000f);
                   }, 250, 50),
                   
                   new Transition((renderContext) -> { // Reload position
                   	GL11.glScalef(4f, 4f, 4f);
                       GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.350000f, -0.525000f, 0.125000f);
                   }, 250, 0))
                    
            .withFirstPersonHandPositioningZooming(
            		(renderContext) -> {
           			 GL11.glScalef(4f, 4f, 4f);
           			GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
           			GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
           			GL11.glRotatef(40.000000f, 0f, 0f, 1f);
           			GL11.glTranslatef(-0.110000f, -0.845000f, 0.095000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.490000f, 0.175000f);
                        
                        GL11.glTranslatef(0.000000f, 0.000000f, 0.010000f);
                    })
                  
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.275000f, -0.050000f, 0.400000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                    	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.100000f, 0.000000f, 0.225000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.400000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.440000f, -0.525000f, 0.125000f);
                    }, 250, 50))
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-48.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(43.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-66.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-57.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, 0.075000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.800000f, 0.075000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.675000f, 0.150000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.725000f, 0.025000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-160.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.500000f, -0.675000f, 0.150000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.395000f, -0.510000f, 0.180000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.395000f, -0.510000f, 0.180000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.395000f, -0.510000f, 0.180000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.395000f, -0.510000f, 0.180000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.395000f, -0.510000f, 0.180000f);
                    }, 280, 0)
                    )
                          
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
