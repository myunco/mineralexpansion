package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemRefinedMixPowder extends Item {
    public ItemRefinedMixPowder (){
        super();
        this.setUnlocalizedName("refinedMixPowder");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
