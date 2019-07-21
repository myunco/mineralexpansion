package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemBedrockCompound extends Item {
    public ItemBedrockCompound (){
        super();
        this.setUnlocalizedName("bedrockCompound");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
