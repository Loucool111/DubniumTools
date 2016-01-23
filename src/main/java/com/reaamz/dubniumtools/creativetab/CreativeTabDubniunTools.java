package com.reaamz.dubniumtools.creativetab;

import com.reaamz.dubniumtools.init.AllModItems;
import com.reaamz.dubniumtools.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabDubniunTools
{

    public static CreativeTabs DUBNIUMTOOLS_TAB;

    public static void init()
    {
        DUBNIUMTOOLS_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
        {
            @Override
            public Item getTabIconItem()
            {
                return AllModItems.DUBNIUM_INGOT;
            }
        };
    }
}
