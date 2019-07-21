package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.Mineral_Expansion;
import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBedrockArmor extends ItemArmor {
    public static final ItemArmor.ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial("BEDROCK",
            Mineral_Expansion.MODID + ":" + "bedrock",
            77, new int[]{3, 7, 7, 3},
            40,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            7.0F);

    public ItemBedrockArmor(EntityEquipmentSlot equipmentSlot) {
        super(EMERALD_ARMOR, EMERALD_ARMOR.ordinal(), equipmentSlot);
    }

    public static class Helmet extends ItemBedrockArmor {
        public Helmet() {
            super(EntityEquipmentSlot.HEAD);
            this.setUnlocalizedName("bedrockHelmet");
            this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
        }
    }

    public static class Chestplate extends ItemBedrockArmor {
        public Chestplate() {
            super(EntityEquipmentSlot.CHEST);
            this.setUnlocalizedName("bedrockChestplate");
            this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
        }
    }

    public static class Leggings extends ItemBedrockArmor {
        public Leggings() {
            super(EntityEquipmentSlot.LEGS);
            this.setUnlocalizedName("bedrockLeggings");
            this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
        }
    }

    public static class Boots extends ItemBedrockArmor {
        public Boots() {
            super(EntityEquipmentSlot.FEET);
            this.setUnlocalizedName("bedrockBoots");
            this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
        }
    }
}