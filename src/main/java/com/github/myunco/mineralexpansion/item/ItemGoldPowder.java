package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemGoldPowder extends Item {
    public ItemGoldPowder (){
        super();
        this.setUnlocalizedName("goldPowder");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
