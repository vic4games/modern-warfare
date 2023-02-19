package com.vicmatskiv.mw.tileentities;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Guns;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.entities.EntityFactory;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.ai.BetterAINearestAttackableTarget;
import com.vicmatskiv.weaponlib.ai.EntityAIAttackRangedWeapon;
import com.vicmatskiv.weaponlib.ai.EntityConfiguration;
import com.vicmatskiv.weaponlib.ai.EntityCustomMob;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBiomeType;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMaterial;
import com.vicmatskiv.weaponlib.tile.LootBoxConfiguration;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpellcasterIllager;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TurretBaseFactory implements TileEntityFactory {

    @Override
    public void createTileEntity(ModContext modContext) {
    	new LootBoxConfiguration()
        .withMaterial(CompatibleMaterial.ROCK)
        .withName("turret_base")
        .withModelClassName("com.vicmatskiv.mw.models.TurretBase")
        .withTextureName("textures/models/turretbase.png")
//        .withEquipementDispenseSound(sound)
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withBoundingBox(0.0, 0, 0.0, 1, 0.2, 1)
        .withPositioning(tileEntity -> {
//            GL11.glScalef(0.5f, 0.5f, 0.5f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
//            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
//        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
//        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
//        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
//        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
    
    @SubscribeEvent
    public void lootLoad(LootTableLoadEvent evt) {
        if (evt.getName().toString().equals("minecraft:chests/simple_dungeon")) {
            // do stuff with evt.getTable()
        }
    }

}
