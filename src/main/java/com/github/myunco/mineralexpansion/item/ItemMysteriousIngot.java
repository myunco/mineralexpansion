package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemMysteriousIngot extends Item {
    public ItemMysteriousIngot (){
        super();
        this.setUnlocalizedName("mysteriousIngot");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
