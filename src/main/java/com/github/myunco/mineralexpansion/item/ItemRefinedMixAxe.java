package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemRefinedMixAxe extends ItemAxe {
    public static final Item.ToolMaterial REFINED = EnumHelper.addToolMaterial("REFINED", 6, 1500, 18.0F, 4.5F, 21);

    public ItemRefinedMixAxe (){
        super(REFINED,12,-2.5F);
        this.setUnlocalizedName("refinedMixAxe");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
