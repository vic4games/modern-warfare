package com.vicmatskiv.mw;

import java.io.File;

import javax.xml.transform.stream.StreamSource;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = ModernWarfareMod.MODID, version = ModernWarfareMod.VERSION)
public class ModernWarfareMod {

	private static final String DEFAULT_CONFIG_RESOURCE = "/mw.cfg";
    private static final String MODERN_WARFARE_CONFIG_FILE_NAME = "ModernWarfare.cfg";
    public static final String MODID = "mw";
	public static final String VERSION = "1.10.1";

    @SidedProxy(serverSide = "com.vicmatskiv.weaponlib.CommonModContext", clientSide = "com.vicmatskiv.weaponlib.ClientModContext")
    public static ModContext MOD_CONTEXT;

    public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);

	public static CreativeTabs gunsTab = new GunsTab(
			CreativeTabs.getNextID(), "guns_tab");

	public static CreativeTabs ArmorTab = new ArmorTab(
            CreativeTabs.getNextID(), "ArmorTab");

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

	public static CreativeTabs AmmoTab = new AmmoTab(
            CreativeTabs.getNextID(), "AmmoTab");

	public static CreativeTabs AttachmentsTab = new AttachmentsTab(
            CreativeTabs.getNextID(), "AttachmentsTab");

	public static CreativeTabs GrenadesTab = new GrenadesTab(
            CreativeTabs.getNextID(), "GrenadesTab");

	public static CreativeTabs GadgetsTab = new GadgetsTab(
            CreativeTabs.getNextID(), "GadgetsTab");

	public static CreativeTabs FunGunsTab = new FunGunsTab(
			CreativeTabs.getNextID(), "FunGuns_tab");

    @SidedProxy(serverSide = "com.vicmatskiv.mw.CommonProxy",
            clientSide = "com.vicmatskiv.mw.ClientProxy")
    public static CommonProxy proxy;

    public static boolean oreGenerationEnabled = true;
    private ConfigurationManager configurationManager;

    @EventHandler
    public void init(FMLPreInitializationEvent event) {
        initConfigurationManager(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(this, configurationManager, new CompatibleFmlInitializationEvent(event));
        initRecipies(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if(configurationManager != null) {
            configurationManager.save();
        }
    }

    private void initConfigurationManager(FMLPreInitializationEvent event) {
        File parentDirectory = event.getSuggestedConfigurationFile().getParentFile();
	    File configFile;
	    if(parentDirectory != null) {
	        configFile = new File(parentDirectory, MODERN_WARFARE_CONFIG_FILE_NAME);
	    } else {
	        configFile = new File(MODERN_WARFARE_CONFIG_FILE_NAME);
	    }
		configurationManager = new ConfigurationManager.Builder()
		        .withUserConfiguration(configFile)
		        .withDefaultConfiguration(new StreamSource(getClass().getResourceAsStream(DEFAULT_CONFIG_RESOURCE)))
		        .build();
    }

    // ItemRecipes
    //@EventHandler
    public void initRecipies(FMLInitializationEvent event) {
        RecipeManager.init(MOD_CONTEXT);
    }
}
