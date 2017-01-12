package com.vicmatskiv.mw;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.io.File;

import com.vicmatskiv.weaponlib.ModContext;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ModernWarfareMod.MODID, version = ModernWarfareMod.VERSION)
public class ModernWarfareMod {

	private static final String CONFIG_PROPERTY_CATEGORY_GENERAL = "general";
	private static final String CONFIG_PROPERTY_ORE_GENERATION_ENABLED = "Ore generation enabled";
	private static final String MODERN_WARFARE_CONFIG_FILE_NAME = "ModernWarfare.cfg";
	public static final String MODID = "mw";
	public static final String VERSION = "1.1";
	
	@SidedProxy(serverSide = "com.vicmatskiv.weaponlib.CommonModContext", clientSide = "com.vicmatskiv.weaponlib.ClientModContext")
	public static ModContext MOD_CONTEXT;
	
	public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
		
	public static CreativeTabs gunsTab = new GunsTab(
			CreativeTabs.getNextID(), "guns_tab");

	@SidedProxy(serverSide = "com.vicmatskiv.mw.CommonProxy", 
			clientSide = "com.vicmatskiv.mw.ClientProxy")
	public static CommonProxy proxy;
	
	public static boolean oreGenerationEnabled = true;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		configure(event.getSuggestedConfigurationFile());
		proxy.preInit(this, event);
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
		
