package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;

public class Materials {

    public static void init() {}

    public static final ColouredMaterial[] colouredMaterials = new ColouredMaterial[2];
    public static final StoneMaterial[] stoneMaterials = new StoneMaterial[1];


    static {
        colouredMaterials[0] = new ColouredMaterial("terracotta_bricks", "terracotta_brick", FabricBlockSettings.copy(Blocks.TERRACOTTA), true);
        colouredMaterials[1] = new ColouredMaterial("terracotta_shingles", "terracotta_shingle", FabricBlockSettings.copy(Blocks.TERRACOTTA), true);
//        colouredMaterials[2] = new ColouredMaterial("terracotta", Blocks.TERRACOTTA, true);


        stoneMaterials[0] = new StoneMaterial("andesite", FabricBlockSettings.copyOf(Blocks.ANDESITE), ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kinds[]{
                StoneMaterial.Kinds.Base,
                StoneMaterial.Kinds.Smooth,
        });
    }
}
