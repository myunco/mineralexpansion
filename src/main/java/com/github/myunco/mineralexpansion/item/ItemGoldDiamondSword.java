package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemGoldDiamondSword extends ItemSword {
    public static final Item.ToolMaterial GOLDDIAMOND = EnumHelper.addToolMaterial("GOLDDIAMOND", 4, 1000, 12.0F, 5.0F, 14);

    public ItemGoldDiamondSword (){
        super(GOLDDIAMOND);
        this.setUnlocalizedName("goldDiamondSword");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
