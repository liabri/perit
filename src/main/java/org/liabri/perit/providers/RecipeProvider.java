package org.liabri.perit.providers;

import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.TagKey;

import java.util.function.Consumer;

import static net.minecraft.data.server.RecipeProvider.conditionsFromTag;

public class RecipeProvider {
    public static void template(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, TagKey<Item> input) {
        ShapelessRecipeJsonBuilder.create(output, 4).input(input).group("planks").criterion("has_log", conditionsFromTag(input)).offerTo(exporter);
    }
}
