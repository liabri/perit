 package org.liabri.perit;

 import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
 import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
 import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
 import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
 import net.minecraft.block.*;
 import net.minecraft.data.client.*;
 import net.minecraft.data.server.recipe.RecipeJsonProvider;
 import net.minecraft.tag.BlockTags;
 import net.minecraft.tag.ItemTags;
 import net.minecraft.util.Identifier;
 import net.minecraft.util.registry.Registry;
 import org.liabri.perit.blocks.Blocks;
 import org.liabri.perit.blocks.SlabBlock;
 import org.liabri.perit.blocks.StairsBlock;

 import java.util.function.Consumer;

 public class PeritDataGenerator implements DataGeneratorEntrypoint {
    private static final ConditionJsonProvider NEVER_LOADED = DefaultResourceConditions.allModsLoaded("a");
    private static final ConditionJsonProvider ALWAYS_LOADED = DefaultResourceConditions.not(NEVER_LOADED);

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        dataGenerator.addProvider(TestRecipeProvider::new);
        dataGenerator.addProvider(TestModelProvider::new);
        dataGenerator.addProvider(TestBlockLootTableProvider::new);

        TestBlockTagProvider blockTagProvider = dataGenerator.addProvider(TestBlockTagProvider::new);
        dataGenerator.addProvider(new TestItemTagProvider(dataGenerator, blockTagProvider));

        try {
            new FabricTagProvider.DynamicRegistryTagProvider<>(dataGenerator, Registry.ITEM_KEY, "items", "Item Tags") {
                @Override
                protected void generateTags() {
                }
            };
            throw new AssertionError("Using DynamicRegistryTagProvider with static registry didn't throw an exception!");
        } catch (IllegalArgumentException e) {
            // no-op
        }
    }

    // recipes
    private static class TestRecipeProvider extends FabricRecipeProvider {
        private TestRecipeProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
//            offerPlanksRecipe2(exporter, SIMPLE_BLOCK, ItemTags.TERRACOTTA);
        }
    }

//    private static class TestConditionalRecipeProvider extends FabricRecipeProvider {
//        private TestConditionalRecipeProvider(FabricDataGenerator dataGenerator) {
//            super(dataGenerator);
//        }
//
//        @Override
//        protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
//            ShapelessRecipeJsonBuilder.create(Items.GOLD_INGOT).input(Items.DIRT).criterion("has_dirt", conditionsFromItem(Items.DIRT)).offerTo(withConditions(exporter, NEVER_LOADED));
//            ShapelessRecipeJsonBuilder.create(Items.DIAMOND).input(Items.STICK).criterion("has_stick", conditionsFromItem(Items.STICK)).offerTo(withConditions(exporter, ALWAYS_LOADED));
//        }
//    }

    private static class TestModelProvider extends FabricModelProvider {
        private TestModelProvider(FabricDataGenerator generator) {
            super(generator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            Blocks.blocks.forEach((block) ->  {
                if (block instanceof SlabBlock slabBlock) {
                    blockStateModelGenerator.registerItemModel(slabBlock);
                    TextureMap textureMap = TextureMap.all(slabBlock.getBaseBlockState().getBlock());
//                    TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(slabBlock, "_side"), textureMap.getTexture(TextureKey.TOP));
                    Identifier identifier = Models.SLAB.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
                    Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
                    Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_double", textureMap, blockStateModelGenerator.modelCollector);
                    BlockStateSupplier slab = BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, identifier3);
                    blockStateModelGenerator.blockStateCollector.accept(slab);
//                } else if (block instanceof StairsBlock stairsBlock) {
//                    stairsBlock.getDefaultState();
//                    blockStateModelGenerator.registerItemModel(stairsBlock);
//
//                    TextureMap textureMap = TextureMap.all(stairsBlock);
//                    TextureMap textureMap2 = TextureMap.sideEnd(TextureMap.getSubId(stairsBlock, "_side"), textureMap.getTexture(TextureKey.TOP));
//                    Identifier identifier = Models.STAIRS.upload(stairsBlock, textureMap2, blockStateModelGenerator.modelCollector);
//                    Identifier identifier2 = Models.INNER_STAIRS.upload(stairsBlock, "_inner", textureMap2, blockStateModelGenerator.modelCollector);
//                    Identifier identifier3 = Models.OUTER_STAIRS.upload(stairsBlock, "_outer", textureMap2, blockStateModelGenerator.modelCollector);
//                    BlockStateSupplier slab = BlockStateModelGenerator.createSlabBlockState(stairsBlock, identifier, identifier2, identifier3);
//                    blockStateModelGenerator.blockStateCollector.accept(slab);

//                    Identifier identifier = this.ensureModel(Models.INNER_STAIRS, block);
//                    Identifier identifier2 = this.ensureModel(Models.STAIRS, block);
//                    Identifier identifier3 = this.ensureModel(Models.OUTER_STAIRS, block);
//                    BlockStateModelGenerator.this.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(block, identifier, identifier2, identifier3));

                } else if (block instanceof DoorBlock doorBlock) {
                    blockStateModelGenerator.registerDoor(doorBlock);
                } else if (block instanceof TrapdoorBlock trapdoorBlock) {
                    blockStateModelGenerator.registerTrapdoor(trapdoorBlock);
                } else if (block instanceof FenceBlock fenceBlock) {
//                    blockStateModelGenerator.registerF
                } else if (block instanceof FenceGateBlock fenceGateBlock) {
//                    fenceGateBlocks.add(fenceGateBlock);
//                } else if (block instanceof  WallBlock wallBlock) {
//                  blockStateModelGenerator.register
                } else {
                    blockStateModelGenerator.registerSimpleCubeAll(block);
                }
            });
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            //itemModelGenerator.register(item, Models.SLAB);
        }
    }

    // block tags
    private static class TestBlockTagProvider extends FabricTagProvider.BlockTagProvider {
        private TestBlockTagProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
//            getOrCreateTagBuilder(BlockTags.FIRE).add(SIMPLE_BLOCK);
//            getOrCreateTagBuilder(BlockTags.ANVIL).setReplace(true).add(SIMPLE_BLOCK, BLOCK_WITHOUT_ITEM);
//            getOrCreateTagBuilder(BlockTags.ACACIA_LOGS).forceAddTag(BlockTags.ANIMALS_SPAWNABLE_ON);
        }
    }

    // item tags
    private static class TestItemTagProvider extends FabricTagProvider.ItemTagProvider {
        private TestItemTagProvider(FabricDataGenerator dataGenerator, BlockTagProvider blockTagProvider) {
            super(dataGenerator, blockTagProvider);
        }

        @Override
        protected void generateTags() {
//            copy(BlockTags.ANVIL, ItemTags.ANVIL);
        }
    }

    // loot tables
    private static class TestBlockLootTableProvider extends FabricBlockLootTableProvider {
        private TestBlockLootTableProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateBlockLootTables() {
            Blocks.blocks.forEach(this::addDrop);
        }
    }
}