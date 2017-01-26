package com.vicmatskiv.mw;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.attachments.ItemAKMIron;
import com.vicmatskiv.mw.attachments.ItemAR15Iron;
import com.vicmatskiv.mw.attachments.ItemBipod;
import com.vicmatskiv.mw.blocks.BlockBauxiteOre;
import com.vicmatskiv.mw.blocks.BlockCopperOre;
import com.vicmatskiv.mw.blocks.BlockLeadOre;
import com.vicmatskiv.mw.blocks.BlockRubyOre;
import com.vicmatskiv.mw.blocks.BlockSiliconOre;
import com.vicmatskiv.mw.blocks.BlockSulfurOre;
import com.vicmatskiv.mw.blocks.BlockTantalumOre;
import com.vicmatskiv.mw.blocks.BlockTinOre;
import com.vicmatskiv.mw.blocks.BlockTitaniumOre;
import com.vicmatskiv.mw.items.ItemLaserPointer;
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
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
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
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.LaserBeamRenderer;
import com.vicmatskiv.weaponlib.Weapon;


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
	public static ItemAttachment<Weapon> RevolverCase;
	public static ItemAttachment<Weapon> R870Pump;
	public static ItemAttachment<Weapon> M1911Top;
	
	public static ItemBullet ShotgunShell;
	public static ItemBullet Magnum44Ammo;
	public static ItemBullet Bullet762x39;
	public static ItemBullet Bullet556x39;
	public static ItemBullet Bullet556x45;
	public static ItemBullet Bullet762x54;
	public static ItemBullet Bullet762x51;
	public static ItemBullet Bullet45ACP;
	public static ItemBullet Bullet9mm;
	public static ItemBullet Bullet357;
	public static ItemBullet BMG50;
	public static ItemBullet Bullet57x28;
	public static ItemBullet Bullet46x30;
	public static ItemBullet Carbine30;

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
	public static ItemMagazine ColtM1911Mag;
	public static ItemMagazine M249Mag;

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

	static ArmorMaterial Marine = EnumHelper.addArmorMaterial("Marine", "Marine", 40, 
			new int[] { 3, 5, 4, 3 }, 15, null, 0); // TODO: last argument, how does it work?
	static ArmorMaterial Tactical = EnumHelper.addArmorMaterial("Tactical", "Tactical", 40,
			new int[] { 2, 4, 3, 2 }, 15, null, 0); // TODO: last argument, how does it work?

	// private ClientEventHandler clientEventHandler = new ClientEventHandler();

	public ModelBiped getArmorModel(int id) {
		return null;
	}

	protected boolean isClient() {
		return false;
	}

	public void init(Object mod, FMLInitializationEvent event) {
		

		ModernWarfareMod.MOD_CONTEXT.init(mod, ModernWarfareMod.MODID, ModernWarfareMod.CHANNEL);
		
		

		Bullets = new ItemBullets();
		Electronics = new ItemElectronics();
		CGrip = new ItemCGrip();
		OpticGlass = new ItemOpticGlass();
		Cloth = new ItemCloth();
		TanCloth = new ItemTanCloth();
		GreenCloth = new ItemGreenCloth();

		TitaniumOre = new BlockTitaniumOre();
		TitaniumIngot = new ItemTitaniumIngot();

		LeadOre = new BlockLeadOre();
		LeadIngot = new ItemLeadIngot();

		CopperOre = new BlockCopperOre();
		CopperIngot = new ItemCopperIngot();

		TinOre = new BlockTinOre();
		TinIngot = new ItemTinIngot();

		SulfurOre = new BlockSulfurOre();
		SulfurDust = new ItemSulfurDust();
		
		BauxiteOre = new BlockBauxiteOre();
		AluminumIngot = new ItemAluminumIngot();
		AluminumPlate = new ItemAluminumPlate();
		
		RubyOre = new BlockRubyOre();
		Ruby = new  ItemRuby();
		
		SiliconOre = new BlockSiliconOre();
		Silicon = new ItemSilicon();
		
		TantalumOre = new BlockTantalumOre();
		TantalumIngot = new ItemTantalumIngot();
		
		SteelDust = new ItemSteelDust();
		SteelIngot = new ItemSteelIngot();
		SteelPlate = new ItemSteelPlate();
		MiniSteelPlate = new ItemMiniSteelPlate();
		
		ShotgunShell = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("ShotgunShell")
		.withModel(new com.vicmatskiv.mw.models.ShotgunShell(), "ShotgunShell.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1.2F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.8F, 0.8F, 0.8F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.7F, 0.7F, 0.7F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.6F, 1.6F, 1.6f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Magnum44Ammo = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Magnum44Ammo")
		.withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.4F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.3F, 0.3F, 0.3F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.6F, 1.6F, 1.6f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Carbine30 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Carbine30")
		.withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.6F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.3F, 0.5F, 0.3F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.6F, 1.8F, 1.6f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet357 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet357")
		.withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet44.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.6F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.3F, 0.5F, 0.3F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.6F, 1.8F, 1.6f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet9mm = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet9mm")
		.withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.4F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.3F, 0.3F, 0.3F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.6F, 1.6F, 1.6f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet45ACP = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet45ACP")
		.withModel(new com.vicmatskiv.mw.models.Bullet44(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.4F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.3F, 0.3F, 0.3F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.6F, 1.6F, 1.6f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet762x39 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet762x39")
		.withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.4F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.5F, 0.6F, 0.5F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.4F, 1.4F, 1.4f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet46x30 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet46x30")
		.withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.4F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.5F, 0.6F, 0.5F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.4F, 1.4F, 1.4f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet57x28 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet57x28")
		.withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.4F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.5F, 0.6F, 0.5F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.4F, 1.4F, 1.4f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet556x39 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet556x39")
		.withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.3F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.5F, 0.45F, 0.5F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.4F, 1.3F, 1.4f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet556x45 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet556x45")
		.withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.4F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.5F, 0.5F, 0.5F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.4F, 1.4F, 1.4f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet762x54 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet762x54")
		.withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.5F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.5F, 0.6F, 0.5F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.4F, 1.5F, 1.4f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		Bullet762x51 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("Bullet762x51")
		.withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.45F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.5F, 0.55F, 0.5F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.4F, 1.45F, 1.4f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);
		
		BMG50 = new ItemBullet.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withName("BMG50")
		.withModel(new com.vicmatskiv.mw.models.BulletBig(), "Bullet.png")
		.withFirstPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(0.1F, -1F, 0.4F);
					GL11.glRotatef(30F, 0f, 1f, 0f);
					GL11.glScaled(0.4F, 0.7F, 0.4F);
				})
				.withThirdPersonPositioning((player, itemStack) -> {
					GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
					GL11.glRotatef(-50F, 0f, 1f, 0f);
					GL11.glRotatef(80F, 1f, 0f, 0f);
					GL11.glScaled(0.5F, 0.7F, 0.5F);
				})
				.withInventoryPositioning((itemStack) -> {
					GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
					GL11.glRotatef(10F, 0f, 1f, 0f);
					GL11.glRotatef(2F, 1f, 0f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glScaled(1.4F, 1.8F, 1.4f);
				})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemBullet.class);


		Magazine762x39 = new ItemMagazine.Builder()
			    .withAmmo(30)
			    .withCompatibleBullet(Bullet762x39)
				.withName("Magazine762x39")
				.withModId(ModernWarfareMod.MODID)
				.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.Magazine762x39(), "GunmetalTexture.png")
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
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		
		AK12Mag = new ItemMagazine.Builder()
				.withAmmo(31)
				.withCompatibleBullet(Bullet556x39)
		        .withName("AK12Mag")
		        .withModId(ModernWarfareMod.MODID)
		        .withCreativeTab(ModernWarfareMod.gunsTab)
		        .withModel(new com.vicmatskiv.mw.models.AK12Mag(), "GunmetalTexture.png")
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
		        .withTextureName("Dummy.png")
		        .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		RPK74MMag = new ItemMagazine.Builder()
		.withAmmo(40)
		.withCompatibleBullet(Bullet762x39)
		.withName("RPK74MMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.RPK74MMag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		AK74MMag = new ItemMagazine.Builder()
		.withAmmo(30)
		.withCompatibleBullet(Bullet556x39)
		.withName("AK74MMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.AK12Mag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		AKS74UMag = new ItemMagazine.Builder()
		.withAmmo(30)
		.withCompatibleBullet(Bullet556x39)
		.withName("AKS74UMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.Magazine762x39(), "AKS74UMag.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATOMag1 = new ItemMagazine.Builder()
		.withAmmo(30)
		.withCompatibleBullet(Bullet556x45)
		.withName("NATOMag1")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATOMag1(), "NATOMag1.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATOMag2 = new ItemMagazine.Builder()
		.withAmmo(30)
		.withCompatibleBullet(Bullet556x45)
		.withName("NATOMag2")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATOMag2(), "NATOMag2.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATOFamasMag = new ItemMagazine.Builder()
		.withAmmo(30)
		.withCompatibleBullet(Bullet556x45)
		.withName("NATOFamasMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATOFamasMag(), "NATOMag1.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATOG36Mag = new ItemMagazine.Builder()
		.withAmmo(30)
		.withCompatibleBullet(Bullet556x45)
		.withName("NATOG36Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATOG36Mag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		DragunovMag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withCompatibleBullet(Bullet762x54)
		.withName("DragunovMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.DragunovMag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		FALMag = new ItemMagazine.Builder()
		.withAmmo(20)
		.withCompatibleBullet(Bullet762x51)
		.withName("FALMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.FNFALMag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M110Mag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withCompatibleBullet(Bullet762x51)
		.withName("M110Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M110Mag(), "NATOMag1.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M14DMRMag = new ItemMagazine.Builder()
		.withAmmo(20)
		.withCompatibleBullet(Bullet762x51)
		.withName("M14DMRMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M14Mag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		Glock21Mag = new ItemMagazine.Builder()
		.withAmmo(13)
		.withCompatibleBullet(Bullet45ACP)
		.withName("Glock21Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "GunmetalTexture.png")

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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		Glock18Mag = new ItemMagazine.Builder()
		.withAmmo(17)
		.withCompatibleBullet(Bullet9mm)
		.withName("Glock18Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M9BerettaMag = new ItemMagazine.Builder()
		.withAmmo(15)
		.withCompatibleBullet(Bullet9mm)
		.withName("M9BerettaMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M9Mag(), "M9Mag.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		NATODrum100 = new ItemMagazine.Builder()
		.withAmmo(100)
		.withCompatibleBullet(Bullet556x45)
		.withName("NATODrum100")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.NATODrum100(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		MP40Mag = new ItemMagazine.Builder()
		.withAmmo(32)
		.withCompatibleBullet(Bullet9mm)
		.withName("MP40Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.MP40Mag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		MP5KMag = new ItemMagazine.Builder()
		.withAmmo(25)
		.withCompatibleBullet(Bullet9mm)
		.withName("MP5KMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.MP5Mag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		DeagleMag = new ItemMagazine.Builder()
		.withAmmo(9)
		.withCompatibleBullet(Bullet357)
		.withName("DeagleMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.DeagleMag(), "Deagle.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		AS50Mag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withCompatibleBullet(BMG50)
		.withName("AS50Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.AS50Mag(), "NATOMag1.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		FNP90Mag = new ItemMagazine.Builder()
		.withAmmo(50)
		.withCompatibleBullet(Bullet57x28)
		.withName("FNP90Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.P90Mag(), "P90Mag.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M107BMag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withCompatibleBullet(BMG50)
		.withName("M107BMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M107Mag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		HKMP7Mag = new ItemMagazine.Builder()
		.withAmmo(20)
		.withCompatibleBullet(Bullet46x30)
		.withName("HKMP7Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.MP7Mag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M1CarbineMag = new ItemMagazine.Builder()
		.withAmmo(15)
		.withCompatibleBullet(Carbine30)
		.withName("M1CarbineMag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M14Mag(), "GunmetalTexture.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M240Mag = new ItemMagazine.Builder()
		.withAmmo(200)
		.withCompatibleBullet(Bullet762x51)
		.withName("M240Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M240Mag(), "M240Mag.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		L115Mag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withCompatibleBullet(BMG50)
		.withName("LP115Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.L115Mag(), "AK12.png")
		
		.withFirstPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(0.3F, -0.5F, 0.6F);
			GL11.glRotatef(30F, 0f, 1f, 0f);
			GL11.glScaled(0.9F, 0.9F, 0.9F);
		})
		.withThirdPersonPositioning((player, itemStack) -> {
			GL11.glTranslatef(-1.2F, -0.5F, 0.9F);
			GL11.glRotatef(-50F, 0f, 1f, 0f);
			GL11.glRotatef(80F, 1f, 0f, 0f);
			GL11.glScaled(0.7F, 0.7F, 0.7F);
		})
		.withInventoryPositioning((itemStack) -> {
			GL11.glTranslatef(-1F, 0.3F, 0.4F);
			GL11.glRotatef(-130F, 0f, 1f, 0f);
			GL11.glRotatef(20F, 1f, 0f, 0f);
			GL11.glRotatef(-30F, 0f, 0f, 1f);
			GL11.glScaled(1.2F, 1.2F, 1.2f);
		})
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		

		ColtM1911Mag = new ItemMagazine.Builder()
		.withAmmo(10)
		.withCompatibleBullet(Bullet45ACP)
		.withName("ColtM1911Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "AK12.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
		
		M249Mag = new ItemMagazine.Builder()
		.withAmmo(200)
		.withCompatibleBullet(Bullet556x45)
		.withName("M249Mag")
		.withModId(ModernWarfareMod.MODID)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		.withModel(new com.vicmatskiv.mw.models.M240Mag(), "M240Mag.png")
		
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
		.withTextureName("Dummy.png")
		.build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

		Bipod = new ItemBipod();

		AKMIron = new ItemAKMIron();
		AR15Iron = new ItemAR15Iron();
//		Extra = new ItemExtra();
		
		Extra = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
		        .withModel(new AKMiron1(), "GunmetalTexture.png")
		        .withModel(new AKMiron2(), "GunmetalTexture.png")
		        .withModel(new AK47iron(), "GunmetalTexture.png")
		        .withModel(new M4Iron1(), "GunmetalTexture.png")
		        .withModel(new M4Iron2(), "GunmetalTexture.png")
		        .withModel(new P90iron(), "GunmetalTexture.png")
		        .withModel(new G36CIron1(), "GunmetalTexture.png")
		        .withModel(new G36CIron2(), "GunmetalTexture.png")
		        .withModel(new ScarIron1(), "GunmetalTexture.png")
		        .withModel(new ScarIron2(), "GunmetalTexture.png")
		        .withModel(new FALIron(), "GunmetalTexture.png")
		        .withModel(new M14Iron(), "GunmetalTexture.png")
		        .withModel(new MP5Iron(), "AK12.png")
				.withName("Extra")
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		GlockTop = new AttachmentBuilder<Weapon>()
			.withCategory(AttachmentCategory.EXTRA)
			//.withCreativeTab(ModernWarfareMod.gunsTab)
			.withModel(new com.vicmatskiv.mw.models.GlockTop(), "GlockTop.png")
			.withName("GlockTop")
			.withRenderablePart()
			.withModId(ModernWarfareMod.MODID)
			.withTextureName("Dummy.png")
			.build(ModernWarfareMod.MOD_CONTEXT);
		
		G18Top = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.GlockTop(), "G18Top.png")
				.withName("G18Top")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		M9Top = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.M9Top(), "M9Top.png")
				.withName("M9Top")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		P2000Top = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.P2000Top(), "P2000Top.png")
				.withName("P2000Top")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		DeagleTop = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.DeagleTop(), "Deagle.png")
				.withName("DeagleTop")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		KSGPump = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.KSG12Pump(), "GunmetalTexture.png")
				.withName("KSGPump")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		L115Bolt1 = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA2)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.L115Bolt1(), "AK12.png")
				.withName("LP115Bolt")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		L115Bolt2 = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA3)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.L115Bolt2(), "AK12.png")
				.withName("LP115Bolt2")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		RevolverCase = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA3)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.MagnumCase(), "MagnumCase.png")
				.withName("RevolverCase")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		R870Pump = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.R870Pump(), "Remington.png")
				.withName("R870Pump")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		M1911Top = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.EXTRA)
				//.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.M1911Top(), "M1911.png")
				.withName("M1911Top")
				.withRenderablePart()
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		
		
		Reflex = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.SCOPE)
				.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.Reflex(), "Reflex.png")
				.withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
		        .withFirstPersonModelPositioning((model, itemStack) -> {
		        	if(model instanceof com.vicmatskiv.mw.models.Reflex) {
		        		GL11.glTranslatef(0.1F, -0.8F, 0.2F);
			        	GL11.glRotatef(30F, 0f, 1f, 0f);
			        	GL11.glScaled(0.5F, 0.5F, 0.5F);
		        	} else if(model instanceof com.vicmatskiv.mw.models.Reflex2) {
			        	GL11.glScaled(0F, 0F, 0F);
		        	}
		        	
		        })
		        .withThirdPersonModelPositioning((model, itemStack) -> {
		        	if(model instanceof com.vicmatskiv.mw.models.Reflex) {
		        		GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
		        		GL11.glRotatef(-50F, 0f, 1f, 0f);
		        		GL11.glRotatef(80F, 1f, 0f, 0f);
		        		GL11.glScaled(0.3F, 0.3F, 0.3F);
		        	} else if(model instanceof com.vicmatskiv.mw.models.Reflex2) {
			        	GL11.glScaled(0F, 0F, 0F);
		        	}
		        })
		        .withInventoryModelPositioning((model, itemStack) -> {
		        	if(model instanceof com.vicmatskiv.mw.models.Reflex) {
		        		GL11.glTranslatef(-0.6F, -0.1F, 1.15F);
		        		GL11.glRotatef(10F, 1f, 0f, 0f);
		        		GL11.glRotatef(-180F, 0f, 1f, 0f);
		        		GL11.glRotatef(0F, 0f, 0f, 1f);
		        		GL11.glScaled(1F, 1F, 1f);
		        	} else if(model instanceof com.vicmatskiv.mw.models.Reflex2) {
		        		GL11.glScaled(0F, 0F, 0F);
		        		
		        	}
		        })
		        .withEntityModelPositioning((model, itemStack) -> {
		        	if(model instanceof com.vicmatskiv.mw.models.Reflex) {
		        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
		        		GL11.glRotatef(90F, 0f, 0f, 1f);
		        		GL11.glScaled(0.4F, 0.4F, 0.4F);
		        	} else if(model instanceof com.vicmatskiv.mw.models.Reflex2) {
		        		GL11.glScaled(0F, 0F, 0F);
		        	}
		        })
		        .withName("Reflex")
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        ACOG = new AttachmentBuilder<Weapon>()
				.withCategory(AttachmentCategory.SCOPE)
				.withCreativeTab(ModernWarfareMod.gunsTab)
				.withModel(new com.vicmatskiv.mw.models.ACOG(), "Acog.png")
				.withModel(new com.vicmatskiv.mw.models.Acog2(), "Acog2.png")
				.withApply((a, weapon, player) -> {
							weapon.changeZoom(player, 0.8f);
						})
						.withRemove((attachment, weapon, player) -> {
							weapon.changeZoom(player, 1);
						})
		        .withFirstPersonModelPositioning((model, itemStack) -> {
		        	if(model instanceof com.vicmatskiv.mw.models.ACOG) {
		        		GL11.glTranslatef(0.1F, -0.8F, 0.4F);
			        	GL11.glRotatef(30F, 0f, 1f, 0f);
			        	GL11.glScaled(0.7F, 0.7F, 0.7F);
		        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
			        	GL11.glScaled(0F, 0F, 0F);
		        	}
		        	
		        })
		        .withThirdPersonModelPositioning((model, itemStack) -> {
		        	if(model instanceof com.vicmatskiv.mw.models.ACOG) {
		        		GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
		        		GL11.glRotatef(-50F, 0f, 1f, 0f);
		        		GL11.glRotatef(80F, 1f, 0f, 0f);
		        		GL11.glScaled(0.5F, 0.5F, 0.5F);
		        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
			        	GL11.glScaled(0F, 0F, 0F);
		        	}
		        })
		        .withInventoryModelPositioning((model, itemStack) -> {
		        	if(model instanceof com.vicmatskiv.mw.models.ACOG) {
		        		GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
		        		GL11.glRotatef(10F, 1f, 0f, 0f);
		        		GL11.glRotatef(-190F, 0f, 1f, 0f);
		        		GL11.glRotatef(0F, 0f, 0f, 1f);
		        		GL11.glScaled(1.2F, 1.2F, 1.2f);
		        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
		        		GL11.glScaled(0F, 0F, 0F);
		        		
		        	}
		        })
		        .withEntityModelPositioning((model, itemStack) -> {
		        	if(model instanceof com.vicmatskiv.mw.models.ACOG) {
		        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
		        		GL11.glRotatef(90F, 0f, 0f, 1f);
		        		GL11.glScaled(0.4F, 0.4F, 0.4F);
		        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
		        		GL11.glScaled(0F, 0F, 0F);
		        	}
		        })
				.withName("Acog")
				.withModId(ModernWarfareMod.MODID)
				.withTextureName("Dummy.png")
				.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        Holo2 = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.SCOPE)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withModel(new com.vicmatskiv.mw.models.Holographic(), "Holographic.png")
						.withModel(new com.vicmatskiv.mw.models.Holo2(), "Holo3.png")
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Holographic) {
				        		GL11.glTranslatef(0.1F, -0.8F, 0.2F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.6F, 0.6F, 0.6F);
				        	} else if(model instanceof com.vicmatskiv.mw.models.Holo2) {
					        	GL11.glScaled(0F, 0F, 0F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Holographic) {
				        		GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	} else if(model instanceof com.vicmatskiv.mw.models.Holo2) {
					        	GL11.glScaled(0F, 0F, 0F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Holographic) {
				        		GL11.glTranslatef(-0.6F, -0.1F, 0.3F);
				        		//GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-180F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(1F, 1F, 1f);
				        	} else if(model instanceof com.vicmatskiv.mw.models.Holo2) {
				        		GL11.glScaled(0F, 0F, 0F);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Holographic) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.4F, 0.4F, 0.4F);
				        	} else if(model instanceof com.vicmatskiv.mw.models.Holo2) {
				        		GL11.glScaled(0F, 0F, 0F);
				        	}
				        })
				        .withName("Holographic")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        Kobra = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.SCOPE)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withModel(new com.vicmatskiv.mw.models.Kobra(), "Kobra.png")
						.withModel(new com.vicmatskiv.mw.models.Reflex2(), "Reflex2.png")
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Kobra) {
				        		GL11.glTranslatef(0.4F, -0.8F, 0.5F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.7F, 0.7F, 0.7F);
				        	} else if(model instanceof com.vicmatskiv.mw.models.Reflex2) {
					        	GL11.glScaled(0F, 0F, 0F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Kobra) {
				        		GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	} else if(model instanceof com.vicmatskiv.mw.models.Reflex2) {
					        	GL11.glScaled(0F, 0F, 0F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Kobra) {
				        		GL11.glTranslatef(-0.6F, -0.1F, 0.3F);
				        		//GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-180F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(1F, 1F, 1f);
				        	} else if(model instanceof com.vicmatskiv.mw.models.Reflex2) {
				        		GL11.glScaled(0F, 0F, 0F);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Kobra) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.4F, 0.4F, 0.4F);
				        	} else if(model instanceof com.vicmatskiv.mw.models.Reflex2) {
				        		GL11.glScaled(0F, 0F, 0F);
				        	}
				        })
				        .withName("Kobra")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        Scope = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.SCOPE)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withCrosshair("LP")
						.withModel(new com.vicmatskiv.mw.models.LP(), "AK12.png")
						.withApply((a, weapon, player) -> {
							weapon.changeZoom(player, 0.2f);
						})
						.withRemove((attachment, weapon, player) -> {
							weapon.changeZoom(player, 1);
						})
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.LP) {
				        		GL11.glTranslatef(0.1F, -0.8F, 0.4F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.7F, 0.7F, 0.7F);
//				        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
//					        	GL11.glScaled(0F, 0F, 0F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.LP) {
				        		GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
//				        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
//					        	GL11.glScaled(0F, 0F, 0F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.LP) {
				        		GL11.glTranslatef(-0.6F, -0.6F, 0.5F);
				        		GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-190F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(0.8F, 0.8F, 0.8f);
//				        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
//				        		GL11.glScaled(0F, 0F, 0F);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.LP) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.4F, 0.4F, 0.4F);
//				        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
//				        		GL11.glScaled(0F, 0F, 0F);
				        	}
				        })
						.withName("LPScope")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        HP = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.SCOPE)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withCrosshair("HP")
						.withModel(new com.vicmatskiv.mw.models.HP(), "AK12.png")
						.withApply((a, weapon, player) -> {
							weapon.changeZoom(player, 0.01f);
						})
						.withRemove((attachment, weapon, player) -> {
							weapon.changeZoom(player, 1);
						})
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.HP) {
				        		GL11.glTranslatef(0.1F, -0.8F, 0.4F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.7F, 0.7F, 0.7F);
//				        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
//					        	GL11.glScaled(0F, 0F, 0F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.HP) {
				        		GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
//				        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
//					        	GL11.glScaled(0F, 0F, 0F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.HP) {
				        		GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
				        		GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-190F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(0.65F, 0.65F, 0.65f);
//				        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
//				        		GL11.glScaled(0F, 0F, 0F);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.HP) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.4F, 0.4F, 0.4F);
//				        	} else if(model instanceof com.vicmatskiv.mw.models.Acog2) {
//				        		GL11.glScaled(0F, 0F, 0F);
				        	}
				        })
						.withName("HPScope")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        Silencer = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.SILENCER)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withModel(new com.vicmatskiv.mw.models.Suppressor(), "Silencer.png")
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Suppressor) {
				        		GL11.glTranslatef(0.5F, -1.3F, -0.1F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.6F, 0.6F, 0.6F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Suppressor) {
				        		GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Suppressor) {
				        		GL11.glTranslatef(0.6F, 0.1F, 0.3F);
				        		//GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-180F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(1F, 1F, 1f);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Suppressor) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.4F, 0.4F, 0.4F);
				        	}
				        })
				        .withName("Silencer")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        Laser = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.GRIP)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withModel(new com.vicmatskiv.mw.models.Laser(), "AK12.png")
						.withPostRender(new LaserBeamRenderer())
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Laser) {
				        		GL11.glTranslatef(0.5F, -1.3F, -0.1F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.6F, 0.6F, 0.6F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Laser) {
				        		GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Laser) {
				        		GL11.glTranslatef(0.6F, -0.3F, 0.65F);
				        		//GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-180F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(1.8F, 1.8F, 1.8f);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Laser) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.4F, 0.4F, 0.4F);
				        	}
				        })
				        .withName("Laser")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        Laser2 = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.GRIP)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withModel(new com.vicmatskiv.mw.models.Laser2(), "AK12.png")
						.withPostRender(new LaserBeamRenderer())
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Laser2) {
				        		GL11.glTranslatef(0.5F, -1.3F, -0.1F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.6F, 0.6F, 0.6F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Laser2) {
				        		GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Laser2) {
				        		GL11.glTranslatef(0.6F, -0.3F, 0.65F);
				        		//GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-180F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(1.8F, 1.8F, 1.8f);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Laser2) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.4F, 0.4F, 0.4F);
				        	}
				        })
				        .withName("Laser2")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        Grip2 = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.GRIP)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withModel(new com.vicmatskiv.mw.models.Grip2(), "AK12.png")
						.withApply((a, weapon, player) -> {
							weapon.changeRecoil(player, 0.7F);
						})
						.withRemove((attachment, weapon, player) -> {
							weapon.changeRecoil(player, 1);
						})
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Grip2) {
				        		GL11.glTranslatef(0.7F, -1.2F, 0.5F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.6F, 0.6F, 0.6F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Grip2) {
				        		GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Grip2) {
				        		GL11.glTranslatef(0.6F, 0.3F, -0.5F);
				        		//GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-180F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(1.3F, 1.3F, 1.3f);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Grip2) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.6F, 0.6F, 0.6F);
				        	}
				        })
				        .withName("Grip2")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        Grip = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.GRIP)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withModel(new com.vicmatskiv.mw.models.AngledGrip(), "AK12.png")
						.withApply((a, weapon, player) -> {
							weapon.changeRecoil(player, 0.5F);
						})
						.withRemove((attachment, weapon, player) -> {
							weapon.changeRecoil(player, 1);
						})
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.AngledGrip) {
				        		GL11.glTranslatef(0.7F, -1.1F, 0.5F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.AngledGrip) {
				        		GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.AngledGrip) {
				        		GL11.glTranslatef(0.6F, 0.8F, -0.45F);
				        		//GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-180F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(1.2F, 1.2F, 1.2f);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.AngledGrip) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.6F, 0.6F, 0.6F);
				        	}
				        })
				        .withName("AngledGrip")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        VGrip = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.GRIP)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withModel(new com.vicmatskiv.mw.models.VGrip(), "AK12.png")
						.withApply((a, weapon, player) -> {
							weapon.changeRecoil(player, 0.7F);
						})
						.withRemove((attachment, weapon, player) -> {
							weapon.changeRecoil(player, 1);
						})
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.VGrip) {
				        		GL11.glTranslatef(0.7F, -1.1F, 0.5F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.VGrip) {
				        		GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.VGrip) {
				        		GL11.glTranslatef(0.6F, 0.3F, -0.5F);
				        		//GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-180F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(1.3F, 1.3F, 1.3f);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.VGrip) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.6F, 0.6F, 0.6F);
				        	}
				        })
				        .withName("VGrip")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
						.build(ModernWarfareMod.MOD_CONTEXT);
		        
		        Bipod = new AttachmentBuilder<Weapon>()
						.withCategory(AttachmentCategory.GRIP)
						.withCreativeTab(ModernWarfareMod.gunsTab)
						.withModel(new com.vicmatskiv.mw.models.Bipod(), "AK12.png")
						.withApply((a, weapon, player) -> {
							weapon.changeRecoil(player, 0.4F);
						})
						.withRemove((attachment, weapon, player) -> {
							weapon.changeRecoil(player, 1);
						})
				        .withFirstPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Bipod) {
				        		GL11.glTranslatef(0.7F, -1.1F, 0.5F);
					        	GL11.glRotatef(30F, 0f, 1f, 0f);
					        	GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        	
				        })
				        .withThirdPersonModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Bipod) {
				        		GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
				        		GL11.glRotatef(-50F, 0f, 1f, 0f);
				        		GL11.glRotatef(80F, 1f, 0f, 0f);
				        		GL11.glScaled(0.5F, 0.5F, 0.5F);
				        	}
				        })
				        .withInventoryModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Bipod) {
				        		GL11.glTranslatef(0.6F, -0.05F, -0.5F);
				        		//GL11.glRotatef(10F, 1f, 0f, 0f);
				        		GL11.glRotatef(-180F, 0f, 1f, 0f);
				        		GL11.glRotatef(0F, 0f, 0f, 1f);
				        		GL11.glScaled(0.9F, 0.9F, 0.9f);
				        		
				        	}
				        })
				        .withEntityModelPositioning((model, itemStack) -> {
				        	if(model instanceof com.vicmatskiv.mw.models.Bipod) {
				        		GL11.glTranslatef(0.1F, 0.2F, 0.4F);
				        		GL11.glRotatef(90F, 0f, 0f, 1f);
				        		GL11.glScaled(0.6F, 0.6F, 0.6F);
				        	}
				        })
				        .withName("Bipod")
						.withModId(ModernWarfareMod.MODID)
						.withTextureName("Dummy.png")
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

		registerItem(AKMIron);
		registerItem(AR15Iron);

		registerItem(Bullets);
		registerItem(Electronics);
		registerItem(CGrip);
		registerItem(OpticGlass);
		registerItem(Cloth);
		registerItem(TanCloth);
		registerItem(GreenCloth);

		registerBlockWithItem(TitaniumOre); //, "TitaniumOre");
		registerItem(TitaniumIngot);

		registerBlockWithItem(LeadOre); //, "LeadOre");
		registerItem(LeadIngot);

		registerBlockWithItem(CopperOre);
		registerItem(CopperIngot);

		registerBlockWithItem(TinOre);
		registerItem(TinIngot);

		registerBlockWithItem(SulfurOre);
		registerItem(SulfurDust);
		
		registerBlockWithItem(BauxiteOre);
		registerItem(AluminumIngot);
		registerItem(AluminumPlate);
		
		registerBlockWithItem(SiliconOre);
		registerItem(Silicon);
		
		registerBlockWithItem(TantalumOre);
		registerItem(TantalumIngot);
		
		registerBlockWithItem(RubyOre);
		registerItem(Ruby);
		
		registerItem(SteelDust);
		registerItem(SteelIngot);
		registerItem(SteelPlate);
		registerItem(MiniSteelPlate);
		
		registerItem(WeaponStock);
		registerItem(RetractableStock);
		registerItem(SecondaryStock);
		registerItem(WoodWeaponStock);
		registerItem(WoodRifleStock);
		
		registerItem(WeaponReceiver);
		registerItem(SMGReceiver);
		registerItem(UnderReceiver);
		registerItem(RifleReceiver);
		registerItem(PistolUnderReceiver);
		registerItem(P90Receiver);
		
		registerItem(RevolverAction);
		registerItem(RevolverGrip);
		registerItem(RevolverReceiver);
		
		registerItem(ShotgunReceiver);
		registerItem(ShotgunGrip);
		
		registerItem(ScarReceiver);
		
		registerItem(DeagleReceiver);
		
		registerItem(LMGReceiver);
		
		registerItem(Transistor);
		registerItem(Resistor);
		registerItem(Inductor);
		registerItem(Diode);
		registerItem(Capacitor);
		registerItem(CopperWiring);
		registerItem(Piston);
		registerItem(LaserPointer);
		
		registerItem(Barrel);
		registerItem(Plastic);
		
		OreDictionary.registerOre("ingotTitanium", TitaniumIngot);
		OreDictionary.registerOre("ingotLead", LeadIngot);
		OreDictionary.registerOre("ingotCopper", CopperIngot);
		OreDictionary.registerOre("ingotTin", TinIngot);
		OreDictionary.registerOre("ingotSulfurDust", SulfurDust);
		OreDictionary.registerOre("ingotAluminum", AluminumIngot);
		OreDictionary.registerOre("Ruby", Ruby);
		OreDictionary.registerOre("ingotSteel", SteelIngot);

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

		Builder tacticalArmorBuilder = new CustomArmor.Builder()
			.withModId(ModernWarfareMod.MODID).withMaterial(Marine)
			.withUnlocalizedName("Tactical").withTextureName("Tactical")
			.withModelClass("com.vicmatskiv.mw.models.Tactical")
			.withHudTextureName("Tactical");
		
		Tacticalhelmet = tacticalArmorBuilder.buildHelmet(isClient());
		Tacticalchest = tacticalArmorBuilder.buildChest(isClient());
		Tacticalboots = tacticalArmorBuilder.buildBoots(isClient());
