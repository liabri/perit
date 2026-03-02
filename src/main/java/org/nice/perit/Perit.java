package org.nice.perit;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Perit implements ModInitializer {

    public static final String MOD_ID = "perit";

    @Override
    public void onInitialize() {
        Blocks.initialize();
    }


}
