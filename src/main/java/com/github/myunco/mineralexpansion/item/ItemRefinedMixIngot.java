package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemRefinedMixIngot extends Item {
    public ItemRefinedMixIngot (){
        super();
        this.setUnlocalizedName("refinedMixIngot");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
