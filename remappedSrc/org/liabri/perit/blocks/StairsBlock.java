package org.liabri.perit.blocks;

import net.minecraft.block.BlockState;

public class StairsBlock extends net.minecraft.block.StairsBlock {
    private BlockState baseBlockState;

    public StairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
        this.baseBlockState = baseBlockState;
    }

    public BlockState getBaseBlockState() {
        return this.baseBlockState;
    }
}
