package com.reaamz.dubniumtools.item;

import com.reaamz.dubniumtools.reference.Names;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class DubniumMaterials
{
    public static ToolMaterial DUBNIUM_TOOLMATERIAL = EnumHelper.addToolMaterial(Names.Misc.TOOLMATERIAL_NAME, 3, 2000, 15.0F, 8.0F, 10);
    public static ItemArmor.ArmorMaterial DUBNIUM_ARMORMATERIAL = EnumHelper.addArmorMaterial(Names.Misc.ARMORMATERIAL_NAME, 50, new int[]{ 3, 5 ,4 ,2}, 10);
}
