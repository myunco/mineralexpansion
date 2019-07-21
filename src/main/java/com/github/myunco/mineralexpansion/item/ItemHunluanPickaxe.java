package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemHunluanPickaxe extends ItemPickaxe {
    public static final Item.ToolMaterial HUNLUAN = EnumHelper.addToolMaterial("HUNLUAN", 7, 1, 21.0F, 7.0F, 12);

    public ItemHunluanPickaxe (){
        super(HUNLUAN);
        this.setUnlocalizedName("hunluanPickaxe");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
