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

        renderItem.getItemModelMesher().register(Armors.Tacticalhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tactical_helmet", "inventory"));
        
            
        renderItem.getItemModelMesher().register(Armors.GasMaskM40, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "m40gasmask_helmet", "inventory"));

	}
}
