package com.github.myunco.mineralexpansion.item;

import com.github.myunco.mineralexpansion.Mineral_Expansion;
import com.github.myunco.mineralexpansion.creativetab.CreativeTabsLoader;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemEmeraldArmor extends ItemArmor {
    public static final ItemArmor.ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial("EMERALD",
            Mineral_Expansion.MODID + ":" + "emerald",
            40, new int[]{3, 7, 7, 3},
            30,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3.5F);

    public ItemEmeraldArmor(EntityEquipmentSlot equipmentSlot) {
        super(EMERALD_ARMOR, EMERALD_ARMOR.ordinal(), equipmentSlot);
    }

    public static class Helmet extends ItemEmeraldArmor {
        public Helmet() {
            super(EntityEquipmentSlot.HEAD);
            this.setUnlocalizedName("emeraldHelmet");
            this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
        }
    }

    public static class Chestplate extends ItemEmeraldArmor {
        public Chestplate() {
            super(EntityEquipmentSlot.CHEST);
            this.setUnlocalizedName("emeraldChestplate");
            this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
        }
    }

    public static class Leggings extends ItemEmeraldArmor {
        public Leggings() {
            super(EntityEquipmentSlot.LEGS);
            this.setUnlocalizedName("emeraldLeggings");
            this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
        }
    }

    public static class Boots extends ItemEmeraldArmor {
        public Boots() {
            super(EntityEquipmentSlot.FEET);
            this.setUnlocalizedName("emeraldBoots");
            this.setCreativeTab(CreativeTabsLoader.MineralExpansion);
        }
    }
}