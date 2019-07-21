package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemIronPowder extends Item {
    public ItemIronPowder (){
        super();
        this.setUnlocalizedName("ironPowder");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
