package com.vicmatskiv.mw;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.attachments.ItemACOG;
import com.vicmatskiv.mw.attachments.ItemAKMIron;
import com.vicmatskiv.mw.attachments.ItemAR15Iron;
import com.vicmatskiv.mw.attachments.ItemBipod;
import com.vicmatskiv.mw.attachments.ItemExtra;
import com.vicmatskiv.mw.attachments.ItemGrip;
import com.vicmatskiv.mw.attachments.ItemGrip2;
import com.vicmatskiv.mw.attachments.ItemHP;
import com.vicmatskiv.mw.attachments.ItemHolo2;
import com.vicmatskiv.mw.attachments.ItemKobra;
import com.vicmatskiv.mw.attachments.ItemLaser;
import com.vicmatskiv.mw.attachments.ItemLaser2;
import com.vicmatskiv.mw.attachments.ItemReflex;
import com.vicmatskiv.mw.attachments.ItemScope;
import com.vicmatskiv.mw.attachments.ItemSilencer;
import com.vicmatskiv.mw.attachments.ItemVGrip;
import com.vicmatskiv.mw.blocks.BlockBauxiteOre;
import com.vicmatskiv.mw.blocks.BlockCopperOre;
import com.vicmatskiv.mw.blocks.BlockLeadOre;
import com.vicmatskiv.mw.blocks.BlockRubyOre;
import com.vicmatskiv.mw.blocks.BlockSiliconOre;
import com.vicmatskiv.mw.blocks.BlockSulfurOre;
import com.vicmatskiv.mw.blocks.BlockTantalumOre;
import com.vicmatskiv.mw.blocks.BlockTinOre;
import com.vicmatskiv.mw.blocks.BlockTitaniumOre;
import com.vicmatskiv.mw.items.ItemAR15Mag;
import com.vicmatskiv.mw.items.ItemDragonuvMag;
import com.vicmatskiv.mw.items.ItemDrumMag;
import com.vicmatskiv.mw.items.ItemFNFALMag;
import com.vicmatskiv.mw.items.ItemFamasMag;
import com.vicmatskiv.mw.items.ItemG18Mag;
import com.vicmatskiv.mw.items.ItemG21Mag;
import com.vicmatskiv.mw.items.ItemG36CMag;
import com.vicmatskiv.mw.items.ItemLaserPointer;
import com.vicmatskiv.mw.items.ItemM107Mag;
import com.vicmatskiv.mw.items.ItemM14Mag;
import com.vicmatskiv.mw.items.ItemM1911Mag;
import com.vicmatskiv.mw.items.ItemM1Mag;
import com.vicmatskiv.mw.items.ItemM249Mag;
import com.vicmatskiv.mw.items.ItemM9Mag;
import com.vicmatskiv.mw.items.ItemMP7Mag;
import com.vicmatskiv.mw.items.ItemMagnumAmmo;
import com.vicmatskiv.mw.items.ItemPX90Mag;
import com.vicmatskiv.mw.items.ItemRemington870Mag;
import com.vicmatskiv.mw.items.ItemScarHMag;
import com.vicmatskiv.mw.items.ItemScarMag;
import com.vicmatskiv.mw.items.ItemXWPMag;
import com.vicmatskiv.mw.items.guns.ACRFactory;
import com.vicmatskiv.mw.items.guns.AK12Factory;
import com.vicmatskiv.mw.items.guns.AK47Factory;
import com.vicmatskiv.mw.items.guns.AK74MFactory;
import com.vicmatskiv.mw.items.guns.AK74UFactory;
import com.vicmatskiv.mw.items.guns.AKMFactory;
import com.vicmatskiv.mw.items.guns.AN94Factory;
import com.vicmatskiv.mw.items.guns.AR15Factory;
import com.vicmatskiv.mw.items.guns.AS50Factory;
import com.vicmatskiv.mw.items.guns.AUGFactory;
import com.vicmatskiv.mw.items.guns.DragonuvFactory;
import com.vicmatskiv.mw.items.guns.FNFALFactory;
import com.vicmatskiv.mw.items.guns.FamasFactory;
import com.vicmatskiv.mw.items.guns.FamasG2Factory;
import com.vicmatskiv.mw.items.guns.G18Factory;
import com.vicmatskiv.mw.items.guns.G21Factory;
import com.vicmatskiv.mw.items.guns.G36CFactory;
import com.vicmatskiv.mw.items.guns.G36Factory;
import com.vicmatskiv.mw.items.guns.HK416CFactory;
import com.vicmatskiv.mw.items.guns.KSG12Factory;
import com.vicmatskiv.mw.items.guns.M1014Factory;
import com.vicmatskiv.mw.items.guns.M107Factory;
import com.vicmatskiv.mw.items.guns.M110Factory;
import com.vicmatskiv.mw.items.guns.M14Factory;
import com.vicmatskiv.mw.items.guns.M16A3Factory;
import com.vicmatskiv.mw.items.guns.M16A4Factory;
import com.vicmatskiv.mw.items.guns.M1911Factory;
import com.vicmatskiv.mw.items.guns.M1CarbineFactory;
import com.vicmatskiv.mw.items.guns.M240Factory;
import com.vicmatskiv.mw.items.guns.M249Factory;
import com.vicmatskiv.mw.items.guns.M4A1Factory;
import com.vicmatskiv.mw.items.guns.M4A4Factory;
import com.vicmatskiv.mw.items.guns.M9Factory;
import com.vicmatskiv.mw.items.guns.MG36Factory;
import com.vicmatskiv.mw.items.guns.MP40Factory;
import com.vicmatskiv.mw.items.guns.MP5Factory;
import com.vicmatskiv.mw.items.guns.MP5KFactory;
import com.vicmatskiv.mw.items.guns.MP7Factory;
import com.vicmatskiv.mw.items.guns.MagnumFactory;
import com.vicmatskiv.mw.items.guns.P2000Factory;
import com.vicmatskiv.mw.items.guns.PX90Factory;
import com.vicmatskiv.mw.items.guns.RPK74MFactory;
import com.vicmatskiv.mw.items.guns.Remington900Factory;
import com.vicmatskiv.mw.items.guns.SPAS12Factory;
import com.vicmatskiv.mw.items.guns.ScarFactory;
import com.vicmatskiv.mw.items.guns.ScarHFactory;
import com.vicmatskiv.mw.items.guns.XEagleFactory;
import com.vicmatskiv.mw.items.guns.XWPFactory;
import com.vicmatskiv.mw.parts.ItemBarrel;
import com.vicmatskiv.mw.parts.ItemCapacitor;
import com.vicmatskiv.mw.parts.ItemCopperWiring;
import com.vicmatskiv.mw.parts.ItemDeagleReceiver;
import com.vicmatskiv.mw.parts.ItemDiode;
import com.vicmatskiv.mw.parts.ItemInductor;
import com.vicmatskiv.mw.parts.ItemLMGReceiver;
import com.vicmatskiv.mw.parts.ItemP90Receiver;
import com.vicmatskiv.mw.parts.ItemPistolUnderReceiver;
import com.vicmatskiv.mw.parts.ItemResistor;
import com.vicmatskiv.mw.parts.ItemRetractableStock;
import com.vicmatskiv.mw.parts.ItemRevolverAction;
import com.vicmatskiv.mw.parts.ItemRevolverGrip;
import com.vicmatskiv.mw.parts.ItemRevolverReceiver;
import com.vicmatskiv.mw.parts.ItemRifleReceiver;
import com.vicmatskiv.mw.parts.ItemSMGReceiver;
import com.vicmatskiv.mw.parts.ItemScarReceiver;
import com.vicmatskiv.mw.parts.ItemSecondaryStock;
import com.vicmatskiv.mw.parts.ItemShotgunGrip;
import com.vicmatskiv.mw.parts.ItemShotgunReceiver;
import com.vicmatskiv.mw.parts.ItemTransistor;
import com.vicmatskiv.mw.parts.ItemUnderReceiver;
import com.vicmatskiv.mw.parts.ItemWeaponReceiver;
import com.vicmatskiv.mw.parts.ItemWeaponStock;
import com.vicmatskiv.mw.parts.ItemWoodRifleStock;
import com.vicmatskiv.mw.parts.ItemWoodWeaponStock;
import com.vicmatskiv.mw.resources.ItemAluminumIngot;
import com.vicmatskiv.mw.resources.ItemAluminumPlate;
import com.vicmatskiv.mw.resources.ItemBullets;
import com.vicmatskiv.mw.resources.ItemCGrip;
import com.vicmatskiv.mw.resources.ItemCloth;
import com.vicmatskiv.mw.resources.ItemCopperIngot;
import com.vicmatskiv.mw.resources.ItemElectronics;
import com.vicmatskiv.mw.resources.ItemGreenCloth;
import com.vicmatskiv.mw.resources.ItemLeadIngot;
import com.vicmatskiv.mw.resources.ItemMiniSteelPlate;
import com.vicmatskiv.mw.resources.ItemOpticGlass;
import com.vicmatskiv.mw.resources.ItemPiston;
import com.vicmatskiv.mw.resources.ItemPlastic;
import com.vicmatskiv.mw.resources.ItemRuby;
import com.vicmatskiv.mw.resources.ItemSilicon;
import com.vicmatskiv.mw.resources.ItemSteelDust;
import com.vicmatskiv.mw.resources.ItemSteelIngot;
import com.vicmatskiv.mw.resources.ItemSteelPlate;
import com.vicmatskiv.mw.resources.ItemSulfurDust;
import com.vicmatskiv.mw.resources.ItemTanCloth;
import com.vicmatskiv.mw.resources.ItemTantalumIngot;
import com.vicmatskiv.mw.resources.ItemTinIngot;
import com.vicmatskiv.mw.resources.ItemTitaniumIngot;
import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.CustomArmor.Builder;
import com.vicmatskiv.weaponlib.ItemAmmo;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.Weapon;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	public static Item Marinechest;
	public static Item Marineboots;
	public static Item Marinehelmet;

	public static Item Spetznazchest;
	public static Item Spetznazboots;
	public static Item Spetznazhelmet;

	public static Item Swatchest;
	public static Item Swatboots;
	public static Item Swathelmet;
	
	public static Item GasSwatchest;
	public static Item GasSwatboots;
	public static Item GasSwathelmet;

	public static Item Tacticalchest;
	public static Item Tacticalboots;
	public static Item Tacticalhelmet;

	public static ItemAttachment<Weapon> Reflex;
	public static ItemAttachment<Weapon> Holo2;
	public static ItemAttachment<Weapon> Kobra;
	public static ItemAttachment<Weapon> ACOG;
	public static ItemAttachment<Weapon> Scope;
	public static ItemAttachment<Weapon> HP;
	public static ItemAttachment<Weapon> Silencer;
	public static ItemAttachment<Weapon> Laser;
	public static ItemAttachment<Weapon> Laser2;
	public static ItemAttachment<Weapon> Grip2;
	public static ItemAttachment<Weapon> Grip;
	public static ItemAttachment<Weapon> VGrip;
	public static ItemAttachment<Weapon> Bipod;

	public static ItemAttachment<Weapon> AKMIron;
	public static ItemAttachment<Weapon> AR15Iron;
	public static ItemAttachment<Weapon> Extra;
	public static ItemAttachment<Weapon> GlockTop;
	public static ItemAttachment<Weapon> G18Top;
	public static ItemAttachment<Weapon> M9Top;
	public static ItemAttachment<Weapon> P2000Top;
	public static ItemAttachment<Weapon> DeagleTop;
	public static ItemAttachment<Weapon> KSGPump;
	public static ItemAttachment<Weapon> L115Bolt1;
	public static ItemAttachment<Weapon> L115Bolt2;

	public static Item AK47;
	public static Item AKM;
	public static Item AK12;
	public static Item AK74U;
	public static Item AK74M;
	public static Item M4A1;
	public static Item M4A4;
	public static Item AR15;
	public static Item M16A3;
	public static Item M16A4;
	public static Item FNFAL;
	public static Item Scar;
	public static Item ScarH;
	public static Item G18;
	public static Item G21;
	public static Item M9;
	public static Item XEagle;
	public static Item P2000;
	public static Item Magnum;
	public static Item PX90;
	public static Item G36;
	public static Item G36C;
	public static Item AUG;
	public static Item Famas;
	public static Item FamasG2;
	public static Item MP5;
	public static Item MP5K;
	public static Item MP7;
	public static Item AS50;
	public static Item M14;
	public static Item M110;
	public static Item XWP;
	public static Item Dragonuv;
	public static Item M107;
	//public static Item GrenadeLauncher;
	public static Item Remington870;
	public static Item KSG12;
	public static Item M1014;
	public static Item SPAS12;
	//public static Item SPAS15;
	public static Item M240;
	public static Item M249;
	public static Item RPK74M;
	public static Item MG36;
	public static Item ACR;
	public static Item HK416C;
	public static Item M1Carbine;
	public static Item MP40;
	public static Item AN94;
	public static Item M1911;
	//public static Item GaussRifle;
