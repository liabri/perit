package net.fabricmc.example;

import net.fabricmc.example.blocks.*;
import net.fabricmc.example.blocks.CraftingTableBlock;
import net.fabricmc.example.blocks.FenceBlock;
import net.fabricmc.example.blocks.FenceGateBlock;
import net.fabricmc.example.blocks.LadderBlock;
import net.fabricmc.example.blocks.SaplingBlock;
import net.fabricmc.example.blocks.StairsBlock;
import net.fabricmc.example.blocks.TrapdoorBlock;
import net.fabricmc.example.blocks.WoodenButtonBlock;
import net.fabricmc.example.blocks.container.*;
import net.fabricmc.example.blocks.container.BarrelBlock;
import net.fabricmc.example.blocks.container.ChestBlock;
import net.fabricmc.example.blocks.container.TrappedChestBlock;
import net.fabricmc.example.items.Items;
import net.fabricmc.example.items.LadderBlockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SignItem;
import net.minecraft.util.SignType;
import net.minecraft.world.gen.feature.ConfiguredFeatures;

import static net.minecraft.block.Blocks.*;

public class Material {
        // Entities
        //    public final EntityType<BoatEntity> BOAT;

        // Blocks
        public final LogBlock LOG;
        public final StrippedLogBlock STRIPPED_LOG;
        public final LogBlock WOOD;
        public final StrippedLogBlock STRIPPED_WOOD;

        public final Block PLANKS;
        public final SlabBlock PLANK_SLAB;
        public final StairsBlock PLANK_STAIRS;
        public final Block LARGE_PLANKS;
        public final SlabBlock LARGE_PLANK_SLAB;
        public final StairsBlock LARGE_PLANK_STAIRS;
        public final Block ALTERNATED_PLANKS;
        public final SlabBlock ALTERNATED_PLANK_SLAB;
        public final StairsBlock ALTERNATED_PLANK_STAIRS;
        public final Block CUBED_PLANKS;
        public final SlabBlock CUBED_PLANK_SLAB;
        public final StairsBlock CUBED_PLANK_STAIRS;
        public final Block HERRINGBONE_PLANKS;
        public final SlabBlock HERRINGBONE_PLANK_SLAB;
        public final StairsBlock HERRINGBONE_PLANK_STAIRS;
        public final Block BOARDED_PLANKS;
        public final SlabBlock BOARDED_PLANK_SLAB;
        public final StairsBlock BOARDED_PLANK_STAIRS;

        public final BookcaseBlock BOOKCASE;
        public final CrateBlock CRATE; //baby shulker
        public final BarrelBlock BARREL;
        public final ChestBlock CHEST;
        public final TrappedChestBlock TRAPPED_CHEST;
        public final Block BRANCH_PILE;
        public final CraftingTableBlock CRAFTING_TABLE;

        public final FenceBlock FENCE;
        public final FenceGateBlock FENCE_GATE;
        public final FenceBlock LATTICE_FENCE;
        public final FenceGateBlock LATTICE_FENCE_GATE;
        public final FenceBlock HORIZONTAL_GRILLED_FENCE;
        public final FenceGateBlock HORIZONTAL_GRILLED_FENCE_GATE;
        public final FenceBlock VERTICAL_GRILLED_FENCE;
        public final FenceGateBlock VERTICAL_GRILLED_FENCE_GATE;
        public final FenceBlock FANCY_VERTICAL_GRILLED_FENCE;
        public final FenceGateBlock FANCY_VERTICAL_GRILLED_FENCE_GATE;
        public final FenceBlock RUGGED_FENCE;
        public final FenceGateBlock RUGGED_FENCE_GATE;

        public final DoorBlock DOOR;
//    public final DoorBlock BARRED_DOOR;
//    public final DoorBlock STRIPPED_DOOR;
//    public final DoorBlock WOOD_FRAMED_PAPER_DOOR;
//    public final DoorBlock WOOD_FRAMED_GLASS_DOOR;
//    public final DoorBlock WOOD_FRAMED_BLIND_DOOR;
//    public final DoorBlock SALOON_DOOR;
//    public final DoorBlock IRON_FRAMED_DOOR;

        public final TrapdoorBlock TRAPDOOR;
//    public final TrapdoorBlock BARRED_TRAPDOOR;
//    public final TrapdoorBlock STRIPPED_TRAPDOOR;
//    public final TrapdoorBlock WOOD_FRAMED_PAPER_TRAPDOOR;
//    public final TrapdoorBlock WOOD_FRAMED_GLASS_TRAPDOOR;
//    public final TrapdoorBlock WOOD_FRAMED_BLIND_TRAPDOOR;
//    public final TrapdoorBlock IRON_FRAMED_TRAPDOOR;

        public final WoodenButtonBlock BUTTON;
        public final WoodenPressurePlateBlock PRESSURE_PLATE;

