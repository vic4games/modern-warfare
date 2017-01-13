package com.vicmatskiv.mw;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
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
		renderItem.getItemModelMesher().register(CommonProxy.ACOG, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ACOG", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Magazine762x39, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AK47Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.AKMIron, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AKMIron", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.AR15Iron, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AR15Iron", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.AR15Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AR15Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.AluminumIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AluminumIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.AluminumPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "AluminumPlate", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Barrel, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Barrel", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Bipod, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Bipod", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Bullets, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Bullets", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.CGrip, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "CGrip", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Capacitor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Capacitor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Cloth, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Cloth", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.CopperIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "CopperIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.CopperWiring, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "CopperWiring", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.DeagleReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "DeagleReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Diode, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Diode", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.DragonuvMag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "DragonuvMag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.DrumMag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "DrumMag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Electronics, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Electronics", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.FNFALMag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "FNFALMag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.FamasMag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "FamasMag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.G18Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "G18Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.G21Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "G21Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.G36CMag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "G36CMag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.GreenCloth, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "GreenCloth", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Grip, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Grip", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Grip2, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Grip2", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.HP, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "HP", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Holo2, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Holo2", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Inductor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Inductor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Kobra, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Kobra", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.LMGReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "LMGReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Laser, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Laser", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Laser2, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Laser2", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.LaserPointer, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "LaserPointer", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.LeadIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "LeadIngot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.M107Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "M107Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.M110Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "M110Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.M14Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "M14Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.M1Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "M1Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.M249Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "M249Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.M9Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "M9Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.MP40Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "MP40Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.MP7Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "MP7Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.MagnumAmmo, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "MagnumAmmo", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.MiniSteelPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "MiniSteelPlate", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.OpticGlass, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "OpticGlass", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.P90Receiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "P90Receiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.PX90Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "PX90Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.PistolUnderReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "PistolUnderReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Piston, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Piston", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Plastic, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Plastic", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RPK74MMag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RPK74MMag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Reflex, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Reflex", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Remington870Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Remington870Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Resistor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Resistor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RetractableStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RetractableStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RevolverAction, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RevolverAction", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RevolverGrip, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RevolverGrip", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RevolverReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RevolverReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.RifleReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "RifleReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Ruby, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Ruby", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SMGReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SMGReceiver", "inventory"));
		//renderItem.getItemModelMesher().register(CommonProxy.SPAS15Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SPAS15Mag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.ScarHMag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ScarHMag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.ScarMag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ScarMag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.ScarReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ScarReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Scope, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "LP", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SecondaryStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "SecondaryStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.ShotgunGrip, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ShotgunGrip", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.ShotgunReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ShotgunReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Silencer, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "Silencer", "inventory"));
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
		renderItem.getItemModelMesher().register(CommonProxy.VGrip, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "VGrip", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.WeaponReceiver, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "WeaponReceiver", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.WeaponStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "WeaponStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.WoodRifleStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "WoodRifleStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.WoodWeaponStock, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "WoodWeaponStock", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.XWPMag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "XWPMag", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.M1911Mag, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "M1911Mag", "inventory"));

		
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
