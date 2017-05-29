package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;

import net.minecraft.item.ItemStack;

public class RecipeManager {

    public static void init(ModContext modContext) {

        compatibility.addSmelting(CommonProxy.TitaniumOre, new ItemStack(CommonProxy.TitaniumIngot), 5f);
        compatibility.addSmelting(CommonProxy.CopperOre, new ItemStack(CommonProxy.CopperIngot), 5f);
        compatibility.addSmelting(CommonProxy.LeadOre, new ItemStack(CommonProxy.LeadIngot), 5f);
        compatibility.addSmelting(CommonProxy.TinOre, new ItemStack(CommonProxy.TinIngot), 5f);
        compatibility.addSmelting(CommonProxy.BauxiteOre, new ItemStack(CommonProxy.AluminumIngot), 5f);
        compatibility.addSmelting(CommonProxy.SiliconOre, new ItemStack(CommonProxy.Silicon), 5f);
        compatibility.addSmelting(CommonProxy.TantalumOre, new ItemStack(CommonProxy.TantalumIngot), 5f);
        compatibility.addSmelting(CommonProxy.SulfurDust, compatibility.createItemStack(CompatibleItems.GUNPOWDER, 1, 0), 5f);
        compatibility.addSmelting(CommonProxy.SteelDust, new ItemStack(CommonProxy.SteelIngot), 5f);

        modContext.getRecipeManager().registerShapedRecipe(CommonProxy.Marinehelmet,
                "AAA",
                "AGA",
                "X X",
                'A', CommonProxy.TanCloth,
                'X', "ingotTitanium");

        modContext.getRecipeManager().registerShapedRecipe(CommonProxy.Marinechest,
                "A A",
                "AAA",
                "XXX",
                'A', CommonProxy.TanCloth,
                'X', "ingotTitanium");

        modContext.getRecipeManager().registerShapedRecipe(CommonProxy.Marineboots,
                "A A",
                "A A",
                "X X",
                'A', CommonProxy.TanCloth,
                'X', "ingotTitanium");

        modContext.getRecipeManager().registerShapedRecipe(CommonProxy.Spetznazhelmet,
                "AAA",
                "AGA",
                "X X",
                'A', CommonProxy.GreenCloth,
                'X', "ingotTitanium");

        modContext.getRecipeManager().registerShapedRecipe(CommonProxy.Spetznazchest,
                "A A",
                "AAA",
                "XXX",
                'A', CommonProxy.GreenCloth,
                'X', "ingotTitanium");

        modContext.getRecipeManager().registerShapedRecipe(CommonProxy.Spetznazboots,
                "A A",
                "A A",
                "X X",
                'A', CommonProxy.GreenCloth,
                'X', "ingotTitanium");

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Cloth, 3),
                "XAX",
                "AXA",
                "XAX",
                'X', CompatibleItems.STRING,
                'A', CompatibleBlocks.WOOL
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.TanCloth, 3),
                "XAX",
                "AXA",
                "XAX",
                'X', CompatibleBlocks.SANDSTONE,
                'A', CommonProxy.Cloth
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.GreenCloth, 3),
                "XAX",
                "AXA",
                "XAX",
                'X', CompatibleBlocks.LEAVES,
                'A', CommonProxy.Cloth
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Electronics),
                "TAI",
                "ACA",
                "RAD",
                'I', CommonProxy.Inductor,
                'T', CommonProxy.Transistor,
                'R', CommonProxy.Resistor,
                'D', CommonProxy.Diode,
                'C', CommonProxy.Capacitor,
                'A', CommonProxy.CopperWiring
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.CGrip),
                "AAA",
                "XBX",
                "  A",
                'A', CommonProxy.SteelPlate,
                'X', CommonProxy.SteelIngot,
                'B', CompatibleBlocks.STONE_BUTTON
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.OpticGlass),
                "XAX",
                "AEA",
                "XAX",
                'X', "ingotTitanium",
                'E', CommonProxy.CopperWiring,
                'A', CompatibleBlocks.GLASS_PANE
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.MiniSteelPlate, 2),
                "XX",
                'X', CommonProxy.SteelIngot
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.SteelPlate, 2),
                "XXX",
                "XXX",
                'X', CommonProxy.SteelIngot
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.BigSteelPlate),
                "XAX",
                'X', CommonProxy.SteelPlate,
                'A', CommonProxy.MiniSteelPlate
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.MetalComponents),
                "XA",
                "AX",
                'X', CommonProxy.SteelPlate,
                'A', CommonProxy.SteelIngot
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.M9SD),
                "AX",
                'X', CommonProxy.M9,
                'A', Attachments.Silencer9mm
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.LaserPointer),
                "XXX",
                "AAR",
                "XXX",
                'X', CommonProxy.MiniSteelPlate,
                'A', CommonProxy.Ruby,
                'R', CommonProxy.Capacitor
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Resistor, 3),
                "A",
                "X",
                "A",
                'A', CommonProxy.SteelIngot,
                'X', CompatibleItems.COAL
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Transistor, 3),
                "AA",
                "XX",
                "XX",
                'A', CommonProxy.SteelIngot,
                'X', CommonProxy.Silicon

                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Capacitor, 3),
                "XX",
                "AA",
                "RR",
                'X', CommonProxy.AluminumIngot,
                'A', CommonProxy.Plastic,
                'R', CommonProxy.TantalumIngot
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Inductor, 3),
                " A ",
                "AXA",
                " A ",
                'X', CommonProxy.Plastic,
                'A', CommonProxy.CopperWiring
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Diode, 3),
                "X",
                "A",
                "X",
                'A', CommonProxy.SteelIngot,
                'X', CommonProxy.Silicon
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.CopperWiring, 10),
                "AAA",
                'A', CommonProxy.CopperIngot
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Plastic, 3),
                "AX",
                'A', CompatibleItems.COAL,
                'X', CompatibleItems.WATER_BUCKET
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Piston),
                "XA ",
                "AXX",
                " XE",
                'A', CommonProxy.SteelPlate,
                'X', "ingotSteel",
                'E', CommonProxy.Electronics
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.SteelDust, 4),
                " X ",
                "XAX",
                " X ",
                'A', CompatibleItems.IRON_INGOT,
                'X', CompatibleItems.COAL
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.AluminumPlate, 6),
                "XX",
                'X', CommonProxy.AluminumIngot
                );
    }
}
