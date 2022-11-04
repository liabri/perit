package org.liabri.perit.materials;

import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.liabri.perit.PeritDataGenerator;
import org.liabri.perit.blocks.Blocks;

import java.util.*;
import java.util.function.Consumer;

public abstract class Material {
    final String BASE_NAME;
    final String COMPOSE_NAME;
    final String TEXTURE_NAME;

    final List<Kind> LIST;
    Block BASE;
    final ItemGroup ITEM_GROUP;

    public ArrayList<Pair<Kind, Pair<Block, Item>>> blocks = new ArrayList<>();

    public Pair<Block, Item> register(Kind kind, String path, Block block, ItemGroup itemGroup) {
        Pair<Block, Item> bi = Blocks.register(path, block, itemGroup);
        this.blocks.add(new Pair<>(kind, bi));
        return bi;
    }

    public abstract void init();
    public abstract void generate_recipes(Consumer<RecipeJsonProvider> exporter);
    public abstract void generateTags(PeritDataGenerator.PeritBlockTagProvider peritBlockTagProvider);
    public abstract void generateTags(PeritDataGenerator.PeritItemTagProvider peritBlockTagProvider);

    public interface Kind {}


    public Material(String base_name, Block block, ItemGroup ITEM_GROUP, Kind[] list) {
        this.BASE_NAME = base_name;
        this.COMPOSE_NAME = base_name;
        this.TEXTURE_NAME = null;
        this.LIST = Arrays.asList(list);
        this.BASE = block;
        this.ITEM_GROUP = ITEM_GROUP;

        init();
    }

    public Material(String base_name, String compose_name, Block block, ItemGroup ITEM_GROUP, Kind[] list) {
        this.BASE_NAME = base_name;
        this.COMPOSE_NAME = compose_name;
        this.TEXTURE_NAME = null;
        this.LIST = Arrays.asList(list);
        this.BASE = block;
        this.ITEM_GROUP = ITEM_GROUP;

        init();
    }

    public Material(String name, Block block, ItemGroup ITEM_GROUP, String textureName, Kind[] list) {
        this.BASE_NAME = name;
        this.COMPOSE_NAME = name;
        this.TEXTURE_NAME = textureName;
        this.LIST = Arrays.asList(list);
        this.BASE = block;
        this.ITEM_GROUP = ITEM_GROUP;

        init();
    }

}
