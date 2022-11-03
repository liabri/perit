package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemGroup;
import org.liabri.perit.blocks.SlabBlock;
import org.liabri.perit.blocks.StairsBlock;
import org.liabri.perit.blocks.WallBlock;

import java.util.function.Consumer;

public class GenericMaterial extends Material {
    public enum Kind implements Material.Kind {
        Stairs,
        Slab,
        Walls,

    }

    // MOVE "TEXTURE" INTO WALLS

    public GenericMaterial(String name, Block block, ItemGroup itemGroup, GenericMaterial.Kind[] list) {
        super(name, block, itemGroup, list);
    }

    public GenericMaterial(String name, String textureName, Block block, ItemGroup itemGroup, GenericMaterial.Kind[] list) {
        super(name, textureName, block, itemGroup, list);
    }

    @Override
    public void init() {
        if (this.LIST.contains(Kind.Stairs)) {
            register(Kind.Stairs,this.COMPOSE_NAME + "_stairs", new StairsBlock(this.BASE.getDefaultState(), FabricBlockSettings.copy(this.BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Slab)) {
            register(Kind.Slab,this.COMPOSE_NAME + "_slab", new SlabBlock(this.BASE.getDefaultState(), FabricBlockSettings.copy(this.BASE)), ITEM_GROUP);
        }

        if (this.LIST.contains(Kind.Walls)) {
            register(Kind.Walls, this.COMPOSE_NAME + "_wall", new WallBlock(this.BASE.getDefaultState(), this.TEXTURE_NAME, FabricBlockSettings.copy(this.BASE)), ITEM_GROUP);
        }
    }

    @Override
    public void generate_recipes(Consumer<RecipeJsonProvider> exporter) {

    }
}
