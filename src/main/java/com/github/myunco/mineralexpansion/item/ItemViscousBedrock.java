package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemViscousBedrock extends Item {
    public ItemViscousBedrock (){
        super();
        this.setUnlocalizedName("viscousBedrock");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
