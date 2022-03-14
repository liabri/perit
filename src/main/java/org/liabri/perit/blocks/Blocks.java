package org.liabri.perit.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.registry.Registry;
import org.liabri.perit.Perit;
import org.liabri.perit.items.Items;

import java.util.ArrayList;

public class Blocks {
    public static ArrayList<Block> blocks = new ArrayList<>();

    public static void init() {}

    public static Block register(String path, Block block) {
        blocks.add(block);
        return Registry.register(Registry.BLOCK, new Identifier(Perit.MOD_ID, path), block);
    }

    public static Pair<Block, Item> register(String path, Block block, Item item) {
        blocks.add(block);
        return new Pair<>(Registry.register(Registry.BLOCK, new Identifier(Perit.MOD_ID, path), block), Items.registerBlockItem(block, item));
    }

    public static Pair<Block, Item> register(String path, Block block, ItemGroup itemGroup) {
        blocks.add(block);
        return new Pair<>(Registry.register(Registry.BLOCK, new Identifier(Perit.MOD_ID, path), block), Items.registerBlockItem(block, itemGroup));
    }

    public static final Pair<Block, Item> BLUE_NETHER_BRICKS = register("blue_nether_bricks", new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.RED_NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Pair<Block, Item> BLUE_NETHER_BRICK_STAIRS = register("blue_nether_brick_stairs", new StairsBlock(BLUE_NETHER_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copyOf(BLUE_NETHER_BRICKS.getLeft())), ItemGroup.BUILDING_BLOCKS);
    public static final Pair<Block, Item> BLUE_NETHER_BRICK_SLAB = register("blue_nether_brick_slab", new SlabBlock(BLUE_NETHER_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copyOf(BLUE_NETHER_BRICKS.getLeft())), ItemGroup.BUILDING_BLOCKS);
    public static final Pair<Block, Item> BLUE_NETHER_BRICKS_WALL = register("blue_nether_brick_wall", new WallBlock(FabricBlockSettings.copyOf(BLUE_NETHER_BRICKS.getLeft())), ItemGroup.BUILDING_BLOCKS);
}
