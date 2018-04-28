package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;

import com.vicmatskiv.weaponlib.ai.EntityAIAttackRangedWeapon;
import com.vicmatskiv.weaponlib.ai.EntityConfiguration;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBiomeType;

public class Entities {

    public static void init(CommonProxy commonProxy) {

        new EntityConfiguration.Builder()
            .withName("bandit1")
            .withBaseClass(EntityCustomMob.class)
            .withMaxHealth(20)
            .withEntityIdSupplier(() -> 10000)
            .withEquipmentOption(Guns.MakarovPM, EnumDifficulty.EASY, 4f, Magazines.Magazine9mm)
            .withEquipmentOption(Guns.MakarovPM, EnumDifficulty.EASY, 3.8f, Magazines.Magazine9mm, Attachments.Silencer9mm)
            .withEquipmentOption(Guns.AK74U, EnumDifficulty.EASY, 0.1f, Magazines.AKS74UMag) //, Attachments.Silencer9mm)
            .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag)
            .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag, Attachments.PSO1)
            .withEquipmentOption(Guns.Remington870, EnumDifficulty.EASY, 0.07f)
            .withPrimaryEquipmentDropChance(1f)
            .withSpawn(5, 1, 3, CompatibleBiomeType.PLAINS, CompatibleBiomeType.FOREST, CompatibleBiomeType.HILLS)
            .withSpawnEgg(0xA0A000, 0xA0A010)
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit1.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit2.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit3.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit4.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit5.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit6.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit7.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit8.png")
            .withHurtSound("hurt")
            .withAmbientSound("drawweapon")
//            .withStepSound("step")
            .withAiTask(1, e -> new EntityAISwimming(e))
            .withAiTask(3, e -> compatibility.createAiAvoidEntity((EntityCreature)e, EntityWolf.class, 6.0F, 1.0D, 1.2D))
            .withAiTask(4, e -> new EntityAIAttackRangedWeapon((EntityCustomMob)e, 1.0D, 10, 30.0F))
            .withAiTask(5, e -> new EntityAIWander((EntityCreature)e, 1.0D))
            .withAiTask(6, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 50.0F))
            .withAiTask(6, e -> new EntityAILookIdle(e))
            .withAiTargetTask(1, e -> new EntityAIHurtByTarget((EntityCreature)e, false))
            .withAiTargetTask(2, e -> compatibility.createAINearestAttackableTarget(e, EntityPlayer.class, true))
            .withAiTargetTask(3, e -> compatibility.createAINearestAttackableTarget(e, EntityIronGolem.class, true))
            .register(ModernWarfareMod.MOD_CONTEXT);

        new EntityConfiguration.Builder()
            .withName("gassy")
            .withBaseClass(EntityCustomMob.class)
            .withMaxHealth(50)
            .withEntityIdSupplier(() -> 10001)
            .withEquipmentOption(Guns.MakarovPM, EnumDifficulty.EASY, 4f, Magazines.Magazine9mm)
            .withEquipmentOption(Guns.MakarovPM, EnumDifficulty.EASY, 3.8f, Magazines.Magazine9mm, Attachments.Silencer9mm)
            .withEquipmentOption(Guns.AK74U, EnumDifficulty.EASY, 0.1f, Magazines.AKS74UMag) //, Attachments.Silencer9mm)
            .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag)
            .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag, Attachments.PSO1)
            .withEquipmentOption(Guns.Remington870, EnumDifficulty.EASY, 0.07f)
            .withPrimaryEquipmentDropChance(0.5f)
            .withSecondaryEquipmentOption(Grenades.GasGrenade, EnumDifficulty.EASY, 0.01f)
            .withArmor(Armors.GasMaskM40)
            .withSpawn(1, 1, 1, CompatibleBiomeType.PLAINS, CompatibleBiomeType.FOREST, CompatibleBiomeType.HILLS, CompatibleBiomeType.SWAMP)
            .withSpawnEgg(0xA0A000, 0xA0A010)
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit1.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit2.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit3.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit4.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit5.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit6.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit7.png")
            .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit8.png")
            .withHurtSound("hurt")
            .withAmbientSound("drawweapon")
//          .withStepSound("step")
            .withAiTask(1, e -> new EntityAISwimming(e))
            .withAiTask(3, e -> compatibility.createAiAvoidEntity((EntityCreature)e, EntityWolf.class, 6.0F, 1.0D, 1.2D))
            .withAiTask(4, e -> new EntityAIAttackRangedWeapon((EntityCustomMob)e, 1.0D, 10, 30.0F, 0.05f))
            .withAiTask(5, e -> new EntityAIWander((EntityCreature)e, 1.0D))
            .withAiTask(6, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 50.0F))
            .withAiTask(6, e -> new EntityAILookIdle(e))
            .withAiTargetTask(1, e -> new EntityAIHurtByTarget((EntityCreature)e, false))
            .withAiTargetTask(2, e -> compatibility.createAINearestAttackableTarget(e, EntityPlayer.class, true))
            .withAiTargetTask(3, e -> compatibility.createAINearestAttackableTarget(e, EntityIronGolem.class, true))
            .register(ModernWarfareMod.MOD_CONTEXT);
        }

}

