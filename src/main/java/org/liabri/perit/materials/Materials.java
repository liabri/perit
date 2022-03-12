package org.liabri.perit.materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;

public class Materials {

    public static void init() {}

    public static final String[] COLOURS = {
            "black",
            "blue",
            "brown",
            "cyan",
            "green",
            "grey",
            "light_blue",
            "light_grey",
            "lime",
            "magenta",
            "orange",
            "pink",
            "purple",
            "red",
            "white",
            "yellow"
    };

    public static final StoneMaterial[] stoneMaterials = new StoneMaterial[1];

    static {
        for (String colour: COLOURS) {
            stoneMaterials[0] = new StoneMaterial(colour, "terracotta", FabricBlockSettings.copyOf(Blocks.TERRACOTTA), ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kinds[]{
                    StoneMaterial.Kinds.Base,
                    StoneMaterial.Kinds.Smooth,
                    StoneMaterial.Kinds.Cut,
                    StoneMaterial.Kinds.CrackedCut,
                    StoneMaterial.Kinds.Polished,
                    StoneMaterial.Kinds.CrackedPolished,
                    StoneMaterial.Kinds.Cobbled,
                    StoneMaterial.Kinds.MossyCobbled
            });
        }
//        colouredMaterials[0] = new ColouredMaterial("terracotta_bricks", "terracotta_brick", FabricBlockSettings.copy(Blocks.TERRACOTTA), true);
//        colouredMaterials[1] = new ColouredMaterial("terracotta_shingles", "terracotta_shingle", FabricBlockSettings.copy(Blocks.TERRACOTTA), true);
//        colouredMaterials[2] = new ColouredMaterial("packed_terracotta", "packed_terracotta", FabricBlockSettings.copy(Blocks.TERRACOTTA), false);


//        stoneMaterials[0] = new StoneMaterial("andesite", FabricBlockSettings.copyOf(Blocks.ANDESITE), ItemGroup.BUILDING_BLOCKS, new StoneMaterial.Kinds[]{
//                StoneMaterial.Kinds.Base,
//                StoneMaterial.Kinds.Polished,
//        });
    }
}
