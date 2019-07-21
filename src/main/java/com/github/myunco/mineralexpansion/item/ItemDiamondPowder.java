package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemDiamondPowder extends Item {
    public ItemDiamondPowder (){
        super();
        this.setUnlocalizedName("diamondPowder");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
