package org.liabri.perit.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import org.liabri.perit.materials.Material;

import java.util.Arrays;
import java.util.List;

public abstract class PeritBlock {
    final Block BLOCK;
    final Material MATERIAL;

    public abstract void register();

    public PeritBlock(Block block, Material material) {
        this.BLOCK = block;
        this.MATERIAL = material;

        register();
    }
}
