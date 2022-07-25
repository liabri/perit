package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.liabri.perit.blocks.DoorBlock;
import org.liabri.perit.blocks.FenceBlock;
import org.liabri.perit.blocks.FenceGateBlock;
import org.liabri.perit.blocks.TrapdoorBlock;

public class WoodMaterial extends Material {

    public enum Kinds implements Material.Kinds {
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
        Chiseled
    }

    public WoodMaterial(String name, Block block, ItemGroup itemGroup, boolean whitelist, WoodMaterial.Kinds[] list) {
        super(name, block, itemGroup, whitelist, list);
    }

    @Override
    public void register() {
        if (this.LIST.contains(org.liabri.perit.materials.WoodMaterial.Kinds.Base) == this.WHITELIST) {
            Pair<Block, Item> BASE = org.liabri.perit.blocks.Blocks.register(this.NAME + "_block", new Block(FabricBlockSettings.copyOf(this.BASE)), ITEM_GROUP);
            org.liabri.perit.blocks.Blocks.register(this.NAME + "_slab", new org.liabri.perit.blocks.SlabBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
            org.liabri.perit.blocks.Blocks.register(this.NAME + "_stairs", new org.liabri.perit.blocks.StairsBlock(BASE.getLeft().getDefaultState(), FabricBlockSettings.copy(BASE.getLeft())), ITEM_GROUP);
        }

        if (this.LIST.contains(org.liabri.perit.materials.WoodMaterial.Kinds.Fence) == this.WHITELIST) {
            org.liabri.perit.blocks.Blocks.register(this.NAME + "_fence", new FenceBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(org.liabri.perit.materials.WoodMaterial.Kinds.FenceGate) == this.WHITELIST) {
            org.liabri.perit.blocks.Blocks.register(this.NAME + "_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(org.liabri.perit.materials.WoodMaterial.Kinds.Door) == this.WHITELIST) {
            org.liabri.perit.blocks.Blocks.register(this.NAME + "_door", new DoorBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(org.liabri.perit.materials.WoodMaterial.Kinds.Trapdoor) == this.WHITELIST) {
            org.liabri.perit.blocks.Blocks.register(this.NAME + "_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(org.liabri.perit.materials.WoodMaterial.Kinds.SmoothPlanks) == this.WHITELIST) {
            Pair<Block, Item> SMOOTH_PLANKS = org.liabri.perit.blocks.Blocks.register("smooth_" + this.NAME + "_planks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            org.liabri.perit.blocks.Blocks.register("smooth_" + this.NAME + "_plank_slab", new org.liabri.perit.blocks.SlabBlock(SMOOTH_PLANKS.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH_PLANKS.getLeft())), ITEM_GROUP);
            org.liabri.perit.blocks.Blocks.register("smooth_" + this.NAME + "_plank_stairs", new org.liabri.perit.blocks.StairsBlock(SMOOTH_PLANKS.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH_PLANKS.getLeft())), ITEM_GROUP);
        }
    }
}
