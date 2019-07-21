package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ItemRefinedMixShovel extends ItemSpade {
    public static final Item.ToolMaterial REFINED = EnumHelper.addToolMaterial("REFINED", 6, 1500, 18.0F, 4.5F, 21);

    public ItemRefinedMixShovel (){
        super(REFINED);
        this.setUnlocalizedName("refinedMixShovel");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
