package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;
import net.minecraft.item.ItemStack;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;

public class RecipeManager {

    public static void init(ModContext modContext) {

        compatibility.addSmelting(Ores.CopperOre, new ItemStack(Ores.CopperIngot), 5f);
        compatibility.addSmelting(Ores.LeadOre, new ItemStack(Ores.LeadIngot), 5f);
        compatibility.addSmelting(Ores.TinOre, new ItemStack(Ores.TinIngot), 5f);
        compatibility.addSmelting(Ores.GunmetalComposite, new ItemStack(Ores.GunmetalIngot), 5f);
        compatibility.addSmelting(Ores.SulfurDust, compatibility.createItemStack(CompatibleItems.GUNPOWDER, 1, 0), 5f);
        compatibility.addSmelting(Ores.SteelDust, new ItemStack(Ores.SteelIngot), 5f);
        compatibility.addSmelting(Ores.CarbonComposite, new ItemStack(Ores.CarbonFiber), 5f);

//        modContext.getRecipeManager().registerShapedRecipe(Armors.Tacticalhelmet,
//                "AXA",
//                "A A",
//                'A', CommonProxy.SteelPlate,
//                'X', CommonProxy.ElectronicCircuitBoard);

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.GunmetalComposite, 3),
                "XXX",
                "FFF",
                'X', Ores.INGOT_COPPER,
                'F', Ores.INGOT_TIN
                );
        
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.GunmetalPlate, 1),
                "XXX",
                "XXX",
                'X', Ores.GunmetalIngot
                );
        
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SteelDust, 1),
                "XXX",
                "XAX",
                "XXX",
                'X', CompatibleItems.COAL,
                'A', CompatibleItems.IRON_INGOT
                );
        
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.CarbonComposite, 3),
                "XXX",
                "AAA",
                'X', Ores.GraphiteChunk,
                'A', CompatibleItems.SLIME_BALL
                );
        
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SyntheticPolymerComposite, 3),
                "FFF",
                "XXX",
                "AAA",
                'F', Ores.SulfurDust,
                'X', Ores.GraphiteChunk,
                'A', CompatibleItems.SLIME_BALL
                );
        
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SyntheticPlastic, 1),
                "FFF",
                "XXX",
                'F', Ores.SyntheticPolymerComposite,
                'X', Ores.CarbonFiber
                );
        
        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.PlasticPlate, 1),
                "XXX",
                'X', Ores.SyntheticPlastic
                );
    }
}
