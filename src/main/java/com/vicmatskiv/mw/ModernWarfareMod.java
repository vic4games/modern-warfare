package com.vicmatskiv.mw;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

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

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(this, event);
	}

	// ItemRecipes
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		GameRegistry.addSmelting(CommonProxy.TitaniumOre, new ItemStack(CommonProxy.TitaniumIngot), 0.1f);
		GameRegistry.addSmelting(CommonProxy.CopperOre, new ItemStack(CommonProxy.CopperIngot), 0.1f);
		GameRegistry.addSmelting(CommonProxy.LeadOre, new ItemStack(CommonProxy.LeadIngot), 0.1f);
		GameRegistry.addSmelting(CommonProxy.ZincOre, new ItemStack(CommonProxy.ZincIngot), 0.1f);
		GameRegistry.addSmelting(CommonProxy.TinOre, new ItemStack(CommonProxy.TinIngot), 0.1f);
		GameRegistry.addSmelting(CommonProxy.SulfurDust, new ItemStack(Items.gunpowder), 0.1f);
		
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
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Cloth),
				"XAX",
				"AXA",
				"XAX",
				'X', Items.string,
				'A', Blocks.wool
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.TanCloth),
				"XAX",
				"AXA",
				"XAX",
				'X', Blocks.sandstone,
				'A', CommonProxy.Cloth
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.GreenCloth),
				"XAX",
				"AXA",
				"XAX",
				'X', Blocks.leaves,
				'A', CommonProxy.Cloth
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Electronics),
				"IRI",
				"GRG",
				"IGI",
				'I', Items.iron_ingot,
				'G', Items.gold_ingot,
				'R', Blocks.redstone_block
		);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.GunmetalIngot,
				"XD",
				"SA",
				'X', "ingotCopper",
				'A', "ingotZinc",
				'S', "ingotTin",
				'D', "ingotLead"));
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.CGrip),
				"AAA",
				"XBX",
				"  A",
				'A', CommonProxy.GunmetalPlate,
				'X', CommonProxy. GunmetalIngot,
				'B', Blocks.stone_button
		);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.OpticGlass,
				"XAX",
				"AEA",
				"XAX",
				'X', "ingotTitanium",
				'E', CommonProxy.Electronics,
				'A', Blocks.glass_pane
				
		));
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.GunmetalPlate),
				"XXX",
				"XXX",
				'X', CommonProxy.GunmetalIngot
		);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Bullets,
				" X ",
				"XAX",
				"XAX",
				'X', "ingotCopper",
				'A', Items.gunpowder
		));
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AK12),
				"AXA",
				" EQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AK47),
				"WXA",
				"WEQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'W', Blocks.planks,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AK74U),
				"WXA",
				" EQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'W', Blocks.planks,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AKM),
				"AXA",
				"AEQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AR15),
				"AXA",
				"AEX",
				"  Q",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AS50),
				"AAA",
				"XEX",
				" AQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);

		GameRegistry.addRecipe(new ItemStack(CommonProxy.AUG),
				"XXA",
				"AEX",
				" QA",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Dragonuv),
				"WXA",
				"AEQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'W', Blocks.planks,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.FamasG2),
				"XXA",
				"A A",
				"EQA",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Famas),
				"  A",
				"AXA",
				"EQA",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G18),
				"AAA",
				"EXQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G21),
				"AEA",
				"EXQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.P2000),
				"AEE",
				"AXQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G36C),
				"AAA",
				"E X",
				" AQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M16A4),
				"A A",
				"AEX",
				" AQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M16A3),
				"AXA",
				"AEX",
				" AQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M4A4),
				"AXA",
				"EAX",
				" XQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M9),
				"AXA",
				"EAX",
				"  Q",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Magnum),
				"AXA",
				"EAX",
				"  Q",
				'X', Items.iron_ingot,
				'A', Blocks.iron_block,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP5),
				"AAX",
				"AEA",
				"  Q",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP5K),
				"XXX",
				"AEA",
				"  Q",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP7),
				"XAX",
				"AEA",
				"X Q",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.PX90),
				"AA ",
				"AEA",
				"AQX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Remington870),
				"AXX",
				"AEA",
				"WWQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.KSG12),
				"AXX",
				"AEA",
				"  Q",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Scar),
				"AXA",
				"ESS",
				" AQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'S', Blocks.sandstone,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.ScarH),
				"AXA",
				"ESS",
				" AQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'S', CommonProxy.TitaniumIngot,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.XEagle),
				"AII",
				"EAA",
				"  Q",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip,
				'I', Blocks.iron_block
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.XWP),
				"AAI",
				"XEX",
				" AQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip,
				'I', Blocks.iron_block
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M107),
				"AAA",
				"XEX",
				" AQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip,
				'I', Blocks.iron_block
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M249),
				"IAI",
				"XEX",
				" AQ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip,
				'I', Blocks.iron_block
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.FNFAL),
				"AXA",
				"EQA",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'E', CommonProxy.Electronics,
				'Q', CommonProxy.CGrip
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AK47Mag),
				" XX",
				"XBX",
				"ABX",
				'X', CommonProxy.GunmetalIngot,
				'B', CommonProxy.Bullets
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AK74UMag),
				" XX",
				"WBW",
				"XBW",
				'X', CommonProxy.GunmetalIngot,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.AR15Mag),
				" XX",
				"XBX",
				"XB ",
				'X', CommonProxy.GunmetalIngot,
				'B', CommonProxy.Bullets
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.FamasMag),
				" XX",
				"XBI",
				"IB ",
				'X', CommonProxy.GunmetalIngot,
				'B', CommonProxy.Bullets,
				'I', CommonProxy.TitaniumIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.DragonuvMag),
				"XAA",
				"XBX",
				" BX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G18Mag),
				"XXX",
				"XBX",
				"ABA",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G21Mag),
				"XXA",
				"XBA",
				"XBA",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.G36CMag),
				"XAA",
				"XBX",
				" BX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M9Mag),
				"XBA",
				"XBX",
				"AAX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MagnumAmmo),
				"XXX",
				"BBA",
				"BBX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP5Mag),
				"AXA",
				"XBA",
				"XBX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.MP7Mag),
				"AXX",
				"ABX",
				"XBX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.PX90Mag),
				"CCC",
				"BBB",
				"AAA",
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Electronics,
				'C', CommonProxy.CopperIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Remington870Mag),
				"CCC",
				"BBA",
				"CCA",
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Electronics,
				'C', CommonProxy.CopperIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.ScarMag),
				"SXX",
				"XBS",
				"XB ",
				'X', CommonProxy.GunmetalIngot,
				'B', CommonProxy.Bullets,
				'S', Blocks.sandstone
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.XWPMag),
				"XXX",
				"ABA",
				" BA",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.M107Mag),
				"XXX",
				"WBA",
				" BW",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets,
				'W', CommonProxy.TitaniumIngot
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.FNFALMag),
				"AXA",
				"XBX",
				"XBX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'B', CommonProxy.Bullets,
				'W', Blocks.planks
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.ACOG),
				"RXA",
				"ORG",
				"AXX",
				'R', Blocks.redstone_block,
				'A', CommonProxy.GunmetalPlate,
				'X', CommonProxy.GunmetalIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Holo2),
				"A  ",
				"OR ",
				"AXX",
				'R', Blocks.redstone_block,
				'A', CommonProxy.GunmetalPlate,
				'X', CommonProxy.GunmetalIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Reflex),
				"A  ",
				"ORX",
				"AXX",
				'R', Blocks.redstone_block,
				'A', CommonProxy.GunmetalPlate,
				'X', CommonProxy.GunmetalIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Kobra),
				"X  ",
				"OGX",
				"ARX",
				'R', Blocks.redstone_block,
				'A', CommonProxy.GunmetalPlate,
				'X', CommonProxy.GunmetalIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Scope),
				"ARR",
				"OGO",
				"AXX",
				'R', Blocks.redstone_block,
				'A', CommonProxy.GunmetalPlate,
				'X', CommonProxy.GunmetalIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.HP),
				"ARX",
				"ORO",
				"AXX",
				'R', Blocks.redstone_block,
				'A', CommonProxy.GunmetalPlate,
				'X', CommonProxy.GunmetalIngot,
				'O', CommonProxy.OpticGlass,
				'G', Blocks.glass_pane
		);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(CommonProxy.Silencer,
				"XXX",
				"TTT",
				"XXX",
				'T', "ingotTin",
				'X', CommonProxy.GunmetalIngot
		));
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Grip),
				"X A",
				" XX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Grip2),
				"AXX",
				" X ",
				" X ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.VGrip),
				"XAX",
				" X ",
				" X ",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Bipod),
				" X ",
				"A A",
				"X X",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Laser),
				" X ",
				"RRA",
				"AXX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'R', Blocks.redstone_block
		);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.Laser2),
				"AXA",
				"RRX",
				"AXX",
				'X', CommonProxy.GunmetalIngot,
				'A', CommonProxy.GunmetalPlate,
				'R', Blocks.redstone_block
		);
		
	}
}
