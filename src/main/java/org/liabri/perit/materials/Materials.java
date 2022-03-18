package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BambooBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.liabri.perit.blocks.SpikesBlock;

import static org.liabri.perit.blocks.Blocks.register;

public class Materials {
    public static void init() {}

    public static final String[] COLOURS = {
            "black",
            "blue",
            "brown",
            "cyan",
            "green",
            "grey",
            "light_blue",
            "light_grey",
            "lime",
            "magenta",
            "orange",
            "pink",
            "purple",
            "red",
            "white",
            "yellow"
    };

    static {
        for (String colour: COLOURS) {
            new StoneMaterial(colour + "_terracotta", Blocks.TERRACOTTA, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                    StoneMaterial.Kinds.Bricks,
                    StoneMaterial.Kinds.HerringboneBricks,
                    StoneMaterial.Kinds.Packed
            });
        }

        new StoneMaterial( "andesite", Blocks.ANDESITE, ItemGroup.BUILDING_BLOCKS, false, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Base,
                StoneMaterial.Kinds.Polished,
        });

        new StoneMaterial( "sandstone", Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Pillar
        });

        new StoneMaterial( "red_sandstone", Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Pillar
        });

        new StoneMaterial( "blackstone", Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Cut,
                StoneMaterial.Kinds.Pillar
        });

        register("bamboo_spikes", new SpikesBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
        new WoodMaterial("bamboo", Blocks.BAMBOO, ItemGroup.BUILDING_BLOCKS, true, new WoodMaterial.Kinds[]{
                WoodMaterial.Kinds.Base,
                WoodMaterial.Kinds.Door,
                WoodMaterial.Kinds.Fence,
                WoodMaterial.Kinds.FenceGate
        });

        Pair<Block, Item> DRY_BAMBOO = register("dry_bamboo", new BambooBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
        register("dry_bamboo_spikes", new SpikesBlock(FabricBlockSettings.copyOf(DRY_BAMBOO.getLeft())), ItemGroup.BUILDING_BLOCKS);
        new WoodMaterial("dry_bamboo", DRY_BAMBOO.getLeft(), ItemGroup.BUILDING_BLOCKS, true, new WoodMaterial.Kinds[]{
                WoodMaterial.Kinds.Base,
                WoodMaterial.Kinds.Door,
                WoodMaterial.Kinds.Fence,
                WoodMaterial.Kinds.FenceGate
        });
    }
}

