package com.vicmatskiv.mw.items.melee;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import com.vicmatskiv.weaponlib.melee.RenderableState;

public class KarambitFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()
                .withModId(ModernWarfareMod.MODID)
                .withName("Karambit")
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withTextureNames("TacKnifeStandard")
                .withAttackDamage(6f)
                .withHeavyAttackDamage(13f)
                .withPrepareStubTimeout(() -> 100)
                .withPrepareHeavyStubTimeout(() -> 530)
                .withAttackCooldownTimeout(() -> 300)
                .withHeavyAttackCooldownTimeout(() -> 1000)
                .withAttackSound("swoosh")
                .withHeavyAttackSound("swoosh")
                .withCompatibleSkin(CommonProxy.CrimsonBlood, "TacKnifeCrimsonBlood")
                .withCompatibleSkin(CommonProxy.Chrome, "TacKnifeChrome")
                .withCompatibleSkin(CommonProxy.GodWillsIt, "TacKnifeGodWillsIt")
                .withCompatibleSkin(CommonProxy.Murasaki, "TacKnifeMurasaki")
                .withCompatibleSkin(CommonProxy.Evangelion, "TacKnifeEvangelion")
                .withRenderer(
                        new MeleeRenderer.Builder()
                                .withModId(ModernWarfareMod.MODID)
                                .withModel(new com.vicmatskiv.mw.models.Karambit())
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
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.075000f, -0.775000f, -1.125000f);
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

                                .withFirstPersonPositioningAttacking(       
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.025000f, -0.050000f, -1.949999f);
                                        }, 100, 50 ))
//                                        1000 * 60 * 3600

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.100000f, -0.950000f, 0.425000f);
                                            }, 70, 0))

                                .withFirstPersonRightHandPositioningAttacking(          
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.350000f, 0.050000f, 0.025000f);
                                            }, 70, 0))

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.475000f, -0.575000f, -1.349999f);
                                        }, 260, 120),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.475000f, -1.2f, -1.349999f);

                                        }, 80, 80))

                                .withFirstPersonLeftHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.100000f, -0.950000f, 0.425000f);
                                            }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(90.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-140.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-90.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.050000f, -0.900000f, -0.200000f);

                                            }, 70, 0))

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.250000f, -0.150000f, -0.025000f);

                                            }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.175000f, -0.050000f, 0.050000f);


                                            }, 70, 0))

                                .withFirstPersonPositioningModifying(renderContext -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(170.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.000000f, 1.074999f, -1.174999f);
                                })

                                .withFirstPersonHandPositioningModifying(

                                        context -> { // left hand
                                            GL11.glScalef(3f, 3f, 3f);
                                            GL11.glRotatef(-120F, 1f, 0f, 0f);
                                            GL11.glRotatef(10f, 0f, 1f, 0f);
                                            GL11.glRotatef(30F, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0f, -1f, 1f);
                                                },

                                                context -> { // right hand
                                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                                    GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                                                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                                                    GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                                                    GL11.glTranslatef(0.325000f, -0.200000f, -0.200000f);
                                                })

                                .build())

                .build(ModernWarfareMod.MOD_CONTEXT);
    }

}
