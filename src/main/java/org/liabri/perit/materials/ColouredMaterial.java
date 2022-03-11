package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.liabri.perit.blocks.Blocks;
import org.liabri.perit.blocks.StairsBlock;

import java.lang.reflect.Constructor;

public class ColouredMaterial {
    public final Pair<Block, Item> DEFAULT;
    public final Pair<Block, Item> BLACK;
    public final Pair<Block, Item> BLUE;
    public final Pair<Block, Item> BROWN;
    public final Pair<Block, Item> CYAN;
    public final Pair<Block, Item> GREEN;
    public final Pair<Block, Item> GREY;
    public final Pair<Block, Item> LIGHT_BLUE;
    public final Pair<Block, Item> LIGHT_GREY;
    public final Pair<Block, Item> LIME;
    public final Pair<Block, Item> MAGENTA;
    public final Pair<Block, Item> ORANGE;
    public final Pair<Block, Item> PINK;
    public final Pair<Block, Item> PURPLE;
    public final Pair<Block, Item> RED;
    public final Pair<Block, Item> WHITE;
    public final Pair<Block, Item> YELLOW;

    public final Pair<Block, Item> DEFAULT_SLAB;
    public final Pair<Block, Item> BLACK_SLAB;
    public final Pair<Block, Item> BLUE_SLAB;
    public final Pair<Block, Item> BROWN_SLAB;
    public final Pair<Block, Item> CYAN_SLAB;
    public final Pair<Block, Item> GREEN_SLAB;
    public final Pair<Block, Item> GREY_SLAB;
    public final Pair<Block, Item> LIGHT_BLUE_SLAB;
    public final Pair<Block, Item> LIGHT_GREY_SLAB;
    public final Pair<Block, Item> LIME_SLAB;
    public final Pair<Block, Item> MAGENTA_SLAB;
    public final Pair<Block, Item> ORANGE_SLAB;
    public final Pair<Block, Item> PINK_SLAB;
    public final Pair<Block, Item> PURPLE_SLAB;
    public final Pair<Block, Item> RED_SLAB;
    public final Pair<Block, Item> WHITE_SLAB;
    public final Pair<Block, Item> YELLOW_SLAB;

    public final Pair<Block, Item> DEFAULT_STAIRS;
    public final Pair<Block, Item> BLACK_STAIRS;
    public final Pair<Block, Item> BLUE_STAIRS;
    public final Pair<Block, Item> BROWN_STAIRS;
    public final Pair<Block, Item> CYAN_STAIRS;
    public final Pair<Block, Item> GREEN_STAIRS;
    public final Pair<Block, Item> GREY_STAIRS;
    public final Pair<Block, Item> LIGHT_BLUE_STAIRS;
    public final Pair<Block, Item> LIGHT_GREY_STAIRS;
    public final Pair<Block, Item> LIME_STAIRS;
    public final Pair<Block, Item> MAGENTA_STAIRS;
    public final Pair<Block, Item> ORANGE_STAIRS;
    public final Pair<Block, Item> PINK_STAIRS;
    public final Pair<Block, Item> PURPLE_STAIRS;
    public final Pair<Block, Item> RED_STAIRS;
    public final Pair<Block, Item> WHITE_STAIRS;
    public final Pair<Block, Item> YELLOW_STAIRS;

