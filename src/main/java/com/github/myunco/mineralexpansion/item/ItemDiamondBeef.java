package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemDiamondBeef extends ItemFood {
    public ItemDiamondBeef (){
        super(40,7.0F,true);
        this.setUnlocalizedName("diamondBeef");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
