package com.reaamz.dubniumtools.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class AllModRecipes
{
    public static void init()
    {
        //Normal
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModBlocks.DUBNIUM_BLOCK, "ddd", "ddd", "ddd", 'd', AllModItems.DUBNIUM_INGOT));

        //Tools
        //pick
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_PICKAXE, "ddd", " s ", " s ", 'd', AllModItems.DUBNIUM_INGOT, 's', Items.stick));
        //axe 1 et 2
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_AXE, " dd", " sd", " s ", 'd', AllModItems.DUBNIUM_INGOT, 's', Items.stick));
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_AXE, "dd ", "ds ", " s ", 'd', AllModItems.DUBNIUM_INGOT, 's', Items.stick));
        //hoe 1 et 2
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_HOE, " dd", " s ", " s ", 'd', AllModItems.DUBNIUM_INGOT, 's', Items.stick));
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_HOE, "dd ", " s ", " s ", 'd', AllModItems.DUBNIUM_INGOT, 's', Items.stick));
        //sword
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_SWORD, " d ", " d ", " s ", 'd', AllModItems.DUBNIUM_INGOT, 's', Items.stick));
        //spade
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_SPADE, " d ", " s ", " s ", 'd', AllModItems.DUBNIUM_INGOT, 's', Items.stick));

        //Armor
        //helmet 1 et 2
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_HELMET, "ddd", "d d", "   ", 'd', AllModItems.DUBNIUM_INGOT));
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_HELMET, "   ", "ddd", "d d", 'd', AllModItems.DUBNIUM_INGOT));
        //chestplate
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_CHESTPLATE, "d d", "ddd", "ddd", 'd', AllModItems.DUBNIUM_INGOT));
        //pants
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_PANTS, "ddd", "d d", "d d", 'd', AllModItems.DUBNIUM_INGOT));
        //boots 1 et 2
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_BOOTS, "d d", "d d", "   ", 'd', AllModItems.DUBNIUM_INGOT));
        GameRegistry.addRecipe(new ShapedOreRecipe(AllModItems.DUBNIUM_BOOTS, "   ", "d d", "d d", 'd', AllModItems.DUBNIUM_INGOT));
    }
}
