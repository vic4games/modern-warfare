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

public class TestMeleeFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()
                .withModId(ModernWarfareMod.MODID)
                .withName("TacKnifeStandard")
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withTextureNames("TacKnifeStandard")
                .withAttackDamage(8.5f)
                .withHeavyAttackDamage(17f)
                .withPrepareStubTimeout(() -> 100)
                .withPrepareHeavyStubTimeout(() -> 530)
                .withAttackCooldownTimeout(() -> 500)
                .withHeavyAttackCooldownTimeout(() -> 1500)
                .withAttackSound("swoosh")
                .withHeavyAttackSound("swoosh")
                .withCompatibleSkin(MeleeSkins.CrimsonBlood, "TacKnifeCrimsonBlood")
                .withCompatibleSkin(MeleeSkins.Chrome, "TacKnifeChrome")
                .withCompatibleSkin(MeleeSkins.GodWillsIt, "TacKnifeGodWillsIt")
                .withCompatibleSkin(MeleeSkins.Murasaki, "TacKnifeMurasaki")
                .withCompatibleSkin(MeleeSkins.Evangelion, "TacKnifeEvangelion")
                .withCraftingRecipe(
                                " X ",
                                " X ",
                                " F ",
                                'X', CommonProxy.SteelPlate,
                                'F', CompatibleItems.FLINT_AND_STEEL)
                .withRenderer(
                        new MeleeRenderer.Builder()
                                .withModId(ModernWarfareMod.MODID)
                                .withModel(new com.vicmatskiv.mw.models.TacKnifeStandard())
                                .withAnimationDuration(200)
                                .withInventoryPositioning(itemStack -> {
                                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                                    GL11.glTranslatef(1, 1.3f, -1.3f);
                                    GL11.glRotatef(230F, 0f, 1f, 0f);
                                    GL11.glRotatef(45F, 1f, 0f, 0f);
                                })
                                .withThirdPersonPositioning((renderContext) -> {
                                        GL11.glScaled(0.8F, 0.8F, 0.8F);
                                        GL11.glTranslatef(-1.2F, -0.45F, 1F);
                                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                                        GL11.glRotatef(70F, 1f, 0f, 0f);
                                })
                                .withFirstPersonPositioning(context -> {
                                    //  GL11.glScalef(0.3f, 0.3f, 0.3f);
                                        GL11.glRotatef(20F, 1f, 0f, 0f);
                                        GL11.glRotatef(50F, 0f, 1f, 0f);
                                        GL11.glRotatef(0F, 0f, 0f, 1f);
                                        GL11.glTranslatef(-1f, -0.5f, -1f);
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
                                            GL11.glScalef(3f, 3f, 3f);
                                            GL11.glRotatef(-70f, 1f, 0f, 0f);
                                            GL11.glRotatef(0f, 0f, 1f, 0f);
                                            GL11.glRotatef(20f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.225000f, -0.400000f, -0.050000f);
                                        })

                                .withFirstPersonPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        //  GL11.glScalef(0.3f, 0.3f, 0.3f);
                                            GL11.glTranslatef(-0.7f, -0.3f, -1f);
                                            GL11.glRotatef(20F, 1f, 0f, 0f);
                                            GL11.glRotatef(10F, 0f, 1f, 0f);
                                            GL11.glRotatef(-110F, 0f, 0f, 1f);
                                            //GL11.glTranslatef(-0.5f, -3f, -2.5f);
                                        }, 80, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        //  GL11.glScalef(0.3f, 0.3f, 0.3f);
                                            GL11.glTranslatef(-0.7f, -0.3f, -1f);
                                            GL11.glRotatef(20F, 1f, 0f, 0f);
                                            GL11.glRotatef(-30F, 0f, 1f, 0f);
                                            GL11.glRotatef(-80F, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.7f, 0.4f, -1f);
                                        }, 40, 50 ))
//                                        1000 * 60 * 3600

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
//                                            GL11.glScalef(3f, 3f, 3f);
//                                            GL11.glRotatef(145F, 1f, 0f, 0f);
//                                            GL11.glRotatef(-60f, 0f, 1f, 0f);
//                                            GL11.glRotatef(-55F, 0f, 0f, 1f);
//                                            GL11.glTranslatef(0.2f, -1.25f, 0f);

                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.100000f, -0.950000f, 0.425000f);

                                            }, 70, 0),

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
                                            GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.375000f, -0.200000f, 0.000000f);

                                            }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.350000f, 0.050000f, 0.025000f);
                                            }, 70, 0))

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
//                                            GL11.glScalef(1f, 1f, 1f);
                                            GL11.glTranslatef(-0.7f, -0.3f, -1f);
                                            GL11.glRotatef(20F, 1f, 0f, 0f);
                                            GL11.glRotatef(10F, 0f, 1f, 0f);
                                            GL11.glRotatef(-110F, 0f, 0f, 1f);
                                        }, 180, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.675000f, 0.075000f, -1.574999f);

                                        }, 200, 150),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-100.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.650000f, -2f, -1.649999f);
                                        }, 70, 70))

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

                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(85.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.050000f, -0.750000f, 0.150000f);
                                            }, 70, 0))

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.375000f, -0.200000f, 0.000000f);

                                            }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.525000f, -0.025000f, 0.075000f);


                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                            GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.3f, 0.000000f, 0.075000f);
                                            }, 70, 0))

                                .withFirstPersonPositioningModifying(renderContext -> {
                                //  GL11.glScalef(0.3f, 0.3f, 0.3f);
                                    GL11.glRotatef(-20F, 1f, 0f, 0f);
                                    GL11.glRotatef(0F, 0f, 1f, 0f);
                                    GL11.glRotatef(0F, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.5f, -0.5f, -1.5f);
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
                                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                                    GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                                                    GL11.glTranslatef(0.275000f, -0.125000f, -0.050000f);
                                                })

                                .build())

                .build(ModernWarfareMod.MOD_CONTEXT);
    }

}
