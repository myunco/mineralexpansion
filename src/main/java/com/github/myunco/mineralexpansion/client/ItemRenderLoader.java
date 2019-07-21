package com.github.myunco.mineralexpansion.client;

import com.github.myunco.mineralexpansion.block.BlockLoader;
import com.github.myunco.mineralexpansion.item.ItemLoader;

public class ItemRenderLoader {
    public ItemRenderLoader()
    {
        BlockLoader.registerRenders();
        ItemLoader.registerRenders();
    }
}
