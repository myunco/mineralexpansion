package com.github.myunco.mineralexpansion.creativetab;

import com.github.myunco.mineralexpansion.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsMineralExpansion extends CreativeTabs {
    public CreativeTabsMineralExpansion()
    {
        super(CreativeTabs.getNextID(),"MineralExpansion");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemLoader.goldDiamond);
    }
}