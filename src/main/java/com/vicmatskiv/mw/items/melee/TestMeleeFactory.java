package com.vicmatskiv.mw.items.melee;

import org.lwjgl.opengl.GL11;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.Part;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.animation.DebugPositioner;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.melee.ItemMelee;
import com.vicmatskiv.weaponlib.melee.MeleeRenderer;
import com.vicmatskiv.weaponlib.melee.RenderableState;

public class TestMeleeFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()
                .withModId(ModernWarfareMod.MODID)
                .withName("TacKnifeStandard")
                .withCreativeTab(ModernWarfareMod.gunsTab)
                .withTextureNames("AK12")
//                .withCompatibleSkin(CommonProxy.TestMeleeSkin, "Electric")
                .withRenderer(
                        new MeleeRenderer.Builder()
                                .withModId(ModernWarfareMod.MODID)
                                .withModel(new com.vicmatskiv.mw.models.TacKnifeStandard())
                                .withAnimationDuration(500)
                                
                                
//                                .withPartDebugPositioning((part, context) -> {
//                                    if(part == Part.LEFT_HAND && context.getToState() == RenderableState.ATTACKING) {
////                                        GL11.glScalef(3f, 3f, 3f);
//                                        if(DebugPositioner.isDebugModeEnabled()) {
//                                            DebugPositioner.position();
//                                        }
//                                    }
//                                })
                                
                                .withFirstPersonPositioning(context -> {
                                    //  GL11.glScalef(0.3f, 0.3f, 0.3f);
                                        GL11.glRotatef(20F, 1f, 0f, 0f);
                                        GL11.glRotatef(50F, 0f, 1f, 0f);
                                        GL11.glRotatef(0F, 0f, 0f, 1f);
                                        GL11.glTranslatef(-1f, -0.5f, -1f);
                                    })

                                .withFirstPersonHandPositioning(

                                        context -> { // left hand
                                            GL11.glScalef(3f, 3f, 3f);
                                            GL11.glRotatef(-120F, 1f, 0f, 0f);
                                            GL11.glRotatef(10f, 0f, 1f, 0f);
                                            GL11.glRotatef(30F, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.4f, -1f, 0.1f);
                                        },

                                        context -> { // right hand
                                            GL11.glScalef(3f, 3f, 3f);
                                            GL11.glRotatef(-90F, 1f, 0f, 0f);
                                            GL11.glRotatef(0f, 0f, 1f, 0f);
                                            GL11.glRotatef(-30F, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.55f, -0.6f, 0.2f);
                                        })

                                .withFirstPersonPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        //  GL11.glScalef(0.3f, 0.3f, 0.3f);
                                            GL11.glTranslatef(-0.7f, -0.3f, -1f);
                                            GL11.glRotatef(20F, 1f, 0f, 0f);
                                            GL11.glRotatef(10F, 0f, 1f, 0f);
                                            GL11.glRotatef(-110F, 0f, 0f, 1f);
                                            //GL11.glTranslatef(-0.5f, -3f, -2.5f);
                                        }, 150, 10),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        //  GL11.glScalef(0.3f, 0.3f, 0.3f);
                                            GL11.glTranslatef(-0.7f, -0.3f, -1f);
                                            GL11.glRotatef(20F, 1f, 0f, 0f);
                                            GL11.glRotatef(-30F, 0f, 1f, 0f);
                                            GL11.glRotatef(-80F, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.7f, 0.4f, -1f);
                                        }, 70, 150 ))
