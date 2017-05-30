package com.vicmatskiv.mw;

import java.util.Random;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleWorldGenerator;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldGeneratorEventHandler extends CompatibleWorldGenerator {

    private ConfigurationManager configurationManager;

    public WorldGeneratorEventHandler(ConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        switch(world.provider.dimensionId) {
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
    }

    private void generateEnd(World world, Random random, int x, int z) {}

    private void generateSurface(World world, Random random, int x, int z) {

        addOreSpawn(Ores.TitaniumOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("TitaniumOre").getSpawnsPerChunk(),
                random, x, z, 8, 8, 3 + random.nextInt(4), 2, 60);

        addOreSpawn(Ores.CopperOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("CopperOre").getSpawnsPerChunk(),
                random, x, z, 9, 9, 6 + random.nextInt(4), 2, 110);

        addOreSpawn(Ores.SulfurOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("SulfurOre").getSpawnsPerChunk(),
                random, x, z, 13, 13, 6 + random.nextInt(7), 5, 90);

        addOreSpawn(Ores.LeadOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("LeadOre").getSpawnsPerChunk(),
                random, x, z, 10, 10, 4 + random.nextInt(5), 5, 90);

        addOreSpawn(Ores.TantalumOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("TantalumOre").getSpawnsPerChunk(),
                random, x, z, 8, 8, 3 + random.nextInt(4), 2, 60);

        addOreSpawn(Ores.BauxiteOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("BauxiteOre").getSpawnsPerChunk(),
                random, x, z, 8, 8, 3 + random.nextInt(4), 2, 60);

        addOreSpawn(Ores.TinOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("TinOre").getSpawnsPerChunk(),
                random, x, z, 8, 8, 3 + random.nextInt(4), 2, 60);

        addOreSpawn(Ores.SiliconOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("SiliconOre").getSpawnsPerChunk(),
                random, x, z, 7, 7, 4 + random.nextInt(2), 2, 90);

        addOreSpawn(Ores.RubyOre, CompatibleBlocks.STONE, world,
                configurationManager.getOre("RubyOre").getSpawnsPerChunk(),
                random, x, z, 6, 6, 2 + random.nextInt(2), 2, 15);

    }

    private void generateNether(World world, Random random, int x, int z) {

    }

    public void addOreSpawn(Block block, CompatibleBlocks target, World world, int chancesToSpawn,
            Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
            int minY, int maxY) {

        int diffBetweenMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBetweenMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);

            generate(block, maxVeinSize, target, world, random, posX, posY, posZ);
        }
    }

}
