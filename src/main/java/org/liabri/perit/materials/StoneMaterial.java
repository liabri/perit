package org.liabri.perit.materials;

import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Pair;
import org.liabri.perit.PeritDataGenerator;
import org.liabri.perit.blocks.*;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static net.minecraft.data.server.RecipeProvider.*;

public class StoneMaterial extends Material {
    public enum Kind implements Material.Kind {
        Base,

        CrackedBase,
        Smooth,
        Cut,
        CrackedCut,
        Polished,
        CrackedPolished,
        Packed,
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
        Pillar,
        Column,
        Chiseled,
        Setts,
        Tiles;

//        public enum SubKind {
//            STAIRS,
//            WALL,
//            SLAB,
//            PILLAR,
//            CUBE,
//        }
//
//        private final SubKind subKind;
//
//
//        Kind(SubKind subKind) {
//            this.subKind = subKind;
//        }
    }

    public StoneMaterial(String name, Block block, ItemGroup itemGroup, StoneMaterial.Kind[] list) {
        super(name, block, itemGroup, list);
    }

    public StoneMaterial(String name, String textureName, Block block, ItemGroup itemGroup, StoneMaterial.Kind[] list) {
        super(name, textureName, block, itemGroup, list);
    }

    @Override
    public void generate_recipes(Consumer<RecipeJsonProvider> exporter) {
        for(Pair<Material.Kind, Pair<Block, Item>> bi : blocks) {
            Block block = bi.getRight().getLeft();

            if (block instanceof SlabBlock slabBlock) {
                offerStonecuttingRecipe(exporter, slabBlock, slabBlock.getBaseBlockState().getBlock(), 2);
            } else if (block instanceof WallBlock wallBlock) {
                offerStonecuttingRecipe(exporter, wallBlock, wallBlock.getBaseBlockState().getBlock(), 1);
            } else if (block instanceof StairsBlock stairsBlock) {
                offerStonecuttingRecipe(exporter, stairsBlock, stairsBlock.getBaseBlockState().getBlock(), 1);
            } else if (bi.getLeft().equals(Kind.Smooth)) {
                offerSmelting(exporter, List.of(new ItemConvertible[]{this.BASE}), bi.getRight().getRight(), 0.1F, 200, block.getTranslationKey());
            } else {
                offerStonecuttingRecipe(exporter, bi.getRight().getRight(), this.BASE, 1);
            }
        }
    }

    @Override
    public void generateTags(PeritDataGenerator.PeritBlockTagProvider peritBlockTagProvider) {
        for(Pair<Material.Kind, Pair<Block, Item>> bi : blocks) {
            Block block = bi.getRight().getLeft();
            if (block instanceof SlabBlock slabBlock) {
                peritBlockTagProvider.getOrCreateTagBuilder(BlockTags.SLABS).add(slabBlock);
            } else if (block instanceof WallBlock wallBlock) {
                peritBlockTagProvider.getOrCreateTagBuilder(BlockTags.WALLS).add(wallBlock);
            } else if (block instanceof StairsBlock stairsBlock) {
                peritBlockTagProvider.getOrCreateTagBuilder(BlockTags.STAIRS).add(stairsBlock);
            }

        }
    }

    @Override
    public void generateTags(PeritDataGenerator.PeritItemTagProvider peritBlockTagProvider) {

    }

