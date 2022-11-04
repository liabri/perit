package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.liabri.perit.PeritDataGenerator;
import org.liabri.perit.blocks.DoorBlock;
import org.liabri.perit.blocks.FenceBlock;
import org.liabri.perit.blocks.FenceGateBlock;
import org.liabri.perit.blocks.TrapdoorBlock;

import java.util.function.Consumer;

public class WoodMaterial extends Material {

    public enum Kind implements Material.Kind {
        Base,
        Log,
        StrippedLog,
        Wood,
        StrippedWood,
        SmoothPlanks,
        Planks,
        Barrel,
        Chest,
        TrappedChest,
        CraftingTable,
        Fence,
        FenceGate,
        Door,
        Trapdoor,
        Button,
        PressurePlate,
        Sign,
        Ladder,
        Bookshelf,
        Bookcase,
        Crate,
        Lectern,
        Chiseled,
        Boat
    }

    public WoodMaterial(String name, Block block, ItemGroup itemGroup, WoodMaterial.Kind[] list) {
        super(name, block, itemGroup, list);
    }

    @Override
    public void init() {
//        if (this.LIST.contains(Kind.Base)) {
//            Pair<Block, Item> BASE = org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_block", new Block(FabricBlockSettings.copyOf(this.BASE)), ITEM_GROUP);
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_slab", new org.liabri.perit.blocks.WoodenSlabBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_stairs", new org.liabri.perit.blocks.WoodenStairsBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
//        }
//
//        if (this.LIST.contains(Kind.Planks)) {
//            Pair<Block, Item> BASE = org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_planks", new Block(FabricBlockSettings.copyOf(this.BASE)), ITEM_GROUP);
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_slab", new org.liabri.perit.blocks.WoodenSlabBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_stairs", new org.liabri.perit.blocks.WoodenStairsBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
//        }
//
//        if (this.LIST.contains(Kind.Ladder)) {
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_ladder", new LadderBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
//        }
//
//        if (this.LIST.contains(Kind.Bookshelf)) {
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_bookshelf", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
//        }
//
//        if (this.LIST.contains(Kind.Fence)) {
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_fence", new FenceBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
//        }
//
//        if (this.LIST.contains(Kind.FenceGate)) {
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
//        }
//
//        if (this.LIST.contains(Kind.Boat)) {
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_door", new DoorBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
//        }
//
//        if (this.LIST.contains(Kind.Boat)) {
////            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_boat", new BoatEntity();
//        }
//
//        if (this.LIST.contains(Kind.Trapdoor)) {
//            org.liabri.perit.blocks.Blocks.register(this.COMPOSE_NAME + "_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
//        }
//
//        if (this.LIST.contains(Kind.SmoothPlanks)) {
//            Pair<Block, Item> SMOOTH_PLANKS = org.liabri.perit.blocks.Blocks.register("smooth_" + this.COMPOSE_NAME + "_planks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
//            org.liabri.perit.blocks.Blocks.register("smooth_" + this.COMPOSE_NAME + "_plank_slab", new org.liabri.perit.blocks.SlabBlock(SMOOTH_PLANKS.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH_PLANKS.getLeft())), ITEM_GROUP);
//            org.liabri.perit.blocks.Blocks.register("smooth_" + this.COMPOSE_NAME + "_plank_stairs", new org.liabri.perit.blocks.StairsBlock(SMOOTH_PLANKS.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH_PLANKS.getLeft())), ITEM_GROUP);
//        }
    }

    public void generate_recipes(Consumer<RecipeJsonProvider> exporter) {

    }

    @Override
    public void generateTags(PeritDataGenerator.PeritBlockTagProvider peritBlockTagProvider) {

    }

    @Override
    public void generateTags(PeritDataGenerator.PeritItemTagProvider peritBlockTagProvider) {

    }
}