//
//		new CustomArmor.Builder().withModId(ModernWarfareMod.MODID)
//				.withMaterial(Tactical).withUnlocalizedName("Tactical")
//				.withTextureName("Tactical")
//				.withModelClass("com.vicmatskiv.mw.models.Tactical")
//				.withHudTextureName("Tactical").build(isClient());

	}
	
	private static void registerBlockWithItem(Block block) {
		if(block.getRegistryName() == null) {
			if(block.getUnlocalizedName().length() < ModernWarfareMod.MODID.length() + 2 + 5) {
				throw new IllegalArgumentException("Unlocalize block name too short " + block.getUnlocalizedName());
			}
			String unlocalizedName = block.getUnlocalizedName();
			String registryName = unlocalizedName.substring(5 + ModernWarfareMod.MODID.length() + 1);
			block.setRegistryName(ModernWarfareMod.MODID, registryName);
		}
		
		GameRegistry.register(block);
		ItemBlock itemBlock = new ItemBlock(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
	}

	private static void registerItem(Item item) {
		if(item.getRegistryName() == null) {
			String registryName = item.getUnlocalizedName();
			int indexOfPrefix = registryName.indexOf("." + ModernWarfareMod.MODID);
			if(indexOfPrefix > 0) {
				registryName = registryName.substring(indexOfPrefix + ModernWarfareMod.MODID.length() + 2);
			}
			item.setRegistryName(ModernWarfareMod.MODID, registryName);
		}
		GameRegistry.register(item);
	}

}