		GameRegistry.addSmelting(CommonProxy.TitaniumOre, new ItemStack(CommonProxy.TitaniumIngot), 5f);
		GameRegistry.addSmelting(CommonProxy.CopperOre, new ItemStack(CommonProxy.CopperIngot), 5f);
		GameRegistry.addSmelting(CommonProxy.LeadOre, new ItemStack(CommonProxy.LeadIngot), 5f);
		GameRegistry.addSmelting(CommonProxy.TinOre, new ItemStack(CommonProxy.TinIngot), 5f);
		GameRegistry.addSmelting(CommonProxy.BauxiteOre, new ItemStack(CommonProxy.AluminumIngot), 5f);
		GameRegistry.addSmelting(CommonProxy.SiliconOre, new ItemStack(CommonProxy.Silicon), 5f);
		GameRegistry.addSmelting(CommonProxy.TantalumOre, new ItemStack(CommonProxy.TantalumIngot), 5f);
		GameRegistry.addSmelting(CommonProxy.SulfurDust, new ItemStack(Items.gunpowder), 5f);
		GameRegistry.addSmelting(CommonProxy.SteelDust, new ItemStack(CommonProxy.SteelIngot), 5f);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Marinehelmet, 
				"AAA",
				"AGA",
				"X X",
				'A', CommonProxy.TanCloth,
				'X', "ingotTitanium"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Marinechest,
				"A A",
				"AAA",
				"XXX",
				'A', CommonProxy.TanCloth,
				'X', "ingotTitanium"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Marineboots,
				"A A",
				"A A",
				"X X",
				'A', CommonProxy.TanCloth,
				'X', "ingotTitanium"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Spetznazhelmet,
				"AAA",
				"AGA",
				"X X",
				'A', CommonProxy.GreenCloth,
				'X', "ingotTitanium"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Spetznazchest,
				"A A",
				"AAA",
				"XXX",
				'A', CommonProxy.GreenCloth,
				'X', "ingotTitanium"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Spetznazboots,
				"A A",
				"A A",
				"X X",
				'A', CommonProxy.GreenCloth,
				'X', "ingotTitanium"));
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Cloth, 3),
				"XAX",
				"AXA",
				"XAX",
				'X', Items.string,
				'A', Blocks.wool
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.TanCloth, 3),
				"XAX",
				"AXA",
				"XAX",
				'X', Blocks.sandstone,
				'A', CommonProxy.Cloth
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.GreenCloth, 3),
				"XAX",
				"AXA",
				"XAX",
				'X', Blocks.leaves,
				'A', CommonProxy.Cloth
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Electronics),
				"TAI",
				"ACA",
				"RAD",
				'I', CommonProxy.Inductor,
				'T', CommonProxy.Transistor,
				'R', CommonProxy.Resistor,
				'D', CommonProxy.Diode,
				'C', CommonProxy.Capacitor,
				'A', CommonProxy.CopperWiring
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.CGrip),
				"AAA",
				"XBX",
				"  A",
				'A', CommonProxy.SteelPlate,
				'X', CommonProxy. SteelIngot,
				'B', Blocks.stone_button
		);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.OpticGlass,
				"XAX",
				"AEA",
				"XAX",
				'X', "ingotTitanium",
				'E', CommonProxy.CopperWiring,
				'A', Blocks.glass_pane
				
		));
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MiniSteelPlate, 2),
				"X",
				'X', CommonProxy.SteelIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.SteelPlate, 6),
				"XX",
				'X', CommonProxy.SteelIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Bullets, 32),
				" R ",
				"XAX",
				"XAX",
				'X', CommonProxy.CopperIngot,
				'R', CommonProxy.LeadIngot,
				'A', Items.gunpowder
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AK12),
				"XA ",
				" EA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WeaponStock
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AK47),
				"XA ",
				" EA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WoodWeaponStock
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AK74U),
				"XA ",
				" EA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.SMGReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.SecondaryStock
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AKM),
				"XR ",
				" EA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WeaponStock,
				'R', CommonProxy.SteelIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M14),
				"XA ",
				"AEA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WeaponStock,
				'R', CommonProxy.SteelIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AR15),
				"XAT",
				" EA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.UnderReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.SecondaryStock,
				'T', CommonProxy.WeaponReceiver
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.HK416C),
				"XAT",
				" EA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.UnderReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.RetractableStock,
				'T', CommonProxy.WeaponReceiver
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AS50),
				"XA ",
				" EA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.RifleReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.SecondaryStock
		);

		GameRegistry.addRecipe(new ItemStack(CommonProxy.AUG),
				"XA ",
				"QEA",
				"  F",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WeaponStock
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Dragonuv),
				"XA ",
				" EA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.RifleReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WoodRifleStock
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.FamasG2),
				"RA ",
				"AEA",
				" QF",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.UnderReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WeaponStock,
				'R', CommonProxy.Barrel
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Famas),
				"RX ",
				"AEA",
				" QF",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WeaponStock,
				'R', CommonProxy.Barrel
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G18),
				"RA ",
				"ERA",
				" FQ",
				'R', CommonProxy.SteelPlate,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.PistolUnderReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.SteelIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G21),
				"RA ",
				"ERA",
				"  Q",
				'R', CommonProxy.SteelPlate,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.PistolUnderReceiver,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.P2000),
				"RA ",
				"REA",
				"  Q",
				'R', CommonProxy.SteelPlate,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.PistolUnderReceiver,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G36C),
				"RA ",
				"UEA",
				" QF",
				'A', CommonProxy.SteelPlate,
				'R', CommonProxy.Barrel,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.SecondaryStock,
				'U', CommonProxy.UnderReceiver
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M16A4),
				"RAT",
				" EA",
				" QF",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.UnderReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WeaponStock,
				'T', CommonProxy.WeaponReceiver,
				'R', CommonProxy.Barrel
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M16A3),
				"RAT",
				"XEA",
				" QF",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.UnderReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WeaponStock,
				'T', CommonProxy.WeaponReceiver,
				'R', CommonProxy.Barrel
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M4A4),
				"XA ",
				"AEA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.SecondaryStock
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M9),
				"RA ",
				" AA",
				"E Q",
				'A', CommonProxy.SteelPlate,
				'R', CommonProxy.SteelIngot,
				'E', CommonProxy.PistolUnderReceiver,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Magnum),
				"RA ",
				"AFA",
				" Q ",
				'A', CommonProxy.AluminumPlate,
				'R', CommonProxy.RevolverAction,
				'Q', CommonProxy.RevolverGrip,
				'F', CommonProxy.RevolverReceiver
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP5),
				"TA ",
				"TEA",
				" QR",
				'A', CommonProxy.SteelPlate,
				'R', CommonProxy.WeaponStock,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'T', CommonProxy.SteelIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP5K),
				"RA ",
				" EA",
				" QA",
				'A', CommonProxy.SteelPlate,
				'R', CommonProxy.SteelIngot,
				'E', CommonProxy.SMGReceiver,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP7),
				"RA ",
				"AEA",
				" QR",
				'A', CommonProxy.SteelPlate,
				'R', CommonProxy.SteelIngot,
				'E', CommonProxy.SMGReceiver,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.PX90),
				"AA ",
				"AE ",
				" QA",
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.P90Receiver,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Remington870),
				"AA ",
				"YEA",
				" QR",
				'A', CommonProxy.SteelPlate,
				'Y', Blocks.planks,
				'R', CommonProxy.WoodWeaponStock,
				'E', CommonProxy.ShotgunReceiver,
				'Q', CommonProxy.ShotgunGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.KSG12),
				"AA ",
				"AEA",
				" QG",
				'G', CommonProxy.WeaponStock,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.ShotgunReceiver,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Scar),
				"RA ",
				"AEA",
				" QX",
				'X', CommonProxy.WeaponStock,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.ScarReceiver,
				'Q', CommonProxy.CGrip,
				'R', CommonProxy.Barrel
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.ScarH),
				"RA ",
				"AEA",
				" QX",
				'X', CommonProxy.WeaponStock,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'R', CommonProxy.Barrel
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.XEagle),
				"XA ",
				" EA",
				" Q ",
				'X', CommonProxy.SteelPlate,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.DeagleReceiver,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.XWP),
				"XAR",
				"AEA",
				" QF",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.RifleReceiver,
				'Q', CommonProxy.CGrip,
				'F', CommonProxy.WeaponStock,
				'R', CommonProxy.SteelPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M107),
				"XA ",
				"AEA",
				" QR",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.RifleReceiver,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M249),
				"XA ",
				"AEA",
				" QR",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.LMGReceiver,
				'Q', CommonProxy.CGrip,
				'R', CommonProxy.WeaponStock
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M240),
				"XA ",
				"AEA",
				"AQR",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.LMGReceiver,
				'Q', CommonProxy.CGrip,
				'R', CommonProxy.WeaponStock
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.FNFAL),
				"XA ",
				"FEA",
				" QR",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.WeaponReceiver,
				'Q', CommonProxy.CGrip,
				'R', CommonProxy.WeaponStock
		);
		
		/*GameRegistry.addRecipe(new ItemStack(CommonProxy.AK47Mag),
				" XX",
				"XBX",
				"ABX",
				'X', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets
		);*/
		
