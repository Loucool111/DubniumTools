package com.reaamz.dubniumtools.init;

import com.reaamz.dubniumtools.block.BlockDubniumBlock;
import com.reaamz.dubniumtools.block.BlockDubniumOre;
import com.reaamz.dubniumtools.block.GenericModBlock;
import com.reaamz.dubniumtools.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class AllModBlocks
{
    public static final GenericModBlock DUBNIUM_BLOCK = new BlockDubniumBlock();
    public static final GenericModBlock DUBNIUM_ORE = new BlockDubniumOre();

    public static void init()
    {
        GameRegistry.registerBlock(DUBNIUM_BLOCK, Names.Blocks.DUBNIUM_BLOCK);
        GameRegistry.registerBlock(DUBNIUM_ORE, Names.Blocks.ORE_BLOCK);
    }
}
