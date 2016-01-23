package com.reaamz.dubniumtools.init;

import com.reaamz.dubniumtools.DubniumTools;
import com.reaamz.dubniumtools.item.*;
import com.reaamz.dubniumtools.item.generic.*;
import com.reaamz.dubniumtools.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class AllModItems
{
    public static final GenericModItem DUBNIUM_INGOT = new ItemDubniumIngot();

    //Tools
    public static final GenericModPickaxe DUBNIUM_PICKAXE = new ItemDubniumPickaxe(DubniumMaterials.DUBNIUM_TOOLMATERIAL);
    public static final GenericModSword DUBNIUM_SWORD = new ItemDubniumSword(DubniumMaterials.DUBNIUM_TOOLMATERIAL);
    public static final GenericModSpade DUBNIUM_SPADE = new ItemDubniumSpade(DubniumMaterials.DUBNIUM_TOOLMATERIAL);
    public static final GenericModHoe DUBNIUM_HOE = new ItemDubniumHoe(DubniumMaterials.DUBNIUM_TOOLMATERIAL);
    public static final GenericModAxe DUBNIUM_AXE = new ItemDubniumAxe(DubniumMaterials.DUBNIUM_TOOLMATERIAL);

    //Armor
    public static final GenericModArmor DUBNIUM_HELMET = (GenericModArmor)new ItemDubniumArmor(DubniumMaterials.DUBNIUM_ARMORMATERIAL, DubniumTools.proxy.addArmor(Names.Misc.ARMOR_PROXY_NAME), 0).setUnlocalizedName(Names.Items.DUBNIUM_HELMET);
    public static final GenericModArmor DUBNIUM_CHESTPLATE = (GenericModArmor)new ItemDubniumArmor(DubniumMaterials.DUBNIUM_ARMORMATERIAL, DubniumTools.proxy.addArmor(Names.Misc.ARMOR_PROXY_NAME), 1).setUnlocalizedName(Names.Items.DUBNIUM_CHESTPLATE);
    public static final GenericModArmor DUBNIUM_PANTS = (GenericModArmor)new ItemDubniumArmor(DubniumMaterials.DUBNIUM_ARMORMATERIAL, DubniumTools.proxy.addArmor(Names.Misc.ARMOR_PROXY_NAME), 2).setUnlocalizedName(Names.Items.DUBNIUM_PANTS);
    public static final GenericModArmor DUBNIUM_BOOTS = (GenericModArmor)new ItemDubniumArmor(DubniumMaterials.DUBNIUM_ARMORMATERIAL, DubniumTools.proxy.addArmor(Names.Misc.ARMOR_PROXY_NAME), 3).setUnlocalizedName(Names.Items.DUBNIUM_BOOTS);


    public static void init()
    {
        GameRegistry.registerItem(DUBNIUM_INGOT, Names.Items.DUBNIUM_INGOT);

        //Tools
        GameRegistry.registerItem(DUBNIUM_PICKAXE, Names.Items.DUBNUIM_PICKAXE);
        GameRegistry.registerItem(DUBNIUM_SWORD, Names.Items.DUBNIUM_SWORD);
        GameRegistry.registerItem(DUBNIUM_SPADE, Names.Items.DUBNIUM_SPADE);
        GameRegistry.registerItem(DUBNIUM_HOE, Names.Items.DUBNIUM_HOE);
        GameRegistry.registerItem(DUBNIUM_AXE, Names.Items.DUBNIUM_AXE);

        //Armor
        GameRegistry.registerItem(DUBNIUM_HELMET, Names.Items.DUBNIUM_HELMET);
        GameRegistry.registerItem(DUBNIUM_CHESTPLATE, Names.Items.DUBNIUM_CHESTPLATE);
        GameRegistry.registerItem(DUBNIUM_PANTS, Names.Items.DUBNIUM_PANTS);
        GameRegistry.registerItem(DUBNIUM_BOOTS, Names.Items.DUBNIUM_BOOTS);
    }

}
