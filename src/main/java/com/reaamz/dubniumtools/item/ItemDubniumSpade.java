package com.reaamz.dubniumtools.item;

import com.reaamz.dubniumtools.item.generic.GenericModSpade;
import com.reaamz.dubniumtools.reference.Names;

public class ItemDubniumSpade extends GenericModSpade
{
    public ItemDubniumSpade(ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName(Names.Items.DUBNIUM_SPADE);
    }
}
