package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;

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
        if (this.LIST.contains(Kinds.SmoothPlanks) == this.WHITELIST) {
            Pair<Block, Item> SMOOTH_PLANKS = org.liabri.perit.blocks.Blocks.register("smooth_" + this.NAME + "_planks", new Block(FabricBlockSettings.copyOf(BASE)), ITEM_GROUP);
            org.liabri.perit.blocks.Blocks.register("smooth_" + this.NAME + "_plank_slab", new org.liabri.perit.blocks.SlabBlock(SMOOTH_PLANKS.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH_PLANKS.getLeft())), ITEM_GROUP);
            org.liabri.perit.blocks.Blocks.register("smooth_" + this.NAME + "_plank_stairs", new org.liabri.perit.blocks.StairsBlock(SMOOTH_PLANKS.getLeft().getDefaultState(), FabricBlockSettings.copy(SMOOTH_PLANKS.getLeft())), ITEM_GROUP);
        }
    }
}
