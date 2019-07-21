package com.github.myunco.mineralexpansion.worldgen;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGeneratorOre extends WorldGenerator {

    private final WorldGenerator oreGenerator = new WorldGenMinable(Blocks.EMERALD_BLOCK.getDefaultState(), 16);

    @Override
    public boolean generate(World world, Random rand, BlockPos pos)
    {
        int posX = pos.getX() + rand.nextInt(16);
        int posY = 7 + rand.nextInt(7);
        int posZ = pos.getZ() + rand.nextInt(16);
        BlockPos blockpos = new BlockPos(posX, posY, posZ);
        if (rand.nextInt(9) == 7) {
            boolean bool;
            bool = oreGenerator.generate(world, rand, blockpos);
        }
        return true;
    }

}
