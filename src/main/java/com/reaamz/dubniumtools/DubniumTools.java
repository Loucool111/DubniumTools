package com.reaamz.dubniumtools;

import com.reaamz.dubniumtools.config.ConfigurationHandler;
import com.reaamz.dubniumtools.creativetab.CreativeTabDubniunTools;
import com.reaamz.dubniumtools.init.AllModBlocks;
import com.reaamz.dubniumtools.init.AllModItems;
import com.reaamz.dubniumtools.init.AllModRecipes;
import com.reaamz.dubniumtools.proxy.IProxy;
import com.reaamz.dubniumtools.reference.Reference;
import com.reaamz.dubniumtools.utils.LogHelper;
import com.reaamz.dubniumtools.worldgen.ModWorld;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class DubniumTools
{
    @Mod.Instance(Reference.MOD_ID)
    public static DubniumTools instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        //proxy things...

        CreativeTabDubniunTools.init();

        AllModItems.init();

        AllModBlocks.init();

        ModWorld.initWorldGen();

        LogHelper.info("PreInit done!");
    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event)
    {
        AllModRecipes.init();

        LogHelper.info("Init done!");
    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInit done!");
    }
}