    public ColouredMaterial(String name, String adj, AbstractBlock.Settings settings, boolean variantBlocks) {
        DEFAULT = Blocks.register(name, new Block(settings), ItemGroup.BUILDING_BLOCKS);
        BLACK = Blocks.register("black_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        BLUE = Blocks.register("blue_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        BROWN = Blocks.register("brown_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        CYAN = Blocks.register("cyan_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        GREEN = Blocks.register("green_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        GREY = Blocks.register("grey_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        LIGHT_BLUE = Blocks.register("light_blue_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        LIGHT_GREY = Blocks.register("light_grey_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        LIME = Blocks.register("lime_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        MAGENTA = Blocks.register("magenta_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        ORANGE = Blocks.register("orange_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        PINK = Blocks.register("pink_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        PURPLE = Blocks.register("purple_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        RED = Blocks.register("red_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        WHITE = Blocks.register("white_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
//        WHITE_WASHED = Blocks.register("white_washed_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS); //(that checkered yellow/pink/white look)
        YELLOW = Blocks.register("yellow_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);

        if (variantBlocks) {
            DEFAULT_SLAB = Blocks.register("" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BLACK_SLAB = Blocks.register("black_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BLUE_SLAB = Blocks.register("blue_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BROWN_SLAB = Blocks.register("brown_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            CYAN_SLAB = Blocks.register("cyan_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            GREEN_SLAB = Blocks.register("green_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            GREY_SLAB = Blocks.register("grey_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIGHT_BLUE_SLAB = Blocks.register("light_blue_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIGHT_GREY_SLAB = Blocks.register("light_grey_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIME_SLAB = Blocks.register("lime_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            MAGENTA_SLAB = Blocks.register("magenta_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            ORANGE_SLAB = Blocks.register("orange_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            PINK_SLAB = Blocks.register("pink_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            PURPLE_SLAB = Blocks.register("purple_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            RED_SLAB = Blocks.register("red_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            WHITE_SLAB = Blocks.register("white_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            YELLOW_SLAB = Blocks.register("yellow_" + adj + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);

            DEFAULT_STAIRS = Blocks.register("" + adj + "_stairs", new StairsBlock(DEFAULT.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BLACK_STAIRS = Blocks.register("black_" + adj + "_stairs", new StairsBlock(BLACK.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BLUE_STAIRS = Blocks.register("blue_" + adj + "_stairs", new StairsBlock(BLUE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BROWN_STAIRS = Blocks.register("brown_" + adj + "_stairs", new StairsBlock(BROWN.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            CYAN_STAIRS = Blocks.register("cyan_" + adj + "_stairs", new StairsBlock(CYAN.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            GREEN_STAIRS = Blocks.register("green_" + adj + "_stairs", new StairsBlock(GREEN.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            GREY_STAIRS = Blocks.register("grey_" + adj + "_stairs", new StairsBlock(GREY.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIGHT_BLUE_STAIRS = Blocks.register("light_blue_" + adj + "_stairs", new StairsBlock(LIGHT_BLUE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIGHT_GREY_STAIRS = Blocks.register("light_grey_" + adj + "_stairs", new StairsBlock(LIGHT_GREY.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIME_STAIRS = Blocks.register("lime_" + adj + "_stairs", new StairsBlock(LIME.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            MAGENTA_STAIRS = Blocks.register("magenta_" + adj + "_stairs", new StairsBlock(MAGENTA.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            ORANGE_STAIRS = Blocks.register("orange_" + adj + "_stairs", new StairsBlock(ORANGE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            PINK_STAIRS = Blocks.register("pink_" + adj + "_stairs", new StairsBlock(PINK.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            PURPLE_STAIRS = Blocks.register("purple_" + adj + "_stairs", new StairsBlock(PURPLE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            RED_STAIRS = Blocks.register("red_" + adj + "_stairs", new StairsBlock(RED.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            WHITE_STAIRS = Blocks.register("white_" + adj + "_stairs", new StairsBlock(WHITE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            YELLOW_STAIRS = Blocks.register("yellow_" + adj + "_stairs", new StairsBlock(YELLOW.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
        } else {
            DEFAULT_SLAB = null;
            BLACK_SLAB = null;
            BLUE_SLAB = null;
            BROWN_SLAB = null;
            CYAN_SLAB = null;
            GREEN_SLAB = null;
            GREY_SLAB = null;
            LIGHT_BLUE_SLAB = null;
            LIGHT_GREY_SLAB = null;
            LIME_SLAB = null;
            MAGENTA_SLAB = null;
            ORANGE_SLAB = null;
            PINK_SLAB = null;
            PURPLE_SLAB = null;
            RED_SLAB = null;
            WHITE_SLAB = null;
            YELLOW_SLAB = null;

            DEFAULT_STAIRS = null;
            BLACK_STAIRS = null;
            BLUE_STAIRS = null;
            BROWN_STAIRS = null;
            CYAN_STAIRS = null;
            GREEN_STAIRS = null;
            GREY_STAIRS = null;
            LIGHT_BLUE_STAIRS = null;
            LIGHT_GREY_STAIRS = null;
            LIME_STAIRS = null;
            MAGENTA_STAIRS = null;
            ORANGE_STAIRS = null;
            PINK_STAIRS = null;
            PURPLE_STAIRS = null;
            RED_STAIRS = null;
            WHITE_STAIRS = null;
            YELLOW_STAIRS = null;
        }

    }

    public <T> T getBlockType(Class<T> type) {
        try {
            Object o = type.newInstance();
            return type.cast(o);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ColouredMaterial(String name, Class<? extends Block> child, boolean variantBlocks) {
        Block DEFAULT1;

        try {
            Constructor<?> constructor = getBlockType(child).getClass().getConstructor();
            DEFAULT1 = (Block) constructor.newInstance();
        } catch (Exception e) {
            DEFAULT1 = new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.STONE));
            e.printStackTrace();
        }

        DEFAULT = Blocks.register(name, DEFAULT1, ItemGroup.BUILDING_BLOCKS);
        BLACK = Blocks.register("black_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        BLUE = Blocks.register("blue_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        BROWN = Blocks.register("brown_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        CYAN = Blocks.register("cyan_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        GREEN = Blocks.register("green_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        GREY = Blocks.register("grey_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        LIGHT_BLUE = Blocks.register("light_blue_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        LIGHT_GREY = Blocks.register("light_grey_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        LIME = Blocks.register("lime_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        MAGENTA = Blocks.register("magenta_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        ORANGE = Blocks.register("orange_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        PINK = Blocks.register("pink_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        PURPLE = Blocks.register("purple_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        RED = Blocks.register("red_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
        WHITE = Blocks.register("white_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
//        WHITE_WASHED = Blocks.register("white_washed_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS); //(that checkered yellow/pink/white look)
        YELLOW = Blocks.register("yellow_" + name, new Block(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);

        if (variantBlocks) {
            DEFAULT_SLAB = Blocks.register("" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BLACK_SLAB = Blocks.register("black_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BLUE_SLAB = Blocks.register("blue_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BROWN_SLAB = Blocks.register("brown_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            CYAN_SLAB = Blocks.register("cyan_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            GREEN_SLAB = Blocks.register("green_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            GREY_SLAB = Blocks.register("grey_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIGHT_BLUE_SLAB = Blocks.register("light_blue_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIGHT_GREY_SLAB = Blocks.register("light_grey_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIME_SLAB = Blocks.register("lime_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            MAGENTA_SLAB = Blocks.register("magenta_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            ORANGE_SLAB = Blocks.register("orange_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            PINK_SLAB = Blocks.register("pink_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            PURPLE_SLAB = Blocks.register("purple_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            RED_SLAB = Blocks.register("red_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            WHITE_SLAB = Blocks.register("white_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);
            YELLOW_SLAB = Blocks.register("yellow_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(DEFAULT_SLAB.getLeft())), ItemGroup.BUILDING_BLOCKS);

            DEFAULT_STAIRS = Blocks.register("" + name + "_stairs", new StairsBlock(DEFAULT.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BLACK_STAIRS = Blocks.register("black_" + name + "_stairs", new StairsBlock(BLACK.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BLUE_STAIRS = Blocks.register("blue_" + name + "_stairs", new StairsBlock(BLUE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            BROWN_STAIRS = Blocks.register("brown_" + name + "_stairs", new StairsBlock(BROWN.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            CYAN_STAIRS = Blocks.register("cyan_" + name + "_stairs", new StairsBlock(CYAN.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            GREEN_STAIRS = Blocks.register("green_" + name + "_stairs", new StairsBlock(GREEN.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            GREY_STAIRS = Blocks.register("grey_" + name + "_stairs", new StairsBlock(GREY.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIGHT_BLUE_STAIRS = Blocks.register("light_blue_" + name + "_stairs", new StairsBlock(LIGHT_BLUE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIGHT_GREY_STAIRS = Blocks.register("light_grey_" + name + "_stairs", new StairsBlock(LIGHT_GREY.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            LIME_STAIRS = Blocks.register("lime_" + name + "_stairs", new StairsBlock(LIME.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            MAGENTA_STAIRS = Blocks.register("magenta_" + name + "_stairs", new StairsBlock(MAGENTA.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            ORANGE_STAIRS = Blocks.register("orange_" + name + "_stairs", new StairsBlock(ORANGE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            PINK_STAIRS = Blocks.register("pink_" + name + "_stairs", new StairsBlock(PINK.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            PURPLE_STAIRS = Blocks.register("purple_" + name + "_stairs", new StairsBlock(PURPLE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            RED_STAIRS = Blocks.register("red_" + name + "_stairs", new StairsBlock(RED.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            WHITE_STAIRS = Blocks.register("white_" + name + "_stairs", new StairsBlock(WHITE.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
            YELLOW_STAIRS = Blocks.register("yellow_" + name + "_stairs", new StairsBlock(YELLOW.getLeft().getDefaultState(), FabricBlockSettings.copy(DEFAULT_STAIRS.getLeft())), ItemGroup.BUILDING_BLOCKS);
        } else {
            DEFAULT_SLAB = null;
            BLACK_SLAB = null;
            BLUE_SLAB = null;
            BROWN_SLAB = null;
            CYAN_SLAB = null;
            GREEN_SLAB = null;
            GREY_SLAB = null;
            LIGHT_BLUE_SLAB = null;
            LIGHT_GREY_SLAB = null;
            LIME_SLAB = null;
            MAGENTA_SLAB = null;
            ORANGE_SLAB = null;
            PINK_SLAB = null;
            PURPLE_SLAB = null;
            RED_SLAB = null;
            WHITE_SLAB = null;
            YELLOW_SLAB = null;

            DEFAULT_STAIRS = null;
            BLACK_STAIRS = null;
            BLUE_STAIRS = null;
            BROWN_STAIRS = null;
            CYAN_STAIRS = null;
            GREEN_STAIRS = null;
            GREY_STAIRS = null;
            LIGHT_BLUE_STAIRS = null;
            LIGHT_GREY_STAIRS = null;
            LIME_STAIRS = null;
            MAGENTA_STAIRS = null;
            ORANGE_STAIRS = null;
            PINK_STAIRS = null;
            PURPLE_STAIRS = null;
            RED_STAIRS = null;
            WHITE_STAIRS = null;
            YELLOW_STAIRS = null;
        }
    }

}