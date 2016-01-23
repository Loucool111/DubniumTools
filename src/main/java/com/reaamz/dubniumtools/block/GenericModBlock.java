package com.reaamz.dubniumtools.block;

import com.reaamz.dubniumtools.creativetab.CreativeTabDubniunTools;
import com.reaamz.dubniumtools.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class GenericModBlock extends Block
{
    public GenericModBlock(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabDubniunTools.DUBNIUMTOOLS_TAB);
    }

    public GenericModBlock()
    {
        super(Material.grass);
        this.setCreativeTab(CreativeTabDubniunTools.DUBNIUMTOOLS_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
