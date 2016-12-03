package com.vicmatskiv.mw;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	protected boolean isClient() {
		return true;
	}

	@Override
	public void init(Object mod, FMLInitializationEvent event) {
		super.init(mod, event);

		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

		renderItem.getItemModelMesher().register(CommonProxy.AK47Mag, 0, new ModelResourceLocation(
				ModernWarfareMod.MODID + ":" + "AK47Mag", "inventory"));
		
		renderItem.getItemModelMesher().register(CommonProxy.AR15Mag, 0, new ModelResourceLocation(
				ModernWarfareMod.MODID + ":" + "AR15Mag", "inventory"));
		
		renderItem.getItemModelMesher().register(CommonProxy.Grenades, 0, new ModelResourceLocation(
				ModernWarfareMod.MODID + ":" + "Grenades", "inventory"));
		
		renderItem.getItemModelMesher().register(CommonProxy.Laser, 0, new ModelResourceLocation(
				ModernWarfareMod.MODID + ":" + "Laser", "inventory"));
		
		renderItem.getItemModelMesher().register(CommonProxy.Laser2, 0, new ModelResourceLocation(
				ModernWarfareMod.MODID + ":" + "Laser2", "inventory"));
	}
}
