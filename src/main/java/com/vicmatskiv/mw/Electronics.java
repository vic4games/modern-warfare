package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;
import com.vicmatskiv.weaponlib.electronics.ItemTablet;
import com.vicmatskiv.weaponlib.electronics.ItemWirelessCamera;
import com.vicmatskiv.weaponlib.model.CameraModel;
import com.vicmatskiv.weaponlib.model.TabletModel;

public class Electronics {

    public static ItemAttachment<Object> Tablet;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
        Tablet = new ItemTablet.Builder<>().withOpticalZoom().withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    float scale = 5.9f;
                    GL11.glScalef(scale, scale / compatibility.getAspectRatio(ModernWarfareMod.MOD_CONTEXT), scale);
                    GL11.glTranslatef(-0.12f, 0.56f, 0.01f);
                })
                .withCreativeTab(ModernWarfareMod.GadgetsTab)
                .withCrosshair("HP")
                .withModel(new TabletModel(), "IPad.png")
                //.withModel(new com.vicmatskiv.mw.models.LPscope(), "HP2.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    //                    GL11.glTranslatef(0.5F, -1.5F, -0.7F);

                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    //                    GL11.glRotatef(125F, 0f, 1f, 0f);
                    //                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                    GL11.glTranslatef(0.68F, -1.35F, 0.7F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof TabletModel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withFirstPersonHandPositioning(
                        c -> {
                            GL11.glRotatef(190F, 1f, 0f, 0f);
                            GL11.glRotatef(10F, 0f, 1f, 0f);
                            GL11.glRotatef(30F, 0f, 0f, 1f);
                            GL11.glTranslatef(0.05F, -1.7F, 0.05F);
                            GL11.glScaled(1.1F, 1.1F, 1.1F);
                        },
                        c -> {
                            GL11.glRotatef(190F, 1f, 0f, 0f);
                            GL11.glRotatef(0F, 0f, 1f, 0f);
                            GL11.glRotatef(-10F, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.1F, -0.45F, 0.4F);
                            GL11.glScaled(1.1F, 1.1F, 1.1F);
                        })
                        .withName("tablet")
                        .withModId(ModernWarfareMod.MODID)
                        .withTextureName("Dummy.png")
                        .withCraftingRecipe(
                                "XXX",
                                "XGX",
                                "XEX",
                                'X', Ores.INGOT_STEEL,
                                'E', CommonProxy.ElectronicCircuitBoard,
                                'G', CompatibleBlocks.GLASS_PANE
                                )
                                .build(ModernWarfareMod.MOD_CONTEXT);

        new ItemWirelessCamera.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("wcam")
        .withCreativeTab(ModernWarfareMod.GadgetsTab)
        .withModel(new CameraModel(), "AK12")
        .withCrafting(CraftingComplexity.LOW,
                CommonProxy.SteelPlate,
                CommonProxy.ElectronicCircuitBoard)
        .withFirstPersonPositioning((player, itemStack) -> {
            // GL11.glTranslatef(0.5F, -1.5F, -0.7F);
            GL11.glRotatef(55F, 0f, 1f, 0f);
            // GL11.glRotatef(2F, 1f, 0f, 0f);
            GL11.glTranslatef(-0.1F, -1.6F, 1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof CameraModel) {
                GL11.glTranslatef(-0.9F, -0.8F, 0.5F);
                GL11.glRotatef(-50F, 0f, 1f, 0f);
                GL11.glRotatef(80F, 1f, 0f, 0f);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof com.vicmatskiv.mw.models.HP) {
                GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                GL11.glRotatef(10F, 1f, 0f, 0f);
                GL11.glRotatef(-190F, 0f, 1f, 0f);
                GL11.glRotatef(0F, 0f, 0f, 1f);
                GL11.glScaled(0.65F, 0.65F, 0.65f);
            } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                GL11.glScaled(0F, 0F, 0F);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof com.vicmatskiv.mw.models.HP) {
                GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                GL11.glScaled(0F, 0F, 0F);
            }
        })

        .withFirstPersonHandPositioning(
                c -> {
                    GL11.glScalef(0F, 0F, 0F);
                    // GL11.glRotatef(190F, 1f, 0f, 0f);
                    // GL11.glRotatef(10F, 0f, 1f, 0f);
                    // GL11.glRotatef(30F, 0f, 0f, 1f);
                    // GL11.glTranslatef(0.1F, -1.75F, 0F);
                },
                c -> {
                    GL11.glScalef(0F, 0F, 0F);
                    // GL11.glRotatef(190F, 1f, 0f, 0f);
                    // GL11.glRotatef(0F, 0f, 1f, 0f);
                    // GL11.glRotatef(-10F, 0f, 0f, 1f);
                    // GL11.glTranslatef(-0.15F, -0.4F, 0.4F);
                }
                )
                
                .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
