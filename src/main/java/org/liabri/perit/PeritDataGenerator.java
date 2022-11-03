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
 import net.minecraft.block.DoorBlock;
 import net.minecraft.block.FenceBlock;
 import net.minecraft.block.FenceGateBlock;
 import net.minecraft.block.TrapdoorBlock;
 import net.minecraft.data.client.*;
 import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
 import net.minecraft.data.server.recipe.RecipeJsonProvider;
 import net.minecraft.item.ItemConvertible;
 import net.minecraft.item.Items;
 import net.minecraft.recipe.Ingredient;
 import net.minecraft.tag.BlockTags;
 import net.minecraft.util.Identifier;
 import net.minecraft.util.registry.BuiltinRegistries;
 import net.minecraft.util.registry.Registry;
 import org.liabri.perit.blocks.*;
 import org.liabri.perit.blocks.Blocks;
 import org.liabri.perit.blocks.LadderBlock;
 import org.liabri.perit.blocks.SlabBlock;
 import org.liabri.perit.blocks.StairsBlock;
 import org.liabri.perit.blocks.WallBlock;
 import org.liabri.perit.blocks.WoodenButtonBlock;
 import org.liabri.perit.materials.Material;
 import org.liabri.perit.materials.Materials;
 import org.liabri.perit.materials.StoneMaterial;
 import org.liabri.perit.materials.WoodMaterial;

 import java.util.function.Consumer;

 public class PeritDataGenerator implements DataGeneratorEntrypoint {
     private static final ConditionJsonProvider NEVER_LOADED = DefaultResourceConditions.allModsLoaded("a");
     private static final ConditionJsonProvider ALWAYS_LOADED = DefaultResourceConditions.not(NEVER_LOADED);

     @Override
     public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
//         PeritBlockTagProvider blockTagProvider = dataGenerator.addProvider(PeritBlockTagProvider::new);
//         dataGenerator.addProvider(new PeritBlockTagProvider.PeritItemTagProvider(dataGenerator, blockTagProvider));
         dataGenerator.addProvider(PeritRecipeProvider::new);
//         dataGenerator.addProvider(PeritModelProvider::new);
//         dataGenerator.addProvider(PeritBlockLootTableProvider::new);


//        try {
//            new FabricTagProvider.DynamicRegistryTagProvider<>(dataGenerator, Registry.ITEM_KEY) {
//                @Override
//                protected void generateTags() {
//                }
//            };
//            throw new AssertionError("Using DynamicRegistryTagProvider with static registry didn't throw an exception!");
//        } catch (IllegalArgumentException e) {
//            // no-op
//        }
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
                 Material.blocks.forEach((kind, bi) -> {
                     blockStateModelGenerator.registerSimpleCubeAll(bi.getLeft());
                 });
             });
         //            Blocks.blocks.forEach((block) ->  {
