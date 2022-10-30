package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.liabri.perit.blocks.Blocks;
import org.liabri.perit.blocks.SlabBlock;
import org.liabri.perit.blocks.StairsBlock;
import org.liabri.perit.blocks.WallBlock;

public class GenericMaterial extends Material {
    public enum Kinds implements Material.Kinds {
        Stairs,
        Slabs,
        Walls,

    }

    // MOVE "TEXTURE" INTO WALLS

    public GenericMaterial(String name, Block block, ItemGroup itemGroup, boolean whitelist, GenericMaterial.Kinds[] list) {
        super(name, block, itemGroup, whitelist, list);
    }

    public GenericMaterial(String name, String textureName, Block block, ItemGroup itemGroup, boolean whitelist, GenericMaterial.Kinds[] list) {
        super(name, textureName, block, itemGroup, whitelist, list);
    }

    @Override
    public void register() {
        if (this.LIST.contains(Kinds.Stairs) == this.WHITELIST) {
            Blocks.register(this.NAME + "_stairs", new StairsBlock(this.BASE.getDefaultState(), FabricBlockSettings.copy(this.BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Slabs) == this.WHITELIST) {
            Blocks.register(this.NAME + "_slab", new SlabBlock(this.BASE.getDefaultState(), FabricBlockSettings.copy(this.BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(Kinds.Walls) == this.WHITELIST) {
            Blocks.register(this.NAME + "_wall", new WallBlock(this.BASE.getDefaultState(), this.TEXTURE_NAME, FabricBlockSettings.copy(this.BASE)), ITEM_GROUP);
        }
    }
}
