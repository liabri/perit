//package org.liabri.perit.materials;
//
//import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
//import net.minecraft.block.AbstractBlock;
//import net.minecraft.block.Block;
//import net.minecraft.block.SlabBlock;
//import net.minecraft.block.WallBlock;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;
//import net.minecraft.util.Pair;
//import org.liabri.perit.blocks.Blocks;
//import org.liabri.perit.blocks.StairsBlock;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class StoneMaterial2 {
//
//    public enum Kinds {
//        Base,
//        Cut,
//        CrackedCut,
//        Polished,
//        CrackedPolished,
//        Smooth,
//        Cobbled,
//        MossyCobbled,
//        Bricks,
//        MossyBricks,
//        CrackedBricks,
//        Briquettes,
//        MossyBriquette,
//        CrackedBriquette,
//        Pillar,
//        Column,
//        Chiseled,
//        Tombstone
//    }
//
//    private final Pair<Block, Item> BASE_SLAB;
//    private final Pair<Block, Item> BASE_STAIRS;
//    private final Pair<Block, Item> BASE_WALL;
//
//    private final Pair<Block, Item> CUT;
//    private final Pair<Block, Item> CUT_SLAB;
//    private final Pair<Block, Item> CUT_STAIRS;
//    private final Pair<Block, Item> CUT_WALL;
//
//    private final Pair<Block, Item> CRACKED_CUT;
//    private final Pair<Block, Item> CRACKED_CUT_SLAB;
//    private final Pair<Block, Item> CRACKED_CUT_STAIRS;
//    private final Pair<Block, Item> CRACKED_CUT_WALL;
//
//    private final Pair<Block, Item> POLISHED;
//    private final Pair<Block, Item> POLISHED_SLAB;
//    private final Pair<Block, Item> POLISHED_STAIRS;
//    private final Pair<Block, Item> POLISHED_WALL;
//
//    private final Pair<Block, Item> CRACKED_POLISHED;
//    private final Pair<Block, Item> CRACKED_POLISHED_SLAB;
//    private final Pair<Block, Item> CRACKED_POLISHED_STAIRS;
//    private final Pair<Block, Item> CRACKED_POLISHED_WALL;
//
//    private final Pair<Block, Item> SMOOTH;;
//    private final Pair<Block, Item> SMOOTH_SLAB;
//    private final Pair<Block, Item> SMOOTH_STAIRS;
//    private final Pair<Block, Item> SMOOTH_WALL;
//
//    private final Pair<Block, Item> COBBLED;
//    private final Pair<Block, Item> COBBLED_SLAB;
//    private final Pair<Block, Item> COBBLED_STAIRS;
//    private final Pair<Block, Item> COBBLED_WALL;
//
//    private final Pair<Block, Item> MOSSY_COBBLED;
//    private final Pair<Block, Item> MOSSY_COBBLED_SLAB;
//    private final Pair<Block, Item> MOSSY_COBBLED_STAIRS;
//    private final Pair<Block, Item> MOSSY_COBBLED_WALL;
//
//    private final Pair<Block, Item> BRICKS;
//    private final Pair<Block, Item> BRICKS_SLAB;
//    private final Pair<Block, Item> BRICK_STAIRS;
//    private final Pair<Block, Item> BRICKS_WALL;
//
//    private final Pair<Block, Item> MOSSY_BRICKS;
//    private final Pair<Block, Item> MOSSY_BRICKS_SLAB;
//    private final Pair<Block, Item> MOSSY_BRICK_STAIRS;
//    private final Pair<Block, Item> MOSSY_BRICKS_WALL;
//
//    private final Pair<Block, Item> CRACKED_BRICKS;
//    private final Pair<Block, Item> CRACKED_BRICKS_SLAB;
//    private final Pair<Block, Item> CRACKED_BRICK_STAIRS;
//    private final Pair<Block, Item> CRACKED_BRICKS_WALL;
//
//    private final Pair<Block, Item> BRIQUETTES;
//    private final Pair<Block, Item> BRIQUETTES_SLAB;
//    private final Pair<Block, Item> BRIQUETTES_STAIRS;
//    private final Pair<Block, Item> BRIQUETTES_WALL;
//
//    private final Pair<Block, Item> MOSSY_BRIQUETTES;
//    private final Pair<Block, Item> MOSSY_BRIQUETTES_SLAB;
//    private final Pair<Block, Item> MOSSY_BRIQUETTES_STAIRS;
//    private final Pair<Block, Item> MOSSY_BRIQUETTES_WALL;
//
//    private final Pair<Block, Item> CRACKED_BRIQUETTES;
//    private final Pair<Block, Item> CRACKED_BRIQUETTES_SLAB;
//    private final Pair<Block, Item> CRACKED_BRIQUETTES_STAIRS;
//    private final Pair<Block, Item> CRACKED_BRIQUETTES_WALL;
//
//    private final Pair<Block, Item> CHISELED_RUNES;
//    private final Pair<Block, Item> CHISELED_GEOMETRIC;
//    private final Pair<Block, Item> CHISELED_DANCE;
//    private final Pair<Block, Item> CHISELED_HEAD;
//    private final Pair<Block, Item> CHISELED_WRITING;
//
//    private final Pair<Block, Item> PILLAR;
//    private final Pair<Block, Item> COLUMN;
//    private final Pair<Block, Item> TOMBSTONE;
//
//    public StoneMaterial2(String name, AbstractBlock.Settings settings, ItemGroup itemGroup, Kinds[] blacklist) {
//        List<Kinds> list = Arrays.asList(blacklist);
//
//        Pair<Block, Item> BASE;
//        if (!list.contains(Kinds.Base)) {
//            BASE = Blocks.register(name, new Block(settings), itemGroup);
//            BASE_SLAB =  Blocks.register(name + "_slab", new SlabBlock(FabricBlockSettings.copy(BASE.getLeft())), itemGroup);
//            BASE_STAIRS =  Blocks.register(name + "_stairs", new StairsBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), itemGroup);
//            BASE_WALL = Blocks.register(name + "_wall", new WallBlock(FabricBlockSettings.copy(BASE.getLeft())), itemGroup);
//        } else {
//            BASE = null;
//            BASE_SLAB = null;
//            BASE_STAIRS = null;
//            BASE_WALL = null;
//        }
//
//        if (!list.contains(Kinds.Polished)) {
//            POLISHED = Blocks.register("polished_" + name, new Block(settings), itemGroup);
//            POLISHED_SLAB = Blocks.register("polished_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED.getLeft())), itemGroup);
//            POLISHED_STAIRS = Blocks.register("polished_" + name + "_stairs", new StairsBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), itemGroup);
//            POLISHED_WALL = Blocks.register("polished_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(POLISHED.getLeft())), itemGroup);
//        } else {
//            POLISHED = null;
//            POLISHED_SLAB = null;
//            POLISHED_STAIRS = null;
//            POLISHED_WALL = null;
//        }
//
//        if (!list.contains(Kinds.Smooth)) {
//            SMOOTH = Blocks.register("smooth_" + name, new Block(settings), itemGroup);
//            SMOOTH_SLAB = Blocks.register("smooth_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH.getLeft())), itemGroup);
//            SMOOTH_STAIRS = Blocks.register("smooth_" + name + "_stairs", new StairsBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), itemGroup);
//            SMOOTH_WALL = Blocks.register("smooth_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH.getLeft())), itemGroup);
//        } else {
//            SMOOTH = null;
//            SMOOTH_SLAB = null;
//            SMOOTH_STAIRS = null;
//            SMOOTH_WALL = null;
//        }
//
//        if (!list.contains(Kinds.Cobbled)) {
//            COBBLED = Blocks.register("cobbled_" + name, new Block(settings), itemGroup);
//            COBBLED_SLAB = Blocks.register("cobbled_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(COBBLED.getLeft())), itemGroup);
//            COBBLED_STAIRS = Blocks.register("cobbled_" + name + "_stairs", new StairsBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), itemGroup);
//            COBBLED_WALL = Blocks.register("cobbled_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(COBBLED.getLeft())), itemGroup);
//        } else {
//            COBBLED = null;
//            COBBLED_SLAB = null;
//            COBBLED_STAIRS = null;
//            COBBLED_WALL = null;
//        }
//
//        if (!list.contains(Kinds.MossyCobbled)) {
//            MOSSY_COBBLED = Blocks.register("mossy_cobbled_" + name, new Block(settings), itemGroup);
//            MOSSY_COBBLED_SLAB = Blocks.register("mossy_cobbled_" + name + "_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), itemGroup);
//            MOSSY_COBBLED_STAIRS = Blocks.register("mossy_cobbled_" + name + "_stairs", new StairsBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), itemGroup);
//            MOSSY_COBBLED_WALL = Blocks.register("mossy_cobbled_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), itemGroup);
//        } else {
//            MOSSY_COBBLED = null;
//            MOSSY_COBBLED_SLAB = null;
//            MOSSY_COBBLED_STAIRS = null;
//            MOSSY_COBBLED_WALL = null;
//        }
//
//        if (!list.contains(Kinds.Bricks)) {
//            BRICKS = Blocks.register(name + "_bricks", new Block(settings), itemGroup);
//            BRICKS_SLAB = Blocks.register(name + "_bricks_slab", new SlabBlock(FabricBlockSettings.copy(BRICKS.getLeft())), itemGroup);
//            BRICK_STAIRS = Blocks.register(name + "_brick_stairs", new StairsBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), itemGroup);
//            BRICKS_WALL = Blocks.register(name + "_bricks_wall", new WallBlock(FabricBlockSettings.copy(BRICKS.getLeft())), itemGroup);
//        } else {
//            BRICKS = null;
//            BRICKS_SLAB = null;
//            BRICK_STAIRS = null;
//            BRICKS_WALL = null;
//        }
//
//        if (!list.contains(Kinds.MossyBricks)) {
//            MOSSY_BRICKS = Blocks.register(name + "_mossy_bricks", new Block(settings), itemGroup);
//            MOSSY_BRICKS_SLAB = Blocks.register(name + "_mossy_bricks_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), itemGroup);
//            MOSSY_BRICK_STAIRS = Blocks.register(name + "_mossy_brick_stairs", new StairsBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), itemGroup);
//            MOSSY_BRICKS_WALL = Blocks.register(name + "_mossy_bricks_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), itemGroup);
//        } else {
//            MOSSY_BRICKS = null;
//            MOSSY_BRICKS_SLAB = null;
//            MOSSY_BRICK_STAIRS = null;
//            MOSSY_BRICKS_WALL = null;
//        }
//
//        if (!list.contains(Kinds.Briquettes)) {
//            BRIQUETTES = Blocks.register(name + "_briquettes", new Block(settings), itemGroup);
//            BRIQUETTES_SLAB = Blocks.register(name + "_briquettes_slab", new SlabBlock(FabricBlockSettings.copy(BRIQUETTES.getLeft())), itemGroup);
//            BRIQUETTES_STAIRS = Blocks.register(name + "_briquettes_stairs", new StairsBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), itemGroup);
//            BRIQUETTES_WALL = Blocks.register(name + "_briquettes_wall", new WallBlock(FabricBlockSettings.copy(BRIQUETTES.getLeft())), itemGroup);
//        } else {
//            MOSSY_BRIQUETTES = null;
//            MOSSY_BRIQUETTES_SLAB = null;
//            MOSSY_BRIQUETTES_STAIRS = null;
//            MOSSY_BRIQUETTES_WALL = null;
//        }
//
//        if (!list.contains(Kinds.MossyBriquette)) {
//            MOSSY_BRIQUETTES = Blocks.register(name + "_mossy_briquettes", new Block(settings), itemGroup);
//            MOSSY_BRIQUETTES_SLAB = Blocks.register(name + "_mossy_briquettes_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), itemGroup);
//            MOSSY_BRIQUETTES_STAIRS = Blocks.register(name + "_mossy_briquettes_stairs", new StairsBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), itemGroup);
//            MOSSY_BRIQUETTES_WALL = Blocks.register(name + "_mossy_briquettes_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), itemGroup);
//        } else {
//            MOSSY_BRIQUETTES = null;
//            MOSSY_BRIQUETTES_SLAB = null;
//            MOSSY_BRIQUETTES_STAIRS = null;
//            MOSSY_BRIQUETTES_WALL = null;
//        }
//
//        PILLAR = Blocks.register(name + "_pillar", new Block(settings), itemGroup);
//        COLUMN = Blocks.register(name + "_column", new Block(settings), itemGroup);
////        CHISELED = Blocks.register("chiseled_" + name, new Block(FabricBlockSettings.copy(BASE)), itemGroup);
////        TOMBSTONE = Blocks.register(name + "_tombstone", new Block(FabricBlockSettings.copy(SMOOTH)), itemGroup);
//    }
//}
