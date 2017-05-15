package com.vicmatskiv.mw;

import java.io.File;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

@Mod(modid = ModernWarfareMod.MODID, version = ModernWarfareMod.VERSION)
public class ModernWarfareMod {

	private static final String CONFIG_PROPERTY_CATEGORY_GENERAL = "general";
	private static final String CONFIG_PROPERTY_ORE_GENERATION_ENABLED = "Ore generation enabled";
	private static final String MODERN_WARFARE_CONFIG_FILE_NAME = "ModernWarfare.cfg";
	public static final String MODID = "mw";
	public static final String VERSION = "1.10";

	@SidedProxy(serverSide = "com.vicmatskiv.weaponlib.CommonModContext", clientSide = "com.vicmatskiv.weaponlib.ClientModContext")
	public static ModContext MOD_CONTEXT;

	public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);

	public static CreativeTabs gunsTab = new GunsTab(
			CreativeTabs.getNextID(), "guns_tab");

	public static CreativeTabs AssaultRiflesTab = new AssaultRiflesTab(
            CreativeTabs.getNextID(), "AssaultRifles_tab");

	public static CreativeTabs PistolsTab = new PistolsTab(
            CreativeTabs.getNextID(), "Pistols_tab");

	public static CreativeTabs SMGTab = new SMGTab(
            CreativeTabs.getNextID(), "SMG_tab");

	public static CreativeTabs ShotgunsTab = new ShotgunsTab(
            CreativeTabs.getNextID(), "ShotgunsTab");

	public static CreativeTabs SnipersTab = new SnipersTab(
            CreativeTabs.getNextID(), "SnipersTab");

	public static CreativeTabs AR2Tab = new AR2Tab(
            CreativeTabs.getNextID(), "AR2Tab");

	public static CreativeTabs FunGunsTab = new FunGunsTab(
			CreativeTabs.getNextID(), "FunGuns_tab");

	@SidedProxy(serverSide = "com.vicmatskiv.mw.CommonProxy",
			clientSide = "com.vicmatskiv.mw.ClientProxy")
	public static CommonProxy proxy;

	public static boolean oreGenerationEnabled = true;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		configure(event.getSuggestedConfigurationFile());
		proxy.init(this, new CompatibleFmlInitializationEvent(event));
	}

	private void configure(File suggestedConfig) {
		File parentDirectory = suggestedConfig.getParentFile();
		File configFile;
		if(parentDirectory != null) {
			configFile = new File(parentDirectory, MODERN_WARFARE_CONFIG_FILE_NAME);
		} else {
			configFile = new File(MODERN_WARFARE_CONFIG_FILE_NAME);
		}
		Configuration config = new Configuration(configFile);
		config.load();
		Property oreGenerationEnabled = config.get(CONFIG_PROPERTY_CATEGORY_GENERAL, CONFIG_PROPERTY_ORE_GENERATION_ENABLED, true);
		ModernWarfareMod.oreGenerationEnabled = oreGenerationEnabled.getBoolean();
		config.save();
	}

	// ItemRecipes
	@EventHandler
	public void init(FMLInitializationEvent event) {
	    RecipeManager.init();
	}
}
