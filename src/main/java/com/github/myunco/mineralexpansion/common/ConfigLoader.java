package com.github.myunco.mineralexpansion.common;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

public class ConfigLoader {
    private static Configuration config;
    private static Logger logger;
    public static boolean regHunluanRecipe;
    public static boolean regDiamondBeefRecipe;
    public static int lowestHeight;
    public static boolean regEmeraldArmorRecipe;
    public static boolean regHunluanPickaxeRecipe;
    public static boolean regHunluanSwordRecipe;
    public static boolean regBedrockArmorRecipe;

    public ConfigLoader(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        load();
    }

    public static void load()
    {
        logger.info("Started loading config... ");
        regHunluanRecipe = config.get(Configuration.CATEGORY_GENERAL, "RegHunluanRecipe", true,  "是否允许合成 混乱 ").getBoolean();
        regDiamondBeefRecipe = config.get(Configuration.CATEGORY_GENERAL, "RegDiamondBeefRecipe", true, "是否允许合成 钻石牛排 ").getBoolean();
        regEmeraldArmorRecipe = config.get(Configuration.CATEGORY_GENERAL, "RegEmeraldArmorRecipe", true, "是否允许合成 绿宝石套 ").getBoolean();
        regBedrockArmorRecipe = config.get(Configuration.CATEGORY_GENERAL, "RegBedrockArmorRecipe", true, "是否允许合成 基岩套 ").getBoolean();
        regHunluanPickaxeRecipe = config.get(Configuration.CATEGORY_GENERAL, "RegHunluanPickaxeRecipe", true, "是否允许合成 混乱之镐 ").getBoolean();
        regHunluanSwordRecipe = config.get(Configuration.CATEGORY_GENERAL, "RegHunluanSwordRecipe", true, "是否允许合成 混乱之剑 ").getBoolean();
        lowestHeight = config.get(Configuration.CATEGORY_GENERAL, "lowestHeight", 1, "可挖基岩的最低高度 Y ").getInt();

        if(config.getConfigFile().length() < 456) {
            logger.info("Saving config file... ");
            config.save();
            logger.info("Saved config file. ");
        }
        logger.info("Finished loading config. ");
    }

    public static Logger logger()
    {
        return logger;
    }
}