//	public static Item RPG;

	public static ItemMagazine Magazine762x39;
	public static ItemMagazine AK12Mag;
	public static ItemMagazine RPK74MMag;
	public static ItemMagazine AK74MMag;
	public static ItemMagazine AKS74UMag;
	public static ItemMagazine NATOMag1;
	public static ItemMagazine NATOMag2;
	public static ItemMagazine NATOFamasMag;
	public static ItemMagazine NATOG36Mag;
	public static ItemMagazine DragunovMag;
	public static ItemMagazine FALMag;
	public static ItemMagazine M110Mag;
	public static ItemMagazine M14DMRMag;
	public static ItemMagazine Glock21Mag;
	public static ItemMagazine Glock18Mag;
	public static ItemMagazine NATODrum100;
	public static ItemMagazine M9BerettaMag;
	public static ItemMagazine MP40Mag;
	public static ItemMagazine MP5KMag;
	public static ItemMagazine DeagleMag;
	public static ItemMagazine AS50Mag;
	public static ItemMagazine FNP90Mag;
	public static ItemMagazine M107BMag;
	public static ItemMagazine HKMP7Mag;
	public static ItemMagazine M1CarbineMag;
	public static ItemMagazine M240Mag;
	public static ItemMagazine L115Mag;
	
	//public static ItemAmmo AK47Mag;
	public static ItemAmmo G18Mag;
	public static ItemAmmo M9Mag;
	public static ItemAmmo AR15Mag;
	public static ItemAmmo XWPMag;
	public static ItemAmmo DragonuvMag;
	public static ItemAmmo Remington870Mag;
	public static ItemAmmo PX90Mag;
	public static ItemAmmo G36CMag;
	public static ItemAmmo ScarMag;
	//public static ItemAmmo MP5Mag;
	//public static ItemAmmo AK74UMag;
	public static ItemAmmo MP7Mag;
	public static ItemAmmo MagnumAmmo;
	public static ItemAmmo FNFALMag;
	public static ItemAmmo M14Mag;
	//public static ItemAmmo Grenades;
	public static ItemAmmo M249Mag;
	public static ItemAmmo FamasMag;
	public static ItemAmmo G21Mag;
	public static ItemAmmo M107Mag;
	//public static ItemAmmo RPK74MMag;
	public static ItemAmmo DrumMag;
	public static ItemAmmo ScarHMag;
	public static ItemAmmo M1Mag;
	//public static ItemAmmo MP40Mag;
	//public static ItemAmmo M110Mag;
	//public static ItemAmmo SPAS15Mag;
	public static ItemAmmo M1911Mag;
	//public static ItemAmmo GaussMag;
	//public static ItemAmmo RPGAmmo;

	public static Item Bullets;
	public static Item Electronics;
	public static Item CGrip;
	public static Item OpticGlass;
	public static Item Cloth;
	public static Item TanCloth;
	public static Item GreenCloth;
	public static Item Inductor;
	public static Item Transistor;
	public static Item Resistor;
	public static Item Diode;
	public static Item Capacitor;
	public static Item CopperWiring;
	public static Item Piston;
	public static Item LaserPointer;

	public static Block TitaniumOre;
	public static Item TitaniumIngot;

	public static Block LeadOre;
	public static Item LeadIngot;

	public static Block CopperOre;
	public static Item CopperIngot;

	public static Block TinOre;
	public static Item TinIngot;

	public static Block SulfurOre;
	public static Item SulfurDust;
	
	public static Block BauxiteOre;
	public static Item AluminumIngot;
	public static Item AluminumPlate;
	
	public static Block SiliconOre;
	public static Item Silicon;
	
	public static Block TantalumOre;
	public static Item TantalumIngot;
	
	public static Block RubyOre;
	public static Item Ruby;
	
	public static Item SteelDust;
	public static Item SteelIngot;
	public static Item SteelPlate;
	public static Item MiniSteelPlate;
	
	public static Item WeaponStock;
	public static Item RetractableStock;
	public static Item SecondaryStock;
	public static Item WoodWeaponStock;
	public static Item WoodRifleStock;
	
	public static Item WeaponReceiver;
	public static Item SMGReceiver;
	public static Item UnderReceiver;
	public static Item RifleReceiver;
	public static Item PistolUnderReceiver;
	public static Item P90Receiver;
	
	public static Item RevolverAction;
	public static Item RevolverGrip;
	public static Item RevolverReceiver;
	
	public static Item ShotgunReceiver;
	public static Item ShotgunGrip;
	
	public static Item ScarReceiver;
	
	public static Item DeagleReceiver;
	
	public static Item LMGReceiver;
	
	public static Item Barrel;
	public static Item Plastic;

	static ArmorMaterial Marine = EnumHelper.addArmorMaterial("Marine", 40,
			new int[] { 3, 5, 4, 3 }, 15);
	static ArmorMaterial Tactical = EnumHelper.addArmorMaterial("Tactical", 40,
			new int[] { 2, 4, 3, 2 }, 15);

	// private ClientEventHandler clientEventHandler = new ClientEventHandler();

	public ModelBiped getArmorModel(int id) {
		return null;
	}

	protected boolean isClient() {
		return false;
	}

	public void preInit(Object mod, FMLPreInitializationEvent event) {

		ModernWarfareMod.MOD_CONTEXT.init(mod, ModernWarfareMod.CHANNEL);

		Bullets = new ItemBullets();
		Electronics = new ItemElectronics();
		CGrip = new ItemCGrip();
		OpticGlass = new ItemOpticGlass();
		Cloth = new ItemCloth();
		TanCloth = new ItemTanCloth();
		GreenCloth = new ItemGreenCloth();

		TitaniumOre = new BlockTitaniumOre();
		TitaniumIngot = new ItemTitaniumIngot();
		OreDictionary.registerOre("ingotTitanium", TitaniumIngot);

		LeadOre = new BlockLeadOre();
		LeadIngot = new ItemLeadIngot();
		OreDictionary.registerOre("ingotLead", LeadIngot);

		CopperOre = new BlockCopperOre();
		CopperIngot = new ItemCopperIngot();
		OreDictionary.registerOre("ingotCopper", CopperIngot);

		TinOre = new BlockTinOre();
		TinIngot = new ItemTinIngot();
		OreDictionary.registerOre("ingotTin", TinIngot);

		SulfurOre = new BlockSulfurOre();
		SulfurDust = new ItemSulfurDust();
		OreDictionary.registerOre("ingotSulfurDust", SulfurDust);
		
		BauxiteOre = new BlockBauxiteOre();
		AluminumIngot = new ItemAluminumIngot();
		AluminumPlate = new ItemAluminumPlate();
		OreDictionary.registerOre("ingotAluminum", AluminumIngot);
		
		RubyOre = new BlockRubyOre();
		Ruby = new  ItemRuby();
		OreDictionary.registerOre("Ruby", Ruby);
		
		SiliconOre = new BlockSiliconOre();
		Silicon = new ItemSilicon();
		
		TantalumOre = new BlockTantalumOre();
		TantalumIngot = new ItemTantalumIngot();
		
		SteelDust = new ItemSteelDust();
		SteelIngot = new ItemSteelIngot();
		SteelPlate = new ItemSteelPlate();
		MiniSteelPlate = new ItemMiniSteelPlate();
		OreDictionary.registerOre("ingotSteel", SteelIngot);
		
		ItemBullet sampleBullet = new ItemBullet.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withCreativeTab(ModernWarfareMod.gunsTab)
			.withName("samplebullet")
			.withTextureName("samplebullet")
			.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);

		Magazine762x39 = new ItemMagazine.Builder()
			    .withAmmo(30)
			    .withCompatibleBullet(sampleBullet)
				.withName("Magazine762x39")
				.withModId(ModernWarfareMod.MODID)
				.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.Magazine762x39())
				.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -0.7F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-1F, -0.7F, 0.8F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.2F, 0.4F);
					GL11.glRotatef(-120F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 1f, 0f, 0f);
					GL11.glRotatef(-30F, 0f, 0f, 1f);
					GL11.glScaled(0.9F, 0.9F, 0.9f);
				})
				.withTextureName("GunmetalTexture.png")
				.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		
		AK12Mag = new ItemMagazine.Builder()
		.withAmmo(31)
		        .withName("AK12Mag")
		        .withModId(ModernWarfareMod.MODID)
		        .withCreativeTab(ModernWarfareMod.gunsTab)
		        .withModel(new com.vicmatskiv.mw.models.AK12Mag())
		        .withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -0.7F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-1F, -0.5F, 0.8F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.6F, -0.15F, 0.4F);
					GL11.glRotatef(-120F, 0f, 1f, 0f);
					GL11.glRotatef(-10F, 1f, 0f, 0f);
					GL11.glRotatef(-30F, 0f, 0f, 1f);
					GL11.glScaled(0.9F, 0.9F, 0.9f);
				})
		        .withTextureName("GunmetalTexture.png")
		        .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		RPK74MMag = new ItemMagazine.Builder()
		.withAmmo(40)
		.withName("RPK74MMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.RPK74MMag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.7F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.85F, -0.35F, 0.4F);
			GL11.glRotatef(-120F, 0f, 1f, 0f);
			GL11.glRotatef(-10F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(0.8F, 0.8F, 0.8f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		AK74MMag = new ItemMagazine.Builder()
		.withAmmo(30)
		.withName("AK74MMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.AK12Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.7F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.6F, -0.2F, 0.4F);
			GL11.glRotatef(-120F, 0f, 1f, 0f);
			GL11.glRotatef(-10F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(0.9F, 0.9F, 0.9f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		AKS74UMag = new ItemMagazine.Builder()
		.withAmmo(30)
		.withName("AKS74UMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.Magazine762x39())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.7F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.8F, -0.2F, 0.4F);
			GL11.glRotatef(-120F, 0f, 1f, 0f);
			GL11.glRotatef(-10F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(0.9F, 0.9F, 0.9f);
		})
		.withTextureName("AKS74UMag.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATOMag1 = new ItemMagazine.Builder()
		.withAmmo(30)
		.withName("NATOMag1")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATOMag1())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.4F, 0F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("NATOMag1.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATOMag2 = new ItemMagazine.Builder()
		.withAmmo(30)
		.withName("NATOMag2")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATOMag2())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.4F, 0F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("NATOMag2.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATOFamasMag = new ItemMagazine.Builder()
		.withAmmo(30)
		.withName("NATOFamasMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATOFamasMag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.3F, 0.1F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("NATOMag1.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATOG36Mag = new ItemMagazine.Builder()
		.withAmmo(30)
		.withName("NATOG36Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATOG36Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.2F, 0.2F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		DragunovMag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withName("DragunovMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.DragunovMag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.3F, 0.4F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		FALMag = new ItemMagazine.Builder()
		.withAmmo(20)
		.withName("FALMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.FNFALMag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.2F, 0.2F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M110Mag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withName("M110Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M110Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.25F, 0.1F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("NATOMag1.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M14DMRMag = new ItemMagazine.Builder()
		.withAmmo(20)
		.withName("M14DMRMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M14Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.4F, 0.3F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		Glock21Mag = new ItemMagazine.Builder()
		.withAmmo(13)
		.withName("Glock21Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.GlockMagazine())

		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.6F, -0.3F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		Glock18Mag = new ItemMagazine.Builder()
		.withAmmo(20)
		.withName("Glock18Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.GlockMagazine())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.6F, -0.3F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M9BerettaMag = new ItemMagazine.Builder()
		.withAmmo(15)
		.withName("M9BerettaMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M9Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.7F, -0.5F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("M9Mag.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATODrum100 = new ItemMagazine.Builder()
		.withAmmo(100)
		.withName("NATODrum100")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATODrum100())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.5F, 0.4F, 0.4F);
			GL11.glRotatef(-30F, 0f, 1f, 0f);
			GL11.glRotatef(10F, 1f, 0f, 0f);
			GL11.glRotatef(0F, 0f, 0f, 1f);
			GL11.glScaled(0.9F, 0.9F, 0.9f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		MP40Mag = new ItemMagazine.Builder()
		.withAmmo(32)
		.withName("MP40Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.MP40Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -1.3F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.2F, 0F, -1.3F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(0.9F, 0.9F, 0.9f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		MP5KMag = new ItemMagazine.Builder()
		.withAmmo(25)
		.withName("MP5KMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.MP5Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.4F, 0F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		DeagleMag = new ItemMagazine.Builder()
		.withAmmo(9)
		.withName("DeagleMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.DeagleMag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.7F, -0.5F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("Deagle.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		AS50Mag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withName("AS50Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.AS50Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.9F, 0.2F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("NATOMag1.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		FNP90Mag = new ItemMagazine.Builder()
		.withAmmo(50)
		.withName("FNP90Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.P90Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.3F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(10F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(0.3F, 1.2F, 0.4F);
			GL11.glRotatef(-170F, 0f, 1f, 0f);
			GL11.glRotatef(10F, 1f, 0f, 0f);
			GL11.glRotatef(0F, 0f, 0f, 1f);
			GL11.glScaled(0.9F, 0.9F, 0.9f);
		})
		.withTextureName("P90Mag.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M107BMag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withName("M107BMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M107Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.9F, -0.1F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		HKMP7Mag = new ItemMagazine.Builder()
		.withAmmo(20)
		.withName("HKMP7Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.MP7Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(1F, -0F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(0.9F, 0.9F, 0.9f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M1CarbineMag = new ItemMagazine.Builder()
		.withAmmo(15)
		.withName("M1CarbineMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M14Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.4F, 0.3F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(-20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1F, 1F, 1f);
		})
		.withTextureName("GunmetalTexture.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M240Mag = new ItemMagazine.Builder()
		.withAmmo(200)
		.withName("M240Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M240Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.2F, 0.3F, 0.4F);
			GL11.glRotatef(-180F, 0f, 1f, 0f);
			GL11.glRotatef(-10F, 1f, 0f, 0f);
			GL11.glRotatef(-10F, 0f, 0f, 1f);
			GL11.glScaled(1.2F, 1.2F, 1.2f);
		})
		.withTextureName("M240Mag.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		L115Mag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withName("LP115Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.L115Mag())
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.1F, -0.7F, 0.4F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1F, -0.5F, 0.8F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-0.2F, 0.3F, 0.4F);
			GL11.glRotatef(-180F, 0f, 1f, 0f);
			GL11.glRotatef(-10F, 1f, 0f, 0f);
			GL11.glRotatef(-10F, 0f, 0f, 1f);
			GL11.glScaled(1.2F, 1.2F, 1.2f);
		})
		.withTextureName("AK12.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		//AK47Mag = new ItemAK47Mag();
		G18Mag = new ItemG18Mag();
		M9Mag = new ItemM9Mag();
		AR15Mag = new ItemAR15Mag();
		XWPMag = new ItemXWPMag();
		DragonuvMag = new ItemDragonuvMag();
		Remington870Mag = new ItemRemington870Mag();
		PX90Mag = new ItemPX90Mag();
		G36CMag = new ItemG36CMag();
		ScarMag = new ItemScarMag();
		//MP5Mag = new ItemMP5Mag();
		//AK74UMag = new ItemAK74UMag();
		MP7Mag = new ItemMP7Mag();
		MagnumAmmo = new ItemMagnumAmmo();
		FNFALMag = new ItemFNFALMag();
		M14Mag = new ItemM14Mag();
		//Grenades = new ItemGrenades();
		M249Mag = new ItemM249Mag();
		FamasMag = new ItemFamasMag();
		G21Mag = new ItemG21Mag();
		M107Mag = new ItemM107Mag();
		//RPK74MMag = new ItemRPK74MMag();
		DrumMag = new ItemDrumMag();
		ScarHMag = new ItemScarHMag();
		M1Mag = new ItemM1Mag();
		//MP40Mag = new ItemMP40Mag();
		//M110Mag = new ItemM110Mag();
		//SPAS15Mag = new ItemSPAS15Mag();
		M1911Mag = new ItemM1911Mag();
		//GaussMag = new ItemGaussMag();
	//	RPGAmmo = new ItemRPGAmmo();

		Reflex = new ItemReflex();
		Holo2 = new ItemHolo2();
		Kobra = new ItemKobra();
		ACOG = new ItemACOG();
		Scope = new ItemScope();
		HP = new ItemHP();
		Silencer = new ItemSilencer();
		Laser = new ItemLaser();
		Laser2 = new ItemLaser2();
		Grip2 = new ItemGrip2();
		Grip = new ItemGrip();
		VGrip = new ItemVGrip();
		Bipod = new ItemBipod();

		AKMIron = new ItemAKMIron();
		AR15Iron = new ItemAR15Iron();
		Extra = new ItemExtra();
		
		GlockTop = new AttachmentBuilder<Weapon>()
			.withCategory(AttachmentCategory.EXTRA)
			//.withCreativeTab(ModernWarfareMod.gunsTab)
			.withModel(new com.vicmatskiv.mw.models.GlockTop(), "GlockTop.png")
			.withName("GlockTop")
			.withRenderablePart()
			.withModId(ModernWarfareMod.MODID)
			.build(ModernWarfareMod.MOD_CONTEXT);
		G18Top = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.GlockTop(), "G18Top.png")
				.withName("G18Top")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		M9Top = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.M9Top(), "M9Top.png")
				.withName("M9Top")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		P2000Top = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.P2000Top(), "P2000Top.png")
				.withName("P2000Top")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		DeagleTop = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.DeagleTop(), "Deagle.png")
				.withName("DeagleTop")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		KSGPump = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.KSG12Pump(), "GunmetalTexture.png")
				.withName("KSGPump")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		L115Bolt1 = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA2)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.L115Bolt1(), "AK12.png")
				.withName("LP115Bolt")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		L115Bolt2 = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA3)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.L115Bolt2(), "AK12.png")
				.withName("LP115Bolt2")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.build(ModernWarfareMod.MOD_CONTEXT);

		AK47 = new AK47Factory().createGun(this);
		AKM = new AKMFactory().createGun(this);
		AK12 = new AK12Factory().createGun(this);
		AN94 = new AN94Factory().createGun(this);
		AK74U = new AK74UFactory().createGun(this);
		AK74M = new AK74MFactory().createGun(this);
		M4A1 = new M4A1Factory().createGun(this);
		AR15 = new AR15Factory().createGun(this);
		M4A4 = new M4A4Factory().createGun(this);
		M16A3 = new M16A3Factory().createGun(this);
		M16A4 = new M16A4Factory().createGun(this);
		HK416C = new HK416CFactory().createGun(this);
		ACR = new ACRFactory().createGun(this);
		Scar = new ScarFactory().createGun(this);
		ScarH = new ScarHFactory().createGun(this);
		FNFAL = new FNFALFactory().createGun(this);
		M1Carbine = new M1CarbineFactory().createGun(this);
		G18 = new G18Factory().createGun(this);
		G21 = new G21Factory().createGun(this);
		M9 = new M9Factory().createGun(this);
		XEagle = new XEagleFactory().createGun(this);
		P2000 = new P2000Factory().createGun(this);
		Magnum = new MagnumFactory().createGun(this);
		M1911 = new M1911Factory().createGun(this);
		Remington870 = new Remington900Factory().createGun(this);
		KSG12 = new KSG12Factory().createGun(this);
		M1014 = new M1014Factory().createGun(this);
		SPAS12 = new SPAS12Factory().createGun(this);
		//SPAS15 = new SPAS15Factory().createGun(this);
		G36 = new G36Factory().createGun(this);
		G36C = new G36CFactory().createGun(this);
		AUG = new AUGFactory().createGun(this);
		Famas = new FamasFactory().createGun(this);
		FamasG2 = new FamasG2Factory().createGun(this);
		MP5 = new MP5Factory().createGun(this);
		MP5K = new MP5KFactory().createGun(this);
		MP7 = new MP7Factory().createGun(this);
		PX90 = new PX90Factory().createGun(this);
		MP40 = new MP40Factory().createGun(this);
		AS50 = new AS50Factory().createGun(this);
		XWP = new XWPFactory().createGun(this);
		Dragonuv = new DragonuvFactory().createGun(this);
		M14 = new M14Factory().createGun(this);
		M110 = new M110Factory().createGun(this);
		M107 = new M107Factory().createGun(this);
		M240 = new M240Factory().createGun(this);
		M249 = new M249Factory().createGun(this);
		MG36 = new MG36Factory().createGun(this);
		RPK74M = new RPK74MFactory().createGun(this);
		//GrenadeLauncher = new GrenadeLauncherFactory().createGun(this);
		//GaussRifle = new GaussRifleFactory().createGun(this);
	//	RPG = new RPGFactory().createGun(this);
		
		WeaponStock = new ItemWeaponStock();
		RetractableStock = new ItemRetractableStock();
		SecondaryStock = new ItemSecondaryStock();
		WoodWeaponStock = new ItemWoodWeaponStock();
		WoodRifleStock = new ItemWoodRifleStock();
		
		WeaponReceiver = new ItemWeaponReceiver();
		SMGReceiver = new ItemSMGReceiver();
		UnderReceiver = new ItemUnderReceiver();
		RifleReceiver = new ItemRifleReceiver();
		PistolUnderReceiver = new ItemPistolUnderReceiver();
		P90Receiver = new ItemP90Receiver();
		
		RevolverAction = new ItemRevolverAction();
		RevolverGrip = new ItemRevolverGrip();
		RevolverReceiver = new ItemRevolverReceiver();
		
		ShotgunReceiver = new ItemShotgunReceiver();
		ShotgunGrip = new ItemShotgunGrip();
		
		ScarReceiver = new ItemScarReceiver();
		
		DeagleReceiver = new ItemDeagleReceiver();
		
		LMGReceiver = new ItemLMGReceiver();
		
		Inductor = new ItemInductor();
		Resistor = new ItemResistor();
		Transistor = new ItemTransistor();
		Diode = new ItemDiode();
		Capacitor = new ItemCapacitor();
		CopperWiring = new ItemCopperWiring();
		Piston = new ItemPiston();
		LaserPointer = new ItemLaserPointer();
		
		Barrel = new ItemBarrel();
		Plastic = new ItemPlastic();
		
//		GameRegistry.registerItem(AK12Mag, "AK12Mag");
//		GameRegistry.registerItem(RPK74MMag, "RPK74MMag");
//		GameRegistry.registerItem(AK74Mag, "AK74Mag");
//		GameRegistry.registerItem(AKS74UMag, "AKS74UMag");
//		GameRegistry.registerItem(NATOMag1, "NATOMag1");
//		GameRegistry.registerItem(NATOMag2, "NATOMag2");
//		GameRegistry.registerItem(NATOFamasMag, "NATOFamasMag");
//		GameRegistry.registerItem(NATOG36Mag, "NATOG36Mag");
//		GameRegistry.registerItem(DragunovMag, "DragunovMag");
//		GameRegistry.registerItem(FALMag, "FALMag");
//		GameRegistry.registerItem(M110Mag, "M110Mag");
//		GameRegistry.registerItem(M14DMRMag, "M14DMRMag");
		
		//GameRegistry.registerItem(AK47Mag, "AK47Mag");
		GameRegistry.registerItem(G18Mag, "G18Mag");
		GameRegistry.registerItem(M9Mag, "M9Mag");
		GameRegistry.registerItem(AR15Mag, "AR15Mag");
		GameRegistry.registerItem(XWPMag, "XWPMag");
		GameRegistry.registerItem(DragonuvMag, "DragonuvMag");
		GameRegistry.registerItem(Remington870Mag, "Remington870Mag");
		GameRegistry.registerItem(PX90Mag, "PX90Mag");
		GameRegistry.registerItem(G36CMag, "G36CMag");
		GameRegistry.registerItem(ScarMag, "ScarMag");
		//GameRegistry.registerItem(MP5Mag, "MP5Mag");
		//GameRegistry.registerItem(AK74UMag, "AK74UMag");
		GameRegistry.registerItem(MP7Mag, "MP7Mag");
		GameRegistry.registerItem(MagnumAmmo, "MagnumAmmo");
		GameRegistry.registerItem(FNFALMag, "FNFALMag");
		GameRegistry.registerItem(M14Mag, "M14Mag");
		//GameRegistry.registerItem(Grenades, "Grenades");
		GameRegistry.registerItem(M249Mag, "M249Mag");
		GameRegistry.registerItem(FamasMag, "FamasMag");
		GameRegistry.registerItem(G21Mag, "G21Mag");
		GameRegistry.registerItem(M107Mag, "M107Mag");
		//GameRegistry.registerItem(RPK74MMag, "RPK74MMag");
		GameRegistry.registerItem(DrumMag, "DrumMag");
		GameRegistry.registerItem(ScarHMag, "ScarHMag");
		GameRegistry.registerItem(M1Mag, "M1Mag");
		//GameRegistry.registerItem(MP40Mag, "MP40Mag");
		//GameRegistry.registerItem(M110Mag, "M110Mag");
		//GameRegistry.registerItem(SPAS15Mag, "SPAS15Mag");
		GameRegistry.registerItem(M1911Mag, "M1911Mag");
	//	GameRegistry.registerItem(GaussMag, "GaussMag");
	//	GameRegistry.registerItem(RPGAmmo, "RPGAmmo");

		GameRegistry.registerItem(ACOG, "ACOG");
		GameRegistry.registerItem(Reflex, "Reflex");
		GameRegistry.registerItem(Scope, "Scope");
		GameRegistry.registerItem(Silencer, "Silencer");
		GameRegistry.registerItem(Laser, "Laser");
		GameRegistry.registerItem(HP, "HP");
		GameRegistry.registerItem(Holo2, "Holo2");
		GameRegistry.registerItem(Grip2, "Grip2");
		GameRegistry.registerItem(Bipod, "Bipod");
		GameRegistry.registerItem(Laser2, "Laser2");
		GameRegistry.registerItem(Grip, "Grip");
		GameRegistry.registerItem(VGrip, "VGrip");
		GameRegistry.registerItem(Kobra, "Kobra");

		GameRegistry.registerItem(AKMIron, "AKMIron");
		GameRegistry.registerItem(AR15Iron, "AR15Iron");
		GameRegistry.registerItem(Extra, "Extra");

		GameRegistry.registerItem(Bullets, "Bullets");
		GameRegistry.registerItem(Electronics, "Electronics");
		GameRegistry.registerItem(CGrip, "CGrip");
		GameRegistry.registerItem(OpticGlass, "OpticGlass");
		GameRegistry.registerItem(Cloth, "Cloth");
		GameRegistry.registerItem(TanCloth, "TanCloth");
		GameRegistry.registerItem(GreenCloth, "GreenCloth");

		GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
		GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");

		GameRegistry.registerBlock(LeadOre, "LeadOre");
		GameRegistry.registerItem(LeadIngot, "LeadIngot");

		GameRegistry.registerBlock(CopperOre, "CopperOre");
		GameRegistry.registerItem(CopperIngot, "CopperIngot");

		GameRegistry.registerBlock(TinOre, "TinOre");
		GameRegistry.registerItem(TinIngot, "TinIngot");

		GameRegistry.registerBlock(SulfurOre, "SulfurOre");
		GameRegistry.registerItem(SulfurDust, "SulfurDust");
		
		GameRegistry.registerBlock(BauxiteOre, "BauxiteOre");
		GameRegistry.registerItem(AluminumIngot, "AluminumIngot");
		GameRegistry.registerItem(AluminumPlate, "AluminumPlate");
		
		GameRegistry.registerBlock(SiliconOre, "SiliconOre");
		GameRegistry.registerItem(Silicon, "Silicon");
		
		GameRegistry.registerBlock(TantalumOre, "TantalumOre");
		GameRegistry.registerItem(TantalumIngot, "TantalumIngot");
		
		GameRegistry.registerBlock(RubyOre, "RubyOre");
		GameRegistry.registerItem(Ruby, "Ruby");
		
		GameRegistry.registerItem(SteelDust, "SteelDust");
		GameRegistry.registerItem(SteelIngot, "SteelIngot");
		GameRegistry.registerItem(SteelPlate, "SteelPlate");
		GameRegistry.registerItem(MiniSteelPlate, "MiniSteelPlate");
		
		GameRegistry.registerItem(WeaponStock, "WeaponStock");
		GameRegistry.registerItem(RetractableStock, "RetractableStock");
		GameRegistry.registerItem(SecondaryStock, "SecondaryStock");
		GameRegistry.registerItem(WoodWeaponStock, "WoodWeaponStock");
		GameRegistry.registerItem(WoodRifleStock, "WoodRifleStock");
		
		GameRegistry.registerItem(WeaponReceiver, "WeaponReceiver");
		GameRegistry.registerItem(SMGReceiver, "SMGReceiver");
		GameRegistry.registerItem(UnderReceiver, "UnderReceiver");
		GameRegistry.registerItem(RifleReceiver, "RifleReceiver");
		GameRegistry.registerItem(PistolUnderReceiver, "PistolUnderReceiver");
		GameRegistry.registerItem(P90Receiver, "P90Receiver");
		
		GameRegistry.registerItem(RevolverAction, "RevolverAction");
		GameRegistry.registerItem(RevolverGrip, "RevolverGrip");
		GameRegistry.registerItem(RevolverReceiver, "RevolverReceiver");
		
		GameRegistry.registerItem(ShotgunReceiver, "ShotgunReceiver");
		GameRegistry.registerItem(ShotgunGrip, "ShotgunGrip");
		
		GameRegistry.registerItem(ScarReceiver, "ScarReceiver");
		
		GameRegistry.registerItem(DeagleReceiver, "DeagleReceiver");
		
		GameRegistry.registerItem(LMGReceiver, "LMGReceiver");
		
		GameRegistry.registerItem(Transistor, "Transistor");
		GameRegistry.registerItem(Resistor, "Resistor");
		GameRegistry.registerItem(Inductor, "Inductor");
		GameRegistry.registerItem(Diode, "Diode");
		GameRegistry.registerItem(Capacitor, "Capacitor");
		GameRegistry.registerItem(CopperWiring, "CopperWiring");
		GameRegistry.registerItem(Piston, "Piston");
		GameRegistry.registerItem(LaserPointer, "LaserPointer");
		
		GameRegistry.registerItem(Barrel, "Barrel");
		GameRegistry.registerItem(Plastic, "plastic");

		GameRegistry.registerWorldGenerator(new WorldGeneratorEventHandler(ModernWarfareMod.oreGenerationEnabled), 0);

		Builder marineArmorBuilder = new CustomArmor.Builder()
				.withModId(ModernWarfareMod.MODID).withMaterial(Marine)
				.withUnlocalizedName("Marine").withTextureName("Marine")
				.withModelClass("com.vicmatskiv.mw.models.Marine")
				.withHudTextureName("Marine");

		Marinehelmet = marineArmorBuilder.buildHelmet(isClient());
		Marinechest = marineArmorBuilder.buildChest(isClient());
		Marineboots = marineArmorBuilder.buildBoots(isClient());

		Builder spetznazArmorBuilder = new CustomArmor.Builder()
				.withModId(ModernWarfareMod.MODID).withMaterial(Marine)
				.withUnlocalizedName("Spetznaz").withTextureName("Spetznaz")
				.withModelClass("com.vicmatskiv.mw.models.Marine")
				.withHudTextureName("Marine");

		Spetznazhelmet = spetznazArmorBuilder.buildHelmet(isClient());
		Spetznazchest = spetznazArmorBuilder.buildChest(isClient());
		Spetznazboots = spetznazArmorBuilder.buildBoots(isClient());

		Builder swatArmorBuilder = new CustomArmor.Builder()
				.withModId(ModernWarfareMod.MODID).withMaterial(Marine)
				.withUnlocalizedName("Swat").withTextureName("Swat")
				.withModelClass("com.vicmatskiv.mw.models.Swat")
				.withHudTextureName("Marine");

		Swathelmet = swatArmorBuilder.buildHelmet(isClient());
		Swatchest = swatArmorBuilder.buildChest(isClient());
		Swatboots = swatArmorBuilder.buildBoots(isClient());
		
		//Builder gasswatArmorBuilder = new CustomArmor.Builder()
		//.withModId(ModernWarfareMod.MODID).withMaterial(Marine)
		//.withUnlocalizedName("GasSwat").withTextureName("GasSwat")
		//.withModelClass("com.vicmatskiv.mw.models.GasSwat")
		//.withHudTextureName("Marine");

		//GasSwathelmet = gasswatArmorBuilder.buildHelmet(isClient());
		//GasSwatchest = gasswatArmorBuilder.buildChest(isClient());
		//GasSwatboots = gasswatArmorBuilder.buildBoots(isClient());

		new CustomArmor.Builder().withModId(ModernWarfareMod.MODID)
				.withMaterial(Tactical).withUnlocalizedName("Tactical")
				.withTextureName("Tactical")
				.withModelClass("com.vicmatskiv.mw.models.Tactical")
				.withHudTextureName("Tactical").build(isClient());

	}

}
