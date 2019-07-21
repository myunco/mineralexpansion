package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ItemGoldDiamondShovel extends ItemSpade {
    public static final Item.ToolMaterial GOLDDIAMOND = EnumHelper.addToolMaterial("GOLDDIAMOND", 4, 1000, 12.0F, 3.0F, 14);

    public ItemGoldDiamondShovel (){
        super(GOLDDIAMOND);
        this.setUnlocalizedName("goldDiamondShovel");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
