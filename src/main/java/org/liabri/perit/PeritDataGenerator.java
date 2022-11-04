 package org.liabri.perit;

 import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
 import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
 import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
 import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
 import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
 import net.minecraft.block.Block;
 import net.minecraft.block.PillarBlock;
 import net.minecraft.data.client.*;
 import net.minecraft.data.server.recipe.RecipeJsonProvider;
 import net.minecraft.item.Item;
 import net.minecraft.tag.TagKey;
 import net.minecraft.util.Identifier;
 import net.minecraft.util.Pair;
 import net.minecraft.util.registry.Registry;
 import org.liabri.perit.blocks.*;
 import org.liabri.perit.materials.Material;
 import org.liabri.perit.materials.Materials;

 import java.util.Collection;
 import java.util.function.Consumer;

 public class PeritDataGenerator implements DataGeneratorEntrypoint {
     private static final ConditionJsonProvider NEVER_LOADED = DefaultResourceConditions.allModsLoaded("a");
     private static final ConditionJsonProvider ALWAYS_LOADED = DefaultResourceConditions.not(NEVER_LOADED);

     @Override
     public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
         dataGenerator.addProvider(PeritRecipeProvider::new);
         dataGenerator.addProvider(PeritModelProvider::new);
//         dataGenerator.addProvider(PeritBlockLootTableProvider::new);

         PeritBlockTagProvider blockTagProvider = dataGenerator.addProvider(PeritBlockTagProvider::new);
         dataGenerator.addProvider(new PeritItemTagProvider(dataGenerator, blockTagProvider));
     }

     // recipes
     private static class PeritRecipeProvider extends FabricRecipeProvider {
         private PeritRecipeProvider(FabricDataGenerator dataGenerator) {
             super(dataGenerator);
         }

         @Override
         protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
             Materials.materials.forEach((material -> {
                 material.generate_recipes(exporter);
             }));
         }
     }

     private static class PeritModelProvider extends FabricModelProvider {
         private PeritModelProvider(FabricDataGenerator generator) {
             super(generator);
         }

         @Override
         public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
             System.out.println("SIZE OF THINGY " + Materials.materials.size());
             Materials.materials.forEach(material -> {
                 material.blocks.forEach(bi -> {
                     Block block = bi.getRight().getLeft();
                     if (block instanceof SlabBlock slabBlock) {
                         TextureMap textureMap = TextureMap.all(slabBlock.getBaseBlockState().getBlock());
                         Identifier identifier = Models.SLAB.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
                         Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
                         Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_double", textureMap, blockStateModelGenerator.modelCollector);
                         BlockStateSupplier slab = BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, identifier3);
                         blockStateModelGenerator.blockStateCollector.accept(slab);
                     } else if (block instanceof StairsBlock stairsBlock) {
                         TextureMap textureMap = TextureMap.all(stairsBlock.getBaseBlockState().getBlock());
                         Identifier identifier = Models.STAIRS.upload(stairsBlock, textureMap, blockStateModelGenerator.modelCollector);
                         Identifier identifier_inner = Models.INNER_STAIRS.upload(stairsBlock, "_inner", textureMap, blockStateModelGenerator.modelCollector);
                         Identifier identifier_outer = Models.OUTER_STAIRS.upload(stairsBlock, "_outer", textureMap, blockStateModelGenerator.modelCollector);
                         BlockStateSupplier stairs = BlockStateModelGenerator.createStairsBlockState(stairsBlock, identifier_inner, identifier, identifier_outer);
                         blockStateModelGenerator.blockStateCollector.accept(stairs);
                     } else if (block instanceof WallBlock wallBlock) {
                         if (wallBlock.getTextureName()!=null) {
                             TextureMap textureMap = TextureMap.all(wallBlock.getBaseBlockState().getBlock());
                             Identifier identifier = Models.TEMPLATE_WALL_POST.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
                             Identifier identifier2 = Models.TEMPLATE_WALL_SIDE.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
                             Identifier identifier3 = Models.TEMPLATE_WALL_SIDE_TALL.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
                             BlockStateSupplier wall = BlockStateModelGenerator.createWallBlockState(wallBlock, identifier, identifier2, identifier3);
                             blockStateModelGenerator.blockStateCollector.accept(wall);
                             Identifier identifier4 = Models.WALL_INVENTORY.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
                             blockStateModelGenerator.registerParentedItemModel(wallBlock, identifier4);
                         } else {
                             TextureMap textureMap = TextureMap.all(wallBlock.getBaseBlockState().getBlock());
                             Identifier identifier = Models.TEMPLATE_WALL_POST.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
                             Identifier identifier2 = Models.TEMPLATE_WALL_SIDE.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
                             Identifier identifier3 = Models.TEMPLATE_WALL_SIDE_TALL.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
                             BlockStateSupplier wall = BlockStateModelGenerator.createWallBlockState(wallBlock, identifier, identifier2, identifier3);
                             blockStateModelGenerator.blockStateCollector.accept(wall);
                             Identifier identifier4 = Models.WALL_INVENTORY.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
                             blockStateModelGenerator.registerParentedItemModel(wallBlock, identifier4);
                         }
                     } else if (block instanceof DoorBlock doorBlock) {
                         blockStateModelGenerator.registerDoor(doorBlock);
                     } else if (block instanceof TrapdoorBlock trapdoorBlock) {
                         blockStateModelGenerator.registerTrapdoor(trapdoorBlock);
                     } else if (block instanceof FenceBlock fenceBlock) {
//                        blockStateModelGenerator.registerF
                     } else if (block instanceof FenceGateBlock fenceGateBlock) {
//                        fenceGateBlocks.add(fenceGateBlock);
                     } else if (block instanceof PillarBlock pillarBlock) {
                         blockStateModelGenerator.registerAxisRotated(pillarBlock, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
                         //need to do some specifics for stuff like cut stone, so move all this into StoneMaterials maybe?
//                        TextureMap textureMap = TextureMap.all(pillarBlock);
//                        textureMap.put(TextureKey.SIDE, TextureMap.getId(net.minecraft.block.Blocks.CUT_SANDSTONE));
//                        textureMap.put(TextureKey.TOP, TextureMap.getId(net.minecraft.block.Blocks.QUARTZ_BLOCK));
//
//                        Identifier identifier = Models.CUBE_BOTTOM_TOP.upload(pillarBlock, textureMap, blockStateModelGenerator.modelCollector);
//                        BlockStateSupplier blockStateSupplier = BlockStateModelGenerator.createSingletonBlockState(pillarBlock, identifier);
//                        blockStateModelGenerator.blockStateCollector.accept(blockStateSupplier);
                     } else {
                         blockStateModelGenerator.registerSimpleCubeAll(bi.getRight().getLeft());
                     }
                 });
             });
        }

         @Override
         public void generateItemModels(ItemModelGenerator itemModelGenerator) {}
     }

     public static class PeritBlockTagProvider extends FabricTagProvider.BlockTagProvider {
         private PeritBlockTagProvider(FabricDataGenerator dataGenerator) {
             super(dataGenerator);
         }
         public FabricTagBuilder<Block> getOrCreateTagBuilder(TagKey<Block> tag) {
             return super.getOrCreateTagBuilder(tag);
         }
         @Override
         protected void generateTags() {
             Materials.materials.forEach((material -> {
                 material.generateTags(this);
             }));
         }
     }

     public static class PeritItemTagProvider extends FabricTagProvider.ItemTagProvider {
         private PeritItemTagProvider(FabricDataGenerator dataGenerator, BlockTagProvider blockTagProvider) {
             super(dataGenerator, blockTagProvider);
         }

         public FabricTagBuilder<Item> getOrCreateTagBuilder(TagKey<Item> tag) {
             return super.getOrCreateTagBuilder(tag);
         }

         @Override
         protected void generateTags() {
             Materials.materials.forEach((material -> {
                 material.generateTags(this);
             }));
         }
     }

     // loot tables
//     private static class PeritBlockLootTableProvider extends FabricBlockLootTableProvider {
//         private PeritBlockLootTableProvider(FabricDataGenerator dataGenerator) {
//             super(dataGenerator);
//         }
//
//         @Override
//         protected void generateBlockLootTables() {
//             Materials.materials.forEach(material -> {
//                 material.blocks.forEach((kind, blockItemPair) -> {
//                     addDrop(blockItemPair.getLeft());
//                 });
//             });
//         }
//     }
 }
