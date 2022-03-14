 package org.liabri.perit;

 import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
 import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
 import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
 import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
 import net.minecraft.data.client.BlockStateModelGenerator;
 import net.minecraft.data.client.ItemModelGenerator;
 import net.minecraft.data.server.recipe.RecipeJsonProvider;
 import net.minecraft.tag.BlockTags;
 import net.minecraft.tag.ItemTags;
 import net.minecraft.util.registry.BuiltinRegistries;
 import net.minecraft.util.registry.Registry;

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
            offerPlanksRecipe2(exporter, SIMPLE_BLOCK, ItemTags.TERRACOTTA);
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


     // block model
    private static class TestModelProvider extends FabricModelProvider {
        private TestModelProvider(FabricDataGenerator generator) {
            super(generator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerSimpleCubeAll(SIMPLE_BLOCK);
            blockStateModelGenerator.registerSimpleCubeAll(BLOCK_WITHOUT_ITEM);
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
            getOrCreateTagBuilder(BlockTags.FIRE).add(SIMPLE_BLOCK);
            getOrCreateTagBuilder(BlockTags.ANVIL).setReplace(true).add(SIMPLE_BLOCK, BLOCK_WITHOUT_ITEM);
            getOrCreateTagBuilder(BlockTags.ACACIA_LOGS).forceAddTag(BlockTags.ANIMALS_SPAWNABLE_ON);
        }
    }

    // item tags
    private static class TestItemTagProvider extends FabricTagProvider.ItemTagProvider {
        private TestItemTagProvider(FabricDataGenerator dataGenerator, BlockTagProvider blockTagProvider) {
            super(dataGenerator, blockTagProvider);
        }

        @Override
        protected void generateTags() {
            copy(BlockTags.ANVIL, ItemTags.ANVIL);
        }
    }

    // loot tables
    private static class TestBlockLootTableProvider extends FabricBlockLootTableProvider {
        private TestBlockLootTableProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateBlockLootTables() {
            addDrop(SIMPLE_BLOCK);
            addDrop(BLOCK_WITHOUT_ITEM, drops(SIMPLE_BLOCK));
        }
    }
}