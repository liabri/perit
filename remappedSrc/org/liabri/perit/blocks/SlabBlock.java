package org.liabri.perit.blocks;

import net.minecraft.block.BlockState;

public class SlabBlock extends net.minecraft.block.SlabBlock {
    private BlockState baseBlockState;

    public SlabBlock(BlockState baseBlockState, Settings settings) {
        super(settings);
        this.baseBlockState = baseBlockState;
    }

    public BlockState getBaseBlockState() {
        return this.baseBlockState;
    }
}
