package com.vicmatskiv.mw.items.grenade;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.grenade.GrenadeRenderer;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;
import com.vicmatskiv.weaponlib.grenade.RenderableState;
import com.vicmatskiv.weaponlib.model.CameraModel;

import net.minecraft.item.Item;

public class FuseGrenadeFactory implements GrenadeFactory {

    @Override
    public Item createGrenade(CommonProxy commonProxy) {
        return new ItemGrenade.Builder()
                .withModId(ModernWarfareMod.MODID)
                .withName("fuse-grenade")
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withTextureNames("ak12")
                .withExplosionStrength(1.2f)
                .withExplosionTimeout(5000)
                .withCompatibleAttachment(CommonProxy.GrenadeSafetyPin, (p, s) -> {})
                .withRenderer(
                        new GrenadeRenderer.Builder()
                        .withModId(ModernWarfareMod.MODID)
                        .withModel(new CameraModel())
                        .withAnimationDuration(500)
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.7F, 0.7F, 0.7F);
                            GL11.glTranslatef(1, 1.3f, -1.3f);
                            GL11.glRotatef(230F, 0f, 1f, 0f);
                            GL11.glRotatef(45F, 1f, 0f, 0f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.9F, 0.9F, 0.9F);
                            GL11.glTranslatef(-1F, -0.4F, 1.1F);
                            GL11.glRotatef(-225F, 0f, 1f, 0f);
                            GL11.glRotatef(-260F, 1f, 0f, 0f);
                        })
                        .withFirstPersonPositioning(context -> {
                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glRotatef(85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.475000f, -0.750000f, -0.075000f);
                        })

                        .withFirstPersonCustomPositioning(CommonProxy.GrenadeSafetyPin.getRenderablePart(), null,
                                context -> {
                                    //context.attachTo(Part.MAIN_ITEM);
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.800000f, 1.025000f, -0.050000f);
                                })

                        .withFirstPersonHandPositioning(
                                context -> { // left hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -0.525000f, 0.425000f);
                                },

                                context -> { // right hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.200000f, -0.300000f, 0.100000f);
                                })

                        .withFirstPersonPositioningTakingSafetyPinOff(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(75.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.325000f, -0.725000f, 0.025000f);
                                }, 550, 50 ),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(75.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.325000f, -0.725000f, 0.025000f);
                                }, 150, 50 ),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(75.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.325000f, -0.725000f, 0.025000f);
                                }, 5, 0 )

                                )

                        .withFirstPersonLeftHandPositioningTakingSafetyPinOff(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.000000f, -0.725000f, 0.250000f);

                                }, 70, 0),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -1.025000f, 0.225000f);
                                }, 70, 0),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -1.025000f, 0.225000f);
                                }, 70, 0)
                                )

                        .withFirstPersonRightHandPositioningTakingSafetyPinOff(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.325000f, -0.375000f, -0.125000f);
                                }, 70, 0),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.325000f, -0.375000f, -0.125000f);
                                }, 70, 0),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.325000f, -0.375000f, -0.125000f);
                                }, 70, 0)
                                )

                        .withFirstPersonCustomPositioningTakingSafetyPinOff(CommonProxy.GrenadeSafetyPin.getRenderablePart(),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, 2.949999f, -0.900000f);
                                }, 70, 0, Part.LEFT_HAND),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, 2.949999f, -0.900000f);
                                }, 70, 0, Part.LEFT_HAND),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, 2.949999f, -0.900000f);
                                }, 70, 0, Part.LEFT_HAND)
                                )

                        .withFirstPersonPositioningThrowing(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.500000f, -0.475000f, 0.550000f);
                                }, 260, 120),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(85.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.475000f, -0.750000f, -0.075000f);

                                    // Hide item on throwing
                                    GL11.glScalef(0.000000f, 0.000000f, 0.000000f);
                                }, 80, 80),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(155.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.475000f, -0.750000f, 0.075000f);
                                }, 80, 80))

                        .withFirstPersonLeftHandPositioningThrowing(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -1.025000f, 0.225000f);
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -1.025000f, 0.225000f);

                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.225000f, -0.975000f, 0.550000f);
                                }, 70, 0)

                                )

                        .withFirstPersonRightHandPositioningThrowing(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-185.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.100000f, -0.150000f, 0.175000f);
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.250000f, -0.450000f, -0.300000f);

                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    //                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    //                                    GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                                    //                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    //                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    //                                    GL11.glTranslatef(0.275000f, -0.400000f, 0.200000f);
                                }, 70, 0))

                        .withFirstPersonCustomPositioningThrowing(CommonProxy.GrenadeSafetyPin.getRenderablePart(),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, 2.949999f, -0.900000f);
                                }, 70, 0, Part.LEFT_HAND),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, 2.949999f, -0.900000f);
                                }, 70, 0, Part.LEFT_HAND),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, 2.949999f, -0.900000f);
                                }, 70, 0, Part.LEFT_HAND))

                        .withFirstPersonPositioningSafetyPinOff(renderContext -> {
                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glRotatef(75.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.325000f, -0.725000f, 0.025000f);
                        })

                        .withFirstPersonCustomPositioningSafetyPinOff(CommonProxy.GrenadeSafetyPin.getRenderablePart(),
                                Part.LEFT_HAND,
                                renderContext -> {
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, 2.949999f, -0.900000f);
                                })

                        .withFirstPersonCustomPositioningThrown(CommonProxy.GrenadeSafetyPin.getRenderablePart(),
                                Part.MAIN_ITEM,
                                renderContext -> {
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.800000f, 1.025000f, -0.050000f);
                                })

                        .withFirstPersonHandPositioningSafetyPinOff(

                                context -> { // left hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -1.025000f, 0.225000f);

                                },

                                context -> { // right hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.325000f, -0.375000f, -0.125000f);
                                })


                        .withFirstPersonHandPositioningThrown(
                                context -> { // left hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.100000f, -0.725000f, 0.700000f);
                                },

                                context -> { // right hand
                                    //                                  GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    //                                  GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    //                                  GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    //                                  GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    //                                  GL11.glTranslatef(0.200000f, -0.300000f, 0.100000f);
                                })

                        .build())

                .build(ModernWarfareMod.MOD_CONTEXT);
    }

}
