package com.paneedah.mw.proxies;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.PlayerAnimations;
import com.paneedah.mw.models.Workbench;
import com.paneedah.mw.ores.Ores;
import com.paneedah.mw.utils.ModReference;
import com.paneedah.mw.wearables.Armors;
import com.paneedah.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.config.ConfigurationManager;
import com.paneedah.weaponlib.crafting.ammopress.TESRAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.model.AmmoPress;
import com.paneedah.weaponlib.crafting.workbench.TESRWorkbench;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import com.paneedah.weaponlib.inventory.BackpackInventoryTab;
import com.paneedah.weaponlib.inventory.CustomPlayerInventoryTab;
import com.paneedah.weaponlib.inventory.InventoryTabs;
import com.paneedah.weaponlib.inventory.StandardPlayerInventoryTab;
import com.paneedah.weaponlib.render.CustomArmorLayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy {

    public static final Minecraft mc = Minecraft.getMinecraft();

    @Override
    protected boolean isClient() {
        return true;
    }

    @Override
    public void preInit(final ModernWarfareMod mod, final ConfigurationManager configurationManager, final CompatibleFmlPreInitializationEvent initializationEvent) {
        super.preInit(mod, configurationManager, initializationEvent);

        final InventoryTabs inventoryTabs = InventoryTabs.getInstance();

        inventoryTabs.registerTab(new StandardPlayerInventoryTab());
        inventoryTabs.registerTab(new CustomPlayerInventoryTab(ModernWarfareMod.MOD_CONTEXT, Ores.VestRender));
        inventoryTabs.registerTab(new BackpackInventoryTab(ModernWarfareMod.MOD_CONTEXT));

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWorkbench.class, new TESRWorkbench(new Workbench(), new ResourceLocation(ModReference.MWC_ID + ":textures/blocks/workbench.png")));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAmmoPress.class, new TESRAmmoPress(new AmmoPress(), new ResourceLocation(ModReference.MWC_ID + ":textures/blocks/ammo_press.png")));
    }

    @Override
    public void init(final ModernWarfareMod mod, final ConfigurationManager configurationManager, final CompatibleFmlInitializationEvent initializationEvent) {
        super.init(mod, configurationManager, initializationEvent);

        PlayerAnimations.init(mod, configurationManager, initializationEvent);

        final ItemModelMesher modelMesher = mc.getRenderItem().getItemModelMesher();

        modelMesher.register(Item.getItemFromBlock(Ores.CopperOre), 0, new ModelResourceLocation(ModReference.MWC_ID + ":copperore", "inventory"));
        modelMesher.register(Item.getItemFromBlock(Ores.SulfurOre), 0, new ModelResourceLocation(ModReference.MWC_ID + ":sulfurore", "inventory"));
        modelMesher.register(Item.getItemFromBlock(Ores.TinOre), 0, new ModelResourceLocation(ModReference.MWC_ID + ":tinore", "inventory"));
        modelMesher.register(Item.getItemFromBlock(Ores.LeadOre), 0, new ModelResourceLocation(ModReference.MWC_ID + ":leadore", "inventory"));
        modelMesher.register(Item.getItemFromBlock(Ores.GraphiteOre), 0, new ModelResourceLocation(ModReference.MWC_ID + ":graphiteore", "inventory"));

        modelMesher.register(Ores.CopperIngot, 0, new ModelResourceLocation(ModReference.MWC_ID + ":copperingot", "inventory"));
        modelMesher.register(Ores.LeadIngot, 0, new ModelResourceLocation(ModReference.MWC_ID + ":leadingot", "inventory"));
        modelMesher.register(Ores.SteelDust, 0, new ModelResourceLocation(ModReference.MWC_ID + ":steeldust", "inventory"));
        modelMesher.register(Ores.SteelIngot, 0, new ModelResourceLocation(ModReference.MWC_ID + ":steelingot", "inventory"));
        modelMesher.register(Ores.SulfurDust, 0, new ModelResourceLocation(ModReference.MWC_ID + ":sulfurdust", "inventory"));
        modelMesher.register(Ores.TinIngot, 0, new ModelResourceLocation(ModReference.MWC_ID + ":tiningot", "inventory"));
        modelMesher.register(Ores.GraphiteChunk, 0, new ModelResourceLocation(ModReference.MWC_ID + ":graphitechunk", "inventory"));
        modelMesher.register(Ores.GunmetalIngot, 0, new ModelResourceLocation(ModReference.MWC_ID + ":gunmetalingot", "inventory"));
        modelMesher.register(Ores.GunmetalPlate, 0, new ModelResourceLocation(ModReference.MWC_ID + ":gunmetalplate", "inventory"));
        modelMesher.register(Ores.GunmetalComposite, 0, new ModelResourceLocation(ModReference.MWC_ID + ":gunmetalcomposite", "inventory"));
        modelMesher.register(Ores.CarbonComposite, 0, new ModelResourceLocation(ModReference.MWC_ID + ":carboncomposite", "inventory"));
        modelMesher.register(Ores.CarbonFiber, 0, new ModelResourceLocation(ModReference.MWC_ID + ":carbonfiber", "inventory"));
        modelMesher.register(Ores.SyntheticPolymerComposite, 0, new ModelResourceLocation(ModReference.MWC_ID + ":syntheticpolymercomposite", "inventory"));
        modelMesher.register(Ores.SyntheticPlastic, 0, new ModelResourceLocation(ModReference.MWC_ID + ":syntheticplastic", "inventory"));

        modelMesher.register(Ores.VestRender, 0, new ModelResourceLocation(ModReference.MWC_ID + ":vestrender", "inventory"));

        //modelMesher.register(CommonProxy.AKMIron, 0, new ModelResourceLocation(ModReference.MWC_ID + ":akmiron", "inventory"));

        modelMesher.register(Armors.Dclassboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":dclass_boots", "inventory"));
        modelMesher.register(Armors.Dclasschest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":dclass_chest", "inventory"));

        modelMesher.register(Armors.SCPGuardboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":swat_boots", "inventory"));
        modelMesher.register(Armors.SCPGuardchest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":scpguard_chest", "inventory"));
        modelMesher.register(Armors.SCPGuardhelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":scpguard_helmet", "inventory"));

        modelMesher.register(Armors.Marineboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":marine_boots", "inventory"));
        modelMesher.register(Armors.Marinechest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":marine_chest", "inventory"));
        modelMesher.register(Armors.Marinehelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":marine_helmet", "inventory"));

        modelMesher.register(Armors.Spetznazboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":spetznaz_boots", "inventory"));
        modelMesher.register(Armors.Spetznazchest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":spetznaz_chest", "inventory"));
        modelMesher.register(Armors.Spetznazhelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":spetznaz_helmet", "inventory"));

        modelMesher.register(Armors.Urbanboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":urban_boots", "inventory"));
        modelMesher.register(Armors.Urbanchest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":urban_chest", "inventory"));
        modelMesher.register(Armors.Urbanhelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":urban_helmet", "inventory"));

        modelMesher.register(Armors.Ghilliehelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":ghillie_helmet", "inventory"));
        modelMesher.register(Armors.Ghilliechest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":ghillie_chest", "inventory"));
        modelMesher.register(Armors.Ghillieboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":ghillie_boots", "inventory"));

        modelMesher.register(Armors.Blackcamochest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":blackcamo_chest", "inventory"));
        modelMesher.register(Armors.Forestchest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":forest_chest", "inventory"));

        modelMesher.register(Armors.BlackJeansboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":blackjeans_boots", "inventory"));
        modelMesher.register(Armors.KhakiJeansboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":khakijeans_boots", "inventory"));

        modelMesher.register(Armors.Swatboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":swat_boots", "inventory"));
        modelMesher.register(Armors.Swatchest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":swat_chest", "inventory"));
        modelMesher.register(Armors.Swathelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":swat_helmet", "inventory"));

        modelMesher.register(Armors.Santaboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":santa_boots", "inventory"));
        modelMesher.register(Armors.Santachest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":santa_chest", "inventory"));
        modelMesher.register(Armors.Santahelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":santa_helmet", "inventory"));

        modelMesher.register(Armors.NaziSantaboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":nazisanta_boots", "inventory"));
        modelMesher.register(Armors.NaziSantachest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":nazisanta_chest", "inventory"));
        modelMesher.register(Armors.NaziSantahelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":nazisanta_helmet", "inventory"));

        modelMesher.register(Armors.SpecOpsboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":spec_ops_boots", "inventory"));
        modelMesher.register(Armors.SpecOpschest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":spec_ops_chest", "inventory"));
        modelMesher.register(Armors.SpecOpshelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":spec_ops_helmet", "inventory"));

        modelMesher.register(Armors.Juggernautboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":juggernaut_boots", "inventory"));
        modelMesher.register(Armors.Juggernautchest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":juggernaut_chest", "inventory"));
        modelMesher.register(Armors.Juggernauthelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":juggernaut_helmet", "inventory"));

        modelMesher.register(Armors.Astronautboots, 0, new ModelResourceLocation(ModReference.MWC_ID + ":Astronaut_boots", "inventory"));
        modelMesher.register(Armors.Astronautchest, 0, new ModelResourceLocation(ModReference.MWC_ID + ":Astronaut_chest", "inventory"));
        modelMesher.register(Armors.Astronauthelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":Astronaut_helmet", "inventory"));

        modelMesher.register(Armors.Tacticalhelmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":tactical_helmet", "inventory"));

        modelMesher.register(Armors.JPNVG18helmet, 0, new ModelResourceLocation(ModReference.MWC_ID + ":jpnvg18_helmet", "inventory"));

        modelMesher.register(Armors.GasMaskM40, 0, new ModelResourceLocation(ModReference.MWC_ID + ":m40gasmask_helmet", "inventory"));

        // Todo: Actually remove this once fixed.
        
        if (ForgeModContainer.allowEmissiveItems)
            ForgeModContainer.allowEmissiveItems = false;
    }

    @Override
    public void postInit(final ModernWarfareMod mod, final ConfigurationManager configurationManager, final FMLPostInitializationEvent initializationEvent) {
        mc.getRenderManager().getSkinMap().forEach((p, r) -> r.addLayer(new CustomArmorLayer(r)));
    }
}
