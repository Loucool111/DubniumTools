package com.reaamz.dubniumtools.worldgen;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorld
{
    public static void initWorldGen()
    {
        registerWorldGen(new DubniumOreWorldGen(), 1);
    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weight)
    {
        GameRegistry.registerWorldGenerator(worldGenClass, weight);
    }
}
