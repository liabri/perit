package org.liabri.perit.items;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.liabri.perit.Perit;

public class Items {
    public static void init() {}

    public static Item register(String path, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Perit.MOD_ID, path), item);
    }

    public static BlockItem registerBlockItem(Block block, ItemGroup itemGroup) {
        BlockItem item = new BlockItem(block, new Item.Settings().group(itemGroup));
        item.appendBlocks(Item.BLOCK_ITEMS, item);
        return Registry.register(Registry.ITEM, Perit.id(Registry.BLOCK.getId(block).getPath()), item);
    }

    public static Item registerBlockItem(Block block, Item item) {
        return Registry.register(Registry.ITEM, Perit.id(Registry.BLOCK.getId(block).getPath()), item);
    }
}
