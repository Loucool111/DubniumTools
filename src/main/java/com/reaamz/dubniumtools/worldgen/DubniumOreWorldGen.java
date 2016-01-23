package com.reaamz.dubniumtools.worldgen;

import com.reaamz.dubniumtools.init.AllModBlocks;
import com.reaamz.dubniumtools.utils.LogHelper;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class DubniumOreWorldGen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if (world.provider.dimensionId == 0)
        {
            generateOreOverWorld(random, chunkX * 16, chunkZ * 16, world);
        }
    }

    private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance)
    {
        for (int i = 0; i < spawnChance; i++)
        {
            int xPos = posX + random.nextInt(16);
            int yPos = minY + random.nextInt(maxY - minY);
            int zPos = posZ + random.nextInt(16);

            new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
        }
    }

    private void generateOreOverWorld(Random random, int chunkX, int chunkZ, World world)
    {
        addOre(AllModBlocks.DUBNIUM_ORE, Blocks.stone, random, world, chunkX, chunkZ, 10, 70, 5, 10, 20); //TODO values in config
    }
}
