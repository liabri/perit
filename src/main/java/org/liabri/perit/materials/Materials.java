package org.liabri.perit.materials;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;

import java.util.ArrayList;

public class Materials {

    public static ArrayList<Material> materials = new ArrayList<>();
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

    // move to CONCRETE material
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

    public static final Block[] TERRACOTTAS = {
            Blocks.BLACK_TERRACOTTA,
            Blocks.BROWN_TERRACOTTA,
            Blocks.BLUE_TERRACOTTA,
            Blocks.CYAN_TERRACOTTA,
            Blocks.GREEN_TERRACOTTA,
            Blocks.GRAY_TERRACOTTA,
            Blocks.LIGHT_BLUE_TERRACOTTA,
            Blocks.LIGHT_GRAY_TERRACOTTA,
            Blocks.LIME_TERRACOTTA,
            Blocks.MAGENTA_TERRACOTTA,
            Blocks.ORANGE_TERRACOTTA,
            Blocks.PINK_TERRACOTTA,
            Blocks.PURPLE_TERRACOTTA,
            Blocks.RED_TERRACOTTA,
            Blocks.WHITE_TERRACOTTA,
            Blocks.YELLOW_TERRACOTTA
    };

    //WARPED NETHER BRICK RECIPE
    // BAMBOO

    static {
        // Terracotta
        for(int i=0; i< TERRACOTTAS.length; i++) {
            materials.add(new GenericMaterial(COLOURS[i] + "_terracotta", TERRACOTTAS[i], ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                    GenericMaterial.Kind.Stairs,
                    GenericMaterial.Kind.Slab,
                    GenericMaterial.Kind.Walls
            }));
        }

        for(int i=0; i< TERRACOTTAS.length; i++) {
            materials.add(new StoneMaterial(COLOURS[i] + "_terracotta", TERRACOTTAS[i], ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                    StoneMaterial.Kind.Bricks,
                    StoneMaterial.Kind.HerringboneBricks,
                    StoneMaterial.Kind.Shingles,
                    StoneMaterial.Kind.Polished,
                    StoneMaterial.Kind.Packed,
            }));
        }

        // Concrete
        for(int i=0; i< CONCRETES.length; i++) {
            materials.add(new GenericMaterial(COLOURS[i] + "_concrete", CONCRETES[i], ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                    GenericMaterial.Kind.Stairs,
                    GenericMaterial.Kind.Slab,
                    GenericMaterial.Kind.Walls
            }));
        }

        // Andesite
        materials.add(new StoneMaterial("andesite", Blocks.ANDESITE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Setts,
                StoneMaterial.Kind.Tiles
        }));

        // Diorite
        materials.add(new StoneMaterial("diorite", Blocks.DIORITE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Tiles
        }));

        // Granite
        materials.add(new StoneMaterial("granite", Blocks.GRANITE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Tiles
        }));

        // Tuff
        materials.add(new StoneMaterial("tuff", Blocks.TUFF, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
        }));

        // Calcite
        materials.add(new StoneMaterial("calcite", Blocks.CALCITE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Tiles
        }));

        // Basalt
        materials.add(new StoneMaterial("basalt", Blocks.BASALT, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Tiles,
                StoneMaterial.Kind.Setts
        }));

        // Dripstone
        materials.add(new StoneMaterial("dripstone", Blocks.DRIPSTONE_BLOCK, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Tiles
        }));

        // Deepslate
        materials.add(new StoneMaterial("deepslate", Blocks.DEEPSLATE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
        }));

        // Stone
        materials.add(new StoneMaterial( "stone", Blocks.QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Tiles,
                StoneMaterial.Kind.Setts
        }));

        // Smooth Stone
        materials.add(new GenericMaterial("smooth_stone", Blocks.SMOOTH_STONE, ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                GenericMaterial.Kind.Stairs,
                GenericMaterial.Kind.Walls
        }));

        // Blackstone
        materials.add(new StoneMaterial( "blackstone", Blocks.QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Tiles,
        }));

        // Netherrack
        materials.add(new StoneMaterial("netherrack", Blocks.NETHERRACK, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
        }));

        // Nether bricks
        materials.add(new StoneMaterial("nether_brick", Blocks.NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Pillar,
        }));

        // Blue nether bricks
        materials.add(new StoneMaterial("blue_nether_bricks", "blue_nether_brick", Blocks.NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Base,
                StoneMaterial.Kind.CrackedBase,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Chiseled,
                // cracked base
        }));

        // Red nether bricks
        materials.add(new StoneMaterial("red_nether_brick", Blocks.RED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Pillar,
        }));

        materials.add(new StoneMaterial("red_nether_bricks", Blocks.RED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Chiseled,
        }));

        // Bone
        materials.add(new StoneMaterial("bone", Blocks.BONE_BLOCK, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Setts,
        }));

        // Wither Bone
        GenericMaterial witheredBoneBlock = new GenericMaterial("withered_bone_block", Blocks.BONE_BLOCK, ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                GenericMaterial.Kind.Pillar,
                GenericMaterial.Kind.Stairs,
                GenericMaterial.Kind.Slab,
                GenericMaterial.Kind.Walls
        });
        materials.add(witheredBoneBlock);
        materials.add(new StoneMaterial("withered_bone", witheredBoneBlock.BASE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[] {
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Setts,
        }));

        // Ice
        materials.add(new StoneMaterial("ice", Blocks.ICE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
        }));

        // Obsidian
        materials.add(new StoneMaterial("obsidian", Blocks.OBSIDIAN, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Setts
        }));

        // Soul Sandstone
