package com.paneedah.mw.proxies;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.PlayerAnimations;
import com.paneedah.mw.models.Workbench;
import com.paneedah.mw.ores.Ores;
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
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import static com.paneedah.mw.ModernWarfareMod.mc;

public class ClientProxy extends CommonProxy {

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
		
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWorkbench.class, new TESRWorkbench(new Workbench(), new ResourceLocation(ModernWarfareMod.MODID + ":textures/blocks/workbench.png")));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAmmoPress.class, new TESRAmmoPress(new AmmoPress(), new ResourceLocation(ModernWarfareMod.MODID + ":textures/blocks/ammo_press.png")));
	}
	
	@Override
	public void init(final ModernWarfareMod mod, final ConfigurationManager configurationManager, final CompatibleFmlInitializationEvent initializationEvent) {
	    super.init(mod, configurationManager, initializationEvent);
	    
	    PlayerAnimations.init(mod, configurationManager, initializationEvent);

        final ItemModelMesher modelMesher = mc.getRenderItem().getItemModelMesher();

        modelMesher.register(Item.getItemFromBlock(Ores.CopperOre), 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":copperore", "inventory"));
        modelMesher.register(Item.getItemFromBlock(Ores.SulfurOre), 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":sulfurore", "inventory"));
        modelMesher.register(Item.getItemFromBlock(Ores.TinOre), 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":tinore", "inventory"));
        modelMesher.register(Item.getItemFromBlock(Ores.LeadOre), 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":leadore", "inventory"));
        modelMesher.register(Item.getItemFromBlock(Ores.GraphiteOre), 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":graphiteore", "inventory"));

        modelMesher.register(Ores.CopperIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":copperingot", "inventory"));
        modelMesher.register(Ores.LeadIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":leadingot", "inventory"));
        modelMesher.register(Ores.SteelDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":steeldust", "inventory"));
        modelMesher.register(Ores.SteelIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":steelingot", "inventory"));
        modelMesher.register(Ores.SulfurDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":sulfurdust", "inventory"));
        modelMesher.register(Ores.TinIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":tiningot", "inventory"));
        modelMesher.register(Ores.GraphiteChunk, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":graphitechunk", "inventory"));
        modelMesher.register(Ores.GunmetalIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":gunmetalingot", "inventory"));
        modelMesher.register(Ores.GunmetalPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":gunmetalplate", "inventory"));
        modelMesher.register(Ores.GunmetalComposite, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":gunmetalcomposite", "inventory"));
        modelMesher.register(Ores.CarbonComposite, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":carboncomposite", "inventory"));
        modelMesher.register(Ores.CarbonFiber, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":carbonfiber", "inventory"));
        modelMesher.register(Ores.SyntheticPolymerComposite, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":syntheticpolymercomposite", "inventory"));
        modelMesher.register(Ores.SyntheticPlastic, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":syntheticplastic", "inventory"));
        
        modelMesher.register(Ores.VestRender, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":vestrender", "inventory"));
        
        //modelMesher.register(CommonProxy.AKMIron, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":akmiron", "inventory"));
        
        modelMesher.register(Armors.Dclassboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":dclass_boots", "inventory"));
        modelMesher.register(Armors.Dclasschest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":dclass_chest", "inventory"));
        
        modelMesher.register(Armors.SCPGuardboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":swat_boots", "inventory"));
        modelMesher.register(Armors.SCPGuardchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":scpguard_chest", "inventory"));
        modelMesher.register(Armors.SCPGuardhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":scpguard_helmet", "inventory"));

        modelMesher.register(Armors.Marineboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":marine_boots", "inventory"));
        modelMesher.register(Armors.Marinechest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":marine_chest", "inventory"));
        modelMesher.register(Armors.Marinehelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":marine_helmet", "inventory"));

        modelMesher.register(Armors.Spetznazboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":spetznaz_boots", "inventory"));
        modelMesher.register(Armors.Spetznazchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":spetznaz_chest", "inventory"));
        modelMesher.register(Armors.Spetznazhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":spetznaz_helmet", "inventory"));
        
        modelMesher.register(Armors.Urbanboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":urban_boots", "inventory"));
        modelMesher.register(Armors.Urbanchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":urban_chest", "inventory"));
        modelMesher.register(Armors.Urbanhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":urban_helmet", "inventory"));
        
        modelMesher.register(Armors.Ghilliehelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":ghillie_helmet", "inventory"));
        modelMesher.register(Armors.Ghilliechest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":ghillie_chest", "inventory"));
        modelMesher.register(Armors.Ghillieboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":ghillie_boots", "inventory"));
        
        modelMesher.register(Armors.Blackcamochest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":blackcamo_chest", "inventory"));
        modelMesher.register(Armors.Forestchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":forest_chest", "inventory"));
        
        modelMesher.register(Armors.BlackJeansboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":blackjeans_boots", "inventory"));
        modelMesher.register(Armors.KhakiJeansboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":khakijeans_boots", "inventory"));

        modelMesher.register(Armors.Swatboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":swat_boots", "inventory"));
        modelMesher.register(Armors.Swatchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":swat_chest", "inventory"));
        modelMesher.register(Armors.Swathelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":swat_helmet", "inventory"));
        
        modelMesher.register(Armors.Santaboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":santa_boots", "inventory"));
        modelMesher.register(Armors.Santachest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":santa_chest", "inventory"));
        modelMesher.register(Armors.Santahelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":santa_helmet", "inventory"));
        
        modelMesher.register(Armors.NaziSantaboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":nazisanta_boots", "inventory"));
        modelMesher.register(Armors.NaziSantachest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":nazisanta_chest", "inventory"));
        modelMesher.register(Armors.NaziSantahelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":nazisanta_helmet", "inventory"));
        
        modelMesher.register(Armors.SpecOpsboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":spec_ops_boots", "inventory"));
        modelMesher.register(Armors.SpecOpschest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":spec_ops_chest", "inventory"));
        modelMesher.register(Armors.SpecOpshelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":spec_ops_helmet", "inventory"));
        
        modelMesher.register(Armors.Juggernautboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":juggernaut_boots", "inventory"));
        modelMesher.register(Armors.Juggernautchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":juggernaut_chest", "inventory"));
        modelMesher.register(Armors.Juggernauthelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":juggernaut_helmet", "inventory"));
        
        modelMesher.register(Armors.Astronautboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":Astronaut_boots", "inventory"));
        modelMesher.register(Armors.Astronautchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":Astronaut_chest", "inventory"));
        modelMesher.register(Armors.Astronauthelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":Astronaut_helmet", "inventory"));

        modelMesher.register(Armors.Tacticalhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":tactical_helmet", "inventory"));
        
        modelMesher.register(Armors.JPNVG18helmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":jpnvg18_helmet", "inventory"));
            
        modelMesher.register(Armors.GasMaskM40, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":m40gasmask_helmet", "inventory"));

	}
	
	@Override
	public void postInit(final ModernWarfareMod mod, final ConfigurationManager configurationManager, final FMLPostInitializationEvent initializationEvent) {
	    mc.getRenderManager().getSkinMap().forEach((p, r) -> r.addLayer(new CustomArmorLayer(r)));
	}
}
