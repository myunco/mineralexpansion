package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemConcentratedMixIngot extends Item {
    public ItemConcentratedMixIngot (){
        super();
        this.setUnlocalizedName("concentratedMixIngot");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
