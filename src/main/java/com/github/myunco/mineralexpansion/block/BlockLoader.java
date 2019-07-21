package com.github.myunco.mineralexpansion.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
    public static Block mysteriousOre = new BlockMysteriousOre();

    public BlockLoader(FMLPreInitializationEvent event)
    {
        register(mysteriousOre, "mysterious_ore");
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(mysteriousOre);
    }
    private static void register(Block block, String name)
    {
        GameRegistry.findRegistry(Block.class).register(block.setRegistryName(name));
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(name));
    }
    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
    }
}
