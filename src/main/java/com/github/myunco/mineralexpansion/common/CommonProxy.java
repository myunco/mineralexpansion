package com.github.myunco.mineralexpansion.common;

import com.github.myunco.mineralexpansion.block.BlockLoader;
import com.github.myunco.mineralexpansion.crafting.CraftingLoader;
import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import com.github.myunco.mineralexpansion.item.ItemLoader;
import com.github.myunco.mineralexpansion.worldgen.OreGenEventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        new ConfigLoader(event);
        new CreativeTabsLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
    }

    public void init(FMLInitializationEvent event) {
        new CraftingLoader();
        new EventLoader();
        new OreGenEventHandler();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
