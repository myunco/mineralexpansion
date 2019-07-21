package com.github.myunco.mineralexpansion.crafting;

import com.github.myunco.mineralexpansion.block.BlockLoader;
import com.github.myunco.mineralexpansion.common.ConfigLoader;
import com.github.myunco.mineralexpansion.item.ItemLoader;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader {
    public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
    }

    private static void registerRecipe()
    {
        GameRegistry.addShapelessRecipe(new ResourceLocation("mineral_expansion:gold_diamond"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.goldDiamond), Ingredient.fromStacks(new ItemStack(Items.GOLD_INGOT)), Ingredient.fromStacks(new ItemStack(Items.DIAMOND)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:iron_powder"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.ironPowder,3), "III", 'I', Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:gold_powder"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.goldPowder,3), "GGG", 'G', Ingredient.fromStacks(new ItemStack(Items.GOLD_INGOT)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:diamond_powder"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.diamondPowder,3), "DDD", 'D', Ingredient.fromStacks(new ItemStack(Items.DIAMOND)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:diamond"), new ResourceLocation("recipe"), new ItemStack(Items.DIAMOND,1), "d", 'd', Ingredient.fromStacks(new ItemStack(ItemLoader.diamondPowder)));
        GameRegistry.addShapelessRecipe(new ResourceLocation("mineral_expansion:mix_powder"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.mixPowder), Ingredient.fromStacks(new ItemStack(ItemLoader.ironPowder)), Ingredient.fromStacks(new ItemStack(ItemLoader.goldPowder)), Ingredient.fromStacks(new ItemStack(ItemLoader.diamondPowder)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:refined_mix_ingot"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.refinedMixIngot), "rrr", "rrr", "rrr", 'r', Ingredient.fromStacks(new ItemStack(ItemLoader.refinedMixPowder)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:concentrated_mix_ingot"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.concentratedMixIngot), "rrr", "rrr", "rrr", 'r', Ingredient.fromStacks(new ItemStack(ItemLoader.refinedMixIngot)));
        GameRegistry.addShapelessRecipe(new ResourceLocation("mineral_expansion:mysterious_essence"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.mysteriousEssence), Ingredient.fromStacks(new ItemStack(ItemLoader.mysteriousIngot)),Ingredient.fromStacks(new ItemStack(ItemLoader.concentratedEssence)));
        if (ConfigLoader.regHunluanRecipe) {
            GameRegistry.addShapelessRecipe(new ResourceLocation("mineral_expansion:hunluan"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.hunluan), Ingredient.fromStacks(new ItemStack(Items.SUGAR)), Ingredient.fromStacks(new ItemStack(Items.GLOWSTONE_DUST)), Ingredient.fromStacks(new ItemStack(ItemLoader.goldPowder)),
                    Ingredient.fromStacks(new ItemStack(ItemLoader.ironPowder)), Ingredient.fromStacks(new ItemStack(Items.GUNPOWDER)), Ingredient.fromStacks(new ItemStack(ItemLoader.diamondPowder)), Ingredient.fromStacks(new ItemStack(ItemLoader.mixPowder)), Ingredient.fromStacks(new ItemStack(Items.REDSTONE)), Ingredient.fromStacks(new ItemStack(ItemLoader.refinedMixPowder)));
        }
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:gold_diamond_pickaxe"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.goldDiamondPickaxe), "ggg", " S ", " S ", 'g', Ingredient.fromStacks(new ItemStack(ItemLoader.goldDiamond)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:gold_diamond_axe"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.goldDiamondAxe), "gg ", "gS ", " S ", 'g', Ingredient.fromStacks(new ItemStack(ItemLoader.goldDiamond)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:gold_diamond_shovel"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.goldDiamondShovel), " g ", " S ", " S ", 'g', Ingredient.fromStacks(new ItemStack(ItemLoader.goldDiamond)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:gold_diamond_sword"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.goldDiamondSword), " g ", " g ", " S ", 'g', Ingredient.fromStacks(new ItemStack(ItemLoader.goldDiamond)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:refined_mix_pickaxe"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.refinedMixPickaxe), "rrr", " S ", " S ", 'r', Ingredient.fromStacks(new ItemStack(ItemLoader.refinedMixIngot)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:refined_mix_axe"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.refinedMixAxe), "rr ", "rS ", " S ", 'r', Ingredient.fromStacks(new ItemStack(ItemLoader.refinedMixIngot)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:refined_mix_shovel"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.refinedMixShovel), " r ", " S ", " S ", 'r', Ingredient.fromStacks(new ItemStack(ItemLoader.refinedMixIngot)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:refined_mix_sword"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.refinedMixSword), " r ", " r ", " S ", 'r', Ingredient.fromStacks(new ItemStack(ItemLoader.refinedMixIngot)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:mysterious_essence_pickaxe"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.mysteriousEssencePickaxe), "mmm", " S ", " S ", 'm', Ingredient.fromStacks(new ItemStack(ItemLoader.mysteriousEssence)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:mysterious_essence_sword"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.mysteriousEssenceSword), " m ", " m ", " S ", 'm', Ingredient.fromStacks(new ItemStack(ItemLoader.mysteriousEssence)), 'S', Ingredient.fromStacks(new ItemStack(Items.STICK)));
        if(ConfigLoader.regDiamondBeefRecipe) {
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:diamond_beef"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.diamondBeef), " C ", "DDD", 'D', Ingredient.fromStacks(new ItemStack(Items.DIAMOND)), 'C', Ingredient.fromStacks(new ItemStack(Items.COOKED_BEEF)));
        }
        if(ConfigLoader.regEmeraldArmorRecipe){
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:emerald_helmet"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.emeraldHelmet), "EEE", "E E", 'E', Ingredient.fromStacks(new ItemStack(Items.EMERALD)));
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:emerald_chestplate"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.emeraldChestplate), "E E", "EEE", "EEE", 'E', Ingredient.fromStacks(new ItemStack(Items.EMERALD)));
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:emerald_leggings"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.emeraldLeggings), "EEE", "E E", "E E", 'E', Ingredient.fromStacks(new ItemStack(Items.EMERALD)));
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:emerald_boots"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.emeraldBoots), "E E", "E E", 'E', Ingredient.fromStacks(new ItemStack(Items.EMERALD)));
        }
        if(ConfigLoader.regHunluanPickaxeRecipe) {
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:hunluan_pickaxe"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.hunluanPickaxe), "hhh", " h ", " h ", 'h', Ingredient.fromStacks(new ItemStack(ItemLoader.hunluan)));
        }
        if(ConfigLoader.regHunluanSwordRecipe) {
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:hunluan_sword"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.hunluanSword), " h ", " h ", " h ", 'h', Ingredient.fromStacks(new ItemStack(ItemLoader.hunluan)));
        }
        GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:viscous_bedrock"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.viscousBedrock), " C ", "CbC", " C ", 'b',Ingredient.fromStacks(new ItemStack(ItemLoader.brokenBedrock)),'C',Ingredient.fromStacks(new ItemStack(Items.CLAY_BALL)));
        GameRegistry.addShapelessRecipe(new ResourceLocation("mineral_expansion:bedrock_compound"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.bedrockCompound), Ingredient.fromStacks(new ItemStack(ItemLoader.hotBedrock)),Ingredient.fromStacks(new ItemStack(ItemLoader.refinedMixPowder)),Ingredient.fromStacks(new ItemStack(ItemLoader.mysteriousIngot)));
        if(ConfigLoader.regBedrockArmorRecipe){
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:bedrock_helmet"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.bedrockHelmet), "bbb", "b b", 'b', Ingredient.fromStacks(new ItemStack(ItemLoader.bedrockCompound)));
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:bedrock_chestplate"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.bedrockChestplate), "b b", "bbb", "bbb", 'b', Ingredient.fromStacks(new ItemStack(ItemLoader.bedrockCompound)));
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:bedrock_leggings"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.bedrockLeggings), "bbb", "b b", "b b", 'b', Ingredient.fromStacks(new ItemStack(ItemLoader.bedrockCompound)));
            GameRegistry.addShapedRecipe(new ResourceLocation("mineral_expansion:bedrock_boots"), new ResourceLocation("recipe"), new ItemStack(ItemLoader.bedrockBoots), "b b", "b b", 'b', Ingredient.fromStacks(new ItemStack(ItemLoader.bedrockCompound)));
        }
    }

    private static void registerSmelting()
    {
        GameRegistry.addSmelting(ItemLoader.ironPowder, new ItemStack(Items.IRON_INGOT), 1.0F);
        GameRegistry.addSmelting(ItemLoader.goldPowder, new ItemStack(Items.GOLD_INGOT), 1.0F);
        GameRegistry.addSmelting(ItemLoader.mixPowder, new ItemStack(ItemLoader.refinedMixPowder), 3.0F);
        GameRegistry.addSmelting(ItemLoader.concentratedMixIngot, new ItemStack(ItemLoader.concentratedEssence), 14F);
        GameRegistry.addSmelting(BlockLoader.mysteriousOre, new ItemStack(ItemLoader.mysteriousIngot), 10.0F);
        GameRegistry.addSmelting(ItemLoader.viscousBedrock, new ItemStack(ItemLoader.hotBedrock), 7.0F);

    }

}
