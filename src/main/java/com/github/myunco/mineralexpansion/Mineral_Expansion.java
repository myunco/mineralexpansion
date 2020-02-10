package com.github.myunco.mineralexpansion;

import com.github.myunco.mineralexpansion.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author myunco
 */
@Mod(modid = Mineral_Expansion.MODID, name = Mineral_Expansion.NAME, version = Mineral_Expansion.VERSION, acceptedMinecraftVersions = "1.12.2")
public class Mineral_Expansion {
    public static final String MODID = "mineral_expansion";
    public static final String NAME = "Mineral_Expansion";
    public static final String VERSION = "1.0.6";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @SidedProxy(clientSide = "com.github.myunco.mineralexpansion.client.ClientProxy",
            serverSide = "com.github.myunco.mineralexpansion.common.CommonProxy")
    public static CommonProxy proxy;
}
