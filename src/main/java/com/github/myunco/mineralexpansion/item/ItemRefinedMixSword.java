package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemRefinedMixSword extends ItemSword {
    public static final Item.ToolMaterial REFINED = EnumHelper.addToolMaterial("REFINED", 6, 1500, 18.0F, 7.5F, 21);

    public ItemRefinedMixSword (){
        super(REFINED);
        this.setUnlocalizedName("refinedMixSword");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
