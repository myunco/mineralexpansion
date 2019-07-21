package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemBrokenBedrock extends Item {
    public ItemBrokenBedrock (){
        super();
        this.setUnlocalizedName("brokenBedrock");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
