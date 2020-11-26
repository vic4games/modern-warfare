package com.vicmatskiv.mw.entities;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.Guns;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.ai.EntityAIAttackRangedWeapon;
import com.vicmatskiv.weaponlib.ai.EntityConfiguration;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBiomeType;

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

public class BanditEntityFactory implements EntityFactory {

    @Override
    public void createEntity(ModContext modContext) {
        new EntityConfiguration.Builder()
        .withName("bandit1")
        .withBaseClass(EntityCustomMob.class)
        .withMaxHealth(20)
        .withEntityIdSupplier(() -> 10000)
        .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag)
        .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag, Attachments.PSO1)
        .withEquipmentOption(Guns.Remington870, EnumDifficulty.EASY, 0.07f)
//        .withEquipmentOption(Guns.PGMHecateII, EnumDifficulty.EASY, 0.07f)
//        .withEquipmentOption(Guns.CZ805BrenA1, EnumDifficulty.EASY, 0.1f, Magazines.M4A1Mag)
        .withPrimaryEquipmentDropChance(1f)
        .withSpawn(1, 1, 7, CompatibleBiomeType.PLAINS, CompatibleBiomeType.FOREST, CompatibleBiomeType.HILLS)
        .withSpawnEgg(0xA0A000, 0xA0A010)
        .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit1.png")
        .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit3.png")
        .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit4.png")
        .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit5.png")
        .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit6.png")
        .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit7.png")
        .withTexturedModelVariant("com.vicmatskiv.mw.models.Biped", "bandit8.png")
        .withHurtSound("hurt")
        .withAmbientSound("drawweapon")
//        .withStepSound("step")
        .withAiTask(1, e -> new EntityAISwimming(e))
        .withAiTask(3, e -> compatibility.createAiAvoidEntity((EntityCreature)e, EntityWolf.class, 6.0F, 1.0D, 1.2D))
        .withAiTask(4, e -> new EntityAIAttackRangedWeapon((EntityCustomMob)e, 1.0D, 10, 30.0F))
        .withAiTask(5, e -> new EntityAIWander((EntityCreature)e, 1.0D))
        .withAiTask(6, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 50.0F))
        .withAiTask(6, e -> new EntityAILookIdle(e))
        .withAiTargetTask(1, e -> new EntityAIHurtByTarget((EntityCreature)e, false))
        .withAiTargetTask(2, e -> compatibility.createAINearestAttackableTarget(e, EntityPlayer.class, true))
        .withAiTargetTask(3, e -> compatibility.createAINearestAttackableTarget(e, EntityIronGolem.class, true))
        .register(modContext);
    }

}
