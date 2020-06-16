package com.vicmatskiv.mw;

import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.inventory.BackpackInventoryTab;
import com.vicmatskiv.weaponlib.inventory.CustomPlayerInventoryTab;
import com.vicmatskiv.weaponlib.inventory.InventoryTabs;
import com.vicmatskiv.weaponlib.inventory.StandardPlayerInventoryTab;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {

	@Override
	protected boolean isClient() {
		return true;
	}

	@Override
	public void preInit(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
		super.preInit(mod, configurationManager, event);
		
        InventoryTabs inventoryTabs = InventoryTabs.getInstance();

        inventoryTabs.registerTab(new StandardPlayerInventoryTab());

        inventoryTabs.registerTab(new CustomPlayerInventoryTab(ModernWarfareMod.MOD_CONTEXT, Items.DIAMOND_CHESTPLATE));

        inventoryTabs.registerTab(new BackpackInventoryTab(ModernWarfareMod.MOD_CONTEXT));
	}
	
	@Override
	public void init(ModernWarfareMod mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
	    super.init(mod, configurationManager, event);
	    
	    PlayerAnimations.init(mod, null, event);
	    
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.CopperOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "copperore", "inventory"));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.LeadOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "leadore", "inventory"));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.SulfurOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "sulfurore", "inventory"));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.TinOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tinore", "inventory"));
        
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(Ores.GraphiteOre), 0,
                new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "graphiteore", "inventory"));

        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
                
        renderItem.getItemModelMesher().register(Ores.CopperIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "copperingot", "inventory"));
        renderItem.getItemModelMesher().register(Ores.LeadIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "leadingot", "inventory"));
        
        renderItem.getItemModelMesher().register(Ores.SteelDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "steeldust", "inventory"));
        renderItem.getItemModelMesher().register(Ores.SteelIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "steelingot", "inventory"));
        renderItem.getItemModelMesher().register(Ores.SulfurDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "sulfurdust", "inventory"));
        renderItem.getItemModelMesher().register(Ores.TinIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tiningot", "inventory"));
        renderItem.getItemModelMesher().register(Ores.GraphiteChunk, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "graphitechunk", "inventory"));
        renderItem.getItemModelMesher().register(Ores.GunmetalIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "gunmetalingot", "inventory"));
        renderItem.getItemModelMesher().register(Ores.GunmetalPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "gunmetalplate", "inventory"));
        renderItem.getItemModelMesher().register(Ores.GunmetalComposite, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "gunmetalcomposite", "inventory"));
        renderItem.getItemModelMesher().register(Ores.CarbonComposite, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "carboncomposite", "inventory"));
        renderItem.getItemModelMesher().register(Ores.CarbonFiber, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "carbonfiber", "inventory"));
        renderItem.getItemModelMesher().register(Ores.SyntheticPolymerComposite, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "syntheticpolymercomposite", "inventory"));
        renderItem.getItemModelMesher().register(Ores.SyntheticPlastic, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "syntheticplastic", "inventory"));
        renderItem.getItemModelMesher().register(Ores.PlasticPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "plasticplate", "inventory"));
        
        //      renderItem.getItemModelMesher().register(CommonProxy.AKMIron, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "akmiron", "inventory"));


        renderItem.getItemModelMesher().register(Armors.Marineboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "marine_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Marinechest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "marine_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Marinehelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "marine_helmet", "inventory"));

        renderItem.getItemModelMesher().register(Armors.Spetznazboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spetznaz_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Spetznazchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spetznaz_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Spetznazhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spetznaz_helmet", "inventory"));

        renderItem.getItemModelMesher().register(Armors.Swatboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Swatchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Swathelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Santaboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "santa_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Santachest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "santa_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Santahelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "santa_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.NaziSantaboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "nazisanta_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.NaziSantachest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "nazisanta_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.NaziSantahelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "nazisanta_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.SpecOpsboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spec_ops_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.SpecOpschest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spec_ops_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.SpecOpshelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spec_ops_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.HECUboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "hecu_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.HECUchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "hecu_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.HECUhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "hecu_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Juggernautboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "juggernaut_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Juggernautchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "juggernaut_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Juggernauthelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "juggernaut_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Mercboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "merc_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Mercchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "merc_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Merchelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "merc_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.STARSboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "stars_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.STARSchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "stars_chest", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.NCRboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ncr_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.NCRchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ncr_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.NCRhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ncr_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.T60boots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "t60_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.T60chest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "t60_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.T60helmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "t60_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Umbrellaboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "umbrella_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Umbrellachest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "umbrella_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Umbrellahelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "umbrella_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Astronautboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Astronaut_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Astronautchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Astronaut_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Astronauthelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Astronaut_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.Scarboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "scar_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Scarchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "scar_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.Scarhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "scar_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.KCPDboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "kcpd_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.KCPDchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "kcpd_chest", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVIMainboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkvi_main_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVIMainchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkvi_main_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVIMainhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkvi_main_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVIDefaultboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkvidefault_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVIDefaultchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkvidefault_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVIDefaulthelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkvidefault_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVIRedboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkvired_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVIRedchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkvired_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVIRedhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkvired_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVIBlueboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkviblue_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVIBluechest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkviblue_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVIBluehelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkviblue_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVRedboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_red_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVRedchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_red_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVRedhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_red_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVBlueboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_blue_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVBluechest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_blue_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVBluehelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_blue_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVGreenboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_green_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVGreenchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_green_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVGreenhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_green_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVDefaultboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_default_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVDefaultchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_default_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVDefaulthelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_default_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVRedODSTboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_red_odst_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVRedODSTchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_red_odst_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVRedODSThelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_red_odst_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVBlueODSTboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_blue_odst_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVBlueODSTchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_blue_odst_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVBlueODSThelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_blue_odst_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVGreenODSTboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_green_odst_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVGreenODSTchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_green_odst_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVGreenODSThelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_green_odst_helmet", "inventory"));
        
        renderItem.getItemModelMesher().register(Armors.MKVDefaultODSTboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_default_odst_boots", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVDefaultODSTchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_default_odst_chest", "inventory"));
        renderItem.getItemModelMesher().register(Armors.MKVDefaultODSThelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "mkv_default_odst_helmet", "inventory"));

        renderItem.getItemModelMesher().register(Armors.Tacticalhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tactical_helmet", "inventory"));
        
            
        renderItem.getItemModelMesher().register(Armors.GasMaskM40, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "m40gasmask_helmet", "inventory"));

	}
}