//		GameRegistry.addRecipe(new ItemStack(CommonProxy.AK74UMag),
//				" XX",
//				"WBW",
//				"XBW",
//				'X', CommonProxy.MiniSteelPlate,
//				'B', CommonProxy.Bullets,
//				'W', Blocks.planks
//		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AR15Mag),
				" XX",
				"XBX",
				"XB ",
				'X', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.FamasMag),
				" XX",
				"XBI",
				"IB ",
				'X', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'I', CommonProxy.TitaniumIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.DragonuvMag),
				"XAA",
				"XBX",
				" BX",
				'X', CommonProxy.MiniSteelPlate,
				'A', CommonProxy.SteelIngot,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G18Mag),
				"XXX",
				"XBX",
				"ABA",
				'X', CommonProxy.MiniSteelPlate,
				'A', CommonProxy.SteelIngot,
				'B', CommonProxy.Bullets
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G21Mag),
				"XXA",
				"XBA",
				"XBA",
				'X', CommonProxy.MiniSteelPlate,
				'A', CommonProxy.SteelIngot,
				'B', CommonProxy.Bullets
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G36CMag),
				"XAA",
				"XBX",
				" BX",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M9Mag),
				"XBA",
				"XBX",
				"AAX",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MagnumAmmo),
				"XXX",
				"BBA",
				"BBX",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