        public final SignBlock STANDING_SIGN;
        public final WallSignBlock WALL_SIGN;

        public final LadderBlock LADDER;
//    public final CagedLadder CAGED_LADDER;

        public final LeavesBlock LEAVES;
//        public final FruitedLeavesBlock FRUITED_LEAVES;
//        public final LeafPileBlock LEAF_PILE;
        public final SaplingBlock SAPLING;
        public final FlowerPotBlock POTTED_SAPLING;
//    public final SeedlingBlock SEEDLING;

        public final BookshelfBlock BOOKSHELF;
//        public final RotatableBlock ROCKING_CHAIR;
//        public final QuadFacingBlock TABLE;
//    public final Block PIGEON_SHELVES;
//    public final Block MINI_PIGEON_SHELVES;
        //shelf
        //lectern
        //chair
        //drawers
        //buffer

        // BlockItems
        public final BlockItem LOG_ITEM;
        public final BlockItem STRIPPED_LOG_ITEM;
        public final BlockItem WOOD_ITEM;
        public final BlockItem STRIPPED_WOOD_ITEM;

        public final BlockItem PLANKS_ITEM;
        public final BlockItem PLANK_SLAB_ITEM;
        public final BlockItem PLANK_STAIRS_ITEM;
        public final BlockItem LARGE_PLANKS_ITEM;
        public final BlockItem LARGE_PLANK_SLAB_ITEM;
        public final BlockItem LARGE_PLANK_STAIRS_ITEM;
        public final BlockItem ALTERNATED_PLANKS_ITEM;
        public final BlockItem ALTERNATED_PLANK_SLAB_ITEM;
        public final BlockItem ALTERNATED_PLANK_STAIRS_ITEM;
        public final BlockItem CUBED_PLANKS_ITEM;
        public final BlockItem CUBED_PLANK_SLAB_ITEM;
        public final BlockItem CUBED_PLANK_STAIRS_ITEM;
        public final BlockItem HERRINGBONE_PLANKS_ITEM;
        public final BlockItem HERRINGBONE_PLANK_SLAB_ITEM;
        public final BlockItem HERRINGBONE_PLANK_STAIRS_ITEM;
        public final BlockItem BOARDED_PLANKS_ITEM;
        public final BlockItem BOARDED_PLANK_SLAB_ITEM;
        public final BlockItem BOARDED_PLANK_STAIRS_ITEM;

        public final BlockItem BOOKCASE_ITEM;
        public final BlockItem CRATE_ITEM;
        public final BlockItem BARREL_ITEM;
        public final BlockItem CHEST_ITEM;
        public final BlockItem TRAPPED_CHEST_ITEM;
        public final BlockItem BRANCH_PILE_ITEM;

        public final BlockItem FENCE_ITEM;
        public final BlockItem FENCE_GATE_ITEM;
        public final BlockItem LATTIC_FENCE_ITEM;
        public final BlockItem LATTICE_FENCE_GATE_ITEM;
        public final BlockItem HORIZONTAL_GRILLED_FENCE_ITEM;
        public final BlockItem HORIZONTAL_GRILLED_FENCE_GATE_ITEM;
        public final BlockItem VERTICAL_GRILLED_FENCE_ITEM;
        public final BlockItem VERTICAL_GRILLED_FENCE_GATE_ITEM;
        public final BlockItem FANCY_VERTICAL_GRILLED_FENCE_ITEM;
        public final BlockItem FANCY_VERTICAL_GRILLED_FENCE_GATE_ITEM;
        public final BlockItem RUGGED_FENCE_ITEM;
        public final BlockItem RUGGED_FENCE_GATE_ITEM;

        public final BlockItem DOOR_ITEM;
//    public final BlockItem BARRED_DOOR_ITEM;
//    public final BlockItem IRON_FRAMED_DOOR_ITEM;
//    public final BlockItem WOOD_FRAMED_PAPER_DOOR_ITEM;
//    public final BlockItem SALOON_DOOR_ITEM;
//    public final BlockItem WOOD_FRAMED_GLASS_DOOR_ITEM;
//    public final BlockItem WOOD_FRAMED_BLIND_DOOR_ITEM;
//    public final BlockItem STRIPPED_DOOR_ITEM;

        public final BlockItem TRAPDOOR_ITEM;
//    public final BlockItem IRON_FRAMED_TRAPDOOR_ITEM;
//    public final BlockItem BARRED_TRAPDOOR_ITEM;
//    public final BlockItem WOOD_FRAMED_PAPER_TRAPDOOR_ITEM;
//    public final BlockItem WOOD_FRAMED_GLASS_TRAPDOOR_ITEM;
//    public final BlockItem WOOD_FRAMED_BLIND_TRAPDOOR_ITEM;
//    public final BlockItem STRIPPED_TRAPDOOR_ITEM;