    @Override
    public void init() {
        if (this.LIST.contains(Kind.Base)) {
            Pair<Block, Item> BASE = register(Kind.Base, this.BASE_NAME, new Block(FabricBlockSettings.copyOf(this.BASE)), ITEM_GROUP);
            register(Kind.Base,this.COMPOSE_NAME + "_slab", new SlabBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
            register(Kind.Base,this.COMPOSE_NAME + "_stairs", new StairsBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
            register(Kind.Base,this.COMPOSE_NAME + "_wall", new WallBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
            this.BASE = BASE.getLeft();
        }

        if (this.LIST.contains(Kind.CrackedBase)) {
            Pair<Block, Item> BASE = register(Kind.CrackedBase, "cracked_" + this.BASE_NAME, new Block(FabricBlockSettings.copyOf(this.BASE)), ITEM_GROUP);
            register(Kind.CrackedBase,"cracked_" + this.COMPOSE_NAME + "_slab", new SlabBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
            register(Kind.CrackedBase,"cracked_" + this.COMPOSE_NAME + "_stairs", new StairsBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
            register(Kind.CrackedBase,"cracked_" + this.COMPOSE_NAME + "_wall", new WallBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
            this.BASE = BASE.getLeft();
        }

        if (this.LIST.contains(Kind.Smooth)) {
            Pair<Block, Item> SMOOTH = register(Kind.Smooth,"smooth_" + this.COMPOSE_NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Smooth,"smooth_" + this.COMPOSE_NAME + "_slab", new SlabBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), ITEM_GROUP);
            register(Kind.Smooth,"smooth_" + this.COMPOSE_NAME + "_stairs", new StairsBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), ITEM_GROUP);
            register(Kind.Smooth,"smooth_" + this.COMPOSE_NAME + "_wall", new WallBlock(SMOOTH.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Cut)) {
            Pair<Block, Item> CUT = register(Kind.Cut ,"cut_" + this.COMPOSE_NAME, new PillarBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Cut ,"cut_" + this.COMPOSE_NAME + "_slab", new SlabBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), ITEM_GROUP);
            register(Kind.Cut ,"cut_" + this.COMPOSE_NAME + "_stairs", new StairsBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), ITEM_GROUP);
            register(Kind.Cut ,"cut_" + this.COMPOSE_NAME + "_wall", new WallBlock(CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CUT.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.CrackedCut)) {
            Pair<Block, Item> CRACKED_CUT = register(Kind.CrackedCut ,"cracked_cut_" + this.COMPOSE_NAME, new PillarBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.CrackedCut ,"cracked_cut_" + this.COMPOSE_NAME + "_slab", new SlabBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), ITEM_GROUP);
            register(Kind.CrackedCut ,"cracked_cut_" + this.COMPOSE_NAME + "_stairs", new StairsBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), ITEM_GROUP);
            register(Kind.CrackedCut ,"cracked_cut_" + this.COMPOSE_NAME + "_wall", new WallBlock(CRACKED_CUT.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_CUT.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Polished)) {
            Pair<Block, Item> POLISHED = register(Kind.Polished ,"polished_" + this.COMPOSE_NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Polished ,"polished_" + this.COMPOSE_NAME + "_slab", new SlabBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), ITEM_GROUP);
            register(Kind.Polished ,"polished_" + this.COMPOSE_NAME + "_stairs", new StairsBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), ITEM_GROUP);
            register(Kind.Polished ,"polished_" + this.COMPOSE_NAME + "_wall", new WallBlock(POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(POLISHED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.CrackedPolished)) {
            Pair<Block, Item> CRACKED_POLISHED = register(Kind.CrackedPolished ,"cracked_polished_" + this.COMPOSE_NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.CrackedPolished ,"cracked_polished_" + this.COMPOSE_NAME + "_slab", new SlabBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), ITEM_GROUP);
            register(Kind.CrackedPolished ,"cracked_polished_" + this.COMPOSE_NAME + "_stairs", new StairsBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), ITEM_GROUP);
            register(Kind.CrackedPolished ,"cracked_polished_" + this.COMPOSE_NAME + "_wall", new WallBlock(CRACKED_POLISHED.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_POLISHED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Packed)) {
            Pair<Block, Item> PACKED = register(Kind.Packed ,"packed_" + this.COMPOSE_NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Packed ,"packed_" + this.COMPOSE_NAME + "_slab", new SlabBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), ITEM_GROUP);
            register(Kind.Packed ,"packed_" + this.COMPOSE_NAME + "_stairs", new StairsBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), ITEM_GROUP);
            register(Kind.Packed ,"packed_" + this.COMPOSE_NAME + "_wall", new WallBlock(PACKED.getLeft().getDefaultState(), FabricBlockSettings.copy(PACKED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Cobbled)) {
            Pair<Block, Item> COBBLED = register(Kind.Cobbled ,"cobbled_" + this.COMPOSE_NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Cobbled ,"cobbled_" + this.COMPOSE_NAME + "_slab", new SlabBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), ITEM_GROUP);
            register(Kind.Cobbled ,"cobbled_" + this.COMPOSE_NAME + "_stairs", new StairsBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), ITEM_GROUP);
            register(Kind.Cobbled ,"cobbled_" + this.COMPOSE_NAME + "_wall", new WallBlock(COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(COBBLED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.MossyCobbled)) {
            Pair<Block, Item> MOSSY_COBBLED = register(Kind.MossyCobbled ,"mossy_cobbled_" + this.COMPOSE_NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.MossyCobbled ,"mossy_cobbled_" + this.COMPOSE_NAME + "_slab", new SlabBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), ITEM_GROUP);
            register(Kind.MossyCobbled ,"mossy_cobbled_" + this.COMPOSE_NAME + "_stairs", new StairsBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), ITEM_GROUP);
            register(Kind.MossyCobbled ,"mossy_cobbled_" + this.COMPOSE_NAME + "_wall", new WallBlock(MOSSY_COBBLED.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_COBBLED.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Shingles)) {
            Pair<Block, Item> BRICKS = register(Kind.Shingles ,this.COMPOSE_NAME + "_shingles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Shingles ,this.COMPOSE_NAME + "_shingle_slab", new SlabBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.Shingles ,this.COMPOSE_NAME + "_shingle_stairs", new StairsBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.Shingles ,this.COMPOSE_NAME + "_shingle_wall", new WallBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.MossyShingles)) {
            Pair<Block, Item> MOSSY_SHINGLES = register(Kind.MossyShingles ,"mossy_" + this.COMPOSE_NAME + "_shingles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.MossyShingles ,"mossy_" + this.COMPOSE_NAME + "_shingle_slab", new SlabBlock(MOSSY_SHINGLES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_SHINGLES.getLeft())), ITEM_GROUP);
            register(Kind.MossyShingles ,"mossy_" + this.COMPOSE_NAME + "_shingle_stairs", new StairsBlock(MOSSY_SHINGLES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_SHINGLES.getLeft())), ITEM_GROUP);
            register(Kind.MossyShingles ,"mossy_" + this.COMPOSE_NAME + "_shingle_wall", new WallBlock(MOSSY_SHINGLES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_SHINGLES.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.CrackedShingles)) {
            Pair<Block, Item> CRACKED_BRICKS = register(Kind.CrackedShingles ,"cracked_" + this.COMPOSE_NAME + "_shingles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.CrackedShingles ,"cracked_" + this.COMPOSE_NAME + "_shingle_slab", new SlabBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.CrackedShingles ,"cracked_" + this.COMPOSE_NAME + "_shingle_stairs", new StairsBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.CrackedShingles ,"cracked_" + this.COMPOSE_NAME + "_shingle_wall", new WallBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Bricks)) {
            Pair<Block, Item> BRICKS = register(Kind.Bricks ,this.COMPOSE_NAME + "_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Bricks ,this.COMPOSE_NAME + "_brick_slab", new SlabBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.Bricks ,this.COMPOSE_NAME + "_brick_stairs", new StairsBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.Bricks ,this.COMPOSE_NAME + "_brick_wall", new WallBlock(BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Setts)) {
            Pair<Block, Item> SETTS = register(Kind.Setts ,this.COMPOSE_NAME + "_setts", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Setts ,this.COMPOSE_NAME + "_sett_slab", new SlabBlock(SETTS.getLeft().getDefaultState(), FabricBlockSettings.copy(SETTS.getLeft())), ITEM_GROUP);
            register(Kind.Setts ,this.COMPOSE_NAME + "_sett_stairs", new StairsBlock(SETTS.getLeft().getDefaultState(), FabricBlockSettings.copy(SETTS.getLeft())), ITEM_GROUP);
            register(Kind.Setts ,this.COMPOSE_NAME + "_sett_wall", new WallBlock(SETTS.getLeft().getDefaultState(), FabricBlockSettings.copy(SETTS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Tiles)) {
            Pair<Block, Item> TILES = register(Kind.Tiles ,this.COMPOSE_NAME + "_tiles", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Tiles ,this.COMPOSE_NAME + "_tile_slab", new SlabBlock(TILES.getLeft().getDefaultState(), FabricBlockSettings.copy(TILES.getLeft())), ITEM_GROUP);
            register(Kind.Tiles ,this.COMPOSE_NAME + "_tile_stairs", new StairsBlock(TILES.getLeft().getDefaultState(), FabricBlockSettings.copy(TILES.getLeft())), ITEM_GROUP);
            register(Kind.Tiles ,this.COMPOSE_NAME + "_tile_wall", new WallBlock(TILES.getLeft().getDefaultState(), FabricBlockSettings.copy(TILES.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.MossyBricks)) {
            Pair<Block, Item> MOSSY_BRICKS = register(Kind.MossyBricks ,"mossy_" + this.COMPOSE_NAME + "_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.MossyBricks ,"mossy_" + this.COMPOSE_NAME + "_brick_slab", new SlabBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.MossyBricks ,"mossy_" + this.COMPOSE_NAME + "_brick_stairs", new StairsBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.MossyBricks ,"mossy_" + this.COMPOSE_NAME + "_brick_wall", new WallBlock(MOSSY_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.CrackedBricks)) {
            Pair<Block, Item> CRACKED_BRICKS = register(Kind.CrackedBricks ,"cracked_" + this.COMPOSE_NAME + "_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.CrackedBricks ,"cracked_" + this.COMPOSE_NAME + "_brick_slab", new SlabBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.CrackedBricks ,"cracked_" + this.COMPOSE_NAME + "_brick_stairs", new StairsBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.CrackedBricks ,"cracked_" + this.COMPOSE_NAME + "_brick_wall", new WallBlock(CRACKED_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.HerringboneBricks)) {
            Pair<Block, Item> HERRINGBONE_BRICKS = register(Kind.HerringboneBricks ,this.COMPOSE_NAME + "_herringbone_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.HerringboneBricks ,this.COMPOSE_NAME + "_herringbone_brick_slab", new SlabBlock(HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.HerringboneBricks ,this.COMPOSE_NAME + "_herringbone_brick_stairs", new StairsBlock(HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.HerringboneBricks ,this.COMPOSE_NAME + "_herringbone_brick_wall", new WallBlock(HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.MossyHerringboneBricks)) {
            Pair<Block, Item> MOSSY_HERRINGBONE_BRICKS = register(Kind.MossyHerringboneBricks ,"mossy_" + this.COMPOSE_NAME + "_herringbone_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.MossyHerringboneBricks ,"mossy_" + this.COMPOSE_NAME + "_herringbone_brick_slab", new SlabBlock(MOSSY_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.MossyHerringboneBricks ,"mossy_" + this.COMPOSE_NAME + "_herringbone_brick_stairs", new StairsBlock(MOSSY_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.MossyHerringboneBricks ,"mossy_" + this.COMPOSE_NAME + "_herringbone_brick_wall", new WallBlock(MOSSY_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.CrackedHerringboneBricks)) {
            Pair<Block, Item> CRACKED_HERRINGBONE_BRICKS = register(Kind.CrackedHerringboneBricks ,"cracked_" + this.COMPOSE_NAME + "herringbone_bricks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.CrackedHerringboneBricks ,"cracked_" + this.COMPOSE_NAME + "_herringbone_brick_slab", new SlabBlock(CRACKED_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.CrackedHerringboneBricks ,"cracked_" + this.COMPOSE_NAME + "_herringbone_brick_stairs", new StairsBlock(CRACKED_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
            register(Kind.CrackedHerringboneBricks ,"cracked_" + this.COMPOSE_NAME + "_herringbone_brick_wall", new WallBlock(CRACKED_HERRINGBONE_BRICKS.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_HERRINGBONE_BRICKS.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Briquettes)) {
            Pair<Block, Item> BRIQUETTES = register(Kind.Briquettes ,this.COMPOSE_NAME + "_briquettes", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.Briquettes ,this.COMPOSE_NAME + "_briquettes_slab", new SlabBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), ITEM_GROUP);
            register(Kind.Briquettes ,this.COMPOSE_NAME + "_briquettes_stairs", new StairsBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), ITEM_GROUP);
            register(Kind.Briquettes ,this.COMPOSE_NAME + "_briquettes_wall", new WallBlock(BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(BRIQUETTES.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.MossyBriquettes)) {
            Pair<Block, Item> MOSSY_BRIQUETTES = register(Kind.MossyBriquettes ,"mossy_" + this.COMPOSE_NAME + "_briquettes", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.MossyBriquettes ,"mossy_" + this.COMPOSE_NAME + "_briquettes_slab", new SlabBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), ITEM_GROUP);
            register(Kind.MossyBriquettes ,"mossy_" + this.COMPOSE_NAME + "_briquettes_stairs", new StairsBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), ITEM_GROUP);
            register(Kind.MossyBriquettes ,"mossy_" + this.COMPOSE_NAME + "_briquettes_wall", new WallBlock(MOSSY_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(MOSSY_BRIQUETTES.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.CrackedBriquettes)) {
            Pair<Block, Item> CRACKED_BRIQUETTES = register(Kind.CrackedBriquettes ,"cracked_" + this.COMPOSE_NAME + "_briquettes", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            register(Kind.CrackedBriquettes ,"cracked_" + this.COMPOSE_NAME + "_briquettes_slab", new SlabBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), ITEM_GROUP);
            register(Kind.CrackedBriquettes ,"cracked_" + this.COMPOSE_NAME + "_briquettes_stairs", new StairsBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), ITEM_GROUP);
            register(Kind.CrackedBriquettes ,"cracked_" + this.COMPOSE_NAME + "_briquettes_wall", new WallBlock(CRACKED_BRIQUETTES.getLeft().getDefaultState(), FabricBlockSettings.copy(CRACKED_BRIQUETTES.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Chiseled)) {
            register(Kind.CrackedBriquettes ,"chiseled_" + this.BASE_NAME, new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
//            private final Pair<Block, Item> CHISELED_RUNES;
//            private final Pair<Block, Item> CHISELED_GEOMETRIC;
//            private final Pair<Block, Item> CHISELED_DANCE;
//            private final Pair<Block, Item> CHISELED_HEAD;
//            private final Pair<Block, Item> CHISELED_WRITING;
        }

        if (this.LIST.contains(Kind.Pillar)) {
            register(Kind.Pillar ,this.COMPOSE_NAME + "_pillar", new PillarBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Column)) {
            register(Kind.Column ,this.COMPOSE_NAME + "_column", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }
    }
}
