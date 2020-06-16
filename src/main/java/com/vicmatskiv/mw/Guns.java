package com.vicmatskiv.mw;

import com.vicmatskiv.mw.items.guns.*;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

import net.minecraft.item.Item;

public class Guns {

    public static Item M249;
    public static Item M40A6;
    public static Item M110;
    public static Item M1014;
    public static Item Super90;
    public static Item Supernova;
    public static Item M500A2;
    public static Item M38;
    public static Item M16A4;
    public static Item M4A1;
    public static Item M45A1;
    public static Item P226;
    public static Item M9A1;
    
    public static Item MP443;
    public static Item AK15;
    public static Item KBP9A91;
    public static Item SR3;
    public static Item Kedr;
    public static Item VSSVintorez;
    public static Item KS23;
    public static Item SV98;
    
    public static Item MP5A5;
    public static Item MP7;
    public static Item P90;
    public static Item ScarL;
    public static Item ScarH;
    
    public static Item VP70;
    public static Item Glock19;
    public static Item SCCYCPX2;
    public static Item BrowningHiPower;
    public static Item M1911;
    public static Item Python;
    public static Item TaurusRagingHunter;
    public static Item ChiappaRhino;
    public static Item TheDechard;
    public static Item SW500Magnum;
    public static Item DesertEagle;
    public static Item MP40;
    public static Item M1A1Thompson;
    public static Item M1928Thompson;
    public static Item AK101;
    public static Item AK103BP;
    public static Item AK47;
    public static Item AK12;
    public static Item ACR;
    public static Item CZ805Bren;
    public static Item F2000;
    public static Item G36C;
    public static Item AUG;
    public static Item SL8;
    public static Item G11;
    public static Item STG44;
    public static Item M1873;
    public static Item MaresLeg;
    public static Item Remington870;
    public static Item BrowningAuto5;
    public static Item M1Carbine;
    public static Item M1Garand;
    public static Item G43Gewehr;
    public static Item Springfield;
    public static Item Kar98K;
    public static Item KragJorgensen;
    public static Item FrommerStop;
    public static Item Glock18C;
    public static Item APS;
    public static Item M712;
    public static Item P10mm;
    public static Item Uzi;
    public static Item AACHoneyBadger;
    public static Item KrissVector;
    public static Item HESCS;
    public static Item Saiga12;
    public static Item Spas12;
    public static Item MP43E;
    public static Item HS12;
    public static Item Origin12;
    public static Item ChiappaTripleCrown;
    public static Item QuadBarrelShotgun;
    public static Item M1897;
    public static Item Mk14EBR;
    public static Item BrenMkII;
    public static Item M1941Johnson;
    public static Item M1941JohnsonRifle;
    public static Item DP28;
    public static Item MG34;
    public static Item MG42;
    public static Item M60E4;
    public static Item StonerA1;
    public static Item L96A1;
    public static Item AS50;
    public static Item M82;
    public static Item NTW20;
    public static Item GL06;
    public static Item M79;
    public static Item M32MGL;
    public static Item RPG7;
    public static Item M202;
    public static Item M134;
    
    
    // TDM
    
    // Marine Assault
    public static Item SOCOM_M4A1;
    public static Item M17;
    
    // GSG9 Assault
    public static Item HK_G95;
    public static Item HK_P12;
    
    //SAS Support
    public static Item SA80;
    public static Item L131A1;
    
    // GIGN Light
    public static Item MP7A1;
    public static Item P2022;
    
    // JTF2 CQB
    public static Item C8SFW;
    public static Item Tokyo90;
    
    
    // Video Games
    
    public static Item CSA16;
    public static Item SSG42;
    public static Item HAR27;
    public static Item GPCA1;
    public static Item M6C;
    public static Item M6CSOCOM;
    public static Item M20;
    public static Item MA37;
    public static Item MA5D;
    public static Item BR55;
    public static Item M392;
    public static Item M45;
    public static Item SRS99;
    public static Item Type51;
    public static Item M41A;
    public static Item M56;
    public static Item ESA23;
//    public static Item DL44;
    public static Item NV4;
    public static Item Type2;
    public static Item Volk;
    public static Item M8A7;
    public static Item Fatman;
    public static Item BFG9000;
    
