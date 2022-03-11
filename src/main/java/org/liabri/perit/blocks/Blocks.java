package org.liabri.perit.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.registry.Registry;
import org.liabri.perit.Perit;
import org.liabri.perit.items.Items;

public class Blocks {
    public static void init() {}

    public static Block register(String path, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Perit.MOD_ID, path), block);
    }

    public static Pair<Block, Item> register(String path, Block block, Item item) {
        return new Pair<>(Registry.register(Registry.BLOCK, new Identifier(Perit.MOD_ID, path), block), Items.registerBlockItem(block, item));
    }

    public static Pair<Block, Item> register(String path, Block block, ItemGroup itemGroup) {
        return new Pair<>(Registry.register(Registry.BLOCK, new Identifier(Perit.MOD_ID, path), block), Items.registerBlockItem(block, itemGroup));
    }

    public static final Pair<Block, Item> STONE = (Pair<Block, Item>) register("stone", new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.STONE)), ItemGroup.BUILDING_BLOCKS);
}
