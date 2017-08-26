package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;

import net.minecraft.item.ItemStack;

public class RecipeManager {

    public static void init(ModContext modContext) {

        compatibility.addSmelting(Ores.TitaniumOre, new ItemStack(Ores.TitaniumIngot), 5f);
        compatibility.addSmelting(Ores.CopperOre, new ItemStack(Ores.CopperIngot), 5f);
        compatibility.addSmelting(Ores.LeadOre, new ItemStack(Ores.LeadIngot), 5f);
        compatibility.addSmelting(Ores.TinOre, new ItemStack(Ores.TinIngot), 5f);
        compatibility.addSmelting(Ores.BauxiteOre, new ItemStack(Ores.AluminumIngot), 5f);
        compatibility.addSmelting(Ores.SiliconOre, new ItemStack(Ores.Silicon), 5f);
        compatibility.addSmelting(Ores.TantalumOre, new ItemStack(Ores.TantalumIngot), 5f);
        compatibility.addSmelting(Ores.SulfurDust, compatibility.createItemStack(CompatibleItems.GUNPOWDER, 1, 0), 5f);
        compatibility.addSmelting(Ores.SteelDust, new ItemStack(Ores.SteelIngot), 5f);

        modContext.getRecipeManager().registerShapedRecipe(Armors.Marinehelmet,
                "AAA",
                "AGA",
                "X X",
                'A', CommonProxy.TanCloth,
                'X', Ores.INGOT_TITANIUM);

        modContext.getRecipeManager().registerShapedRecipe(Armors.Marinechest,
                "A A",
                "AAA",
                "XXX",
                'A', CommonProxy.TanCloth,
                'X', Ores.INGOT_TITANIUM);

        modContext.getRecipeManager().registerShapedRecipe(Armors.Marineboots,
                "A A",
                "A A",
                "X X",
                'A', CommonProxy.TanCloth,
                'X', Ores.INGOT_TITANIUM);

        modContext.getRecipeManager().registerShapedRecipe(Armors.Spetznazhelmet,
                "AAA",
                "AGA",
                "X X",
                'A', CommonProxy.GreenCloth,
                'X', Ores.INGOT_TITANIUM);

        modContext.getRecipeManager().registerShapedRecipe(Armors.Spetznazchest,
                "A A",
                "AAA",
                "XXX",
                'A', CommonProxy.GreenCloth,
                'X', Ores.INGOT_TITANIUM);

        modContext.getRecipeManager().registerShapedRecipe(Armors.Spetznazboots,
                "A A",
                "A A",
                "X X",
                'A', CommonProxy.GreenCloth,
                'X', Ores.INGOT_TITANIUM);

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

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.ElectronicCircuitBoard),
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
                'X', Ores.INGOT_STEEL,
                'B', CompatibleBlocks.STONE_BUTTON
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.OpticGlass),
                "XAX",
                "AEA",
                "XAX",
                'X', Ores.INGOT_TITANIUM,
                'E', CommonProxy.CopperWiring,
                'A', CompatibleBlocks.GLASS_PANE
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.MiniSteelPlate, 2),
                "XX",
                'X', Ores.INGOT_STEEL
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.SteelPlate, 1),
                "XXX",
                "XXX",
                'X', Ores.INGOT_STEEL
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
                'A', Ores.INGOT_STEEL
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.LaserPointer),
                "XXX",
                "AAR",
                "XXX",
                'X', CommonProxy.MiniSteelPlate,
                'A', Ores.Ruby,
                'R', CommonProxy.Capacitor
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Resistor, 3),
                "A",
                "X",
                "A",
                'A', Ores.INGOT_STEEL,
                'X', CompatibleItems.COAL
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Transistor, 3),
                "AA",
                "XX",
                "XX",
                'A', Ores.INGOT_STEEL,
                'X', Ores.Silicon

                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.Capacitor, 3),
                "XX",
                "AA",
                "RR",
                'X', Ores.INGOT_ALUMINIUM,
                'A', CommonProxy.Plastic,
                'R', Ores.INGOT_TANTALUM
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
                'A', Ores.INGOT_STEEL,
                'X', Ores.Silicon
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.CopperWiring, 10),
                "A  ",
                "A A",
                "AAA",
                'A', Ores.INGOT_COPPER
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
                'X', Ores.INGOT_STEEL,
                'E', CommonProxy.ElectronicCircuitBoard
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SteelDust, 1),
                " X ",
                "XAX",
                " X ",
                'A', CompatibleItems.IRON_INGOT,
                'X', CompatibleItems.COAL
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(CommonProxy.AluminumPlate, 6),
                "   ",
                "XXX",
                'X', Ores.INGOT_ALUMINIUM
                );
    }
}
