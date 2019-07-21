package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemHotBedrock extends Item {
    public ItemHotBedrock (){
        super();
        this.setUnlocalizedName("hotBedrock");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
