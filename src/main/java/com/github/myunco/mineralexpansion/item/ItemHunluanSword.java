package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemHunluanSword extends ItemSword {
    public static final Item.ToolMaterial HUNLUAN = EnumHelper.addToolMaterial("HUNLUAN", 7, 1, 28.0F, 119.0F, 40);

    public ItemHunluanSword (){
        super(HUNLUAN);
        this.setUnlocalizedName("hunluanSword");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
