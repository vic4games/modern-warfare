package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.UFCG36Scope;
import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemScope;
import com.vicmatskiv.weaponlib.LaserBeamRenderer;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Attachments {

    public static ItemAttachment<Weapon> Reflex;
    public static ItemAttachment<Weapon> Holo2;
    public static ItemAttachment<Weapon> Holographic2;
    public static ItemAttachment<Weapon> Kobra;
    public static ItemAttachment<Weapon> ACOG;
    public static ItemAttachment<Weapon> G36Scope;
    public static ItemAttachment<Weapon> AUGScope;
    public static ItemAttachment<Weapon> Scope;
    public static ItemAttachment<Weapon> HP;
    public static ItemAttachment<Weapon> Leupold;
    public static ItemAttachment<Weapon> PSO1;
    public static ItemAttachment<Weapon> Silencer556x45;
    public static ItemAttachment<Weapon> Silencer762x39;
    public static ItemAttachment<Weapon> Silencer556x39;
    public static ItemAttachment<Weapon> Silencer50BMG;
    public static ItemAttachment<Weapon> Silencer9mm;
    public static ItemAttachment<Weapon> Silencer762x54;
    public static ItemAttachment<Weapon> Silencer762x51;
    public static ItemAttachment<Weapon> Silencer45ACP;
    public static ItemAttachment<Weapon> Silencer12Gauge;
    public static ItemAttachment<Weapon> Silencer65x39;
    public static ItemAttachment<Weapon> Silencer57x38;
    public static ItemAttachment<Weapon> Silencer300AACBlackout;
    public static ItemAttachment<Weapon> Silencer357;
    public static ItemAttachment<Weapon> SilencerMP7;
    public static ItemAttachment<Weapon> Laser;
    public static ItemAttachment<Weapon> Laser2;
    public static ItemAttachment<Weapon> Grip2;
    public static ItemAttachment<Weapon> Grip;
    public static ItemAttachment<Weapon> StubbyGrip;
    public static ItemAttachment<Weapon> VGrip;
    public static ItemAttachment<Weapon> Bipod;
    public static ItemAttachment<Weapon> AKMIron;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
        Reflex = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Reflex(), "Reflex.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Reflex) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Reflex) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Reflex) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Reflex) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe("A  ",
                        "ORX",
                        "AXX",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass,
                        'G', CompatibleBlocks.GLASS_PANE
                        )
                .withName("Reflex").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        ACOG = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.12f, 0.37f, 0.45f);
                })

                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.ACOG(), "Acog.png")
                .withModel(new com.vicmatskiv.mw.models.Acog2(), "Acog2.png")

                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.ACOG) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe("FXA",
                        "ORG",
                        "AXX",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass,
                        'G', CompatibleBlocks.GLASS_PANE,
                        'F', CommonProxy.CopperWiring
                        )
                .withName("Acog").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Holo2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Holographic(), "Holographic.png")
                .withModel(new com.vicmatskiv.mw.models.Holo2(), "Holo3.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe("  A",
                        "XRO",
                        "AXX",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass,
                        'G', CompatibleBlocks.GLASS_PANE
                        )
                .withName("Holographic").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Holographic2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Holographic2(), "Holographic2.png")
                .withModel(new com.vicmatskiv.mw.models.Holo2(), "Holo3.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic2) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Holographic2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe("  A",
                        "XRO",
                        "AXX",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass,
                        'G', CompatibleBlocks.GLASS_PANE
                        )
                .withName("Holographic2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Kobra = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.Kobra(), "Kobra.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kobra) {
                        GL11.glTranslatef(0.4F, -0.8F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kobra) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kobra) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Kobra) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe("X  ",
                        "OGX",
                        "ARX",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass,
                        'G', CompatibleBlocks.GLASS_PANE
                        )
                .withName("Kobra").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        G36Scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.5f, 1.5f, 1.5f);
                    GL11.glTranslatef(-0.095f, 0.6f, 0.85f);
                })
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new UFCG36Scope(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.Reflex2(), "Holo3.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.UFCG36Scope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.UFCG36Scope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.UFCG36Scope) {
                        GL11.glTranslatef(-0.6F, -0.7F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.UFCG36Scope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe("FXA",
                        "XAX",
                        "OOG",
                        "AXA",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass,
                        'G', CompatibleBlocks.GLASS_PANE,
                        'F', CommonProxy.CopperWiring
                        )
                .withName("G36Scope").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AUGScope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.65f, 1.65f, 1.6f);
                    GL11.glTranslatef(-0.07f, 0.559f, 1.82f);
                })
                .withModel(new com.vicmatskiv.mw.models.AUGScope(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.LPscope(), "HP2.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGScope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGScope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGScope) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AUGScope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("AUGScope").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Scope = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.06f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.1f, 1.1f, 1.1f);
                    GL11.glTranslatef(0.1f, 0.4f, 0.6f);
                }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("LP")
                .withModel(new com.vicmatskiv.mw.models.LP(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.LPscope(), "HP2.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LP) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LP) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LP) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.LP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe("A R",
                        "OGO",
                        "XXX",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass,
                        'G', CompatibleBlocks.GLASS_PANE
                        )
                .withName("LPScope")
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        Leupold = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.04f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(2.3f, 2.3f, 2.3f);
                    GL11.glTranslatef(-0.085f, 0.33f, 1.75f);
                }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("LP")
                .withModel(new com.vicmatskiv.mw.models.Leupold(), "Leupold.png")
                .withModel(new com.vicmatskiv.mw.models.LeupoldReticle(), "Reticle.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Leupold) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LeupoldReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Leupold) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LeupoldReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Leupold) {
                        GL11.glTranslatef(-0.6F, -0.45F, 0.94F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.35F, 0.35F, 0.35f);
                    } else if (model instanceof com.vicmatskiv.mw.models.LeupoldReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Leupold) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LeupoldReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe("ARR",
                        "OGO",
                        "XXX",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass,
                        'G', CompatibleBlocks.GLASS_PANE
                        )
                .withName("Leupold")
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        PSO1 = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.06f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.05f, 1.05f, 1.05f);
                    GL11.glTranslatef(-0.32f, 0.168f, 1.2f);
                }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("LP")
                .withModel(new com.vicmatskiv.mw.models.PSO1(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.PSO12(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.LPscope(), "HP2.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.PSO1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.PSO1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.PSO1) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.PSO1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.vicmatskiv.mw.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).
                withName("PSO1")
                .withCraftingRecipe("ARR",
                        "XXX",
                        "OGO",
                        "  X",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass,
                        'G', CompatibleBlocks.GLASS_PANE
                        )
                .withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        HP = new ItemScope.Builder().withOpticalZoom().withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.65f, 1.65f, 1.65f);
                    GL11.glTranslatef(0.0285f, 0.492f, 0.7f);
                }).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP")
                .withModel(new com.vicmatskiv.mw.models.HP(), "AK12.png")
                .withModel(new com.vicmatskiv.mw.models.LPscope(), "HP2.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.HP) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.vicmatskiv.mw.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
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
                .withCraftingRecipe("ARX",
                        "ORO",
                        "AXX",
                        'R', CommonProxy.ElectronicCircuitBoard,
                        'A', CommonProxy.MiniSteelPlate,
                        'X', Ores.INGOT_STEEL,
                        'O', CommonProxy.OpticGlass
                        )
                .withName("HPScope").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer556x45 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x45(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x45) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x45) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x45) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x45) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate)
                .withName("Silencer556x45").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer762x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor762x39(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate)
                .withName("Silencer762x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer9mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate).withName("Silencer9mm").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer45ACP = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor45ACP(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate).withName("Silencer45ACP").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x54 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate)
                .withName("Silencer762x54").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x51 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor762x51(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x51) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x51) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x51) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor762x51) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate)
                .withName("Silencer762x51").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer50BMG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate)
                .withName("Silencer50BMG").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer556x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x39(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate)
                .withName("Silencer556x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        AKMIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new AKMiron1(), "AK12.png")
                .withModel(new AKMiron2(), "AK12.png").withModel(new AK47iron(), "AK12.png")
                .withModel(new M4Iron1(), "AK12.png").withModel(new M4Iron2(), "AK12.png")
                .withModel(new P90iron(), "AK12.png").withModel(new G36CIron1(), "AK12.png")
                .withModel(new G36CIron2(), "AK12.png").withModel(new ScarIron1(), "AK12.png")
                .withModel(new ScarIron2(), "AK12.png").withModel(new FALIron(), "AK12.png")
                .withModel(new M14Iron(), "AK12.png").withModel(new MP5Iron(), "AK12.png")
                .withModel(new MP5Iron(), "AK12.png").withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Iron1) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Iron1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.M4Iron1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCraftingRecipe(
                        "AAA",
                        'A', Ores.INGOT_STEEL

                        )
                .withName("AKMIron").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SilencerMP7 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate).withName("SilencerMP7").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer357 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate).withName("Silencer357").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer57x38 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate).withName("Silencer57x38").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer12Gauge = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor45ACP(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate).withName("Silencer12Gauge").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer300AACBlackout = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor300AACBlackout(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate)
                .withName("Silencer300AACBlackout").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer65x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.Suppressor556x39(), "AK12.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCrafting(CraftingComplexity.MEDIUM,
                        Ores.INGOT_STEEL,
                        CommonProxy.SteelPlate)
                .withName("Silencer65x39").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Laser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.Laser(), "AK12.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                })).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AR15Iron) {

                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {
                        GL11.glTranslatef(0.6F, -0.3F, 0.65F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCraftingRecipe(" X ",
                        "ARE",
                        "AXX",
                        'X', Ores.INGOT_STEEL,
                        'A', CommonProxy.MiniSteelPlate,
                        'R', CommonProxy.LaserPointer,
                        'E', CommonProxy.ElectronicCircuitBoard
                        )
                .withName("Laser").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Laser2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.Laser2(), "AK12.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.3F, 1.8F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                })).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser2) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser2) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser2) {
                        GL11.glTranslatef(0.6F, -0.3F, 0.65F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Laser2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withCraftingRecipe("AXA",
                        "XRE",
                        "AXX",
                        'X', Ores.INGOT_STEEL,
                        'A', CommonProxy.MiniSteelPlate,
                        'R', CommonProxy.LaserPointer,
                        'E', CommonProxy.ElectronicCircuitBoard
                        )
                .withName("Laser2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Grip2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.Grip2(), "AK12.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Grip2) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Grip2) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Grip2) {
                        GL11.glTranslatef(0.6F, 0.3F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Grip2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withCraftingRecipe("AXX",
                        " X ",
                        " X ",
                        'X', Ores.INGOT_STEEL,
                        'A', CommonProxy.MiniSteelPlate
                        )
                .withName("Grip2").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.AngledGrip(), "AK12.png").withApply((a, weapon, player) -> {
                    weapon.changeRecoil(player, 1.5F);
                }).withRemove((attachment, weapon, player) -> {
                    weapon.changeRecoil(player, 1);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AngledGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AngledGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AngledGrip) {
                        GL11.glTranslatef(0.6F, 0.8F, -0.45F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.AngledGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withCraftingRecipe("X A",
                        " XX",
                        'X', Ores.INGOT_STEEL,
                        'A', CommonProxy.MiniSteelPlate
                        )
                .withName("AngledGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        StubbyGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.vicmatskiv.mw.models.StubbyGrip(), "AK12.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withRemove((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil());
                })
                // .withApply((a, weapon, player) ->
                // weapon.changeRecoil(player, 1.3F);
                // })
                // .withRemove((attachment, weapon, player) -> {
                // weapon.changeRecoil(player, 1);
                // })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StubbyGrip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StubbyGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StubbyGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.6F, 1.6F, 1.6f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.StubbyGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withCraftingRecipe("AXA",
                        " X ",
                        'X', Ores.INGOT_STEEL,
                        'A', CommonProxy.MiniSteelPlate
                        )
                .withName("StubbyGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        VGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.VGrip(), "AK12.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VGrip) {
                        GL11.glTranslatef(0.6F, 0.3F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.VGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withCraftingRecipe("XAX",
                        " X ",
                        " X ",
                        'X', Ores.INGOT_STEEL,
                        'A', CommonProxy.MiniSteelPlate
                        )
                .withName("VGrip").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Bipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.vicmatskiv.mw.models.Bipod(), "AK12.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Bipod) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Bipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Bipod) {
                        GL11.glTranslatef(0.6F, -0.05F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.vicmatskiv.mw.models.Bipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withCraftingRecipe(" X ",
                        "A A",
                        "X X",
                        'X', Ores.INGOT_STEEL,
                        'A', CommonProxy.MiniSteelPlate
                        )
                .withName("Bipod").withModId(ModernWarfareMod.MODID).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

    }
}
