package com.github.myunco.mineralexpansion.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader {
    public static CreativeTabs MineralExpansion;

    public CreativeTabsLoader(FMLPreInitializationEvent event)
    {
        MineralExpansion = new CreativeTabsMineralExpansion();
    }
}
