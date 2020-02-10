package com.github.myunco.mineralexpansion.worldgen;

import com.github.myunco.mineralexpansion.block.BlockLoader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OreGenEventHandler {
	private static WorldGenerator worldGenMinable = new WorldGenMinable(BlockLoader.mysteriousOre.getDefaultState(), 3);
	public OreGenEventHandler()
	{
		MinecraftForge.ORE_GEN_BUS.register(this);
	}
	@SubscribeEvent
	public void onGenerateMinable(OreGenEvent.GenerateMinable event)
	{
        if(event.getRand().nextInt(5) == 3) {
            int posX = event.getPos().getX() + event.getRand().nextInt(16);
            int posY = 7 + event.getRand().nextInt(7);
            int posZ = event.getPos().getZ() + event.getRand().nextInt(16);
            BlockPos blockpos = new BlockPos(posX, posY, posZ);
            worldGenMinable.generate(event.getWorld(), event.getRand(), blockpos);
        }
    }
}