        public final LadderBlockItem LADDER_ITEM;
        public final BlockItem BUTTON_ITEM;
        public final BlockItem PRESSURE_PLATE_ITEM;

        public final SignItem SIGN_ITEM;

//    public final LadderBlockItem LADDER_ITEM;
//    public final CagedLadder CAGED_LADDER;

        public final BlockItem LEAVES_ITEM;
        public final BlockItem FRUITED_LEAVES_ITEM;
        public final BlockItem LEAF_PILE_ITEM;
        public final BlockItem SAPLING_ITEM;
        public final BlockItem POTTED_SAPLING_ITEM;

        public final BlockItem BOOKSHELF_ITEM;
        public final BlockItem ROCKING_CHAIR_ITEM;
        public final BlockItem TABLE_ITEM;
        //shelf

//    public final BoatItem BOAT_ITEM;

        // Items
        public static Item STICK;

        public Material(String name) {
            // Entities
            //        BOAT = registerBoat(name + "boat", TerrestriaItems.RUBBER, BoatEntity.Type.BIRCH);



            STRIPPED_LOG = (StrippedLogBlock) net.fabricmc.example.blocks.Blocks.register("stripped_" + name + "_log", new StrippedLogBlock(MapColor.BROWN, MapColor.DARK_RED));
            LOG = (LogBlock) net.fabricmc.example.blocks.Blocks.register(name + "_log", new LogBlock(() -> STRIPPED_LOG, FabricBlockSettings.copyOf(OAK_LOG)));
//      STRIPPED_BRANCH = Blocks.register("stripped_" + name + "_branch", new StrippedLogBlock(MapColor.BROWN, MapColor.WOOD));
//      BRANCH = Blocks.register(name + "_branch", new LogBlock(() -> STRIPPED_BRANCH, FabricBlockSettings.copyOf(OAK_LOG).breakByTool(FabricToolTags.AXES)));
//      STRIPPED_SMALL_WOOD = Blocks.register("stripped_" + name + "small_wood", new StrippedLogBlock(MapColor.BROWN, MapColor.WOOD));
//      SMALL_WOOD = Blocks.register(name + "_small_wood", new LogBlock(() -> STRIPPED_SMALL_WOOD, FabricBlockSettings.copy(OAK_WOOD)));
//      STRIPPED_BRANCH_WOOD = Blocks.register("stripped_" + name + "branch_wood", new StrippedLogBlock(MapColor.BROWN, MapColor.WOOD));
//      BRANCH_WOOD = Blocks.register(name + "_branch_wood", new LogBlock(() -> STRIPPED_BRANCH_WOOD, FabricBlockSettings.copy(OAK_WOOD)));
            STRIPPED_WOOD = (StrippedLogBlock) net.fabricmc.example.blocks.Blocks.register("stripped_" + name + "_wood", new StrippedLogBlock(MapColor.BROWN, MapColor.SPRUCE_BROWN));
            WOOD = (LogBlock) net.fabricmc.example.blocks.Blocks.register(name + "_wood", new LogBlock(() -> STRIPPED_WOOD, FabricBlockSettings.copy(OAK_WOOD)));
            BRANCH_PILE = net.fabricmc.example.blocks.Blocks.register(name + "_branch_pile", new Block(FabricBlockSettings.copy(OAK_PLANKS)));

            LEAVES = (LeavesBlock) net.fabricmc.example.blocks.Blocks.register(name + "_leaves", new LeavesBlock(FabricBlockSettings.of(net.minecraft.block.Material.LEAVES).nonOpaque()));
//            FRUITED_LEAVES = (FruitedLeavesBlock) net.fabricmc.example.blocks.Blocks.register(name + "_fruited_leaves", new FruitedLeavesBlock(FabricBlockSettings.of(net.minecraft.block.Material.LEAVES).nonOpaque()));

//            LEAF_PILE = (LeafPileBlock) net.fabricmc.example.blocks.Blocks.register(name + "_leaf_pile", new LeafPileBlock(LEAVES,  FabricBlockSettings.of(net.minecraft.block.Material.PLANT).sounds(BlockSoundGroup.GRASS).strength(0.2F, 0.3F).noCollision()));
            SAPLING = (SaplingBlock) net.fabricmc.example.blocks.Blocks.register(name + "_sapling",new SaplingBlock(ConfiguredFeatures.FANCY_OAK, 10));
            POTTED_SAPLING = (FlowerPotBlock) net.fabricmc.example.blocks.Blocks.register("potted_" + name + "_sapling", new FlowerPotBlock(OAK_SAPLING, FabricBlockSettings.copyOf(POTTED_OAK_SAPLING)));
//        SEEDLING = (CropBlock) Blocks.register(name + "_seedling", new CropBlock(FabricBlockSettings.copy(CARROTS)));

            PLANKS = net.fabricmc.example.blocks.Blocks.register(name + "_planks", new PillarBlock(FabricBlockSettings.copy(OAK_PLANKS)));
            PLANK_SLAB = (SlabBlock) net.fabricmc.example.blocks.Blocks.register(name + "_plank_slab", new SlabBlock(FabricBlockSettings.copy(PLANKS)));
            PLANK_STAIRS = (StairsBlock) net.fabricmc.example.blocks.Blocks.register(name + "_plank_stairs", new StairsBlock(PLANKS.getDefaultState(), FabricBlockSettings.copy(PLANKS)));
            LARGE_PLANKS = net.fabricmc.example.blocks.Blocks.register(name + "_large_planks", new Block(FabricBlockSettings.copy(PLANKS)));
            LARGE_PLANK_SLAB = (SlabBlock) net.fabricmc.example.blocks.Blocks.register(name + "_large_planks_slab", new SlabBlock(FabricBlockSettings.copy(LARGE_PLANKS)));
            LARGE_PLANK_STAIRS = (StairsBlock) net.fabricmc.example.blocks.Blocks.register(name + "_large_plank_stairs", new StairsBlock(LARGE_PLANKS.getDefaultState(), FabricBlockSettings.copy(LARGE_PLANKS)));
            ALTERNATED_PLANKS = net.fabricmc.example.blocks.Blocks.register(name + "_alternated_planks", new Block(FabricBlockSettings.copy(PLANKS)));
            ALTERNATED_PLANK_SLAB = (SlabBlock) net.fabricmc.example.blocks.Blocks.register(name + "_alternated_plank_slab", new SlabBlock(FabricBlockSettings.copy(ALTERNATED_PLANKS)));
            ALTERNATED_PLANK_STAIRS = (StairsBlock) net.fabricmc.example.blocks.Blocks.register(name + "_alternated_plank_stairs", new StairsBlock(ALTERNATED_PLANKS.getDefaultState(), FabricBlockSettings.copy(ALTERNATED_PLANKS)));
            CUBED_PLANKS = net.fabricmc.example.blocks.Blocks.register(name + "_cubed_planks", new Block(FabricBlockSettings.copy(PLANKS)));
            CUBED_PLANK_SLAB = (SlabBlock) net.fabricmc.example.blocks.Blocks.register(name + "_cubed_plank_slab", new SlabBlock(FabricBlockSettings.copy(CUBED_PLANKS)));
            CUBED_PLANK_STAIRS = (StairsBlock) net.fabricmc.example.blocks.Blocks.register(name + "_cubed_plank_stairs", new StairsBlock(CUBED_PLANKS.getDefaultState(), FabricBlockSettings.copy(CUBED_PLANKS)));
            HERRINGBONE_PLANKS = net.fabricmc.example.blocks.Blocks.register(name + "_herringbone_planks", new Block(FabricBlockSettings.copy(PLANKS)));
            HERRINGBONE_PLANK_SLAB = (SlabBlock) net.fabricmc.example.blocks.Blocks.register(name + "_herringbone_plank_slab", new SlabBlock(FabricBlockSettings.copy(CUBED_PLANKS)));
            HERRINGBONE_PLANK_STAIRS = (StairsBlock) net.fabricmc.example.blocks.Blocks.register(name + "_herringbone_plank_stairs", new StairsBlock(CUBED_PLANKS.getDefaultState(), FabricBlockSettings.copy(CUBED_PLANKS)));
            BOARDED_PLANKS = net.fabricmc.example.blocks.Blocks.register(name + "_boarded_planks", new Block(FabricBlockSettings.copy(PLANKS)));
            BOARDED_PLANK_SLAB = (SlabBlock) net.fabricmc.example.blocks.Blocks.register(name + "_boarded_plank_slab", new SlabBlock(FabricBlockSettings.copy(CUBED_PLANKS)));
            BOARDED_PLANK_STAIRS = (StairsBlock) net.fabricmc.example.blocks.Blocks.register(name + "_boarded_plank_stairs", new StairsBlock(CUBED_PLANKS.getDefaultState(), FabricBlockSettings.copy(CUBED_PLANKS)));

            FENCE = (FenceBlock) net.fabricmc.example.blocks.Blocks.register(name + "_fence", new FenceBlock(FabricBlockSettings.copy(OAK_FENCE)));
            FENCE_GATE = (FenceGateBlock) net.fabricmc.example.blocks.Blocks.register(name + "_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(OAK_FENCE_GATE)));
            LATTICE_FENCE = (FenceBlock) net.fabricmc.example.blocks.Blocks.register(name + "_lattice_fence", new FenceBlock(FabricBlockSettings.copy(FENCE)));
            LATTICE_FENCE_GATE = (FenceGateBlock) net.fabricmc.example.blocks.Blocks.register(name + "_lattice_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(LATTICE_FENCE)));
            HORIZONTAL_GRILLED_FENCE = (FenceBlock) net.fabricmc.example.blocks.Blocks.register("horizontal_grilled_" + name + "_fence", new FenceBlock(FabricBlockSettings.copy(FENCE)));
            HORIZONTAL_GRILLED_FENCE_GATE = (FenceGateBlock) net.fabricmc.example.blocks.Blocks.register("horizontal_grilled_" + name + "_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(HORIZONTAL_GRILLED_FENCE)));
            VERTICAL_GRILLED_FENCE = (FenceBlock) net.fabricmc.example.blocks.Blocks.register("vertical_grilled_" + name +"_fence", new FenceBlock(FabricBlockSettings.copy(FENCE)));
            VERTICAL_GRILLED_FENCE_GATE = (FenceGateBlock) net.fabricmc.example.blocks.Blocks.register("vertical_grilled_" + name + "_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(VERTICAL_GRILLED_FENCE)));
            FANCY_VERTICAL_GRILLED_FENCE = (FenceBlock) net.fabricmc.example.blocks.Blocks.register("fancy_vertical_grilled_" + name + "_fence", new FenceBlock(FabricBlockSettings.copy(FENCE)));
            FANCY_VERTICAL_GRILLED_FENCE_GATE = (FenceGateBlock) net.fabricmc.example.blocks.Blocks.register("fancy_vertical_grilled_" + name + "_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(FANCY_VERTICAL_GRILLED_FENCE)));
            RUGGED_FENCE = (FenceBlock) net.fabricmc.example.blocks.Blocks.register("block/wood/baobab/rugged_" + name + "_fence", new FenceBlock(FabricBlockSettings.copy(FENCE)));
            RUGGED_FENCE_GATE = (FenceGateBlock) net.fabricmc.example.blocks.Blocks.register("rugged_" + name + "_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(RUGGED_FENCE)));

            BOOKSHELF = (BookshelfBlock) net.fabricmc.example.blocks.Blocks.register(name + "_bookshelf", new BookshelfBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.BOOKSHELF)));
//            TABLE = (QuadFacingBlock) net.fabricmc.example.blocks.Blocks.register(name + "_table", new QuadFacingBlock(FabricBlockSettings.copy(PLANKS)));
//            ROCKING_CHAIR = (RotatableBlock) net.fabricmc.example.blocks.Blocks.register(name + "_rocking_chair", new RotatableBlock(FabricBlockSettings.copy(PLANKS)));

//            DOOR = (com.chalia.ferdinand.ferdinand.blocks.specialised.DoorBlock) net.fabricmc.example.blocks.Blocks.register(name + "_door", new com.chalia.ferdinand.ferdinand.blocks.specialised.DoorBlock(FabricBlockSettings.copy(OAK_DOOR)));
//        BARRED_DOOR = (DoorBlock) Blocks.register(name + "_barred_door", new DoorBlock(FabricBlockSettings.copy(DOOR)));
//        STRIPPED_DOOR = (DoorBlock) Blocks.register(name + "_stripped_door", new DoorBlock(FabricBlockSettings.copy(DOOR)));
//        WOOD_FRAMED_PAPER_DOOR = (DoorBlock) Blocks.register(name + "_framed_paper_door", new DoorBlock(FabricBlockSettings.copy(DOOR)));
//        WOOD_FRAMED_GLASS_DOOR = (DoorBlock) Blocks.register(name + "_framed_glass_door", new DoorBlock(FabricBlockSettings.copy(DOOR)));
//        WOOD_FRAMED_BLIND_DOOR = (DoorBlock) Blocks.register(name + "_framed_blind_door", new DoorBlock(FabricBlockSettings.copy(DOOR)));
//        SALOON_DOOR = (DoorBlock) Blocks.register(name + "_saloon_door", new DoorBlock(FabricBlockSettings.copy(DOOR)));
//        IRON_FRAMED_DOOR = (DoorBlock) Blocks.register("iron_framed_" + name + "_door", new DoorBlock(FabricBlockSettings.copy(DOOR)));

            TRAPDOOR = (TrapdoorBlock) net.fabricmc.example.blocks.Blocks.register(name + "_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(OAK_TRAPDOOR)));
//        BARRED_TRAPDOOR = (TrapdoorBlock) Blocks.register(name + "_barred_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(TRAPDOOR)));
//        STRIPPED_TRAPDOOR = (TrapdoorBlock) Blocks.register(name + "_stripped_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(TRAPDOOR)));
//        WOOD_FRAMED_PAPER_TRAPDOOR = (TrapdoorBlock) Blocks.register(name + "_framed_paper_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(TRAPDOOR)));
//        WOOD_FRAMED_GLASS_TRAPDOOR = (TrapdoorBlock) Blocks.register(name + "_framed_glass_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(TRAPDOOR)));
//        WOOD_FRAMED_BLIND_TRAPDOOR = (TrapdoorBlock) Blocks.register(name + "_framed_blind_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(TRAPDOOR)));
//        IRON_FRAMED_TRAPDOOR = (TrapdoorBlock) Blocks.register("iron_framed_" + name + "_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(TRAPDOOR)));

            LADDER = (LadderBlock) net.fabricmc.example.blocks.Blocks.register(name + "_ladder", new LadderBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.LADDER)));
            STANDING_SIGN = (SignBlock) net.fabricmc.example.blocks.Blocks.register(name + "_sign", new SignBlock(FabricBlockSettings.copy(OAK_SIGN), SignType.OAK));
            WALL_SIGN = (WallSignBlock) net.fabricmc.example.blocks.Blocks.register(name + "_wall_sign", new WallSignBlock(FabricBlockSettings.copy(OAK_WALL_SIGN), SignType.OAK));

            BUTTON = (WoodenButtonBlock) net.fabricmc.example.blocks.Blocks.register(name + "_button", new com.chalia.ferdinand.ferdinand.blocks.base.WoodenButtonBlock(FabricBlockSettings.copy(OAK_BUTTON)));
            PRESSURE_PLATE = (WoodenPressurePlateBlock) net.fabricmc.example.blocks.Blocks.register(name + "_pressure_plate", new WoodenPressurePlateBlock(FabricBlockSettings.copy(OAK_PRESSURE_PLATE)));

            BARREL = (BarrelBlock) net.fabricmc.example.blocks.Blocks.register(name + "_barrel", new BarrelBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.BARREL)));
            CRATE = (CrateBlock) net.fabricmc.example.blocks.Blocks.register(name + "_crate", new CrateBlock(FabricBlockSettings.copy(BARREL)));
            CHEST = (ChestBlock) net.fabricmc.example.blocks.Blocks.register(name + "_chest", new ChestBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.CHEST), () -> { return BlockEntityType.CHEST; }));
            TRAPPED_CHEST = (TrappedChestBlock) net.fabricmc.example.blocks.Blocks.register(name + "_trapped_chest", new TrappedChestBlock(FabricBlockSettings.copy(OAK_LEAVES)));
            BOOKCASE = (BookcaseBlock) net.fabricmc.example.blocks.Blocks.register(name + "_bookcase", new BookcaseBlock(FabricBlockSettings.copy(BOOKSHELF)));
            CRAFTING_TABLE = (CraftingTableBlock) net.fabricmc.example.blocks.Blocks.register(name + "_crafting_table", new CraftingTableBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.CRAFTING_TABLE)));


            // BlockItems
            LOG_ITEM = Items.registerBlockItem(LOG, ItemGroup.BUILDING_BLOCKS);
            STRIPPED_LOG_ITEM = Items.registerBlockItem(STRIPPED_LOG, ItemGroup.BUILDING_BLOCKS);
            WOOD_ITEM = Items.registerBlockItem(WOOD, ItemGroup.BUILDING_BLOCKS);
            STRIPPED_WOOD_ITEM = Items.registerBlockItem(STRIPPED_WOOD, ItemGroup.BUILDING_BLOCKS);

            PLANKS_ITEM = Items.registerBlockItem(PLANKS, ItemGroup.BUILDING_BLOCKS);
            PLANK_SLAB_ITEM = Items.registerBlockItem(PLANK_SLAB, ItemGroup.BUILDING_BLOCKS);
            PLANK_STAIRS_ITEM = Items.registerBlockItem(PLANK_STAIRS, ItemGroup.BUILDING_BLOCKS);
            LARGE_PLANKS_ITEM = Items.registerBlockItem(LARGE_PLANKS, ItemGroup.BUILDING_BLOCKS);
            LARGE_PLANK_SLAB_ITEM = Items.registerBlockItem(LARGE_PLANK_SLAB, ItemGroup.BUILDING_BLOCKS);
            LARGE_PLANK_STAIRS_ITEM = Items.registerBlockItem(LARGE_PLANK_STAIRS, ItemGroup.BUILDING_BLOCKS);
            ALTERNATED_PLANKS_ITEM = Items.registerBlockItem(ALTERNATED_PLANKS, ItemGroup.BUILDING_BLOCKS);
            ALTERNATED_PLANK_SLAB_ITEM = Items.registerBlockItem(ALTERNATED_PLANK_SLAB, ItemGroup.BUILDING_BLOCKS);
            ALTERNATED_PLANK_STAIRS_ITEM = Items.registerBlockItem(ALTERNATED_PLANK_STAIRS, ItemGroup.BUILDING_BLOCKS);
            CUBED_PLANKS_ITEM = Items.registerBlockItem(CUBED_PLANKS, ItemGroup.BUILDING_BLOCKS);
            CUBED_PLANK_SLAB_ITEM = Items.registerBlockItem(CUBED_PLANK_SLAB, ItemGroup.BUILDING_BLOCKS);
            CUBED_PLANK_STAIRS_ITEM = Items.registerBlockItem(CUBED_PLANK_STAIRS, ItemGroup.BUILDING_BLOCKS);
            HERRINGBONE_PLANKS_ITEM = Items.registerBlockItem(HERRINGBONE_PLANKS, ItemGroup.BUILDING_BLOCKS);
            HERRINGBONE_PLANK_SLAB_ITEM = Items.registerBlockItem(HERRINGBONE_PLANK_SLAB, ItemGroup.BUILDING_BLOCKS);
            HERRINGBONE_PLANK_STAIRS_ITEM = Items.registerBlockItem(HERRINGBONE_PLANK_STAIRS, ItemGroup.BUILDING_BLOCKS);
            BOARDED_PLANKS_ITEM = Items.registerBlockItem(BOARDED_PLANKS, ItemGroup.BUILDING_BLOCKS);
            BOARDED_PLANK_SLAB_ITEM = Items.registerBlockItem(BOARDED_PLANK_SLAB, ItemGroup.BUILDING_BLOCKS);
            BOARDED_PLANK_STAIRS_ITEM = Items.registerBlockItem(BOARDED_PLANK_STAIRS, ItemGroup.BUILDING_BLOCKS);

            BOOKCASE_ITEM = Items.registerBlockItem(BOOKCASE, ItemGroup.BUILDING_BLOCKS);
            CRATE_ITEM = Items.registerBlockItem(CRATE, ItemGroup.BUILDING_BLOCKS);
            BARREL_ITEM = Items.registerBlockItem(BARREL, ItemGroup.BUILDING_BLOCKS);
            CHEST_ITEM = Items.registerBlockItem(CHEST, ItemGroup.BUILDING_BLOCKS);
            TRAPPED_CHEST_ITEM = Items.registerBlockItem(TRAPPED_CHEST, ItemGroup.BUILDING_BLOCKS);
            BRANCH_PILE_ITEM = Items.registerBlockItem(BRANCH_PILE, ItemGroup.BUILDING_BLOCKS);

            LATTIC_FENCE_ITEM = Items.registerBlockItem(LATTICE_FENCE, ItemGroup.BUILDING_BLOCKS);
            LATTICE_FENCE_GATE_ITEM = Items.registerBlockItem(LATTICE_FENCE_GATE, ItemGroup.BUILDING_BLOCKS);
            HORIZONTAL_GRILLED_FENCE_ITEM = Items.registerBlockItem(HORIZONTAL_GRILLED_FENCE, ItemGroup.BUILDING_BLOCKS);
            HORIZONTAL_GRILLED_FENCE_GATE_ITEM = Items.registerBlockItem(HORIZONTAL_GRILLED_FENCE_GATE, ItemGroup.BUILDING_BLOCKS);
            VERTICAL_GRILLED_FENCE_ITEM = Items.registerBlockItem(VERTICAL_GRILLED_FENCE, ItemGroup.BUILDING_BLOCKS);
            VERTICAL_GRILLED_FENCE_GATE_ITEM = Items.registerBlockItem(VERTICAL_GRILLED_FENCE_GATE, ItemGroup.BUILDING_BLOCKS);
            FANCY_VERTICAL_GRILLED_FENCE_ITEM = Items.registerBlockItem(FANCY_VERTICAL_GRILLED_FENCE, ItemGroup.BUILDING_BLOCKS);
            FANCY_VERTICAL_GRILLED_FENCE_GATE_ITEM = Items.registerBlockItem(FANCY_VERTICAL_GRILLED_FENCE_GATE, ItemGroup.BUILDING_BLOCKS);
            RUGGED_FENCE_ITEM = Items.registerBlockItem(RUGGED_FENCE, ItemGroup.BUILDING_BLOCKS);
            RUGGED_FENCE_GATE_ITEM = Items.registerBlockItem(RUGGED_FENCE_GATE, ItemGroup.BUILDING_BLOCKS);

            DOOR_ITEM = Items.registerBlockItem(DOOR, ItemGroup.BUILDING_BLOCKS);
