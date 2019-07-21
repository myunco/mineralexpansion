package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemMysteriousEssence extends Item {
    public ItemMysteriousEssence (){
        super();
        this.setUnlocalizedName("mysteriousEssence");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