//        materials.add(new StoneMaterial("soul_sandstone", Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
//                StoneMaterial.Kind.Base,
//                StoneMaterial.Kind.Smooth,
//                StoneMaterial.Kind.Polished,
//                StoneMaterial.Kind.Bricks,
//                StoneMaterial.Kind.Briquettes,
//                StoneMaterial.Kind.Cut,
//                StoneMaterial.Kind.Chiseled,
//                StoneMaterial.Kind.Pillar,
//        }));

        // Sandstone
        materials.add(new StoneMaterial("sandstone", Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
        }));

        // Red Sandstone
        materials.add(new StoneMaterial("red_sandstone", Blocks.RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
        }));

        // Quartz
        materials.add(new GenericMaterial("quartz", Blocks.SMOOTH_QUARTZ, ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                GenericMaterial.Kind.Walls
        }));

        materials.add(new GenericMaterial("smooth_quartz", Blocks.SMOOTH_QUARTZ, ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                GenericMaterial.Kind.Walls
        }));

        materials.add(new GenericMaterial("quartz_brick", Blocks.QUARTZ_BRICKS, ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                GenericMaterial.Kind.Stairs,
                GenericMaterial.Kind.Slab,
                GenericMaterial.Kind.Walls
        }));

        materials.add(new StoneMaterial( "quartz", Blocks.QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Tiles,
                StoneMaterial.Kind.Setts
        }));

        // Create Rose Quartz
        materials.add(new StoneMaterial( "rose_quartz", Blocks.QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Chiseled
        }));

        // Purpur
        materials.add(new GenericMaterial("purpur", Blocks.PURPUR_BLOCK, ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                GenericMaterial.Kind.Walls
        }));

        materials.add(new StoneMaterial( "purpur", Blocks.PURPUR_BLOCK, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Bricks,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Setts
        }));

        // End stone
        materials.add(new GenericMaterial("end_stone", Blocks.END_STONE, ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                GenericMaterial.Kind.Stairs,
                GenericMaterial.Kind.Slab,
                GenericMaterial.Kind.Walls
        }));

        materials.add(new StoneMaterial( "end_stone", Blocks.END_STONE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Briquettes,
                StoneMaterial.Kind.Pillar
        }));

        // Prismarine
        materials.add(new StoneMaterial( "prismarine", Blocks.PRISMARINE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Setts,
                StoneMaterial.Kind.Pillar
        }));

        // Dark Prismarine
        materials.add(new GenericMaterial("dark_prismarine", Blocks.DARK_PRISMARINE, ItemGroup.BUILDING_BLOCKS, new GenericMaterial.Kind[]{
                GenericMaterial.Kind.Walls
        }));

        materials.add(new StoneMaterial( "dark_prismarine", Blocks.DARK_PRISMARINE, ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kind[]{
                StoneMaterial.Kind.Smooth,
                StoneMaterial.Kind.Polished,
                StoneMaterial.Kind.Chiseled,
                StoneMaterial.Kind.Pillar,
                StoneMaterial.Kind.Tiles
        }));

//
//        register("bamboo_bundle", new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
//        materials.add(new WoodMaterial("bamboo", Blocks.BAMBOO, ItemGroup.BUILDING_BLOCKS, new WoodMaterial.Kind[]{
////                WoodMaterial.Kind.Fence,
////                WoodMaterial.Kind.FenceGate,
//                WoodMaterial.Kind.Ladder
//        }));
//
//        register("stripped_bamboo", new BambooBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
//        register("stripped_bamboo_bundle", new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
//        materials.add(new WoodMaterial("stripped_bamboo", Blocks.BAMBOO, ItemGroup.BUILDING_BLOCKS, new WoodMaterial.Kind[]{
//                WoodMaterial.Kind.Planks,
//                WoodMaterial.Kind.Door,
//                WoodMaterial.Kind.Trapdoor,
////                WoodMaterial.Kind.Fence,
////                WoodMaterial.Kind.FenceGate,
//                WoodMaterial.Kind.Ladder,
//                WoodMaterial.Kind.Bookshelf,
//                WoodMaterial.Kind.Boat,
//                WoodMaterial.Kind.Sign,
//                WoodMaterial.Kind.Button,
//        }));
    }
}

