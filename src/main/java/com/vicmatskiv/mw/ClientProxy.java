package com.vicmatskiv.mw;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	protected boolean isClient() {
		return true;
	}

	@Override
	public void init(Object mod, FMLInitializationEvent event) {
		super.init(mod, event);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.BauxiteOre), 0, 
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "BauxiteOre", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.CopperOre), 0, 
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "CopperOre", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.LeadOre), 0, 
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "LeadOre", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.RubyOre), 0, 
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RubyOre", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.SiliconOre), 0, 
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SiliconOre", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.SulfurOre), 0, 
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SulfurOre", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.TantalumOre), 0, 
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "TantalumOre", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.TinOre), 0, 
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "TinOre", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.TitaniumOre), 0, 
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "TitaniumOre", "inventory"));
		
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		renderItem.getItemModelMesher().register(CommonProxy.AluminumIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AluminumIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.AluminumPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AluminumPlate", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Barrel, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Barrel", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Bullets, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Bullets", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.CGrip, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "CGrip", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Capacitor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Capacitor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Cloth, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Cloth", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.CopperIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "CopperIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.CopperWiring, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "CopperWiring", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.DeagleReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "DeagleReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Diode, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Diode", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Electronics, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Electronics", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.GreenCloth, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "GreenCloth", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Inductor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Inductor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.LMGReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "LMGReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.LaserPointer, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "LaserPointer", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.LeadIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "LeadIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.MiniSteelPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "MiniSteelPlate", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.OpticGlass, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "OpticGlass", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.P90Receiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "P90Receiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.PistolUnderReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "PistolUnderReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Piston, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Piston", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Plastic, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Plastic", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Resistor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Resistor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RetractableStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RetractableStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RevolverAction, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RevolverAction", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RevolverGrip, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RevolverGrip", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RevolverReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RevolverReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RifleReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RifleReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Ruby, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Ruby", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SMGReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SMGReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.ScarReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ScarReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SecondaryStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SecondaryStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.ShotgunGrip, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ShotgunGrip", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.ShotgunReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ShotgunReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Silicon, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Silicon", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SteelDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SteelDust", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SteelIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SteelIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SteelPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SteelPlate", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SulfurDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SulfurDust", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.TanCloth, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "TanCloth", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.TantalumIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "TantalumIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.TinIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "TinIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.TitaniumIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "TitaniumIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Transistor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Transistor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.UnderReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "UnderReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.WeaponReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "WeaponReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.WeaponStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "WeaponStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.WoodRifleStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "WoodRifleStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.WoodWeaponStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "WoodWeaponStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.AR15Iron, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AR15Iron", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.AKMIron, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AKMIron", "inventory"));

		
		renderItem.getItemModelMesher().register(CommonProxy.Marineboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Marine_boots", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Marinechest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Marine_chest", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Marinehelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Marine_helmet", "inventory"));
		
		renderItem.getItemModelMesher().register(CommonProxy.Spetznazboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Spetznaz_boots", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Spetznazchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Spetznaz_chest", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Spetznazhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Spetznaz_helmet", "inventory"));
		
		renderItem.getItemModelMesher().register(CommonProxy.Swatboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Swat_boots", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Swatchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Swat_chest", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Swathelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Swat_helmet", "inventory"));
		
		renderItem.getItemModelMesher().register(CommonProxy.Tacticalboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Tactical_boots", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Tacticalchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Tactical_chest", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Tacticalhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Tactical_helmet", "inventory"));
	}
}
