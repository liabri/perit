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
                    StoneMaterial.Kinds.Packed,
                    StoneMaterial.Kinds.Shingles,
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

        register("bamboo_bundle", new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
        new WoodMaterial("bamboo", Blocks.BAMBOO, ItemGroup.BUILDING_BLOCKS, true, new WoodMaterial.Kinds[]{
//                WoodMaterial.Kinds.Fence,
//                WoodMaterial.Kinds.FenceGate,
                WoodMaterial.Kinds.Ladder
        });

        register("stripped_bamboo_bundle", new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
        new WoodMaterial("stripped_bamboo", Blocks.BAMBOO, ItemGroup.BUILDING_BLOCKS, true, new WoodMaterial.Kinds[]{
                WoodMaterial.Kinds.Planks,
                WoodMaterial.Kinds.Door,
                WoodMaterial.Kinds.Trapdoor,
//                WoodMaterial.Kinds.Fence,
//                WoodMaterial.Kinds.FenceGate,
                WoodMaterial.Kinds.Ladder,
                WoodMaterial.Kinds.Bookshelf
        });
    }
}

