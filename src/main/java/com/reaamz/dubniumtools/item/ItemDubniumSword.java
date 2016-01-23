package com.reaamz.dubniumtools.item;

import com.reaamz.dubniumtools.item.generic.GenericModSword;
import com.reaamz.dubniumtools.reference.Names;

public class ItemDubniumSword extends GenericModSword
{
    public ItemDubniumSword(ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName(Names.Items.DUBNIUM_SWORD);
    }
}
