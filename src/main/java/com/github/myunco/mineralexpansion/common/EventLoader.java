package com.github.myunco.mineralexpansion.common;

import com.github.myunco.mineralexpansion.item.ItemLoader;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;


public class EventLoader {
    public EventLoader() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onBlockEvent(BlockEvent.BreakEvent event) {
        Block block = event.getWorld().getBlockState(event.getPos()).getBlock();
        if (event.getPlayer().getHeldItemMainhand().getUnlocalizedName().equals(ItemLoader.hunluanPickaxe.getUnlocalizedName())) {
            if (block == Blocks.BEDROCK) {
                ItemStack stack = new ItemStack(ItemLoader.brokenBedrock);
                dropStack(event.getWorld(), stack, event.getPos());
            }
        }
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.LeftClickBlock event) {
        Block block = event.getWorld().getBlockState(event.getPos()).getBlock();
        if (block == Blocks.BEDROCK) {
            block.setHardness(-1F);
            if (event.getItemStack().getUnlocalizedName().equals(ItemLoader.hunluanPickaxe.getUnlocalizedName())) {
                if (event.getPos().getY() >= ConfigLoader.lowestHeight) {
                    block.setHardness(144F);
                }
            }
        }
    }

    @SubscribeEvent
    public void onBlockHarvestDrops(BlockEvent.HarvestDropsEvent event) {
        List<ItemStack> item = event.getDrops();
        if (item.size() != 1) {
            return;
        }
        if (item.get(0).getUnlocalizedName().equalsIgnoreCase("tile.bedrock")) {
            item.set(0, new ItemStack(Items.AIR));
        }
    }

    public static void dropStack(World world, ItemStack stack, BlockPos pos) {
        EntityItem itemEntity = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack.copy());
        world.spawnEntity(itemEntity);
    }
}
