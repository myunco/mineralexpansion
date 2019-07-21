package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemConcentratedEssence extends Item {
    public ItemConcentratedEssence (){
        super();
        this.setUnlocalizedName("concentratedEssence");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
