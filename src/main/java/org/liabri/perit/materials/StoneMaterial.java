//package org.liabri.perit;
//
//import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
//import net.minecraft.block.Block;
//import net.minecraft.block.SlabBlock;
//import net.minecraft.block.StairsBlock;
//import net.minecraft.block.WallBlock;
//import org.liabri.perit.blocks.Blocks;
//
//import static net.minecraft.block.Blocks.*;
//import static net.minecraft.block.Blocks.COBBLESTONE;
//
//public class Material {
////    private Block base;
////    private SlabBlock slab;
////    private StairsBlock stairs;
////    private WallBlock wall;
//
//    private final Block BASE;
//    private final SlabBlock BASE_SLAB;
//    private final StairsBlock BASE_STAIRS;
//    private final WallBlock BASE_WALL;
//
//    private final Block CUT;
//    private final SlabBlock CUT_SLAB;
//    private final StairsBlock CUT_STAIRS;
//    private final WallBlock CUT_WALL;
//
//    private final Block CRACKED_CUT;
//    private final SlabBlock CRACKED_CUT_SLAB;
//    private final StairsBlock CRACKED_CUT_STAIRS;
//    private final WallBlock CRACKED_CUT_WALL;
//
//    private final Block POLISHED;
//    private final SlabBlock POLISHED_SLAB;
//    private final StairsBlock POLISHED_STAIRS;
//    private final WallBlock POLISHED_WALL;
//
//    private final Block CRACKED_POLISHED;
//    private final SlabBlock CRACKED_POLISHED_SLAB;
//    private final StairsBlock CRACKED_POLISHED_STAIRS;
//    private final WallBlock CRACKED_POLISHED_WALL;
//
//    private final Block SMOOTH;;
//    private final SlabBlock SMOOTH_SLAB;
//    private final StairsBlock SMOOTH_STAIRS;
//    private final WallBlock SMOOTH_WALL;
//
//    private final Block COBBLED;
//    private final SlabBlock COBBLED_SLAB;
//    private final StairsBlock COBBLED_STAIRS;
//    private final WallBlock COBBLED_WALL;
//
//    private final Block MOSSY_COBBLED;
//    private final SlabBlock MOSSY_COBBLED_SLAB;
//    private final StairsBlock MOSSY_COBBLED_STAIRS;
//    private final WallBlock MOSSY_COBBLED_WALL;
//
//    private final Block BRICKS;
//    private final SlabBlock BRICKS_SLAB;
//    private final StairsBlock BRICK_STAIRS;
//    private final WallBlock BRICKS_WALL;
//
//    private final Block MOSSY_BRICKS;
//    private final SlabBlock MOSSY_BRICKS_SLAB;
//    private final StairsBlock MOSSY_BRICK_STAIRS;
//    private final WallBlock MOSSY_BRICKS_WALL;
//
//    private final Block CRACKED_BRICKS;
//    private final SlabBlock CRACKED_BRICKS_SLAB;
//    private final StairsBlock CRACKED_BRICK_STAIRS;
//    private final WallBlock CRACKED_BRICKS_WALL;
//
//    private final Block BRIQUETTES;
//    private final SlabBlock BRIQUETTES_SLAB;
//    private final StairsBlock BRIQUETTES_STAIRS;
//    private final WallBlock BRIQUETTES_WALL;
//
//    private final Block MOSSY_BRIQUETTES;
//    private final SlabBlock MOSSY_BRIQUETTES_SLAB;
//    private final StairsBlock MOSSY_BRIQUETTES_STAIRS;
//    private final WallBlock MOSSY_BRIQUETTES_WALL;
//
//    private final Block CRACKED_BRIQUETTES;
//    private final SlabBlock CRACKED_BRIQUETTES_SLAB;
//    private final StairsBlock CRACKED_BRIQUETTES_STAIRS;
//    private final WallBlock CRACKED_BRIQUETTES_WALL;
//
//    private final Block CHISELED_RUNES;
//    private final Block CHISELED_GEOMETRIC;
//    private final Block CHISELED_DANCE;
//    private final Block CHISELED_HEAD;
//    private final Block CHISELED_WRITING;
//
//    private final Block PILLAR;
//    private final Block COLUMN;
//    private final Block TOMBSTONE;
//
//    public Material(String name) {
//        BASE = Blocks.register(name, new Block(FabricBlockSettings.copy(STONE)));
//        BASE_SLAB = (SlabBlock) Blocks.register(name + "_slab", new SlabBlock(FabricBlockSettings.copy(BASE)));
//        BASE_STAIRS = (StairsBlock) Blocks.register(name + "_stairs", new StairsBlock(BASE.getDefaultState(), FabricBlockSettings.copy(BASE)));
//        BASE_WALL = (WallBlock) Blocks.register(name + "_wall", new WallBlock(FabricBlockSettings.copy(BASE)));
//
//        POLISHED = Blocks.register("polished_" + name, new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
//        POLISHED_SLAB = (SlabBlock) Blocks.register("polished_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED)));
//        POLISHED_STAIRS = (StairsBlock) Blocks.register("polished_" + name + "_stairs", new StairsBlock(POLISHED.getDefaultState(), FabricBlockSettings.copy(POLISHED)));
//        POLISHED_WALL = (WallBlock) Blocks.register("polished_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(POLISHED)));
//
//        SMOOTH = Blocks.register("smooth_" + name, new Block(FabricBlockSettings.copy(SMOOTH_STONE)));
//        SMOOTH_SLAB = (SlabBlock) Blocks.register("smooth_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH)));
//        SMOOTH_STAIRS = (StairsBlock) Blocks.register("smooth_" + name + "_stairs", new StairsBlock(SMOOTH.getDefaultState(), FabricBlockSettings.copy(SMOOTH)));
//        SMOOTH_WALL = (WallBlock) Blocks.register("smooth_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH)));
//
//        COBBLED = Blocks.register("cobbled_" + name, new Block(FabricBlockSettings.copy(COBBLESTONE)));
//        COBBLED_SLAB = (SlabBlock) Blocks.register("cobbled_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(COBBLED)));
//        COBBLED_STAIRS = (StairsBlock) Blocks.register("cobbled_" + name + "_stairs", new StairsBlock(COBBLED.getDefaultState(), FabricBlockSettings.copy(COBBLED)));
//        COBBLED_WALL = (WallBlock) Blocks.register("cobbled_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(COBBLED)));
//
//        MOSSY_COBBLED = Blocks.register("mossy_cobbled_" + name, new Block(FabricBlockSettings.copy(COBBLESTONE)));
//        MOSSY_COBBLED_SLAB = (SlabBlock) Blocks.register("mossy_cobbled_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_COBBLED)));
//        MOSSY_COBBLED_STAIRS = (StairsBlock) Blocks.register("mossy_cobbled_" + name + "_stairs", new StairsBlock(MOSSY_COBBLED.getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED)));
//        MOSSY_COBBLED_WALL = (WallBlock) Blocks.register("mossy_cobbled_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_COBBLED)));
//
////        BRICK = Blocks.register(name + "_brick", new BrickBlock(FabricBlockSettings.copy).nonOpaque().dynamicBounds()));
//        BRICKS = Blocks.register(name + "_bricks", new Block(FabricBlockSettings.copy(BASE)));
//        BRICKS_SLAB = (SlabBlock) Blocks.register(name + "_bricks_slab", new SlabBlock(FabricBlockSettings.copy(BRICKS)));
//        BRICK_STAIRS = (StairsBlock) Blocks.register(name + "_brick_stairs", new StairsBlock(BRICKS.getDefaultState(), FabricBlockSettings.copy(BRICKS)));
//        BRICKS_WALL = (WallBlock) Blocks.register(name + "_bricks_wall", new WallBlock(FabricBlockSettings.copy(BRICKS)));
//
//        MOSSY_BRICKS = Blocks.register(name + "_mossy_bricks", new Block(FabricBlockSettings.copy(BRICKS)));
//        MOSSY_BRICKS_SLAB = (SlabBlock) Blocks.register(name + "_mossy_bricks_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_BRICKS)));
//        MOSSY_BRICK_STAIRS = (StairsBlock) Blocks.register(name + "_mossy_brick_stairs", new StairsBlock(MOSSY_BRICKS.getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS)));
//        MOSSY_BRICKS_WALL = (WallBlock) Blocks.register(name + "_mossy_bricks_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_BRICKS)));
//
////        BRIQUETTE = Blocks.register(name + "_briquette", new BriquetteBlock(FabricBlockSettings.copy(BRICK).nonOpaque().dynamicBounds().luminance(s -> s.get(BriquetteBlock.LIGHT_LEVEL))));
//        BRIQUETTES = Blocks.register(name + "_briquettes", new Block(FabricBlockSettings.copy(BRICKS)));
//        BRIQUETTES_SLAB = (SlabBlock) Blocks.register(name + "_briquettes_slab", new SlabBlock(FabricBlockSettings.copy(BRIQUETTES)));
//        BRIQUETTES_STAIRS = (StairsBlock) Blocks.register(name + "_briquettes_stairs", new StairsBlock(BRIQUETTES.getDefaultState(), FabricBlockSettings.copy(BRIQUETTES)));
//        BRIQUETTES_WALL = (WallBlock) Blocks.register(name + "_briquettes_wall", new WallBlock(FabricBlockSettings.copy(BRIQUETTES)));
//
//        MOSSY_BRIQUETTES = Blocks.register(name + "_mossy_briquettes", new Block(FabricBlockSettings.copy(BRIQUETTES)));
//        MOSSY_BRIQUETTES_SLAB = (SlabBlock) Blocks.register(name + "_mossy_briquettes_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_BRIQUETTES)));
//        MOSSY_BRIQUETTES_STAIRS = (StairsBlock) Blocks.register(name + "_mossy_briquettes_stairs", new StairsBlock(MOSSY_BRIQUETTES.getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES)));
//        MOSSY_BRIQUETTES_WALL = (WallBlock) Blocks.register(name + "_mossy_briquettes_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_BRIQUETTES)));
//
//        PILLAR = Blocks.register(name + "_pillar", new Block(FabricBlockSettings.copy(BASE)));
//        COLUMN = Blocks.register(name + "_column", new Block(FabricBlockSettings.copy(BASE)));
//        CHISELED = Blocks.register("chiseled_" + name, new Block(FabricBlockSettings.copy(BASE)));
//
//        TOMBSTONE = Blocks.register(name + "_tombstone", new Block(FabricBlockSettings.copy(SMOOTH)));
//    }
//}
