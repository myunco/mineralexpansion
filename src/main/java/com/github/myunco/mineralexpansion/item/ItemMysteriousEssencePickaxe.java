package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMysteriousEssencePickaxe extends ItemPickaxe {
    public static final Item.ToolMaterial ESSENCE = EnumHelper.addToolMaterial("ESSENCE", 7, 2250, 27.0F, 7.0F, 32);

    public ItemMysteriousEssencePickaxe (){
        super(ESSENCE);
        this.setUnlocalizedName("mysteriousEssencePickaxe");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
