package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemHunluan extends Item {
    public ItemHunluan (){
        super();
        this.setUnlocalizedName("hunluan");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
