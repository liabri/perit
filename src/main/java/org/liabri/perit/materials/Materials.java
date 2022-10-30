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
            "gray",
            "light_blue",
            "light_gray",
            "lime",
            "magenta",
            "orange",
            "pink",
            "purple",
            "red",
            "white",
            "yellow"
    };

    public static final Block[] CONCRETES = {
            Blocks.BLACK_CONCRETE,
            Blocks.BROWN_CONCRETE,
            Blocks.BLUE_CONCRETE,
            Blocks.CYAN_CONCRETE,
            Blocks.GREEN_CONCRETE,
            Blocks.GRAY_CONCRETE,
            Blocks.LIGHT_BLUE_CONCRETE,
            Blocks.LIGHT_GRAY_CONCRETE,
            Blocks.LIME_CONCRETE,
            Blocks.MAGENTA_CONCRETE,
            Blocks.ORANGE_CONCRETE,
            Blocks.PINK_CONCRETE,
            Blocks.PURPLE_CONCRETE,
            Blocks.RED_CONCRETE,
            Blocks.WHITE_CONCRETE,
            Blocks.YELLOW_CONCRETE
    };

    static {
        // Terracotta
        for (String colour: COLOURS) {
            new StoneMaterial(colour + "_terracotta", Blocks.TERRACOTTA, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                    StoneMaterial.Kinds.Bricks,
                    StoneMaterial.Kinds.HerringboneBricks,
                    StoneMaterial.Kinds.Shingles,
                    StoneMaterial.Kinds.Polished,
                    StoneMaterial.Kinds.Packed,
            });
        }

        // Concrete
        for(int i=0; i< CONCRETES.length; i++) {
            new GenericMaterial(COLOURS[i] + "_concrete", CONCRETES[i], ItemGroup.BUILDING_BLOCKS, true, new GenericMaterial.Kinds[]{
                    GenericMaterial.Kinds.Stairs,
                    GenericMaterial.Kinds.Slabs,
                    GenericMaterial.Kinds.Walls
            });
        }

        // Andesite
        new StoneMaterial("andesite", Blocks.ANDESITE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Diorite
        new StoneMaterial("diorite", Blocks.DIORITE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Granite
        new StoneMaterial("granite", Blocks.GRANITE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Tuff
        new StoneMaterial("tuff", Blocks.TUFF, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Calcite
        new StoneMaterial("calcite", Blocks.CALCITE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Basalt
        new StoneMaterial("basalt", Blocks.BASALT, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
        });

        // Dripstone
        new StoneMaterial("dripstone", Blocks.DRIPSTONE_BLOCK, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Deepslate
        new StoneMaterial("deepslate", Blocks.DEEPSLATE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Netherrack
        new StoneMaterial("netherrack", Blocks.NETHERRACK, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Nether bricks
        new StoneMaterial("nether_brick", Blocks.NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Pillar,
        });

        new StoneMaterial("nether_bricks", Blocks.NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Chiseled,
        });

        // Red nether bricks
        new StoneMaterial("red_nether_brick", Blocks.RED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Pillar,
        });

        new StoneMaterial("red_nether_bricks", Blocks.RED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Chiseled,
        });

        // Bone
        new StoneMaterial("bone", Blocks.BONE_BLOCK, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Wither Bone
        new StoneMaterial("wither_bone", Blocks.BONE_BLOCK, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[] {
                StoneMaterial.Kinds.Base,
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Ice
        new StoneMaterial("ice", Blocks.ICE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Obsidian
        new StoneMaterial("obsidian", Blocks.OBSIDIAN, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Soul Sandstone
        new StoneMaterial("soul_sandstone", Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Base,
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Cut,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Sandstone
        new StoneMaterial("sandstone", Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Red Sandstone
        new StoneMaterial("red_sandstone", Blocks.RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Pillar,
        });

        // Quartz
        new GenericMaterial("quartz", "side", Blocks.QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS, true, new GenericMaterial.Kinds[]{
                GenericMaterial.Kinds.Walls
        });

        new GenericMaterial("smooth_quartz", Blocks.SMOOTH_QUARTZ, ItemGroup.BUILDING_BLOCKS, true, new GenericMaterial.Kinds[]{
                GenericMaterial.Kinds.Walls
        });

        new GenericMaterial("quartz_bricks", Blocks.QUARTZ_BRICKS, ItemGroup.BUILDING_BLOCKS, true, new GenericMaterial.Kinds[]{
                GenericMaterial.Kinds.Stairs,
                GenericMaterial.Kinds.Slabs,
                GenericMaterial.Kinds.Walls
        });

        new StoneMaterial( "quartz", Blocks.QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Briquettes,
        });

        // Purpur
        new GenericMaterial("purpur", Blocks.PURPUR_BLOCK, ItemGroup.BUILDING_BLOCKS, true, new GenericMaterial.Kinds[]{
                GenericMaterial.Kinds.Walls
        });

        new StoneMaterial( "purpur", Blocks.PURPUR_BLOCK, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Bricks,
                StoneMaterial.Kinds.Chiseled,
        });

        // End stone
        new GenericMaterial("end_stone", Blocks.END_STONE, ItemGroup.BUILDING_BLOCKS, true, new GenericMaterial.Kinds[]{
                GenericMaterial.Kinds.Stairs,
                GenericMaterial.Kinds.Slabs,
                GenericMaterial.Kinds.Walls
        });

        new StoneMaterial( "end_stone", Blocks.END_STONE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Pillar
        });

        // Prismarine
        new StoneMaterial( "prismarine", Blocks.PRISMARINE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Pillar
        });

        // Dark Prismarine
        new GenericMaterial("dark_prismarine", Blocks.DARK_PRISMARINE, ItemGroup.BUILDING_BLOCKS, true, new GenericMaterial.Kinds[]{
                GenericMaterial.Kinds.Walls
        });

        new StoneMaterial( "dark_prismarine", Blocks.DARK_PRISMARINE, ItemGroup.BUILDING_BLOCKS, true, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Smooth,
                StoneMaterial.Kinds.Polished,
                StoneMaterial.Kinds.Chiseled,
                StoneMaterial.Kinds.Briquettes,
                StoneMaterial.Kinds.Pillar
        });

//
//        register("bamboo_bundle", new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
//        new WoodMaterial("bamboo", Blocks.BAMBOO, ItemGroup.BUILDING_BLOCKS, true, new WoodMaterial.Kinds[]{
////                WoodMaterial.Kinds.Fence,
////                WoodMaterial.Kinds.FenceGate,
//                WoodMaterial.Kinds.Ladder
//        });
//
//        register("stripped_bamboo", new BambooBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
//        register("stripped_bamboo_bundle", new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
//        new WoodMaterial("stripped_bamboo", Blocks.BAMBOO, ItemGroup.BUILDING_BLOCKS, true, new WoodMaterial.Kinds[]{
//                WoodMaterial.Kinds.Planks,
//                WoodMaterial.Kinds.Door,
//                WoodMaterial.Kinds.Trapdoor,
////                WoodMaterial.Kinds.Fence,
////                WoodMaterial.Kinds.FenceGate,
//                WoodMaterial.Kinds.Ladder,
//                WoodMaterial.Kinds.Bookshelf,
//                WoodMaterial.Kinds.Boat,
//                WoodMaterial.Kinds.Sign,
//                WoodMaterial.Kinds.Button,
//        });
    }
}