//        BARRED_DOOR_ITEM = Items.registerBlockItem(BARRED_DOOR, ItemGroup.BUILDING_BLOCKS);
//        IRON_FRAMED_DOOR_ITEM = Items.registerBlockItem(IRON_FRAMED_DOOR, ItemGroup.BUILDING_BLOCKS);
//        WOOD_FRAMED_PAPER_DOOR_ITEM = Items.registerBlockItem(WOOD_FRAMED_PAPER_DOOR, ItemGroup.BUILDING_BLOCKS);
//        SALOON_DOOR_ITEM = Items.registerBlockItem(SALOON_DOOR, ItemGroup.BUILDING_BLOCKS);
//        WOOD_FRAMED_GLASS_DOOR_ITEM = Items.registerBlockItem(WOOD_FRAMED_GLASS_DOOR, ItemGroup.BUILDING_BLOCKS);
//        WOOD_FRAMED_BLIND_DOOR_ITEM = Items.registerBlockItem(WOOD_FRAMED_BLIND_DOOR, ItemGroup.BUILDING_BLOCKS);
//        STRIPPED_DOOR_ITEM = Items.registerBlockItem(STRIPPED_DOOR, ItemGroup.BUILDING_BLOCKS);

            TRAPDOOR_ITEM = Items.registerBlockItem(TRAPDOOR, ItemGroup.BUILDING_BLOCKS);