    public static Item Chainsaw;
    
    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, CommonProxy proxy) {
     // Try not to change the order of the guns to ensure stable recipes

        M249 = new M249Factory().createGun(proxy);
        M40A6 = new M40A6Factory().createGun(proxy);
        M110 = new M110Factory().createGun(proxy);
        M1014 = new M1014Factory().createGun(proxy);
        Super90 = new Super90Factory().createGun(proxy);
        Supernova = new SupernovaFactory().createGun(proxy);
        M500A2 = new M500A2Factory().createGun(proxy);
        M38 = new M38Factory().createGun(proxy);
        M16A4 = new M16A4Factory().createGun(proxy);
        M4A1 = new M4A1Factory().createGun(proxy);
        M45A1 = new M45A1Factory().createGun(proxy);
        P226 = new P226Factory().createGun(proxy);
        M9A1 = new M9A1Factory().createGun(proxy);
        
        MP443 = new MP443Factory().createGun(proxy);
        AK15 = new AK15Factory().createGun(proxy);
        KBP9A91 = new KBP9A91Factory().createGun(proxy);
        SR3 = new SR3Factory().createGun(proxy);
        Kedr = new KedrFactory().createGun(proxy);
        VSSVintorez = new VSSVintorezFactory().createGun(proxy);
        KS23 = new KS23Factory().createGun(proxy);
        SV98 = new SV98Factory().createGun(proxy);
        
        MP5A5 = new MP5A5Factory().createGun(proxy);
        MP7 = new MP7Factory().createGun(proxy);
        P90 = new P90Factory().createGun(proxy);
        ScarL = new ScarLFactory().createGun(proxy);
        ScarH = new ScarHFactory().createGun(proxy);
        
        SOCOM_M4A1 = new SOCOM_M4A1Factory().createGun(proxy);
        M17 = new M17Factory().createGun(proxy);
        
        HK_G95 = new HK_G95Factory().createGun(proxy);
        HK_P12 = new HK_P12Factory().createGun(proxy);
        
        SA80 = new SA80Factory().createGun(proxy);
        L131A1 = new L131A1Factory().createGun(proxy);
        
        MP7A1 = new MP7A1Factory().createGun(proxy);
        P2022 = new P2022Factory().createGun(proxy);
        
        C8SFW = new C8SFWFactory().createGun(proxy);
        Tokyo90 = new Tokyo90Factory().createGun(proxy);
        
        VP70 = new VP70Factory().createGun(proxy);
        Glock19 = new Glock19Factory().createGun(proxy);
        SCCYCPX2 = new SCCYCPX2Factory().createGun(proxy);
        BrowningHiPower = new BrowningHiPowerFactory().createGun(proxy);
        M1911 = new M1911Factory().createGun(proxy);
        Python = new PythonFactory().createGun(proxy);
        TaurusRagingHunter = new TaurusRagingHunterFactory().createGun(proxy);
        ChiappaRhino = new ChiappaRhinoFactory().createGun(proxy);
        TheDechard = new TheDechardFactory().createGun(proxy);
        SW500Magnum = new SW500MagnumFactory().createGun(proxy);
        DesertEagle = new DesertEagleFactory().createGun(proxy);
        MP40 = new MP40Factory().createGun(proxy);
        M1928Thompson = new M1928ThompsonFactory().createGun(proxy);
        KrissVector = new KrissVectorFactory().createGun(proxy);
        AK101 = new AK101Factory().createGun(proxy);
        AK103BP = new AK103BPFactory().createGun(proxy);
        AK47 = new AK47Factory().createGun(proxy);
        AK12 = new AK12Factory().createGun(proxy);
        ACR = new ACRFactory().createGun(proxy);
        CZ805Bren = new CZ805BrenFactory().createGun(proxy);
        F2000 = new F2000Factory().createGun(proxy);
        G36C = new G36CFactory().createGun(proxy);
        AUG = new AUGFactory().createGun(proxy);
        SL8 = new SL8Factory().createGun(proxy);
        G11 = new G11Factory().createGun(proxy);
        STG44 = new STG44Factory().createGun(proxy);
        M1873 = new M1873Factory().createGun(proxy);
        MaresLeg = new MaresLegFactory().createGun(proxy);
        NV4 = new NV4Factory().createGun(proxy);
        Type2 = new Type2Factory().createGun(proxy);
        Volk = new VolkFactory().createGun(proxy);
        M8A7 = new M8A7Factory().createGun(proxy);
        Remington870 = new Remington870Factory().createGun(proxy);
        BrowningAuto5 = new BrowningAuto5Factory().createGun(proxy);
        M1Carbine = new M1CarbineFactory().createGun(proxy);
        M1Garand = new M1GarandFactory().createGun(proxy);
        G43Gewehr = new G43GewehrFactory().createGun(proxy);
        Springfield = new SpringfieldFactory().createGun(proxy);
        Kar98K = new Kar98KFactory().createGun(proxy);
        KragJorgensen = new KragJorgensenFactory().createGun(proxy);
        FrommerStop = new FrommerStopFactory().createGun(proxy);
        P10mm = new P10mmFactory().createGun(proxy);
        Glock18C = new Glock18CFactory().createGun(proxy);
        APS = new APSFactory().createGun(proxy);
        M712 = new M712Factory().createGun(proxy);
        Uzi = new UziFactory().createGun(proxy);
        AACHoneyBadger = new AACHoneyBadgerFactory().createGun(proxy);
        HESCS = new HESCSFactory().createGun(proxy);
        Saiga12 = new Saiga12Factory().createGun(proxy);
        Spas12 = new Spas12Factory().createGun(proxy);
        MP43E = new MP43EFactory().createGun(proxy);
        HS12 = new HS12Factory().createGun(proxy);
        Origin12 = new Origin12Factory().createGun(proxy);
        ChiappaTripleCrown = new ChiappaTripleCrownFactory().createGun(proxy);
        QuadBarrelShotgun = new QuadBarrelShotgunFactory().createGun(proxy);
        M1897 = new M1897Factory().createGun(proxy);
        Mk14EBR = new Mk14EBRFactory().createGun(proxy);
        BrenMkII = new BrenMkIIFactory().createGun(proxy);
        M1941Johnson = new M1941JohnsonFactory().createGun(proxy);
        M1941JohnsonRifle = new M1941JohnsonRifleFactory().createGun(proxy);
        DP28 = new DP28Factory().createGun(proxy);
        MG34 = new MG34Factory().createGun(proxy);
        MG42 = new MG42Factory().createGun(proxy);
        M60E4 = new M60E4Factory().createGun(proxy);
        StonerA1 = new StonerA1Factory().createGun(proxy);
        L96A1 = new L96A1Factory().createGun(proxy);
        AS50 = new AS50Factory().createGun(proxy);
        M82 = new M82Factory().createGun(proxy);
        NTW20 = new NTW20Factory().createGun(proxy);
        GL06 = new GL06Factory().createGun(proxy);
        M79 = new M79Factory().createGun(proxy);
        M32MGL = new M32MGLFactory().createGun(proxy);
        RPG7 = new RPG7Factory().createGun(proxy);
        M202 = new M202Factory().createGun(proxy);
        M134 = new M134Factory().createGun(proxy);
        CSA16 = new CSA16Factory().createGun(proxy);
        SSG42 = new SSG42Factory().createGun(proxy);
        HAR27 = new HAR27Factory().createGun(proxy);
        GPCA1 = new GPCA1Factory().createGun(proxy);
        M6C = new M6CFactory().createGun(proxy);
        M6CSOCOM = new M6CSOCOMFactory().createGun(proxy);
        M20 = new M20Factory().createGun(proxy);
        MA37 = new MA37Factory().createGun(proxy);
        MA5D = new MA5DFactory().createGun(proxy);
        BR55 = new BR55Factory().createGun(proxy);
        M392 = new M392Factory().createGun(proxy);
        M45 = new M45Factory().createGun(proxy);
        SRS99 = new SRS99Factory().createGun(proxy);
        Type51 = new Type51Factory().createGun(proxy);
        M41A = new M41AFactory().createGun(proxy);
        M56 = new M56Factory().createGun(proxy);
        ESA23 = new ESA23Factory().createGun(proxy);
        Fatman = new FatmanFactory().createGun(proxy);
        BFG9000 = new BFG9000Factory().createGun(proxy);
//        DL44 = new DL44Factory().createGun(proxy);
        
        Chainsaw = new ChainsawFactory().createGun(proxy);
       
    }
}
