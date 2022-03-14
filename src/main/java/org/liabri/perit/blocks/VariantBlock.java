package org.liabri.perit.blocks;

import net.minecraft.block.BlockState;

public class VariantBlock extends net.minecraft.block.Block {
    private BlockState baseBlockState;

    public VariantBlock(BlockState baseBlockState, Settings settings) {
        super(settings);
        this.baseBlockState = baseBlockState;
    }

    public BlockState getBaseBlockState() {
        return this.baseBlockState;
    }
}
