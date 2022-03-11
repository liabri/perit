package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;

import java.util.ArrayList;

public class Materials {

    public static void init() {}

    public static final ColouredMaterial[] colouredMaterials = new ColouredMaterial[2];

    static {
        colouredMaterials[0] = new ColouredMaterial("terracotta_bricks", FabricBlockSettings.copy(Blocks.TERRACOTTA), true);
        colouredMaterials[1] = new ColouredMaterial("terracotta_shingles", FabricBlockSettings.copy(Blocks.TERRACOTTA), true);
    }
}