//                if (block instanceof SlabBlock slabBlock) {
//                    TextureMap textureMap = TextureMap.all(slabBlock.getBaseBlockState().getBlock());
//                    Identifier identifier = Models.SLAB.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
//                    Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap, blockStateModelGenerator.modelCollector);
//                    Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_double", textureMap, blockStateModelGenerator.modelCollector);
//                    BlockStateSupplier slab = BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, identifier3);
//                    blockStateModelGenerator.blockStateCollector.accept(slab);
//                } else if (block instanceof StairsBlock stairsBlock) {
//                    TextureMap textureMap = TextureMap.all(stairsBlock.getBaseBlockState().getBlock());
//                    Identifier identifier = Models.STAIRS.upload(stairsBlock, textureMap, blockStateModelGenerator.modelCollector);
//                    Identifier identifier_inner = Models.INNER_STAIRS.upload(stairsBlock, "_inner", textureMap, blockStateModelGenerator.modelCollector);
//                    Identifier identifier_outer = Models.OUTER_STAIRS.upload(stairsBlock, "_outer", textureMap, blockStateModelGenerator.modelCollector);
//                    BlockStateSupplier stairs = BlockStateModelGenerator.createStairsBlockState(stairsBlock, identifier_inner, identifier, identifier_outer);
//                    blockStateModelGenerator.blockStateCollector.accept(stairs);
//                } else if (block instanceof WallBlock wallBlock) {
//                    if (wallBlock.getTextureName()!=null) {
//                        TextureMap textureMap = TextureMap.all(wallBlock.getBaseBlockState().getBlock());
//                        Identifier identifier = Models.TEMPLATE_WALL_POST.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
//                        Identifier identifier2 = Models.TEMPLATE_WALL_SIDE.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
//                        Identifier identifier3 = Models.TEMPLATE_WALL_SIDE_TALL.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
//                        BlockStateSupplier wall = BlockStateModelGenerator.createWallBlockState(wallBlock, identifier, identifier2, identifier3);
//                        blockStateModelGenerator.blockStateCollector.accept(wall);
//                        Identifier identifier4 = Models.WALL_INVENTORY.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
//                        blockStateModelGenerator.registerParentedItemModel(wallBlock, identifier4);
//                    } else {
//                        TextureMap textureMap = TextureMap.all(wallBlock.getBaseBlockState().getBlock());
//                        Identifier identifier = Models.TEMPLATE_WALL_POST.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
//                        Identifier identifier2 = Models.TEMPLATE_WALL_SIDE.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
//                        Identifier identifier3 = Models.TEMPLATE_WALL_SIDE_TALL.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
//                        BlockStateSupplier wall = BlockStateModelGenerator.createWallBlockState(wallBlock, identifier, identifier2, identifier3);
//                        blockStateModelGenerator.blockStateCollector.accept(wall);
//                        Identifier identifier4 = Models.WALL_INVENTORY.upload(wallBlock, textureMap, blockStateModelGenerator.modelCollector);
//                        blockStateModelGenerator.registerParentedItemModel(wallBlock, identifier4);
//                    }
//                } else if (block instanceof DoorBlock doorBlock) {
//                    blockStateModelGenerator.registerDoor(doorBlock);
//                } else if (block instanceof TrapdoorBlock trapdoorBlock) {
//                    blockStateModelGenerator.registerTrapdoor(trapdoorBlock);
//                } else if (block instanceof FenceBlock fenceBlock) {
////                    blockStateModelGenerator.registerF
//                } else if (block instanceof FenceGateBlock fenceGateBlock) {
////                    fenceGateBlocks.add(fenceGateBlock);
////                } else if (block instanceof  WallBlock wallBlock) {
////                  blockStateModelGenerator.register
//                } else if (block instanceof PillarBlock pillarBlock) {
//                    blockStateModelGenerator.registerAxisRotated(pillarBlock, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
//
////                    TextureMap textureMap = TextureMap.all(pillarBlock);
////                    textureMap.put(TextureKey.SIDE, TextureMap.getId(net.minecraft.block.Blocks.CUT_SANDSTONE));
////                    textureMap.put(TextureKey.TOP, TextureMap.getId(net.minecraft.block.Blocks.QUARTZ_BLOCK));
////
////                    Identifier identifier = Models.CUBE_BOTTOM_TOP.upload(pillarBlock, textureMap, blockStateModelGenerator.modelCollector);
////                    BlockStateSupplier blockStateSupplier = BlockStateModelGenerator.createSingletonBlockState(pillarBlock, identifier);
////                    blockStateModelGenerator.blockStateCollector.accept(blockStateSupplier);
//                } else {
//                }
//            });
        }

         @Override
         public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//            itemModelGenerator.register(item, Models.SLAB);
         }
     }

     //     block tags
     private static class PeritBlockTagProvider extends FabricTagProvider.BlockTagProvider {
         private PeritBlockTagProvider(FabricDataGenerator dataGenerator) {
             super(dataGenerator);
         }

         @Override
         protected void generateTags() {
//            Blocks.blocks.forEach((block) -> {
//                if (block instanceof WallBlock wallBlock) {
//                    getOrCreateTagBuilder(BlockTags.WALLS).add(wallBlock);
//                } else if (block instanceof LadderBlock ladderBlock) {
//                    getOrCreateTagBuilder(BlockTags.CLIMBABLE).add(ladderBlock);
//                } else if (block instanceof WoodenButtonBlock woodenButtonBlock) {
//                    getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(woodenButtonBlock);
//                } else if (block instanceof DoorBlock doorBlock) {
//                    getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(doorBlock);
//                } else if (block instanceof TrapdoorBlock trapdoorBlock) {
//                    getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(trapdoorBlock);
//                } else if (block instanceof WoodenPressurePlateBlock woodenPressurePlateBlock) {
//                    getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(woodenPressurePlateBlock);
//                } else if (block instanceof FenceBlock fenceBlock) {
//                    getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(fenceBlock);
//                } else if (block instanceof FenceGateBlock fenceGateBlock) {
//                    getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(fenceGateBlock);
//                } else if (block instanceof WoodenSlabBlock woodenSlabBlock) {
//                    getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(woodenSlabBlock);
//                } else if (block instanceof WoodenStairsBlock woodenStairsBlock) {
//                    getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(woodenStairsBlock);
//                } else if (block instanceof StairsBlock stairsBlock) {
//                    getOrCreateTagBuilder(BlockTags.STAIRS).add(stairsBlock);
//                } else if (block instanceof StairsBlock slabBlock) {
//                    getOrCreateTagBuilder(BlockTags.SLABS).add(slabBlock);
//                }
//            });
//        }
         }

         // item tags
         private static class PeritItemTagProvider extends FabricTagProvider.ItemTagProvider {
             private PeritItemTagProvider(FabricDataGenerator dataGenerator, BlockTagProvider blockTagProvider) {
                 super(dataGenerator, blockTagProvider);
             }

             @Override
             protected void generateTags() {
//            copy(BlockTags.ANVIL, ItemTags.ANVIL);
             }
         }
     }

     // loot tables
     private static class PeritBlockLootTableProvider extends FabricBlockLootTableProvider {
         private PeritBlockLootTableProvider(FabricDataGenerator dataGenerator) {
             super(dataGenerator);
         }

         @Override
         protected void generateBlockLootTables() {
             Materials.materials.forEach(material -> {
                 Material.blocks.forEach((kind, blockItemPair) -> {
                     this.addDrop(blockItemPair.getLeft());
                 });
             });
         }
     }
 }
