package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMysteriousEssenceSword extends ItemSword {
    public static final Item.ToolMaterial REFINED = EnumHelper.addToolMaterial("REFINED", 7, 2250, 27.0F, 12.0F, 32);

    public ItemMysteriousEssenceSword (){
        super(REFINED);
        this.setUnlocalizedName("mysteriousEssenceSword");
        this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
    }
}
