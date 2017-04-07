package com.vicmatskiv.mw;

import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {

	@Override
	protected boolean isClient() {
		return true;
	}

	@Override
	public void init(Object mod, CompatibleFmlInitializationEvent event) {
		super.init(mod, event);

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.BauxiteOre), 0,
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "bauxiteore", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.CopperOre), 0,
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "copperore", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.LeadOre), 0,
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "leadore", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.RubyOre), 0,
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "rubyore", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.SiliconOre), 0,
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "siliconore", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.SulfurOre), 0,
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "sulfurore", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.TantalumOre), 0,
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tantalumore", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.TinOre), 0,
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tinore", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(CommonProxy.TitaniumOre), 0,
				new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "titaniumore", "inventory"));

		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		renderItem.getItemModelMesher().register(CommonProxy.AluminumIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "aluminumingot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.AluminumPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "aluminumplate", "inventory"));
	    renderItem.getItemModelMesher().register(CommonProxy.BigSteelPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "bigsteelplate", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Bullets, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "bullets", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.CGrip, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "cgrip", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Capacitor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "capacitor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Cloth, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "cloth", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.CopperIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "copperingot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.CopperWiring, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "copperwiring", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Diode, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "diode", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Electronics, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "electronics", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.GreenCloth, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "greencloth", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Inductor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "inductor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.LaserPointer, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "laserpointer", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.LeadIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "leadingot", "inventory"));
        renderItem.getItemModelMesher().register(CommonProxy.MetalComponents, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "metalcomponents", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.MiniSteelPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ministeelplate", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.OpticGlass, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "opticglass", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Piston, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "piston", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Plastic, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "plastic", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Resistor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "resistor", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Ruby, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ruby", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Silicon, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "silicon", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SteelDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "steeldust", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SteelIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "steelingot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SteelPlate, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "steelplate", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.SulfurDust, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "sulfurdust", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.TanCloth, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tancloth", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.TantalumIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tantalumingot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.TinIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tiningot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.TitaniumIngot, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "titaniumingot", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Transistor, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "transistor", "inventory"));
//		renderItem.getItemModelMesher().register(CommonProxy.AR15Iron, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "ar15iron", "inventory"));
//		renderItem.getItemModelMesher().register(CommonProxy.AKMIron, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "akmiron", "inventory"));


		renderItem.getItemModelMesher().register(CommonProxy.Marineboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "marine_boots", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Marinechest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "marine_chest", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Marinehelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "marine_helmet", "inventory"));

		renderItem.getItemModelMesher().register(CommonProxy.Spetznazboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spetznaz_boots", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Spetznazchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spetznaz_chest", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Spetznazhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "spetznaz_helmet", "inventory"));

		renderItem.getItemModelMesher().register(CommonProxy.Swatboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_boots", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Swatchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_chest", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Swathelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "swat_helmet", "inventory"));

		renderItem.getItemModelMesher().register(CommonProxy.Tacticalboots, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tactical_boots", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Tacticalchest, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tactical_chest", "inventory"));
		renderItem.getItemModelMesher().register(CommonProxy.Tacticalhelmet, 0, new ModelResourceLocation(ModernWarfareMod.MODID + ":" + "tactical_helmet", "inventory"));
	}
}