//                                        1000 * 60 * 3600

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
//                                            GL11.glScalef(3f, 3f, 3f);                                        
//                                            GL11.glRotatef(145F, 1f, 0f, 0f);
//                                            GL11.glRotatef(-60f, 0f, 1f, 0f);
//                                            GL11.glRotatef(-55F, 0f, 0f, 1f);
//                                            GL11.glTranslatef(0.2f, -1.25f, 0f);
                                            
                                            GL11.glScalef(3f, 3f, 3f);
                                            GL11.glRotatef(55F, 1f, 0f, 0f);
                                            GL11.glRotatef(-135f, 0f, 1f, 0f);
                                            GL11.glRotatef(-160F, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.05f, -0.1f, 0.8f);
                                            
                                            }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3f, 3f, 3f);
                                            GL11.glRotatef(55F, 1f, 0f, 0f);
                                            GL11.glRotatef(-135f, 0f, 1f, 0f);
                                            GL11.glRotatef(-160F, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.05f, -0.1f, 0.8f);
                                            }, 70, 0))

                                .withFirstPersonRightHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3f, 3f, 3f);
                                            GL11.glRotatef(-390F, 1f, 0f, 0f);
                                            GL11.glRotatef(-125f, 0f, 1f, 0f);
                                            GL11.glRotatef(65F, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.45f, -0.5f, 0.05f);
                                            }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(3f, 3f, 3f);
                                            GL11.glRotatef(175F, 1f, 0f, 0f);
                                            GL11.glRotatef(-45f, 0f, 1f, 0f);
                                            GL11.glRotatef(-75F, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.5f, -0.55f, 0.05f);
                                            }, 70, 0))

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glRotatef(5F, 1f, 0f, 0f);
                                            GL11.glRotatef(-60F, 1f, 0f, 0f);
                                            GL11.glRotatef(30F, 0f, 1f, 0f);
                                            GL11.glTranslatef(0f, 0f, -5f);

                                        }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glRotatef(5F, 1f, 0f, 0f);
                                            GL11.glRotatef(-30F, 1f, 0f, 0f);
                                            GL11.glRotatef(50F, 0f, 1f, 0f);
                                            GL11.glTranslatef(0f, 0f, -5f);

                                        }, 70, 0), new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glRotatef(50F, 1f, 0f, 0f);
                                            GL11.glRotatef(-30F, 1f, 0f, 0f);
                                            GL11.glRotatef(50F, 0f, 1f, 0f);
                                            GL11.glTranslatef(0f, 0f, -5f);
                                        }, 70, 0))

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glRotatef(5F, 1f, 0f, 0f);
                                            GL11.glRotatef(-60F, 1f, 0f, 0f);
                                            GL11.glRotatef(30F, 0f, 1f, 0f);
                                            GL11.glTranslatef(0f, 0f, -5f);
                                        }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glRotatef(5F, 1f, 0f, 0f);
                                            GL11.glRotatef(-30F, 1f, 0f, 0f);
                                            GL11.glRotatef(50F, 0f, 1f, 0f);
                                            GL11.glTranslatef(0f, 0f, -5f);
                                        }, 70, 0), new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glRotatef(50F, 1f, 0f, 0f);
                                            GL11.glRotatef(-30F, 1f, 0f, 0f);
                                            GL11.glRotatef(50F, 0f, 1f, 0f);
                                            GL11.glTranslatef(0f, 0f, -5f);
                                        }, 70, 0))

                                .withFirstPersonLeftHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            // GL11.glRotatef(5F, 1f, 0f, 0f);
                                            // GL11.glRotatef(-60F, 1f, 0f, 0f);
                                            // GL11.glRotatef(30F, 0f, 1f, 0f);
                                            // GL11.glTranslatef(0f, 0f, -5f);
                                            }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            // GL11.glRotatef(5F, 1f, 0f, 0f);
                                            // GL11.glRotatef(-30F, 1f, 0f, 0f);
                                            // GL11.glRotatef(50F, 0f, 1f, 0f);
                                            // GL11.glTranslatef(0f, 0f, -5f);

                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            // GL11.glRotatef(50F, 1f, 0f, 0f);
                                            // GL11.glRotatef(-30F, 1f, 0f, 0f);
                                            // GL11.glRotatef(50F, 0f, 1f, 0f);
                                            // GL11.glTranslatef(0f, 0f, -5f);
                                            }, 70, 0))

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            // GL11.glRotatef(5F, 1f, 0f, 0f);
                                            // GL11.glRotatef(-60F, 1f, 0f, 0f);
                                            // GL11.glRotatef(30F, 0f, 1f, 0f);
                                            // GL11.glTranslatef(0f, 0f, -5f);

                                            }, 70, 0),

                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            // GL11.glRotatef(5F, 1f, 0f, 0f);
                                            // GL11.glRotatef(-30F, 1f, 0f, 0f);
                                            // GL11.glRotatef(50F, 0f, 1f, 0f);
                                            // GL11.glTranslatef(0f, 0f, -5f);

                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            // GL11.glRotatef(50F, 1f, 0f, 0f);
                                            // GL11.glRotatef(-30F, 1f, 0f, 0f);
                                            // GL11.glRotatef(50F, 0f, 1f, 0f);
                                            // GL11.glTranslatef(0f, 0f, -5f);
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
                                                     GL11.glScalef(3f, 3f, 3f);
                                                     GL11.glRotatef(0F, 1f, 0f, 0f);
                                                     GL11.glRotatef(-30f, 0f, 1f, 0f);
                                                     GL11.glRotatef(-90F, 1f, 0f, 0f);
                                                     GL11.glTranslatef(0.55f, -0.6f, 0.2f);
                                                })

                                .build())

                .build(ModernWarfareMod.MOD_CONTEXT);
    }

}
