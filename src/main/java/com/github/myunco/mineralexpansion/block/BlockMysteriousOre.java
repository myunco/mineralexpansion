package com.github.myunco.mineralexpansion.block;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMysteriousOre extends Block {
    public BlockMysteriousOre()
    {
        super(Material.ROCK);
        this.setUnlocalizedName("mysteriousOre");
        this.setHarvestLevel("pickaxe", 4);
        this.setHardness(3F);
        this.setResistance(15F);
        this.setLightLevel(0.1F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
