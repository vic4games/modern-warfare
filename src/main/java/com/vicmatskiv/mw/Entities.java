package com.vicmatskiv.mw;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.ai.EntityAIAttackRangedWeapon;
import com.vicmatskiv.weaponlib.ai.EntityConfiguration;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBiomeType;
import com.vicmatskiv.weaponlib.grenade.ItemGrenade;

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

public class Entities {

    public static void init(CommonProxy commonProxy) {

        new EntityConfiguration.Builder()
            .withName("MyCustomMob")
            .withBaseClass(EntityCustomMob.class)
            .withMaxHealth(30)
            .withFollowRange(50)
            .withEntityIdSupplier(() -> 10000)
            .withEquipmentOption(Guns.AK74M, EnumDifficulty.EASY, 0.5f, Magazines.Magazine762x39, Attachments.PSO1)
            .withSecondaryEquipmentOption(Grenades.GasGrenade, EnumDifficulty.EASY, 0.5f)
            .withArmor(Armors.GasMaskM40)
//            .withEquipmentOption(Guns.MakarovPM, EnumDifficulty.EASY, 1f)
//            .withEquipmentOption(Guns.ACR, EnumDifficulty.EASY, 8f)
            .withSpawn(50, 1, 3, CompatibleBiomeType.PLAINS)
            .withSpawnEgg(0xA0A000, 0x00A0A0)
            .withTexturedModelVariant("com.vicmatskiv.weaponlib.compatibility.CompatibleModelCustomMob", "skeleton.png")
            .withTexturedModelVariant("com.vicmatskiv.weaponlib.compatibility.CompatibleModelCustomMob", "skeleton.png")
            .withAiTask(1, e -> new EntityAISwimming(e))
            .withAiTask(3, e -> compatibility.createAiAvoidEntity(e, EntityWolf.class, 6.0F, 1.0D, 1.2D))
            .withAiTask(5, e -> new EntityAIAttackRangedWeapon((EntityCustomMob)e, 1.0D, 10, 20.0f, 0.04f, Weapon.class, ItemGrenade.class))
            .withAiTask(6, e -> new EntityAIWander((EntityCreature)e, 1.0D))
            .withAiTask(7, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 20.0F))
            .withAiTask(7, e -> new EntityAILookIdle(e))
            .withAiTargetTask(1, e -> new EntityAIHurtByTarget((EntityCreature)e, false))
            .withAiTargetTask(2, e -> compatibility.createAINearestAttackableTarget(e, EntityPlayer.class, true))
            .withAiTargetTask(3, e -> compatibility.createAINearestAttackableTarget(e, EntityIronGolem.class, true))
            .register(ModernWarfareMod.MOD_CONTEXT);
    }

}