//        IRON_FRAMED_TRAPDOOR_ITEM = Items.registerBlockItem(IRON_FRAMED_TRAPDOOR, ItemGroup.BUILDING_BLOCKS);
//        BARRED_TRAPDOOR_ITEM = Items.registerBlockItem(BARRED_TRAPDOOR, ItemGroup.BUILDING_BLOCKS);
//        WOOD_FRAMED_PAPER_TRAPDOOR_ITEM = Items.registerBlockItem(WOOD_FRAMED_PAPER_TRAPDOOR, ItemGroup.BUILDING_BLOCKS);
//        WOOD_FRAMED_GLASS_TRAPDOOR_ITEM = Items.registerBlockItem(WOOD_FRAMED_GLASS_TRAPDOOR, ItemGroup.BUILDING_BLOCKS);
//        WOOD_FRAMED_BLIND_TRAPDOOR_ITEM = Items.registerBlockItem(WOOD_FRAMED_BLIND_TRAPDOOR, ItemGroup.BUILDING_BLOCKS);
//        STRIPPED_TRAPDOOR_ITEM = Items.registerBlockItem(STRIPPED_TRAPDOOR, ItemGroup.BUILDING_BLOCKS);

            BUTTON_ITEM = Items.registerBlockItem(BUTTON, ItemGroup.BUILDING_BLOCKS);
            PRESSURE_PLATE_ITEM = Items.registerBlockItem(PRESSURE_PLATE, ItemGroup.BUILDING_BLOCKS);

            SIGN_ITEM = (SignItem) Items.register(name + "_sign", new SignItem(new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(16), STANDING_SIGN, WALL_SIGN));
            LADDER_ITEM = (LadderBlockItem) Items.register(name + "_ladder", new LadderBlockItem(LADDER, new Item.Settings().group(ItemGroup.DECORATIONS)));
            //    public final CagedLadder CAGED_LADDER = Items.register(BLOCK_NAME, ItemGroup.BUILDING_BLOCKS);

            LEAVES_ITEM = Items.registerBlockItem(LEAVES, ItemGroup.BUILDING_BLOCKS);
            FRUITED_LEAVES_ITEM = Items.registerBlockItem(FRUITED_LEAVES, ItemGroup.BUILDING_BLOCKS);
            LEAF_PILE_ITEM = Items.registerBlockItem(LEAF_PILE, ItemGroup.BUILDING_BLOCKS);
            SAPLING_ITEM = Items.registerBlockItem(SAPLING, ItemGroup.BUILDING_BLOCKS);
            POTTED_SAPLING_ITEM = Items.registerBlockItem(POTTED_SAPLING, ItemGroup.BUILDING_BLOCKS);

            BOOKSHELF_ITEM = Items.registerBlockItem(BOOKSHELF, ItemGroup.BUILDING_BLOCKS);
            ROCKING_CHAIR_ITEM = Items.registerBlockItem(ROCKING_CHAIR, ItemGroup.BUILDING_BLOCKS);
            TABLE_ITEM = Items.registerBlockItem(TABLE, ItemGroup.BUILDING_BLOCKS);

            //        BOAT_ITEM = (BoatItem) Items.register(name + "_boat", new BoatItem(net.minecraft.entity.vehicle.BoatEntity.Type.SPRUCE, (new Item.Settings()).maxCount(1).group(ItemGroup.TRANSPORTATION)));

            //Items
            BAOBAB_STICK = Items.register(name + "_stick", new Item(new FabricItemSettings().group(ItemGroup.FOOD)));
        }

//    private static EntityType<BoatEntity> registerBoat(String name, WoodItems wood, BoatEntity.Type vanilla) {
//        Identifier skin = new Identifier(Terrestria.MOD_ID, "textures/entity/boat/" + name + ".png");
//        TerraformBoat boat = new TerraformBoat(wood.boat, wood.planks, skin, vanilla);
//
//        EntityType<TerraformBoatEntity> type = FabricEntityTypeBuilder.<TerraformBoatEntity>create(
//                SpawnGroup.MISC, (entity, world) -> new TerraformBoatEntity(entity, world, boat))
//                .dimensions(EntityDimensions.fixed(1.375F, 0.5625F))
//                .build();
//
//        return Registry.register(Registry.ENTITY_TYPE, new Identifier(Terrestria.MOD_ID, name + "_boat"), type);
//    }

    }


}
