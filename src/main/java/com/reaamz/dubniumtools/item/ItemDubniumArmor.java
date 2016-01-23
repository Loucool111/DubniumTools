package com.reaamz.dubniumtools.item;

import com.reaamz.dubniumtools.init.AllModItems;
import com.reaamz.dubniumtools.item.generic.GenericModArmor;
import com.reaamz.dubniumtools.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemDubniumArmor extends GenericModArmor
{
    public ItemDubniumArmor(ArmorMaterial material, int p_i45325_2_, int part)
    {
        super(material, p_i45325_2_, part);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem().equals(AllModItems.DUBNIUM_HELMET) || stack.getItem().equals(AllModItems.DUBNIUM_CHESTPLATE) || stack.getItem().equals(AllModItems.DUBNIUM_BOOTS))
            return Reference.MODEL_PREFIX + "DubniumArmor1.png";
        else if (stack.getItem().equals(AllModItems.DUBNIUM_PANTS))
            return Reference.MODEL_PREFIX + "DubniumArmor2.png";
        else return null;
    }
}