//		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP5Mag),
//				"AXA",
//				"XBA",
//				"XBX",
//				'X', CommonProxy.SteelIngot,
//				'A', CommonProxy.MiniSteelPlate,
//				'B', CommonProxy.Bullets,
//				'W', Blocks.planks
//		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP7Mag),
				"AXX",
				"ABX",
				"XBX",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.PX90Mag),
				"CCC",
				"BBB",
				"AAA",
				'A', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'C', CommonProxy.AluminumIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Remington870Mag),
				"CCC",
				"BBA",
				"CCA",
				'A', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'C', CommonProxy.CopperIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.ScarMag),
				"SXX",
				"XBS",
				"XB ",
				'X', CommonProxy.SteelIngot,
				'B', CommonProxy.Bullets,
				'S', Blocks.sandstone
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.XWPMag),
				"XXX",
				"ABA",
				" BA",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M107Mag),
				"XXX",
				"WBA",
				" BW",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'W', CommonProxy.TitaniumIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.FNFALMag),
				"AXA",
				"XBX",
				"XBX",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.ACOG),
				"FXA",
				"ORG",
				"AXX",
				'R', CommonProxy.Electronics,
				'A', CommonProxy.MiniSteelPlate,
				'X', CommonProxy.SteelIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane,
				'F', CommonProxy.CopperWiring
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Holo2),
				"A  ",
				"OR ",
				"AXX",
				'R', CommonProxy.Electronics,
				'A', CommonProxy.MiniSteelPlate,
				'X', CommonProxy.SteelIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Reflex),
				"A  ",
				"ORX",
				"AXX",
				'R', CommonProxy.Electronics,
				'A', CommonProxy.MiniSteelPlate,
				'X', CommonProxy.SteelIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Kobra),
				"X  ",
				"OGX",
				"ARX",
				'R', CommonProxy.Electronics,
				'A', CommonProxy.MiniSteelPlate,
				'X', CommonProxy.SteelIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Scope),
				"ARR",
				"OGO",
				"XXX",
				'R', CommonProxy.Electronics,
				'A', CommonProxy.MiniSteelPlate,
				'X', CommonProxy.SteelIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.HP),
				"ARX",
				"ORO",
				"AXX",
				'R', CommonProxy.Electronics,
				'A', CommonProxy.MiniSteelPlate,
				'X', CommonProxy.SteelIngot,
				'O', CommonProxy.OpticGlass
		);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Silencer,
				"XXX",
				"TTT",
				"XXX",
				'T', "ingotTin",
				'X', CommonProxy.SteelIngot
		));
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Grip),
				"X A",
				" XX",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Grip2),
				"AXX",
				" X ",
				" X ",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.VGrip),
				"XAX",
				" X ",
				" X ",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Bipod),
				" X ",
				"A A",
				"X X",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Laser),
				" X ",
				"ARE",
				"AXX",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'R', CommonProxy.LaserPointer,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Laser2),
				"AXA",
				"XRE",
				"AXX",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'R', CommonProxy.LaserPointer,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.LaserPointer),
				"XXX",
				"AAR",
				"XXX",
				'X', CommonProxy.MiniSteelPlate,
				'A', CommonProxy.Ruby,
				'R', CommonProxy.Capacitor
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.WeaponStock),
				"XX ",
				" XA",
				" XA",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.WoodWeaponStock),
				"XXX",
				"XAX",
				"XXX",
				'X', Blocks.planks,
				'A', CommonProxy.WeaponStock
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.WoodRifleStock),
				"XXR",
				"RXA",
				"RAA",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'R', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.RetractableStock),
				"XX ",
				"XRA",
				" A ",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'R', CommonProxy.Piston
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.SecondaryStock),
				"XA ",
				"XXA",
				" A ",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Barrel, 2),
				"X  ",
				" X ",
				"  A",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.WeaponReceiver),
				"XA ",
				"AEA",
				" AX",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.MiniSteelPlate,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.ScarReceiver),
				"RA ",
				"AEA",
				" AX",
				'X', CommonProxy.SteelPlate,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.Electronics,
				'R', CommonProxy.SteelIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.SMGReceiver),
				"XX ",
				"AEA",
				" A ",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.UnderReceiver),
				"AXE",
				" AX",
				"  A",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.RifleReceiver),
				"XX ",
				"AEX",
				" AA",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.LMGReceiver),
				"AA ",
				"AER",
				" RA",
				'R', CommonProxy.Piston,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.PistolUnderReceiver),
				"EA ",
				"XXA",
				" XA",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.RevolverAction),
				"XA ",
				"AXA",
				" AE",
				'X', CommonProxy.Barrel,
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.RevolverGrip),
				"BRX",
				"RAR",
				" RR",
				'X', CommonProxy.AluminumPlate,
				'A', CommonProxy.SteelPlate,
				'B', Blocks.stone_button,
				'R', CommonProxy.Plastic
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.RevolverReceiver),
				"AA ",
				"AXA",
				" AE",
				'X', CommonProxy.SteelPlate,
				'A', CommonProxy.AluminumPlate,
				'R', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.P90Receiver),
				"AXX",
				"AEA",
				" AR",
				'X', CommonProxy.SteelIngot,
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.Electronics,
				'R', CommonProxy.Piston
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.DeagleReceiver),
				"AA ",
				"AEA",
				" AA",
				'A', CommonProxy.AluminumPlate,
				'E', CommonProxy.Electronics
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.ShotgunReceiver),
				"EA ",
				"ARA",
				" AA",
				'A', CommonProxy.SteelPlate,
				'E', CommonProxy.Electronics,
				'R', CommonProxy.Piston
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.ShotgunGrip),
				"BAR",
				"RAR",
				" RA",
				'A', CommonProxy.SteelPlate,
				'B', Blocks.stone_button,
				'R', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Resistor, 3),
				"A",
				"X",
				"A",
				'A', CommonProxy.SteelIngot,
				'X', Items.coal
				
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Transistor, 3),
				"AA",
				"XX",
				"XX",
				'A', CommonProxy.SteelIngot,
				'X', CommonProxy.Silicon
				
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Capacitor, 3),
				"XX",
				"AA",
				"RR",
				'X', CommonProxy.AluminumIngot,
				'A', CommonProxy.Plastic,
				'R', CommonProxy.TantalumIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Inductor, 3),
				" A ",
				"AXA",
				" A ",
				'X', CommonProxy.Plastic,
				'A', CommonProxy.CopperWiring
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Diode, 3),
				"X",
				"A",
				"X",
				'A', CommonProxy.SteelIngot,
				'X', CommonProxy.Silicon
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.CopperWiring, 10),
				"AAA",
				'A', CommonProxy.CopperIngot
	);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Plastic, 3),
				"AX",
				'A', Items.coal,
				'X', Items.water_bucket
		);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Piston,
				"XA ",
				"AXX",
				" XE",
				'A', CommonProxy.SteelPlate,
				'X', "ingotSteel",
				'E', CommonProxy.Electronics
		));
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.SteelDust, 4),
				" X ",
				"XAX",
				" X ",
				'A', Items.iron_ingot,
				'X', Items.coal
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AluminumPlate, 6),
				"XX",
				'X', CommonProxy.AluminumIngot
		);
		
	}
}
