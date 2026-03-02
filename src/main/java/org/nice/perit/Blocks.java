package org.nice.perit;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static org.nice.perit.Perit.MOD_ID;

public class Blocks {
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

    private static <T extends Block> T register(String path, T block, RegistryKey<ItemGroup> itemGroups) {
        Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, path), block);
        Item item = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), new BlockItem(block, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(itemGroups).register(content -> {
            content.add(item);
        });
        return block;
    }

    public static void register(String path, Block block, RegistryKey<ItemGroup> itemGroups, Kind[] kinds) {
        for (Kind kind : kinds) {
            if (kind == Kind.Stairs) {
                Block g = register(path + "_stairs", new StairsBlock(block.getDefaultState(), FabricBlockSettings.copy(block)), itemGroups);
            } else if (kind == Kind.Slab) {
                register(path + "_slab", new SlabBlock(FabricBlockSettings.copy(block)), itemGroups);
            } else if (kind == Kind.Wall) {
                register(path + "_wall", new WallBlock(FabricBlockSettings.copy(block)), itemGroups);
            }
        }
    }


    /*
        create tuff brick texture
        create dripstone bricks texture
        blackstone brick textures vanilla







     */

    public static void initialize() {
        register("terracotta", net.minecraft.block.Blocks.TERRACOTTA, ItemGroups.COLORED_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("terracotta_brick", register("terracotta_bricks", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.TERRACOTTA)), ItemGroups.COLORED_BLOCKS)
                , ItemGroups.COLORED_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("terracotta_shingle", register("terracotta_shingles", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.TERRACOTTA)), ItemGroups.COLORED_BLOCKS)
                , ItemGroups.COLORED_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab});
        register("polished_terracotta", register("polished_terracotta", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.TERRACOTTA)), ItemGroups.COLORED_BLOCKS)
                , ItemGroups.COLORED_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});

        for (String colour : COLOURS) {
            register(colour + "_terracotta", net.minecraft.block.Blocks.TERRACOTTA, ItemGroups.COLORED_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
            register(colour + "_terracotta_brick", register(colour + "_terracotta_bricks", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.TERRACOTTA)), ItemGroups.COLORED_BLOCKS)
                    , ItemGroups.COLORED_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
            register(colour + "_terracotta_shingle", register(colour + "_terracotta_shingles", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.TERRACOTTA)), ItemGroups.COLORED_BLOCKS)
                    , ItemGroups.COLORED_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab});
            register("polished_" + colour + "_terracotta", register("polished_" + colour + "_terracotta", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.TERRACOTTA)), ItemGroups.COLORED_BLOCKS)
                    , ItemGroups.COLORED_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
            register(colour + "_concrete", net.minecraft.block.Blocks.BLACK_CONCRETE, ItemGroups.COLORED_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});

            //data to do
            //recipes for terracotta stairs/slabs/walls
            //loot-table for terracotta stairs/slabs/wall, terracotta_bricks/stairs/slabs/walls

            /*

            TO CHANGE:



            ON UPDATE RENAME BLOCKSWAP
            perit:polished_rose_quartz -> perit:rose_quartz_block
            perit:chiseled_rose_quartz -> perit:chiseled_rose_quartz_block



             */

        }

        // BASALT
        register("basalt_brick", register("basalt_bricks", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.SMOOTH_BASALT)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("basalt_tiles", register("basalt_tile", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.SMOOTH_BASALT)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("polished_basalt", register("polished_basalt", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.SMOOTH_BASALT)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});

        // PRISMARINE
        register("smooth_prismarine", register("smooth_prismarine", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.PRISMARINE)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("polished_prismarine", register("polished_prismarine", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.PRISMARINE)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("chiseled_prismarine", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.PRISMARINE)), ItemGroups.BUILDING_BLOCKS);
        register("prismarine_pillar", new PillarBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.PRISMARINE)), ItemGroups.BUILDING_BLOCKS);

        // DARK PRISMARINE
        register("smooth_dark_prismarine", register("smooth_dark_prismarine", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.DARK_PRISMARINE)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("polished_dark_prismarine", register("polished_dark_prismarine", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.DARK_PRISMARINE)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("dark_prismarine_brick", register("dark_prismarine_bricks", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.DARK_PRISMARINE)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("dark_prismarine_tile", register("dark_prismarine_tiles", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.DARK_PRISMARINE)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("chiseled_dark_prismarine", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.DARK_PRISMARINE)), ItemGroups.BUILDING_BLOCKS);
        register("dark_prismarine_pillar", new PillarBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.DARK_PRISMARINE)), ItemGroups.BUILDING_BLOCKS);

        // SANDSTONE
        register("sandstone_brick", register("sandstone_bricks", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.SANDSTONE)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("chiseled_sandstone", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.SANDSTONE)), ItemGroups.BUILDING_BLOCKS);
        register("sandstone_pillar", new PillarBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.SANDSTONE)), ItemGroups.BUILDING_BLOCKS);

        // RED SANDSTONE
        register("red_sandstone_brick", register("red_sandstone_bricks", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.RED_SANDSTONE)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("chiseled_red_sandstone", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.RED_SANDSTONE)), ItemGroups.BUILDING_BLOCKS);
        register("red_sandstone_pillar", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.RED_SANDSTONE)), ItemGroups.BUILDING_BLOCKS);

        // ROSE QUARTZ
        register("rose_quartz_block", register("polished_rose_quartz", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.QUARTZ_BLOCK)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("rose_quartz_brick", register("rose_quarts_bricks", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.QUARTZ_BRICKS)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("rose_quartz_pillar", new PillarBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.QUARTZ_PILLAR)), ItemGroups.BUILDING_BLOCKS);
        register("chiseled_rose_quartz_block", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.CHISELED_QUARTZ_BLOCK)), ItemGroups.BUILDING_BLOCKS);

        //OBSIDIAN
        register("smooth_obsidian", register("smooth_obsidian", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.OBSIDIAN)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("polished_obsidian", register("polished_obsidian", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.OBSIDIAN)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("obsidian_brick", register("obsidian_bricks", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.OBSIDIAN)), ItemGroups.BUILDING_BLOCKS)
                , ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Slab, Kind.Wall});
        register("chiseled_obsidian", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.OBSIDIAN)), ItemGroups.BUILDING_BLOCKS);
        register("obsidian_pillar", new PillarBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.OBSIDIAN)), ItemGroups.BUILDING_BLOCKS);

        //endstone
        //netherackk??
        //blue nether brick
        //red nether brick chiseled

        // COMPLETING VANILLA
        register("smooth_stone", net.minecraft.block.Blocks.SMOOTH_STONE, ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Wall});
        register("quartz_brick", net.minecraft.block.Blocks.QUARTZ_BRICKS, ItemGroups.BUILDING_BLOCKS, new Kind[]{Kind.Stairs, Kind.Wall});
    }

    public enum Kind {
        Stairs,
        Slab,
        Wall,
    }
}

