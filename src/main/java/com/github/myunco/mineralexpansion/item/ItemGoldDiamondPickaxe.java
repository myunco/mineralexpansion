package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemGoldDiamondPickaxe extends ItemPickaxe {
    public static final Item.ToolMaterial GOLDDIAMOND = EnumHelper.addToolMaterial("GOLDDIAMOND", 4, 1000, 12.0F, 3.0F, 14);

    public ItemGoldDiamondPickaxe (){
        super(GOLDDIAMOND);
        this.setUnlocalizedName("goldDiamondPickaxe");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
