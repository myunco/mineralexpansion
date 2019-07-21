package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemGoldDiamondAxe extends ItemAxe {
    public static final Item.ToolMaterial GOLDDIAMOND = EnumHelper.addToolMaterial("GOLDDIAMOND", 4, 1000, 12.0F, 3.0F, 14);

    public ItemGoldDiamondAxe (){
        super(GOLDDIAMOND,8,-3.0F);
        this.setUnlocalizedName("goldDiamondAxe");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
