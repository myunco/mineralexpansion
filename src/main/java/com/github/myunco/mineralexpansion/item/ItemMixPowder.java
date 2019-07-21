package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemMixPowder extends Item {
    public ItemMixPowder (){
        super();
        this.setUnlocalizedName("mixPowder");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
