package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.liabri.perit.blocks.*;

import java.util.Arrays;
import java.util.List;

public class StoneMaterial {
    private final String NAME;
    private final List<Kinds> LIST;
    private final Block BASE;
    private final ItemGroup ITEM_GROUP;

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

    public StoneMaterial(String name, Block block, ItemGroup ITEM_GROUP, Kinds[] blacklist) {
        this.NAME = name;
        this.LIST = Arrays.asList(blacklist);
        this.BASE = block;
        this.ITEM_GROUP = ITEM_GROUP;

        register();
    }

    public StoneMaterial(String name, AbstractBlock.Settings settings, ItemGroup ITEM_GROUP, Kinds[] blacklist) {
        this.NAME = name;
        this.LIST = Arrays.asList(blacklist);
        this.ITEM_GROUP = ITEM_GROUP;

        if (!this.LIST.contains(Kinds.Base)) {
            this.BASE = Blocks.register(this.NAME, new Block(settings), ITEM_GROUP).getLeft();
            Blocks.register(this.NAME + "_slab", new SlabBlock(BASE.getDefaultState(), FabricBlockSettings.copy(BASE)), ITEM_GROUP);
            Blocks.register(this.NAME + "_stairs", new StairsBlock(BASE.getDefaultState(), FabricBlockSettings.copy(BASE)), ITEM_GROUP);
            Blocks.register(this.NAME + "_wall", new WallBlock(BASE.getDefaultState(), FabricBlockSettings.copy(BASE)), ITEM_GROUP);
        } else {
            this.BASE = null;
        }

        register();
    }

    public void register() {
        if (!this.LIST.contains(Kinds.Smooth)) {
            Pair<Block, Item> SMOOTH = Blocks.register("smooth_" + this.NAME, new VariantBlock(BASE.getDefaultState(), FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("smooth_" + this.NAME + "_slab", new SlabBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), ITEM_GROUP);
            Blocks.register("smooth_" + this.NAME + "_stairs", new StairsBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), ITEM_GROUP);
            Blocks.register("smooth_" + this.NAME + "_wall", new WallBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Cut)) {
            Pair<Block, Item> CUT = Blocks.register("cut_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cut_" + this.NAME + "_slab", new SlabBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), ITEM_GROUP);
            Blocks.register("cut_" + this.NAME + "_stairs", new StairsBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), ITEM_GROUP);
            Blocks.register("cut_" + this.NAME + "_wall", new WallBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.CrackedCut)) {
            Pair<Block, Item> CRACKED_CUT = Blocks.register("cracked_cut_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_cut_" + this.NAME + "_slab", new SlabBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_cut_" + this.NAME + "_stairs", new StairsBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_cut_" + this.NAME + "_wall", new WallBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Polished)) {
            Pair<Block, Item> POLISHED = Blocks.register("polished_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("polished_" + this.NAME + "_slab", new SlabBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), ITEM_GROUP);
            Blocks.register("polished_" + this.NAME + "_stairs", new StairsBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), ITEM_GROUP);
            Blocks.register("polished_" + this.NAME + "_wall", new WallBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.CrackedPolished)) {
            Pair<Block, Item> CRACKED_POLISHED = Blocks.register("cracked_polished_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_polished_" + this.NAME + "_slab", new SlabBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_polished_" + this.NAME + "_stairs", new StairsBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_polished_" + this.NAME + "_wall", new WallBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Cobbled)) {
            Pair<Block, Item> COBBLED = Blocks.register("cobbled_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cobbled_" + this.NAME + "_slab", new SlabBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), ITEM_GROUP);
            Blocks.register("cobbled_" + this.NAME + "_stairs", new StairsBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), ITEM_GROUP);
            Blocks.register("cobbled_" + this.NAME + "_wall", new WallBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.MossyCobbled)) {
            Pair<Block, Item> MOSSY_COBBLED = Blocks.register("mossy_cobbled_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("mossy_cobbled_" + this.NAME + "_slab", new SlabBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_cobbled_" + this.NAME + "_stairs", new StairsBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_cobbled_" + this.NAME + "_wall", new WallBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Shingles)) {
            Pair<Block, Item> BRICKS = Blocks.register(this.NAME + "_shingles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register(this.NAME + "_shingle_slab", new SlabBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_shingle_stairs", new StairsBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_shingle_wall", new WallBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.MossyShingles)) {
            Pair<Block, Item> MOSSY_SHINGLES = Blocks.register(this.NAME + "_mossy_shingles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_shingle_slab", new SlabBlock(MOSSY_SHINGLES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_SHINGLES.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_shingle_stairs", new StairsBlock(MOSSY_SHINGLES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_SHINGLES.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_shingle_wall", new WallBlock(MOSSY_SHINGLES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_SHINGLES.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.CrackedShingles)) {
            Pair<Block, Item> CRACKED_BRICKS = Blocks.register("cracked_" + this.NAME + "_shingles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_shingle_slab", new SlabBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_shingle_stairs", new StairsBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_shingle_wall", new WallBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Bricks)) {
            Pair<Block, Item> BRICKS = Blocks.register(this.NAME + "_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register(this.NAME + "_brick_slab", new SlabBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_brick_stairs", new StairsBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_brick_wall", new WallBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.MossyBricks)) {
            Pair<Block, Item> MOSSY_BRICKS = Blocks.register("mossy_" + this.NAME + "_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_brick_slab", new SlabBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_brick_stairs", new StairsBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_brick_wall", new WallBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.CrackedBricks)) {
            Pair<Block, Item> CRACKED_BRICKS = Blocks.register("cracked_" + this.NAME + "_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_brick_slab", new SlabBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_brick_stairs", new StairsBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_brick_wall", new WallBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Briquettes)) {
            Pair<Block, Item> BRIQUETTES = Blocks.register(this.NAME + "_briquettes", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register(this.NAME + "_briquettes_slab", new SlabBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_briquettes_stairs", new StairsBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_briquettes_wall", new WallBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.MossyBriquette)) {
            Pair<Block, Item> MOSSY_BRIQUETTES = Blocks.register("mossy_" + this.NAME + "_briquettes", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_briquettes_slab", new SlabBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_briquettes_stairs", new StairsBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_briquettes_wall", new WallBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.CrackedBriquette)) {
            Pair<Block, Item> CRACKED_BRIQUETTES = Blocks.register("cracked_" + this.NAME + "_briquettes", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_briquettes_slab", new SlabBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_briquettes_stairs", new StairsBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_briquettes_wall", new WallBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Packed)) {
            Pair<Block, Item> PACKED = Blocks.register("packed_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("packed_" + this.NAME + "_slab", new SlabBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), ITEM_GROUP);
            Blocks.register("packed_" + this.NAME + "_stairs", new StairsBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), ITEM_GROUP);
            Blocks.register("packed_" + this.NAME + "_wall", new WallBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Chiseled)) {
//            private final Pair<Block, Item> CHISELED_RUNES;
//            private final Pair<Block, Item> CHISELED_GEOMETRIC;
//            private final Pair<Block, Item> CHISELED_DANCE;
//            private final Pair<Block, Item> CHISELED_HEAD;
//            private final Pair<Block, Item> CHISELED_WRITING;
        }

        if (!this.LIST.contains(Kinds.Pillar)) {
            Blocks.register(this.NAME + "_pillar", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Column)) {
            Blocks.register(this.NAME + "_column", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }

        if (!this.LIST.contains(Kinds.Tombstone)) {
//            TOMBSTONE = Blocks.register(this.NAME + "_tombstone", new Block(FabricBlockSettings.copy(SMOOTH)), ITEM_GROUP);
        }

    }
}
