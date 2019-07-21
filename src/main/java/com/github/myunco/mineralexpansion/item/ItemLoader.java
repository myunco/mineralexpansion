package com.github.myunco.mineralexpansion.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
    public static Item goldDiamond = new ItemGoldDiamond();
    public static Item ironPowder = new ItemIronPowder();
    public static Item goldPowder = new ItemGoldPowder();
    public static Item diamondPowder = new ItemDiamondPowder();
    public static Item mixPowder = new ItemMixPowder();
    public static Item refinedMixPowder = new ItemRefinedMixPowder();
    public static Item refinedMixIngot = new ItemRefinedMixIngot();
    public static Item concentratedMixIngot = new ItemConcentratedMixIngot();
    public static Item concentratedEssence = new ItemConcentratedEssence();
    public static Item mysteriousIngot = new ItemMysteriousIngot();
    public static Item hunluan = new ItemHunluan();
    public static Item mysteriousEssence = new ItemMysteriousEssence();
    public static ItemPickaxe goldDiamondPickaxe = new ItemGoldDiamondPickaxe();
    public static ItemAxe goldDiamondAxe = new ItemGoldDiamondAxe();
    public static ItemSpade goldDiamondShovel = new ItemGoldDiamondShovel();
    public static ItemSword goldDiamondSword = new ItemGoldDiamondSword();
    public static ItemPickaxe refinedMixPickaxe = new ItemRefinedMixPickaxe();
    public static ItemAxe refinedMixAxe = new ItemRefinedMixAxe();
    public static ItemSpade refinedMixShovel = new ItemRefinedMixShovel();
    public static ItemSword refinedMixSword = new ItemRefinedMixSword();
    public static ItemPickaxe mysteriousEssencePickaxe = new ItemMysteriousEssencePickaxe();
    public static ItemSword mysteriousEssenceSword = new ItemMysteriousEssenceSword();
    public static ItemFood diamondBeef = new ItemDiamondBeef();
    public static ItemArmor emeraldHelmet = new ItemEmeraldArmor.Helmet();
    public static ItemArmor emeraldChestplate = new ItemEmeraldArmor.Chestplate();
    public static ItemArmor emeraldLeggings = new ItemEmeraldArmor.Leggings();
    public static ItemArmor emeraldBoots = new ItemEmeraldArmor.Boots();
    public static ItemPickaxe hunluanPickaxe = new ItemHunluanPickaxe();
    public static ItemSword hunluanSword = new ItemHunluanSword();
    public static Item viscousBedrock = new ItemViscousBedrock();
    public static Item hotBedrock = new ItemHotBedrock();
    public static Item bedrockCompound = new ItemBedrockCompound();
    public static Item brokenBedrock = new ItemBrokenBedrock();
    public static ItemArmor bedrockHelmet = new ItemBedrockArmor.Helmet();
    public static ItemArmor bedrockChestplate = new ItemBedrockArmor.Chestplate();
    public static ItemArmor bedrockLeggings = new ItemBedrockArmor.Leggings();
    public static ItemArmor bedrockBoots = new ItemBedrockArmor.Boots();

    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(goldDiamond, "gold_diamond");
        register(ironPowder,"iron_powder");
        register(goldPowder,"gold_powder");
        register(diamondPowder,"diamond_powder");
        register(mixPowder,"mix_powder");
        register(refinedMixPowder,"refined_mix_powder");
        register(refinedMixIngot,"refined_mix_ingot");
        register(concentratedMixIngot,"concentrated_mix_ingot");
        register(concentratedEssence,"concentrated_essence");
        register(mysteriousIngot,"mysterious_ingot");
        register(hunluan,"hunluan");
        register(mysteriousEssence, "mysterious_essence");
        register(goldDiamondPickaxe, "gold_diamond_pickaxe");
        register(goldDiamondAxe, "gold_diamond_axe");
        register(goldDiamondShovel, "gold_diamond_shovel");
        register(goldDiamondSword, "gold_diamond_sword");
        register(refinedMixPickaxe, "refined_mix_pickaxe");
        register(refinedMixAxe, "refined_mix_axe");
        register(refinedMixShovel, "refined_mix_shovel");
        register(refinedMixSword, "refined_mix_sword");
        register(mysteriousEssencePickaxe, "mysterious_essence_pickaxe");
        register(mysteriousEssenceSword, "mysterious_essence_sword");
        register(diamondBeef, "diamond_beef");
        register(emeraldHelmet, "emerald_helmet");
        register(emeraldChestplate, "emerald_chestplate");
        register(emeraldLeggings, "emerald_leggings");
        register(emeraldBoots, "emerald_boots");
        register(hunluanPickaxe, "hunluan_pickaxe");
        register(hunluanSword, "hunluan_sword");
        register(viscousBedrock, "viscous_bedrock");
        register(hotBedrock, "hot_bedrock");
        register(bedrockCompound, "bedrock_compound");
        register(brokenBedrock, "broken_bedrock");
        register(bedrockHelmet, "bedrock_helmet");
        register(bedrockChestplate, "bedrock_chestplate");
        register(bedrockLeggings, "bedrock_leggings");
        register(bedrockBoots, "bedrock_boots");
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(goldDiamond);
        registerRender(ironPowder);
        registerRender(goldPowder);
        registerRender(diamondPowder);
        registerRender(mixPowder);
        registerRender(refinedMixPowder);
        registerRender(refinedMixIngot);
        registerRender(concentratedMixIngot);
        registerRender(concentratedEssence);
        registerRender(mysteriousIngot);
        registerRender(hunluan);
        registerRender(mysteriousEssence);
        registerRender(goldDiamondPickaxe);
        registerRender(goldDiamondAxe);
        registerRender(goldDiamondShovel);
        registerRender(goldDiamondSword);
        registerRender(refinedMixPickaxe);
        registerRender(refinedMixAxe);
        registerRender(refinedMixShovel);
        registerRender(refinedMixSword);
        registerRender(mysteriousEssencePickaxe);
        registerRender(mysteriousEssenceSword);
        registerRender(diamondBeef);
        registerRender(emeraldHelmet);
        registerRender(emeraldChestplate);
        registerRender(emeraldLeggings);
        registerRender(emeraldBoots);
        registerRender(hunluanPickaxe);
        registerRender(hunluanSword);
        registerRender(viscousBedrock);
        registerRender(hotBedrock);
        registerRender(bedrockCompound);
        registerRender(brokenBedrock);
        registerRender(bedrockHelmet);
        registerRender(bedrockChestplate);
        registerRender(bedrockLeggings);
        registerRender(bedrockBoots);
    }

    private static void register(Item item, String name)
    {
        GameRegistry.findRegistry(Item.class).register(item.setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}
