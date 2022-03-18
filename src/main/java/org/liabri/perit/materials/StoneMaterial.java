package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.liabri.perit.blocks.Blocks;
import org.liabri.perit.blocks.SlabBlock;
import org.liabri.perit.blocks.StairsBlock;
import org.liabri.perit.blocks.WallBlock;

public class StoneMaterial extends Material {
//    private final String NAME;
//    private final List<Kinds> LIST;
//    private final Block BASE;
//    private final ItemGroup ITEM_GROUP;
//    private final boolean WHITELIST;

    public enum Kinds implements org.liabri.perit.materials.Kinds {
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
        HerringboneBricks,
        MossyHerringboneBricks,
        CrackedHerringboneBricks,
        Briquettes,
        MossyBriquettes,
        CrackedBriquettes,
        Packed,
        Pillar,
        Column,
        Chiseled
    }

    public StoneMaterial(String name, Block block, ItemGroup itemGroup, boolean whitelist, Kinds[] list) {
        super(name, block, itemGroup, whitelist, list);
//        this.NAME = name;
//        this.LIST = Arrays.asList(list);
//        this.BASE = block;
//        this.ITEM_GROUP = ITEM_GROUP;
//        this.WHITELIST = whitelist;
    }

    @Override
    public void register() {
        if (this.LIST.contains(Kinds.Smooth) == this.WHITELIST) {
            Pair<Block, Item> SMOOTH = Blocks.register("smooth_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("smooth_" + this.NAME + "_slab", new SlabBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), ITEM_GROUP);
            Blocks.register("smooth_" + this.NAME + "_stairs", new StairsBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), ITEM_GROUP);
            Blocks.register("smooth_" + this.NAME + "_wall", new WallBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Cut) == this.WHITELIST) {
            Pair<Block, Item> CUT = Blocks.register("cut_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cut_" + this.NAME + "_slab", new SlabBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), ITEM_GROUP);
            Blocks.register("cut_" + this.NAME + "_stairs", new StairsBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), ITEM_GROUP);
            Blocks.register("cut_" + this.NAME + "_wall", new WallBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.CrackedCut) == this.WHITELIST) {
            Pair<Block, Item> CRACKED_CUT = Blocks.register("cracked_cut_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_cut_" + this.NAME + "_slab", new SlabBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_cut_" + this.NAME + "_stairs", new StairsBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_cut_" + this.NAME + "_wall", new WallBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Polished) == this.WHITELIST) {
            Pair<Block, Item> POLISHED = Blocks.register("polished_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("polished_" + this.NAME + "_slab", new SlabBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), ITEM_GROUP);
            Blocks.register("polished_" + this.NAME + "_stairs", new StairsBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), ITEM_GROUP);
            Blocks.register("polished_" + this.NAME + "_wall", new WallBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.CrackedPolished) == this.WHITELIST) {
            Pair<Block, Item> CRACKED_POLISHED = Blocks.register("cracked_polished_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_polished_" + this.NAME + "_slab", new SlabBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_polished_" + this.NAME + "_stairs", new StairsBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_polished_" + this.NAME + "_wall", new WallBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Cobbled) == this.WHITELIST) {
            Pair<Block, Item> COBBLED = Blocks.register("cobbled_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cobbled_" + this.NAME + "_slab", new SlabBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), ITEM_GROUP);
            Blocks.register("cobbled_" + this.NAME + "_stairs", new StairsBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), ITEM_GROUP);
            Blocks.register("cobbled_" + this.NAME + "_wall", new WallBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.MossyCobbled) == this.WHITELIST) {
            Pair<Block, Item> MOSSY_COBBLED = Blocks.register("mossy_cobbled_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("mossy_cobbled_" + this.NAME + "_slab", new SlabBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_cobbled_" + this.NAME + "_stairs", new StairsBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_cobbled_" + this.NAME + "_wall", new WallBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Shingles) == this.WHITELIST) {
            Pair<Block, Item> BRICKS = Blocks.register(this.NAME + "_shingles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register(this.NAME + "_shingle_slab", new SlabBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_shingle_stairs", new StairsBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_shingle_wall", new WallBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.MossyShingles) == this.WHITELIST) {
            Pair<Block, Item> MOSSY_SHINGLES = Blocks.register("mossy_" + this.NAME + "_shingles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_shingle_slab", new SlabBlock(MOSSY_SHINGLES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_SHINGLES.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_shingle_stairs", new StairsBlock(MOSSY_SHINGLES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_SHINGLES.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_shingle_wall", new WallBlock(MOSSY_SHINGLES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_SHINGLES.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.CrackedShingles) == this.WHITELIST) {
            Pair<Block, Item> CRACKED_BRICKS = Blocks.register("cracked_" + this.NAME + "_shingles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_shingle_slab", new SlabBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_shingle_stairs", new StairsBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_shingle_wall", new WallBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Bricks) == this.WHITELIST) {
            Pair<Block, Item> BRICKS = Blocks.register(this.NAME + "_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register(this.NAME + "_brick_slab", new SlabBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_brick_stairs", new StairsBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_brick_wall", new WallBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.MossyBricks) == this.WHITELIST) {
            Pair<Block, Item> MOSSY_BRICKS = Blocks.register("mossy_" + this.NAME + "_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_brick_slab", new SlabBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_brick_stairs", new StairsBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_brick_wall", new WallBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.CrackedBricks) == this.WHITELIST) {
            Pair<Block, Item> CRACKED_BRICKS = Blocks.register("cracked_" + this.NAME + "_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_brick_slab", new SlabBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_brick_stairs", new StairsBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_brick_wall", new WallBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.HerringboneBricks) == this.WHITELIST) {
            Pair<Block, Item> HERRINGBONE_BRICKS = Blocks.register(this.NAME + "_herringbone_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register(this.NAME + "_herringbone_brick_slab", new SlabBlock(HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_herringbone_brick_stairs", new StairsBlock(HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_herringbone_brick_wall", new WallBlock(HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.MossyHerringboneBricks) == this.WHITELIST) {
            Pair<Block, Item> MOSSY_HERRINGBONE_BRICKS = Blocks.register("mossy_" + this.NAME + "_herringbone_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_herringbone_brick_slab", new SlabBlock(MOSSY_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_herringbone_brick_stairs", new StairsBlock(MOSSY_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_herringbone_brick_wall", new WallBlock(MOSSY_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.CrackedHerringboneBricks) == this.WHITELIST) {
            Pair<Block, Item> CRACKED_HERRINGBONE_BRICKS = Blocks.register("cracked_" + this.NAME + "herringbone_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_herringbone_brick_slab", new SlabBlock(CRACKED_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_herringbone_brick_stairs", new StairsBlock(CRACKED_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_herringbone_brick_wall", new WallBlock(CRACKED_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Briquettes) == this.WHITELIST) {
            Pair<Block, Item> BRIQUETTES = Blocks.register(this.NAME + "_briquettes", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register(this.NAME + "_briquettes_slab", new SlabBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_briquettes_stairs", new StairsBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register(this.NAME + "_briquettes_wall", new WallBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.MossyBriquettes) == this.WHITELIST) {
            Pair<Block, Item> MOSSY_BRIQUETTES = Blocks.register("mossy_" + this.NAME + "_briquettes", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_briquettes_slab", new SlabBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_briquettes_stairs", new StairsBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register("mossy_" + this.NAME + "_briquettes_wall", new WallBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.CrackedBriquettes) == this.WHITELIST) {
            Pair<Block, Item> CRACKED_BRIQUETTES = Blocks.register("cracked_" + this.NAME + "_briquettes", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_briquettes_slab", new SlabBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_briquettes_stairs", new StairsBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), ITEM_GROUP);
            Blocks.register("cracked_" + this.NAME + "_briquettes_wall", new WallBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Packed) == this.WHITELIST) {
            Pair<Block, Item> PACKED = Blocks.register("packed_" + this.NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            Blocks.register("packed_" + this.NAME + "_slab", new SlabBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), ITEM_GROUP);
            Blocks.register("packed_" + this.NAME + "_stairs", new StairsBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), ITEM_GROUP);
            Blocks.register("packed_" + this.NAME + "_wall", new WallBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Chiseled) == this.WHITELIST) {
//            private final Pair<Block, Item> CHISELED_RUNES;
//            private final Pair<Block, Item> CHISELED_GEOMETRIC;
//            private final Pair<Block, Item> CHISELED_DANCE;
//            private final Pair<Block, Item> CHISELED_HEAD;
//            private final Pair<Block, Item> CHISELED_WRITING;
        }

        if (this.LIST.contains(Kinds.Pillar) == this.WHITELIST) {
            Blocks.register(this.NAME + "_pillar", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Column) == this.WHITELIST) {
            Blocks.register(this.NAME + "_column", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }
    }
}
