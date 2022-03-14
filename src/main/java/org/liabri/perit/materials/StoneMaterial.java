package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.liabri.perit.blocks.Blocks;
import org.liabri.perit.blocks.SlabBlock;
import org.liabri.perit.blocks.StairsBlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoneMaterial {

    public enum Kinds {
        Base,
        Smooth,
        Cut,
        CrackedCut,
        Polished,
        CrackedPolished,
        Cobbled,
        MossyCobbled,
        Shingles,
        MossyShingles,
        CrackedShingles,
        Bricks,
        MossyBricks,
        CrackedBricks,
        Briquettes,
        MossyBriquette,
        CrackedBriquette,
        Packed,
        Pillar,
        Column,
        Chiseled,
        Tombstone
    }


    public StoneMaterial(String name, AbstractBlock.Settings settings, ItemGroup itemGroup, Kinds[] blacklist) {
        List<Kinds> list = Arrays.asList(blacklist);

        if (!list.contains(Kinds.Base)) {
            Pair<Block, Item> BASE = Blocks.register(name, new Block(settings), itemGroup);
            Blocks.register(name + "_slab", new SlabBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), itemGroup);
            Blocks.register(name + "_stairs", new StairsBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), itemGroup);
            Blocks.register(name + "_wall", new WallBlock(FabricBlockSettings.copy(BASE.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.Smooth)) {
            Pair<Block, Item> SMOOTH = Blocks.register("smooth_" + name, new Block(settings), itemGroup);
            Blocks.register("smooth_" + name + "_slab", new SlabBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), itemGroup);
            Blocks.register("smooth_" + name + "_stairs", new StairsBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), itemGroup);
            Blocks.register("smooth_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.Cut)) {
            Pair<Block, Item> CUT = Blocks.register("cut_" + name, new Block(settings), itemGroup);
            Blocks.register("cut_" + name + "_slab", new SlabBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), itemGroup);
            Blocks.register("cut_" + name + "_stairs", new StairsBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), itemGroup);
            Blocks.register("cut_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(CUT.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.CrackedCut)) {
            Pair<Block, Item> CRACKED_CUT = Blocks.register("cracked_cut_" + name, new Block(settings), itemGroup);
            Blocks.register("cracked_cut_" + name + "_slab", new SlabBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), itemGroup);
            Blocks.register("cracked_cut_" + name + "_stairs", new StairsBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), itemGroup);
            Blocks.register("cracked_cut_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_CUT.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.Polished)) {
            Pair<Block, Item> POLISHED = Blocks.register("polished_" + name, new Block(settings), itemGroup);
            Blocks.register("polished_" + name + "_slab", new SlabBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), itemGroup);
            Blocks.register("polished_" + name + "_stairs", new StairsBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), itemGroup);
            Blocks.register("polished_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(POLISHED.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.CrackedPolished)) {
            Pair<Block, Item> CRACKED_POLISHED = Blocks.register("cracked_polished_" + name, new Block(settings), itemGroup);
            Blocks.register("cracked_polished_" + name + "_slab", new SlabBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), itemGroup);
            Blocks.register("cracked_polished_" + name + "_stairs", new StairsBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), itemGroup);
            Blocks.register("cracked_polished_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.Cobbled)) {
            Pair<Block, Item> COBBLED = Blocks.register("cobbled_" + name, new Block(settings), itemGroup);
            Blocks.register("cobbled_" + name + "_slab", new SlabBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), itemGroup);
            Blocks.register("cobbled_" + name + "_stairs", new StairsBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), itemGroup);
            Blocks.register("cobbled_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(COBBLED.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.MossyCobbled)) {
            Pair<Block, Item> MOSSY_COBBLED = Blocks.register("mossy_cobbled_" + name, new Block(settings), itemGroup);
            Blocks.register("mossy_cobbled_" + name + "_slab", new SlabBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), itemGroup);
            Blocks.register("mossy_cobbled_" + name + "_stairs", new StairsBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), itemGroup);
            Blocks.register("mossy_cobbled_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.Shingles)) {
            Pair<Block, Item> BRICKS = Blocks.register(name + "_shingles", new Block(settings), itemGroup);
            Blocks.register(name + "_shingle_slab", new SlabBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_shingle_stairs", new StairsBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_shingle_wall", new WallBlock(FabricBlockSettings.copy(BRICKS.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.MossyShingles)) {
            Pair<Block, Item> MOSSY_BRICKS = Blocks.register(name + "_mossy_shingles", new Block(settings), itemGroup);
            Blocks.register(name + "_mossy_shingle_slab", new SlabBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_mossy_shingle_stairs", new StairsBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_mossy_shingle_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.CrackedShingles)) {
            Pair<Block, Item> CRACKED_BRICKS = Blocks.register(name + "_cracked_shingles", new Block(settings), itemGroup);
            Blocks.register(name + "_cracked_shingle_slab", new SlabBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_cracked_shingle_stairs", new StairsBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_cracked_shingle_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.Bricks)) {
            Pair<Block, Item> BRICKS = Blocks.register(name + "_bricks", new Block(settings), itemGroup);
            Blocks.register(name + "_brick_slab", new SlabBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_brick_stairs", new StairsBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_brick_wall", new WallBlock(FabricBlockSettings.copy(BRICKS.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.MossyBricks)) {
            Pair<Block, Item> MOSSY_BRICKS = Blocks.register(name + "_mossy_bricks", new Block(settings), itemGroup);
            Blocks.register(name + "_mossy_brick_slab", new SlabBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_mossy_brick_stairs", new StairsBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_mossy_brick_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.CrackedBricks)) {
            Pair<Block, Item> CRACKED_BRICKS = Blocks.register(name + "_cracked_bricks", new Block(settings), itemGroup);
            Blocks.register(name + "_cracked_brick_slab", new SlabBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_cracked_brick_stairs", new StairsBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), itemGroup);
            Blocks.register(name + "_cracked_brick_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.Briquettes)) {
            Pair<Block, Item> BRIQUETTES = Blocks.register(name + "_briquettes", new Block(settings), itemGroup);
            Blocks.register(name + "_briquettes_slab", new SlabBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), itemGroup);
            Blocks.register(name + "_briquettes_stairs", new StairsBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), itemGroup);
            Blocks.register(name + "_briquettes_wall", new WallBlock(FabricBlockSettings.copy(BRIQUETTES.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.MossyBriquette)) {
            Pair<Block, Item> MOSSY_BRIQUETTES = Blocks.register(name + "_mossy_briquettes", new Block(settings), itemGroup);
            Blocks.register(name + "_mossy_briquettes_slab", new SlabBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), itemGroup);
            Blocks.register(name + "_mossy_briquettes_stairs", new StairsBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), itemGroup);
            Blocks.register(name + "_mossy_briquettes_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.CrackedBriquette)) {
            Pair<Block, Item> CRACKED_BRIQUETTES = Blocks.register(name + "_cracked_briquettes", new Block(settings), itemGroup);
            Blocks.register(name + "_cracked_briquettes_slab", new SlabBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), itemGroup);
            Blocks.register(name + "_cracked_briquettes_stairs", new StairsBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), itemGroup);
            Blocks.register(name + "_cracked_briquettes_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.Packed)) {
            Pair<Block, Item> PACKED = Blocks.register("packed_" + name, new Block(settings), itemGroup);
            Blocks.register("packed_" + name + "_slab", new SlabBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), itemGroup);
            Blocks.register("packed_" + name + "_stairs", new StairsBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), itemGroup);
            Blocks.register("packed_" + name + "_wall", new WallBlock(FabricBlockSettings.copy(PACKED.getLeft())), itemGroup);
        }

        if (!list.contains(Kinds.Chiseled)) {
//            private final Pair<Block, Item> CHISELED_RUNES;
//            private final Pair<Block, Item> CHISELED_GEOMETRIC;
//            private final Pair<Block, Item> CHISELED_DANCE;
//            private final Pair<Block, Item> CHISELED_HEAD;
//            private final Pair<Block, Item> CHISELED_WRITING;
        }

        if (!list.contains(Kinds.Pillar)) {
            Blocks.register(name + "_pillar", new Block(settings), itemGroup);
        }

        if (!list.contains(Kinds.Column)) {
            Blocks.register(name + "_column", new Block(settings), itemGroup);
        }

        if (!list.contains(Kinds.Tombstone)) {
//            TOMBSTONE = Blocks.register(name + "_tombstone", new Block(FabricBlockSettings.copy(SMOOTH)), itemGroup);
        }

    }
}
