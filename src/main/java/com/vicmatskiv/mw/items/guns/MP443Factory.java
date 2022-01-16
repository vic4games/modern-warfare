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
import com.vicmatskiv.mw.models.Emp1911;
import com.vicmatskiv.mw.models.Emp1911Slide;
import com.vicmatskiv.mw.models.M1911frontsight;
import com.vicmatskiv.mw.models.M1911rearsight;
import com.vicmatskiv.mw.models.M9A1;
import com.vicmatskiv.mw.models.M9A1frontsight;
import com.vicmatskiv.mw.models.M9A1rearsight;
import com.vicmatskiv.mw.models.MP443;
import com.vicmatskiv.mw.models.MP443Slide;
import com.vicmatskiv.mw.models.P220;
import com.vicmatskiv.mw.models.P225Top;
import com.vicmatskiv.mw.models.P226;
import com.vicmatskiv.mw.models.P226Slide;
import com.vicmatskiv.mw.models.P226frontsight;
import com.vicmatskiv.mw.models.P226rearsight;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class MP443Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("mp443")
        .withFireRate(0.5f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("mp443")
        .withSilencedShootSound("m9a1_silenced")
        .withReloadSound("m9a1_reload")
        .withUnloadSound("pistol_unload")
        .withInspectSound("inspection")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.11f)
        .withFlashOffsetY(() -> 0.13f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Military Service Pistol", 
        "Damage: 5", 
        "Cartridge: 9x19mm",
        "Fire Rate: SEMI",
        "Rate of Fire: 50/100",
        "Magazines:",
        "18rnd 9x19mm 443 Magazine"))
         .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
         .withScreenShaking(RenderableState.SHOOTING, 
                 2.5f, // x 
                 0.1f, // y
                 1.5f) // z
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.MP443Slide, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.MP443hammer, true, (model) -> {
//            GL11.glTranslatef(0.08F, -1.97F, -4.15F);
//            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(Magazines.MP443Mag, (model) -> {
            GL11.glTranslatef(0F, 0F, 0.12F);
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.3F, -1.2F, -4.15F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withTextureNames("mp443")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new MP443())
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
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(0.075000f, 0.925000f, -2.024999f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	 GL11.glScaled(2F, 2F, 2F);
                 GL11.glRotatef(45F, 0f, 1f, 0f);
            	GL11.glRotatef(10.000000f, 0f, 0f, 1f);
            	GL11.glTranslatef(0.075000f, 0.925000f, -1.624999f);
                GL11.glRotatef(-8F, 1f, 0f, 0f);
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
                
            .withFirstPersonPositioningCustomRecoiled(Attachments.MP443Slide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Attachments.MP443Slide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.6F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonCustomPositioning(Attachments.MP443Slide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.6F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MP443hammer.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(-0F, -0.17F, 0.53F);
            	GL11.glRotatef(45F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MP443hammer.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(-0F, -0.17F, 0.53F);
            	GL11.glRotatef(45F, 1f, 0f, 0f);
                })
                
.withFirstPersonPositioningReloading(
            		
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(29.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.54f, -2.024999f);
                    }, 250, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(29.600000f, 0f, 1f, 0f);
                        GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.51f, -2.024999f);
                    }, 210, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.200000f, 0f, 1f, 0f);
                        GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.48f, -2.024999f);
                    }, 65, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-18.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.25f, -2.024999f);
                    }, 100, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-13.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-23.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.22f, -2.024999f);
                    }, 50, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-12.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.23f, -2.024999f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-12.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.300000f, 0f, 1f, 0f);
                        GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.050000f, 0.25f, -2.024999f);
                    }, 90, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScaled(2F, 2F, 2F);
                    	 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.875000f, 0.825000f, -2.024999f);
                    }, 200, 0),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScaled(2F, 2F, 2F);
                    	 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(34.500000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.875000f, 0.805000f, -2.174999f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScaled(2F, 2F, 2F);
                    	 GL11.glRotatef(-9.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(34.300000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.875000f, 0.805000f, -2.044999f);
                    }, 60, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScaled(2F, 2F, 2F);
                    	 GL11.glRotatef(-7.800000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(35.100000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.875000f, 0.805000f, -2.074999f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScaled(2F, 2F, 2F);
                    	 GL11.glRotatef(-5.500000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(34.800000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(-0.875000f, 0.805000f, -2.074999f);
                    }, 90, 0)
                )
                
            .withFirstPersonPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glRotatef(36F, 0f, 1f, 0f);
                        GL11.glRotatef(-10F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 0.4f, -1.8f);
                    }, 220, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-17F, 1f, 0f, 0f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-3F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 1f, -1.8f);
                    }, 110, 0),
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-14F, 1f, 0f, 0f);
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-1F, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.73f, 0.9f, -1.8f);
                    }, 100, 0)
                )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.MP443Mag,
// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0.05f, 3f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(-0.07f, 1f, 0.2f);
                     	 GL11.glRotatef(-20F, 0f, 0f, 1f);
                    }, 200, 0),
                    
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
                        
            .withFirstPersonCustomPositioningUnloading(Magazines.MP443Mag,
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
                    
            .withFirstPersonCustomPositioningReloading(Attachments.MP443Slide.getRenderablePart(),
// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glTranslatef(0f, 0f, 0.6f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Attachments.MP443Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.6F);
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
                    
                    
            .withThirdPersonCustomPositioningReloading(Attachments.P226Slide.getRenderablePart(),
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
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glRotatef(8F, 0f, 0f, 1f);
                        GL11.glRotatef(4F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.2f, 1.3f, -1.8f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glRotatef(15F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.1f, 1.2f, -1.8f);
                    }, 90, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(32F, 0f, 1f, 0f);
                        GL11.glRotatef(40F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.3f, 1f, -1.8f);
                    }, 180, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(33F, 0f, 1f, 0f);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                        GL11.glRotatef(-9F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.3f, 1.1f, -1.75f);
                    }, 130, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glRotatef(45F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(0.3f, 1f, -1.8f);
                    }, 120, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(Attachments.MP443Slide.getRenderablePart(),
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
                GL11.glTranslatef(0.435f, 0.625f, -2f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.22f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.32f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.435f, 0.625f, -1.7f);
                GL11.glRotatef(-4F, 1f, 0f, 0f);
                GL11.glRotatef(-2F, 0f, 0f, 1f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.22f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.32f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
            	 GL11.glScaled(0.7F, 0.7F, 0.7F);
                 GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.975000f, 0.275000f, -0.650000f);
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
                       GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.125000f, -0.775000f, 0.025000f);
                   }, 
                   (renderContext) -> {
                	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                	   GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                	   GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                	   GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                	   GL11.glTranslatef(0.390000f, -0.510000f, 0.175000f);
                   })
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.775000f, 0.025000f);
                    }, 
                    (renderContext) -> {
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                 	   GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                 	   GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                 	   GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                 	   GL11.glTranslatef(0.390000f, -0.510000f, 0.175000f);
                    })
            .withFirstPersonHandPositioningRunning(
            		(renderContext) -> {
                        GL11.glScalef(4.5f, 4.5f, 4.5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.775000f, 0.025000f);
                    }, 
                    (renderContext) -> {
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                 	   GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                 	   GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                 	   GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                 	   GL11.glTranslatef(0.390000f, -0.510000f, 0.175000f);
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
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.900000f, 0.225000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.900000f, 0.225000f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.025000f, -0.800000f, 0.200000f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 270, 50),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.875000f, -0.025000f);
                    }, 70, 0)
                )
                    
            .withFirstPersonRightHandPositioningReloading(
                    
            		// left hand goes down
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 300, 0),
                    
                    // mag touches gun
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // mag slides in
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 200, 0),
                    
                    // gun rotates (ready to push release button)
                
                    new Transition((renderContext) -> { // Reload position
                    	 GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	 GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                    	 GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	 GL11.glTranslatef(0.400000f, -0.500000f, 0.175000f);
                    }, 270, 0),
                    
                    // slide releases
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.410000f, -0.490000f, 0.170000f);
                    }, 90, 0),
                    
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
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.850000f, 0.125000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -1.000000f, 0.250000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -1.000000f, 0.250000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningUnloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.525000f, 0.165000f);
                    }, 250, 0))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                      GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                      GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.100000f, -0.800000f, 0.075000f);
                  }, 
                  (renderContext) -> {
                	  GL11.glScalef(4.5f, 4.5f, 4.5f);
                      GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
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
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 250, 100),
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                 	   GL11.glScalef(4.5f, 4.5f, 4.5f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.385000f, -0.500000f, 0.170000f);
                    }, 280, 0)
                    )
                          
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
