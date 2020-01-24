package com.vicmatskiv.mw.items.melee;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.MeleeSkins;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import com.vicmatskiv.weaponlib.melee.RenderableState;

import net.minecraft.item.Item;

public class TacticalTomahawkFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()
                .withModId(ModernWarfareMod.MODID)
                .withName("tactical_tomahawk")
                .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
                .withTextureNames("tacticaltomahawk")
                .withAttackDamage(3f)
                .withHeavyAttackDamage(20f)
                .withPrepareStubTimeout(() -> 00)
                .withPrepareHeavyStubTimeout(() -> 00)
                .withAttackCooldownTimeout(() -> 0)
                .withHeavyAttackCooldownTimeout(() -> 0)
                .withAttackSound("swoosh")
                .withHeavyAttackSound("swoosh")
                .withRenderer(
                        new MeleeRenderer.Builder()
                                .withModId(ModernWarfareMod.MODID)
                                .withModel(new com.vicmatskiv.mw.models.TacticalTomahawk())
                                .withAnimationDuration(400)
                                .withInventoryPositioning(itemStack -> {
                                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                                    GL11.glTranslatef(1, 2f, -1.8f);
                                    GL11.glRotatef(80F, 0f, 1f, 0f);
                                    GL11.glRotatef(-30F, 1f, 0f, 0f);
                                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                                })
                                .withThirdPersonPositioning((renderContext) -> {
                                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                                        GL11.glTranslatef(-1.7F, -1F, 1.8F);
                                        GL11.glRotatef(10F, 1f, 1f, 0f);
                                        GL11.glRotatef(-145F, 0f, 1f, 0f);
                                        GL11.glRotatef(-70F, 0f, 0f, 1f);
                                })
                                .withFirstPersonPositioning(context -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-2.499999f, 0.950000f, 0.325000f);
                                    })

                                .withFirstPersonHandPositioning(

                                        context -> { // left hand
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.350000f, -0.475000f, 0.400000f);
                                        },

                                        context -> { // right hand
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.025000f, -0.425000f, 0.550000f);
                                        })

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-2.499999f, 0.950000f, 0.325000f);
                                        }, 100, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-3f, 0.7f, 0f);
                                        }, 80, 0))

                                .withFirstPersonLeftHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.350000f, -0.475000f, 0.45f);
                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.225000f, -0.3f, 0.3f);
                                            }, 70, 0)
                                        )

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.025000f, -0.425000f, 0.250000f);
                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.050000f, -0.225000f, 0.250000f);
                                            }, 70, 0)
                                        )

                                .withFirstPersonPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1f, 1f, 1f);
                                            GL11.glRotatef(20F, 1f, 0f, 0f);
                                            GL11.glRotatef(10F, 0f, 1f, 0f);
                                            GL11.glRotatef(-110F, 0f, 0f, 1f);
                                            GL11.glTranslatef(1.699999f, 0.250000f, -1.624999f);
                                        }, 120, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1f, 1f, 1f);
                                            GL11.glRotatef(20F, 1f, 0f, 0f);
                                            GL11.glRotatef(30F, 0f, 1f, 0f);
                                            GL11.glRotatef(-110F, 0f, 0f, 1f);
                                            GL11.glTranslatef(1.699999f, 0.250000f, -2f);
                                        }, 50, 0))

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.175000f, -0.525000f, 0.175000f);
                                            }, 70, 0),
                                            new Transition<RenderContext<RenderableState>>(renderContext -> {
                                                GL11.glScalef(4.5f, 4.5f, 4.5f);
                                                GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                                                GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                                                GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                                                GL11.glTranslatef(0.175000f, -0.525000f, 0.175000f);
                                                }, 70, 0))

                                .withFirstPersonRightHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.250000f, -0.150000f, 0.325000f);
                                            }, 70, 0),
                                            new Transition<RenderContext<RenderableState>>(renderContext -> {
                                                GL11.glScalef(4.5f, 4.5f, 4.5f);
                                                GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                                                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                                                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                                                GL11.glTranslatef(0.1f, -0.1f, 0.2f);
                                                }, 70, 0))

                                .withFirstPersonPositioningModifying(renderContext -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-90.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.725000f, -1.299999f, 0.800000f);
                                })

                                .withFirstPersonHandPositioningModifying(

                                        context -> { // left hand
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.050000f, -0.425000f, 0.100000f);
                                                },

                                                context -> { // right hand
                                                    GL11.glScalef(4.5f, 4.5f, 4.5f);
                                                    GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                                                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                                                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                                                    GL11.glTranslatef(0.300000f, -0.400000f, 0.250000f);
                                                })

                                .build())

                .build(ModernWarfareMod.MOD_CONTEXT);
    }

}
