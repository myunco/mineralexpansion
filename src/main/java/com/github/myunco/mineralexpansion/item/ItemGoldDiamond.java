package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemGoldDiamond extends Item {
    public ItemGoldDiamond (){
        super();
        this.setUnlocalizedName("goldDiamond");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
